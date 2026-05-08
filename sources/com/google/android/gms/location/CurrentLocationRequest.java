package com.google.android.gms.location;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.location.zzd;
import defpackage.awd;
import defpackage.fai;
import defpackage.fib;
import defpackage.mvh;
import defpackage.o6;
import defpackage.ojd;
import defpackage.q3h;
import defpackage.q6;
import defpackage.ush;
import defpackage.xna;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class CurrentLocationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CurrentLocationRequest> CREATOR = new fai();
    public final String V;
    public final WorkSource W;
    public final zzd X;
    public final long a;
    public final int b;
    public final int c;
    public final long d;
    public final boolean e;
    public final int f;

    public CurrentLocationRequest(long j, int i, int i2, long j2, boolean z, int i3, String str, WorkSource workSource, zzd zzdVar) {
        boolean z2 = true;
        if (Build.VERSION.SDK_INT >= 30 && str != null) {
            z2 = false;
        }
        fib.b(z2);
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = j2;
        this.e = z;
        this.f = i3;
        this.V = str;
        this.W = workSource;
        this.X = zzdVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CurrentLocationRequest)) {
            return false;
        }
        CurrentLocationRequest currentLocationRequest = (CurrentLocationRequest) obj;
        return this.a == currentLocationRequest.a && this.b == currentLocationRequest.b && this.c == currentLocationRequest.c && this.d == currentLocationRequest.d && this.e == currentLocationRequest.e && this.f == currentLocationRequest.f && xna.a(this.V, currentLocationRequest.V) && xna.a(this.W, currentLocationRequest.W) && xna.a(this.X, currentLocationRequest.X);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Long.valueOf(this.d)});
    }

    public final String toString() {
        String str;
        StringBuilder sbG = q6.g("CurrentLocationRequest[");
        sbG.append(mvh.c(this.c));
        long j = this.a;
        if (j != Long.MAX_VALUE) {
            sbG.append(", maxAge=");
            ush.a(j, sbG);
        }
        long j2 = this.d;
        if (j2 != Long.MAX_VALUE) {
            o6.p(sbG, ", duration=", j2, "ms");
        }
        int i = this.b;
        if (i != 0) {
            sbG.append(", ");
            sbG.append(awd.u(i));
        }
        if (this.e) {
            sbG.append(", bypass");
        }
        int i2 = this.f;
        if (i2 != 0) {
            sbG.append(", ");
            if (i2 == 0) {
                str = "THROTTLE_BACKGROUND";
            } else if (i2 == 1) {
                str = "THROTTLE_ALWAYS";
            } else {
                if (i2 != 2) {
                    o6.h();
                    return null;
                }
                str = "THROTTLE_NEVER";
            }
            sbG.append(str);
        }
        String str2 = this.V;
        if (str2 != null) {
            sbG.append(", moduleId=");
            sbG.append(str2);
        }
        WorkSource workSource = this.W;
        if (!q3h.c(workSource)) {
            sbG.append(", workSource=");
            sbG.append(workSource);
        }
        zzd zzdVar = this.X;
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
        ojd.y(parcel, 1, 8);
        parcel.writeLong(this.a);
        ojd.y(parcel, 2, 4);
        parcel.writeInt(this.b);
        ojd.y(parcel, 3, 4);
        parcel.writeInt(this.c);
        ojd.y(parcel, 4, 8);
        parcel.writeLong(this.d);
        ojd.y(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        ojd.s(parcel, 6, this.W, i, false);
        ojd.y(parcel, 7, 4);
        parcel.writeInt(this.f);
        ojd.t(parcel, 8, this.V, false);
        ojd.s(parcel, 9, this.X, i, false);
        ojd.B(parcel, iA);
    }
}
