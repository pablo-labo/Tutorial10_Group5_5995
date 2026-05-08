package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import defpackage.fg5;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class xki {
    public static final i62 a;

    static {
        ea8 ea8Var = new ea8();
        fg5.c cVar = new fg5.c();
        HashMap map = ea8Var.a;
        map.put(fg5.a.class, cVar);
        HashMap map2 = ea8Var.b;
        map2.remove(fg5.a.class);
        map.put(fg5.class, new fg5.b());
        map2.remove(fg5.class);
        a = new i62(ea8Var);
    }

    public static void a(Intent intent, String str) {
        Bundle bundle = new Bundle();
        String stringExtra = intent.getStringExtra("google.c.a.c_id");
        if (stringExtra != null) {
            bundle.putString("_nmid", stringExtra);
        }
        String stringExtra2 = intent.getStringExtra("google.c.a.c_l");
        if (stringExtra2 != null) {
            bundle.putString("_nmn", stringExtra2);
        }
        String stringExtra3 = intent.getStringExtra("google.c.a.m_l");
        if (!TextUtils.isEmpty(stringExtra3)) {
            bundle.putString("label", stringExtra3);
        }
        String stringExtra4 = intent.getStringExtra("google.c.a.m_c");
        if (!TextUtils.isEmpty(stringExtra4)) {
            bundle.putString("message_channel", stringExtra4);
        }
        String stringExtra5 = intent.getStringExtra("from");
        if (stringExtra5 == null || !stringExtra5.startsWith("/topics/")) {
            stringExtra5 = null;
        }
        if (stringExtra5 != null) {
            bundle.putString("_nt", stringExtra5);
        }
        String stringExtra6 = intent.getStringExtra("google.c.a.ts");
        if (stringExtra6 != null) {
            try {
                bundle.putInt("_nmt", Integer.parseInt(stringExtra6));
            } catch (NumberFormatException e) {
                Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e);
            }
        }
        String stringExtra7 = intent.hasExtra("google.c.a.udt") ? intent.getStringExtra("google.c.a.udt") : null;
        if (stringExtra7 != null) {
            try {
                bundle.putInt("_ndt", Integer.parseInt(stringExtra7));
            } catch (NumberFormatException e2) {
                Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e2);
            }
        }
        String str2 = (intent.getExtras() == null || !hc0.h(intent.getExtras())) ? "data" : "display";
        if ("_nr".equals(str) || "_nf".equals(str)) {
            bundle.putString("_nmc", str2);
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            String strValueOf = String.valueOf(bundle);
            StringBuilder sb = new StringBuilder(strValueOf.length() + str.length() + 37);
            sb.append("Logging to scion event=");
            sb.append(str);
            sb.append(" scionPayload=");
            sb.append(strValueOf);
            Log.d("FirebaseMessaging", sb.toString());
        }
        n20 n20Var = (n20) pf5.c().b(n20.class);
        if (n20Var != null) {
            n20Var.a("fcm", str, bundle);
        } else {
            Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
        }
    }

    public static boolean b(Intent intent) {
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) {
            return false;
        }
        return "1".equals(intent.getStringExtra("google.c.a.e"));
    }
}
