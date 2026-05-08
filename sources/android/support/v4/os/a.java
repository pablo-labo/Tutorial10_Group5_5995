package android.support.v4.os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import io.jsonwebtoken.JwtParser;

/* JADX INFO: loaded from: classes.dex */
public interface a extends IInterface {
    public static final String i = "android$support$v4$os$IResultReceiver".replace('$', JwtParser.SEPARATOR_CHAR);

    /* JADX INFO: renamed from: android.support.v4.os.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0004a extends Binder implements a {
        public static final /* synthetic */ int a = 0;

        /* JADX INFO: renamed from: android.support.v4.os.a$a$a, reason: collision with other inner class name */
        public static class C0005a implements a {
            public IBinder a;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.a;
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = a.i;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            ResultReceiver.this.a(parcel.readInt(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
            return true;
        }
    }
}
