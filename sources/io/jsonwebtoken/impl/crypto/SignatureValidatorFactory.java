package io.jsonwebtoken.impl.crypto;

import io.jsonwebtoken.SignatureAlgorithm;
import java.security.Key;

/* JADX INFO: loaded from: classes3.dex */
public interface SignatureValidatorFactory {
    SignatureValidator createSignatureValidator(SignatureAlgorithm signatureAlgorithm, Key key);
}
