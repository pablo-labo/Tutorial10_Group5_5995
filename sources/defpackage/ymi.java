package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes2.dex */
public final class ymi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        int iO = 0;
        boolean zL = false;
        boolean zL2 = false;
        long jQ = 0;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iO = SafeParcelReader.o(parcel, i);
            } else if (c == 2) {
                zL = SafeParcelReader.l(parcel, i);
            } else if (c == 3) {
                jQ = SafeParcelReader.q(parcel, i);
            } else if (c != 4) {
                SafeParcelReader.t(parcel, i);
            } else {
                zL2 = SafeParcelReader.l(parcel, i);
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new DeviceMetaData(iO, zL, jQ, zL2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DeviceMetaData[i];
    }
}
