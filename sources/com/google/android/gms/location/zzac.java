package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ojd;
import defpackage.uz;
import defpackage.vgh;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class zzac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzac> CREATOR = new vgh();
    public final int a;
    public final int b;
    public final long c;
    public final long d;

    public zzac(int i, int i2, long j, long j2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzac) {
            zzac zzacVar = (zzac) obj;
            if (this.a == zzacVar.a && this.b == zzacVar.b && this.c == zzacVar.c && this.d == zzacVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.a), Long.valueOf(this.d), Long.valueOf(this.c)});
    }

    public final String toString() {
        StringBuilder sbF = uz.f("NetworkLocationStatus: Wifi status: ", this.a, " Cell status: ", this.b, " elapsed time NS: ");
        sbF.append(this.d);
        sbF.append(" system time ms: ");
        sbF.append(this.c);
        return sbF.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.y(parcel, 1, 4);
        parcel.writeInt(this.a);
        ojd.y(parcel, 2, 4);
        parcel.writeInt(this.b);
        ojd.y(parcel, 3, 8);
        parcel.writeLong(this.c);
        ojd.y(parcel, 4, 8);
        parcel.writeLong(this.d);
        ojd.B(parcel, iA);
    }
}
