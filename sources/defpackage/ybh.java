package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;

/* JADX INFO: loaded from: classes2.dex */
public final class ybh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        ConnectionResult connectionResult = null;
        int iO = 0;
        zav zavVar = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iO = SafeParcelReader.o(parcel, i);
            } else if (c == 2) {
                connectionResult = (ConnectionResult) SafeParcelReader.e(parcel, i, ConnectionResult.CREATOR);
            } else if (c != 3) {
                SafeParcelReader.t(parcel, i);
            } else {
                zavVar = (zav) SafeParcelReader.e(parcel, i, zav.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new zak(iO, connectionResult, zavVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zak[i];
    }
}
