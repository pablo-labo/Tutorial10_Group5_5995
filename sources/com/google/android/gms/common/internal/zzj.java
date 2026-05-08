package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ojd;
import defpackage.yci;

/* JADX INFO: loaded from: classes2.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new yci();
    public Bundle a;
    public Feature[] b;
    public int c;
    public ConnectionTelemetryConfiguration d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.l(parcel, 1, this.a);
        ojd.w(parcel, 2, this.b, i);
        int i2 = this.c;
        ojd.y(parcel, 3, 4);
        parcel.writeInt(i2);
        ojd.s(parcel, 4, this.d, i, false);
        ojd.B(parcel, iA);
    }
}
