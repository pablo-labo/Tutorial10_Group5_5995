package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ksh;
import defpackage.ojd;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdb> CREATOR = new ksh();
    public final int a;
    public final IBinder b;
    public final IBinder c;
    public final PendingIntent d;
    public final String e;
    public final String f;

    public zzdb(int i, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str, String str2) {
        this.a = i;
        this.b = iBinder;
        this.c = iBinder2;
        this.d = pendingIntent;
        this.e = Build.VERSION.SDK_INT >= 30 ? null : str;
        this.f = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.y(parcel, 1, 4);
        parcel.writeInt(this.a);
        ojd.o(parcel, 2, this.b);
        ojd.o(parcel, 3, this.c);
        ojd.s(parcel, 4, this.d, i, false);
        ojd.t(parcel, 5, this.e, false);
        ojd.t(parcel, 6, this.f, false);
        ojd.B(parcel, iA);
    }
}
