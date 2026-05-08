package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.measurement.internal.zzkq;

/* JADX INFO: loaded from: classes2.dex */
public final class tei implements Parcelable.Creator<zzkq> {
    @Override // android.os.Parcelable.Creator
    public final zzkq createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        int iO = 0;
        String strF = null;
        Long lR = null;
        Float fValueOf = null;
        String strF2 = null;
        String strF3 = null;
        Double dM = null;
        long jQ = 0;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iO = SafeParcelReader.o(parcel, i);
                    break;
                case 2:
                    strF = SafeParcelReader.f(parcel, i);
                    break;
                case 3:
                    jQ = SafeParcelReader.q(parcel, i);
                    break;
                case 4:
                    lR = SafeParcelReader.r(parcel, i);
                    break;
                case 5:
                    int iS = SafeParcelReader.s(parcel, i);
                    if (iS != 0) {
                        SafeParcelReader.w(parcel, iS, 4);
                        fValueOf = Float.valueOf(parcel.readFloat());
                    } else {
                        fValueOf = null;
                    }
                    break;
                case 6:
                    strF2 = SafeParcelReader.f(parcel, i);
                    break;
                case 7:
                    strF3 = SafeParcelReader.f(parcel, i);
                    break;
                case '\b':
                    dM = SafeParcelReader.m(parcel, i);
                    break;
                default:
                    SafeParcelReader.t(parcel, i);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new zzkq(iO, strF, jQ, lR, fValueOf, strF2, strF3, dM);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzkq[] newArray(int i) {
        return new zzkq[i];
    }
}
