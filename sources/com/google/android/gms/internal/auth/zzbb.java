package com.google.android.gms.internal.auth;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.fib;
import defpackage.ojd;
import defpackage.ulh;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbb> CREATOR = new ulh();
    public final int a = 1;
    public final String b;
    public final PendingIntent c;

    public zzbb(String str, PendingIntent pendingIntent) {
        fib.i(str);
        this.b = str;
        fib.i(pendingIntent);
        this.c = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.y(parcel, 1, 4);
        parcel.writeInt(this.a);
        ojd.t(parcel, 2, this.b, false);
        ojd.s(parcel, 3, this.c, i, false);
        ojd.B(parcel, iA);
    }
}
