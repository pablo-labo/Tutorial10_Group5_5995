package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.fib;
import defpackage.ojd;
import defpackage.sdh;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class CredentialRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CredentialRequest> CREATOR = new sdh();
    public final String V;
    public final String W;
    public final boolean X;
    public final int a;
    public final boolean b;
    public final String[] c;
    public final CredentialPickerConfig d;
    public final CredentialPickerConfig e;
    public final boolean f;

    public CredentialRequest(int i, boolean z, String[] strArr, CredentialPickerConfig credentialPickerConfig, CredentialPickerConfig credentialPickerConfig2, boolean z2, String str, String str2, boolean z3) {
        this.a = i;
        this.b = z;
        fib.i(strArr);
        this.c = strArr;
        this.d = credentialPickerConfig == null ? new CredentialPickerConfig(2, false, true, false, 1) : credentialPickerConfig;
        this.e = credentialPickerConfig2 == null ? new CredentialPickerConfig(2, false, true, false, 1) : credentialPickerConfig2;
        if (i < 3) {
            this.f = true;
            this.V = null;
            this.W = null;
        } else {
            this.f = z2;
            this.V = str;
            this.W = str2;
        }
        this.X = z3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.y(parcel, 1, 4);
        parcel.writeInt(this.b ? 1 : 0);
        ojd.u(parcel, 2, this.c);
        ojd.s(parcel, 3, this.d, i, false);
        ojd.s(parcel, 4, this.e, i, false);
        ojd.y(parcel, 5, 4);
        parcel.writeInt(this.f ? 1 : 0);
        ojd.t(parcel, 6, this.V, false);
        ojd.t(parcel, 7, this.W, false);
        ojd.y(parcel, 8, 4);
        parcel.writeInt(this.X ? 1 : 0);
        ojd.y(parcel, 1000, 4);
        parcel.writeInt(this.a);
        ojd.B(parcel, iA);
    }
}
