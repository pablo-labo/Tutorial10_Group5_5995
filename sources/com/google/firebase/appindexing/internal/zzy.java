package com.google.firebase.appindexing.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ojd;
import defpackage.pmi;

/* JADX INFO: loaded from: classes2.dex */
public final class zzy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzy> CREATOR = new pmi();
    public final String V;
    public final int a;
    public final Thing[] b;
    public final String[] c;
    public final String[] d;
    public final zza e;
    public final String f;

    public zzy(int i, Thing[] thingArr, String[] strArr, String[] strArr2, zza zzaVar, String str, String str2) {
        if (i != 0 && i != 1 && i != 2 && i != 3 && i != 4 && i != 6 && i != 7) {
            i = 0;
        }
        this.a = i;
        this.b = thingArr;
        this.c = strArr;
        this.d = strArr2;
        this.e = zzaVar;
        this.f = str;
        this.V = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.y(parcel, 1, 4);
        parcel.writeInt(this.a);
        ojd.w(parcel, 2, this.b, i);
        ojd.u(parcel, 3, this.c);
        ojd.u(parcel, 5, this.d);
        ojd.s(parcel, 6, this.e, i, false);
        ojd.t(parcel, 7, this.f, false);
        ojd.t(parcel, 8, this.V, false);
        ojd.B(parcel, iA);
    }
}
