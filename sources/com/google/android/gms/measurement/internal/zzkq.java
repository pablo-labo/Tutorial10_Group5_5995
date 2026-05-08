package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bfi;
import defpackage.fib;
import defpackage.l5;
import defpackage.ojd;
import defpackage.tei;

/* JADX INFO: loaded from: classes2.dex */
public final class zzkq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzkq> CREATOR = new tei();
    public final Double V;
    public final int a;
    public final String b;
    public final long c;
    public final Long d;
    public final String e;
    public final String f;

    public zzkq(long j, Object obj, String str, String str2) {
        fib.f(str);
        this.a = 2;
        this.b = str;
        this.c = j;
        this.f = str2;
        if (obj == null) {
            this.d = null;
            this.V = null;
            this.e = null;
            return;
        }
        if (obj instanceof Long) {
            this.d = (Long) obj;
            this.V = null;
            this.e = null;
        } else if (obj instanceof String) {
            this.d = null;
            this.V = null;
            this.e = (String) obj;
        } else {
            if (!(obj instanceof Double)) {
                l5.q("User attribute given of un-supported type");
                throw null;
            }
            this.d = null;
            this.V = (Double) obj;
            this.e = null;
        }
    }

    public final Object s0() {
        Long l = this.d;
        if (l != null) {
            return l;
        }
        Double d = this.V;
        if (d != null) {
            return d;
        }
        String str = this.e;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.y(parcel, 1, 4);
        parcel.writeInt(this.a);
        ojd.t(parcel, 2, this.b, false);
        ojd.y(parcel, 3, 8);
        parcel.writeLong(this.c);
        ojd.r(parcel, 4, this.d);
        ojd.t(parcel, 6, this.e, false);
        ojd.t(parcel, 7, this.f, false);
        ojd.n(parcel, 8, this.V);
        ojd.B(parcel, iA);
    }

    public zzkq(bfi bfiVar) {
        this(bfiVar.d, bfiVar.e, bfiVar.c, bfiVar.b);
    }

    public zzkq(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = l;
        if (i == 1) {
            this.V = f != null ? Double.valueOf(f.doubleValue()) : null;
        } else {
            this.V = d;
        }
        this.e = str2;
        this.f = str3;
    }
}
