package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.ParserException;
import defpackage.e47;
import defpackage.qyc;
import defpackage.tme;

/* JADX INFO: loaded from: classes.dex */
public class UnrecognizedInputFormatException extends ParserException {
    public final e47<tme> sniffFailures;
    public final Uri uri;

    public UnrecognizedInputFormatException(String str, Uri uri, qyc qycVar) {
        super(str, null, false, 1);
        this.uri = uri;
        this.sniffFailures = e47.j(qycVar);
    }
}
