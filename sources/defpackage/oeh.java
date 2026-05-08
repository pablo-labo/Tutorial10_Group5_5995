package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oeh extends gdh implements reh {
    @Override // defpackage.gdh
    public final boolean c(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 101:
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) rdh.a(parcel, GoogleSignInAccount.CREATOR);
                Status status = (Status) rdh.a(parcel, Status.CREATOR);
                rdh.b(parcel);
                E(googleSignInAccount, status);
                break;
            case 102:
                Status status2 = (Status) rdh.a(parcel, Status.CREATOR);
                rdh.b(parcel);
                M0(status2);
                break;
            case 103:
                Status status3 = (Status) rdh.a(parcel, Status.CREATOR);
                rdh.b(parcel);
                H0(status3);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
