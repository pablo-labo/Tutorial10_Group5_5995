package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.ActivityTransition;
import com.google.android.gms.location.ActivityTransitionRequest;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class b4i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        ArrayList arrayListJ = null;
        String strF = null;
        ArrayList arrayListJ2 = null;
        String strF2 = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                arrayListJ = SafeParcelReader.j(parcel, i, ActivityTransition.CREATOR);
            } else if (c == 2) {
                strF = SafeParcelReader.f(parcel, i);
            } else if (c == 3) {
                arrayListJ2 = SafeParcelReader.j(parcel, i, ClientIdentity.CREATOR);
            } else if (c != 4) {
                SafeParcelReader.t(parcel, i);
            } else {
                strF2 = SafeParcelReader.f(parcel, i);
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new ActivityTransitionRequest(arrayListJ, strF, arrayListJ2, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ActivityTransitionRequest[i];
    }
}
