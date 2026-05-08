package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class w0i implements quh, IInterface {
    public final IBinder a;

    public w0i(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    public final Parcel c(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.a.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    @Override // defpackage.quh
    public final String getId() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        Parcel parcelC = c(parcelObtain, 1);
        String string = parcelC.readString();
        parcelC.recycle();
        return string;
    }

    @Override // defpackage.quh
    public final boolean zzb() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        int i = dph.a;
        parcelObtain.writeInt(1);
        Parcel parcelC = c(parcelObtain, 2);
        boolean z = parcelC.readInt() != 0;
        parcelC.recycle();
        return z;
    }

    @Override // defpackage.quh
    public final boolean zzc() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        Parcel parcelC = c(parcelObtain, 6);
        int i = dph.a;
        boolean z = parcelC.readInt() != 0;
        parcelC.recycle();
        return z;
    }
}
