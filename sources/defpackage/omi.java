package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.location.zzd;
import com.google.android.gms.location.LocationRequest;

/* JADX INFO: loaded from: classes2.dex */
public final class omi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        WorkSource workSource = new WorkSource();
        int iO = 102;
        long jQ = 3600000;
        long jQ2 = 600000;
        long jQ3 = 0;
        long jQ4 = Long.MAX_VALUE;
        long jQ5 = Long.MAX_VALUE;
        int iO2 = Integer.MAX_VALUE;
        float f = 0.0f;
        boolean zL = false;
        int iO3 = 0;
        int iO4 = 0;
        boolean zL2 = false;
        long jQ6 = -1;
        String strF = null;
        zzd zzdVar = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iO = SafeParcelReader.o(parcel, i);
                    break;
                case 2:
                    jQ = SafeParcelReader.q(parcel, i);
                    break;
                case 3:
                    jQ2 = SafeParcelReader.q(parcel, i);
                    break;
                case 4:
                default:
                    SafeParcelReader.t(parcel, i);
                    break;
                case 5:
                    jQ4 = SafeParcelReader.q(parcel, i);
                    break;
                case 6:
                    iO2 = SafeParcelReader.o(parcel, i);
                    break;
                case 7:
                    SafeParcelReader.v(parcel, i, 4);
                    f = parcel.readFloat();
                    break;
                case '\b':
                    jQ3 = SafeParcelReader.q(parcel, i);
                    break;
                case DatadogLogGenerator.CRASH /* 9 */:
                    zL = SafeParcelReader.l(parcel, i);
                    break;
                case '\n':
                    jQ5 = SafeParcelReader.q(parcel, i);
                    break;
                case 11:
                    jQ6 = SafeParcelReader.q(parcel, i);
                    break;
                case '\f':
                    iO3 = SafeParcelReader.o(parcel, i);
                    break;
                case '\r':
                    iO4 = SafeParcelReader.o(parcel, i);
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 14 */:
                    strF = SafeParcelReader.f(parcel, i);
                    break;
                case 15:
                    zL2 = SafeParcelReader.l(parcel, i);
                    break;
                case 16:
                    workSource = (WorkSource) SafeParcelReader.e(parcel, i, WorkSource.CREATOR);
                    break;
                case 17:
                    zzdVar = (zzd) SafeParcelReader.e(parcel, i, zzd.CREATOR);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new LocationRequest(iO, jQ, jQ2, jQ3, jQ4, jQ5, iO2, f, zL, jQ6, iO3, iO4, strF, zL2, workSource, zzdVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationRequest[i];
    }
}
