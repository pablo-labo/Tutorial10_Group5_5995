package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ojd;
import defpackage.thh;

/* JADX INFO: loaded from: classes2.dex */
public final class zzae extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzae> CREATOR = new thh();
    public final Bundle V;
    public final long a;
    public final long b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;

    public zzae(long j, long j2, boolean z, String str, String str2, String str3, Bundle bundle) {
        this.a = j;
        this.b = j2;
        this.c = z;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.V = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.y(parcel, 1, 8);
        parcel.writeLong(this.a);
        ojd.y(parcel, 2, 8);
        parcel.writeLong(this.b);
        ojd.y(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        ojd.t(parcel, 4, this.d, false);
        ojd.t(parcel, 5, this.e, false);
        ojd.t(parcel, 6, this.f, false);
        ojd.l(parcel, 7, this.V);
        ojd.B(parcel, iA);
    }
}
