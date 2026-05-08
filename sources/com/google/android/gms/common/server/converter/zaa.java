package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ojd;
import defpackage.p9h;

/* JADX INFO: loaded from: classes2.dex */
public final class zaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaa> CREATOR = new p9h();
    public final int a;
    public final StringToIntConverter b;

    public zaa(StringToIntConverter stringToIntConverter) {
        this.a = 1;
        this.b = stringToIntConverter;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.y(parcel, 1, 4);
        parcel.writeInt(this.a);
        ojd.s(parcel, 2, this.b, i, false);
        ojd.B(parcel, iA);
    }

    public zaa(int i, StringToIntConverter stringToIntConverter) {
        this.a = i;
        this.b = stringToIntConverter;
    }
}
