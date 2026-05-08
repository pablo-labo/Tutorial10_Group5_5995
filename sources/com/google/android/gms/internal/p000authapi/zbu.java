package com.google.android.gms.internal.p000authapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.afh;
import defpackage.ojd;

/* JADX INFO: loaded from: classes2.dex */
public final class zbu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zbu> CREATOR = new afh();
    public final Credential a;

    public zbu(Credential credential) {
        this.a = credential;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.s(parcel, 1, this.a, i, false);
        ojd.B(parcel, iA);
    }
}
