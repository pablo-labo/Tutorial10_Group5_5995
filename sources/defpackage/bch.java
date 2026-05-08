package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes2.dex */
public final class bch implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        int iO = -1;
        int iO2 = 0;
        int iO3 = 0;
        int iO4 = 0;
        int iO5 = 0;
        String strF = null;
        String strF2 = null;
        long jQ = 0;
        long jQ2 = 0;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iO2 = SafeParcelReader.o(parcel, i);
                    break;
                case 2:
                    iO3 = SafeParcelReader.o(parcel, i);
                    break;
                case 3:
                    iO4 = SafeParcelReader.o(parcel, i);
                    break;
                case 4:
                    jQ = SafeParcelReader.q(parcel, i);
                    break;
                case 5:
                    jQ2 = SafeParcelReader.q(parcel, i);
                    break;
                case 6:
                    strF = SafeParcelReader.f(parcel, i);
                    break;
                case 7:
                    strF2 = SafeParcelReader.f(parcel, i);
                    break;
                case '\b':
                    iO5 = SafeParcelReader.o(parcel, i);
                    break;
                case DatadogLogGenerator.CRASH /* 9 */:
                    iO = SafeParcelReader.o(parcel, i);
                    break;
                default:
                    SafeParcelReader.t(parcel, i);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new MethodInvocation(iO2, iO3, iO4, jQ, jQ2, strF, strF2, iO5, iO);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MethodInvocation[i];
    }
}
