package defpackage;

import android.os.Parcel;
import defpackage.tn6;

/* JADX INFO: loaded from: classes2.dex */
public final class uli extends ffh implements jmi {
    @Override // defpackage.jmi
    public final tn6 zzd() {
        Parcel parcelC = c(e(), 1);
        tn6 tn6VarE = tn6.a.e(parcelC.readStrongBinder());
        parcelC.recycle();
        return tn6VarE;
    }

    @Override // defpackage.jmi
    public final int zze() {
        Parcel parcelC = c(e(), 2);
        int i = parcelC.readInt();
        parcelC.recycle();
        return i;
    }
}
