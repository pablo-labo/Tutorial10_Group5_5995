package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ojd;
import defpackage.qch;
import defpackage.xna;

/* JADX INFO: loaded from: classes2.dex */
public final class zav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zav> CREATOR = new qch();
    public final int a;
    public final IBinder b;
    public final ConnectionResult c;
    public final boolean d;
    public final boolean e;

    public zav(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.a = i;
        this.b = iBinder;
        this.c = connectionResult;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        Object cVar;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zav)) {
            return false;
        }
        zav zavVar = (zav) obj;
        if (!this.c.equals(zavVar.c)) {
            return false;
        }
        Object cVar2 = null;
        IBinder iBinder = this.b;
        if (iBinder == null) {
            cVar = null;
        } else {
            int i = b.a.a;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            cVar = iInterfaceQueryLocalInterface instanceof b ? (b) iInterfaceQueryLocalInterface : new c(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
        }
        IBinder iBinder2 = zavVar.b;
        if (iBinder2 != null) {
            int i2 = b.a.a;
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            cVar2 = iInterfaceQueryLocalInterface2 instanceof b ? (b) iInterfaceQueryLocalInterface2 : new c(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor");
        }
        return xna.a(cVar, cVar2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.y(parcel, 1, 4);
        parcel.writeInt(this.a);
        ojd.o(parcel, 2, this.b);
        ojd.s(parcel, 3, this.c, i, false);
        ojd.y(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        ojd.y(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        ojd.B(parcel, iA);
    }
}
