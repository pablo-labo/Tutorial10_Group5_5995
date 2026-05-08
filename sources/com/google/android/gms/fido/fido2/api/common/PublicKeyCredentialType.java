package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.l5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class PublicKeyCredentialType implements Parcelable {
    private final String zzb = "public-key";

    /* JADX INFO: Fake field, exist only in values array */
    PublicKeyCredentialType EF2;
    public static final /* synthetic */ PublicKeyCredentialType[] a = {new PublicKeyCredentialType()};
    public static final Parcelable.Creator<PublicKeyCredentialType> CREATOR = new c();

    public static class UnsupportedPublicKeyCredTypeException extends Exception {
    }

    public static PublicKeyCredentialType a(String str) throws UnsupportedPublicKeyCredTypeException {
        for (PublicKeyCredentialType publicKeyCredentialType : values()) {
            if (str.equals(publicKeyCredentialType.zzb)) {
                return publicKeyCredentialType;
            }
        }
        throw new UnsupportedPublicKeyCredTypeException(l5.m("PublicKeyCredentialType ", str, " not supported"));
    }

    public static PublicKeyCredentialType valueOf(String str) {
        return (PublicKeyCredentialType) Enum.valueOf(PublicKeyCredentialType.class, str);
    }

    public static PublicKeyCredentialType[] values() {
        return (PublicKeyCredentialType[]) a.clone();
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
