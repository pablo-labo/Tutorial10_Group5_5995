package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.GetServiceRequest;

/* JADX INFO: loaded from: classes2.dex */
public final class ggh implements gn6 {
    public final IBinder a;

    public ggh(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // defpackage.gn6
    public final void H(zrh zrhVar, GetServiceRequest getServiceRequest) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(zrhVar);
            parcelObtain.writeInt(1);
            ahi.a(getServiceRequest, parcelObtain, 0);
            this.a.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}
