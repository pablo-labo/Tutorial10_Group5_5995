package defpackage;

import defpackage.w5b;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* JADX INFO: loaded from: classes3.dex */
public final class zha extends qd8 {
    public static Long n(FileTime fileTime) {
        long millis = fileTime.toMillis();
        Long lValueOf = Long.valueOf(millis);
        if (millis != 0) {
            return lValueOf;
        }
        return null;
    }

    @Override // defpackage.qd8, defpackage.pa5
    public final void b(w5b w5bVar, w5b w5bVar2) throws IOException {
        w5bVar.getClass();
        w5bVar2.getClass();
        try {
            Path path = Paths.get(w5bVar.a.A(), new String[0]);
            path.getClass();
            Path path2 = Paths.get(w5bVar2.a.A(), new String[0]);
            path2.getClass();
            Files.move(path, path2, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            r40.h("atomic move not supported");
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }

    @Override // defpackage.qd8, defpackage.pa5
    public final da5 j(w5b w5bVar) {
        w5b w5bVarA;
        w5bVar.getClass();
        Path path = Paths.get(w5bVar.a.A(), new String[0]);
        path.getClass();
        try {
            BasicFileAttributes attributes = Files.readAttributes(path, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path symbolicLink = attributes.isSymbolicLink() ? Files.readSymbolicLink(path) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            if (symbolicLink != null) {
                String str = w5b.b;
                w5bVarA = w5b.a.a(symbolicLink.toString());
            } else {
                w5bVarA = null;
            }
            Long lValueOf = Long.valueOf(attributes.size());
            FileTime fileTimeCreationTime = attributes.creationTime();
            Long lN = fileTimeCreationTime != null ? n(fileTimeCreationTime) : null;
            FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            Long lN2 = fileTimeLastModifiedTime != null ? n(fileTimeLastModifiedTime) : null;
            FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            return new da5(zIsRegularFile, zIsDirectory, w5bVarA, lValueOf, lN, lN2, fileTimeLastAccessTime != null ? n(fileTimeLastAccessTime) : null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // defpackage.qd8
    public final String toString() {
        return "NioSystemFileSystem";
    }
}
