package defpackage;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class thg {
    public static void a(Uri.Builder builder, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
    }

    public static LinkedHashMap b(String... strArr) {
        if (strArr.length % 2 != 0) {
            l5.q("Odd number of key and Value");
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i = 0; i < strArr.length; i += 2) {
            linkedHashMap.put(strArr[i], strArr[i + 1]);
        }
        return linkedHashMap;
    }

    public static Uri c(Uri uri, String... strArr) {
        Uri.Builder builderBuildUpon = uri.buildUpon();
        for (String str : strArr) {
            builderBuildUpon.appendEncodedPath(str);
        }
        return builderBuildUpon.build();
    }
}
