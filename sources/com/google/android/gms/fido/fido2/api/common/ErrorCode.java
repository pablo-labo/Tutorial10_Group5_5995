package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bg;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public enum ErrorCode implements Parcelable {
    NOT_SUPPORTED_ERR(9),
    INVALID_STATE_ERR(11),
    SECURITY_ERR(18),
    NETWORK_ERR(19),
    ABORT_ERR(20),
    TIMEOUT_ERR(23),
    ENCODING_ERR(27),
    UNKNOWN_ERR(28),
    CONSTRAINT_ERR(29),
    DATA_ERR(30),
    NOT_ALLOWED_ERR(35),
    ATTESTATION_NOT_PRIVATE_ERR(36);

    public static final Parcelable.Creator<ErrorCode> CREATOR = new h();
    private final int zzb;

    public static class UnsupportedErrorCodeException extends Exception {
    }

    ErrorCode(int i) {
        this.zzb = i;
    }

    public static ErrorCode c(int i) throws UnsupportedErrorCodeException {
        for (ErrorCode errorCode : values()) {
            if (i == errorCode.zzb) {
                return errorCode;
            }
        }
        Locale locale = Locale.US;
        throw new UnsupportedErrorCodeException(bg.d(i, "Error code ", " is not supported"));
    }

    public final int a() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zzb);
    }
}
