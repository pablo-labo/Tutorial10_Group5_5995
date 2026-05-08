package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.location.zzdh;
import com.google.android.gms.location.GeofencingRequest;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class oii implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        String strF = "";
        ArrayList arrayListJ = null;
        int iO = 0;
        String strF2 = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                arrayListJ = SafeParcelReader.j(parcel, i, zzdh.CREATOR);
            } else if (c == 2) {
                iO = SafeParcelReader.o(parcel, i);
            } else if (c == 3) {
                strF = SafeParcelReader.f(parcel, i);
            } else if (c != 4) {
                SafeParcelReader.t(parcel, i);
            } else {
                strF2 = SafeParcelReader.f(parcel, i);
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new GeofencingRequest(arrayListJ, iO, strF, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GeofencingRequest[i];
    }
}
