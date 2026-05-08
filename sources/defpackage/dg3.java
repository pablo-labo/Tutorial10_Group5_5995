package defpackage;

import android.util.Log;
import com.datadog.android.Datadog;
import com.datadog.android.rum.GlobalRumMonitor;
import com.datadog.android.rum.RumActionType;
import com.datadog.android.rum.RumErrorSource;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class dg3 {
    /* JADX WARN: Removed duplicated region for block: B:145:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0212 A[PHI: r4
  0x0212: PHI (r4v2 java.lang.String) = 
  (r4v0 java.lang.String)
  (r4v0 java.lang.String)
  (r4v1 java.lang.String)
  (r4v1 java.lang.String)
  (r4v1 java.lang.String)
  (r4v1 java.lang.String)
  (r4v1 java.lang.String)
  (r4v1 java.lang.String)
  (r4v1 java.lang.String)
 binds: [B:156:0x0210, B:171:0x0237, B:194:0x0273, B:242:0x02f0, B:260:0x0314, B:284:0x0345, B:320:0x0390, B:329:0x03a2, B:371:0x03f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x026c A[PHI: r2
  0x026c: PHI (r2v3 java.lang.String) = 
  (r2v1 java.lang.String)
  (r2v1 java.lang.String)
  (r2v1 java.lang.String)
  (r2v1 java.lang.String)
  (r2v2 java.lang.String)
  (r2v2 java.lang.String)
 binds: [B:191:0x026a, B:239:0x02ea, B:257:0x030e, B:281:0x033f, B:302:0x0366, B:362:0x03e5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String a(defpackage.rxb r9, java.lang.Object r10, java.lang.Object r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 1074
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dg3.a(rxb, java.lang.Object, java.lang.Object, java.lang.String):java.lang.String");
    }

    public static /* synthetic */ String b(rxb rxbVar, Object obj, Object obj2, String str, int i) {
        if ((i & 1) != 0) {
            rxbVar = null;
        }
        if ((i & 4) != 0) {
            obj2 = null;
        }
        if ((i & 8) != 0) {
            str = "";
        }
        return a(rxbVar, obj, obj2, str);
    }

    public static final String c(rxb rxbVar) {
        rxbVar.getClass();
        if (!c0h.C()) {
            return "";
        }
        int iOrdinal = rxbVar.ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? "" : "Resume Files" : "Preferences" : "Profile";
    }

    public static final void d(String str, Map<String, ? extends Object> map) {
        str.getClass();
        try {
            if (!c0h.C() || str.length() <= 0) {
                return;
            }
            GlobalRumMonitor.get(Datadog.getInstance("dd-jsma")).addAction(RumActionType.CUSTOM, str, map);
        } catch (Exception e) {
            ArrayList arrayList = lz2.a;
            Log.d("ProfileRUM", "RUM action logging failed with exception: " + e.getMessage(), null);
        }
    }

    public static final void e(String str, oub oubVar) {
        bs4 bs4Var = bs4.a;
        str.getClass();
        oubVar.getClass();
        ArrayList arrayList = lz2.a;
        Log.d("ProfileRUM", akb.k("🔍 DEBUG: Attempting to log error - Message: '", str, "', Type: '", oubVar.a(), "'"), null);
        try {
            if (!c0h.C() || str.length() <= 0) {
                Log.d("ProfileRUM", "⚠️ DEBUG: Error logging skipped - DataDog enabled: " + c0h.C() + ", Message empty: " + (str.length() == 0), null);
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(bs4Var);
            linkedHashMap.put("errorType", oubVar.a());
            GlobalRumMonitor.get(Datadog.getInstance("dd-jsma")).addError(str, RumErrorSource.CUSTOM, null, linkedHashMap);
            Log.d("ProfileRUM", "📝 DEBUG: Error logged to Datadog RUM successfully", null);
            pub.b.a().b(str);
            Log.d("ProfileRUM", "🚨 DEBUG: Error deduplication triggered for message: '" + str + "'", null);
        } catch (Exception e) {
            ArrayList arrayList2 = lz2.a;
            Log.d("ProfileRUM", "❌ DEBUG: Error logging failed with exception: " + e.getMessage(), null);
        }
    }

    public static final void f(String str, Map<String, ? extends Object> map) {
        try {
            if (!c0h.C() || str.length() <= 0) {
                return;
            }
            String strConcat = "Native Profile / ".concat(str);
            ArrayList arrayList = lz2.a;
            Log.d("ProfileRUM", "🔍 DEBUG: Starting view tracking for '" + strConcat + "' with error tracking", null);
            GlobalRumMonitor.get(Datadog.getInstance("dd-jsma")).startView(strConcat, strConcat, map);
        } catch (Exception unused) {
        }
    }

    public static void g(String str) {
        f(str, bs4.a);
        pub.b.a().a();
    }

    public static final void h(pjb pjbVar) {
        i(b(rxb.b, pjbVar, null, "Edit", 4));
    }

    public static void i(String str) {
        bs4 bs4Var = bs4.a;
        try {
            if (c0h.C() && str.length() > 0) {
                String strConcat = "Native Profile / ".concat(str);
                ArrayList arrayList = lz2.a;
                Log.d("ProfileRUM", "🔍 DEBUG: Stopping view tracking for '" + strConcat + "' with error tracking", null);
                GlobalRumMonitor.get(Datadog.getInstance("dd-jsma")).stopView(strConcat, bs4Var);
            }
        } catch (Exception unused) {
        }
        pub.b.a().a();
    }
}
