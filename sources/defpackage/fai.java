package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.location.zzd;
import com.google.android.gms.location.CurrentLocationRequest;

/* JADX INFO: loaded from: classes2.dex */
public final class fai implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        WorkSource workSource = new WorkSource();
        long jQ = Long.MAX_VALUE;
        long jQ2 = Long.MAX_VALUE;
        int iO = 0;
        boolean zL = false;
        int iO2 = 0;
        int iO3 = 102;
        String strF = null;
        zzd zzdVar = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    jQ = SafeParcelReader.q(parcel, i);
                    break;
                case 2:
                    iO = SafeParcelReader.o(parcel, i);
                    break;
                case 3:
                    iO3 = SafeParcelReader.o(parcel, i);
                    break;
                case 4:
                    jQ2 = SafeParcelReader.q(parcel, i);
                    break;
                case 5:
                    zL = SafeParcelReader.l(parcel, i);
                    break;
                case 6:
                    workSource = (WorkSource) SafeParcelReader.e(parcel, i, WorkSource.CREATOR);
                    break;
                case 7:
                    iO2 = SafeParcelReader.o(parcel, i);
                    break;
                case '\b':
                    strF = SafeParcelReader.f(parcel, i);
                    break;
                case DatadogLogGenerator.CRASH /* 9 */:
                    zzdVar = (zzd) SafeParcelReader.e(parcel, i, zzd.CREATOR);
                    break;
                default:
                    SafeParcelReader.t(parcel, i);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new CurrentLocationRequest(jQ, iO, iO3, jQ2, zL, iO2, strF, workSource, zzdVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CurrentLocationRequest[i];
    }
}
