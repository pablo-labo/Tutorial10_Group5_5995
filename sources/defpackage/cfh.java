package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes2.dex */
public final class cfh extends ja6 {
    public final Bundle B;

    public cfh(Context context, Looper looper, w72 w72Var, y9h y9hVar, y9h y9hVar2) {
        super(context, looper, 223, w72Var, y9hVar, y9hVar2);
        this.B = new Bundle();
    }

    @Override // defpackage.g91
    public final IInterface d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
        return iInterfaceQueryLocalInterface instanceof xch ? (xch) iInterfaceQueryLocalInterface : new xch(iBinder, "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
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
        return "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService";
    }

    @Override // defpackage.g91
    public final String k() {
        return "com.google.android.gms.auth.api.identity.service.credentialsaving.START";
    }

    @Override // defpackage.g91
    public final boolean l() {
        return true;
    }

    @Override // defpackage.g91
    public final boolean n() {
        return true;
    }

    @Override // defpackage.g91, vf0.f
    public final int y0() {
        return 17895000;
    }
}
