package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ojd;
import defpackage.pch;

/* JADX INFO: loaded from: classes2.dex */
public final class zat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zat> CREATOR = new pch();
    public final int a;
    public final Account b;
    public final int c;
    public final GoogleSignInAccount d;

    public zat(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.a = i;
        this.b = account;
        this.c = i2;
        this.d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.y(parcel, 1, 4);
        parcel.writeInt(this.a);
        ojd.s(parcel, 2, this.b, i, false);
        ojd.y(parcel, 3, 4);
        parcel.writeInt(this.c);
        ojd.s(parcel, 4, this.d, i, false);
        ojd.B(parcel, iA);
    }
}
