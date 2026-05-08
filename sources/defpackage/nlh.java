package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fido.fido2.api.common.UvmEntry;

/* JADX INFO: loaded from: classes2.dex */
public final class nlh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        int iO = 0;
        short s = 0;
        short s2 = 0;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iO = SafeParcelReader.o(parcel, i);
            } else if (c == 2) {
                SafeParcelReader.v(parcel, i, 4);
                s = (short) parcel.readInt();
            } else if (c != 3) {
                SafeParcelReader.t(parcel, i);
            } else {
                SafeParcelReader.v(parcel, i, 4);
                s2 = (short) parcel.readInt();
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new UvmEntry(iO, s, s2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new UvmEntry[i];
    }
}
