package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.location.zzdh;

/* JADX INFO: loaded from: classes2.dex */
public final class rsh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        String strF = null;
        int iO = 0;
        short s = 0;
        int iO2 = 0;
        double d = 0.0d;
        double d2 = 0.0d;
        float f = 0.0f;
        long jQ = 0;
        int iO3 = -1;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    strF = SafeParcelReader.f(parcel, i);
                    break;
                case 2:
                    jQ = SafeParcelReader.q(parcel, i);
                    break;
                case 3:
                    SafeParcelReader.v(parcel, i, 4);
                    s = (short) parcel.readInt();
                    break;
                case 4:
                    SafeParcelReader.v(parcel, i, 8);
                    d = parcel.readDouble();
                    break;
                case 5:
                    SafeParcelReader.v(parcel, i, 8);
                    d2 = parcel.readDouble();
                    break;
                case 6:
                    SafeParcelReader.v(parcel, i, 4);
                    f = parcel.readFloat();
                    break;
                case 7:
                    iO = SafeParcelReader.o(parcel, i);
                    break;
                case '\b':
                    iO2 = SafeParcelReader.o(parcel, i);
                    break;
                case DatadogLogGenerator.CRASH /* 9 */:
                    iO3 = SafeParcelReader.o(parcel, i);
                    break;
                default:
                    SafeParcelReader.t(parcel, i);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new zzdh(strF, iO, s, d, d2, f, jQ, iO2, iO3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzdh[i];
    }
}
