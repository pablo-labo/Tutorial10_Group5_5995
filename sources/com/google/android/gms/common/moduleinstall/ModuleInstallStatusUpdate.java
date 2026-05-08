package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.cbh;
import defpackage.l5;
import defpackage.ojd;

/* JADX INFO: loaded from: classes2.dex */
public class ModuleInstallStatusUpdate extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleInstallStatusUpdate> CREATOR = new cbh();
    public final int a;
    public final int b;
    public final Long c;
    public final Long d;
    public final int e;

    public ModuleInstallStatusUpdate(int i, int i2, Long l, Long l2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = l;
        this.d = l2;
        this.e = i3;
        if (l == null || l2 == null || l2.longValue() == 0 || l2.longValue() != 0) {
            return;
        }
        l5.q("Given Long is zero");
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.y(parcel, 1, 4);
        parcel.writeInt(this.a);
        ojd.y(parcel, 2, 4);
        parcel.writeInt(this.b);
        ojd.r(parcel, 3, this.c);
        ojd.r(parcel, 4, this.d);
        ojd.y(parcel, 5, 4);
        parcel.writeInt(this.e);
        ojd.B(parcel, iA);
    }
}
