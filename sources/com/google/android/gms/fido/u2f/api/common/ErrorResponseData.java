package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.csh;
import defpackage.ojd;
import defpackage.qih;
import defpackage.wtf;
import defpackage.xhh;
import defpackage.xna;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class ErrorResponseData extends ResponseData {
    public static final Parcelable.Creator<ErrorResponseData> CREATOR = new csh();
    public final ErrorCode a;
    public final String b;

    public ErrorResponseData(int i, String str) {
        this.a = ErrorCode.c(i);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ErrorResponseData)) {
            return false;
        }
        ErrorResponseData errorResponseData = (ErrorResponseData) obj;
        return xna.a(this.a, errorResponseData.a) && xna.a(this.b, errorResponseData.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
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
        ojd.B(parcel, iA);
    }
}
