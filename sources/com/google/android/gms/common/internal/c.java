package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import defpackage.ffh;
import defpackage.koh;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends ffh implements b {
    @Override // com.google.android.gms.common.internal.b
    public final Account zzb() {
        Parcel parcelC = c(e(), 2);
        Account account = (Account) koh.a(parcelC, Account.CREATOR);
        parcelC.recycle();
        return account;
    }
}
