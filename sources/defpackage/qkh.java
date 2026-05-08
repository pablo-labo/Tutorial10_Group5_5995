package defpackage;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.recaptchabase.ExecuteResult;
import com.google.android.gms.recaptchabase.InitResult;

/* JADX INFO: loaded from: classes2.dex */
public class qkh extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        qrh qrhVar = (qrh) this;
        if (i == 1) {
            Status status = (Status) qoh.a(parcel, Status.CREATOR);
            InitResult initResult = (InitResult) qoh.a(parcel, InitResult.CREATOR);
            int iDataAvail = parcel.dataAvail();
            if (iDataAvail > 0) {
                throw new BadParcelableException(p6.c(iDataAvail, "Parcel data not fully consumed, unread size: "));
            }
            qrhVar.L(status, initResult);
            return true;
        }
        if (i != 2) {
            return false;
        }
        Status status2 = (Status) qoh.a(parcel, Status.CREATOR);
        ExecuteResult executeResult = (ExecuteResult) qoh.a(parcel, ExecuteResult.CREATOR);
        int iDataAvail2 = parcel.dataAvail();
        if (iDataAvail2 > 0) {
            throw new BadParcelableException(p6.c(iDataAvail2, "Parcel data not fully consumed, unread size: "));
        }
        qrhVar.A(status2, executeResult);
        return true;
    }
}
