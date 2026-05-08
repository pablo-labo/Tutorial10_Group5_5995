package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.fib;
import defpackage.gjh;
import defpackage.l6;
import defpackage.ojd;
import defpackage.uz;

/* JADX INFO: loaded from: classes2.dex */
public final class zzao extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzao> CREATOR = new gjh();
    public final String a;
    public final zzan b;
    public final String c;
    public final long d;

    public zzao(zzao zzaoVar, long j) {
        fib.i(zzaoVar);
        this.a = zzaoVar.a;
        this.b = zzaoVar.b;
        this.c = zzaoVar.c;
        this.d = j;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.b);
        String str = this.c;
        int iC = uz.c(21, str);
        String str2 = this.a;
        StringBuilder sb = new StringBuilder(strValueOf.length() + uz.c(iC, str2));
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        return l6.i(sb, ",params=", strValueOf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.t(parcel, 2, this.a, false);
        ojd.s(parcel, 3, this.b, i, false);
        ojd.t(parcel, 4, this.c, false);
        ojd.y(parcel, 5, 8);
        parcel.writeLong(this.d);
        ojd.B(parcel, iA);
    }

    public zzao(String str, zzan zzanVar, String str2, long j) {
        this.a = str;
        this.b = zzanVar;
        this.c = str2;
        this.d = j;
    }
}
