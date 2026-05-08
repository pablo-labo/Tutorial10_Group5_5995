package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes2.dex */
public final class ogh extends ja6 {
    @Override // defpackage.g91
    public final IInterface d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.u2f.internal.zeroparty.IU2fZeroPartyService");
        return iInterfaceQueryLocalInterface instanceof ani ? (ani) iInterfaceQueryLocalInterface : new ani(iBinder, "com.google.android.gms.fido.u2f.internal.zeroparty.IU2fZeroPartyService");
    }

    @Override // defpackage.g91
    public final Bundle g() {
        return l6.e("ACTION_START_SERVICE", "com.google.android.gms.fido.u2f.zeroparty.START");
    }

    @Override // defpackage.g91
    public final String j() {
        return "com.google.android.gms.fido.u2f.internal.zeroparty.IU2fZeroPartyService";
    }

    @Override // defpackage.g91
    public final String k() {
        return "com.google.android.gms.fido.u2f.zeroparty.START";
    }

    @Override // defpackage.g91
    public final boolean n() {
        return true;
    }

    @Override // defpackage.g91, vf0.f
    public final int y0() {
        return 13000000;
    }
}
