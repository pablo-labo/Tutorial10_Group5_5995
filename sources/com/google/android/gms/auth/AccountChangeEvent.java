package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.fib;
import defpackage.ojd;
import defpackage.u40;
import defpackage.xna;
import defpackage.zfh;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class AccountChangeEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEvent> CREATOR = new zfh();
    public final int a;
    public final long b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;

    public AccountChangeEvent(int i, long j, String str, int i2, int i3, String str2) {
        this.a = i;
        this.b = j;
        fib.i(str);
        this.c = str;
        this.d = i2;
        this.e = i3;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AccountChangeEvent)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        AccountChangeEvent accountChangeEvent = (AccountChangeEvent) obj;
        return this.a == accountChangeEvent.a && this.b == accountChangeEvent.b && xna.a(this.c, accountChangeEvent.c) && this.d == accountChangeEvent.d && this.e == accountChangeEvent.e && xna.a(this.f, accountChangeEvent.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), this.c, Integer.valueOf(this.d), Integer.valueOf(this.e), this.f});
    }

    public final String toString() {
        int i = this.d;
        StringBuilder sbF = u40.f("AccountChangeEvent {accountName = ", this.c, ", changeType = ", i != 1 ? i != 2 ? i != 3 ? i != 4 ? "UNKNOWN" : "RENAMED_TO" : "RENAMED_FROM" : "REMOVED" : "ADDED", ", changeData = ");
        sbF.append(this.f);
        sbF.append(", eventIndex = ");
        sbF.append(this.e);
        sbF.append("}");
        return sbF.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.y(parcel, 1, 4);
        parcel.writeInt(this.a);
        ojd.y(parcel, 2, 8);
        parcel.writeLong(this.b);
        ojd.t(parcel, 3, this.c, false);
        ojd.y(parcel, 4, 4);
        parcel.writeInt(this.d);
        ojd.y(parcel, 5, 4);
        parcel.writeInt(this.e);
        ojd.t(parcel, 6, this.f, false);
        ojd.B(parcel, iA);
    }
}
