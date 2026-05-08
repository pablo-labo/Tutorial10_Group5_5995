package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes2.dex */
public final class gwh extends g91<pvh> {
    @Override // defpackage.g91
    public final /* synthetic */ IInterface d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return iInterfaceQueryLocalInterface instanceof pvh ? (pvh) iInterfaceQueryLocalInterface : new uvh(iBinder);
    }

    @Override // defpackage.g91
    public final String j() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // defpackage.g91
    public final String k() {
        return "com.google.android.gms.measurement.START";
    }

    @Override // defpackage.g91, vf0.f
    public final int y0() {
        return 12451000;
    }
}
