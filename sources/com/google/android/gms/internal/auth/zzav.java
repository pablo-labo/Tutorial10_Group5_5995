package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.fib;
import defpackage.ojd;
import defpackage.tjh;

/* JADX INFO: loaded from: classes2.dex */
public final class zzav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzav> CREATOR = new tjh();
    public final int a = 1;
    public final String b;
    public final int c;

    public zzav(String str, int i) {
        fib.i(str);
        this.b = str;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.y(parcel, 1, 4);
        parcel.writeInt(this.a);
        ojd.t(parcel, 2, this.b, false);
        ojd.y(parcel, 3, 4);
        parcel.writeInt(this.c);
        ojd.B(parcel, iA);
    }
}
