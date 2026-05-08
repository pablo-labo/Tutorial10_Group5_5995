package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.zzac;

/* JADX INFO: loaded from: classes2.dex */
public final class vgh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        int iO = 1;
        int iO2 = 1;
        long jQ = -1;
        long jQ2 = -1;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iO = SafeParcelReader.o(parcel, i);
            } else if (c == 2) {
                iO2 = SafeParcelReader.o(parcel, i);
            } else if (c == 3) {
                jQ = SafeParcelReader.q(parcel, i);
            } else if (c != 4) {
                SafeParcelReader.t(parcel, i);
            } else {
                jQ2 = SafeParcelReader.q(parcel, i);
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new zzac(iO, iO2, jQ, jQ2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzac[i];
    }
}
