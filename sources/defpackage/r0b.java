package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class r0b extends l98 {
    public final /* synthetic */ eqg a;

    public r0b(eqg eqgVar) {
        this.a = eqgVar;
    }

    @Override // defpackage.l98
    public final void a(String str) {
        q0b q0bVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("tk");
            JSONObject jSONObject2 = jSONObject.getJSONObject("indeedMetaTags");
            Iterator<String> itKeys = jSONObject2.keys();
            itKeys.getClass();
            String str2 = null;
            String str3 = null;
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String string = jSONObject2.getString(next);
                if (wl7.b(next, "indeed-share-url")) {
                    str2 = string;
                } else if (wl7.b(next, "indeed-share-message")) {
                    str3 = string;
                }
            }
            strOptString.getClass();
            q0bVar = new q0b(strOptString, str2, str3);
        } catch (JSONException e) {
            ArrayList arrayList = lz2.a;
            lz2.c("PageMetadata", "Invalid JSON in page metadata : " + e, false, null, 12);
            q0bVar = null;
        }
        this.a.invoke(new jde(q0bVar != null ? q0bVar.b : null, q0bVar != null ? q0bVar.c : null, q0bVar != null ? q0bVar.a : null));
    }
}
