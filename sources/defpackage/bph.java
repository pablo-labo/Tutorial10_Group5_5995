package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs;
import com.google.android.gms.fido.fido2.api.common.UvmEntries;
import com.google.android.gms.fido.fido2.api.common.zzf;
import com.google.android.gms.fido.fido2.api.common.zzh;

/* JADX INFO: loaded from: classes2.dex */
public final class bph implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        UvmEntries uvmEntries = null;
        zzf zzfVar = null;
        AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs = null;
        zzh zzhVar = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                uvmEntries = (UvmEntries) SafeParcelReader.e(parcel, i, UvmEntries.CREATOR);
            } else if (c == 2) {
                zzfVar = (zzf) SafeParcelReader.e(parcel, i, zzf.CREATOR);
            } else if (c == 3) {
                authenticationExtensionsCredPropsOutputs = (AuthenticationExtensionsCredPropsOutputs) SafeParcelReader.e(parcel, i, AuthenticationExtensionsCredPropsOutputs.CREATOR);
            } else if (c != 4) {
                SafeParcelReader.t(parcel, i);
            } else {
                zzhVar = (zzh) SafeParcelReader.e(parcel, i, zzh.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new AuthenticationExtensionsClientOutputs(uvmEntries, zzfVar, authenticationExtensionsCredPropsOutputs, zzhVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AuthenticationExtensionsClientOutputs[i];
    }
}
