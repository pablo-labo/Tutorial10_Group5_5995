package defpackage;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.agesignals.AgeSignalsException;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public class pkh extends Binder implements IInterface {
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
        cn6 cn6Var = (cn6) this;
        if (i == 1) {
            Parcelable.Creator creator = Bundle.CREATOR;
            int i3 = poh.a;
            Bundle bundle = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator.createFromParcel(parcel) : null);
            int iDataAvail = parcel.dataAvail();
            if (iDataAvail > 0) {
                throw new BadParcelableException(p6.c(iDataAvail, "Parcel data not fully consumed, unread size: "));
            }
            twh twhVar = (twh) cn6Var;
            qji qjiVar = twhVar.c.b;
            TaskCompletionSource taskCompletionSource = twhVar.b;
            qjiVar.c(taskCompletionSource);
            twhVar.a.a("onCompleteCheckAgeSignals", new Object[0]);
            taskCompletionSource.trySetResult(new v9i(Integer.valueOf(bundle.getInt("user.status")), Integer.valueOf(bundle.getInt("age.range.lower")), Integer.valueOf(bundle.getInt("age.range.upper")), new Date(bundle.getLong("most.recent.approval.date")), bundle.getString("install.id")));
            return true;
        }
        if (i != 3) {
            return false;
        }
        Parcelable.Creator creator2 = Bundle.CREATOR;
        int i4 = poh.a;
        Bundle bundle2 = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator2.createFromParcel(parcel) : null);
        int iDataAvail2 = parcel.dataAvail();
        if (iDataAvail2 > 0) {
            throw new BadParcelableException(p6.c(iDataAvail2, "Parcel data not fully consumed, unread size: "));
        }
        twh twhVar2 = (twh) cn6Var;
        qji qjiVar2 = twhVar2.c.b;
        TaskCompletionSource taskCompletionSource2 = twhVar2.b;
        qjiVar2.c(taskCompletionSource2);
        int i5 = bundle2.getInt("error.code");
        Object[] objArr = {Integer.valueOf(i5)};
        fsh fshVar = twhVar2.a;
        fshVar.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", fsh.c(fshVar.a, "onError(%d)", objArr));
        }
        taskCompletionSource2.trySetException(new AgeSignalsException(i5));
        return true;
    }
}
