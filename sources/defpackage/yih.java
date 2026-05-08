package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class yih implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        byte[] bArrC = null;
        Double dM = null;
        String strF = null;
        ArrayList arrayListJ = null;
        Integer numP = null;
        TokenBinding tokenBinding = null;
        String strF2 = null;
        AuthenticationExtensions authenticationExtensions = null;
        Long lR = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    bArrC = SafeParcelReader.c(parcel, i);
                    break;
                case 3:
                    dM = SafeParcelReader.m(parcel, i);
                    break;
                case 4:
                    strF = SafeParcelReader.f(parcel, i);
                    break;
                case 5:
                    arrayListJ = SafeParcelReader.j(parcel, i, PublicKeyCredentialDescriptor.CREATOR);
                    break;
                case 6:
                    numP = SafeParcelReader.p(parcel, i);
                    break;
                case 7:
                    tokenBinding = (TokenBinding) SafeParcelReader.e(parcel, i, TokenBinding.CREATOR);
                    break;
                case '\b':
                    strF2 = SafeParcelReader.f(parcel, i);
                    break;
                case DatadogLogGenerator.CRASH /* 9 */:
                    authenticationExtensions = (AuthenticationExtensions) SafeParcelReader.e(parcel, i, AuthenticationExtensions.CREATOR);
                    break;
                case '\n':
                    lR = SafeParcelReader.r(parcel, i);
                    break;
                default:
                    SafeParcelReader.t(parcel, i);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new PublicKeyCredentialRequestOptions(bArrC, dM, strF, arrayListJ, numP, tokenBinding, strF2, authenticationExtensions, lR);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PublicKeyCredentialRequestOptions[i];
    }
}
