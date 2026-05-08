package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class c8i extends m0i {
    public Activity V;
    public volatile boolean W;
    public volatile f8i X;
    public f8i Y;
    public boolean Z;
    public final Object a0;
    public String b0;
    public volatile f8i c;
    public f8i d;

    @VisibleForTesting
    public f8i e;
    public final ConcurrentHashMap f;

    public c8i(i0i i0iVar) {
        super(i0iVar);
        this.a0 = new Object();
        this.f = new ConcurrentHashMap();
    }

    @VisibleForTesting
    public static String n(String str) {
        String[] strArrSplit = str.split("\\.");
        String str2 = strArrSplit.length > 0 ? strArrSplit[strArrSplit.length - 1] : "";
        return str2.length() > 100 ? str2.substring(0, 100) : str2;
    }

    public static void r(f8i f8iVar, Bundle bundle, boolean z) {
        if (bundle == null || f8iVar == null || (bundle.containsKey("_sc") && !z)) {
            if (bundle != null && f8iVar == null && z) {
                bundle.remove("_sn");
                bundle.remove("_sc");
                bundle.remove("_si");
                return;
            }
            return;
        }
        String str = f8iVar.a;
        if (str != null) {
            bundle.putString("_sn", str);
        } else {
            bundle.remove("_sn");
        }
        String str2 = f8iVar.b;
        if (str2 != null) {
            bundle.putString("_sc", str2);
        } else {
            bundle.remove("_sc");
        }
        bundle.putLong("_si", f8iVar.c);
    }

    @Override // defpackage.m0i
    public final boolean m() {
        return false;
    }

    public final f8i o(boolean z) {
        k();
        b();
        if (!this.a.V.k(null, djh.C0) || !z) {
            return this.e;
        }
        f8i f8iVar = this.e;
        return f8iVar != null ? f8iVar : this.Y;
    }

    public final void p(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!this.a.V.r().booleanValue() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f.put(activity, new f8i(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id"), false));
    }

    public final void q(Activity activity, f8i f8iVar, boolean z) {
        f8i f8iVar2;
        f8i f8iVar3 = this.c == null ? this.d : this.c;
        if (f8iVar.b == null) {
            f8iVar2 = new f8i(f8iVar.a, activity != null ? n(activity.getClass().getCanonicalName()) : null, f8iVar.c, f8iVar.e);
        } else {
            f8iVar2 = f8iVar;
        }
        this.d = this.c;
        this.c = f8iVar2;
        this.a.c0.getClass();
        zzq().m(new i8i(this, f8iVar2, f8iVar3, SystemClock.elapsedRealtime(), z));
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012c A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(defpackage.f8i r21, defpackage.f8i r22, long r23, boolean r25, android.os.Bundle r26) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c8i.s(f8i, f8i, long, boolean, android.os.Bundle):void");
    }

    public final void t(f8i f8iVar, boolean z, long j) {
        i0i i0iVar = this.a;
        lfh lfhVarP = i0iVar.p();
        i0iVar.c0.getClass();
        lfhVarP.k(SystemClock.elapsedRealtime());
        if (!j().e.a(j, f8iVar != null && f8iVar.d, z) || f8iVar == null) {
            return;
        }
        f8iVar.d = false;
    }

    public final f8i u(Activity activity) {
        fib.i(activity);
        f8i f8iVar = (f8i) this.f.get(activity);
        if (f8iVar == null) {
            f8i f8iVar2 = new f8i(null, n(activity.getClass().getCanonicalName()), e().i0(), false);
            this.f.put(activity, f8iVar2);
            f8iVar = f8iVar2;
        }
        return (this.a.V.k(null, djh.C0) && this.X != null) ? this.X : f8iVar;
    }
}
