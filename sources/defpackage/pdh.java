package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes2.dex */
public final class pdh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        String strF = "";
        GoogleSignInAccount googleSignInAccount = null;
        String strF2 = "";
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 4) {
                strF = SafeParcelReader.f(parcel, i);
            } else if (c == 7) {
                googleSignInAccount = (GoogleSignInAccount) SafeParcelReader.e(parcel, i, GoogleSignInAccount.CREATOR);
            } else if (c != '\b') {
                SafeParcelReader.t(parcel, i);
            } else {
                strF2 = SafeParcelReader.f(parcel, i);
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new SignInAccount(strF, googleSignInAccount, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInAccount[i];
    }
}
