package expo.modules.filesystem.legacy;

import android.net.Uri;
import expo.modules.kotlin.exception.CodedException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lexpo/modules/filesystem/legacy/FileSystemCannotMoveFileException;", "Lexpo/modules/kotlin/exception/CodedException;", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FileSystemCannotMoveFileException extends CodedException {
    public FileSystemCannotMoveFileException(Uri uri, Uri uri2) {
        super("File '" + uri + "' could not be moved to '" + uri2 + "'", null);
    }
}
