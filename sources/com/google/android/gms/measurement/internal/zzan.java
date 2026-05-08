package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ajh;
import defpackage.ojd;
import defpackage.sih;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class zzan extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzan> CREATOR = new ajh();
    public final Bundle a;

    public zzan(Bundle bundle) {
        this.a = bundle;
    }

    public final Double R0() {
        return Double.valueOf(this.a.getDouble("value"));
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        sih sihVar = new sih();
        sihVar.a = this.a.keySet().iterator();
        return sihVar;
    }

    public final String n1() {
        return this.a.getString("currency");
    }

    public final Bundle s0() {
        return new Bundle(this.a);
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.l(parcel, 2, s0());
        ojd.B(parcel, iA);
    }
}
