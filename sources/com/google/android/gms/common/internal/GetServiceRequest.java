package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ahi;

/* JADX INFO: loaded from: classes2.dex */
public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new ahi();
    public static final Scope[] d0 = new Scope[0];
    public static final Feature[] e0 = new Feature[0];
    public Bundle V;
    public Account W;
    public Feature[] X;
    public Feature[] Y;
    public final boolean Z;
    public final int a;
    public final int a0;
    public final int b;
    public boolean b0;
    public final int c;
    public final String c0;
    public String d;
    public IBinder e;
    public Scope[] f;

    public GetServiceRequest(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z, int i4, boolean z2, String str2) {
        scopeArr = scopeArr == null ? d0 : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        Feature[] featureArr3 = e0;
        featureArr = featureArr == null ? featureArr3 : featureArr;
        featureArr2 = featureArr2 == null ? featureArr3 : featureArr2;
        this.a = i;
        this.b = i2;
        this.c = i3;
        if ("com.google.android.gms".equals(str)) {
            this.d = "com.google.android.gms";
        } else {
            this.d = str;
        }
        if (i < 2) {
            Account accountZzb = null;
            if (iBinder != null) {
                int i5 = b.a.a;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                b cVar = iInterfaceQueryLocalInterface instanceof b ? (b) iInterfaceQueryLocalInterface : new c(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
                int i6 = a.b;
                long jClearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        accountZzb = cVar.zzb();
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                    }
                } finally {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                }
            }
            this.W = accountZzb;
        } else {
            this.e = iBinder;
            this.W = account;
        }
        this.f = scopeArr;
        this.V = bundle;
        this.X = featureArr;
        this.Y = featureArr2;
        this.Z = z;
        this.a0 = i4;
        this.b0 = z2;
        this.c0 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ahi.a(this, parcel, i);
    }
}
