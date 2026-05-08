package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.location.zzd;
import defpackage.awd;
import defpackage.mvh;
import defpackage.o6;
import defpackage.ojd;
import defpackage.omi;
import defpackage.q3h;
import defpackage.q6;
import defpackage.ush;
import defpackage.xna;
import java.util.Arrays;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes2.dex */
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new omi();
    public final float V;
    public final boolean W;
    public final long X;
    public final int Y;
    public final int Z;
    public final int a;
    public final String a0;
    public final long b;
    public final boolean b0;
    public final long c;
    public final WorkSource c0;
    public final long d;
    public final zzd d0;
    public final long e;
    public final int f;

    public LocationRequest(int i, long j, long j2, long j3, long j4, long j5, int i2, float f, boolean z, long j6, int i3, int i4, String str, boolean z2, WorkSource workSource, zzd zzdVar) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4 == Long.MAX_VALUE ? j5 : Math.min(Math.max(1L, j4 - SystemClock.elapsedRealtime()), j5);
        this.f = i2;
        this.V = f;
        this.W = z;
        this.X = j6 != -1 ? j6 : j;
        this.Y = i3;
        this.Z = i4;
        this.a0 = str;
        this.b0 = z2;
        this.c0 = workSource;
        this.d0 = zzdVar;
    }

    public static String R0(long j) {
        String string;
        if (j == Long.MAX_VALUE) {
            return "∞";
        }
        StringBuilder sb = ush.a;
        synchronized (sb) {
            sb.setLength(0);
            ush.a(j, sb);
            string = sb.toString();
        }
        return string;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        int i = locationRequest.a;
        int i2 = this.a;
        if (i2 != i) {
            return false;
        }
        if ((i2 == 105 || this.b == locationRequest.b) && this.c == locationRequest.c && s0() == locationRequest.s0()) {
            return (!s0() || this.d == locationRequest.d) && this.e == locationRequest.e && this.f == locationRequest.f && this.V == locationRequest.V && this.W == locationRequest.W && this.Y == locationRequest.Y && this.Z == locationRequest.Z && this.b0 == locationRequest.b0 && this.c0.equals(locationRequest.c0) && xna.a(this.a0, locationRequest.a0) && xna.a(this.d0, locationRequest.d0);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), this.c0});
    }

    @Pure
    public final boolean s0() {
        long j = this.d;
        return j > 0 && (j >> 1) >= this.b;
    }

    public final String toString() {
        String str;
        StringBuilder sbG = q6.g("Request[");
        int i = this.a;
        long j = this.b;
        if (i == 105) {
            sbG.append(mvh.c(i));
        } else {
            sbG.append("@");
            if (s0()) {
                ush.a(j, sbG);
                sbG.append("/");
                ush.a(this.d, sbG);
            } else {
                ush.a(j, sbG);
            }
            sbG.append(" ");
            sbG.append(mvh.c(i));
        }
        long j2 = this.c;
        if (i == 105 || j2 != j) {
            sbG.append(", minUpdateInterval=");
            sbG.append(R0(j2));
        }
        float f = this.V;
        if (f > 0.0d) {
            sbG.append(", minUpdateDistance=");
            sbG.append(f);
        }
        long j3 = this.X;
        if (i != 105 ? j3 != j : j3 != Long.MAX_VALUE) {
            sbG.append(", maxUpdateAge=");
            sbG.append(R0(j3));
        }
        long j4 = this.e;
        if (j4 != Long.MAX_VALUE) {
            sbG.append(", duration=");
            ush.a(j4, sbG);
        }
        int i2 = this.f;
        if (i2 != Integer.MAX_VALUE) {
            sbG.append(", maxUpdates=");
            sbG.append(i2);
        }
        int i3 = this.Z;
        if (i3 != 0) {
            sbG.append(", ");
            if (i3 == 0) {
                str = "THROTTLE_BACKGROUND";
            } else if (i3 == 1) {
                str = "THROTTLE_ALWAYS";
            } else {
                if (i3 != 2) {
                    o6.h();
                    return null;
                }
                str = "THROTTLE_NEVER";
            }
            sbG.append(str);
        }
        int i4 = this.Y;
        if (i4 != 0) {
            sbG.append(", ");
            sbG.append(awd.u(i4));
        }
        if (this.W) {
            sbG.append(", waitForAccurateLocation");
        }
        if (this.b0) {
            sbG.append(", bypass");
        }
        String str2 = this.a0;
        if (str2 != null) {
            sbG.append(", moduleId=");
            sbG.append(str2);
        }
        WorkSource workSource = this.c0;
        if (!q3h.c(workSource)) {
            sbG.append(", ");
            sbG.append(workSource);
        }
        zzd zzdVar = this.d0;
        if (zzdVar != null) {
            sbG.append(", impersonation=");
            sbG.append(zzdVar);
        }
        sbG.append(']');
        return sbG.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.y(parcel, 1, 4);
        parcel.writeInt(this.a);
        ojd.y(parcel, 2, 8);
        parcel.writeLong(this.b);
        ojd.y(parcel, 3, 8);
        parcel.writeLong(this.c);
        ojd.y(parcel, 6, 4);
        parcel.writeInt(this.f);
        ojd.y(parcel, 7, 4);
        parcel.writeFloat(this.V);
        ojd.y(parcel, 8, 8);
        parcel.writeLong(this.d);
        ojd.y(parcel, 9, 4);
        parcel.writeInt(this.W ? 1 : 0);
        ojd.y(parcel, 10, 8);
        parcel.writeLong(this.e);
        ojd.y(parcel, 11, 8);
        parcel.writeLong(this.X);
        ojd.y(parcel, 12, 4);
        parcel.writeInt(this.Y);
        ojd.y(parcel, 13, 4);
        parcel.writeInt(this.Z);
        ojd.t(parcel, 14, this.a0, false);
        ojd.y(parcel, 15, 4);
        parcel.writeInt(this.b0 ? 1 : 0);
        ojd.s(parcel, 16, this.c0, i, false);
        ojd.s(parcel, 17, this.d0, i, false);
        ojd.B(parcel, iA);
    }

    @Deprecated
    public LocationRequest() {
        this(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, null, false, new WorkSource(), null);
    }
}
