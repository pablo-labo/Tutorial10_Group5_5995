package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.icing.zzh;
import com.google.android.gms.internal.icing.zzk;

/* JADX INFO: loaded from: classes2.dex */
public final class bai implements Parcelable.Creator<zzh> {
    @Override // android.os.Parcelable.Creator
    public final zzh createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        zzk[] zzkVarArr = null;
        Account account = null;
        boolean zL = false;
        String strF = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                zzkVarArr = (zzk[]) SafeParcelReader.i(parcel, i, zzk.CREATOR);
            } else if (c == 2) {
                strF = SafeParcelReader.f(parcel, i);
            } else if (c == 3) {
                zL = SafeParcelReader.l(parcel, i);
            } else if (c != 4) {
                SafeParcelReader.t(parcel, i);
            } else {
                account = (Account) SafeParcelReader.e(parcel, i, Account.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new zzh(zzkVarArr, strF, zL, account);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzh[] newArray(int i) {
        return new zzh[i];
    }
}
