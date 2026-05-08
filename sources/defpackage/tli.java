package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.zzt;

/* JADX INFO: loaded from: classes2.dex */
public final class tli implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        boolean zL = false;
        String strF = null;
        IBinder iBinderN = null;
        boolean zL2 = false;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                strF = SafeParcelReader.f(parcel, i);
            } else if (c == 2) {
                iBinderN = SafeParcelReader.n(parcel, i);
            } else if (c == 3) {
                zL = SafeParcelReader.l(parcel, i);
            } else if (c != 4) {
                SafeParcelReader.t(parcel, i);
            } else {
                zL2 = SafeParcelReader.l(parcel, i);
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new zzt(strF, iBinderN, zL, zL2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzt[i];
    }
}
