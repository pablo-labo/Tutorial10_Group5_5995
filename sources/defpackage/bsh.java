package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension;
import com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension;
import com.google.android.gms.fido.fido2.api.common.zzab;
import com.google.android.gms.fido.fido2.api.common.zzad;
import com.google.android.gms.fido.fido2.api.common.zzag;
import com.google.android.gms.fido.fido2.api.common.zzai;
import com.google.android.gms.fido.fido2.api.common.zzs;
import com.google.android.gms.fido.fido2.api.common.zzu;
import com.google.android.gms.fido.fido2.api.common.zzz;

/* JADX INFO: loaded from: classes2.dex */
public final class bsh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        FidoAppIdExtension fidoAppIdExtension = null;
        zzs zzsVar = null;
        UserVerificationMethodExtension userVerificationMethodExtension = null;
        zzz zzzVar = null;
        zzab zzabVar = null;
        zzad zzadVar = null;
        zzu zzuVar = null;
        zzag zzagVar = null;
        GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension = null;
        zzai zzaiVar = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    fidoAppIdExtension = (FidoAppIdExtension) SafeParcelReader.e(parcel, i, FidoAppIdExtension.CREATOR);
                    break;
                case 3:
                    zzsVar = (zzs) SafeParcelReader.e(parcel, i, zzs.CREATOR);
                    break;
                case 4:
                    userVerificationMethodExtension = (UserVerificationMethodExtension) SafeParcelReader.e(parcel, i, UserVerificationMethodExtension.CREATOR);
                    break;
                case 5:
                    zzzVar = (zzz) SafeParcelReader.e(parcel, i, zzz.CREATOR);
                    break;
                case 6:
                    zzabVar = (zzab) SafeParcelReader.e(parcel, i, zzab.CREATOR);
                    break;
                case 7:
                    zzadVar = (zzad) SafeParcelReader.e(parcel, i, zzad.CREATOR);
                    break;
                case '\b':
                    zzuVar = (zzu) SafeParcelReader.e(parcel, i, zzu.CREATOR);
                    break;
                case DatadogLogGenerator.CRASH /* 9 */:
                    zzagVar = (zzag) SafeParcelReader.e(parcel, i, zzag.CREATOR);
                    break;
                case '\n':
                    googleThirdPartyPaymentExtension = (GoogleThirdPartyPaymentExtension) SafeParcelReader.e(parcel, i, GoogleThirdPartyPaymentExtension.CREATOR);
                    break;
                case 11:
                    zzaiVar = (zzai) SafeParcelReader.e(parcel, i, zzai.CREATOR);
                    break;
                default:
                    SafeParcelReader.t(parcel, i);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new AuthenticationExtensions(fidoAppIdExtension, zzsVar, userVerificationMethodExtension, zzzVar, zzabVar, zzadVar, zzuVar, zzagVar, googleThirdPartyPaymentExtension, zzaiVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AuthenticationExtensions[i];
    }
}
