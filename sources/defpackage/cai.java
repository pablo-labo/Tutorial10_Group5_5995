package defpackage;

import android.os.Parcel;
import com.google.android.gms.internal.location.zzg;

/* JADX INFO: loaded from: classes2.dex */
public abstract class cai extends mkh implements ddi {
    public cai() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    @Override // defpackage.mkh
    public final boolean c(Parcel parcel, int i) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            zze();
            return true;
        }
        zzg zzgVar = (zzg) moh.a(parcel, zzg.CREATOR);
        moh.b(parcel);
        b1(zzgVar);
        return true;
    }
}
