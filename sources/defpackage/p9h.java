package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.converter.zaa;

/* JADX INFO: loaded from: classes2.dex */
public final class p9h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        StringToIntConverter stringToIntConverter = null;
        int iO = 0;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iO = SafeParcelReader.o(parcel, i);
            } else if (c != 2) {
                SafeParcelReader.t(parcel, i);
            } else {
                stringToIntConverter = (StringToIntConverter) SafeParcelReader.e(parcel, i, StringToIntConverter.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new zaa(iO, stringToIntConverter);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zaa[i];
    }
}
