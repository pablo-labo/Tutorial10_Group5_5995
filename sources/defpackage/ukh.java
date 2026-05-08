package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes2.dex */
public final class ukh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        int iO = 0;
        int iO2 = 0;
        int iO3 = 0;
        PendingIntent pendingIntent = null;
        Bundle bundleB = null;
        byte[] bArrC = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iO2 = SafeParcelReader.o(parcel, i);
            } else if (c == 2) {
                pendingIntent = (PendingIntent) SafeParcelReader.e(parcel, i, PendingIntent.CREATOR);
            } else if (c == 3) {
                iO3 = SafeParcelReader.o(parcel, i);
            } else if (c == 4) {
                bundleB = SafeParcelReader.b(parcel, i);
            } else if (c == 5) {
                bArrC = SafeParcelReader.c(parcel, i);
            } else if (c != 1000) {
                SafeParcelReader.t(parcel, i);
            } else {
                iO = SafeParcelReader.o(parcel, i);
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new ProxyResponse(iO, iO2, pendingIntent, iO3, bundleB, bArrC);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ProxyResponse[i];
    }
}
