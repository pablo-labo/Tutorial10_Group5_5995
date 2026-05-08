package com.google.android.gms.internal.icing;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ojd;
import defpackage.tmi;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class zzw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzw> CREATOR = new tmi();
    public final int V;
    public final int W;
    public final String X;
    public final zzi a;
    public final long b;
    public final int c;
    public final String d;
    public final zzh e;
    public final boolean f;

    public zzw(zzi zziVar, long j, int i, String str, zzh zzhVar, boolean z, int i2, int i3, String str2) {
        this.a = zziVar;
        this.b = j;
        this.c = i;
        this.d = str;
        this.e = zzhVar;
        this.f = z;
        this.V = i2;
        this.W = i3;
        this.X = str2;
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "UsageInfo[documentId=" + this.a + ", timestamp=" + this.b + ", usageType=" + this.c + ", status=" + this.W + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.s(parcel, 1, this.a, i, false);
        ojd.y(parcel, 2, 8);
        parcel.writeLong(this.b);
        ojd.y(parcel, 3, 4);
        parcel.writeInt(this.c);
        ojd.t(parcel, 4, this.d, false);
        ojd.s(parcel, 5, this.e, i, false);
        ojd.y(parcel, 6, 4);
        parcel.writeInt(this.f ? 1 : 0);
        ojd.y(parcel, 7, 4);
        parcel.writeInt(this.V);
        ojd.y(parcel, 8, 4);
        parcel.writeInt(this.W);
        ojd.t(parcel, 9, this.X, false);
        ojd.B(parcel, iA);
    }
}
