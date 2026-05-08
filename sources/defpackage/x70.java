package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.datadog.android.core.internal.CoreFeature;
import com.indeed.android.jobsearch.R;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class x70 {
    public static final x70 a = new x70();
    public static final String b = x70.class.getSimpleName();
    public static String c;

    public static final String a(Context context) {
        context.getClass();
        a.getClass();
        int integer = context.getResources().getInteger(R.integer.react_native_dev_server_port);
        return k20.l("adb reverse tcp:", integer, integer, " tcp:");
    }

    public static final String b() {
        a.getClass();
        String str = Build.FINGERPRINT;
        str.getClass();
        if (zve.L(str, "vbox", false)) {
            String str2 = Build.MODEL;
            str2.getClass();
            return str2;
        }
        return Build.MODEL + " - " + Build.VERSION.RELEASE + " - API " + Build.VERSION.SDK_INT;
    }

    public static final Map<String, String> c(Context context) {
        String packageName;
        String string;
        if (context != null) {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i = applicationInfo.labelRes;
            packageName = context.getPackageName();
            if (i == 0) {
                string = applicationInfo.nonLocalizedLabel.toString();
            } else {
                string = context.getString(i);
                string.getClass();
            }
        } else {
            packageName = null;
            string = null;
        }
        Pair pair = new Pair("appDisplayName", string);
        Pair pair2 = new Pair("appIdentifier", packageName);
        Pair pair3 = new Pair("platform", CoreFeature.DEFAULT_SOURCE_NAME);
        Pair pair4 = new Pair("deviceName", Build.MODEL);
        a.getClass();
        Map<String, Object> map = cnc.a;
        Object obj = map.get("major");
        Object obj2 = map.get("minor");
        Object obj3 = map.get("patch");
        Object obj4 = map.get("prerelease");
        return lc9.a0(pair, pair2, pair3, pair4, new Pair("reactNativeVersion", obj + "." + obj2 + "." + obj3 + (obj4 != null ? t40.i(obj4, "-") : "")));
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized java.lang.String d() {
        /*
            r7 = this;
            monitor-enter(r7)
            java.lang.String r0 = defpackage.x70.c     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L7
            monitor-exit(r7)
            return r0
        L7:
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L54
            java.lang.String r2 = "/system/bin/getprop"
            java.lang.String r3 = "metro.host"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L54
            java.lang.Process r1 = r1.exec(r2)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L54
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L4a
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L4a
            java.io.InputStream r4 = r1.getInputStream()     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L4a
            java.lang.String r5 = "UTF-8"
            java.nio.charset.Charset r5 = java.nio.charset.Charset.forName(r5)     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L4a
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L4a
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L4a
            java.lang.String r0 = ""
        L2e:
            java.lang.String r3 = r2.readLine()     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L43
            if (r3 == 0) goto L36
            r0 = r3
            goto L2e
        L36:
            defpackage.x70.c = r0     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L43
            r2.close()     // Catch: java.lang.Throwable -> L3f
        L3b:
            r1.destroy()     // Catch: java.lang.Throwable -> L3f
            goto L6b
        L3f:
            r0 = move-exception
            goto L7e
        L41:
            r0 = move-exception
            goto L73
        L43:
            r0 = move-exception
            goto L58
        L45:
            r2 = move-exception
            r6 = r2
            r2 = r0
            r0 = r6
            goto L73
        L4a:
            r2 = move-exception
            r6 = r2
            r2 = r0
            r0 = r6
            goto L58
        L4f:
            r1 = move-exception
            r2 = r0
            r0 = r1
            r1 = r2
            goto L73
        L54:
            r1 = move-exception
            r2 = r0
            r0 = r1
            r1 = r2
        L58:
            java.lang.String r3 = defpackage.x70.b     // Catch: java.lang.Throwable -> L41
            java.lang.String r4 = "Failed to query for metro.host prop:"
            defpackage.s55.o(r3, r4, r0)     // Catch: java.lang.Throwable -> L41
            java.lang.String r0 = ""
            defpackage.x70.c = r0     // Catch: java.lang.Throwable -> L41
            if (r2 == 0) goto L68
            r2.close()     // Catch: java.lang.Throwable -> L3f
        L68:
            if (r1 == 0) goto L6b
            goto L3b
        L6b:
            java.lang.String r0 = defpackage.x70.c     // Catch: java.lang.Throwable -> L3f
            if (r0 != 0) goto L71
            java.lang.String r0 = ""
        L71:
            monitor-exit(r7)
            return r0
        L73:
            if (r2 == 0) goto L78
            r2.close()     // Catch: java.lang.Throwable -> L3f
        L78:
            if (r1 == 0) goto L7d
            r1.destroy()     // Catch: java.lang.Throwable -> L3f
        L7d:
            throw r0     // Catch: java.lang.Throwable -> L3f
        L7e:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L3f
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x70.d():java.lang.String");
    }
}
