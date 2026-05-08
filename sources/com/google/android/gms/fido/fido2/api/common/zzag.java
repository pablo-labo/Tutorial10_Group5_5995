package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.fib;
import defpackage.ojd;
import defpackage.rhh;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzag extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzag> CREATOR = new rhh();
    public final String a;

    public zzag(String str) {
        fib.i(str);
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzag) {
            return this.a.equals(((zzag) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.t(parcel, 1, this.a, false);
        ojd.B(parcel, iA);
    }
}
