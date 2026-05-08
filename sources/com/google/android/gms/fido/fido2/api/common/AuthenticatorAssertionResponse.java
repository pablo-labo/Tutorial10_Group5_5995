package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import defpackage.aqh;
import defpackage.fib;
import defpackage.iqh;
import defpackage.l6;
import defpackage.ojd;
import defpackage.pyd;
import defpackage.qih;
import defpackage.wtf;
import defpackage.y9i;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class AuthenticatorAssertionResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorAssertionResponse> CREATOR = new y9i();
    public final byte[] a;
    public final byte[] b;
    public final byte[] c;
    public final byte[] d;
    public final byte[] e;

    public AuthenticatorAssertionResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        fib.i(bArr);
        this.a = bArr;
        fib.i(bArr2);
        this.b = bArr2;
        fib.i(bArr3);
        this.c = bArr3;
        fib.i(bArr4);
        this.d = bArr4;
        this.e = bArr5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAssertionResponse)) {
            return false;
        }
        AuthenticatorAssertionResponse authenticatorAssertionResponse = (AuthenticatorAssertionResponse) obj;
        return Arrays.equals(this.a, authenticatorAssertionResponse.a) && Arrays.equals(this.b, authenticatorAssertionResponse.b) && Arrays.equals(this.c, authenticatorAssertionResponse.c) && Arrays.equals(this.d, authenticatorAssertionResponse.d) && Arrays.equals(this.e, authenticatorAssertionResponse.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), Integer.valueOf(Arrays.hashCode(this.b)), Integer.valueOf(Arrays.hashCode(this.c)), Integer.valueOf(Arrays.hashCode(this.d)), Integer.valueOf(Arrays.hashCode(this.e))});
    }

    public final JSONObject s0() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", pyd.p(this.b));
            jSONObject.put("authenticatorData", pyd.p(this.c));
            jSONObject.put("signature", pyd.p(this.d));
            byte[] bArr = this.e;
            if (bArr != null) {
                jSONObject.put("userHandle", Base64.encodeToString(bArr, 11));
            }
            return jSONObject;
        } catch (JSONException e) {
            l6.p("Error encoding AuthenticatorAssertionResponse to JSON object", e);
            return null;
        }
    }

    public final String toString() {
        qih qihVarF = wtf.f(this);
        aqh aqhVar = iqh.a;
        byte[] bArr = this.a;
        qihVarF.a(aqhVar.b(bArr.length, bArr), "keyHandle");
        byte[] bArr2 = this.b;
        qihVarF.a(aqhVar.b(bArr2.length, bArr2), "clientDataJSON");
        byte[] bArr3 = this.c;
        qihVarF.a(aqhVar.b(bArr3.length, bArr3), "authenticatorData");
        byte[] bArr4 = this.d;
        qihVarF.a(aqhVar.b(bArr4.length, bArr4), "signature");
        byte[] bArr5 = this.e;
        if (bArr5 != null) {
            qihVarF.a(aqhVar.b(bArr5.length, bArr5), "userHandle");
        }
        return qihVarF.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.m(parcel, 2, this.a, false);
        ojd.m(parcel, 3, this.b, false);
        ojd.m(parcel, 4, this.c, false);
        ojd.m(parcel, 5, this.d, false);
        ojd.m(parcel, 6, this.e, false);
        ojd.B(parcel, iA);
    }
}
