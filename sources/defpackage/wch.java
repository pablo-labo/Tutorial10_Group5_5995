package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wch extends gdh {
    @Override // defpackage.gdh
    public final boolean c(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) rdh.a(parcel, Status.CREATOR);
        BeginSignInResult beginSignInResult = (BeginSignInResult) rdh.a(parcel, BeginSignInResult.CREATOR);
        rdh.b(parcel);
        zte.f(status, beginSignInResult, ((jdh) this).a);
        return true;
    }
}
