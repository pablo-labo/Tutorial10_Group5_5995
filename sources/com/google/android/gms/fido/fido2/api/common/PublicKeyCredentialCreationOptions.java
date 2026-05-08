package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import defpackage.b0;
import defpackage.fib;
import defpackage.mih;
import defpackage.ojd;
import defpackage.xna;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class PublicKeyCredentialCreationOptions extends RequestOptions {
    public static final Parcelable.Creator<PublicKeyCredentialCreationOptions> CREATOR = new mih();
    public final AuthenticatorSelectionCriteria V;
    public final Integer W;
    public final TokenBinding X;
    public final AttestationConveyancePreference Y;
    public final AuthenticationExtensions Z;
    public final PublicKeyCredentialRpEntity a;
    public final PublicKeyCredentialUserEntity b;
    public final byte[] c;
    public final List d;
    public final Double e;
    public final List f;

    public static final class a {
        public PublicKeyCredentialRpEntity a;
        public PublicKeyCredentialUserEntity b;
        public byte[] c;
        public ArrayList d;
        public Double e;
        public ArrayList f;
        public AuthenticatorSelectionCriteria g;
        public AttestationConveyancePreference h;
        public AuthenticationExtensions i;
    }

    public PublicKeyCredentialCreationOptions(PublicKeyCredentialRpEntity publicKeyCredentialRpEntity, PublicKeyCredentialUserEntity publicKeyCredentialUserEntity, byte[] bArr, List list, Double d, List list2, AuthenticatorSelectionCriteria authenticatorSelectionCriteria, Integer num, TokenBinding tokenBinding, String str, AuthenticationExtensions authenticationExtensions) {
        fib.i(publicKeyCredentialRpEntity);
        this.a = publicKeyCredentialRpEntity;
        fib.i(publicKeyCredentialUserEntity);
        this.b = publicKeyCredentialUserEntity;
        fib.i(bArr);
        this.c = bArr;
        fib.i(list);
        this.d = list;
        this.e = d;
        this.f = list2;
        this.V = authenticatorSelectionCriteria;
        this.W = num;
        this.X = tokenBinding;
        if (str != null) {
            try {
                this.Y = AttestationConveyancePreference.a(str);
            } catch (AttestationConveyancePreference.UnsupportedAttestationConveyancePreferenceException e) {
                b0.s(e);
                throw null;
            }
        } else {
            this.Y = null;
        }
        this.Z = authenticationExtensions;
    }

    public final boolean equals(Object obj) {
        List list;
        if (!(obj instanceof PublicKeyCredentialCreationOptions)) {
            return false;
        }
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) obj;
        List list2 = publicKeyCredentialCreationOptions.d;
        List list3 = publicKeyCredentialCreationOptions.f;
        if (xna.a(this.a, publicKeyCredentialCreationOptions.a) && xna.a(this.b, publicKeyCredentialCreationOptions.b) && Arrays.equals(this.c, publicKeyCredentialCreationOptions.c) && xna.a(this.e, publicKeyCredentialCreationOptions.e)) {
            List list4 = this.d;
            if (list4.containsAll(list2) && list2.containsAll(list4) && ((((list = this.f) == null && list3 == null) || (list != null && list3 != null && list.containsAll(list3) && list3.containsAll(list))) && xna.a(this.V, publicKeyCredentialCreationOptions.V) && xna.a(this.W, publicKeyCredentialCreationOptions.W) && xna.a(this.X, publicKeyCredentialCreationOptions.X) && xna.a(this.Y, publicKeyCredentialCreationOptions.Y) && xna.a(this.Z, publicKeyCredentialCreationOptions.Z))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(Arrays.hashCode(this.c)), this.d, this.e, this.f, this.V, this.W, this.X, this.Y, this.Z});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.s(parcel, 2, this.a, i, false);
        ojd.s(parcel, 3, this.b, i, false);
        ojd.m(parcel, 4, this.c, false);
        ojd.x(parcel, 5, this.d, false);
        ojd.n(parcel, 6, this.e);
        ojd.x(parcel, 7, this.f, false);
        ojd.s(parcel, 8, this.V, i, false);
        ojd.q(parcel, 9, this.W);
        ojd.s(parcel, 10, this.X, i, false);
        AttestationConveyancePreference attestationConveyancePreference = this.Y;
        ojd.t(parcel, 11, attestationConveyancePreference == null ? null : attestationConveyancePreference.toString(), false);
        ojd.s(parcel, 12, this.Z, i, false);
        ojd.B(parcel, iA);
    }
}
