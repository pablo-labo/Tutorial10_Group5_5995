package org.spongycastle.util.encoders;

/* JADX INFO: loaded from: classes3.dex */
public class EncoderException extends IllegalStateException {
    private Throwable cause;

    public EncoderException(Exception exc, String str) {
        super(str);
        this.cause = exc;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
    }
}
