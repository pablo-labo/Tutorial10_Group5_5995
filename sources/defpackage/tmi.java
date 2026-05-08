package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.icing.zzh;
import com.google.android.gms.internal.icing.zzi;
import com.google.android.gms.internal.icing.zzw;

/* JADX INFO: loaded from: classes2.dex */
public final class tmi implements Parcelable.Creator<zzw> {
    @Override // android.os.Parcelable.Creator
    public final zzw createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        zzi zziVar = null;
        String strF = null;
        zzh zzhVar = null;
        String strF2 = null;
        long jQ = 0;
        int iO = 0;
        boolean zL = false;
        int iO2 = 0;
        int iO3 = -1;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    zziVar = (zzi) SafeParcelReader.e(parcel, i, zzi.CREATOR);
                    break;
                case 2:
                    jQ = SafeParcelReader.q(parcel, i);
                    break;
                case 3:
                    iO = SafeParcelReader.o(parcel, i);
                    break;
                case 4:
                    strF = SafeParcelReader.f(parcel, i);
                    break;
                case 5:
                    zzhVar = (zzh) SafeParcelReader.e(parcel, i, zzh.CREATOR);
                    break;
                case 6:
                    zL = SafeParcelReader.l(parcel, i);
                    break;
                case 7:
                    iO3 = SafeParcelReader.o(parcel, i);
                    break;
                case '\b':
                    iO2 = SafeParcelReader.o(parcel, i);
                    break;
                case DatadogLogGenerator.CRASH /* 9 */:
                    strF2 = SafeParcelReader.f(parcel, i);
                    break;
                default:
                    SafeParcelReader.t(parcel, i);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new zzw(zziVar, jQ, iO, strF, zzhVar, zL, iO3, iO2, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzw[] newArray(int i) {
        return new zzw[i];
    }
}
