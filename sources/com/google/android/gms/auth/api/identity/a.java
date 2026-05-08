package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        BeginSignInRequest.PasswordRequestOptions passwordRequestOptions = null;
        BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptions = null;
        String strF = null;
        BeginSignInRequest.PasskeysRequestOptions passkeysRequestOptions = null;
        BeginSignInRequest.PasskeyJsonRequestOptions passkeyJsonRequestOptions = null;
        boolean zL = false;
        int iO = 0;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    passwordRequestOptions = (BeginSignInRequest.PasswordRequestOptions) SafeParcelReader.e(parcel, i, BeginSignInRequest.PasswordRequestOptions.CREATOR);
                    break;
                case 2:
                    googleIdTokenRequestOptions = (BeginSignInRequest.GoogleIdTokenRequestOptions) SafeParcelReader.e(parcel, i, BeginSignInRequest.GoogleIdTokenRequestOptions.CREATOR);
                    break;
                case 3:
                    strF = SafeParcelReader.f(parcel, i);
                    break;
                case 4:
                    zL = SafeParcelReader.l(parcel, i);
                    break;
                case 5:
                    iO = SafeParcelReader.o(parcel, i);
                    break;
                case 6:
                    passkeysRequestOptions = (BeginSignInRequest.PasskeysRequestOptions) SafeParcelReader.e(parcel, i, BeginSignInRequest.PasskeysRequestOptions.CREATOR);
                    break;
                case 7:
                    passkeyJsonRequestOptions = (BeginSignInRequest.PasskeyJsonRequestOptions) SafeParcelReader.e(parcel, i, BeginSignInRequest.PasskeyJsonRequestOptions.CREATOR);
                    break;
                default:
                    SafeParcelReader.t(parcel, i);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new BeginSignInRequest(passwordRequestOptions, googleIdTokenRequestOptions, strF, zL, iO, passkeysRequestOptions, passkeyJsonRequestOptions);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new BeginSignInRequest[i];
    }
}
