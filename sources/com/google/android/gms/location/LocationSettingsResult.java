package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.cgh;
import defpackage.ojd;
import defpackage.p7d;

/* JADX INFO: loaded from: classes2.dex */
public final class LocationSettingsResult extends AbstractSafeParcelable implements p7d {
    public static final Parcelable.Creator<LocationSettingsResult> CREATOR = new cgh();
    public final Status a;
    public final LocationSettingsStates b;

    public LocationSettingsResult(Status status, LocationSettingsStates locationSettingsStates) {
        this.a = status;
        this.b = locationSettingsStates;
    }

    @Override // defpackage.p7d
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.s(parcel, 1, this.a, i, false);
        ojd.s(parcel, 2, this.b, i, false);
        ojd.B(parcel, iA);
    }
}
