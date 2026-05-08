package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.fib;
import defpackage.kmi;
import defpackage.ojd;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class FidoAppIdExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FidoAppIdExtension> CREATOR = new kmi();
    public final String a;

    public FidoAppIdExtension(String str) {
        fib.i(str);
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FidoAppIdExtension) {
            return this.a.equals(((FidoAppIdExtension) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.t(parcel, 2, this.a, false);
        ojd.B(parcel, iA);
    }
}
