package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.u2f.api.common.KeyHandle;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class puh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        byte[] bArrC = null;
        ArrayList arrayListJ = null;
        int iO = 0;
        String strF = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iO = SafeParcelReader.o(parcel, i);
            } else if (c == 2) {
                bArrC = SafeParcelReader.c(parcel, i);
            } else if (c == 3) {
                strF = SafeParcelReader.f(parcel, i);
            } else if (c != 4) {
                SafeParcelReader.t(parcel, i);
            } else {
                arrayListJ = SafeParcelReader.j(parcel, i, Transport.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new KeyHandle(iO, bArrC, strF, arrayListJ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new KeyHandle[i];
    }
}
