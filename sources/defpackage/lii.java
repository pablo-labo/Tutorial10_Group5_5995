package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;

/* JADX INFO: loaded from: classes2.dex */
public final class lii implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = null;
        Uri uri = null;
        byte[] bArrC = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 2) {
                publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) SafeParcelReader.e(parcel, i, PublicKeyCredentialCreationOptions.CREATOR);
            } else if (c == 3) {
                uri = (Uri) SafeParcelReader.e(parcel, i, Uri.CREATOR);
            } else if (c != 4) {
                SafeParcelReader.t(parcel, i);
            } else {
                bArrC = SafeParcelReader.c(parcel, i);
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new BrowserPublicKeyCredentialCreationOptions(publicKeyCredentialCreationOptions, uri, bArrC);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new BrowserPublicKeyCredentialCreationOptions[i];
    }
}
