package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ojd;
import defpackage.p7d;
import defpackage.rbh;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zag extends AbstractSafeParcelable implements p7d {
    public static final Parcelable.Creator<zag> CREATOR = new rbh();
    public final List a;
    public final String b;

    public zag(String str, ArrayList arrayList) {
        this.a = arrayList;
        this.b = str;
    }

    @Override // defpackage.p7d
    public final Status a() {
        return this.b != null ? Status.e : Status.X;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.v(parcel, 1, this.a);
        ojd.t(parcel, 2, this.b, false);
        ojd.B(parcel, iA);
    }
}
