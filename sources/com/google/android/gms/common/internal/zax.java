package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ojd;
import defpackage.rch;

/* JADX INFO: loaded from: classes2.dex */
public final class zax extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zax> CREATOR = new rch();
    public final int a;
    public final int b;
    public final int c;

    @Deprecated
    public final Scope[] d;

    public zax(int i, int i2, int i3, Scope[] scopeArr) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = scopeArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.y(parcel, 1, 4);
        parcel.writeInt(this.a);
        ojd.y(parcel, 2, 4);
        parcel.writeInt(this.b);
        ojd.y(parcel, 3, 4);
        parcel.writeInt(this.c);
        ojd.w(parcel, 4, this.d, i);
        ojd.B(parcel, iA);
    }
}
