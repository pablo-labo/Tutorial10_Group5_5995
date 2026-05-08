package com.google.android.gms.internal.icing;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bai;
import defpackage.ojd;
import defpackage.xna;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new bai();
    public final zzk[] a;
    public final String b;
    public final boolean c;
    public final Account d;

    public zzh(zzk[] zzkVarArr, String str, boolean z, Account account) {
        this.a = zzkVarArr;
        this.b = str;
        this.c = z;
        this.d = account;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzh) {
            zzh zzhVar = (zzh) obj;
            if (xna.a(this.b, zzhVar.b) && xna.a(Boolean.valueOf(this.c), Boolean.valueOf(zzhVar.c)) && xna.a(this.d, zzhVar.d) && Arrays.equals(this.a, zzhVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Boolean.valueOf(this.c), this.d, Integer.valueOf(Arrays.hashCode(this.a))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.w(parcel, 1, this.a, i);
        ojd.t(parcel, 2, this.b, false);
        ojd.y(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        ojd.s(parcel, 4, this.d, i, false);
        ojd.B(parcel, iA);
    }
}
