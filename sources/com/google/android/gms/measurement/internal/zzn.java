package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.fib;
import defpackage.ghi;
import defpackage.ojd;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzn> CREATOR = new ghi();
    public final String V;
    public final boolean W;
    public final boolean X;
    public final long Y;
    public final String Z;
    public final String a;
    public final long a0;
    public final String b;
    public final long b0;
    public final String c;
    public final int c0;
    public final String d;
    public final boolean d0;
    public final long e;
    public final boolean e0;
    public final long f;
    public final boolean f0;
    public final String g0;
    public final Boolean h0;
    public final long i0;
    public final List<String> j0;
    public final String k0;

    public zzn(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, long j5, int i, boolean z3, boolean z4, boolean z5, String str7, Boolean bool, long j6, List<String> list, String str8) {
        fib.f(str);
        this.a = str;
        this.b = TextUtils.isEmpty(str2) ? null : str2;
        this.c = str3;
        this.Y = j;
        this.d = str4;
        this.e = j2;
        this.f = j3;
        this.V = str5;
        this.W = z;
        this.X = z2;
        this.Z = str6;
        this.a0 = j4;
        this.b0 = j5;
        this.c0 = i;
        this.d0 = z3;
        this.e0 = z4;
        this.f0 = z5;
        this.g0 = str7;
        this.h0 = bool;
        this.i0 = j6;
        this.j0 = list;
        this.k0 = str8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.t(parcel, 2, this.a, false);
        ojd.t(parcel, 3, this.b, false);
        ojd.t(parcel, 4, this.c, false);
        ojd.t(parcel, 5, this.d, false);
        ojd.y(parcel, 6, 8);
        parcel.writeLong(this.e);
        ojd.y(parcel, 7, 8);
        parcel.writeLong(this.f);
        ojd.t(parcel, 8, this.V, false);
        ojd.y(parcel, 9, 4);
        parcel.writeInt(this.W ? 1 : 0);
        ojd.y(parcel, 10, 4);
        parcel.writeInt(this.X ? 1 : 0);
        ojd.y(parcel, 11, 8);
        parcel.writeLong(this.Y);
        ojd.t(parcel, 12, this.Z, false);
        ojd.y(parcel, 13, 8);
        parcel.writeLong(this.a0);
        ojd.y(parcel, 14, 8);
        parcel.writeLong(this.b0);
        ojd.y(parcel, 15, 4);
        parcel.writeInt(this.c0);
        ojd.y(parcel, 16, 4);
        parcel.writeInt(this.d0 ? 1 : 0);
        ojd.y(parcel, 17, 4);
        parcel.writeInt(this.e0 ? 1 : 0);
        ojd.y(parcel, 18, 4);
        parcel.writeInt(this.f0 ? 1 : 0);
        ojd.t(parcel, 19, this.g0, false);
        Boolean bool = this.h0;
        if (bool != null) {
            ojd.y(parcel, 21, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        ojd.y(parcel, 22, 8);
        parcel.writeLong(this.i0);
        ojd.v(parcel, 23, this.j0);
        ojd.t(parcel, 24, this.k0, false);
        ojd.B(parcel, iA);
    }

    public zzn(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, long j5, int i, boolean z3, boolean z4, boolean z5, String str7, Boolean bool, long j6, ArrayList arrayList, String str8) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.Y = j3;
        this.d = str4;
        this.e = j;
        this.f = j2;
        this.V = str5;
        this.W = z;
        this.X = z2;
        this.Z = str6;
        this.a0 = j4;
        this.b0 = j5;
        this.c0 = i;
        this.d0 = z3;
        this.e0 = z4;
        this.f0 = z5;
        this.g0 = str7;
        this.h0 = bool;
        this.i0 = j6;
        this.j0 = arrayList;
        this.k0 = str8;
    }
}
