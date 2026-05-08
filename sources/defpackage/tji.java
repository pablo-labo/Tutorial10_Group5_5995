package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.zzt;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: loaded from: classes2.dex */
public final class tji {
    public static final d4i a;
    public static final h7i b;
    public static volatile ygh c;
    public static final Object d;
    public static Context e;

    static {
        new gsh(gai.h("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"));
        new uuh(gai.h("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"), 0);
        new ixh(gai.h("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
        new uuh(gai.h("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"), 1);
        a = new d4i(gai.h("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
        b = new h7i(gai.h("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
        d = new Object();
    }

    public static void a() {
        ygh mghVar;
        if (c != null) {
            return;
        }
        fib.i(e);
        synchronized (d) {
            try {
                if (c == null) {
                    IBinder iBinderB = DynamiteModule.c(e, DynamiteModule.c, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i = tgh.a;
                    if (iBinderB == null) {
                        mghVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        mghVar = iInterfaceQueryLocalInterface instanceof ygh ? (ygh) iInterfaceQueryLocalInterface : new mgh(iBinderB, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
                    }
                    c = mghVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Deprecated
    public static rmi b(String str, hdi hdiVar, boolean z, boolean z2) {
        try {
            a();
            fib.i(e);
            try {
                return c.Y(new zzt(str, hdiVar, z, z2), new vna(e.getPackageManager())) ? rmi.d : new imi(new yfi(z, str, hdiVar));
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                return rmi.c(e2, "module call");
            }
        } catch (DynamiteModule.LoadingException e3) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
            return rmi.c(e3, "module init: ".concat(String.valueOf(e3.getMessage())));
        }
    }
}
