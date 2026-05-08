package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.zzac;

/* JADX INFO: loaded from: classes2.dex */
public final class dmi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        int iO = 1000;
        int iO2 = 1;
        int iO3 = 1;
        long jQ = 0;
        zzac[] zzacVarArr = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iO2 = SafeParcelReader.o(parcel, i);
                    break;
                case 2:
                    iO3 = SafeParcelReader.o(parcel, i);
                    break;
                case 3:
                    jQ = SafeParcelReader.q(parcel, i);
                    break;
                case 4:
                    iO = SafeParcelReader.o(parcel, i);
                    break;
                case 5:
                    zzacVarArr = (zzac[]) SafeParcelReader.i(parcel, i, zzac.CREATOR);
                    break;
                case 6:
                    SafeParcelReader.l(parcel, i);
                    break;
                default:
                    SafeParcelReader.t(parcel, i);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new LocationAvailability(iO, iO2, iO3, jQ, zzacVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationAvailability[i];
    }
}
