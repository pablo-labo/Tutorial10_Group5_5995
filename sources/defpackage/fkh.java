package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.auth.zzax;

/* JADX INFO: loaded from: classes2.dex */
public final class fkh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        String strF = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                SafeParcelReader.o(parcel, i);
            } else if (c != 2) {
                SafeParcelReader.t(parcel, i);
            } else {
                strF = SafeParcelReader.f(parcel, i);
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new zzax(strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzax[i];
    }
}
