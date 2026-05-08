package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public interface e3g {

    public interface a {
        void a(JSONObject jSONObject);

        void b(Exception exc);
    }

    void a(LinkedHashMap linkedHashMap);

    void b(String str, String str2, JSONObject jSONObject, String str3, String str4, JSONObject jSONObject2, a aVar);

    void c(ArrayList arrayList);

    LinkedHashMap e(ArrayList arrayList);
}
