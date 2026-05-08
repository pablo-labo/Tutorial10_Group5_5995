package defpackage;

import android.webkit.JavascriptInterface;
import com.datadog.android.rum.internal.domain.event.RumEventDeserializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class tqf {
    public static t4e a(HashMap map) {
        Object obj = map.get("schema");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("data");
        if (str == null || obj2 == null) {
            return null;
        }
        return new t4e(obj2, str);
    }

    public static Object b(JSONObject jSONObject, String str) {
        try {
            if (jSONObject.has(str)) {
                return jSONObject.get(str);
            }
            return null;
        } catch (JSONException unused) {
            return null;
        }
    }

    @JavascriptInterface
    public final void trackWebViewEvent(String str, String str2, String str3, String[] strArr) throws JSONException {
        oqf oqfVar;
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        str.getClass();
        JSONObject jSONObject = new JSONObject(str);
        t4e t4eVarA = str2 != null ? a(nn2.u(new JSONObject(str2))) : null;
        Object objB = b(jSONObject, "eventName");
        String string6 = objB != null ? objB.toString() : null;
        Object objB2 = b(jSONObject, "trackerVersion");
        String string7 = objB2 != null ? objB2.toString() : null;
        Object objB3 = b(jSONObject, "useragent");
        String string8 = objB3 != null ? objB3.toString() : null;
        Object objB4 = b(jSONObject, "pageUrl");
        String string9 = objB4 != null ? objB4.toString() : null;
        Object objB5 = b(jSONObject, "pageTitle");
        String string10 = objB5 != null ? objB5.toString() : null;
        Object objB6 = b(jSONObject, "referrer");
        String string11 = objB6 != null ? objB6.toString() : null;
        Object objB7 = b(jSONObject, "category");
        String string12 = objB7 != null ? objB7.toString() : null;
        Object objB8 = b(jSONObject, RumEventDeserializer.EVENT_TYPE_ACTION);
        String string13 = objB8 != null ? objB8.toString() : null;
        Object objB9 = b(jSONObject, "label");
        String string14 = objB9 != null ? objB9.toString() : null;
        Object objB10 = b(jSONObject, "property");
        String string15 = objB10 != null ? objB10.toString() : null;
        Object objB11 = b(jSONObject, "value");
        Double dA = (objB11 == null || (string5 = objB11.toString()) == null) ? null : vve.A(string5);
        Object objB12 = b(jSONObject, "pingXOffsetMin");
        Integer numB = (objB12 == null || (string4 = objB12.toString()) == null) ? null : vve.B(10, string4);
        Object objB13 = b(jSONObject, "pingXOffsetMax");
        Integer numB2 = (objB13 == null || (string3 = objB13.toString()) == null) ? null : vve.B(10, string3);
        Object objB14 = b(jSONObject, "pingYOffsetMin");
        Integer numB3 = (objB14 == null || (string2 = objB14.toString()) == null) ? null : vve.B(10, string2);
        Object objB15 = b(jSONObject, "pingYOffsetMax");
        dxg dxgVar = new dxg(t4eVarA, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, dA, numB, numB2, numB3, (objB15 == null || (string = objB15.toString()) == null) ? null : vve.B(10, string));
        if (str3 != null) {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = new JSONArray(str3);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                jSONObject2.getClass();
                t4e t4eVarA2 = a(nn2.u(jSONObject2));
                if (t4eVarA2 != null) {
                    arrayList.add(t4eVarA2);
                }
            }
            if (!arrayList.isEmpty()) {
                dxgVar.a.addAll(arrayList);
            }
        }
        if (strArr == null || strArr.length == 0) {
            t8e t8eVar = vme.a;
            if (t8eVar != null) {
                oqfVar = t8eVar.e;
                if (oqfVar == null) {
                    oqfVar = new oqf(t8eVar);
                    t8eVar.e = oqfVar;
                }
            } else {
                oqfVar = null;
            }
            if (oqfVar != null) {
                oqfVar.l(dxgVar);
                return;
            } else {
                c49.b("SnowplowWebInterfaceV2", "Tracker not initialized.", new Object[0]);
                return;
            }
        }
        int i2 = 0;
        while (true) {
            if (!(i2 < strArr.length)) {
                return;
            }
            int i3 = i2 + 1;
            try {
                String str4 = strArr[i2];
                oqf oqfVarA = vme.a(str4);
                if (oqfVarA != null) {
                    oqfVarA.l(dxgVar);
                } else {
                    c49.b("SnowplowWebInterfaceV2", String.format("Tracker with namespace %s not found.", Arrays.copyOf(new Object[]{str4}, 1)), new Object[0]);
                }
                i2 = i3;
            } catch (ArrayIndexOutOfBoundsException e) {
                s6.j(e.getMessage());
                return;
            }
        }
    }
}
