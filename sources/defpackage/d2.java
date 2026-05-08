package defpackage;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d2 implements nn6, FileVisitor {
    private final FileVisitResult onAccept;
    private final FileVisitResult onReject;

    public d2(FileVisitResult fileVisitResult, FileVisitResult fileVisitResult2) {
        this.onAccept = fileVisitResult;
        this.onReject = fileVisitResult2;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        Objects.requireNonNull(str, "name");
        return Files.isSymbolicLink(new File(file, str).toPath());
    }

    public final FileVisitResult b(boolean z) {
        return z ? this.onAccept : this.onReject;
    }

    @Override // java.nio.file.FileVisitor
    public final FileVisitResult postVisitDirectory(Object obj, IOException iOException) {
        return FileVisitResult.CONTINUE;
    }

    @Override // java.nio.file.FileVisitor
    public final FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes basicFileAttributes) {
        return ((y1f) this).a((Path) obj);
    }

    public final String toString() {
        return getClass().getSimpleName();
    }

    @Override // java.nio.file.FileVisitor
    public final FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) {
        return ((y1f) this).a((Path) obj);
    }

    @Override // java.nio.file.FileVisitor
    public final FileVisitResult visitFileFailed(Object obj, IOException iOException) {
        return FileVisitResult.CONTINUE;
    }
}
