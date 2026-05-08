package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.appindexing.internal.zzg;

/* JADX INFO: loaded from: classes2.dex */
public final class xwh implements Parcelable.Creator<zzg> {
    @Override // android.os.Parcelable.Creator
    public final zzg createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        int iO = 0;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            if (((char) i) != 1) {
                SafeParcelReader.t(parcel, i);
            } else {
                iO = SafeParcelReader.o(parcel, i);
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new zzg(iO);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzg[] newArray(int i) {
        return new zzg[i];
    }
}
