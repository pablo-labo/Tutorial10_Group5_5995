package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class gbh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        ArrayList arrayListJ = null;
        ArrayList arrayListJ2 = null;
        Account account = null;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        int iO = 0;
        boolean zL = false;
        boolean zL2 = false;
        boolean zL3 = false;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iO = SafeParcelReader.o(parcel, i);
                    break;
                case 2:
                    arrayListJ2 = SafeParcelReader.j(parcel, i, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) SafeParcelReader.e(parcel, i, Account.CREATOR);
                    break;
                case 4:
                    zL = SafeParcelReader.l(parcel, i);
                    break;
                case 5:
                    zL2 = SafeParcelReader.l(parcel, i);
                    break;
                case 6:
                    zL3 = SafeParcelReader.l(parcel, i);
                    break;
                case 7:
                    strF = SafeParcelReader.f(parcel, i);
                    break;
                case '\b':
                    strF2 = SafeParcelReader.f(parcel, i);
                    break;
                case DatadogLogGenerator.CRASH /* 9 */:
                    arrayListJ = SafeParcelReader.j(parcel, i, GoogleSignInOptionsExtensionParcelable.CREATOR);
                    break;
                case '\n':
                    strF3 = SafeParcelReader.f(parcel, i);
                    break;
                default:
                    SafeParcelReader.t(parcel, i);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new GoogleSignInOptions(iO, arrayListJ2, account, zL, zL2, zL3, strF, strF2, GoogleSignInOptions.R0(arrayListJ), strF3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInOptions[i];
    }
}
