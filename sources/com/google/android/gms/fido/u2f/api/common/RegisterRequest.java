package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import defpackage.b0;
import defpackage.ojd;
import defpackage.v0i;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class RegisterRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RegisterRequest> CREATOR = new v0i();
    public final int a;
    public final ProtocolVersion b;
    public final byte[] c;
    public final String d;

    public RegisterRequest(int i, String str, String str2, byte[] bArr) {
        this.a = i;
        try {
            this.b = ProtocolVersion.a(str);
            this.c = bArr;
            this.d = str2;
        } catch (ProtocolVersion.UnsupportedProtocolException e) {
            b0.s(e);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequest)) {
            return false;
        }
        RegisterRequest registerRequest = (RegisterRequest) obj;
        if (!Arrays.equals(this.c, registerRequest.c) || this.b != registerRequest.b) {
            return false;
        }
        String str = registerRequest.d;
        String str2 = this.d;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = ((Arrays.hashCode(this.c) + 31) * 31) + this.b.hashCode();
        String str = this.d;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.y(parcel, 1, 4);
        parcel.writeInt(this.a);
        ojd.t(parcel, 2, this.b.toString(), false);
        ojd.m(parcel, 3, this.c, false);
        ojd.t(parcel, 4, this.d, false);
        ojd.B(parcel, iA);
    }
}
