package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.location.zzd;
import com.google.android.gms.location.LastLocationRequest;

/* JADX INFO: loaded from: classes2.dex */
public final class yli implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        long jQ = Long.MAX_VALUE;
        int iO = 0;
        boolean zL = false;
        String strF = null;
        zzd zzdVar = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                jQ = SafeParcelReader.q(parcel, i);
            } else if (c == 2) {
                iO = SafeParcelReader.o(parcel, i);
            } else if (c == 3) {
                zL = SafeParcelReader.l(parcel, i);
            } else if (c == 4) {
                strF = SafeParcelReader.f(parcel, i);
            } else if (c != 5) {
                SafeParcelReader.t(parcel, i);
            } else {
                zzdVar = (zzd) SafeParcelReader.e(parcel, i, zzd.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new LastLocationRequest(jQ, iO, zL, strF, zzdVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LastLocationRequest[i];
    }
}
