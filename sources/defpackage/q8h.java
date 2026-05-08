package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class q8h extends v7h implements r8h {
    public q8h() {
        super("com.google.android.play.core.integrity.protocol.IRequestDialogCallback");
    }

    @Override // defpackage.v7h
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 2) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) z7h.a(parcel);
        z7h.b(parcel);
        b(bundle);
        return true;
    }
}
