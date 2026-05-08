package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class umi extends ifh implements gmi {
    public umi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // defpackage.gmi
    public final void a(Bundle bundle) {
        Parcel parcelC = c();
        nkh.c(parcelC, bundle);
        h(parcelC, 1);
    }
}
