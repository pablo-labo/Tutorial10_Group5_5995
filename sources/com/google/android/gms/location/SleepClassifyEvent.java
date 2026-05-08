package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.fib;
import defpackage.hhh;
import defpackage.ojd;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class SleepClassifyEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SleepClassifyEvent> CREATOR = new hhh();
    public final int V;
    public final boolean W;
    public final int X;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public SleepClassifyEvent(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, int i8) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.V = i7;
        this.W = z;
        this.X = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SleepClassifyEvent)) {
            return false;
        }
        SleepClassifyEvent sleepClassifyEvent = (SleepClassifyEvent) obj;
        return this.a == sleepClassifyEvent.a && this.b == sleepClassifyEvent.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b)});
    }

    public final String toString() {
        return this.a + " Conf:" + this.b + " Motion:" + this.c + " Light:" + this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fib.i(parcel);
        int iA = ojd.A(parcel, 20293);
        ojd.y(parcel, 1, 4);
        parcel.writeInt(this.a);
        ojd.y(parcel, 2, 4);
        parcel.writeInt(this.b);
        ojd.y(parcel, 3, 4);
        parcel.writeInt(this.c);
        ojd.y(parcel, 4, 4);
        parcel.writeInt(this.d);
        ojd.y(parcel, 5, 4);
        parcel.writeInt(this.e);
        ojd.y(parcel, 6, 4);
        parcel.writeInt(this.f);
        ojd.y(parcel, 7, 4);
        parcel.writeInt(this.V);
        ojd.y(parcel, 8, 4);
        parcel.writeInt(this.W ? 1 : 0);
        ojd.y(parcel, 9, 4);
        parcel.writeInt(this.X);
        ojd.B(parcel, iA);
    }
}
