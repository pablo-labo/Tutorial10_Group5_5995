package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class mih implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = null;
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = null;
        byte[] bArrC = null;
        ArrayList arrayListJ = null;
        Double dM = null;
        ArrayList arrayListJ2 = null;
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = null;
        Integer numP = null;
        TokenBinding tokenBinding = null;
        String strF = null;
        AuthenticationExtensions authenticationExtensions = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) SafeParcelReader.e(parcel, i, PublicKeyCredentialRpEntity.CREATOR);
                    break;
                case 3:
                    publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) SafeParcelReader.e(parcel, i, PublicKeyCredentialUserEntity.CREATOR);
                    break;
                case 4:
                    bArrC = SafeParcelReader.c(parcel, i);
                    break;
                case 5:
                    arrayListJ = SafeParcelReader.j(parcel, i, PublicKeyCredentialParameters.CREATOR);
                    break;
                case 6:
                    dM = SafeParcelReader.m(parcel, i);
                    break;
                case 7:
                    arrayListJ2 = SafeParcelReader.j(parcel, i, PublicKeyCredentialDescriptor.CREATOR);
                    break;
                case '\b':
                    authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) SafeParcelReader.e(parcel, i, AuthenticatorSelectionCriteria.CREATOR);
                    break;
                case DatadogLogGenerator.CRASH /* 9 */:
                    numP = SafeParcelReader.p(parcel, i);
                    break;
                case '\n':
                    tokenBinding = (TokenBinding) SafeParcelReader.e(parcel, i, TokenBinding.CREATOR);
                    break;
                case 11:
                    strF = SafeParcelReader.f(parcel, i);
                    break;
                case '\f':
                    authenticationExtensions = (AuthenticationExtensions) SafeParcelReader.e(parcel, i, AuthenticationExtensions.CREATOR);
                    break;
                default:
                    SafeParcelReader.t(parcel, i);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, bArrC, arrayListJ, dM, arrayListJ2, authenticatorSelectionCriteria, numP, tokenBinding, strF, authenticationExtensions);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PublicKeyCredentialCreationOptions[i];
    }
}
