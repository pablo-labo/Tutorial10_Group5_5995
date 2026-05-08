package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.fib;
import defpackage.ojd;
import defpackage.xna;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class BeginSignInRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BeginSignInRequest> CREATOR = new a();
    public final PasskeyJsonRequestOptions V;
    public final PasswordRequestOptions a;
    public final GoogleIdTokenRequestOptions b;
    public final String c;
    public final boolean d;
    public final int e;
    public final PasskeysRequestOptions f;

    public static final class GoogleIdTokenRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<GoogleIdTokenRequestOptions> CREATOR = new b();
        public final boolean V;
        public final boolean a;
        public final String b;
        public final String c;
        public final boolean d;
        public final String e;
        public final ArrayList f;

        public static final class a {
            public boolean a;
            public boolean b;

            public final GoogleIdTokenRequestOptions a() {
                return new GoogleIdTokenRequestOptions(this.a, null, null, this.b, null, null, false);
            }
        }

        public GoogleIdTokenRequestOptions(boolean z, String str, String str2, boolean z2, String str3, ArrayList arrayList, boolean z3) {
            boolean z4 = true;
            if (z2 && z3) {
                z4 = false;
            }
            fib.a("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z4);
            this.a = z;
            if (z) {
                fib.j(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.b = str;
            this.c = str2;
            this.d = z2;
            ArrayList arrayList2 = null;
            if (arrayList != null && !arrayList.isEmpty()) {
                arrayList2 = new ArrayList(arrayList);
                Collections.sort(arrayList2);
            }
            this.f = arrayList2;
            this.e = str3;
            this.V = z3;
        }

        public static a s0() {
            a aVar = new a();
            aVar.a = false;
            aVar.b = true;
            return aVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof GoogleIdTokenRequestOptions)) {
                return false;
            }
            GoogleIdTokenRequestOptions googleIdTokenRequestOptions = (GoogleIdTokenRequestOptions) obj;
            return this.a == googleIdTokenRequestOptions.a && xna.a(this.b, googleIdTokenRequestOptions.b) && xna.a(this.c, googleIdTokenRequestOptions.c) && this.d == googleIdTokenRequestOptions.d && xna.a(this.e, googleIdTokenRequestOptions.e) && xna.a(this.f, googleIdTokenRequestOptions.f) && this.V == googleIdTokenRequestOptions.V;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b, this.c, Boolean.valueOf(this.d), this.e, this.f, Boolean.valueOf(this.V)});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int iA = ojd.A(parcel, 20293);
            ojd.y(parcel, 1, 4);
            parcel.writeInt(this.a ? 1 : 0);
            ojd.t(parcel, 2, this.b, false);
            ojd.t(parcel, 3, this.c, false);
            ojd.y(parcel, 4, 4);
            parcel.writeInt(this.d ? 1 : 0);
            ojd.t(parcel, 5, this.e, false);
            ojd.v(parcel, 6, this.f);
            ojd.y(parcel, 7, 4);
            parcel.writeInt(this.V ? 1 : 0);
            ojd.B(parcel, iA);
        }
    }

    public static final class PasskeyJsonRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PasskeyJsonRequestOptions> CREATOR = new c();
        public final boolean a;
        public final String b;

        public PasskeyJsonRequestOptions(String str, boolean z) {
            if (z) {
                fib.i(str);
            }
            this.a = z;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasskeyJsonRequestOptions)) {
                return false;
            }
            PasskeyJsonRequestOptions passkeyJsonRequestOptions = (PasskeyJsonRequestOptions) obj;
            return this.a == passkeyJsonRequestOptions.a && xna.a(this.b, passkeyJsonRequestOptions.b);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int iA = ojd.A(parcel, 20293);
            ojd.y(parcel, 1, 4);
            parcel.writeInt(this.a ? 1 : 0);
            ojd.t(parcel, 2, this.b, false);
            ojd.B(parcel, iA);
        }
    }

    @Deprecated
    public static final class PasskeysRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PasskeysRequestOptions> CREATOR = new d();
        public final boolean a;
        public final byte[] b;
        public final String c;

        public PasskeysRequestOptions(boolean z, byte[] bArr, String str) {
            if (z) {
                fib.i(bArr);
                fib.i(str);
            }
            this.a = z;
            this.b = bArr;
            this.c = str;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x001c, code lost:
        
            r5 = r5.c;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean equals(java.lang.Object r5) {
            /*
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeysRequestOptions
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeysRequestOptions r5 = (com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeysRequestOptions) r5
                boolean r1 = r4.a
                boolean r3 = r5.a
                if (r1 != r3) goto L2b
                byte[] r1 = r4.b
                byte[] r3 = r5.b
                boolean r1 = java.util.Arrays.equals(r1, r3)
                if (r1 == 0) goto L2b
                java.lang.String r5 = r5.c
                java.lang.String r4 = r4.c
                if (r4 == r5) goto L2a
                if (r4 == 0) goto L2b
                boolean r4 = r4.equals(r5)
                if (r4 == 0) goto L2b
            L2a:
                return r0
            L2b:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeysRequestOptions.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            return Arrays.hashCode(this.b) + (Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.c}) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int iA = ojd.A(parcel, 20293);
            ojd.y(parcel, 1, 4);
            parcel.writeInt(this.a ? 1 : 0);
            ojd.m(parcel, 2, this.b, false);
            ojd.t(parcel, 3, this.c, false);
            ojd.B(parcel, iA);
        }
    }

    public static final class PasswordRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PasswordRequestOptions> CREATOR = new e();
        public final boolean a;

        public PasswordRequestOptions(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof PasswordRequestOptions) && this.a == ((PasswordRequestOptions) obj).a;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a)});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int iA = ojd.A(parcel, 20293);
            ojd.y(parcel, 1, 4);
            parcel.writeInt(this.a ? 1 : 0);
            ojd.B(parcel, iA);
        }
    }

    public BeginSignInRequest(PasswordRequestOptions passwordRequestOptions, GoogleIdTokenRequestOptions googleIdTokenRequestOptions, String str, boolean z, int i, PasskeysRequestOptions passkeysRequestOptions, PasskeyJsonRequestOptions passkeyJsonRequestOptions) {
        fib.i(passwordRequestOptions);
        this.a = passwordRequestOptions;
        fib.i(googleIdTokenRequestOptions);
        this.b = googleIdTokenRequestOptions;
        this.c = str;
        this.d = z;
        this.e = i;
        this.f = passkeysRequestOptions == null ? new PasskeysRequestOptions(false, null, null) : passkeysRequestOptions;
        this.V = passkeyJsonRequestOptions == null ? new PasskeyJsonRequestOptions(null, false) : passkeyJsonRequestOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BeginSignInRequest)) {
            return false;
        }
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) obj;
        return xna.a(this.a, beginSignInRequest.a) && xna.a(this.b, beginSignInRequest.b) && xna.a(this.f, beginSignInRequest.f) && xna.a(this.V, beginSignInRequest.V) && xna.a(this.c, beginSignInRequest.c) && this.d == beginSignInRequest.d && this.e == beginSignInRequest.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.f, this.V, this.c, Boolean.valueOf(this.d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.s(parcel, 1, this.a, i, false);
        ojd.s(parcel, 2, this.b, i, false);
        ojd.t(parcel, 3, this.c, false);
        ojd.y(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        ojd.y(parcel, 5, 4);
        parcel.writeInt(this.e);
        ojd.s(parcel, 6, this.f, i, false);
        ojd.s(parcel, 7, this.V, i, false);
        ojd.B(parcel, iA);
    }
}
