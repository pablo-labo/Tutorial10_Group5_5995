package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class g5g {
    public static boolean a(Context context, int i) {
        if (b(context, "com.google.android.gms", i)) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                gb6 gb6VarA = gb6.a(context);
                gb6VarA.getClass();
                if (packageInfo != null) {
                    if (!gb6.c(packageInfo, false)) {
                        if (gb6.c(packageInfo, true)) {
                            if (!bb6.a(gb6VarA.a)) {
                                Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                            }
                        }
                    }
                    return true;
                }
                return false;
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
            }
        }
        return false;
    }

    public static boolean b(Context context, String str, int i) {
        sya syaVarA = a5h.a(context);
        syaVarA.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) syaVarA.a.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }
}
