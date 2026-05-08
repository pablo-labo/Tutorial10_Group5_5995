package defpackage;

import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class pli extends ffh implements dn6 {
    @Override // defpackage.dn6
    public final void cancel() {
        Parcel parcelE = e();
        try {
            this.a.transact(2, parcelE, null, 1);
        } finally {
            parcelE.recycle();
        }
    }
}
