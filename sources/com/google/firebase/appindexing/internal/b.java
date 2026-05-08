package com.google.firebase.appindexing.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.appindexing.internal.Thing;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements Parcelable.Creator<Thing.zza> {
    @Override // android.os.Parcelable.Creator
    public final Thing.zza createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        boolean zL = false;
        String strF = null;
        Bundle bundleB = null;
        int iO = 0;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                zL = SafeParcelReader.l(parcel, i);
            } else if (c == 2) {
                iO = SafeParcelReader.o(parcel, i);
            } else if (c == 3) {
                strF = SafeParcelReader.f(parcel, i);
            } else if (c != 4) {
                SafeParcelReader.t(parcel, i);
            } else {
                bundleB = SafeParcelReader.b(parcel, i);
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new Thing.zza(zL, iO, strF, bundleB);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Thing.zza[] newArray(int i) {
        return new Thing.zza[i];
    }
}
