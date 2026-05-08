package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes2.dex */
public final class wji extends ja6 {
    @Override // defpackage.g91
    public final IInterface d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
        return iInterfaceQueryLocalInterface instanceof ali ? (ali) iInterfaceQueryLocalInterface : new ali(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
    }

    @Override // defpackage.g91
    public final Feature[] f() {
        return new Feature[]{efh.b, efh.a};
    }

    @Override // defpackage.g91
    public final Bundle g() {
        return l6.e("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.regular.START");
    }

    @Override // defpackage.g91
    public final String j() {
        return "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService";
    }

    @Override // defpackage.g91
    public final String k() {
        return "com.google.android.gms.fido.fido2.regular.START";
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
