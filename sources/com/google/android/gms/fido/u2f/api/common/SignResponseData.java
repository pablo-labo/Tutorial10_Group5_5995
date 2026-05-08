package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aqh;
import defpackage.fib;
import defpackage.iqh;
import defpackage.ojd;
import defpackage.qih;
import defpackage.rfi;
import defpackage.wtf;
import defpackage.xna;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class SignResponseData extends ResponseData {
    public static final Parcelable.Creator<SignResponseData> CREATOR = new rfi();
    public final byte[] a;
    public final String b;
    public final byte[] c;
    public final byte[] d;

    public SignResponseData(byte[] bArr, String str, byte[] bArr2, byte[] bArr3) {
        fib.i(bArr);
        this.a = bArr;
        fib.i(str);
        this.b = str;
        fib.i(bArr2);
        this.c = bArr2;
        fib.i(bArr3);
        this.d = bArr3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignResponseData)) {
            return false;
        }
        SignResponseData signResponseData = (SignResponseData) obj;
        return Arrays.equals(this.a, signResponseData.a) && xna.a(this.b, signResponseData.b) && Arrays.equals(this.c, signResponseData.c) && Arrays.equals(this.d, signResponseData.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), this.b, Integer.valueOf(Arrays.hashCode(this.c)), Integer.valueOf(Arrays.hashCode(this.d))});
    }

    public final String toString() {
        qih qihVarF = wtf.f(this);
        aqh aqhVar = iqh.a;
        byte[] bArr = this.a;
        qihVarF.a(aqhVar.b(bArr.length, bArr), "keyHandle");
        qihVarF.a(this.b, "clientDataString");
        byte[] bArr2 = this.c;
        qihVarF.a(aqhVar.b(bArr2.length, bArr2), "signatureData");
        byte[] bArr3 = this.d;
        qihVarF.a(aqhVar.b(bArr3.length, bArr3), "application");
        return qihVarF.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.m(parcel, 2, this.a, false);
        ojd.t(parcel, 3, this.b, false);
        ojd.m(parcel, 4, this.c, false);
        ojd.m(parcel, 5, this.d, false);
        ojd.B(parcel, iA);
    }
}
