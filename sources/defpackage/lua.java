package defpackage;

import defpackage.kua;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class lua extends r5i {
    @Override // defpackage.r5i
    public final Object c(JSONObject jSONObject) {
        kua.a aVar = new kua.a();
        aVar.a = jSONObject.getString("issuer");
        aVar.b = jSONObject.getString("authorization_endpoint");
        aVar.c = jSONObject.getString("token_endpoint");
        aVar.d = jSONObject.getString("jwks_uri");
        aVar.e = web.B(jSONObject.getJSONArray("response_types_supported"));
        aVar.f = web.B(jSONObject.getJSONArray("subject_types_supported"));
        aVar.g = web.B(jSONObject.getJSONArray("id_token_signing_alg_values_supported"));
        return new kua(aVar);
    }
}
