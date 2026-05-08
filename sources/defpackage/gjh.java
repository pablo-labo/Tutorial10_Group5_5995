package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.measurement.internal.zzan;
import com.google.android.gms.measurement.internal.zzao;

/* JADX INFO: loaded from: classes2.dex */
public final class gjh implements Parcelable.Creator<zzao> {
    @Override // android.os.Parcelable.Creator
    public final zzao createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        String strF = null;
        zzan zzanVar = null;
        String strF2 = null;
        long jQ = 0;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 2) {
                strF = SafeParcelReader.f(parcel, i);
            } else if (c == 3) {
                zzanVar = (zzan) SafeParcelReader.e(parcel, i, zzan.CREATOR);
            } else if (c == 4) {
                strF2 = SafeParcelReader.f(parcel, i);
            } else if (c != 5) {
                SafeParcelReader.t(parcel, i);
            } else {
                jQ = SafeParcelReader.q(parcel, i);
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new zzao(strF, zzanVar, strF2, jQ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzao[] newArray(int i) {
        return new zzao[i];
    }
}
