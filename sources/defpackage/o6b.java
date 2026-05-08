package defpackage;

import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes3.dex */
public final class o6b {
    public static final lx3[] a;
    public static final LinkOption[] b;

    @Deprecated
    public static final LinkOption[] c;

    static {
        StandardOpenOption standardOpenOption = StandardOpenOption.CREATE;
        StandardOpenOption standardOpenOption2 = StandardOpenOption.TRUNCATE_EXISTING;
        StandardOpenOption standardOpenOption3 = StandardOpenOption.APPEND;
        a = new lx3[0];
        b = new LinkOption[0];
        c = new LinkOption[]{LinkOption.NOFOLLOW_LINKS};
    }

    public static p13 a(Path path, LinkOption[] linkOptionArr, lx3... lx3VarArr) throws Throwable {
        BasicFileAttributes attributes;
        PosixFileAttributes posixFileAttributes;
        if (Files.isDirectory(path, linkOptionArr)) {
            dy3 dy3Var = new dy3(new p13(new o13(), new o13(), new o13()), linkOptionArr, lx3VarArr, new String[0]);
            Files.walkFileTree(path, dy3Var);
            return dy3Var.b;
        }
        if (Files.isDirectory(path, linkOptionArr)) {
            throw new NoSuchFileException(path.toString());
        }
        o13 o13Var = new o13();
        o13 o13Var2 = new o13();
        o13 o13Var3 = new o13();
        p13 p13Var = new p13(o13Var, o13Var2, o13Var3);
        long size = 0;
        long size2 = (!b(path, linkOptionArr) || Files.isSymbolicLink(path)) ? 0L : Files.size(path);
        try {
            if (Files.deleteIfExists(path)) {
                o13Var3.b();
                o13Var.a(size2);
                return p13Var;
            }
        } catch (AccessDeniedException unused) {
        }
        Path parent = path.getParent();
        PosixFileAttributes posixFileAttributes2 = null;
        try {
            if (Stream.of((Object[]) lx3VarArr).anyMatch(new n6b())) {
                try {
                    if (parent != null) {
                        try {
                            attributes = Files.readAttributes(parent, (Class<BasicFileAttributes>) PosixFileAttributes.class, linkOptionArr);
                        } catch (IOException | UnsupportedOperationException unused2) {
                            attributes = null;
                        }
                        posixFileAttributes = (PosixFileAttributes) attributes;
                        c(path, linkOptionArr);
                        posixFileAttributes2 = posixFileAttributes;
                    }
                    c(path, linkOptionArr);
                    posixFileAttributes2 = posixFileAttributes;
                } catch (Throwable th) {
                    th = th;
                    posixFileAttributes2 = posixFileAttributes;
                    if (posixFileAttributes2 != null) {
                        Files.setPosixFilePermissions(parent, posixFileAttributes2.permissions());
                    }
                    throw th;
                }
                attributes = null;
                posixFileAttributes = (PosixFileAttributes) attributes;
            }
            if (b(path, linkOptionArr) && !Files.isSymbolicLink(path)) {
                size = Files.size(path);
            }
            if (Files.deleteIfExists(path)) {
                p13Var.c.b();
                p13Var.a.a(size);
            }
            if (posixFileAttributes2 != null) {
                Files.setPosixFilePermissions(parent, posixFileAttributes2.permissions());
            }
            return p13Var;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean b(Path path, LinkOption... linkOptionArr) {
        Objects.requireNonNull(path, "path");
        return linkOptionArr != null ? Files.exists(path, linkOptionArr) : Files.exists(path, new LinkOption[0]);
    }

    public static void c(Path path, LinkOption... linkOptionArr) throws IOException {
        try {
            DosFileAttributeView dosFileAttributeView = (DosFileAttributeView) Files.getFileAttributeView(path, DosFileAttributeView.class, linkOptionArr);
            if (dosFileAttributeView != null) {
                dosFileAttributeView.setReadOnly(false);
                return;
            }
        } catch (IOException unused) {
        }
        BasicFileAttributes attributes = null;
        Path parent = path == null ? null : path.getParent();
        if (b(parent, linkOptionArr)) {
            try {
                attributes = Files.readAttributes(parent, (Class<BasicFileAttributes>) PosixFileAttributes.class, linkOptionArr);
            } catch (IOException | UnsupportedOperationException unused2) {
            }
            if (((PosixFileAttributes) attributes) != null) {
                List listAsList = Arrays.asList(PosixFilePermission.OWNER_WRITE, PosixFilePermission.OWNER_EXECUTE);
                Set<PosixFilePermission> posixFilePermissions = Files.getPosixFilePermissions(parent, linkOptionArr);
                HashSet hashSet = new HashSet(posixFilePermissions);
                hashSet.addAll(listAsList);
                if (hashSet.equals(posixFilePermissions)) {
                    return;
                }
                Files.setPosixFilePermissions(parent, hashSet);
                return;
            }
        }
        throw new IOException(String.format("DOS or POSIX file operations not available for '%s' %s", path, Arrays.toString(linkOptionArr)));
    }
}
