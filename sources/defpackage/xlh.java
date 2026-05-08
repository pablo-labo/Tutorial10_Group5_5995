package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class xlh extends ja6 {
    public final Bundle B;

    public xlh(Context context, Looper looper, w72 w72Var, az0 az0Var, y9h y9hVar, y9h y9hVar2) {
        super(context, looper, 16, w72Var, y9hVar, y9hVar2);
        if (az0Var != null) {
            throw null;
        }
        this.B = new Bundle();
    }

    @Override // defpackage.g91
    public final /* synthetic */ IInterface d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return iInterfaceQueryLocalInterface instanceof emh ? (emh) iInterfaceQueryLocalInterface : new emh(iBinder);
    }

    @Override // defpackage.g91
    public final Bundle g() {
        return this.B;
    }

    @Override // defpackage.g91
    public final String j() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // defpackage.g91
    public final String k() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // defpackage.g91
    public final boolean n() {
        return true;
    }

    @Override // defpackage.g91, vf0.f
    public final boolean t0() {
        w72 w72Var = this.y;
        Account account = w72Var.a;
        if (TextUtils.isEmpty(account != null ? account.name : null)) {
            return false;
        }
        if (((n9h) w72Var.d.get(zy0.a)) == null) {
            return !w72Var.b.isEmpty();
        }
        throw null;
    }

    @Override // defpackage.g91, vf0.f
    public final int y0() {
        return 12451000;
    }
}
