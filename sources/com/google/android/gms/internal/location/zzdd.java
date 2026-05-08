package com.google.android.gms.internal.location;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.LocationRequest;
import defpackage.fib;
import defpackage.msh;
import defpackage.ojd;
import defpackage.q3h;
import defpackage.xna;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class zzdd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdd> CREATOR = new msh();
    public final LocationRequest a;

    public zzdd(LocationRequest locationRequest, ArrayList arrayList, boolean z, boolean z2, String str, boolean z3, boolean z4, String str2, long j) {
        int i;
        int i2 = locationRequest.a;
        long j2 = locationRequest.b;
        long jMin = locationRequest.c;
        long j3 = locationRequest.d;
        long j4 = locationRequest.e;
        int i3 = locationRequest.f;
        float f = locationRequest.V;
        boolean z5 = locationRequest.W;
        long j5 = locationRequest.X;
        int i4 = locationRequest.Y;
        boolean z6 = z5;
        int i5 = locationRequest.Z;
        String str3 = locationRequest.a0;
        boolean z7 = locationRequest.b0;
        WorkSource workSource = locationRequest.c0;
        zzd zzdVar = locationRequest.d0;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                workSource = null;
            } else {
                workSource = new WorkSource();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    zzd zzdVar2 = zzdVar;
                    ClientIdentity clientIdentity = (ClientIdentity) it.next();
                    q3h.a(workSource, clientIdentity.a, clientIdentity.b);
                    i4 = i4;
                    zzdVar = zzdVar2;
                }
            }
        }
        zzd zzdVar3 = zzdVar;
        int i6 = z ? 1 : i4;
        i5 = z2 ? 2 : i5;
        if (str != null) {
            i = i6;
            if (Build.VERSION.SDK_INT < 30) {
                str3 = str;
            }
        } else {
            i = i6;
            if (str2 != null && Build.VERSION.SDK_INT < 30) {
                str3 = str2;
            }
        }
        boolean z8 = z3 ? true : z7;
        z6 = z4 ? true : z6;
        if (j != Long.MAX_VALUE) {
            fib.a("maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE", j == -1 || j >= 0);
            j5 = j;
        }
        if (jMin == -1) {
            jMin = j2;
        } else if (i2 != 105) {
            jMin = Math.min(jMin, j2);
        }
        this.a = new LocationRequest(i2, j2, jMin, Math.max(j3, j2), Long.MAX_VALUE, j4, i3, f, z6, j5 == -1 ? j2 : j5, i, i5, str3, z8, new WorkSource(workSource), zzdVar3);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzdd) {
            return xna.a(this.a, ((zzdd) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.s(parcel, 1, this.a, i, false);
        ojd.B(parcel, iA);
    }
}
