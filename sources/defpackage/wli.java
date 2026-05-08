package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.icing.zzm;
import com.google.android.gms.internal.icing.zzt;
import com.google.android.gms.internal.icing.zzu;

/* JADX INFO: loaded from: classes2.dex */
public final class wli implements Parcelable.Creator<zzt> {
    @Override // android.os.Parcelable.Creator
    public final zzt createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        zzm[] zzmVarArr = null;
        String strF4 = null;
        zzu zzuVar = null;
        boolean zL = false;
        boolean zL2 = false;
        int iO = 1;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 11) {
                strF4 = SafeParcelReader.f(parcel, i);
            } else if (c != '\f') {
                switch (c) {
                    case 1:
                        strF = SafeParcelReader.f(parcel, i);
                        break;
                    case 2:
                        strF2 = SafeParcelReader.f(parcel, i);
                        break;
                    case 3:
                        zL = SafeParcelReader.l(parcel, i);
                        break;
                    case 4:
                        iO = SafeParcelReader.o(parcel, i);
                        break;
                    case 5:
                        zL2 = SafeParcelReader.l(parcel, i);
                        break;
                    case 6:
                        strF3 = SafeParcelReader.f(parcel, i);
                        break;
                    case 7:
                        zzmVarArr = (zzm[]) SafeParcelReader.i(parcel, i, zzm.CREATOR);
                        break;
                    default:
                        SafeParcelReader.t(parcel, i);
                        break;
                }
            } else {
                zzuVar = (zzu) SafeParcelReader.e(parcel, i, zzu.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new zzt(strF, strF2, zL, iO, zL2, strF3, zzmVarArr, strF4, zzuVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzt[] newArray(int i) {
        return new zzt[i];
    }
}
