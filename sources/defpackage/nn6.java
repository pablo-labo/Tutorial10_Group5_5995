package defpackage;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.PathMatcher;

/* JADX INFO: loaded from: classes3.dex */
public interface nn6 extends FileFilter, FilenameFilter, PathMatcher {
    default FileVisitResult a(Path path) {
        return (path == null || !accept(path.toFile())) ? FileVisitResult.TERMINATE : FileVisitResult.CONTINUE;
    }

    @Override // java.io.FileFilter
    boolean accept(File file);

    @Override // java.nio.file.PathMatcher
    default boolean matches(Path path) {
        return a(path) != FileVisitResult.TERMINATE;
    }
}
