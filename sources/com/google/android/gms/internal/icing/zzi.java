package com.google.android.gms.internal.icing;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.l6;
import defpackage.ojd;
import defpackage.u40;
import defpackage.ufi;

/* JADX INFO: loaded from: classes2.dex */
public final class zzi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzi> CREATOR = new ufi();
    public final String a;
    public final String b;
    public final String c;

    public zzi(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String toString() {
        return l6.i(u40.f("DocumentId[packageName=", this.a, ", corpusName=", this.b, ", uri="), this.c, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.t(parcel, 1, this.a, false);
        ojd.t(parcel, 2, this.b, false);
        ojd.t(parcel, 3, this.c, false);
        ojd.B(parcel, iA);
    }
}
