package io.jsonwebtoken.impl.crypto;

import defpackage.bg;
import defpackage.z3;
import io.jsonwebtoken.SignatureAlgorithm;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.RSAKey;

/* JADX INFO: loaded from: classes3.dex */
public class RsaSigner extends RsaProvider implements Signer {
    public RsaSigner(SignatureAlgorithm signatureAlgorithm, Key key) {
        super(signatureAlgorithm, key);
        if ((key instanceof PrivateKey) && (key instanceof RSAKey)) {
            return;
        }
        bg.l("RSA signatures must be computed using an RSA PrivateKey.  The specified key of type ", key.getClass().getName(), " is not an RSA PrivateKey.");
        throw null;
    }

    public byte[] doSign(byte[] bArr) throws SignatureException, InvalidKeyException {
        PrivateKey privateKey = (PrivateKey) this.key;
        Signature signatureCreateSignatureInstance = createSignatureInstance();
        signatureCreateSignatureInstance.initSign(privateKey);
        signatureCreateSignatureInstance.update(bArr);
        return signatureCreateSignatureInstance.sign();
    }

    @Override // io.jsonwebtoken.impl.crypto.Signer
    public byte[] sign(byte[] bArr) {
        try {
            return doSign(bArr);
        } catch (InvalidKeyException e) {
            z3.r(e, e.getMessage(), "Invalid RSA PrivateKey. ");
            return null;
        } catch (SignatureException e2) {
            z3.r(e2, e2.getMessage(), "Unable to calculate signature using RSA PrivateKey. ");
            return null;
        }
    }
}
