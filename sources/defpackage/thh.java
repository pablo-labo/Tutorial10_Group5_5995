package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.measurement.zzae;

/* JADX INFO: loaded from: classes2.dex */
public final class thh implements Parcelable.Creator<zzae> {
    @Override // android.os.Parcelable.Creator
    public final zzae createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        long jQ = 0;
        long jQ2 = 0;
        boolean zL = false;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        Bundle bundleB = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    jQ = SafeParcelReader.q(parcel, i);
                    break;
                case 2:
                    jQ2 = SafeParcelReader.q(parcel, i);
                    break;
                case 3:
                    zL = SafeParcelReader.l(parcel, i);
                    break;
                case 4:
                    strF = SafeParcelReader.f(parcel, i);
                    break;
                case 5:
                    strF2 = SafeParcelReader.f(parcel, i);
                    break;
                case 6:
                    strF3 = SafeParcelReader.f(parcel, i);
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
        return new zzae(jQ, jQ2, zL, strF, strF2, strF3, bundleB);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzae[] newArray(int i) {
        return new zzae[i];
    }
}
