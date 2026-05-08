package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.fib;
import defpackage.ojd;
import defpackage.roh;

/* JADX INFO: loaded from: classes2.dex */
public final class zzb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzb> CREATOR = new roh();
    public final String V;
    public final long W;
    public final String X;
    public final long a;
    public final boolean b;
    public final WorkSource c;
    public final String d;
    public final int[] e;
    public final boolean f;

    public zzb(long j, boolean z, WorkSource workSource, String str, int[] iArr, boolean z2, String str2, long j2, String str3) {
        this.a = j;
        this.b = z;
        this.c = workSource;
        this.d = str;
        this.e = iArr;
        this.f = z2;
        this.V = str2;
        this.W = j2;
        this.X = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fib.i(parcel);
        int iA = ojd.A(parcel, 20293);
        ojd.y(parcel, 1, 8);
        parcel.writeLong(this.a);
        ojd.y(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        ojd.s(parcel, 3, this.c, i, false);
        ojd.t(parcel, 4, this.d, false);
        ojd.p(parcel, 5, this.e);
        ojd.y(parcel, 6, 4);
        parcel.writeInt(this.f ? 1 : 0);
        ojd.t(parcel, 7, this.V, false);
        ojd.y(parcel, 8, 8);
        parcel.writeLong(this.W);
        ojd.t(parcel, 9, this.X, false);
        ojd.B(parcel, iA);
    }
}
