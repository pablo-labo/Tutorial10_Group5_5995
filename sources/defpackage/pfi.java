package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes2.dex */
public final class pfi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        RootTelemetryConfiguration rootTelemetryConfiguration = null;
        int[] iArrD = null;
        int[] iArrD2 = null;
        boolean zL = false;
        boolean zL2 = false;
        int iO = 0;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    rootTelemetryConfiguration = (RootTelemetryConfiguration) SafeParcelReader.e(parcel, i, RootTelemetryConfiguration.CREATOR);
                    break;
                case 2:
                    zL = SafeParcelReader.l(parcel, i);
                    break;
                case 3:
                    zL2 = SafeParcelReader.l(parcel, i);
                    break;
                case 4:
                    iArrD = SafeParcelReader.d(parcel, i);
                    break;
                case 5:
                    iO = SafeParcelReader.o(parcel, i);
                    break;
                case 6:
                    iArrD2 = SafeParcelReader.d(parcel, i);
                    break;
                default:
                    SafeParcelReader.t(parcel, i);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new ConnectionTelemetryConfiguration(rootTelemetryConfiguration, zL, zL2, iArrD, iO, iArrD2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionTelemetryConfiguration[i];
    }
}
