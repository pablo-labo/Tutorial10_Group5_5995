package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;

/* JADX INFO: loaded from: classes2.dex */
public final class nji implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = null;
        Uri uri = null;
        byte[] bArrC = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 2) {
                publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) SafeParcelReader.e(parcel, i, PublicKeyCredentialRequestOptions.CREATOR);
            } else if (c == 3) {
                uri = (Uri) SafeParcelReader.e(parcel, i, Uri.CREATOR);
            } else if (c != 4) {
                SafeParcelReader.t(parcel, i);
            } else {
                bArrC = SafeParcelReader.c(parcel, i);
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new BrowserPublicKeyCredentialRequestOptions(publicKeyCredentialRequestOptions, uri, bArrC);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new BrowserPublicKeyCredentialRequestOptions[i];
    }
}
