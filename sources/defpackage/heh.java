package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes2.dex */
public final class heh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        int iO = 0;
        boolean zL = false;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
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
                    strF3 = SafeParcelReader.f(parcel, i);
                    break;
                case 4:
                    strF4 = SafeParcelReader.f(parcel, i);
                    break;
                case 5:
                    zL = SafeParcelReader.l(parcel, i);
                    break;
                case 6:
                    iO = SafeParcelReader.o(parcel, i);
                    break;
                default:
                    SafeParcelReader.t(parcel, i);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new GetSignInIntentRequest(strF, strF2, strF3, iO, zL, strF4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetSignInIntentRequest[i];
    }
}
