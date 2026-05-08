package com.google.firebase.appindexing.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ami;
import defpackage.ojd;
import defpackage.z3;

/* JADX INFO: loaded from: classes2.dex */
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new ami();
    public final int a;
    public final boolean b;
    public final String c;
    public final String d;
    public final byte[] e;
    public final boolean f;

    public zzc(int i, boolean z, String str, String str2, byte[] bArr, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = bArr;
        this.f = z2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MetadataImpl { { eventStatus: '");
        sb.append(this.a);
        sb.append("' } { uploadable: '");
        sb.append(this.b);
        sb.append("' } ");
        String str = this.c;
        if (str != null) {
            sb.append("{ completionToken: '");
            sb.append(str);
            sb.append("' } ");
        }
        String str2 = this.d;
        if (str2 != null) {
            sb.append("{ accountName: '");
            sb.append(str2);
            sb.append("' } ");
        }
        byte[] bArr = this.e;
        if (bArr != null) {
            sb.append("{ ssbContext: [ ");
            for (byte b : bArr) {
                sb.append("0x");
                sb.append(Integer.toHexString(b));
                sb.append(" ");
            }
            sb.append("] } ");
        }
        sb.append("{ contextOnly: '");
        return z3.o(sb, this.f, "' } }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.y(parcel, 1, 4);
        parcel.writeInt(this.a);
        ojd.y(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        ojd.t(parcel, 3, this.c, false);
        ojd.t(parcel, 4, this.d, false);
        ojd.m(parcel, 5, this.e, false);
        ojd.y(parcel, 6, 4);
        parcel.writeInt(this.f ? 1 : 0);
        ojd.B(parcel, iA);
    }
}
