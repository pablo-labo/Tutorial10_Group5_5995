package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.linecorp.linesdk.LineIdToken;
import io.jsonwebtoken.Jwts;
import java.util.Collections;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ax8 {
    public static final b f;
    public static final lua g;
    public static final st7 h;
    public final Uri a;
    public final l22 b;
    public final a c;
    public final mua d;
    public final Uri e;

    public class a extends r5i {
        public a() {
            super(1);
        }

        @Override // defpackage.r5i
        public final Object c(JSONObject jSONObject) throws JSONException {
            String string = jSONObject.getString("token_type");
            if (!"Bearer".equals(string)) {
                throw new JSONException(l5.l("Illegal token type. token_type=", string));
            }
            try {
                return new eo7(new qi7(1000 * jSONObject.getLong("expires_in"), System.currentTimeMillis(), jSONObject.getString("access_token"), jSONObject.getString("refresh_token")), tpd.c(jSONObject.getString("scope")), l(jSONObject.optString("id_token")));
            } catch (Exception e) {
                throw new JSONException(e.getMessage());
            }
        }

        public final LineIdToken l(String str) throws Exception {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            mua muaVar = ax8.this.d;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                return or6.a(str, Jwts.parser().setAllowedClockSkewSeconds(864000000L).setSigningKeyResolver(muaVar).parseClaimsJws(str).getBody());
            } catch (Exception e) {
                Log.e("IdTokenParser", "failed to parse IdToken: " + str, e);
                throw e;
            }
        }
    }

    public static class b extends r5i {
        @Override // defpackage.r5i
        public final Object c(JSONObject jSONObject) throws JSONException {
            String string = jSONObject.getString("token_type");
            if ("Bearer".equals(string)) {
                return new uwc(jSONObject.getString("access_token"), jSONObject.getLong("expires_in") * 1000, jSONObject.getString("refresh_token"), tpd.c(jSONObject.getString("scope")));
            }
            throw new JSONException(l5.l("Illegal token type. token_type=", string));
        }
    }

    public static class c extends r5i {
        @Override // defpackage.r5i
        public final Object c(JSONObject jSONObject) {
            return new q5(jSONObject.getString("client_id"), jSONObject.getLong("expires_in") * 1000, tpd.c(jSONObject.getString("scope")));
        }
    }

    static {
        new c(1);
        f = new b(1);
        g = new lua(1);
        h = new st7(1);
    }

    public ax8(Context context, Uri uri, Uri uri2) {
        l22 l22Var = new l22(context);
        this.c = new a();
        this.d = new mua(this);
        this.a = uri2;
        this.b = l22Var;
        this.e = uri;
    }

    public final ww8<kua> a() {
        Uri uriC = thg.c(this.e, new String[0]);
        Map<String, String> map = Collections.EMPTY_MAP;
        ww8<kua> ww8VarA = this.b.a(uriC, map, map, g);
        if (!ww8VarA.d()) {
            Log.e("LineAuthApiClient", "getOpenIdDiscoveryDocument failed: " + ww8VarA);
        }
        return ww8VarA;
    }
}
