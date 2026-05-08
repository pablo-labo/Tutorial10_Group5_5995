package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.fib;
import defpackage.ojd;
import defpackage.wdh;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class HintRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<HintRequest> CREATOR = new wdh();
    public final String V;
    public final String W;
    public final int a;
    public final CredentialPickerConfig b;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    public final boolean f;

    public HintRequest(int i, CredentialPickerConfig credentialPickerConfig, boolean z, boolean z2, String[] strArr, boolean z3, String str, String str2) {
        this.a = i;
        fib.i(credentialPickerConfig);
        this.b = credentialPickerConfig;
        this.c = z;
        this.d = z2;
        fib.i(strArr);
        this.e = strArr;
        if (i < 2) {
            this.f = true;
            this.V = null;
            this.W = null;
        } else {
            this.f = z3;
            this.V = str;
            this.W = str2;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.s(parcel, 1, this.b, i, false);
        ojd.y(parcel, 2, 4);
        parcel.writeInt(this.c ? 1 : 0);
        ojd.y(parcel, 3, 4);
        parcel.writeInt(this.d ? 1 : 0);
        ojd.u(parcel, 4, this.e);
        ojd.y(parcel, 5, 4);
        parcel.writeInt(this.f ? 1 : 0);
        ojd.t(parcel, 6, this.V, false);
        ojd.t(parcel, 7, this.W, false);
        ojd.y(parcel, 1000, 4);
        parcel.writeInt(this.a);
        ojd.B(parcel, iA);
    }
}
