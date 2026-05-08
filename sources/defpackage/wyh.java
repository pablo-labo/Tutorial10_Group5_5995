package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class wyh {
    public final String a;
    public final Bundle b;
    public boolean c;
    public Bundle d;
    public final /* synthetic */ eyh e;

    public wyh(eyh eyhVar) {
        this.e = eyhVar;
        fib.f("default_event_parameters");
        this.a = "default_event_parameters";
        this.b = new Bundle();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0082 A[Catch: NumberFormatException | JSONException -> 0x008e, NumberFormatException | JSONException -> 0x008e, TRY_LEAVE, TryCatch #0 {NumberFormatException | JSONException -> 0x008e, blocks: (B:9:0x0027, B:17:0x004a, B:17:0x004a, B:19:0x0052, B:19:0x0052, B:26:0x0082, B:26:0x0082, B:20:0x005a, B:20:0x005a, B:22:0x0062, B:22:0x0062, B:23:0x006e, B:23:0x006e, B:25:0x0076, B:25:0x0076), top: B:38:0x0027, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle a() {
        /*
            r10 = this;
            boolean r0 = r10.c
            if (r0 != 0) goto Lb2
            r0 = 1
            r10.c = r0
            eyh r0 = r10.e
            android.content.SharedPreferences r1 = r0.n()
            java.lang.String r2 = r10.a
            r3 = 0
            java.lang.String r1 = r1.getString(r2, r3)
            if (r1 == 0) goto Laa
            android.os.Bundle r2 = new android.os.Bundle     // Catch: org.json.JSONException -> L9f
            r2.<init>()     // Catch: org.json.JSONException -> L9f
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch: org.json.JSONException -> L9f
            r3.<init>(r1)     // Catch: org.json.JSONException -> L9f
            r1 = 0
        L21:
            int r4 = r3.length()     // Catch: org.json.JSONException -> L9f
            if (r1 >= r4) goto L9c
            org.json.JSONObject r4 = r3.getJSONObject(r1)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r5 = "n"
            java.lang.String r5 = r4.getString(r5)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r6 = "t"
            java.lang.String r6 = r4.getString(r6)     // Catch: java.lang.Throwable -> L8e
            int r7 = r6.hashCode()     // Catch: java.lang.Throwable -> L8e
            r8 = 100
            java.lang.String r9 = "v"
            if (r7 == r8) goto L6e
            r8 = 108(0x6c, float:1.51E-43)
            if (r7 == r8) goto L5a
            r8 = 115(0x73, float:1.61E-43)
            if (r7 == r8) goto L4a
            goto L82
        L4a:
            java.lang.String r7 = "s"
            boolean r7 = r6.equals(r7)     // Catch: java.lang.Throwable -> L8e java.lang.Throwable -> L8e
            if (r7 == 0) goto L82
            java.lang.String r4 = r4.getString(r9)     // Catch: java.lang.Throwable -> L8e java.lang.Throwable -> L8e
            r2.putString(r5, r4)     // Catch: java.lang.Throwable -> L8e java.lang.Throwable -> L8e
            goto L99
        L5a:
            java.lang.String r7 = "l"
            boolean r7 = r6.equals(r7)     // Catch: java.lang.Throwable -> L8e java.lang.Throwable -> L8e
            if (r7 == 0) goto L82
            java.lang.String r4 = r4.getString(r9)     // Catch: java.lang.Throwable -> L8e java.lang.Throwable -> L8e
            long r6 = java.lang.Long.parseLong(r4)     // Catch: java.lang.Throwable -> L8e java.lang.Throwable -> L8e
            r2.putLong(r5, r6)     // Catch: java.lang.Throwable -> L8e java.lang.Throwable -> L8e
            goto L99
        L6e:
            java.lang.String r7 = "d"
            boolean r7 = r6.equals(r7)     // Catch: java.lang.Throwable -> L8e java.lang.Throwable -> L8e
            if (r7 == 0) goto L82
            java.lang.String r4 = r4.getString(r9)     // Catch: java.lang.Throwable -> L8e java.lang.Throwable -> L8e
            double r6 = java.lang.Double.parseDouble(r4)     // Catch: java.lang.Throwable -> L8e java.lang.Throwable -> L8e
            r2.putDouble(r5, r6)     // Catch: java.lang.Throwable -> L8e java.lang.Throwable -> L8e
            goto L99
        L82:
            ewh r4 = r0.zzr()     // Catch: java.lang.Throwable -> L8e java.lang.Throwable -> L8e
            jwh r4 = r4.f     // Catch: java.lang.Throwable -> L8e java.lang.Throwable -> L8e
            java.lang.String r5 = "Unrecognized persisted bundle type. Type"
            r4.a(r6, r5)     // Catch: java.lang.Throwable -> L8e java.lang.Throwable -> L8e
            goto L99
        L8e:
            ewh r4 = r0.zzr()     // Catch: org.json.JSONException -> L9f
            jwh r4 = r4.f     // Catch: org.json.JSONException -> L9f
            java.lang.String r5 = "Error reading value from SharedPreferences. Value dropped"
            r4.b(r5)     // Catch: org.json.JSONException -> L9f
        L99:
            int r1 = r1 + 1
            goto L21
        L9c:
            r10.d = r2     // Catch: org.json.JSONException -> L9f
            goto Laa
        L9f:
            ewh r0 = r0.zzr()
            jwh r0 = r0.f
            java.lang.String r1 = "Error loading bundle from SharedPreferences. Values will be lost"
            r0.b(r1)
        Laa:
            android.os.Bundle r0 = r10.d
            if (r0 != 0) goto Lb2
            android.os.Bundle r0 = r10.b
            r10.d = r0
        Lb2:
            android.os.Bundle r10 = r10.d
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wyh.a():android.os.Bundle");
    }

    public final void b(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        eyh eyhVar = this.e;
        SharedPreferences.Editor editorEdit = eyhVar.n().edit();
        int size = bundle.size();
        String str = this.a;
        if (size == 0) {
            editorEdit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        jSONObject.put("v", String.valueOf(obj));
                        if (obj instanceof String) {
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("t", "l");
                        } else if (obj instanceof Double) {
                            jSONObject.put("t", "d");
                        } else {
                            eyhVar.zzr().f.a(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e) {
                        eyhVar.zzr().f.a(e, "Cannot serialize bundle value to SharedPreferences");
                    }
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.d = bundle;
    }
}
