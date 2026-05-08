package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.cjh;
import defpackage.fib;
import defpackage.ojd;
import defpackage.xna;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class PublicKeyCredentialRpEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialRpEntity> CREATOR = new cjh();
    public final String a;
    public final String b;
    public final String c;

    public PublicKeyCredentialRpEntity(String str, String str2, String str3) {
        fib.i(str);
        this.a = str;
        fib.i(str2);
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialRpEntity)) {
            return false;
        }
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) obj;
        return xna.a(this.a, publicKeyCredentialRpEntity.a) && xna.a(this.b, publicKeyCredentialRpEntity.b) && xna.a(this.c, publicKeyCredentialRpEntity.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.t(parcel, 2, this.a, false);
        ojd.t(parcel, 3, this.b, false);
        ojd.t(parcel, 4, this.c, false);
        ojd.B(parcel, iA);
    }
}
