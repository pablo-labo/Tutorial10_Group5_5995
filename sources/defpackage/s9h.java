package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.signin.internal.zaa;

/* JADX INFO: loaded from: classes2.dex */
public final class s9h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        Intent intent = null;
        int iO = 0;
        int iO2 = 0;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iO = SafeParcelReader.o(parcel, i);
            } else if (c == 2) {
                iO2 = SafeParcelReader.o(parcel, i);
            } else if (c != 3) {
                SafeParcelReader.t(parcel, i);
            } else {
                intent = (Intent) SafeParcelReader.e(parcel, i, Intent.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new zaa(iO, iO2, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zaa[i];
    }
}
