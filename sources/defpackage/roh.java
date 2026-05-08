package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.zzb;

/* JADX INFO: loaded from: classes2.dex */
public final class roh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        long jQ = 0;
        long jQ2 = 0;
        boolean zL = false;
        boolean zL2 = false;
        WorkSource workSource = null;
        String strF = null;
        int[] iArrD = null;
        String strF2 = null;
        String strF3 = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    jQ = SafeParcelReader.q(parcel, i);
                    break;
                case 2:
                    zL = SafeParcelReader.l(parcel, i);
                    break;
                case 3:
                    workSource = (WorkSource) SafeParcelReader.e(parcel, i, WorkSource.CREATOR);
                    break;
                case 4:
                    strF = SafeParcelReader.f(parcel, i);
                    break;
                case 5:
                    iArrD = SafeParcelReader.d(parcel, i);
                    break;
                case 6:
                    zL2 = SafeParcelReader.l(parcel, i);
                    break;
                case 7:
                    strF2 = SafeParcelReader.f(parcel, i);
                    break;
                case '\b':
                    jQ2 = SafeParcelReader.q(parcel, i);
                    break;
                case DatadogLogGenerator.CRASH /* 9 */:
                    strF3 = SafeParcelReader.f(parcel, i);
                    break;
                default:
                    SafeParcelReader.t(parcel, i);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new zzb(jQ, zL, workSource, strF, iArrD, zL2, strF2, jQ2, strF3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzb[i];
    }
}
