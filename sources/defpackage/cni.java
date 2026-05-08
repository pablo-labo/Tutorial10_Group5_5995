package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class cni implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        ArrayList arrayListJ = null;
        boolean zL = false;
        boolean zL2 = false;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                arrayListJ = SafeParcelReader.j(parcel, i, LocationRequest.CREATOR);
            } else if (c == 2) {
                zL = SafeParcelReader.l(parcel, i);
            } else if (c != 3) {
                SafeParcelReader.t(parcel, i);
            } else {
                zL2 = SafeParcelReader.l(parcel, i);
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new LocationSettingsRequest(arrayListJ, zL, zL2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationSettingsRequest[i];
    }
}
