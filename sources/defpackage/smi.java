package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails;

/* JADX INFO: loaded from: classes2.dex */
public final class smi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        long jQ = 0;
        boolean zL = false;
        boolean zL2 = false;
        String strF = null;
        String strF2 = null;
        byte[] bArrC = null;
        byte[] bArrC2 = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    strF = SafeParcelReader.f(parcel, i);
                    break;
                case 2:
                    strF2 = SafeParcelReader.f(parcel, i);
                    break;
                case 3:
                    bArrC = SafeParcelReader.c(parcel, i);
                    break;
                case 4:
                    bArrC2 = SafeParcelReader.c(parcel, i);
                    break;
                case 5:
                    zL = SafeParcelReader.l(parcel, i);
                    break;
                case 6:
                    zL2 = SafeParcelReader.l(parcel, i);
                    break;
                case 7:
                    jQ = SafeParcelReader.q(parcel, i);
                    break;
                default:
                    SafeParcelReader.t(parcel, i);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new FidoCredentialDetails(strF, strF2, bArrC, bArrC2, zL, zL2, jQ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FidoCredentialDetails[i];
    }
}
