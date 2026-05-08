package com.google.android.gms.recaptchabase;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.n0i;
import defpackage.ojd;

/* JADX INFO: loaded from: classes2.dex */
public final class InitResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<InitResult> CREATOR = new n0i();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof InitResult);
    }

    public final int hashCode() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ojd.B(parcel, ojd.A(parcel, 20293));
    }
}
