package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes2.dex */
public final class tfh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        PendingIntent pendingIntent = null;
        String strF = null;
        Integer numP = null;
        int iO = 0;
        int iO2 = 0;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iO = SafeParcelReader.o(parcel, i);
            } else if (c == 2) {
                iO2 = SafeParcelReader.o(parcel, i);
            } else if (c == 3) {
                pendingIntent = (PendingIntent) SafeParcelReader.e(parcel, i, PendingIntent.CREATOR);
            } else if (c == 4) {
                strF = SafeParcelReader.f(parcel, i);
            } else if (c != 5) {
                SafeParcelReader.t(parcel, i);
            } else {
                numP = SafeParcelReader.p(parcel, i);
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new ConnectionResult(iO, iO2, pendingIntent, strF, numP);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionResult[i];
    }
}
