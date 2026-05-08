package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.m6;
import defpackage.ojd;
import defpackage.ufh;
import defpackage.xna;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ApiMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ApiMetadata> CREATOR = ufh.a;
    public static final ApiMetadata d;
    public final ComplianceOptions a;
    public final boolean b;
    public boolean c;

    static {
        ApiMetadata apiMetadata = new ApiMetadata(null, false);
        apiMetadata.c = false;
        d = apiMetadata;
        new ApiMetadata(null, false).c = true;
    }

    public ApiMetadata(ComplianceOptions complianceOptions, boolean z) {
        this.a = complianceOptions;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ApiMetadata)) {
            return false;
        }
        ApiMetadata apiMetadata = (ApiMetadata) obj;
        return xna.a(this.a, apiMetadata.a) && this.c == apiMetadata.c && this.b == apiMetadata.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.c), Boolean.valueOf(this.b)});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        return m6.h(new StringBuilder(strValueOf.length() + 31), "ApiMetadata(complianceOptions=", strValueOf, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.c) {
            parcel.setDataPosition(parcel.dataPosition() - 4);
            parcel.setDataSize(parcel.dataSize() - 4);
            return;
        }
        parcel.writeInt(-204102970);
        int iA = ojd.A(parcel, 20293);
        ojd.s(parcel, 1, this.a, i, false);
        ojd.y(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        ojd.B(parcel, iA);
    }
}
