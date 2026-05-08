package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.b7i;
import defpackage.cli;
import defpackage.ddi;
import defpackage.kli;
import defpackage.lki;
import defpackage.ojd;
import defpackage.psh;
import defpackage.rli;
import defpackage.uki;
import defpackage.zji;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class zzdf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdf> CREATOR = new psh();
    public final String V;
    public final int a;
    public final zzdd b;
    public final rli c;
    public final uki d;
    public final PendingIntent e;
    public final ddi f;

    public zzdf(int i, zzdd zzddVar, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        rli cliVar;
        uki zjiVar;
        this.a = i;
        this.b = zzddVar;
        ddi b7iVar = null;
        if (iBinder != null) {
            int i2 = kli.a;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            cliVar = iInterfaceQueryLocalInterface instanceof rli ? (rli) iInterfaceQueryLocalInterface : new cli(iBinder, "com.google.android.gms.location.ILocationListener");
        } else {
            cliVar = null;
        }
        this.c = cliVar;
        this.e = pendingIntent;
        if (iBinder2 != null) {
            int i3 = lki.a;
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            zjiVar = iInterfaceQueryLocalInterface2 instanceof uki ? (uki) iInterfaceQueryLocalInterface2 : new zji(iBinder2, "com.google.android.gms.location.ILocationCallback");
        } else {
            zjiVar = null;
        }
        this.d = zjiVar;
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            b7iVar = iInterfaceQueryLocalInterface3 instanceof ddi ? (ddi) iInterfaceQueryLocalInterface3 : new b7i(iBinder3, "com.google.android.gms.location.internal.IFusedLocationProviderCallback");
        }
        this.f = b7iVar;
        this.V = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.y(parcel, 1, 4);
        parcel.writeInt(this.a);
        ojd.s(parcel, 2, this.b, i, false);
        rli rliVar = this.c;
        ojd.o(parcel, 3, rliVar == null ? null : rliVar.asBinder());
        ojd.s(parcel, 4, this.e, i, false);
        uki ukiVar = this.d;
        ojd.o(parcel, 5, ukiVar == null ? null : ukiVar.asBinder());
        ddi ddiVar = this.f;
        ojd.o(parcel, 6, ddiVar != null ? ddiVar.asBinder() : null);
        ojd.t(parcel, 8, this.V, false);
        ojd.B(parcel, iA);
    }
}
