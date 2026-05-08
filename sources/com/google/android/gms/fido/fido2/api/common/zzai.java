package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.cih;
import defpackage.fib;
import defpackage.ojd;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzai> CREATOR = new cih();
    public final byte[][] a;

    public zzai(byte[][] bArr) {
        fib.b(bArr != null);
        fib.b(1 == ((bArr.length & 1) ^ 1));
        int i = 0;
        while (i < bArr.length) {
            fib.b(i == 0 || bArr[i] != null);
            int i2 = i + 1;
            fib.b(bArr[i2] != null);
            int length = bArr[i2].length;
            fib.b(length == 32 || length == 64);
            i += 2;
        }
        this.a = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzai) {
            return Arrays.deepEquals(this.a, ((zzai) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (byte[] bArr : this.a) {
            iHashCode ^= Arrays.hashCode(new Object[]{bArr});
        }
        return iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        byte[][] bArr = this.a;
        if (bArr != null) {
            int iA2 = ojd.A(parcel, 1);
            parcel.writeInt(bArr.length);
            for (byte[] bArr2 : bArr) {
                parcel.writeByteArray(bArr2);
            }
            ojd.B(parcel, iA2);
        }
        ojd.B(parcel, iA);
    }
}
