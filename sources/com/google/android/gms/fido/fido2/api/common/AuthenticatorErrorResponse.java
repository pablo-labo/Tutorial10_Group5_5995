package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import defpackage.b0;
import defpackage.ojd;
import defpackage.qfi;
import defpackage.qih;
import defpackage.wtf;
import defpackage.xhh;
import defpackage.xna;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class AuthenticatorErrorResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorErrorResponse> CREATOR = new qfi();
    public final ErrorCode a;
    public final String b;
    public final int c;

    public AuthenticatorErrorResponse(int i, int i2, String str) {
        try {
            this.a = ErrorCode.c(i);
            this.b = str;
            this.c = i2;
        } catch (ErrorCode.UnsupportedErrorCodeException e) {
            b0.s(e);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorErrorResponse)) {
            return false;
        }
        AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) obj;
        return xna.a(this.a, authenticatorErrorResponse.a) && xna.a(this.b, authenticatorErrorResponse.b) && xna.a(Integer.valueOf(this.c), Integer.valueOf(authenticatorErrorResponse.c));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c)});
    }

    public final String toString() {
        qih qihVarF = wtf.f(this);
        String strValueOf = String.valueOf(this.a.a());
        xhh xhhVar = new xhh();
        qihVarF.c.c = xhhVar;
        qihVarF.c = xhhVar;
        xhhVar.b = strValueOf;
        xhhVar.a = "errorCode";
        String str = this.b;
        if (str != null) {
            qihVarF.a(str, "errorMessage");
        }
        return qihVarF.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        int iA2 = this.a.a();
        ojd.y(parcel, 2, 4);
        parcel.writeInt(iA2);
        ojd.t(parcel, 3, this.b, false);
        ojd.y(parcel, 4, 4);
        parcel.writeInt(this.c);
        ojd.B(parcel, iA);
    }
}
