package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.ia;
import defpackage.ojd;
import defpackage.xfh;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new xfh();
    public final int V;
    public final List W;
    public final String X;
    public final long Y;
    public final int Z;
    public final int a;
    public final String a0;
    public final long b;
    public final float b0;
    public final int c;
    public final long c0;
    public final String d;
    public final boolean d0;
    public final String e;
    public final String f;

    public WakeLockEvent(int i, long j, int i2, String str, int i3, ArrayList arrayList, String str2, long j2, int i4, String str3, String str4, float f, long j3, String str5, boolean z) {
        this.a = i;
        this.b = j;
        this.c = i2;
        this.d = str;
        this.e = str3;
        this.f = str5;
        this.V = i3;
        this.W = arrayList;
        this.X = str2;
        this.Y = j2;
        this.Z = i4;
        this.a0 = str4;
        this.b0 = f;
        this.c0 = j3;
        this.d0 = z;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final int R0() {
        return this.c;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final String n1() {
        List list = this.W;
        String strJoin = list == null ? "" : TextUtils.join(",", list);
        String str = this.d;
        int length = String.valueOf(str).length();
        int i = this.V;
        int length2 = String.valueOf(i).length() + length + 2;
        int length3 = String.valueOf(strJoin).length();
        int i2 = this.Z;
        int length4 = String.valueOf(i2).length() + length2 + 1 + length3 + 1;
        String str2 = this.e;
        if (str2 == null) {
            str2 = "";
        }
        int length5 = str2.length() + length4 + 1 + 1;
        String str3 = this.a0;
        if (str3 == null) {
            str3 = "";
        }
        int length6 = str3.length() + length5 + 1;
        float f = this.b0;
        int length7 = String.valueOf(f).length() + length6 + 1;
        String str4 = this.f;
        String str5 = str4 != null ? str4 : "";
        int length8 = str5.length() + length7 + 1;
        boolean z = this.d0;
        StringBuilder sb = new StringBuilder(length8 + String.valueOf(z).length());
        sb.append("\t");
        sb.append(str);
        sb.append("\t");
        sb.append(i);
        sb.append("\t");
        sb.append(strJoin);
        sb.append("\t");
        sb.append(i2);
        ia.r(sb, "\t", str2, "\t", str3);
        sb.append("\t");
        sb.append(f);
        sb.append("\t");
        sb.append(str5);
        sb.append("\t");
        sb.append(z);
        return sb.toString();
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long s0() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.y(parcel, 1, 4);
        parcel.writeInt(this.a);
        ojd.y(parcel, 2, 8);
        parcel.writeLong(this.b);
        ojd.t(parcel, 4, this.d, false);
        ojd.y(parcel, 5, 4);
        parcel.writeInt(this.V);
        ojd.v(parcel, 6, this.W);
        ojd.y(parcel, 8, 8);
        parcel.writeLong(this.Y);
        ojd.t(parcel, 10, this.e, false);
        ojd.y(parcel, 11, 4);
        parcel.writeInt(this.c);
        ojd.t(parcel, 12, this.X, false);
        ojd.t(parcel, 13, this.a0, false);
        ojd.y(parcel, 14, 4);
        parcel.writeInt(this.Z);
        ojd.y(parcel, 15, 4);
        parcel.writeFloat(this.b0);
        ojd.y(parcel, 16, 8);
        parcel.writeLong(this.c0);
        ojd.t(parcel, 17, this.f, false);
        ojd.y(parcel, 18, 4);
        parcel.writeInt(this.d0 ? 1 : 0);
        ojd.B(parcel, iA);
    }
}
