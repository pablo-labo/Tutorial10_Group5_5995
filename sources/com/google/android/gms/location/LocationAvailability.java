package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dmi;
import defpackage.ojd;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR;
    public final int a;
    public final int b;
    public final long c;
    public final int d;
    public final zzac[] e;

    static {
        new LocationAvailability(0, 1, 1, 0L, null);
        new LocationAvailability(1000, 1, 1, 0L, null);
        CREATOR = new dmi();
    }

    public LocationAvailability(int i, int i2, int i3, long j, zzac[] zzacVarArr) {
        this.d = i < 1000 ? 0 : 1000;
        this.a = i2;
        this.b = i3;
        this.c = j;
        this.e = zzacVarArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.a == locationAvailability.a && this.b == locationAvailability.b && this.c == locationAvailability.c && this.d == locationAvailability.d && Arrays.equals(this.e, locationAvailability.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.d)});
    }

    public final String toString() {
        return "LocationAvailability[" + (this.d < 1000) + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.y(parcel, 1, 4);
        parcel.writeInt(this.a);
        ojd.y(parcel, 2, 4);
        parcel.writeInt(this.b);
        ojd.y(parcel, 3, 8);
        parcel.writeLong(this.c);
        ojd.y(parcel, 4, 4);
        int i2 = this.d;
        parcel.writeInt(i2);
        ojd.w(parcel, 5, this.e, i);
        int i3 = i2 >= 1000 ? 0 : 1;
        ojd.y(parcel, 6, 4);
        parcel.writeInt(i3);
        ojd.B(parcel, iA);
    }
}
