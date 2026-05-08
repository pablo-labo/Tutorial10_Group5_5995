package com.google.firebase.appindexing.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ojd;
import defpackage.xkh;

/* JADX INFO: loaded from: classes2.dex */
public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zza> CREATOR = new xkh();
    public final Bundle V;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final zzc e;
    public final String f;

    public zza(String str, String str2, String str3, String str4, zzc zzcVar, String str5, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = zzcVar;
        this.f = str5;
        if (bundle != null) {
            this.V = bundle;
        } else {
            this.V = Bundle.EMPTY;
        }
        this.V.setClassLoader(zza.class.getClassLoader());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionImpl { { actionType: '");
        sb.append(this.a);
        sb.append("' } { objectName: '");
        sb.append(this.b);
        sb.append("' } { objectUrl: '");
        sb.append(this.c);
        sb.append("' } ");
        String str = this.d;
        if (str != null) {
            sb.append("{ objectSameAs: '");
            sb.append(str);
            sb.append("' } ");
        }
        zzc zzcVar = this.e;
        if (zzcVar != null) {
            sb.append("{ metadata: '");
            sb.append(zzcVar.toString());
            sb.append("' } ");
        }
        String str2 = this.f;
        if (str2 != null) {
            sb.append("{ actionStatus: '");
            sb.append(str2);
            sb.append("' } ");
        }
        Bundle bundle = this.V;
        if (!bundle.isEmpty()) {
            sb.append("{ ");
            sb.append(bundle);
            sb.append(" } ");
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.t(parcel, 1, this.a, false);
        ojd.t(parcel, 2, this.b, false);
        ojd.t(parcel, 3, this.c, false);
        ojd.t(parcel, 4, this.d, false);
        ojd.s(parcel, 5, this.e, i, false);
        ojd.t(parcel, 6, this.f, false);
        ojd.l(parcel, 7, this.V);
        ojd.B(parcel, iA);
    }
}
