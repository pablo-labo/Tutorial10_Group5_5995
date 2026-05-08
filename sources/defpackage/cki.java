package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.accounttransfer.zzo;
import com.google.android.gms.auth.api.accounttransfer.zzs;
import com.google.android.gms.auth.api.accounttransfer.zzu;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class cki implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        ArrayList arrayList = null;
        zzs zzsVar = null;
        int i2 = 0;
        while (parcel.dataPosition() < iU) {
            int i3 = parcel.readInt();
            char c = (char) i3;
            if (c == 1) {
                int iO = SafeParcelReader.o(parcel, i3);
                hashSet.add(1);
                i2 = iO;
            } else if (c == 2) {
                ArrayList arrayListJ = SafeParcelReader.j(parcel, i3, zzu.CREATOR);
                hashSet.add(2);
                arrayList = arrayListJ;
            } else if (c == 3) {
                int iO2 = SafeParcelReader.o(parcel, i3);
                hashSet.add(3);
                i = iO2;
            } else if (c != 4) {
                SafeParcelReader.t(parcel, i3);
            } else {
                zzs zzsVar2 = (zzs) SafeParcelReader.e(parcel, i3, zzs.CREATOR);
                hashSet.add(4);
                zzsVar = zzsVar2;
            }
        }
        if (parcel.dataPosition() == iU) {
            return new zzo(hashSet, i2, arrayList, i, zzsVar);
        }
        throw new SafeParcelReader.ParseException(p6.c(iU, "Overread allowed size end="), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzo[i];
    }
}
