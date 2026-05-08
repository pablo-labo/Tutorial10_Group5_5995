package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fido.u2f.api.common.SignResponseData;

/* JADX INFO: loaded from: classes2.dex */
public final class rfi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        byte[] bArrC = null;
        String strF = null;
        byte[] bArrC2 = null;
        byte[] bArrC3 = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 2) {
                bArrC = SafeParcelReader.c(parcel, i);
            } else if (c == 3) {
                strF = SafeParcelReader.f(parcel, i);
            } else if (c == 4) {
                bArrC2 = SafeParcelReader.c(parcel, i);
            } else if (c != 5) {
                SafeParcelReader.t(parcel, i);
            } else {
                bArrC3 = SafeParcelReader.c(parcel, i);
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new SignResponseData(bArrC, strF, bArrC2, bArrC3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SignResponseData[i];
    }
}
