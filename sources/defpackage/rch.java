package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.zax;

/* JADX INFO: loaded from: classes2.dex */
public final class rch implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        Scope[] scopeArr = null;
        int iO = 0;
        int iO2 = 0;
        int iO3 = 0;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iO = SafeParcelReader.o(parcel, i);
            } else if (c == 2) {
                iO2 = SafeParcelReader.o(parcel, i);
            } else if (c == 3) {
                iO3 = SafeParcelReader.o(parcel, i);
            } else if (c != 4) {
                SafeParcelReader.t(parcel, i);
            } else {
                scopeArr = (Scope[]) SafeParcelReader.i(parcel, i, Scope.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new zax(iO, iO2, iO3, scopeArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zax[i];
    }
}
