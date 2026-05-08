package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.fib;
import defpackage.ojd;
import defpackage.xfi;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class DetectedActivity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DetectedActivity> CREATOR = new xfi();
    public int a;
    public int b;

    public final boolean equals(Object obj) {
        if (obj instanceof DetectedActivity) {
            DetectedActivity detectedActivity = (DetectedActivity) obj;
            if (this.a == detectedActivity.a && this.b == detectedActivity.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b)});
    }

    public final String toString() {
        int i = this.a;
        if (i > 22 || i < 0) {
            i = 4;
        }
        return "DetectedActivity [type=" + (i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 7 ? i != 8 ? i != 16 ? i != 17 ? Integer.toString(i) : "IN_RAIL_VEHICLE" : "IN_ROAD_VEHICLE" : "RUNNING" : "WALKING" : "TILTING" : "UNKNOWN" : "STILL" : "ON_FOOT" : "ON_BICYCLE" : "IN_VEHICLE") + ", confidence=" + this.b + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fib.i(parcel);
        int iA = ojd.A(parcel, 20293);
        int i2 = this.a;
        ojd.y(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = this.b;
        ojd.y(parcel, 2, 4);
        parcel.writeInt(i3);
        ojd.B(parcel, iA);
    }
}
