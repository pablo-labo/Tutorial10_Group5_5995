package defpackage;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public abstract class yji extends mkh {
    @Override // defpackage.mkh
    public final boolean c(Parcel parcel, int i) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) moh.a(parcel, Status.CREATOR);
        Location location = (Location) moh.a(parcel, Location.CREATOR);
        moh.b(parcel);
        zte.f(status, location, ((rqh) this).a);
        return true;
    }
}
