package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.fib;
import defpackage.ojd;
import defpackage.pki;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new pki();
    public final long a;
    public final byte[] b;
    public final byte[] c;
    public final byte[] d;

    public zzq(long j, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = j;
        fib.i(bArr);
        this.b = bArr;
        fib.i(bArr2);
        this.c = bArr2;
        fib.i(bArr3);
        this.d = bArr3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzq)) {
            return false;
        }
        zzq zzqVar = (zzq) obj;
        return this.a == zzqVar.a && Arrays.equals(this.b, zzqVar.b) && Arrays.equals(this.c, zzqVar.c) && Arrays.equals(this.d, zzqVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.y(parcel, 1, 8);
        parcel.writeLong(this.a);
        ojd.m(parcel, 2, this.b, false);
        ojd.m(parcel, 3, this.c, false);
        ojd.m(parcel, 4, this.d, false);
        ojd.B(parcel, iA);
    }
}
