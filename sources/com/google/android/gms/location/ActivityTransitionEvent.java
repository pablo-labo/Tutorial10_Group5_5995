package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.fib;
import defpackage.fxh;
import defpackage.ojd;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class ActivityTransitionEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionEvent> CREATOR = new fxh();
    public final int a;
    public final int b;
    public final long c;

    public ActivityTransitionEvent(int i, int i2, long j) {
        boolean z = false;
        if (i2 >= 0 && i2 <= 1) {
            z = true;
        }
        fib.a("Transition type " + i2 + " is not valid.", z);
        this.a = i;
        this.b = i2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransitionEvent)) {
            return false;
        }
        ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) obj;
        return this.a == activityTransitionEvent.a && this.b == activityTransitionEvent.b && this.c == activityTransitionEvent.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Long.valueOf(this.c)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ActivityType " + this.a);
        sb.append(" ");
        sb.append("TransitionType " + this.b);
        sb.append(" ");
        sb.append("ElapsedRealTimeNanos " + this.c);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fib.i(parcel);
        int iA = ojd.A(parcel, 20293);
        ojd.y(parcel, 1, 4);
        parcel.writeInt(this.a);
        ojd.y(parcel, 2, 4);
        parcel.writeInt(this.b);
        ojd.y(parcel, 3, 8);
        parcel.writeLong(this.c);
        ojd.B(parcel, iA);
    }
}
