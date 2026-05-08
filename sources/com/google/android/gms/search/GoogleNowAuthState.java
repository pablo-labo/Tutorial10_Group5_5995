package com.google.android.gms.search;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.mfh;
import defpackage.ojd;
import defpackage.uz;

/* JADX INFO: loaded from: classes2.dex */
public class GoogleNowAuthState extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleNowAuthState> CREATOR = new mfh();
    public String a;
    public String b;
    public long c;

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        long j = this.c;
        StringBuilder sb = new StringBuilder(uz.c(uz.c(74, str), str2));
        sb.append("mAuthCode = ");
        sb.append(str);
        sb.append("\nmAccessToken = ");
        sb.append(str2);
        sb.append("\nmNextAllowedTimeMillis = ");
        sb.append(j);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.t(parcel, 1, this.a, false);
        ojd.t(parcel, 2, this.b, false);
        long j = this.c;
        ojd.y(parcel, 3, 8);
        parcel.writeLong(j);
        ojd.B(parcel, iA);
    }
}
