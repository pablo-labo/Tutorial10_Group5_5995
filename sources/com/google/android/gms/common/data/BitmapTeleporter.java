package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a9h;
import defpackage.fib;
import defpackage.ojd;

/* JADX INFO: loaded from: classes2.dex */
public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<BitmapTeleporter> CREATOR = new a9h();
    public final int a;
    public ParcelFileDescriptor b;
    public final int c;

    public BitmapTeleporter(int i, ParcelFileDescriptor parcelFileDescriptor, int i2) {
        this.a = i;
        this.b = parcelFileDescriptor;
        this.c = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.b == null) {
            fib.i(null);
            throw null;
        }
        int iA = ojd.A(parcel, 20293);
        ojd.y(parcel, 1, 4);
        parcel.writeInt(this.a);
        ojd.s(parcel, 2, this.b, i | 1, false);
        ojd.y(parcel, 3, 4);
        parcel.writeInt(this.c);
        ojd.B(parcel, iA);
        this.b = null;
    }
}
