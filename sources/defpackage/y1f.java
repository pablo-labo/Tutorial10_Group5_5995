package defpackage;

import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;

/* JADX INFO: loaded from: classes3.dex */
public final class y1f extends d2 implements Serializable {
    private static final long serialVersionUID = 1;

    static {
        new y1f(FileVisitResult.CONTINUE, FileVisitResult.TERMINATE);
    }

    @Override // defpackage.nn6
    public final FileVisitResult a(Path path) {
        return b(Files.isSymbolicLink(path));
    }

    @Override // defpackage.nn6, java.io.FileFilter
    public final boolean accept(File file) {
        return Files.isSymbolicLink(file.toPath());
    }
}
