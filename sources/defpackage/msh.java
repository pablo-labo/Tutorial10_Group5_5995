package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.location.zzdd;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class msh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        LocationRequest locationRequest = null;
        ArrayList arrayListJ = null;
        String strF = null;
        String strF2 = null;
        boolean zL = false;
        boolean zL2 = false;
        boolean zL3 = false;
        boolean zL4 = false;
        long jQ = Long.MAX_VALUE;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                locationRequest = (LocationRequest) SafeParcelReader.e(parcel, i, LocationRequest.CREATOR);
            } else if (c != 5) {
                switch (c) {
                    case '\b':
                        zL = SafeParcelReader.l(parcel, i);
                        break;
                    case DatadogLogGenerator.CRASH /* 9 */:
                        zL2 = SafeParcelReader.l(parcel, i);
                        break;
                    case '\n':
                        strF = SafeParcelReader.f(parcel, i);
                        break;
                    case 11:
                        zL3 = SafeParcelReader.l(parcel, i);
                        break;
                    case '\f':
                        zL4 = SafeParcelReader.l(parcel, i);
                        break;
                    case '\r':
                        strF2 = SafeParcelReader.f(parcel, i);
                        break;
                    case ModuleDescriptor.MODULE_VERSION /* 14 */:
                        jQ = SafeParcelReader.q(parcel, i);
                        break;
                    default:
                        SafeParcelReader.t(parcel, i);
                        break;
                }
            } else {
                arrayListJ = SafeParcelReader.j(parcel, i, ClientIdentity.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new zzdd(locationRequest, arrayListJ, zL, zL2, strF, zL3, zL4, strF2, jQ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzdd[i];
    }
}
