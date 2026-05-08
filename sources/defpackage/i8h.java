package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i8h extends v7h implements j8h {
    public i8h() {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
    }

    @Override // defpackage.v7h
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 2) {
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) z7h.a(parcel);
            z7h.b(parcel);
            e(bundle);
            return true;
        }
        if (i == 3) {
            Parcelable.Creator creator2 = Bundle.CREATOR;
            Bundle bundle2 = (Bundle) z7h.a(parcel);
            z7h.b(parcel);
            c(bundle2);
            return true;
        }
        if (i == 4) {
            Parcelable.Creator creator3 = Bundle.CREATOR;
            Bundle bundle3 = (Bundle) z7h.a(parcel);
            z7h.b(parcel);
            d(bundle3);
            return true;
        }
        if (i != 5) {
            return false;
        }
        Parcelable.Creator creator4 = Bundle.CREATOR;
        Bundle bundle4 = (Bundle) z7h.a(parcel);
        z7h.b(parcel);
        b(bundle4);
        return true;
    }
}
