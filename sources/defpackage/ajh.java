package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.measurement.internal.zzan;

/* JADX INFO: loaded from: classes2.dex */
public final class ajh implements Parcelable.Creator<zzan> {
    @Override // android.os.Parcelable.Creator
    public final zzan createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        Bundle bundleB = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            if (((char) i) != 2) {
                SafeParcelReader.t(parcel, i);
            } else {
                bundleB = SafeParcelReader.b(parcel, i);
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new zzan(bundleB);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzan[] newArray(int i) {
        return new zzan[i];
    }
}
