package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zch extends gdh {
    @Override // defpackage.gdh
    public final boolean c(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) rdh.a(parcel, Status.CREATOR);
        SavePasswordResult savePasswordResult = (SavePasswordResult) rdh.a(parcel, SavePasswordResult.CREATOR);
        rdh.b(parcel);
        zte.f(status, savePasswordResult, ((cdh) this).a);
        return true;
    }
}
