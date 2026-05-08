package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.icing.zzm;

/* JADX INFO: loaded from: classes2.dex */
public final class xji implements Parcelable.Creator<zzm> {
    @Override // android.os.Parcelable.Creator
    public final zzm createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        int iO = 0;
        Bundle bundleB = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iO = SafeParcelReader.o(parcel, i);
            } else if (c != 2) {
                SafeParcelReader.t(parcel, i);
            } else {
                bundleB = SafeParcelReader.b(parcel, i);
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new zzm(iO, bundleB);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzm[] newArray(int i) {
        return new zzm[i];
    }
}
