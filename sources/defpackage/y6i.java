package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fido.fido2.api.common.zzh;

/* JADX INFO: loaded from: classes2.dex */
public final class y6i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        byte[] bArrC = null;
        boolean zL = false;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                zL = SafeParcelReader.l(parcel, i);
            } else if (c != 2) {
                SafeParcelReader.t(parcel, i);
            } else {
                bArrC = SafeParcelReader.c(parcel, i);
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new zzh(bArrC, zL);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzh[i];
    }
}
