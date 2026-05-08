package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ihi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        int iO = 0;
        boolean zL = false;
        boolean zL2 = false;
        String strF = null;
        Long lR = null;
        ArrayList<String> arrayListH = null;
        String strF2 = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iO = SafeParcelReader.o(parcel, i);
                    break;
                case 2:
                    strF = SafeParcelReader.f(parcel, i);
                    break;
                case 3:
                    lR = SafeParcelReader.r(parcel, i);
                    break;
                case 4:
                    zL = SafeParcelReader.l(parcel, i);
                    break;
                case 5:
                    zL2 = SafeParcelReader.l(parcel, i);
                    break;
                case 6:
                    arrayListH = SafeParcelReader.h(parcel, i);
                    break;
                case 7:
                    strF2 = SafeParcelReader.f(parcel, i);
                    break;
                default:
                    SafeParcelReader.t(parcel, i);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new TokenData(iO, strF, lR, zL, zL2, arrayListH, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new TokenData[i];
    }
}
