package com.google.android.gms.auth.api.identity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import defpackage.fib;
import defpackage.ojd;
import defpackage.xeh;
import defpackage.xna;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class SignInCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignInCredential> CREATOR = new xeh();
    public final String V;
    public final String W;
    public final PublicKeyCredential X;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Uri e;
    public final String f;

    public SignInCredential(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, PublicKeyCredential publicKeyCredential) {
        fib.f(str);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = uri;
        this.f = str5;
        this.V = str6;
        this.W = str7;
        this.X = publicKeyCredential;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInCredential)) {
            return false;
        }
        SignInCredential signInCredential = (SignInCredential) obj;
        return xna.a(this.a, signInCredential.a) && xna.a(this.b, signInCredential.b) && xna.a(this.c, signInCredential.c) && xna.a(this.d, signInCredential.d) && xna.a(this.e, signInCredential.e) && xna.a(this.f, signInCredential.f) && xna.a(this.V, signInCredential.V) && xna.a(this.W, signInCredential.W) && xna.a(this.X, signInCredential.X);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.V, this.W, this.X});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.t(parcel, 1, this.a, false);
        ojd.t(parcel, 2, this.b, false);
        ojd.t(parcel, 3, this.c, false);
        ojd.t(parcel, 4, this.d, false);
        ojd.s(parcel, 5, this.e, i, false);
        ojd.t(parcel, 6, this.f, false);
        ojd.t(parcel, 7, this.V, false);
        ojd.t(parcel, 8, this.W, false);
        ojd.s(parcel, 9, this.X, i, false);
        ojd.B(parcel, iA);
    }
}
