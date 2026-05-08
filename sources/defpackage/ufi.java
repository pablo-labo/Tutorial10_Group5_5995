package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.icing.zzi;

/* JADX INFO: loaded from: classes2.dex */
public final class ufi implements Parcelable.Creator<zzi> {
    @Override // android.os.Parcelable.Creator
    public final zzi createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                strF = SafeParcelReader.f(parcel, i);
            } else if (c == 2) {
                strF2 = SafeParcelReader.f(parcel, i);
            } else if (c != 3) {
                SafeParcelReader.t(parcel, i);
            } else {
                strF3 = SafeParcelReader.f(parcel, i);
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new zzi(strF, strF2, strF3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzi[] newArray(int i) {
        return new zzi[i];
    }
}
