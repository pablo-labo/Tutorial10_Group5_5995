package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ojd;
import defpackage.qhh;

/* JADX INFO: loaded from: classes2.dex */
public class RootTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new qhh();
    public final int a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;

    public RootTelemetryConfiguration(int i, int i2, int i3, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = i2;
        this.e = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.y(parcel, 1, 4);
        parcel.writeInt(this.a);
        ojd.y(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        ojd.y(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        ojd.y(parcel, 4, 4);
        parcel.writeInt(this.d);
        ojd.y(parcel, 5, 4);
        parcel.writeInt(this.e);
        ojd.B(parcel, iA);
    }
}
