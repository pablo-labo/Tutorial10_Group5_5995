package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class f9e {
    public static final f9e a = new f9e();
    public static final i62 b;

    static {
        ea8 ea8Var = new ea8();
        ea8Var.a(e9e.class, n11.a);
        ea8Var.a(l9e.class, o11.a);
        ea8Var.a(ge3.class, l11.a);
        ea8Var.a(sn0.class, k11.a);
        ea8Var.a(m40.class, j11.a);
        ea8Var.a(vnb.class, m11.a);
        ea8Var.d = true;
        b = new i62(ea8Var);
    }

    public static sn0 a(pf5 pf5Var) throws PackageManager.NameNotFoundException {
        Object next;
        pf5Var.a();
        Context context = pf5Var.a;
        context.getClass();
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String strValueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        pf5Var.a();
        String str = pf5Var.c.b;
        str.getClass();
        Build.MODEL.getClass();
        Build.VERSION.RELEASE.getClass();
        packageName.getClass();
        String str2 = packageInfo.versionName;
        if (str2 == null) {
            str2 = strValueOf;
        }
        Build.MANUFACTURER.getClass();
        pf5Var.a();
        int iMyPid = Process.myPid();
        Iterator it = wnb.a(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((vnb) next).b == iMyPid) {
                break;
            }
        }
        vnb vnbVar = (vnb) next;
        if (vnbVar == null) {
            vnbVar = new vnb(iMyPid, 0, wnb.b(), false);
        }
        pf5Var.a();
        return new sn0(str, new m40(packageName, str2, strValueOf, vnbVar, wnb.a(context)));
    }
}
