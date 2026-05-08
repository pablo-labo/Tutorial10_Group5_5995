package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.l5;

/* JADX INFO: loaded from: classes2.dex */
public enum AttestationConveyancePreference implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    NONE("none"),
    /* JADX INFO: Fake field, exist only in values array */
    INDIRECT("indirect"),
    /* JADX INFO: Fake field, exist only in values array */
    DIRECT("direct");

    public static final Parcelable.Creator<AttestationConveyancePreference> CREATOR = new f();
    private final String zzb;

    public static class UnsupportedAttestationConveyancePreferenceException extends Exception {
    }

    AttestationConveyancePreference(String str) {
        this.zzb = str;
    }

    public static AttestationConveyancePreference a(String str) throws UnsupportedAttestationConveyancePreferenceException {
        for (AttestationConveyancePreference attestationConveyancePreference : values()) {
            if (str.equals(attestationConveyancePreference.zzb)) {
                return attestationConveyancePreference;
            }
        }
        throw new UnsupportedAttestationConveyancePreferenceException(l5.m("Attestation conveyance preference ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzb);
    }
}
