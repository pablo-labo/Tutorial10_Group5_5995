package com.google.android.gms.recaptchabase;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ojd;
import defpackage.skh;
import defpackage.xna;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ExecuteRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ExecuteRequest> CREATOR = new skh();
    public String a;
    public String b;

    public ExecuteRequest() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ExecuteRequest) {
            ExecuteRequest executeRequest = (ExecuteRequest) obj;
            if (xna.a(this.a, executeRequest.a) && xna.a(this.b, executeRequest.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.t(parcel, 1, this.a, false);
        ojd.t(parcel, 2, this.b, false);
        ojd.B(parcel, iA);
    }
}
