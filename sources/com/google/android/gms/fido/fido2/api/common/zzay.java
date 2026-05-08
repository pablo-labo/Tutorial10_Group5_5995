package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.l5;
import defpackage.xjh;

/* JADX INFO: loaded from: classes2.dex */
public enum zzay implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    USER_VERIFICATION_REQUIRED("required"),
    /* JADX INFO: Fake field, exist only in values array */
    USER_VERIFICATION_PREFERRED("preferred"),
    /* JADX INFO: Fake field, exist only in values array */
    USER_VERIFICATION_DISCOURAGED("discouraged");

    public static final Parcelable.Creator<zzay> CREATOR = new xjh();
    private final String zze;

    zzay(String str) {
        this.zze = str;
    }

    public static zzay a(String str) throws zzax {
        for (zzay zzayVar : values()) {
            if (str.equals(zzayVar.zze)) {
                return zzayVar;
            }
        }
        throw new zzax(l5.m("User verification requirement ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zze;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zze);
    }
}
