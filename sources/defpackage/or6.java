package defpackage;

import com.linecorp.linesdk.LineIdToken;
import io.jsonwebtoken.Claims;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class or6 {
    public static LineIdToken a(String str, Claims claims) {
        LineIdToken.Address address;
        LineIdToken.b bVar = new LineIdToken.b();
        bVar.a = str;
        bVar.b = claims.getIssuer();
        bVar.c = claims.getSubject();
        bVar.d = claims.getAudience();
        bVar.e = claims.getExpiration();
        bVar.f = claims.getIssuedAt();
        bVar.g = (Date) claims.get("auth_time", Date.class);
        bVar.h = (String) claims.get("nonce", String.class);
        bVar.i = (List) claims.get("amr", List.class);
        bVar.j = (String) claims.get("name", String.class);
        bVar.k = (String) claims.get("picture", String.class);
        bVar.l = (String) claims.get("phone_number", String.class);
        bVar.m = (String) claims.get("email", String.class);
        bVar.n = (String) claims.get("gender", String.class);
        bVar.o = (String) claims.get("birthdate", String.class);
        Map map = (Map) claims.get("address", Map.class);
        if (map == null) {
            address = null;
        } else {
            LineIdToken.Address.b bVar2 = new LineIdToken.Address.b();
            bVar2.a = (String) map.get("street_address");
            bVar2.b = (String) map.get("locality");
            bVar2.c = (String) map.get("region");
            bVar2.d = (String) map.get("postal_code");
            bVar2.e = (String) map.get("country");
            address = new LineIdToken.Address(bVar2);
        }
        bVar.p = address;
        bVar.q = (String) claims.get("given_name", String.class);
        bVar.r = (String) claims.get("given_name_pronunciation", String.class);
        bVar.s = (String) claims.get("middle_name", String.class);
        bVar.t = (String) claims.get("family_name", String.class);
        bVar.u = (String) claims.get("family_name_pronunciation", String.class);
        return new LineIdToken(bVar);
    }
}
