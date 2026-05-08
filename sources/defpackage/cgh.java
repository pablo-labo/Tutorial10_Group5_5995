package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.LocationSettingsStates;

/* JADX INFO: loaded from: classes2.dex */
public final class cgh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        Status status = null;
        LocationSettingsStates locationSettingsStates = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                status = (Status) SafeParcelReader.e(parcel, i, Status.CREATOR);
            } else if (c != 2) {
                SafeParcelReader.t(parcel, i);
            } else {
                locationSettingsStates = (LocationSettingsStates) SafeParcelReader.e(parcel, i, LocationSettingsStates.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new LocationSettingsResult(status, locationSettingsStates);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationSettingsResult[i];
    }
}
