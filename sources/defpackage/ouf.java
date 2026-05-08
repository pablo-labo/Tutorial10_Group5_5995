package defpackage;

import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;

/* JADX INFO: loaded from: classes3.dex */
public final class ouf implements nn6, Serializable {
    public static final String a = Boolean.TRUE.toString();
    public static final ouf b = new ouf();
    private static final long serialVersionUID = 8782512160909720199L;

    @Override // defpackage.nn6
    public final FileVisitResult a(Path path) {
        return FileVisitResult.CONTINUE;
    }

    @Override // defpackage.nn6, java.io.FileFilter
    public final boolean accept(File file) {
        return true;
    }

    public final String toString() {
        return a;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return true;
    }
}
