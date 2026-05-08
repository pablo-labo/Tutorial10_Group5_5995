package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.boh;
import defpackage.ojd;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbw> CREATOR = new boh();
    public final int a;
    public final String b;

    public zzbw(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.y(parcel, 1, 4);
        parcel.writeInt(this.a);
        ojd.t(parcel, 2, this.b, false);
        ojd.B(parcel, iA);
    }

    public zzbw() {
        this.a = 1;
    }
}
