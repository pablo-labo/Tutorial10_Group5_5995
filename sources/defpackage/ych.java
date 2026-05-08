package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ych extends gdh {
    @Override // defpackage.gdh
    public final boolean c(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) rdh.a(parcel, Status.CREATOR);
        PendingIntent pendingIntent = (PendingIntent) rdh.a(parcel, PendingIntent.CREATOR);
        rdh.b(parcel);
        zte.f(status, pendingIntent, ((kdh) this).a);
        return true;
    }
}
