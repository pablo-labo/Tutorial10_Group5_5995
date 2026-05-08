package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.appindexing.internal.Thing;
import com.google.firebase.appindexing.internal.zza;
import com.google.firebase.appindexing.internal.zzy;

/* JADX INFO: loaded from: classes2.dex */
public final class pmi implements Parcelable.Creator<zzy> {
    @Override // android.os.Parcelable.Creator
    public final zzy createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        int iO = 0;
        Thing[] thingArr = null;
        String[] strArrG = null;
        String[] strArrG2 = null;
        zza zzaVar = null;
        String strF = null;
        String strF2 = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iO = SafeParcelReader.o(parcel, i);
                    break;
                case 2:
                    thingArr = (Thing[]) SafeParcelReader.i(parcel, i, Thing.CREATOR);
                    break;
                case 3:
                    strArrG = SafeParcelReader.g(parcel, i);
                    break;
                case 4:
                default:
                    SafeParcelReader.t(parcel, i);
                    break;
                case 5:
                    strArrG2 = SafeParcelReader.g(parcel, i);
                    break;
                case 6:
                    zzaVar = (zza) SafeParcelReader.e(parcel, i, zza.CREATOR);
                    break;
                case 7:
                    strF = SafeParcelReader.f(parcel, i);
                    break;
                case '\b':
                    strF2 = SafeParcelReader.f(parcel, i);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new zzy(iO, thingArr, strArrG, strArrG2, zzaVar, strF, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzy[] newArray(int i) {
        return new zzy[i];
    }
}
