package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.datadog.android.core.internal.CoreFeature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import defpackage.j6;
import defpackage.l5;
import defpackage.ojd;
import defpackage.p6;
import defpackage.rsh;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
@VisibleForTesting
public final class zzdh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdh> CREATOR = new rsh();
    public final int V;
    public final int W;
    public final int X;
    public final String a;
    public final long b;
    public final short c;
    public final double d;
    public final double e;
    public final float f;

    public zzdh(String str, int i, short s, double d, double d2, float f, long j, int i2, int i3) {
        if (str == null || str.length() > 100) {
            l5.q("requestId is null or too long: ".concat(String.valueOf(str)));
            throw null;
        }
        if (f <= 0.0f) {
            throw new IllegalArgumentException("invalid radius: " + f);
        }
        if (d > 90.0d || d < -90.0d) {
            j6.g("invalid latitude: ", d);
            throw null;
        }
        if (d2 > 180.0d || d2 < -180.0d) {
            j6.g("invalid longitude: ", d2);
            throw null;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            l5.q(p6.c(i, "No supported transition specified: "));
            throw null;
        }
        this.c = s;
        this.a = str;
        this.d = d;
        this.e = d2;
        this.f = f;
        this.b = j;
        this.V = i4;
        this.W = i2;
        this.X = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzdh) {
            zzdh zzdhVar = (zzdh) obj;
            if (this.f == zzdhVar.f && this.d == zzdhVar.d && this.e == zzdhVar.e && this.c == zzdhVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.d);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.e);
        return ((((Float.floatToIntBits(this.f) + ((((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + 31) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31)) * 31) + this.c) * 31) + this.V;
    }

    public final String toString() {
        Locale locale = Locale.US;
        short s = this.c;
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", s != -1 ? s != 1 ? "UNKNOWN" : "CIRCLE" : "INVALID", this.a.replaceAll("\\p{C}", CoreFeature.DEFAULT_APP_VERSION), Integer.valueOf(this.V), Double.valueOf(this.d), Double.valueOf(this.e), Float.valueOf(this.f), Integer.valueOf(this.W / 1000), Integer.valueOf(this.X), Long.valueOf(this.b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.t(parcel, 1, this.a, false);
        ojd.y(parcel, 2, 8);
        parcel.writeLong(this.b);
        ojd.y(parcel, 3, 4);
        parcel.writeInt(this.c);
        ojd.y(parcel, 4, 8);
        parcel.writeDouble(this.d);
        ojd.y(parcel, 5, 8);
        parcel.writeDouble(this.e);
        ojd.y(parcel, 6, 4);
        parcel.writeFloat(this.f);
        ojd.y(parcel, 7, 4);
        parcel.writeInt(this.V);
        ojd.y(parcel, 8, 4);
        parcel.writeInt(this.W);
        ojd.y(parcel, 9, 4);
        parcel.writeInt(this.X);
        ojd.B(parcel, iA);
    }
}
