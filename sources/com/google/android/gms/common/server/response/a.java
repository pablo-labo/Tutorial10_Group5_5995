package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.server.response.FastJsonResponse;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        String strF = null;
        String strF2 = null;
        zaa zaaVar = null;
        int iO = 0;
        int iO2 = 0;
        boolean zL = false;
        int iO3 = 0;
        boolean zL2 = false;
        int iO4 = 0;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iO = SafeParcelReader.o(parcel, i);
                    break;
                case 2:
                    iO2 = SafeParcelReader.o(parcel, i);
                    break;
                case 3:
                    zL = SafeParcelReader.l(parcel, i);
                    break;
                case 4:
                    iO3 = SafeParcelReader.o(parcel, i);
                    break;
                case 5:
                    zL2 = SafeParcelReader.l(parcel, i);
                    break;
                case 6:
                    strF = SafeParcelReader.f(parcel, i);
                    break;
                case 7:
                    iO4 = SafeParcelReader.o(parcel, i);
                    break;
                case '\b':
                    strF2 = SafeParcelReader.f(parcel, i);
                    break;
                case DatadogLogGenerator.CRASH /* 9 */:
                    zaaVar = (zaa) SafeParcelReader.e(parcel, i, zaa.CREATOR);
                    break;
                default:
                    SafeParcelReader.t(parcel, i);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new FastJsonResponse.Field(iO, iO2, zL, iO3, zL2, strF, iO4, strF2, zaaVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FastJsonResponse.Field[i];
    }
}
