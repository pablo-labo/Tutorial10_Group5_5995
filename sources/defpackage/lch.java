package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.response.SafeParcelResponse;
import com.google.android.gms.common.server.response.zan;

/* JADX INFO: loaded from: classes2.dex */
public final class lch implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        int iO = 0;
        Parcel parcel2 = null;
        zan zanVar = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iO = SafeParcelReader.o(parcel, i);
            } else if (c == 2) {
                int iS = SafeParcelReader.s(parcel, i);
                int iDataPosition = parcel.dataPosition();
                if (iS == 0) {
                    parcel2 = null;
                } else {
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.appendFrom(parcel, iDataPosition, iS);
                    parcel.setDataPosition(iDataPosition + iS);
                    parcel2 = parcelObtain;
                }
            } else if (c != 3) {
                SafeParcelReader.t(parcel, i);
            } else {
                zanVar = (zan) SafeParcelReader.e(parcel, i, zan.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new SafeParcelResponse(iO, parcel2, zanVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SafeParcelResponse[i];
    }
}
