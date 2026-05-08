package android.support.v4.os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.a;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new a();
    public android.support.v4.os.a a;

    public class a implements Parcelable.Creator<ResultReceiver> {
        @Override // android.os.Parcelable.Creator
        public final ResultReceiver createFromParcel(Parcel parcel) {
            android.support.v4.os.a aVar;
            ResultReceiver resultReceiver = new ResultReceiver();
            IBinder strongBinder = parcel.readStrongBinder();
            int i = a.AbstractBinderC0004a.a;
            if (strongBinder == null) {
                aVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(android.support.v4.os.a.i);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof android.support.v4.os.a)) {
                    a.AbstractBinderC0004a.C0005a c0005a = new a.AbstractBinderC0004a.C0005a();
                    c0005a.a = strongBinder;
                    aVar = c0005a;
                } else {
                    aVar = (android.support.v4.os.a) iInterfaceQueryLocalInterface;
                }
            }
            resultReceiver.a = aVar;
            return resultReceiver;
        }

        @Override // android.os.Parcelable.Creator
        public final ResultReceiver[] newArray(int i) {
            return new ResultReceiver[i];
        }
    }

    public class b extends a.AbstractBinderC0004a {
        public b() {
            attachInterface(this, android.support.v4.os.a.i);
        }
    }

    public void a(int i, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            try {
                if (this.a == null) {
                    this.a = new b();
                }
                parcel.writeStrongBinder(this.a.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
