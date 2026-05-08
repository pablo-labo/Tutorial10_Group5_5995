package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.zav;

/* JADX INFO: loaded from: classes2.dex */
public final class qch implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        int iO = 0;
        boolean zL = false;
        boolean zL2 = false;
        IBinder iBinderN = null;
        ConnectionResult connectionResult = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iO = SafeParcelReader.o(parcel, i);
            } else if (c == 2) {
                iBinderN = SafeParcelReader.n(parcel, i);
            } else if (c == 3) {
                connectionResult = (ConnectionResult) SafeParcelReader.e(parcel, i, ConnectionResult.CREATOR);
            } else if (c == 4) {
                zL = SafeParcelReader.l(parcel, i);
            } else if (c != 5) {
                SafeParcelReader.t(parcel, i);
            } else {
                zL2 = SafeParcelReader.l(parcel, i);
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new zav(iO, iBinderN, connectionResult, zL, zL2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zav[i];
    }
}
