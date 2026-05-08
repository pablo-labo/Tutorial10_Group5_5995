package androidx.media3.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.media3.session.f;
import androidx.media3.session.v;

/* JADX INFO: loaded from: classes.dex */
public interface h extends IInterface {

    public static abstract class a extends Binder implements h {

        /* JADX INFO: renamed from: androidx.media3.session.h$a$a, reason: collision with other inner class name */
        public static class C0060a implements h {
            public IBinder a;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.a;
            }

            @Override // androidx.media3.session.h
            public final void s0(f fVar, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSessionService");
                    parcelObtain.writeStrongInterface(fVar);
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                    this.a.transact(3001, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public static h c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaSessionService");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof h)) {
                return (h) iInterfaceQueryLocalInterface;
            }
            C0060a c0060a = new C0060a();
            c0060a.a = iBinder;
            return c0060a;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("androidx.media3.session.IMediaSessionService");
            }
            if (i == 1598968902) {
                parcel2.writeString("androidx.media3.session.IMediaSessionService");
                return true;
            }
            if (i != 3001) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            ((v.c) this).s0(f.a.c(parcel.readStrongBinder()), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
            return true;
        }
    }

    void s0(f fVar, Bundle bundle);
}
