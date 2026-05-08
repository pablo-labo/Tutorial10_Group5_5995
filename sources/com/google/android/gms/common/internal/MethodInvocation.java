package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bch;
import defpackage.ojd;

/* JADX INFO: loaded from: classes2.dex */
public class MethodInvocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new bch();
    public final String V;
    public final int W;
    public final int X;
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final String f;

    public MethodInvocation(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = j2;
        this.f = str;
        this.V = str2;
        this.W = i4;
        this.X = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.y(parcel, 1, 4);
        parcel.writeInt(this.a);
        ojd.y(parcel, 2, 4);
        parcel.writeInt(this.b);
        ojd.y(parcel, 3, 4);
        parcel.writeInt(this.c);
        ojd.y(parcel, 4, 8);
        parcel.writeLong(this.d);
        ojd.y(parcel, 5, 8);
        parcel.writeLong(this.e);
        ojd.t(parcel, 6, this.f, false);
        ojd.t(parcel, 7, this.V, false);
        ojd.y(parcel, 8, 4);
        parcel.writeInt(this.W);
        ojd.y(parcel, 9, 4);
        parcel.writeInt(this.X);
        ojd.B(parcel, iA);
    }
}
