package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ojd;
import defpackage.p7d;
import defpackage.y3i;

/* JADX INFO: loaded from: classes2.dex */
public final class zzg extends AbstractSafeParcelable implements p7d {
    public static final Parcelable.Creator<zzg> CREATOR;
    public final Status a;

    static {
        new zzg(Status.e);
        CREATOR = new y3i();
    }

    public zzg(Status status) {
        this.a = status;
    }

    @Override // defpackage.p7d
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.s(parcel, 1, this.a, i, false);
        ojd.B(parcel, iA);
    }
}
