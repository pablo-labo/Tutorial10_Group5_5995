package org.spongycastle.util.encoders;

/* JADX INFO: loaded from: classes3.dex */
public class DecoderException extends IllegalStateException {
    private Throwable cause;

    public DecoderException(Exception exc, String str) {
        super(str);
        this.cause = exc;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
    }
}
