package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b0;
import defpackage.fib;
import defpackage.ojd;
import defpackage.xna;
import defpackage.yih;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class PublicKeyCredentialRequestOptions extends RequestOptions {
    public static final Parcelable.Creator<PublicKeyCredentialRequestOptions> CREATOR = new yih();
    public final zzay V;
    public final AuthenticationExtensions W;
    public final Long X;
    public final byte[] a;
    public final Double b;
    public final String c;
    public final List d;
    public final Integer e;
    public final TokenBinding f;

    public PublicKeyCredentialRequestOptions(byte[] bArr, Double d, String str, ArrayList arrayList, Integer num, TokenBinding tokenBinding, String str2, AuthenticationExtensions authenticationExtensions, Long l) {
        fib.i(bArr);
        this.a = bArr;
        this.b = d;
        fib.i(str);
        this.c = str;
        this.d = arrayList;
        this.e = num;
        this.f = tokenBinding;
        this.X = l;
        if (str2 != null) {
            try {
                this.V = zzay.a(str2);
            } catch (zzax e) {
                b0.s(e);
                throw null;
            }
        } else {
            this.V = null;
        }
        this.W = authenticationExtensions;
    }

    public final boolean equals(Object obj) {
        List list;
        if (!(obj instanceof PublicKeyCredentialRequestOptions)) {
            return false;
        }
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) obj;
        List list2 = publicKeyCredentialRequestOptions.d;
        return Arrays.equals(this.a, publicKeyCredentialRequestOptions.a) && xna.a(this.b, publicKeyCredentialRequestOptions.b) && xna.a(this.c, publicKeyCredentialRequestOptions.c) && (((list = this.d) == null && list2 == null) || (list != null && list2 != null && list.containsAll(list2) && list2.containsAll(list))) && xna.a(this.e, publicKeyCredentialRequestOptions.e) && xna.a(this.f, publicKeyCredentialRequestOptions.f) && xna.a(this.V, publicKeyCredentialRequestOptions.V) && xna.a(this.W, publicKeyCredentialRequestOptions.W) && xna.a(this.X, publicKeyCredentialRequestOptions.X);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), this.b, this.c, this.d, this.e, this.f, this.V, this.W, this.X});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.m(parcel, 2, this.a, false);
        ojd.n(parcel, 3, this.b);
        ojd.t(parcel, 4, this.c, false);
        ojd.x(parcel, 5, this.d, false);
        ojd.q(parcel, 6, this.e);
        ojd.s(parcel, 7, this.f, i, false);
        zzay zzayVar = this.V;
        ojd.t(parcel, 8, zzayVar == null ? null : zzayVar.toString(), false);
        ojd.s(parcel, 9, this.W, i, false);
        ojd.r(parcel, 10, this.X);
        ojd.B(parcel, iA);
    }
}
