package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;
import defpackage.b0;
import defpackage.fib;
import defpackage.ojd;
import defpackage.wih;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class PublicKeyCredentialParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialParameters> CREATOR = new wih();
    public final PublicKeyCredentialType a;
    public final COSEAlgorithmIdentifier b;

    public PublicKeyCredentialParameters(String str, int i) {
        fib.i(str);
        try {
            this.a = PublicKeyCredentialType.a(str);
            try {
                this.b = COSEAlgorithmIdentifier.a(i);
            } catch (COSEAlgorithmIdentifier.UnsupportedAlgorithmIdentifierException e) {
                b0.s(e);
                throw null;
            }
        } catch (PublicKeyCredentialType.UnsupportedPublicKeyCredTypeException e2) {
            b0.s(e2);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialParameters)) {
            return false;
        }
        PublicKeyCredentialParameters publicKeyCredentialParameters = (PublicKeyCredentialParameters) obj;
        return this.a.equals(publicKeyCredentialParameters.a) && this.b.equals(publicKeyCredentialParameters.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.t(parcel, 2, this.a.toString(), false);
        ojd.q(parcel, 3, Integer.valueOf(this.b.a.a()));
        ojd.B(parcel, iA);
    }
}
