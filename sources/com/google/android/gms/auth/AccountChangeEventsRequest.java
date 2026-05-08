package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ilh;
import defpackage.ojd;

/* JADX INFO: loaded from: classes2.dex */
public class AccountChangeEventsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEventsRequest> CREATOR = new ilh();
    public final int a;
    public final int b;

    @Deprecated
    public final String c;
    public final Account d;

    public AccountChangeEventsRequest(int i, int i2, String str, Account account) {
        this.a = i;
        this.b = i2;
        this.c = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.d = account;
        } else {
            this.d = new Account(str, "com.google");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.y(parcel, 1, 4);
        parcel.writeInt(this.a);
        ojd.y(parcel, 2, 4);
        parcel.writeInt(this.b);
        ojd.t(parcel, 3, this.c, false);
        ojd.s(parcel, 4, this.d, i, false);
        ojd.B(parcel, iA);
    }

    public AccountChangeEventsRequest() {
        this.a = 1;
    }
}
