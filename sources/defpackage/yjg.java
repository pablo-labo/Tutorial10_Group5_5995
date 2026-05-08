package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public final class yjg {
    public static final yjg a = new yjg();
    public static final String b = yjg.class.getSimpleName();

    public static final void a(Object obj, String str, Map map) {
        map.getClass();
        if (obj == null || str.length() == 0) {
            return;
        }
        map.put(str, obj);
    }

    public static final t4e b(Context context) {
        context.getClass();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            String str = packageInfo.versionName;
            String strValueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
            if (str == null) {
                return null;
            }
            HashMap map = new HashMap();
            a(str, "version", map);
            a(strValueOf, "build", map);
            return new t4e(map, "iglu:com.snowplowanalytics.mobile/application/jsonschema/1-0-0");
        } catch (PackageManager.NameNotFoundException e) {
            String str2 = b;
            str2.getClass();
            c49.b(str2, "Failed to find application context: %s", e.getMessage());
            return null;
        }
    }

    public static final String c(long j) {
        Date date = new Date(j);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", new Locale("en"));
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String str = simpleDateFormat.format(date);
        str.getClass();
        return str;
    }

    public static final boolean d(Context context) {
        context.getClass();
        String str = b;
        str.getClass();
        boolean z = false;
        c49.e(str, "Checking tracker internet connectivity.", new Object[0]);
        Object systemService = context.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException e) {
                str.getClass();
                c49.b(str, "Security exception checking connection: %s", e.toString());
                return true;
            }
        }
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            z = true;
        }
        str.getClass();
        c49.a(str, "Tracker connection online: %s", Boolean.valueOf(z));
        return z;
    }

    public static String e(String str) {
        List listK0 = zve.k0(str, new String[]{"://"});
        return listK0.size() > 1 ? z92.W0(z92.h1(u63.Z(awe.A0(16, (String) z92.O0(listK0))), z92.J0(listK0, 1)), "://", null, null, null, 62) : str;
    }
}
