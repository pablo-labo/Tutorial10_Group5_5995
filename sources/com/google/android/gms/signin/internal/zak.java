package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zav;
import defpackage.ojd;
import defpackage.ybh;

/* JADX INFO: loaded from: classes2.dex */
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new ybh();
    public final int a;
    public final ConnectionResult b;
    public final zav c;

    public zak(int i, ConnectionResult connectionResult, zav zavVar) {
        this.a = i;
        this.b = connectionResult;
        this.c = zavVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.y(parcel, 1, 4);
        parcel.writeInt(this.a);
        ojd.s(parcel, 2, this.b, i, false);
        ojd.s(parcel, 3, this.c, i, false);
        ojd.B(parcel, iA);
    }
}
