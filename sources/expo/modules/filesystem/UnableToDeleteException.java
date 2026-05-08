package expo.modules.filesystem;

import expo.modules.kotlin.exception.CodedException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lexpo/modules/filesystem/UnableToDeleteException;", "Lexpo/modules/kotlin/exception/CodedException;", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UnableToDeleteException extends CodedException {
    public UnableToDeleteException(String str) {
        super("Unable to delete file or directory: ".concat(str), null);
    }
}
