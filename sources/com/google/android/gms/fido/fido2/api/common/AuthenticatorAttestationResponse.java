package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aqh;
import defpackage.fib;
import defpackage.iqh;
import defpackage.ojd;
import defpackage.qih;
import defpackage.wtf;
import defpackage.zci;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class AuthenticatorAttestationResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorAttestationResponse> CREATOR = new zci();
    public final byte[] a;
    public final byte[] b;
    public final byte[] c;
    public final String[] d;

    public AuthenticatorAttestationResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        fib.i(bArr);
        this.a = bArr;
        fib.i(bArr2);
        this.b = bArr2;
        fib.i(bArr3);
        this.c = bArr3;
        fib.i(strArr);
        this.d = strArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAttestationResponse)) {
            return false;
        }
        AuthenticatorAttestationResponse authenticatorAttestationResponse = (AuthenticatorAttestationResponse) obj;
        return Arrays.equals(this.a, authenticatorAttestationResponse.a) && Arrays.equals(this.b, authenticatorAttestationResponse.b) && Arrays.equals(this.c, authenticatorAttestationResponse.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), Integer.valueOf(Arrays.hashCode(this.b)), Integer.valueOf(Arrays.hashCode(this.c))});
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x0202 A[Catch: JSONException -> 0x0193, TRY_LEAVE, TryCatch #14 {JSONException -> 0x0193, blocks: (B:82:0x01ec, B:84:0x0202, B:45:0x0124, B:47:0x012f, B:52:0x0143, B:55:0x015f, B:57:0x0175, B:59:0x017b, B:64:0x0199, B:65:0x019e, B:66:0x019f, B:67:0x01a4, B:72:0x01af, B:74:0x01bc, B:76:0x01ca, B:77:0x01de, B:78:0x01e3, B:79:0x01e4, B:80:0x01e9, B:86:0x020e, B:87:0x0213, B:90:0x0217, B:91:0x021e, B:92:0x021f, B:93:0x0226, B:96:0x022a, B:107:0x0239, B:108:0x0240, B:100:0x0230, B:112:0x0247, B:113:0x024e, B:115:0x0250, B:116:0x0257, B:120:0x025e, B:121:0x0265, B:123:0x0267, B:124:0x026e, B:129:0x0275, B:130:0x027c), top: B:155:0x0056 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final org.json.JSONObject s0() {
        /*
            Method dump skipped, instruction units count: 643
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse.s0():org.json.JSONObject");
    }

    public final String toString() {
        qih qihVarF = wtf.f(this);
        aqh aqhVar = iqh.a;
        byte[] bArr = this.a;
        qihVarF.a(aqhVar.b(bArr.length, bArr), "keyHandle");
        byte[] bArr2 = this.b;
        qihVarF.a(aqhVar.b(bArr2.length, bArr2), "clientDataJSON");
        byte[] bArr3 = this.c;
        qihVarF.a(aqhVar.b(bArr3.length, bArr3), "attestationObject");
        qihVarF.a(Arrays.toString(this.d), "transports");
        return qihVarF.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.m(parcel, 2, this.a, false);
        ojd.m(parcel, 3, this.b, false);
        ojd.m(parcel, 4, this.c, false);
        ojd.u(parcel, 5, this.d);
        ojd.B(parcel, iA);
    }
}
