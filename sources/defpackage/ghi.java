package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.internal.zzn;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ghi implements Parcelable.Creator<zzn> {
    @Override // android.os.Parcelable.Creator
    public final zzn createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        String strF5 = null;
        String strF6 = null;
        String strF7 = null;
        Boolean boolValueOf = null;
        ArrayList<String> arrayListH = null;
        String strF8 = null;
        long jQ = 0;
        long jQ2 = 0;
        long jQ3 = 0;
        long jQ4 = 0;
        long jQ5 = 0;
        boolean zL = true;
        boolean zL2 = true;
        boolean zL3 = true;
        boolean zL4 = false;
        int iO = 0;
        boolean zL5 = false;
        long jQ6 = -2147483648L;
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
                    strF3 = SafeParcelReader.f(parcel, i);
                    break;
                case 5:
                    strF4 = SafeParcelReader.f(parcel, i);
                    break;
                case 6:
                    jQ = SafeParcelReader.q(parcel, i);
                    break;
                case 7:
                    jQ2 = SafeParcelReader.q(parcel, i);
                    break;
                case '\b':
                    strF5 = SafeParcelReader.f(parcel, i);
                    break;
                case DatadogLogGenerator.CRASH /* 9 */:
                    zL = SafeParcelReader.l(parcel, i);
                    break;
                case '\n':
                    zL4 = SafeParcelReader.l(parcel, i);
                    break;
                case 11:
                    jQ6 = SafeParcelReader.q(parcel, i);
                    break;
                case '\f':
                    strF6 = SafeParcelReader.f(parcel, i);
                    break;
                case '\r':
                    jQ3 = SafeParcelReader.q(parcel, i);
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 14 */:
                    jQ4 = SafeParcelReader.q(parcel, i);
                    break;
                case 15:
                    iO = SafeParcelReader.o(parcel, i);
                    break;
                case 16:
                    zL2 = SafeParcelReader.l(parcel, i);
                    break;
                case 17:
                    zL3 = SafeParcelReader.l(parcel, i);
                    break;
                case 18:
                    zL5 = SafeParcelReader.l(parcel, i);
                    break;
                case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                    strF7 = SafeParcelReader.f(parcel, i);
                    break;
                case 20:
                default:
                    SafeParcelReader.t(parcel, i);
                    break;
                case 21:
                    int iS = SafeParcelReader.s(parcel, i);
                    if (iS != 0) {
                        SafeParcelReader.w(parcel, iS, 4);
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                    } else {
                        boolValueOf = null;
                    }
                    break;
                case 22:
                    jQ5 = SafeParcelReader.q(parcel, i);
                    break;
                case 23:
                    arrayListH = SafeParcelReader.h(parcel, i);
                    break;
                case 24:
                    strF8 = SafeParcelReader.f(parcel, i);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new zzn(strF, strF2, strF3, strF4, jQ, jQ2, strF5, zL, zL4, jQ6, strF6, jQ3, jQ4, iO, zL2, zL3, zL5, strF7, boolValueOf, jQ5, arrayListH, strF8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzn[] newArray(int i) {
        return new zzn[i];
    }
}
