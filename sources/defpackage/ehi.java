package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes2.dex */
public final class ehi extends ja6 {
    @Override // defpackage.g91
    public final /* bridge */ /* synthetic */ IInterface d(IBinder iBinder) {
        iBinder.getClass();
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
        return iInterfaceQueryLocalInterface instanceof exh ? (exh) iInterfaceQueryLocalInterface : new exh(iBinder);
    }

    @Override // defpackage.g91
    public final Feature[] f() {
        Feature[] featureArr = huh.c;
        featureArr.getClass();
        return featureArr;
    }

    @Override // defpackage.g91
    public final String j() {
        return "com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService";
    }

    @Override // defpackage.g91
    public final String k() {
        return "com.google.android.gms.recaptchabase.service.START";
    }

    @Override // defpackage.g91
    public final boolean l() {
        return true;
    }

    @Override // defpackage.g91
    public final boolean n() {
        return false;
    }

    @Override // defpackage.g91, vf0.f
    public final int y0() {
        return 17895000;
    }
}
