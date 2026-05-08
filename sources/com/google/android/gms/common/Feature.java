package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.alh;
import defpackage.ojd;
import defpackage.xna;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Feature> CREATOR = new alh();
    public final String a;

    @Deprecated
    public final int b;
    public final long c;
    public final boolean d;

    public Feature(String str, int i, long j, boolean z) {
        this.a = str;
        this.b = i;
        this.c = j;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (xna.a(this.a, feature.a) && s0() == feature.s0() && this.d == feature.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(s0()), Boolean.valueOf(this.d)});
    }

    public final long s0() {
        long j = this.c;
        return j == -1 ? this.b : j;
    }

    public final String toString() {
        xna.a aVar = new xna.a(this);
        aVar.a(this.a, "name");
        aVar.a(Long.valueOf(s0()), "version");
        aVar.a(Boolean.valueOf(this.d), "is_fully_rolled_out");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.t(parcel, 1, this.a, false);
        ojd.y(parcel, 2, 4);
        parcel.writeInt(this.b);
        long jS0 = s0();
        ojd.y(parcel, 3, 8);
        parcel.writeLong(jS0);
        ojd.y(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        ojd.B(parcel, iA);
    }

    public Feature(String str, long j) {
        this(str, -1, j, false);
    }
}
