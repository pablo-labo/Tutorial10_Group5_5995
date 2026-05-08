package defpackage;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b25 implements j6c {
    @Override // defpackage.j6c
    public final Object get() {
        cn8<ScheduledExecutorService> cn8Var = ExecutorsRegistrar.a;
        return Executors.newSingleThreadScheduledExecutor(new zb3("Firebase Scheduler", 0, null));
    }
}
