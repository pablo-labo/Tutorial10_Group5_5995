package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cph;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public enum ErrorCode implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    OK(0),
    OTHER_ERROR(1),
    /* JADX INFO: Fake field, exist only in values array */
    BAD_REQUEST(2),
    /* JADX INFO: Fake field, exist only in values array */
    CONFIGURATION_UNSUPPORTED(3),
    /* JADX INFO: Fake field, exist only in values array */
    DEVICE_INELIGIBLE(4),
    /* JADX INFO: Fake field, exist only in values array */
    TIMEOUT(5);

    public static final Parcelable.Creator<ErrorCode> CREATOR = new cph();
    private final int zzc;

    ErrorCode(int i) {
        this.zzc = i;
    }

    public static ErrorCode c(int i) {
        for (ErrorCode errorCode : values()) {
            if (i == errorCode.zzc) {
                return errorCode;
            }
        }
        return OTHER_ERROR;
    }

    public final int a() {
        return this.zzc;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zzc);
    }
}
