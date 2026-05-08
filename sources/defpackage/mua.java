package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import defpackage.rt7;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwsHeader;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SigningKeyResolver;
import io.jsonwebtoken.security.SecurityException;
import java.math.BigInteger;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class mua implements SigningKeyResolver {
    public final ax8 a;

    public mua(ax8 ax8Var) {
        this.a = ax8Var;
    }

    public final ECPublicKey a(JwsHeader jwsHeader) {
        ww8 ww8VarA;
        rt7.b bVar;
        ax8 ax8Var = this.a;
        ww8<kua> ww8VarA2 = ax8Var.a();
        if (ww8VarA2.d()) {
            Uri uri = Uri.parse(ww8VarA2.c().d);
            l22 l22Var = ax8Var.b;
            Map<String, String> map = Collections.EMPTY_MAP;
            ww8VarA = l22Var.a(uri, map, map, ax8.h);
            if (!ww8VarA.d()) {
                Log.e("LineAuthApiClient", "getJWKSet failed: " + ww8VarA);
            }
        } else {
            ww8VarA = ww8.a(ww8VarA2.a, ww8VarA2.c);
        }
        if (!ww8VarA.d()) {
            Log.e("OpenIdSignKeyResolver", "failed to get LINE JSON Web Key Set [JWK] document.");
            return null;
        }
        rt7 rt7Var = (rt7) ww8VarA.c();
        String keyId = jwsHeader.getKeyId();
        Iterator it = rt7Var.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                bVar = null;
                break;
            }
            bVar = (rt7.b) it.next();
            if (TextUtils.equals(bVar.d, keyId)) {
                break;
            }
        }
        if (bVar == null) {
            Log.e("OpenIdSignKeyResolver", "failed to find Key by Id: " + keyId);
            return null;
        }
        String algorithm = jwsHeader.getAlgorithm();
        if (!SignatureAlgorithm.forName(algorithm).isEllipticCurve()) {
            throw new SecurityException(ja.f('\'', "Unsupported signature algorithm '", algorithm));
        }
        String str = bVar.f;
        String str2 = bVar.e;
        BigInteger bigInteger = new BigInteger(1, Base64.decode(str, 8));
        BigInteger bigInteger2 = new BigInteger(1, Base64.decode(bVar.g, 8));
        try {
            KeyFactory keyFactory = KeyFactory.getInstance("EC");
            ECPoint eCPoint = new ECPoint(bigInteger, bigInteger2);
            we4 we4VarM = ygg.m(str2);
            return (ECPublicKey) keyFactory.generatePublic(new ECPublicKeySpec(eCPoint, new xe4(we4VarM.a, we4VarM.b, we4VarM.c)));
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            Log.e("OpenIdSignKeyResolver", "failed to generate EC Public Key from JWK: " + bVar, e);
            return null;
        }
    }

    @Override // io.jsonwebtoken.SigningKeyResolver
    public final Key resolveSigningKey(JwsHeader jwsHeader, Claims claims) {
        return a(jwsHeader);
    }

    @Override // io.jsonwebtoken.SigningKeyResolver
    public final Key resolveSigningKey(JwsHeader jwsHeader, String str) {
        return a(jwsHeader);
    }
}
