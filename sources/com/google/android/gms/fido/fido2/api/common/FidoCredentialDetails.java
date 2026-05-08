package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ojd;
import defpackage.smi;
import defpackage.xna;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class FidoCredentialDetails extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FidoCredentialDetails> CREATOR = new smi();
    public final long V;
    public final String a;
    public final String b;
    public final byte[] c;
    public final byte[] d;
    public final boolean e;
    public final boolean f;

    public FidoCredentialDetails(String str, String str2, byte[] bArr, byte[] bArr2, boolean z, boolean z2, long j) {
        this.a = str;
        this.b = str2;
        this.c = bArr;
        this.d = bArr2;
        this.e = z;
        this.f = z2;
        this.V = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FidoCredentialDetails)) {
            return false;
        }
        FidoCredentialDetails fidoCredentialDetails = (FidoCredentialDetails) obj;
        return xna.a(this.a, fidoCredentialDetails.a) && xna.a(this.b, fidoCredentialDetails.b) && Arrays.equals(this.c, fidoCredentialDetails.c) && Arrays.equals(this.d, fidoCredentialDetails.d) && this.e == fidoCredentialDetails.e && this.f == fidoCredentialDetails.f && this.V == fidoCredentialDetails.V;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Boolean.valueOf(this.e), Boolean.valueOf(this.f), Long.valueOf(this.V)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.t(parcel, 1, this.a, false);
        ojd.t(parcel, 2, this.b, false);
        ojd.m(parcel, 3, this.c, false);
        ojd.m(parcel, 4, this.d, false);
        ojd.y(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        ojd.y(parcel, 6, 4);
        parcel.writeInt(this.f ? 1 : 0);
        ojd.y(parcel, 7, 8);
        parcel.writeLong(this.V);
        ojd.B(parcel, iA);
    }
}
