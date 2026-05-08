package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.edh;
import defpackage.ojd;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class CredentialPickerConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CredentialPickerConfig> CREATOR = new edh();
    public final int a;
    public final boolean b;
    public final boolean c;
    public final int d;

    public CredentialPickerConfig(int i, boolean z, boolean z2, boolean z3, int i2) {
        this.a = i;
        this.b = z;
        this.c = z2;
        if (i < 2) {
            this.d = true == z3 ? 3 : 1;
        } else {
            this.d = i2;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.y(parcel, 1, 4);
        parcel.writeInt(this.b ? 1 : 0);
        ojd.y(parcel, 2, 4);
        parcel.writeInt(this.c ? 1 : 0);
        int i2 = this.d;
        int i3 = i2 != 3 ? 0 : 1;
        ojd.y(parcel, 3, 4);
        parcel.writeInt(i3);
        ojd.y(parcel, 4, 4);
        parcel.writeInt(i2);
        ojd.y(parcel, 1000, 4);
        parcel.writeInt(this.a);
        ojd.B(parcel, iA);
    }
}
