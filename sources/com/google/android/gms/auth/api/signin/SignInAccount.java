package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.fib;
import defpackage.ojd;
import defpackage.pdh;

/* JADX INFO: loaded from: classes2.dex */
public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new pdh();

    @Deprecated
    public final String a;
    public final GoogleSignInAccount b;

    @Deprecated
    public final String c;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.b = googleSignInAccount;
        fib.g(str, "8.3 and 8.4 SDKs require non-null email");
        this.a = str;
        fib.g(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.t(parcel, 4, this.a, false);
        ojd.s(parcel, 7, this.b, i, false);
        ojd.t(parcel, 8, this.c, false);
        ojd.B(parcel, iA);
    }
}
