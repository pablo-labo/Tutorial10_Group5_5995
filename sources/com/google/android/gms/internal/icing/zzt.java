package com.google.android.gms.internal.icing;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ojd;
import defpackage.wli;
import defpackage.xna;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzt> CREATOR = new wli();
    public final zzm[] V;
    public final String W;
    public final zzu X;
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final String f;

    public zzt(String str, String str2, boolean z, int i, boolean z2, String str3, zzm[] zzmVarArr, String str4, zzu zzuVar) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = z2;
        this.f = str3;
        this.V = zzmVarArr;
        this.W = str4;
        this.X = zzuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzt)) {
            return false;
        }
        zzt zztVar = (zzt) obj;
        return this.c == zztVar.c && this.d == zztVar.d && this.e == zztVar.e && xna.a(this.a, zztVar.a) && xna.a(this.b, zztVar.b) && xna.a(this.f, zztVar.f) && xna.a(this.W, zztVar.W) && xna.a(this.X, zztVar.X) && Arrays.equals(this.V, zztVar.V);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c), Integer.valueOf(this.d), Boolean.valueOf(this.e), this.f, Integer.valueOf(Arrays.hashCode(this.V)), this.W, this.X});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.t(parcel, 1, this.a, false);
        ojd.t(parcel, 2, this.b, false);
        ojd.y(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        ojd.y(parcel, 4, 4);
        parcel.writeInt(this.d);
        ojd.y(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        ojd.t(parcel, 6, this.f, false);
        ojd.w(parcel, 7, this.V, i);
        ojd.t(parcel, 11, this.W, false);
        ojd.s(parcel, 12, this.X, i, false);
        ojd.B(parcel, iA);
    }
}
