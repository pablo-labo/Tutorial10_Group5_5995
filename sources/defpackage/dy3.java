package defpackage;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes3.dex */
public final class dy3 extends bge {
    public final p13 b;
    public final ouf c;
    public final String[] d;
    public final boolean e;
    public final LinkOption[] f;

    public dy3(p13 p13Var, LinkOption[] linkOptionArr, lx3[] lx3VarArr, String... strArr) {
        new y1f(FileVisitResult.TERMINATE, FileVisitResult.CONTINUE);
        ouf oufVar = ouf.b;
        this.b = p13Var;
        this.c = oufVar;
        String[] strArr2 = (String[]) strArr.clone();
        Arrays.sort(strArr2);
        this.d = strArr2;
        ThreadLocal<char[]> threadLocal = sn6.a;
        this.e = lx3VarArr.length == 0 ? false : Stream.of((Object[]) lx3VarArr).anyMatch(new zqe());
        this.f = linkOptionArr == null ? (LinkOption[]) o6b.c.clone() : (LinkOption[]) linkOptionArr.clone();
    }

    public final boolean a(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dy3) {
            return Objects.equals(this.b, ((dy3) obj).b);
        }
        return false;
    }

    public final int b() {
        return Objects.hash(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a(obj) || dy3.class != obj.getClass()) {
            return false;
        }
        dy3 dy3Var = (dy3) obj;
        return this.e == dy3Var.e && Arrays.equals(this.d, dy3Var.d);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.e)) + (((b() * 31) + Arrays.hashCode(this.d)) * 31);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public final FileVisitResult postVisitDirectory(Object obj, IOException iOException) throws IOException {
        Path path = (Path) obj;
        lx3[] lx3VarArr = o6b.a;
        DirectoryStream<Path> directoryStreamNewDirectoryStream = Files.newDirectoryStream(path);
        try {
            boolean zHasNext = directoryStreamNewDirectoryStream.iterator().hasNext();
            directoryStreamNewDirectoryStream.close();
            if (!zHasNext) {
                Files.deleteIfExists(path);
            }
            this.b.b.b();
            FileVisitResult fileVisitResult = FileVisitResult.CONTINUE;
            FileVisitResult fileVisitResult2 = FileVisitResult.CONTINUE;
            return FileVisitResult.CONTINUE;
        } catch (Throwable th) {
            if (directoryStreamNewDirectoryStream != null) {
                try {
                    directoryStreamNewDirectoryStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public final FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes basicFileAttributes) {
        Path path = (Path) obj;
        this.c.getClass();
        FileVisitResult fileVisitResult = FileVisitResult.CONTINUE;
        lx3[] lx3VarArr = o6b.a;
        Path fileName = path != null ? path.getFileName() : null;
        return Arrays.binarySearch(this.d, fileName != null ? fileName.toString() : null) < 0 ? FileVisitResult.CONTINUE : FileVisitResult.SKIP_SUBTREE;
    }

    public final String toString() {
        return this.b.toString();
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public final FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) throws IOException {
        Path path = (Path) obj;
        lx3[] lx3VarArr = o6b.a;
        Path fileName = path != null ? path.getFileName() : null;
        if (Arrays.binarySearch(this.d, fileName != null ? fileName.toString() : null) < 0) {
            LinkOption[] linkOptionArr = this.f;
            if (Files.exists(path, linkOptionArr)) {
                if (this.e) {
                    o6b.c(path, linkOptionArr);
                }
                Files.deleteIfExists(path);
            }
            if (Files.isSymbolicLink(path)) {
                try {
                    Files.delete(path);
                } catch (NoSuchFileException unused) {
                }
            }
        }
        p13 p13Var = this.b;
        p13Var.c.b();
        p13Var.a.a(basicFileAttributes.size());
        FileVisitResult fileVisitResult = FileVisitResult.CONTINUE;
        return FileVisitResult.CONTINUE;
    }
}
