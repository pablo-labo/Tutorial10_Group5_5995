package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import defpackage.aqh;
import defpackage.b0;
import defpackage.iqh;
import defpackage.ojd;
import defpackage.qih;
import defpackage.wtf;
import defpackage.xna;
import defpackage.z6i;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class RegisterResponseData extends ResponseData {
    public static final Parcelable.Creator<RegisterResponseData> CREATOR = new z6i();
    public final byte[] a;
    public final ProtocolVersion b;
    public final String c;

    public RegisterResponseData(byte[] bArr, String str, String str2) {
        this.a = bArr;
        try {
            this.b = ProtocolVersion.a(str);
            this.c = str2;
        } catch (ProtocolVersion.UnsupportedProtocolException e) {
            b0.s(e);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RegisterResponseData)) {
            return false;
        }
        RegisterResponseData registerResponseData = (RegisterResponseData) obj;
        return xna.a(this.b, registerResponseData.b) && Arrays.equals(this.a, registerResponseData.a) && xna.a(this.c, registerResponseData.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Integer.valueOf(Arrays.hashCode(this.a)), this.c});
    }

    public final String toString() {
        qih qihVarF = wtf.f(this);
        qihVarF.a(this.b, "protocolVersion");
        aqh aqhVar = iqh.a;
        byte[] bArr = this.a;
        qihVarF.a(aqhVar.b(bArr.length, bArr), "registerData");
        String str = this.c;
        if (str != null) {
            qihVarF.a(str, "clientDataString");
        }
        return qihVarF.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.m(parcel, 2, this.a, false);
        ojd.t(parcel, 3, this.b.toString(), false);
        ojd.t(parcel, 4, this.c, false);
        ojd.B(parcel, iA);
    }
}
