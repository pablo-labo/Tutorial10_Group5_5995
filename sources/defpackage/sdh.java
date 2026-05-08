package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes2.dex */
public final class sdh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        int iO = 0;
        boolean zL = false;
        boolean zL2 = false;
        boolean zL3 = false;
        String[] strArrG = null;
        CredentialPickerConfig credentialPickerConfig = null;
        CredentialPickerConfig credentialPickerConfig2 = null;
        String strF = null;
        String strF2 = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c != 1000) {
                switch (c) {
                    case 1:
                        zL = SafeParcelReader.l(parcel, i);
                        break;
                    case 2:
                        strArrG = SafeParcelReader.g(parcel, i);
                        break;
                    case 3:
                        credentialPickerConfig = (CredentialPickerConfig) SafeParcelReader.e(parcel, i, CredentialPickerConfig.CREATOR);
                        break;
                    case 4:
                        credentialPickerConfig2 = (CredentialPickerConfig) SafeParcelReader.e(parcel, i, CredentialPickerConfig.CREATOR);
                        break;
                    case 5:
                        zL2 = SafeParcelReader.l(parcel, i);
                        break;
                    case 6:
                        strF = SafeParcelReader.f(parcel, i);
                        break;
                    case 7:
                        strF2 = SafeParcelReader.f(parcel, i);
                        break;
                    case '\b':
                        zL3 = SafeParcelReader.l(parcel, i);
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
        return new CredentialRequest(iO, zL, strArrG, credentialPickerConfig, credentialPickerConfig2, zL2, strF, strF2, zL3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CredentialRequest[i];
    }
}
