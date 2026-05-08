package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.accounttransfer.zzs;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class oli implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        int iO = 0;
        ArrayList<String> arrayListH = null;
        ArrayList<String> arrayListH2 = null;
        ArrayList<String> arrayListH3 = null;
        ArrayList<String> arrayListH4 = null;
        ArrayList<String> arrayListH5 = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iO = SafeParcelReader.o(parcel, i);
                    break;
                case 2:
                    arrayListH = SafeParcelReader.h(parcel, i);
                    break;
                case 3:
                    arrayListH2 = SafeParcelReader.h(parcel, i);
                    break;
                case 4:
                    arrayListH3 = SafeParcelReader.h(parcel, i);
                    break;
                case 5:
                    arrayListH4 = SafeParcelReader.h(parcel, i);
                    break;
                case 6:
                    arrayListH5 = SafeParcelReader.h(parcel, i);
                    break;
                default:
                    SafeParcelReader.t(parcel, i);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new zzs(iO, arrayListH, arrayListH2, arrayListH3, arrayListH4, arrayListH5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzs[i];
    }
}
