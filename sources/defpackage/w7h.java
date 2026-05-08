package defpackage;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.play.core.review.c;

/* JADX INFO: loaded from: classes2.dex */
public class w7h extends Binder implements IInterface {
    public final /* synthetic */ int a = 1;

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (this.a) {
            case 1:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                p0i p0iVar = (p0i) this;
                if (i != 2) {
                    return false;
                }
                Parcelable.Creator creator = Bundle.CREATOR;
                int i3 = toh.a;
                Bundle bundle = (Bundle) (parcel.readInt() == 0 ? null : (Parcelable) creator.createFromParcel(parcel));
                int iDataAvail = parcel.dataAvail();
                if (iDataAvail > 0) {
                    throw new BadParcelableException(p6.c(iDataAvail, "Parcel data not fully consumed, unread size: "));
                }
                ((c) p0iVar).h(bundle);
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
