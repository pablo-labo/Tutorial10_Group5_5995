package defpackage;

import android.util.JsonReader;
import android.util.JsonWriter;
import com.wlproctor.common.PayloadSpecification;
import com.wlproctor.common.model.Payload;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class c7b {
    public static final Payload a(PayloadSpecification payloadSpecification, String str) throws IOException {
        if (payloadSpecification == null || str == null || zve.U(str)) {
            return null;
        }
        switch (payloadSpecification.a.ordinal()) {
            case 0:
                return new Payload(Double.valueOf(Double.parseDouble(str)), null, null, null, null, null, null, null, 254, null);
            case 1:
                List listK0 = zve.k0(str, new String[]{","});
                ArrayList arrayList = new ArrayList(t92.r0(listK0, 10));
                Iterator it = listK0.iterator();
                while (it.hasNext()) {
                    arrayList.add(Double.valueOf(Double.parseDouble(zve.s0((String) it.next()).toString())));
                }
                return new Payload(null, arrayList, null, null, null, null, null, null, 253, null);
            case 2:
                return new Payload(null, null, Long.valueOf(Long.parseLong(str)), null, null, null, null, null, 251, null);
            case 3:
                List listK02 = zve.k0(str, new String[]{","});
                ArrayList arrayList2 = new ArrayList(t92.r0(listK02, 10));
                Iterator it2 = listK02.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Long.valueOf(Long.parseLong(zve.s0((String) it2.next()).toString())));
                }
                return new Payload(null, null, null, arrayList2, null, null, null, null, 247, null);
            case 4:
                JsonReader jsonReader = new JsonReader(new StringReader(str));
                jsonReader.setLenient(true);
                String strNextString = jsonReader.nextString();
                strNextString.getClass();
                return new Payload(null, null, null, null, strNextString, null, null, null, 239, null);
            case 5:
                JSONArray jSONArray = new JSONArray(ja.f(']', "[", str));
                int length = jSONArray.length();
                ArrayList arrayList3 = new ArrayList(length);
                for (int i = 0; i < length; i++) {
                    arrayList3.add(jSONArray.getString(i));
                }
                return new Payload(null, null, null, null, null, arrayList3, null, null, 223, null);
            case 6:
                return new Payload(null, null, null, null, null, null, b(new JSONObject(str)), null, 191, null);
            case 7:
                return new Payload(null, null, null, null, null, null, null, b(new JSONObject(str)), 127, null);
            default:
                l.g();
                return null;
        }
    }

    public static final LinkedHashMap b(JSONObject jSONObject) throws JSONException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        itKeys.getClass();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof String ? true : obj instanceof Number) {
                next.getClass();
                obj.getClass();
                linkedHashMap.put(next, obj);
            } else if (obj instanceof JSONArray) {
                next.getClass();
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                ArrayList arrayList = new ArrayList(length);
                for (int i = 0; i < length; i++) {
                    arrayList.add(jSONArray.get(i));
                }
                linkedHashMap.put(next, arrayList);
            } else {
                if (obj instanceof JSONObject) {
                    l5.q("Nested map is not supported");
                    return null;
                }
                if (obj == null) {
                    l5.q("Value of a map must be non-null");
                    return null;
                }
            }
        }
        return linkedHashMap;
    }

    public static final String c(String str) throws IOException {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.setLenient(true);
            jsonWriter.value(str);
            jsonWriter.close();
            String string = stringWriter.toString();
            string.getClass();
            return string;
        } finally {
        }
    }
}
