package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.fib;
import defpackage.ihi;
import defpackage.ojd;
import defpackage.xna;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class TokenData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<TokenData> CREATOR = new ihi();
    public final String V;
    public final int a;
    public final String b;
    public final Long c;
    public final boolean d;
    public final boolean e;
    public final List f;

    public TokenData(int i, String str, Long l, boolean z, boolean z2, ArrayList arrayList, String str2) {
        this.a = i;
        fib.f(str);
        this.b = str;
        this.c = l;
        this.d = z;
        this.e = z2;
        this.f = arrayList;
        this.V = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        return TextUtils.equals(this.b, tokenData.b) && xna.a(this.c, tokenData.c) && this.d == tokenData.d && this.e == tokenData.e && xna.a(this.f, tokenData.f) && xna.a(this.V, tokenData.V);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, Boolean.valueOf(this.d), Boolean.valueOf(this.e), this.f, this.V});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.y(parcel, 1, 4);
        parcel.writeInt(this.a);
        ojd.t(parcel, 2, this.b, false);
        ojd.r(parcel, 3, this.c);
        ojd.y(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        ojd.y(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        ojd.v(parcel, 6, this.f);
        ojd.t(parcel, 7, this.V, false);
        ojd.B(parcel, iA);
    }
}
