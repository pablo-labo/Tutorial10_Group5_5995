package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.LocationSettingsStates;

/* JADX INFO: loaded from: classes2.dex */
public final class jgh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        boolean zL = false;
        boolean zL2 = false;
        boolean zL3 = false;
        boolean zL4 = false;
        boolean zL5 = false;
        boolean zL6 = false;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    zL = SafeParcelReader.l(parcel, i);
                    break;
                case 2:
                    zL2 = SafeParcelReader.l(parcel, i);
                    break;
                case 3:
                    zL3 = SafeParcelReader.l(parcel, i);
                    break;
                case 4:
                    zL4 = SafeParcelReader.l(parcel, i);
                    break;
                case 5:
                    zL5 = SafeParcelReader.l(parcel, i);
                    break;
                case 6:
                    zL6 = SafeParcelReader.l(parcel, i);
                    break;
                default:
                    SafeParcelReader.t(parcel, i);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new LocationSettingsStates(zL, zL2, zL3, zL4, zL5, zL6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationSettingsStates[i];
    }
}
