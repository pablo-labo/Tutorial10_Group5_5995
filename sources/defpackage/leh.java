package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import defpackage.xy0;

/* JADX INFO: loaded from: classes2.dex */
public final class leh extends ja6 {
    public final xy0.a B;

    public leh(Context context, Looper looper, w72 w72Var, xy0.a aVar, y9h y9hVar, y9h y9hVar2) {
        super(context, looper, 68, w72Var, y9hVar, y9hVar2);
        aVar = aVar == null ? xy0.a.c : aVar;
        xy0.a.C0477a c0477a = new xy0.a.C0477a();
        c0477a.a = Boolean.FALSE;
        xy0.a aVar2 = xy0.a.c;
        aVar.getClass();
        c0477a.a = Boolean.valueOf(aVar.a);
        c0477a.b = aVar.b;
        c0477a.b = odh.a();
        this.B = new xy0.a(c0477a);
    }

    @Override // defpackage.g91
    public final IInterface d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return iInterfaceQueryLocalInterface instanceof weh ? (weh) iInterfaceQueryLocalInterface : new weh(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
    }

    @Override // defpackage.g91
    public final Bundle g() {
        xy0.a aVar = this.B;
        aVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", aVar.a);
        bundle.putString("log_session_id", aVar.b);
        return bundle;
    }

    @Override // defpackage.g91
    public final String j() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // defpackage.g91
    public final String k() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    @Override // defpackage.g91, vf0.f
    public final int y0() {
        return 12800000;
    }
}
