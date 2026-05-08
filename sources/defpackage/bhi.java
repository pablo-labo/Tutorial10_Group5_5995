package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;

/* JADX INFO: loaded from: classes2.dex */
public final class bhi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        String strF = null;
        Boolean boolValueOf = null;
        String strF2 = null;
        String strF3 = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 2) {
                strF = SafeParcelReader.f(parcel, i);
            } else if (c == 3) {
                int iS = SafeParcelReader.s(parcel, i);
                if (iS == 0) {
                    boolValueOf = null;
                } else {
                    SafeParcelReader.w(parcel, iS, 4);
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
            } else if (c == 4) {
                strF2 = SafeParcelReader.f(parcel, i);
            } else if (c != 5) {
                SafeParcelReader.t(parcel, i);
            } else {
                strF3 = SafeParcelReader.f(parcel, i);
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new AuthenticatorSelectionCriteria(strF, boolValueOf, strF2, strF3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AuthenticatorSelectionCriteria[i];
    }
}
