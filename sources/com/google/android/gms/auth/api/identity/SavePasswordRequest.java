package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.fib;
import defpackage.ojd;
import defpackage.seh;
import defpackage.xna;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class SavePasswordRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SavePasswordRequest> CREATOR = new seh();
    public final SignInPassword a;
    public final String b;
    public final int c;

    public SavePasswordRequest(SignInPassword signInPassword, String str, int i) {
        fib.i(signInPassword);
        this.a = signInPassword;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SavePasswordRequest)) {
            return false;
        }
        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) obj;
        return xna.a(this.a, savePasswordRequest.a) && xna.a(this.b, savePasswordRequest.b) && this.c == savePasswordRequest.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.s(parcel, 1, this.a, i, false);
        ojd.t(parcel, 2, this.b, false);
        ojd.y(parcel, 3, 4);
        parcel.writeInt(this.c);
        ojd.B(parcel, iA);
    }
}
