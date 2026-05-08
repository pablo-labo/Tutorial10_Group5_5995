package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dni;
import defpackage.fib;
import defpackage.ojd;

/* JADX INFO: loaded from: classes2.dex */
public final class zzw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzw> CREATOR = new dni();
    public final zzao V;
    public long W;
    public zzao X;
    public final long Y;
    public final zzao Z;
    public String a;
    public String b;
    public zzkq c;
    public long d;
    public boolean e;
    public String f;

    public zzw(zzw zzwVar) {
        fib.i(zzwVar);
        this.a = zzwVar.a;
        this.b = zzwVar.b;
        this.c = zzwVar.c;
        this.d = zzwVar.d;
        this.e = zzwVar.e;
        this.f = zzwVar.f;
        this.V = zzwVar.V;
        this.W = zzwVar.W;
        this.X = zzwVar.X;
        this.Y = zzwVar.Y;
        this.Z = zzwVar.Z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.t(parcel, 2, this.a, false);
        ojd.t(parcel, 3, this.b, false);
        ojd.s(parcel, 4, this.c, i, false);
        long j = this.d;
        ojd.y(parcel, 5, 8);
        parcel.writeLong(j);
        boolean z = this.e;
        ojd.y(parcel, 6, 4);
        parcel.writeInt(z ? 1 : 0);
        ojd.t(parcel, 7, this.f, false);
        ojd.s(parcel, 8, this.V, i, false);
        long j2 = this.W;
        ojd.y(parcel, 9, 8);
        parcel.writeLong(j2);
        ojd.s(parcel, 10, this.X, i, false);
        ojd.y(parcel, 11, 8);
        parcel.writeLong(this.Y);
        ojd.s(parcel, 12, this.Z, i, false);
        ojd.B(parcel, iA);
    }

    public zzw(String str, String str2, zzkq zzkqVar, long j, boolean z, String str3, zzao zzaoVar, long j2, zzao zzaoVar2, long j3, zzao zzaoVar3) {
        this.a = str;
        this.b = str2;
        this.c = zzkqVar;
        this.d = j;
        this.e = z;
        this.f = str3;
        this.V = zzaoVar;
        this.W = j2;
        this.X = zzaoVar2;
        this.Y = j3;
        this.Z = zzaoVar3;
    }
}
