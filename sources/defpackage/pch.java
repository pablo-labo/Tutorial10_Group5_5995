package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.zat;

/* JADX INFO: loaded from: classes2.dex */
public final class pch implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        Account account = null;
        int iO = 0;
        int iO2 = 0;
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iO = SafeParcelReader.o(parcel, i);
            } else if (c == 2) {
                account = (Account) SafeParcelReader.e(parcel, i, Account.CREATOR);
            } else if (c == 3) {
                iO2 = SafeParcelReader.o(parcel, i);
            } else if (c != 4) {
                SafeParcelReader.t(parcel, i);
            } else {
                googleSignInAccount = (GoogleSignInAccount) SafeParcelReader.e(parcel, i, GoogleSignInAccount.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new zat(iO, account, iO2, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zat[i];
    }
}
