package com.google.android.gms.recaptchabase;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.hxh;
import defpackage.ojd;

/* JADX INFO: loaded from: classes2.dex */
public final class InitRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<InitRequest> CREATOR = new hxh();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof InitRequest);
    }

    public final int hashCode() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ojd.B(parcel, ojd.A(parcel, 20293));
    }
}
