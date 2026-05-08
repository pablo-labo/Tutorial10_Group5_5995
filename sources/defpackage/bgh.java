package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import defpackage.mhh;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bgh extends noh implements igh {
    @Override // defpackage.noh
    public final boolean c(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            int iIdentityHashCode = System.identityHashCode(((mhh.c) this).a);
            parcel2.writeNoException();
            parcel2.writeInt(iIdentityHashCode);
            return true;
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        mhh.c cVar = (mhh.c) this;
        cVar.S(parcel.readLong(), (Bundle) nkh.a(parcel, Bundle.CREATOR), string, string2);
        parcel2.writeNoException();
        return true;
    }
}
