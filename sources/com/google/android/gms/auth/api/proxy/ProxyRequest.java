package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ojd;
import defpackage.sfh;

/* JADX INFO: loaded from: classes2.dex */
public class ProxyRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ProxyRequest> CREATOR = new sfh();
    public final String a;
    public final int b;
    public final long c;
    public final byte[] d;
    public final int e;
    public final Bundle f;

    public ProxyRequest(int i, String str, int i2, long j, byte[] bArr, Bundle bundle) {
        this.e = i;
        this.a = str;
        this.b = i2;
        this.c = j;
        this.d = bArr;
        this.f = bundle;
    }

    public final String toString() {
        return "ProxyRequest[ url: " + this.a + ", method: " + this.b + " ]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.t(parcel, 1, this.a, false);
        ojd.y(parcel, 2, 4);
        parcel.writeInt(this.b);
        ojd.y(parcel, 3, 8);
        parcel.writeLong(this.c);
        ojd.m(parcel, 4, this.d, false);
        ojd.l(parcel, 5, this.f);
        ojd.y(parcel, 1000, 4);
        parcel.writeInt(this.e);
        ojd.B(parcel, iA);
    }
}
