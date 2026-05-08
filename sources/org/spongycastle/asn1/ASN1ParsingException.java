package org.spongycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class ASN1ParsingException extends IllegalStateException {
    private Throwable cause;

    public ASN1ParsingException(String str, IOException iOException) {
        super(str);
        this.cause = iOException;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
    }
}
