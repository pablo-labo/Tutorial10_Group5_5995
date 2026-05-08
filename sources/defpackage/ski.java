package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.icing.zzo;
import com.google.android.gms.internal.icing.zzw;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ski implements Parcelable.Creator<zzo> {
    @Override // android.os.Parcelable.Creator
    public final zzo createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        Status status = null;
        ArrayList arrayListJ = null;
        String[] strArrG = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                status = (Status) SafeParcelReader.e(parcel, i, Status.CREATOR);
            } else if (c == 2) {
                arrayListJ = SafeParcelReader.j(parcel, i, zzw.CREATOR);
            } else if (c != 3) {
                SafeParcelReader.t(parcel, i);
            } else {
                strArrG = SafeParcelReader.g(parcel, i);
            }
        }
        SafeParcelReader.k(parcel, iU);
        zzo zzoVar = new zzo();
        zzoVar.a = status;
        zzoVar.b = arrayListJ;
        zzoVar.c = strArrG;
        return zzoVar;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzo[] newArray(int i) {
        return new zzo[i];
    }
}
