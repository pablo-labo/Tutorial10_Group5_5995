package io.jsonwebtoken.impl.crypto;

import io.jsonwebtoken.SignatureAlgorithm;
import java.security.Key;

/* JADX INFO: loaded from: classes3.dex */
public interface SignerFactory {
    Signer createSigner(SignatureAlgorithm signatureAlgorithm, Key key);
}
