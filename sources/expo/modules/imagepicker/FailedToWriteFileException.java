package expo.modules.imagepicker;

import android.net.Uri;
import defpackage.l5;
import expo.modules.kotlin.exception.CodedException;
import java.io.File;
import java.io.FileNotFoundException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lexpo/modules/imagepicker/FailedToWriteFileException;", "Lexpo/modules/kotlin/exception/CodedException;", "expo-image-picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FailedToWriteFileException extends CodedException {
    public FailedToWriteFileException(File file, FileNotFoundException fileNotFoundException) {
        Uri uriFromFile;
        String string;
        super(l5.m("Failed to write a file '", (file == null || (uriFromFile = Uri.fromFile(file)) == null || (string = uriFromFile.toString()) == null) ? "" : string, "'"), fileNotFoundException);
    }
}
