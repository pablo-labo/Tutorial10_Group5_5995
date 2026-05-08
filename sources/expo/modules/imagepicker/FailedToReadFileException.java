package expo.modules.imagepicker;

import android.net.Uri;
import defpackage.p6;
import expo.modules.kotlin.exception.CodedException;
import java.io.File;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lexpo/modules/imagepicker/FailedToReadFileException;", "Lexpo/modules/kotlin/exception/CodedException;", "expo-image-picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FailedToReadFileException extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FailedToReadFileException(File file, ExecutionException executionException) {
        super(p6.d(Uri.fromFile(file), "Failed to read a file '"), executionException);
        file.getClass();
    }
}
