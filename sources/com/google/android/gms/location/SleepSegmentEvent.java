package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.fib;
import defpackage.nhh;
import defpackage.ojd;
import defpackage.w40;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class SleepSegmentEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SleepSegmentEvent> CREATOR = new nhh();
    public final long a;
    public final long b;
    public final int c;
    public final int d;
    public final int e;

    public SleepSegmentEvent(long j, int i, int i2, int i3, long j2) {
        fib.a("endTimeMillis must be greater than or equal to startTimeMillis", j <= j2);
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SleepSegmentEvent) {
            SleepSegmentEvent sleepSegmentEvent = (SleepSegmentEvent) obj;
            if (this.a == sleepSegmentEvent.a && this.b == sleepSegmentEvent.b && this.c == sleepSegmentEvent.c && this.d == sleepSegmentEvent.d && this.e == sleepSegmentEvent.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final String toString() {
        StringBuilder sbI = w40.i(this.a, "startMillis=", ", endMillis=");
        sbI.append(this.b);
        sbI.append(", status=");
        sbI.append(this.c);
        return sbI.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fib.i(parcel);
        int iA = ojd.A(parcel, 20293);
        ojd.y(parcel, 1, 8);
        parcel.writeLong(this.a);
        ojd.y(parcel, 2, 8);
        parcel.writeLong(this.b);
        ojd.y(parcel, 3, 4);
        parcel.writeInt(this.c);
        ojd.y(parcel, 4, 4);
        parcel.writeInt(this.d);
        ojd.y(parcel, 5, 4);
        parcel.writeInt(this.e);
        ojd.B(parcel, iA);
    }
}
