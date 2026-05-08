package com.google.android.gms.internal.icing;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ojd;
import defpackage.p7d;
import defpackage.ski;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzo extends AbstractSafeParcelable implements p7d {
    public static final Parcelable.Creator<zzo> CREATOR = new ski();
    public Status a;
    public ArrayList b;

    @Deprecated
    public String[] c;

    @Override // defpackage.p7d
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.s(parcel, 1, this.a, i, false);
        ojd.x(parcel, 2, this.b, false);
        ojd.u(parcel, 3, this.c);
        ojd.B(parcel, iA);
    }
}
