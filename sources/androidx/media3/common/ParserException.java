package androidx.media3.common;

import defpackage.w20;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class ParserException extends IOException {
    public final boolean contentIsMalformed;
    public final int dataType;

    public ParserException(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.contentIsMalformed = z;
        this.dataType = i;
    }

    public static ParserException a(RuntimeException runtimeException, String str) {
        return new ParserException(str, runtimeException, true, 1);
    }

    public static ParserException b(Exception exc, String str) {
        return new ParserException(str, exc, true, 4);
    }

    public static ParserException c(String str) {
        return new ParserException(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        StringBuilder sb = new StringBuilder();
        sb.append(message != null ? message.concat(" ") : "");
        sb.append("{contentIsMalformed=");
        sb.append(this.contentIsMalformed);
        sb.append(", dataType=");
        return w20.k(sb, this.dataType, "}");
    }
}
