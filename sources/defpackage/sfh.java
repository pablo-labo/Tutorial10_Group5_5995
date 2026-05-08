package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes2.dex */
public final class sfh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        int iO = 0;
        int iO2 = 0;
        String strF = null;
        byte[] bArrC = null;
        Bundle bundleB = null;
        long jQ = 0;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                strF = SafeParcelReader.f(parcel, i);
            } else if (c == 2) {
                iO2 = SafeParcelReader.o(parcel, i);
            } else if (c == 3) {
                jQ = SafeParcelReader.q(parcel, i);
            } else if (c == 4) {
                bArrC = SafeParcelReader.c(parcel, i);
            } else if (c == 5) {
                bundleB = SafeParcelReader.b(parcel, i);
            } else if (c != 1000) {
                SafeParcelReader.t(parcel, i);
            } else {
                iO = SafeParcelReader.o(parcel, i);
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new ProxyRequest(iO, strF, iO2, jQ, bArrC, bundleB);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ProxyRequest[i];
    }
}
