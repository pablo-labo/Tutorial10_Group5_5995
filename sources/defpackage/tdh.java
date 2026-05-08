package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class tdh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        boolean zL = false;
        boolean zL2 = false;
        boolean zL3 = false;
        ArrayList arrayListJ = null;
        String strF = null;
        Account account = null;
        String strF2 = null;
        String strF3 = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    arrayListJ = SafeParcelReader.j(parcel, i, Scope.CREATOR);
                    break;
                case 2:
                    strF = SafeParcelReader.f(parcel, i);
                    break;
                case 3:
                    zL = SafeParcelReader.l(parcel, i);
                    break;
                case 4:
                    zL2 = SafeParcelReader.l(parcel, i);
                    break;
                case 5:
                    account = (Account) SafeParcelReader.e(parcel, i, Account.CREATOR);
                    break;
                case 6:
                    strF2 = SafeParcelReader.f(parcel, i);
                    break;
                case 7:
                    strF3 = SafeParcelReader.f(parcel, i);
                    break;
                case '\b':
                    zL3 = SafeParcelReader.l(parcel, i);
                    break;
                default:
                    SafeParcelReader.t(parcel, i);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new AuthorizationRequest(arrayListJ, strF, zL, zL2, account, strF2, strF3, zL3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AuthorizationRequest[i];
    }
}
