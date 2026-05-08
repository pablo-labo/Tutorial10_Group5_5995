package io.jsonwebtoken.impl.crypto;

import defpackage.bg;
import defpackage.z3;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.ECKey;

/* JADX INFO: loaded from: classes3.dex */
public class EllipticCurveSigner extends EllipticCurveProvider implements Signer {
    public EllipticCurveSigner(SignatureAlgorithm signatureAlgorithm, Key key) {
        super(signatureAlgorithm, key);
        if ((key instanceof PrivateKey) && (key instanceof ECKey)) {
            return;
        }
        bg.l("Elliptic Curve signatures must be computed using an EC PrivateKey.  The specified key of type ", key.getClass().getName(), " is not an EC PrivateKey.");
        throw null;
    }

    public byte[] doSign(byte[] bArr) throws SignatureException, InvalidKeyException {
        PrivateKey privateKey = (PrivateKey) this.key;
        Signature signatureCreateSignatureInstance = createSignatureInstance();
        signatureCreateSignatureInstance.initSign(privateKey);
        signatureCreateSignatureInstance.update(bArr);
        return EllipticCurveProvider.transcodeSignatureToConcat(signatureCreateSignatureInstance.sign(), EllipticCurveProvider.getSignatureByteArrayLength(this.alg));
    }

    @Override // io.jsonwebtoken.impl.crypto.Signer
    public byte[] sign(byte[] bArr) {
        try {
            return doSign(bArr);
        } catch (JwtException e) {
            z3.r(e, e.getMessage(), "Unable to convert signature to JOSE format. ");
            return null;
        } catch (InvalidKeyException e2) {
            z3.r(e2, e2.getMessage(), "Invalid Elliptic Curve PrivateKey. ");
            return null;
        } catch (SignatureException e3) {
            z3.r(e3, e3.getMessage(), "Unable to calculate signature using Elliptic Curve PrivateKey. ");
            return null;
        }
    }
}
