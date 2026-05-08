package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.icing.zzk;
import com.google.android.gms.internal.icing.zzt;

/* JADX INFO: loaded from: classes2.dex */
public final class mii implements Parcelable.Creator<zzk> {
    @Override // android.os.Parcelable.Creator
    public final zzk createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        String strF = null;
        byte[] bArrC = null;
        int iO = -1;
        zzt zztVar = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                strF = SafeParcelReader.f(parcel, i);
            } else if (c == 3) {
                zztVar = (zzt) SafeParcelReader.e(parcel, i, zzt.CREATOR);
            } else if (c == 4) {
                iO = SafeParcelReader.o(parcel, i);
            } else if (c != 5) {
                SafeParcelReader.t(parcel, i);
            } else {
                bArrC = SafeParcelReader.c(parcel, i);
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new zzk(strF, zztVar, iO, bArrC);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzk[] newArray(int i) {
        return new zzk[i];
    }
}
