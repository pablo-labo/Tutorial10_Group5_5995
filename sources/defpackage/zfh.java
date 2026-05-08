package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.AccountChangeEvent;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes2.dex */
public final class zfh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        int iO = 0;
        int iO2 = 0;
        int iO3 = 0;
        long jQ = 0;
        String strF = null;
        String strF2 = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iO = SafeParcelReader.o(parcel, i);
                    break;
                case 2:
                    jQ = SafeParcelReader.q(parcel, i);
                    break;
                case 3:
                    strF = SafeParcelReader.f(parcel, i);
                    break;
                case 4:
                    iO2 = SafeParcelReader.o(parcel, i);
                    break;
                case 5:
                    iO3 = SafeParcelReader.o(parcel, i);
                    break;
                case 6:
                    strF2 = SafeParcelReader.f(parcel, i);
                    break;
                default:
                    SafeParcelReader.t(parcel, i);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new AccountChangeEvent(iO, jQ, strF, iO2, iO3, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AccountChangeEvent[i];
    }
}
