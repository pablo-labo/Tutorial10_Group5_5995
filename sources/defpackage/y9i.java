package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;

/* JADX INFO: loaded from: classes2.dex */
public final class y9i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        byte[] bArrC = null;
        byte[] bArrC2 = null;
        byte[] bArrC3 = null;
        byte[] bArrC4 = null;
        byte[] bArrC5 = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 2) {
                bArrC = SafeParcelReader.c(parcel, i);
            } else if (c == 3) {
                bArrC2 = SafeParcelReader.c(parcel, i);
            } else if (c == 4) {
                bArrC3 = SafeParcelReader.c(parcel, i);
            } else if (c == 5) {
                bArrC4 = SafeParcelReader.c(parcel, i);
            } else if (c != 6) {
                SafeParcelReader.t(parcel, i);
            } else {
                bArrC5 = SafeParcelReader.c(parcel, i);
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new AuthenticatorAssertionResponse(bArrC, bArrC2, bArrC3, bArrC4, bArrC5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AuthenticatorAssertionResponse[i];
    }
}
