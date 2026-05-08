package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class ugh extends ifh implements igh {
    public ugh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // defpackage.igh
    public final void S(long j, Bundle bundle, String str, String str2) {
        Parcel parcelC = c();
        parcelC.writeString(str);
        parcelC.writeString(str2);
        nkh.c(parcelC, bundle);
        parcelC.writeLong(j);
        h(parcelC, 1);
    }

    @Override // defpackage.igh
    public final int zza() {
        Parcel parcelE = e(c(), 2);
        int i = parcelE.readInt();
        parcelE.recycle();
        return i;
    }
}
