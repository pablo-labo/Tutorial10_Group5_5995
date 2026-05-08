package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import defpackage.ojd;

/* JADX INFO: loaded from: classes2.dex */
public final class zam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zam> CREATOR = new b();
    public final int a;
    public final String b;
    public final FastJsonResponse.Field c;

    public zam(String str, FastJsonResponse.Field field) {
        this.a = 1;
        this.b = str;
        this.c = field;
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

    public zam(int i, String str, FastJsonResponse.Field field) {
        this.a = i;
        this.b = str;
        this.c = field;
    }
}
