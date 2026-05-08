package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.measurement.internal.zzao;
import com.google.android.gms.measurement.internal.zzkq;
import com.google.android.gms.measurement.internal.zzw;

/* JADX INFO: loaded from: classes2.dex */
public final class dni implements Parcelable.Creator<zzw> {
    @Override // android.os.Parcelable.Creator
    public final zzw createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        String strF = null;
        String strF2 = null;
        zzkq zzkqVar = null;
        String strF3 = null;
        zzao zzaoVar = null;
        zzao zzaoVar2 = null;
        zzao zzaoVar3 = null;
        long jQ = 0;
        long jQ2 = 0;
        long jQ3 = 0;
        boolean zL = false;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    strF = SafeParcelReader.f(parcel, i);
                    break;
                case 3:
                    strF2 = SafeParcelReader.f(parcel, i);
                    break;
                case 4:
                    zzkqVar = (zzkq) SafeParcelReader.e(parcel, i, zzkq.CREATOR);
                    break;
                case 5:
                    jQ = SafeParcelReader.q(parcel, i);
                    break;
                case 6:
                    zL = SafeParcelReader.l(parcel, i);
                    break;
                case 7:
                    strF3 = SafeParcelReader.f(parcel, i);
                    break;
                case '\b':
                    zzaoVar = (zzao) SafeParcelReader.e(parcel, i, zzao.CREATOR);
                    break;
                case DatadogLogGenerator.CRASH /* 9 */:
                    jQ2 = SafeParcelReader.q(parcel, i);
                    break;
                case '\n':
                    zzaoVar2 = (zzao) SafeParcelReader.e(parcel, i, zzao.CREATOR);
                    break;
                case 11:
                    jQ3 = SafeParcelReader.q(parcel, i);
                    break;
                case '\f':
                    zzaoVar3 = (zzao) SafeParcelReader.e(parcel, i, zzao.CREATOR);
                    break;
                default:
                    SafeParcelReader.t(parcel, i);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new zzw(strF, strF2, zzkqVar, jQ, zL, strF3, zzaoVar, jQ2, zzaoVar2, jQ3, zzaoVar3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzw[] newArray(int i) {
        return new zzw[i];
    }
}
