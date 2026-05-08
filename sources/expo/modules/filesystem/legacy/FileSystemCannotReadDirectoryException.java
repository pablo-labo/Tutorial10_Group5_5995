package expo.modules.filesystem.legacy;

import android.net.Uri;
import defpackage.z3;
import expo.modules.kotlin.exception.CodedException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lexpo/modules/filesystem/legacy/FileSystemCannotReadDirectoryException;", "Lexpo/modules/kotlin/exception/CodedException;", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FileSystemCannotReadDirectoryException extends CodedException {
    public FileSystemCannotReadDirectoryException(Uri uri) {
        super(z3.l("Uri '", "' doesn't exist or isn't a directory", uri), null);
    }
}
