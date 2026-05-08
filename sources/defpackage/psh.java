package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.location.zzdd;
import com.google.android.gms.internal.location.zzdf;

/* JADX INFO: loaded from: classes2.dex */
public final class psh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        int iO = 1;
        zzdd zzddVar = null;
        IBinder iBinderN = null;
        IBinder iBinderN2 = null;
        PendingIntent pendingIntent = null;
        IBinder iBinderN3 = null;
        String strF = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iO = SafeParcelReader.o(parcel, i);
                    break;
                case 2:
                    zzddVar = (zzdd) SafeParcelReader.e(parcel, i, zzdd.CREATOR);
                    break;
                case 3:
                    iBinderN = SafeParcelReader.n(parcel, i);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) SafeParcelReader.e(parcel, i, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinderN2 = SafeParcelReader.n(parcel, i);
                    break;
                case 6:
                    iBinderN3 = SafeParcelReader.n(parcel, i);
                    break;
                case 7:
                default:
                    SafeParcelReader.t(parcel, i);
                    break;
                case '\b':
                    strF = SafeParcelReader.f(parcel, i);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new zzdf(iO, zzddVar, iBinderN, iBinderN2, pendingIntent, iBinderN3, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzdf[i];
    }
}
