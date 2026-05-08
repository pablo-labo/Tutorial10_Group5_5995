package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class f8h extends c7h implements h8h {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.h8h
    public final void T(Bundle bundle, j8h j8hVar) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.b);
        int i = z7h.a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(j8hVar);
        c(parcelObtain, 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.h8h
    public final void g(Bundle bundle, r8h r8hVar) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.b);
        int i = z7h.a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(r8hVar);
        c(parcelObtain, 6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.h8h
    public final void u(Bundle bundle, j8h j8hVar) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.b);
        int i = z7h.a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(j8hVar);
        c(parcelObtain, 2);
    }
}
