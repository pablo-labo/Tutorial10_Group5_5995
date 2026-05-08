package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;

/* JADX INFO: loaded from: classes2.dex */
public final class cbh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        int iO = 0;
        int iO2 = 0;
        int iO3 = 0;
        Long lR = null;
        Long lR2 = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iO = SafeParcelReader.o(parcel, i);
            } else if (c == 2) {
                iO2 = SafeParcelReader.o(parcel, i);
            } else if (c == 3) {
                lR = SafeParcelReader.r(parcel, i);
            } else if (c == 4) {
                lR2 = SafeParcelReader.r(parcel, i);
            } else if (c != 5) {
                SafeParcelReader.t(parcel, i);
            } else {
                iO3 = SafeParcelReader.o(parcel, i);
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new ModuleInstallStatusUpdate(iO, iO2, lR, lR2, iO3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ModuleInstallStatusUpdate[i];
    }
}
