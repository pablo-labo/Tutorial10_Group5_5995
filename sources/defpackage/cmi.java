package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.accounttransfer.zzu;
import com.google.android.gms.auth.api.accounttransfer.zzw;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class cmi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        int i2;
        int iU = SafeParcelReader.u(parcel);
        HashSet hashSet = new HashSet();
        int iO = 0;
        zzw zzwVar = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        loop0: while (true) {
            i = iO;
            while (parcel.dataPosition() < iU) {
                i2 = parcel.readInt();
                char c = (char) i2;
                if (c != 1) {
                    if (c == 2) {
                        zzw zzwVar2 = (zzw) SafeParcelReader.e(parcel, i2, zzw.CREATOR);
                        hashSet.add(2);
                        zzwVar = zzwVar2;
                    } else if (c == 3) {
                        String strF = SafeParcelReader.f(parcel, i2);
                        hashSet.add(3);
                        str = strF;
                    } else if (c == 4) {
                        String strF2 = SafeParcelReader.f(parcel, i2);
                        hashSet.add(4);
                        str2 = strF2;
                    } else if (c != 5) {
                        SafeParcelReader.t(parcel, i2);
                    } else {
                        String strF3 = SafeParcelReader.f(parcel, i2);
                        hashSet.add(5);
                        str3 = strF3;
                    }
                }
            }
            iO = SafeParcelReader.o(parcel, i2);
            hashSet.add(1);
        }
        if (parcel.dataPosition() == iU) {
            return new zzu(hashSet, i, zzwVar, str, str2, str3);
        }
        throw new SafeParcelReader.ParseException(p6.c(iU, "Overread allowed size end="), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzu[i];
    }
}
