package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.fib;
import defpackage.jih;
import defpackage.ojd;
import defpackage.uz;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaj> CREATOR = new jih();
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public zzaj(int i, int i2, int i3, int i4) {
        fib.k("Start hour must be in range [0, 23].", i >= 0 && i <= 23);
        fib.k("Start minute must be in range [0, 59].", i2 >= 0 && i2 <= 59);
        fib.k("End hour must be in range [0, 23].", i3 >= 0 && i3 <= 23);
        fib.k("End minute must be in range [0, 59].", i4 >= 0 && i4 <= 59);
        fib.k("Parameters can't be all 0.", ((i + i2) + i3) + i4 > 0);
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaj)) {
            return false;
        }
        zzaj zzajVar = (zzaj) obj;
        return this.a == zzajVar.a && this.b == zzajVar.b && this.c == zzajVar.c && this.d == zzajVar.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d)});
    }

    public final String toString() {
        StringBuilder sbF = uz.f("UserPreferredSleepWindow [startHour=", this.a, ", startMinute=", this.b, ", endHour=");
        sbF.append(this.c);
        sbF.append(", endMinute=");
        sbF.append(this.d);
        sbF.append("]");
        return sbF.toString();
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
        ojd.B(parcel, iA);
    }
}
