package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.SleepClassifyEvent;

/* JADX INFO: loaded from: classes2.dex */
public final class hhh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        int iO = 0;
        int iO2 = 0;
        int iO3 = 0;
        int iO4 = 0;
        int iO5 = 0;
        int iO6 = 0;
        int iO7 = 0;
        boolean zL = false;
        int iO8 = 0;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iO = SafeParcelReader.o(parcel, i);
                    break;
                case 2:
                    iO2 = SafeParcelReader.o(parcel, i);
                    break;
                case 3:
                    iO3 = SafeParcelReader.o(parcel, i);
                    break;
                case 4:
                    iO4 = SafeParcelReader.o(parcel, i);
                    break;
                case 5:
                    iO5 = SafeParcelReader.o(parcel, i);
                    break;
                case 6:
                    iO6 = SafeParcelReader.o(parcel, i);
                    break;
                case 7:
                    iO7 = SafeParcelReader.o(parcel, i);
                    break;
                case '\b':
                    zL = SafeParcelReader.l(parcel, i);
                    break;
                case DatadogLogGenerator.CRASH /* 9 */:
                    iO8 = SafeParcelReader.o(parcel, i);
                    break;
                default:
                    SafeParcelReader.t(parcel, i);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new SleepClassifyEvent(iO, iO2, iO3, iO4, iO5, iO6, iO7, zL, iO8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SleepClassifyEvent[i];
    }
}
