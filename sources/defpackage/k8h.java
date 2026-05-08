package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class k8h extends c7h implements m8h {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.m8h
    public final void g(Bundle bundle, r8h r8hVar) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.b);
        int i = z7h.a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(r8hVar);
        c(parcelObtain, 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.m8h
    public final void o(Bundle bundle, p8h p8hVar) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.b);
        int i = z7h.a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(p8hVar);
        c(parcelObtain, 2);
    }
}
