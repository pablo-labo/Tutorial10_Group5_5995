package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bsh;
import defpackage.ojd;
import defpackage.xna;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class AuthenticationExtensions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticationExtensions> CREATOR = new bsh();
    public final zzu V;
    public final zzag W;
    public final GoogleThirdPartyPaymentExtension X;
    public final zzai Y;
    public final FidoAppIdExtension a;
    public final zzs b;
    public final UserVerificationMethodExtension c;
    public final zzz d;
    public final zzab e;
    public final zzad f;

    public AuthenticationExtensions(FidoAppIdExtension fidoAppIdExtension, zzs zzsVar, UserVerificationMethodExtension userVerificationMethodExtension, zzz zzzVar, zzab zzabVar, zzad zzadVar, zzu zzuVar, zzag zzagVar, GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension, zzai zzaiVar) {
        this.a = fidoAppIdExtension;
        this.c = userVerificationMethodExtension;
        this.b = zzsVar;
        this.d = zzzVar;
        this.e = zzabVar;
        this.f = zzadVar;
        this.V = zzuVar;
        this.W = zzagVar;
        this.X = googleThirdPartyPaymentExtension;
        this.Y = zzaiVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensions)) {
            return false;
        }
        AuthenticationExtensions authenticationExtensions = (AuthenticationExtensions) obj;
        return xna.a(this.a, authenticationExtensions.a) && xna.a(this.b, authenticationExtensions.b) && xna.a(this.c, authenticationExtensions.c) && xna.a(this.d, authenticationExtensions.d) && xna.a(this.e, authenticationExtensions.e) && xna.a(this.f, authenticationExtensions.f) && xna.a(this.V, authenticationExtensions.V) && xna.a(this.W, authenticationExtensions.W) && xna.a(this.X, authenticationExtensions.X) && xna.a(this.Y, authenticationExtensions.Y);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.V, this.W, this.X, this.Y});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.s(parcel, 2, this.a, i, false);
        ojd.s(parcel, 3, this.b, i, false);
        ojd.s(parcel, 4, this.c, i, false);
        ojd.s(parcel, 5, this.d, i, false);
        ojd.s(parcel, 6, this.e, i, false);
        ojd.s(parcel, 7, this.f, i, false);
        ojd.s(parcel, 8, this.V, i, false);
        ojd.s(parcel, 9, this.W, i, false);
        ojd.s(parcel, 10, this.X, i, false);
        ojd.s(parcel, 11, this.Y, i, false);
        ojd.B(parcel, iA);
    }
}
