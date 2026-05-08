package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.fib;
import defpackage.hjh;
import defpackage.ojd;
import defpackage.xna;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class PublicKeyCredentialUserEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialUserEntity> CREATOR = new hjh();
    public final byte[] a;
    public final String b;
    public final String c;
    public final String d;

    public PublicKeyCredentialUserEntity(String str, String str2, String str3, byte[] bArr) {
        fib.i(bArr);
        this.a = bArr;
        fib.i(str);
        this.b = str;
        this.c = str2;
        fib.i(str3);
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialUserEntity)) {
            return false;
        }
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) obj;
        return Arrays.equals(this.a, publicKeyCredentialUserEntity.a) && xna.a(this.b, publicKeyCredentialUserEntity.b) && xna.a(this.c, publicKeyCredentialUserEntity.c) && xna.a(this.d, publicKeyCredentialUserEntity.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.m(parcel, 2, this.a, false);
        ojd.t(parcel, 3, this.b, false);
        ojd.t(parcel, 4, this.c, false);
        ojd.t(parcel, 5, this.d, false);
        ojd.B(parcel, iA);
    }
}
