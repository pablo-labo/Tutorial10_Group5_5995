package io.jsonwebtoken;

import io.jsonwebtoken.security.SecurityException;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class SignatureException extends SecurityException {
    public SignatureException(String str) {
        super(str);
    }

    public SignatureException(String str, Throwable th) {
        super(str, th);
    }
}
