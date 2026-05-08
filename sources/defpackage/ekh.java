package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.datadog.android.ndk.internal.NdkCrashLog;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ekh {
    public final String a;
    public final String b;
    public final long c;

    public ekh(long j, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public static String a(long j, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put(NdkCrashLog.TIMESTAMP_KEY_NAME, j);
            return jSONObject.toString();
        } catch (JSONException e) {
            String strValueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 24);
            sb.append("Failed to encode token: ");
            sb.append(strValueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    public static ekh b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new ekh(0L, str, null);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new ekh(jSONObject.getLong(NdkCrashLog.TIMESTAMP_KEY_NAME), jSONObject.getString("token"), jSONObject.getString("appVersion"));
        } catch (JSONException e) {
            String strValueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 23);
            sb.append("Failed to parse token: ");
            sb.append(strValueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }
}
