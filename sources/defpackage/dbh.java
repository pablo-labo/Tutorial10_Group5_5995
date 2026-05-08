package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.converter.zac;

/* JADX INFO: loaded from: classes2.dex */
public final class dbh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        int iO = 0;
        String strF = null;
        int iO2 = 0;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iO = SafeParcelReader.o(parcel, i);
            } else if (c == 2) {
                strF = SafeParcelReader.f(parcel, i);
            } else if (c != 3) {
                SafeParcelReader.t(parcel, i);
            } else {
                iO2 = SafeParcelReader.o(parcel, i);
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new zac(iO, iO2, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zac[i];
    }
}
