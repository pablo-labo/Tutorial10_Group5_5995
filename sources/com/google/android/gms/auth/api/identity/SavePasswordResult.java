package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.fib;
import defpackage.ojd;
import defpackage.ueh;
import defpackage.xna;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class SavePasswordResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SavePasswordResult> CREATOR = new ueh();
    public final PendingIntent a;

    public SavePasswordResult(PendingIntent pendingIntent) {
        fib.i(pendingIntent);
        this.a = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SavePasswordResult) {
            return xna.a(this.a, ((SavePasswordResult) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.s(parcel, 1, this.a, i, false);
        ojd.B(parcel, iA);
    }
}
