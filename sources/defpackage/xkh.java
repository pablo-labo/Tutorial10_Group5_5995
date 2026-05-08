package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.appindexing.internal.zza;
import com.google.firebase.appindexing.internal.zzc;

/* JADX INFO: loaded from: classes2.dex */
public final class xkh implements Parcelable.Creator<zza> {
    @Override // android.os.Parcelable.Creator
    public final zza createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        zzc zzcVar = null;
        String strF5 = null;
        Bundle bundleB = null;
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
                    strF3 = SafeParcelReader.f(parcel, i);
                    break;
                case 4:
                    strF4 = SafeParcelReader.f(parcel, i);
                    break;
                case 5:
                    zzcVar = (zzc) SafeParcelReader.e(parcel, i, zzc.CREATOR);
                    break;
                case 6:
                    strF5 = SafeParcelReader.f(parcel, i);
                    break;
                case 7:
                    bundleB = SafeParcelReader.b(parcel, i);
                    break;
                default:
                    SafeParcelReader.t(parcel, i);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new zza(strF, strF2, strF3, strF4, zzcVar, strF5, bundleB);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zza[] newArray(int i) {
        return new zza[i];
    }
}
