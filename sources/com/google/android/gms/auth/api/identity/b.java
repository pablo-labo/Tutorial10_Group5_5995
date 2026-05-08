package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        boolean zL = false;
        boolean zL2 = false;
        boolean zL3 = false;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        ArrayList<String> arrayListH = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    zL = SafeParcelReader.l(parcel, i);
                    break;
                case 2:
                    strF = SafeParcelReader.f(parcel, i);
                    break;
                case 3:
                    strF2 = SafeParcelReader.f(parcel, i);
                    break;
                case 4:
                    zL2 = SafeParcelReader.l(parcel, i);
                    break;
                case 5:
                    strF3 = SafeParcelReader.f(parcel, i);
                    break;
                case 6:
                    arrayListH = SafeParcelReader.h(parcel, i);
                    break;
                case 7:
                    zL3 = SafeParcelReader.l(parcel, i);
                    break;
                default:
                    SafeParcelReader.t(parcel, i);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new BeginSignInRequest.GoogleIdTokenRequestOptions(zL, strF, strF2, zL2, strF3, arrayListH, zL3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new BeginSignInRequest.GoogleIdTokenRequestOptions[i];
    }
}
