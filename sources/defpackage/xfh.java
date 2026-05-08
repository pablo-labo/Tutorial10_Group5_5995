package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.stats.WakeLockEvent;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class xfh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        int iO = 0;
        int iO2 = 0;
        int iO3 = 0;
        int iO4 = 0;
        boolean zL = false;
        String strF = null;
        ArrayList<String> arrayListH = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        String strF5 = null;
        long jQ = 0;
        long jQ2 = 0;
        long jQ3 = 0;
        float f = 0.0f;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iO = SafeParcelReader.o(parcel, i);
                    break;
                case 2:
                    jQ = SafeParcelReader.q(parcel, i);
                    break;
                case 3:
                case 7:
                case DatadogLogGenerator.CRASH /* 9 */:
                default:
                    SafeParcelReader.t(parcel, i);
                    break;
                case 4:
                    strF = SafeParcelReader.f(parcel, i);
                    break;
                case 5:
                    iO3 = SafeParcelReader.o(parcel, i);
                    break;
                case 6:
                    arrayListH = SafeParcelReader.h(parcel, i);
                    break;
                case '\b':
                    jQ2 = SafeParcelReader.q(parcel, i);
                    break;
                case '\n':
                    strF3 = SafeParcelReader.f(parcel, i);
                    break;
                case 11:
                    iO2 = SafeParcelReader.o(parcel, i);
                    break;
                case '\f':
                    strF2 = SafeParcelReader.f(parcel, i);
                    break;
                case '\r':
                    strF4 = SafeParcelReader.f(parcel, i);
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 14 */:
                    iO4 = SafeParcelReader.o(parcel, i);
                    break;
                case 15:
                    SafeParcelReader.v(parcel, i, 4);
                    f = parcel.readFloat();
                    break;
                case 16:
                    jQ3 = SafeParcelReader.q(parcel, i);
                    break;
                case 17:
                    strF5 = SafeParcelReader.f(parcel, i);
                    break;
                case 18:
                    zL = SafeParcelReader.l(parcel, i);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new WakeLockEvent(iO, jQ, iO2, strF, iO3, arrayListH, strF2, jQ2, iO4, strF3, strF4, f, jQ3, strF5, zL);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new WakeLockEvent[i];
    }
}
