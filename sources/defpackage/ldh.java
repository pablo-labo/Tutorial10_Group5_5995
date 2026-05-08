package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import androidx.credentials.playservices.HiddenActivity;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import defpackage.ma6;
import defpackage.vf0;

/* JADX INFO: loaded from: classes2.dex */
public final class ldh extends ma6 {
    public static final vf0 l = new vf0("Auth.Api.Identity.SignIn.API", new idh(), new vf0.g());
    public final String k;

    public ldh(HiddenActivity hiddenActivity, zeh zehVar) {
        super(hiddenActivity, hiddenActivity, l, zehVar, ma6.a.c);
        this.k = odh.a();
    }

    public final SignInCredential f(Intent intent) throws ApiException {
        if (intent == null) {
            throw new ApiException(Status.V);
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("status");
        Status status = (Status) (byteArrayExtra == null ? null : pjd.a(byteArrayExtra, creator));
        if (status == null) {
            throw new ApiException(Status.X);
        }
        if (!status.s0()) {
            throw new ApiException(status);
        }
        Parcelable.Creator<SignInCredential> creator2 = SignInCredential.CREATOR;
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("sign_in_credential");
        SignInCredential signInCredential = (SignInCredential) (byteArrayExtra2 != null ? pjd.a(byteArrayExtra2, creator2) : null);
        if (signInCredential != null) {
            return signInCredential;
        }
        throw new ApiException(Status.V);
    }

    public ldh(Context context, zeh zehVar) {
        super(context, null, l, zehVar, ma6.a.c);
        this.k = odh.a();
    }
}
