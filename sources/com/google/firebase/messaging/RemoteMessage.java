package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bmi;
import defpackage.ht0;
import defpackage.ojd;

/* JADX INFO: loaded from: classes2.dex */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new bmi();
    public final Bundle a;
    public ht0 b;

    public RemoteMessage(Bundle bundle) {
        this.a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.l(parcel, 2, this.a);
        ojd.B(parcel, iA);
    }
}
