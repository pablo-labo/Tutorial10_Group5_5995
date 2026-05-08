package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.location.zzd;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class suh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        jth jthVar = oth.b;
        List listJ = rth.e;
        int iO = 0;
        int iO2 = 0;
        int iO3 = 0;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        zzd zzdVar = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iO = SafeParcelReader.o(parcel, i);
                    break;
                case 2:
                    iO2 = SafeParcelReader.o(parcel, i);
                    break;
                case 3:
                    strF = SafeParcelReader.f(parcel, i);
                    break;
                case 4:
                    strF2 = SafeParcelReader.f(parcel, i);
                    break;
                case 5:
                    iO3 = SafeParcelReader.o(parcel, i);
                    break;
                case 6:
                    strF3 = SafeParcelReader.f(parcel, i);
                    break;
                case 7:
                    zzdVar = (zzd) SafeParcelReader.e(parcel, i, zzd.CREATOR);
                    break;
                case '\b':
                    listJ = SafeParcelReader.j(parcel, i, Feature.CREATOR);
                    break;
                default:
                    SafeParcelReader.t(parcel, i);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new zzd(iO, iO2, strF, strF2, strF3, iO3, listJ, zzdVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzd[i];
    }
}
