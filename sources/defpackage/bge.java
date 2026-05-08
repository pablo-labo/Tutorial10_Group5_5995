package defpackage;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bge extends SimpleFileVisitor<Path> implements FileVisitor {
    public final yy1 a = new yy1(this, 6);

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public final FileVisitResult visitFileFailed(Object obj, IOException iOException) {
        return super.visitFileFailed((Path) obj, iOException);
    }
}
