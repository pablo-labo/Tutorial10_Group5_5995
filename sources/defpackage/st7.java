package defpackage;

import defpackage.rt7;
import io.jsonwebtoken.JwsHeader;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class st7 extends r5i {
    @Override // defpackage.r5i
    public final Object c(JSONObject jSONObject) throws JSONException {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray("keys");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            rt7.b.a aVar = new rt7.b.a();
            aVar.a = jSONObject2.getString("kty");
            aVar.b = jSONObject2.getString(JwsHeader.ALGORITHM);
            aVar.c = jSONObject2.getString("use");
            aVar.d = jSONObject2.getString(JwsHeader.KEY_ID);
            aVar.e = jSONObject2.getString("crv");
            aVar.f = jSONObject2.getString("x");
            aVar.g = jSONObject2.getString("y");
            arrayList.add(new rt7.b(aVar));
        }
        rt7.a aVar2 = new rt7.a();
        aVar2.a = arrayList;
        return new rt7(aVar2);
    }
}
