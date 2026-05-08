package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbh;
import defpackage.ojd;

/* JADX INFO: loaded from: classes2.dex */
public final class zac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zac> CREATOR = new dbh();
    public final int a;
    public final String b;
    public final int c;

    public zac(String str, int i) {
        this.a = 1;
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

    public zac(int i, int i2, String str) {
        this.a = i;
        this.b = str;
        this.c = i2;
    }
}
