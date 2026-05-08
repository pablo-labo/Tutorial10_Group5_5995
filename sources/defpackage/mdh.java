package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes2.dex */
public final class mdh extends ja6 {
    public final Bundle B;

    public mdh(Context context, Looper looper, w72 w72Var, y9h y9hVar, y9h y9hVar2) {
        super(context, looper, 212, w72Var, y9hVar, y9hVar2);
        this.B = new Bundle();
    }

    @Override // defpackage.g91
    public final IInterface d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof adh ? (adh) iInterfaceQueryLocalInterface : new adh(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
    }

    @Override // defpackage.g91
    public final Feature[] f() {
        return ndh.d;
    }

    @Override // defpackage.g91
    public final Bundle g() {
        return this.B;
    }

    @Override // defpackage.g91
    public final String j() {
        return "com.google.android.gms.auth.api.identity.internal.ISignInService";
    }

    @Override // defpackage.g91
    public final String k() {
        return "com.google.android.gms.auth.api.identity.service.signin.START";
    }

    @Override // defpackage.g91
    public final boolean l() {
        return true;
    }

    @Override // defpackage.g91, vf0.f
    public final int y0() {
        return 17895000;
    }
}
