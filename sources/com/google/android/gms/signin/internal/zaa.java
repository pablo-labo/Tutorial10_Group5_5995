package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ojd;
import defpackage.p7d;
import defpackage.s9h;

/* JADX INFO: loaded from: classes2.dex */
public final class zaa extends AbstractSafeParcelable implements p7d {
    public static final Parcelable.Creator<zaa> CREATOR = new s9h();
    public final int a;
    public final int b;
    public final Intent c;

    public zaa(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    @Override // defpackage.p7d
    public final Status a() {
        return this.b == 0 ? Status.e : Status.X;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.y(parcel, 1, 4);
        parcel.writeInt(this.a);
        ojd.y(parcel, 2, 4);
        parcel.writeInt(this.b);
        ojd.s(parcel, 3, this.c, i, false);
        ojd.B(parcel, iA);
    }

    public zaa() {
        this(2, 0, null);
    }
}
