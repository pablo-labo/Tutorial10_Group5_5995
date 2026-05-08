package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.fib;
import defpackage.heh;
import defpackage.ojd;
import defpackage.xna;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class GetSignInIntentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetSignInIntentRequest> CREATOR = new heh();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final int f;

    public GetSignInIntentRequest(String str, String str2, String str3, int i, boolean z, String str4) {
        fib.i(str);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof GetSignInIntentRequest)) {
            return false;
        }
        GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) obj;
        return xna.a(this.a, getSignInIntentRequest.a) && xna.a(this.d, getSignInIntentRequest.d) && xna.a(this.b, getSignInIntentRequest.b) && xna.a(Boolean.valueOf(this.e), Boolean.valueOf(getSignInIntentRequest.e)) && this.f == getSignInIntentRequest.f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.d, Boolean.valueOf(this.e), Integer.valueOf(this.f)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.t(parcel, 1, this.a, false);
        ojd.t(parcel, 2, this.b, false);
        ojd.t(parcel, 3, this.c, false);
        ojd.t(parcel, 4, this.d, false);
        ojd.y(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        ojd.y(parcel, 6, 4);
        parcel.writeInt(this.f);
        ojd.B(parcel, iA);
    }
}
