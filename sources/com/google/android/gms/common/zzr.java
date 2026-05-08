package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.hli;
import defpackage.ojd;
import defpackage.r03;
import defpackage.uoh;

/* JADX INFO: loaded from: classes2.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new hli();
    public final boolean a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;

    public zzr(boolean z, String str, int i, int i2, long j) {
        this.a = z;
        this.b = str;
        this.c = r03.D(i) - 1;
        this.d = uoh.a(i2) - 1;
        this.e = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.y(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        ojd.t(parcel, 2, this.b, false);
        ojd.y(parcel, 3, 4);
        parcel.writeInt(this.c);
        ojd.y(parcel, 4, 4);
        parcel.writeInt(this.d);
        ojd.y(parcel, 5, 8);
        parcel.writeLong(this.e);
        ojd.B(parcel, iA);
    }
}
