package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes2.dex */
public final class wdh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        CredentialPickerConfig credentialPickerConfig = null;
        String[] strArrG = null;
        String strF = null;
        String strF2 = null;
        int iO = 0;
        boolean zL = false;
        boolean zL2 = false;
        boolean zL3 = false;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c != 1000) {
                switch (c) {
                    case 1:
                        credentialPickerConfig = (CredentialPickerConfig) SafeParcelReader.e(parcel, i, CredentialPickerConfig.CREATOR);
                        break;
                    case 2:
                        zL = SafeParcelReader.l(parcel, i);
                        break;
                    case 3:
                        zL2 = SafeParcelReader.l(parcel, i);
                        break;
                    case 4:
                        strArrG = SafeParcelReader.g(parcel, i);
                        break;
                    case 5:
                        zL3 = SafeParcelReader.l(parcel, i);
                        break;
                    case 6:
                        strF = SafeParcelReader.f(parcel, i);
                        break;
                    case 7:
                        strF2 = SafeParcelReader.f(parcel, i);
                        break;
                    default:
                        SafeParcelReader.t(parcel, i);
                        break;
                }
            } else {
                iO = SafeParcelReader.o(parcel, i);
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new HintRequest(iO, credentialPickerConfig, zL, zL2, strArrG, zL3, strF, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new HintRequest[i];
    }
}
