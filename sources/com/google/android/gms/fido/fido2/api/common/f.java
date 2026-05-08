package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import defpackage.l5;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return AttestationConveyancePreference.a(parcel.readString());
        } catch (AttestationConveyancePreference.UnsupportedAttestationConveyancePreferenceException e) {
            l5.r(e);
            return null;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AttestationConveyancePreference[i];
    }
}
