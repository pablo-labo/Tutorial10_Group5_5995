package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.appindexing.internal.zzc;

/* JADX INFO: loaded from: classes2.dex */
public final class ami implements Parcelable.Creator<zzc> {
    @Override // android.os.Parcelable.Creator
    public final zzc createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        int iO = 0;
        boolean zL = false;
        boolean zL2 = false;
        String strF = null;
        String strF2 = null;
        byte[] bArrC = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iO = SafeParcelReader.o(parcel, i);
                    break;
                case 2:
                    zL = SafeParcelReader.l(parcel, i);
                    break;
                case 3:
                    strF = SafeParcelReader.f(parcel, i);
                    break;
                case 4:
                    strF2 = SafeParcelReader.f(parcel, i);
                    break;
                case 5:
                    bArrC = SafeParcelReader.c(parcel, i);
                    break;
                case 6:
                    zL2 = SafeParcelReader.l(parcel, i);
                    break;
                default:
                    SafeParcelReader.t(parcel, i);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new zzc(iO, zL, strF, strF2, bArrC, zL2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzc[] newArray(int i) {
        return new zzc[i];
    }
}
