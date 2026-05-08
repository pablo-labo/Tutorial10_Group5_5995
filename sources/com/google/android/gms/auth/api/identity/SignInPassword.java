package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bfh;
import defpackage.fib;
import defpackage.ojd;
import defpackage.xna;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class SignInPassword extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignInPassword> CREATOR = new bfh();
    public final String a;
    public final String b;

    public SignInPassword(String str, String str2) {
        fib.j(str, "Account identifier cannot be null");
        String strTrim = str.trim();
        fib.g(strTrim, "Account identifier cannot be empty");
        this.a = strTrim;
        fib.f(str2);
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInPassword)) {
            return false;
        }
        SignInPassword signInPassword = (SignInPassword) obj;
        return xna.a(this.a, signInPassword.a) && xna.a(this.b, signInPassword.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.t(parcel, 1, this.a, false);
        ojd.t(parcel, 2, this.b, false);
        ojd.B(parcel, iA);
    }
}
