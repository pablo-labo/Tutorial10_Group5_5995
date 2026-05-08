package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.icing.zzu;

/* JADX INFO: loaded from: classes2.dex */
public final class mmi implements Parcelable.Creator<zzu> {
    @Override // android.os.Parcelable.Creator
    public final zzu createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        boolean zL = false;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            if (((char) i) != 1) {
                SafeParcelReader.t(parcel, i);
            } else {
                zL = SafeParcelReader.l(parcel, i);
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new zzu(zL);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzu[] newArray(int i) {
        return new zzu[i];
    }
}
