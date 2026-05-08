package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public interface to6 extends IInterface {

    public static abstract class a extends q9h implements to6 {
        @Override // defpackage.q9h
        public final boolean k1(int i, Parcel parcel, Parcel parcel2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) hah.a(parcel, Status.CREATOR);
            hah.b(parcel);
            w0(status);
            return true;
        }
    }

    void w0(Status status);
}
