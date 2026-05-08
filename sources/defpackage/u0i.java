package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fido.fido2.api.common.zzf;

/* JADX INFO: loaded from: classes2.dex */
public final class u0i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        byte[] bArrC = null;
        byte[] bArrC2 = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                bArrC = SafeParcelReader.c(parcel, i);
            } else if (c != 2) {
                SafeParcelReader.t(parcel, i);
            } else {
                bArrC2 = SafeParcelReader.c(parcel, i);
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new zzf(bArrC, bArrC2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzf[i];
    }
}
