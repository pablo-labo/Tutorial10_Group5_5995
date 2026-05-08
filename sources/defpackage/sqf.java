package defpackage;

import android.webkit.JavascriptInterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class sqf {
    public static void a(c2 c2Var, String str, String[] strArr) throws JSONException {
        oqf oqfVar = null;
        if (str != null) {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                jSONObject.getClass();
                HashMap mapU = nn2.u(jSONObject);
                Object obj = mapU.get("schema");
                String str2 = obj instanceof String ? (String) obj : null;
                Object obj2 = mapU.get("data");
                if (str2 != null && obj2 != null) {
                    arrayList.add(new t4e(obj2, str2));
                }
            }
            if (!arrayList.isEmpty()) {
                c2Var.a.addAll(arrayList);
            }
        }
        if (strArr == null || strArr.length == 0) {
            t8e t8eVar = vme.a;
            if (t8eVar != null && (oqfVar = t8eVar.e) == null) {
                oqfVar = new oqf(t8eVar);
                t8eVar.e = oqfVar;
            }
            if (oqfVar != null) {
                oqfVar.l(c2Var);
                return;
            } else {
                c49.b("SnowplowWebInterface", "Tracker not initialized.", new Object[0]);
                return;
            }
        }
        int i2 = 0;
        while (i2 < strArr.length) {
            int i3 = i2 + 1;
            try {
                String str3 = strArr[i2];
                oqf oqfVarA = vme.a(str3);
                if (oqfVarA != null) {
                    oqfVarA.l(c2Var);
                } else {
                    c49.b("SnowplowWebInterface", String.format("Tracker with namespace %s not found.", Arrays.copyOf(new Object[]{str3}, 1)), new Object[0]);
                }
                i2 = i3;
            } catch (ArrayIndexOutOfBoundsException e) {
                s6.j(e.getMessage());
                return;
            }
        }
    }

    @JavascriptInterface
    public final void trackPageView(String str, String str2, String str3, String str4, String[] strArr) throws JSONException {
        str.getClass();
        w0b w0bVar = new w0b(str);
        w0bVar.c = str2;
        w0bVar.d = str3;
        a(w0bVar, str4, strArr);
    }

    @JavascriptInterface
    public final void trackScreenView(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String[] strArr) throws JSONException {
        str.getClass();
        str2.getClass();
        drd drdVar = new drd(str, UUID.fromString(str2));
        drdVar.d = str3;
        drdVar.f = str5;
        drdVar.e = str4;
        drdVar.g = str6;
        drdVar.h = str7;
        a(drdVar, str8, strArr);
    }

    @JavascriptInterface
    public final void trackSelfDescribingEvent(String str, String str2, String str3, String[] strArr) throws JSONException {
        str.getClass();
        str2.getClass();
        a(new s4e(str, nn2.u(new JSONObject(str2))), str3, strArr);
    }

    @JavascriptInterface
    public final void trackStructEvent(String str, String str2, String str3, String str4, Double d, String str5, String[] strArr) throws JSONException {
        str.getClass();
        str2.getClass();
        hwe hweVar = new hwe(str, str2);
        hweVar.d = str3;
        hweVar.e = str4;
        hweVar.f = d;
        a(hweVar, str5, strArr);
    }
}
