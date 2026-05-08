package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes2.dex */
public final class luh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        String strF = null;
        ConnectionResult connectionResult = null;
        int iO = 0;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iO = SafeParcelReader.o(parcel, i);
            } else if (c == 2) {
                strF = SafeParcelReader.f(parcel, i);
            } else if (c == 3) {
                pendingIntent = (PendingIntent) SafeParcelReader.e(parcel, i, PendingIntent.CREATOR);
            } else if (c != 4) {
                SafeParcelReader.t(parcel, i);
            } else {
                connectionResult = (ConnectionResult) SafeParcelReader.e(parcel, i, ConnectionResult.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new Status(iO, strF, pendingIntent, connectionResult);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Status[i];
    }
}
