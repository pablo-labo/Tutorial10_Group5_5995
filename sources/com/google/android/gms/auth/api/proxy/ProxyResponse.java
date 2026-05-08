package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ojd;
import defpackage.ukh;

/* JADX INFO: loaded from: classes2.dex */
public class ProxyResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ProxyResponse> CREATOR = new ukh();
    public final int a;
    public final PendingIntent b;
    public final int c;
    public final byte[] d;
    public final int e;
    public final Bundle f;

    public ProxyResponse(int i, int i2, PendingIntent pendingIntent, int i3, Bundle bundle, byte[] bArr) {
        this.e = i;
        this.a = i2;
        this.c = i3;
        this.f = bundle;
        this.d = bArr;
        this.b = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.y(parcel, 1, 4);
        parcel.writeInt(this.a);
        ojd.s(parcel, 2, this.b, i, false);
        ojd.y(parcel, 3, 4);
        parcel.writeInt(this.c);
        ojd.l(parcel, 4, this.f);
        ojd.m(parcel, 5, this.d, false);
        ojd.y(parcel, 1000, 4);
        parcel.writeInt(this.e);
        ojd.B(parcel, iA);
    }
}
