package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class gb6 {
    public static gb6 c;
    public final Context a;
    public volatile String b;

    public gb6(Context context) {
        this.a = context.getApplicationContext();
    }

    public static gb6 a(Context context) {
        fib.i(context);
        synchronized (gb6.class) {
            if (c == null) {
                d4i d4iVar = tji.a;
                synchronized (tji.class) {
                    if (tji.e == null) {
                        tji.e = context.getApplicationContext();
                    } else {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                c = new gb6(context);
            }
        }
        return c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f4, code lost:
    
        r5 = r9;
     */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean c(android.content.pm.PackageInfo r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb6.c(android.content.pm.PackageInfo, boolean):boolean");
    }

    public static gai d(PackageInfo packageInfo, gai... gaiVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            hdi hdiVar = new hdi(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < gaiVarArr.length; i++) {
                if (gaiVarArr[i].equals(hdiVar)) {
                    return gaiVarArr[i];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(int r21) {
        /*
            Method dump skipped, instruction units count: 453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb6.b(int):boolean");
    }
}
