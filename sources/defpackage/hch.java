package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes2.dex */
public final class hch extends ja6 {
    public final qbf B;

    public hch(Context context, Looper looper, w72 w72Var, qbf qbfVar, y9h y9hVar, y9h y9hVar2) {
        super(context, looper, 270, w72Var, y9hVar, y9hVar2);
        this.B = qbfVar;
    }

    @Override // defpackage.g91
    public final IInterface d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof ubh ? (ubh) iInterfaceQueryLocalInterface : new ubh(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    @Override // defpackage.g91
    public final Feature[] f() {
        return ibh.b;
    }

    @Override // defpackage.g91
    public final Bundle g() {
        this.B.getClass();
        return new Bundle();
    }

    @Override // defpackage.g91
    public final String j() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // defpackage.g91
    public final String k() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // defpackage.g91
    public final boolean l() {
        return true;
    }

    @Override // defpackage.g91, vf0.f
    public final int y0() {
        return 203400000;
    }
}
