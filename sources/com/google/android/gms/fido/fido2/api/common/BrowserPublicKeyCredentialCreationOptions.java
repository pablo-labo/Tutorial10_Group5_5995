package com.google.android.gms.fido.fido2.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.fib;
import defpackage.lii;
import defpackage.ojd;
import defpackage.xna;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class BrowserPublicKeyCredentialCreationOptions extends BrowserRequestOptions {
    public static final Parcelable.Creator<BrowserPublicKeyCredentialCreationOptions> CREATOR = new lii();
    public final PublicKeyCredentialCreationOptions a;
    public final Uri b;
    public final byte[] c;

    public BrowserPublicKeyCredentialCreationOptions(PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions, Uri uri, byte[] bArr) {
        fib.i(publicKeyCredentialCreationOptions);
        this.a = publicKeyCredentialCreationOptions;
        fib.i(uri);
        fib.a("origin scheme must be non-empty", uri.getScheme() != null);
        fib.a("origin authority must be non-empty", uri.getAuthority() != null);
        this.b = uri;
        fib.a("clientDataHash must be 32 bytes long", bArr == null || bArr.length == 32);
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BrowserPublicKeyCredentialCreationOptions)) {
            return false;
        }
        BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions = (BrowserPublicKeyCredentialCreationOptions) obj;
        return xna.a(this.a, browserPublicKeyCredentialCreationOptions.a) && xna.a(this.b, browserPublicKeyCredentialCreationOptions.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.s(parcel, 2, this.a, i, false);
        ojd.s(parcel, 3, this.b, i, false);
        ojd.m(parcel, 4, this.c, false);
        ojd.B(parcel, iA);
    }
}
