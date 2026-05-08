package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ojd;
import defpackage.ymi;

/* JADX INFO: loaded from: classes2.dex */
public class DeviceMetaData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeviceMetaData> CREATOR = new ymi();
    public final int a;
    public final boolean b;
    public final long c;
    public final boolean d;

    public DeviceMetaData(int i, boolean z, long j, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = j;
        this.d = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.y(parcel, 1, 4);
        parcel.writeInt(this.a);
        ojd.y(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        ojd.y(parcel, 3, 8);
        parcel.writeLong(this.c);
        ojd.y(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        ojd.B(parcel, iA);
    }
}
