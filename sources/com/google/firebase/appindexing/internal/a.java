package com.google.firebase.appindexing.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.appindexing.internal.Thing;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Parcelable.Creator<Thing> {
    @Override // android.os.Parcelable.Creator
    public final Thing createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        int iO = 0;
        Bundle bundleB = null;
        Thing.zza zzaVar = null;
        String strF = null;
        String strF2 = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                bundleB = SafeParcelReader.b(parcel, i);
            } else if (c == 2) {
                zzaVar = (Thing.zza) SafeParcelReader.e(parcel, i, Thing.zza.CREATOR);
            } else if (c == 3) {
                strF = SafeParcelReader.f(parcel, i);
            } else if (c == 4) {
                strF2 = SafeParcelReader.f(parcel, i);
            } else if (c != 1000) {
                SafeParcelReader.t(parcel, i);
            } else {
                iO = SafeParcelReader.o(parcel, i);
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new Thing(iO, bundleB, zzaVar, strF, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Thing[] newArray(int i) {
        return new Thing[i];
    }
}
