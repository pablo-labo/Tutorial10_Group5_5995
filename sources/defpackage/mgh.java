package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.zzp;
import com.google.android.gms.common.zzr;
import com.google.android.gms.common.zzt;

/* JADX INFO: loaded from: classes2.dex */
public final class mgh extends ffh implements ygh {
    @Override // defpackage.ygh
    public final zzr Q0(zzp zzpVar) {
        Parcel parcelE = e();
        int i = koh.a;
        parcelE.writeInt(1);
        zzpVar.writeToParcel(parcelE, 0);
        Parcel parcelC = c(parcelE, 6);
        zzr zzrVar = (zzr) koh.a(parcelC, zzr.CREATOR);
        parcelC.recycle();
        return zzrVar;
    }

    @Override // defpackage.ygh
    public final boolean Y(zzt zztVar, vna vnaVar) {
        Parcel parcelE = e();
        int i = koh.a;
        parcelE.writeInt(1);
        zztVar.writeToParcel(parcelE, 0);
        koh.b(parcelE, vnaVar);
        Parcel parcelC = c(parcelE, 5);
        boolean z = parcelC.readInt() != 0;
        parcelC.recycle();
        return z;
    }

    @Override // defpackage.ygh
    public final boolean zzg() {
        Parcel parcelC = c(e(), 7);
        int i = koh.a;
        boolean z = parcelC.readInt() != 0;
        parcelC.recycle();
        return z;
    }
}
