package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;

/* JADX INFO: loaded from: classes2.dex */
public final class c9h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        boolean zL = false;
        int iO = 0;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                zL = SafeParcelReader.l(parcel, i);
            } else if (c != 2) {
                SafeParcelReader.t(parcel, i);
            } else {
                iO = SafeParcelReader.o(parcel, i);
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new ModuleAvailabilityResponse(iO, zL);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ModuleAvailabilityResponse[i];
    }
}
