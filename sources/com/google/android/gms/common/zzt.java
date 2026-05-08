package com.google.android.gms.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.gai;
import defpackage.hdi;
import defpackage.jmi;
import defpackage.ojd;
import defpackage.tli;
import defpackage.tn6;
import defpackage.uli;
import defpackage.vna;

/* JADX INFO: loaded from: classes2.dex */
public final class zzt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzt> CREATOR = new tli();
    public final String a;
    public final hdi b;
    public final boolean c;
    public final boolean d;

    public zzt(String str, IBinder iBinder, boolean z, boolean z2) {
        this.a = str;
        hdi hdiVar = null;
        if (iBinder != null) {
            try {
                int i = gai.b;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                tn6 tn6VarZzd = (iInterfaceQueryLocalInterface instanceof jmi ? (jmi) iInterfaceQueryLocalInterface : new uli(iBinder, "com.google.android.gms.common.internal.ICertData")).zzd();
                byte[] bArr = tn6VarZzd == null ? null : (byte[]) vna.h(tn6VarZzd);
                if (bArr != null) {
                    hdiVar = new hdi(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.b = hdiVar;
        this.c = z;
        this.d = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.t(parcel, 1, this.a, false);
        hdi hdiVar = this.b;
        if (hdiVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            hdiVar = null;
        }
        ojd.o(parcel, 2, hdiVar);
        ojd.y(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        ojd.y(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        ojd.B(parcel, iA);
    }

    public zzt(String str, hdi hdiVar, boolean z, boolean z2) {
        this.a = str;
        this.b = hdiVar;
        this.c = z;
        this.d = z2;
    }
}
