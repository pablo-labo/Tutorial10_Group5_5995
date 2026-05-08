package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.zzr;

/* JADX INFO: loaded from: classes2.dex */
public final class hli implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        long jQ = -1;
        boolean zL = false;
        int iO = 0;
        int iO2 = 0;
        String strF = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                zL = SafeParcelReader.l(parcel, i);
            } else if (c == 2) {
                strF = SafeParcelReader.f(parcel, i);
            } else if (c == 3) {
                iO = SafeParcelReader.o(parcel, i);
            } else if (c == 4) {
                iO2 = SafeParcelReader.o(parcel, i);
            } else if (c != 5) {
                SafeParcelReader.t(parcel, i);
            } else {
                jQ = SafeParcelReader.q(parcel, i);
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new zzr(zL, strF, iO, iO2, jQ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzr[i];
    }
}
