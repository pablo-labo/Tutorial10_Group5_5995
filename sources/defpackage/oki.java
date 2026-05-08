package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.zzp;

/* JADX INFO: loaded from: classes2.dex */
public final class oki implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        boolean zL = false;
        boolean zL2 = false;
        boolean zL3 = false;
        boolean zL4 = false;
        boolean zL5 = false;
        String strF = null;
        IBinder iBinderN = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    strF = SafeParcelReader.f(parcel, i);
                    break;
                case 2:
                    zL = SafeParcelReader.l(parcel, i);
                    break;
                case 3:
                    zL2 = SafeParcelReader.l(parcel, i);
                    break;
                case 4:
                    iBinderN = SafeParcelReader.n(parcel, i);
                    break;
                case 5:
                    zL3 = SafeParcelReader.l(parcel, i);
                    break;
                case 6:
                    zL4 = SafeParcelReader.l(parcel, i);
                    break;
                case 7:
                default:
                    SafeParcelReader.t(parcel, i);
                    break;
                case '\b':
                    zL5 = SafeParcelReader.l(parcel, i);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new zzp(strF, zL, zL2, iBinderN, zL3, zL4, zL5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzp[i];
    }
}
