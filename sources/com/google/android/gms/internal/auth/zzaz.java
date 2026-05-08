package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.fib;
import defpackage.jlh;
import defpackage.ojd;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaz> CREATOR = new jlh();
    public final int a = 1;
    public final String b;
    public final byte[] c;

    public zzaz(String str, byte[] bArr) {
        fib.i(str);
        this.b = str;
        fib.i(bArr);
        this.c = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.y(parcel, 1, 4);
        parcel.writeInt(this.a);
        ojd.t(parcel, 2, this.b, false);
        ojd.m(parcel, 3, this.c, false);
        ojd.B(parcel, iA);
    }
}
