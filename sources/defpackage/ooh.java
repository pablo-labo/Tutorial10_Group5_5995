package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.android.billingclient.api.a;

/* JADX INFO: loaded from: classes2.dex */
public final class ooh {
    public static final /* synthetic */ int a = 0;

    static {
        Runtime.getRuntime().availableProcessors();
    }

    public static a a(Intent intent, String str) {
        int iIntValue = 6;
        if (intent == null) {
            d("BillingHelper", "Got null intent!");
            a.C0109a c0109aA = a.a();
            c0109aA.a = 6;
            c0109aA.b = "An internal error occurred.";
            return c0109aA.a();
        }
        a.C0109a c0109aA2 = a.a();
        Bundle extras = intent.getExtras();
        if (extras == null) {
            d(str, "Unexpected null bundle received!");
        } else {
            Object obj = extras.get("RESPONSE_CODE");
            if (obj == null) {
                c(str, "getResponseCodeFromBundle() got null response code, assuming OK");
                iIntValue = 0;
            } else if (obj instanceof Integer) {
                iIntValue = ((Integer) obj).intValue();
            } else {
                d(str, "Unexpected type for bundle response code: ".concat(obj.getClass().getName()));
            }
        }
        c0109aA2.a = iIntValue;
        c0109aA2.b = b(str, intent.getExtras());
        return c0109aA2.a();
    }

    public static String b(String str, Bundle bundle) {
        if (bundle == null) {
            d(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            c(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        d(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
        return "";
    }

    public static void c(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            if (str2.isEmpty()) {
                Log.v(str, str2);
                return;
            }
            int i = 40000;
            while (!str2.isEmpty() && i > 0) {
                int iMin = Math.min(str2.length(), Math.min(4000, i));
                Log.v(str, str2.substring(0, iMin));
                str2 = str2.substring(iMin);
                i -= iMin;
            }
        }
    }

    public static void d(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static void e(String str, String str2, Throwable th) {
        try {
            if (Log.isLoggable(str, 5)) {
                Log.w(str, str2, th);
            }
        } catch (Throwable unused) {
        }
    }
}
