package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;

/* JADX INFO: loaded from: classes2.dex */
public final class pih implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        String strF = null;
        String strF2 = null;
        byte[] bArrC = null;
        AuthenticatorAttestationResponse authenticatorAttestationResponse = null;
        AuthenticatorAssertionResponse authenticatorAssertionResponse = null;
        AuthenticatorErrorResponse authenticatorErrorResponse = null;
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = null;
        String strF3 = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    strF = SafeParcelReader.f(parcel, i);
                    break;
                case 2:
                    strF2 = SafeParcelReader.f(parcel, i);
                    break;
                case 3:
                    bArrC = SafeParcelReader.c(parcel, i);
                    break;
                case 4:
                    authenticatorAttestationResponse = (AuthenticatorAttestationResponse) SafeParcelReader.e(parcel, i, AuthenticatorAttestationResponse.CREATOR);
                    break;
                case 5:
                    authenticatorAssertionResponse = (AuthenticatorAssertionResponse) SafeParcelReader.e(parcel, i, AuthenticatorAssertionResponse.CREATOR);
                    break;
                case 6:
                    authenticatorErrorResponse = (AuthenticatorErrorResponse) SafeParcelReader.e(parcel, i, AuthenticatorErrorResponse.CREATOR);
                    break;
                case 7:
                    authenticationExtensionsClientOutputs = (AuthenticationExtensionsClientOutputs) SafeParcelReader.e(parcel, i, AuthenticationExtensionsClientOutputs.CREATOR);
                    break;
                case '\b':
                    strF3 = SafeParcelReader.f(parcel, i);
                    break;
                default:
                    SafeParcelReader.t(parcel, i);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new PublicKeyCredential(strF, strF2, bArrC, authenticatorAttestationResponse, authenticatorAssertionResponse, authenticatorErrorResponse, authenticationExtensionsClientOutputs, strF3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PublicKeyCredential[i];
    }
}
