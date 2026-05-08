package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.location.zzd;
import defpackage.awd;
import defpackage.ojd;
import defpackage.q6;
import defpackage.ush;
import defpackage.xna;
import defpackage.yli;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class LastLocationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LastLocationRequest> CREATOR = new yli();
    public final long a;
    public final int b;
    public final boolean c;
    public final String d;
    public final zzd e;

    public LastLocationRequest(long j, int i, boolean z, String str, zzd zzdVar) {
        this.a = j;
        this.b = i;
        this.c = z;
        this.d = str;
        this.e = zzdVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LastLocationRequest)) {
            return false;
        }
        LastLocationRequest lastLocationRequest = (LastLocationRequest) obj;
        return this.a == lastLocationRequest.a && this.b == lastLocationRequest.b && this.c == lastLocationRequest.c && xna.a(this.d, lastLocationRequest.d) && xna.a(this.e, lastLocationRequest.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Integer.valueOf(this.b), Boolean.valueOf(this.c)});
    }

    public final String toString() {
        StringBuilder sbG = q6.g("LastLocationRequest[");
        long j = this.a;
        if (j != Long.MAX_VALUE) {
            sbG.append("maxAge=");
            ush.a(j, sbG);
        }
        int i = this.b;
        if (i != 0) {
            sbG.append(", ");
            sbG.append(awd.u(i));
        }
        if (this.c) {
            sbG.append(", bypass");
        }
        String str = this.d;
        if (str != null) {
            sbG.append(", moduleId=");
            sbG.append(str);
        }
        zzd zzdVar = this.e;
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
        parcel.writeInt(this.c ? 1 : 0);
        ojd.t(parcel, 4, this.d, false);
        ojd.s(parcel, 5, this.e, i, false);
        ojd.B(parcel, iA);
    }
}
