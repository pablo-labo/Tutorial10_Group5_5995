package defpackage;

import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.e47;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bq1 extends Binder {
    public static final int b;
    public final e47<Bundle> a;

    static {
        b = Build.VERSION.SDK_INT >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : 65536;
    }

    public bq1(List<Bundle> list) {
        this.a = e47.j(list);
    }

    public static e47<Bundle> a(IBinder iBinder) {
        int i;
        if (iBinder instanceof bq1) {
            return ((bq1) iBinder).a;
        }
        e47.b bVar = e47.b;
        e47.a aVar = new e47.a();
        int i2 = 0;
        int i3 = 1;
        while (i3 != 0) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInt(i2);
                try {
                    iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                    while (true) {
                        i = parcelObtain2.readInt();
                        if (i == 1) {
                            Bundle bundle = parcelObtain2.readBundle();
                            bundle.getClass();
                            aVar.c(bundle);
                            i2++;
                        }
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    i3 = i;
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            } catch (Throwable th) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th;
            }
        }
        return aVar.f();
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        if (parcel2 == null) {
            return false;
        }
        e47<Bundle> e47Var = this.a;
        int size = e47Var.size();
        int i3 = parcel.readInt();
        while (i3 < size && parcel2.dataSize() < b) {
            parcel2.writeInt(1);
            parcel2.writeBundle(e47Var.get(i3));
            i3++;
        }
        parcel2.writeInt(i3 < size ? 2 : 0);
        return true;
    }
}
