package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.location.zzdb;
import com.google.android.gms.internal.location.zzdf;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.iz8;

/* JADX INFO: loaded from: classes2.dex */
public final class ish extends ja6 {
    public final jfe B;
    public final jfe C;
    public final jfe D;

    public ish(Context context, Looper looper, w72 w72Var, y9h y9hVar, y9h y9hVar2) {
        super(context, looper, 23, w72Var, y9hVar, y9hVar2);
        this.B = new jfe();
        this.C = new jfe();
        this.D = new jfe();
    }

    @Override // defpackage.g91
    public final IInterface d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return iInterfaceQueryLocalInterface instanceof pji ? (pji) iInterfaceQueryLocalInterface : new nii(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // defpackage.g91
    public final Feature[] f() {
        return fhi.d;
    }

    @Override // defpackage.g91
    public final String j() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // defpackage.g91
    public final String k() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // defpackage.g91
    public final void m() {
        System.currentTimeMillis();
        synchronized (this.B) {
            this.B.clear();
        }
        synchronized (this.C) {
            this.C.clear();
        }
        synchronized (this.D) {
            this.D.clear();
        }
    }

    @Override // defpackage.g91
    public final boolean n() {
        return true;
    }

    public final void q(iz8.a aVar, boolean z, TaskCompletionSource taskCompletionSource) {
        synchronized (this.C) {
            try {
                irh irhVar = (irh) this.C.remove(aVar);
                if (irhVar == null) {
                    taskCompletionSource.setResult(Boolean.FALSE);
                    return;
                }
                iz8 iz8Var = (iz8) irhVar.b.c;
                iz8Var.b = null;
                iz8Var.c = null;
                if (!z) {
                    taskCompletionSource.setResult(Boolean.TRUE);
                } else if (r(fhi.c)) {
                    ((pji) i()).V0(new zzdb(2, null, irhVar, null, null, null), new pqh(Boolean.TRUE, taskCompletionSource));
                } else {
                    ((pji) i()).t0(new zzdf(2, null, null, irhVar, null, new vqh(taskCompletionSource), null));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean r(Feature feature) {
        Feature feature2;
        Feature[] featureArrZ0 = z0();
        if (featureArrZ0 == null) {
            return false;
        }
        int length = featureArrZ0.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                feature2 = null;
                break;
            }
            feature2 = featureArrZ0[i];
            if (feature.a.equals(feature2.a)) {
                break;
            }
            i++;
        }
        return feature2 != null && feature2.s0() >= feature.s0();
    }

    @Override // defpackage.g91, vf0.f
    public final int y0() {
        return 11717000;
    }
}
