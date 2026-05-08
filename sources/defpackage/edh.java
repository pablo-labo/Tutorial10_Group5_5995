package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes2.dex */
public final class edh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        int iO = 0;
        boolean zL = false;
        boolean zL2 = false;
        boolean zL3 = false;
        int iO2 = 0;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                zL = SafeParcelReader.l(parcel, i);
            } else if (c == 2) {
                zL2 = SafeParcelReader.l(parcel, i);
            } else if (c == 3) {
                zL3 = SafeParcelReader.l(parcel, i);
            } else if (c == 4) {
                iO2 = SafeParcelReader.o(parcel, i);
            } else if (c != 1000) {
                SafeParcelReader.t(parcel, i);
            } else {
                iO = SafeParcelReader.o(parcel, i);
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new CredentialPickerConfig(iO, zL, zL2, zL3, iO2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CredentialPickerConfig[i];
    }
}
