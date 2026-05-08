package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.SleepSegmentEvent;

/* JADX INFO: loaded from: classes2.dex */
public final class nhh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        long jQ = 0;
        long jQ2 = 0;
        int iO = 0;
        int iO2 = 0;
        int iO3 = 0;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                jQ = SafeParcelReader.q(parcel, i);
            } else if (c == 2) {
                jQ2 = SafeParcelReader.q(parcel, i);
            } else if (c == 3) {
                iO = SafeParcelReader.o(parcel, i);
            } else if (c == 4) {
                iO2 = SafeParcelReader.o(parcel, i);
            } else if (c != 5) {
                SafeParcelReader.t(parcel, i);
            } else {
                iO3 = SafeParcelReader.o(parcel, i);
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new SleepSegmentEvent(jQ, iO, iO2, iO3, jQ2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SleepSegmentEvent[i];
    }
}
