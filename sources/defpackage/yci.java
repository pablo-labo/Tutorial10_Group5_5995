package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.zzj;

/* JADX INFO: loaded from: classes2.dex */
public final class yci implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        Bundle bundleB = null;
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration = null;
        int iO = 0;
        Feature[] featureArr = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                bundleB = SafeParcelReader.b(parcel, i);
            } else if (c == 2) {
                featureArr = (Feature[]) SafeParcelReader.i(parcel, i, Feature.CREATOR);
            } else if (c == 3) {
                iO = SafeParcelReader.o(parcel, i);
            } else if (c != 4) {
                SafeParcelReader.t(parcel, i);
            } else {
                connectionTelemetryConfiguration = (ConnectionTelemetryConfiguration) SafeParcelReader.e(parcel, i, ConnectionTelemetryConfiguration.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, iU);
        zzj zzjVar = new zzj();
        zzjVar.a = bundleB;
        zzjVar.b = featureArr;
        zzjVar.c = iO;
        zzjVar.d = connectionTelemetryConfiguration;
        return zzjVar;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzj[i];
    }
}
