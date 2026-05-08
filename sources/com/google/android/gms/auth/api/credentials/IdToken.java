package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.fib;
import defpackage.ojd;
import defpackage.xna;
import defpackage.ydh;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class IdToken extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<IdToken> CREATOR = new ydh();
    public final String a;
    public final String b;

    public IdToken(String str, String str2) {
        fib.a("account type string cannot be null or empty", !TextUtils.isEmpty(str));
        fib.a("id token string cannot be null or empty", !TextUtils.isEmpty(str2));
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdToken)) {
            return false;
        }
        IdToken idToken = (IdToken) obj;
        return xna.a(this.a, idToken.a) && xna.a(this.b, idToken.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.t(parcel, 1, this.a, false);
        ojd.t(parcel, 2, this.b, false);
        ojd.B(parcel, iA);
    }
}
