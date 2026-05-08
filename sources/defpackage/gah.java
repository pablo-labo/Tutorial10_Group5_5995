package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class gah implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        ArrayList arrayListJ = null;
        String strF = null;
        boolean zL = false;
        String strF2 = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                arrayListJ = SafeParcelReader.j(parcel, i, Feature.CREATOR);
            } else if (c == 2) {
                zL = SafeParcelReader.l(parcel, i);
            } else if (c == 3) {
                strF2 = SafeParcelReader.f(parcel, i);
            } else if (c != 4) {
                SafeParcelReader.t(parcel, i);
            } else {
                strF = SafeParcelReader.f(parcel, i);
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new ApiFeatureRequest(arrayListJ, zL, strF2, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ApiFeatureRequest[i];
    }
}
