package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.location.zzdb;

/* JADX INFO: loaded from: classes2.dex */
public final class ksh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        int iO = 0;
        IBinder iBinderN = null;
        IBinder iBinderN2 = null;
        PendingIntent pendingIntent = null;
        String strF = null;
        String strF2 = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iO = SafeParcelReader.o(parcel, i);
                    break;
                case 2:
                    iBinderN = SafeParcelReader.n(parcel, i);
                    break;
                case 3:
                    iBinderN2 = SafeParcelReader.n(parcel, i);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) SafeParcelReader.e(parcel, i, PendingIntent.CREATOR);
                    break;
                case 5:
                    strF = SafeParcelReader.f(parcel, i);
                    break;
                case 6:
                    strF2 = SafeParcelReader.f(parcel, i);
                    break;
                default:
                    SafeParcelReader.t(parcel, i);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new zzdb(iO, iBinderN, iBinderN2, pendingIntent, strF, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzdb[i];
    }
}
