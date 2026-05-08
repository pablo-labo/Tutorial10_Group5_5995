package defpackage;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.iz8;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class mqh extends h91 {
    public final /* synthetic */ TaskCompletionSource b;
    public final /* synthetic */ ish c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mqh(ish ishVar, TaskCompletionSource taskCompletionSource) {
        super(4);
        this.c = ishVar;
        this.b = taskCompletionSource;
    }

    @Override // defpackage.h91
    public final void K(LocationResult locationResult) {
        List list = locationResult.a;
        int size = list.size();
        this.b.trySetResult(size == 0 ? null : (Location) list.get(size - 1));
        try {
            ish ishVar = this.c;
            fib.g("GetCurrentLocation", "Listener type must not be empty");
            ishVar.q(new iz8.a(this), false, new TaskCompletionSource());
        } catch (RemoteException unused) {
        }
    }
}
