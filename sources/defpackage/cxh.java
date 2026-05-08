package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class cxh extends ifh implements esh {
    @Override // defpackage.esh
    public final Bundle a(Bundle bundle) {
        Parcel parcelC = c();
        nkh.c(parcelC, bundle);
        Parcel parcelE = e(parcelC, 1);
        Bundle bundle2 = (Bundle) nkh.a(parcelE, Bundle.CREATOR);
        parcelE.recycle();
        return bundle2;
    }
}
