package defpackage;

import android.util.Base64;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class rqf implements y6b {
    public final String a = rqf.class.getSimpleName();
    public final HashMap<String, Object> b = new HashMap<>();

    @Override // defpackage.y6b
    public final HashMap a() {
        return this.b;
    }

    @Override // defpackage.y6b
    public final long b() {
        long j;
        String string = toString();
        yjg yjgVar = yjg.a;
        long j2 = 0;
        int i = 0;
        while (i < string.length()) {
            char cCharAt = string.charAt(i);
            if (cCharAt <= 127) {
                j = 1;
            } else if (cCharAt <= 2047) {
                j = 2;
            } else {
                if (55296 <= cCharAt && cCharAt < 57344) {
                    j2 += 4;
                    i++;
                } else if (cCharAt < 65535) {
                    j = 3;
                } else {
                    j2 += 4;
                }
                i++;
            }
            j2 += j;
            i++;
        }
        return j2;
    }

    public final void c(String str, String str2) {
        HashMap<String, Object> map = this.b;
        String str3 = this.a;
        if (str2 == null || str2.length() == 0) {
            c49.e(str3, "The keys value is empty, removing the key: %s", str);
            map.remove(str);
        } else {
            c49.e(str3, l5.m("Adding new kv pair: ", str, "->%s"), str2);
            map.put(str, str2);
        }
    }

    public final void d(HashMap map, boolean z, String str, String str2) {
        map.getClass();
        String string = new JSONObject(map).toString();
        string.getClass();
        c49.e(this.a, "Adding new map: %s", map);
        if (!z) {
            c(str2, string);
            return;
        }
        yjg yjgVar = yjg.a;
        byte[] bytes = string.getBytes(a32.b);
        bytes.getClass();
        String strEncodeToString = Base64.encodeToString(bytes, 2);
        strEncodeToString.getClass();
        c(str, strEncodeToString);
    }

    public final void e(Map<String, ? extends Object> map) {
        String str = this.a;
        c49.e(str, "Adding new map: %s", map);
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            key.getClass();
            HashMap<String, Object> map2 = this.b;
            if (value == null) {
                c49.e(str, "The value is empty, removing the key: %s", key);
                map2.remove(key);
            } else {
                c49.e(str, l5.m("Adding new kv pair: ", key, "->%s"), value);
                map2.put(key, value);
            }
        }
    }

    public final String toString() {
        HashMap<String, Object> map = this.b;
        map.getClass();
        String string = new JSONObject(map).toString();
        string.getClass();
        return string;
    }
}
