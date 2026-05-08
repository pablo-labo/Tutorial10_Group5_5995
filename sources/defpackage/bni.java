package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bni extends noh implements gmi {
    @Override // defpackage.noh
    public final boolean c(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        ((jli) this).a((Bundle) nkh.a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
