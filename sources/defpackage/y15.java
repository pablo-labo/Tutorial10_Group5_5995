package defpackage;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class y15 implements j6c {
    @Override // defpackage.j6c
    public final Object get() {
        cn8<ScheduledExecutorService> cn8Var = ExecutorsRegistrar.a;
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        builderDetectNetwork.detectResourceMismatches();
        builderDetectNetwork.detectUnbufferedIo();
        return new lt3(Executors.newFixedThreadPool(4, new zb3("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())), ExecutorsRegistrar.d.get());
    }
}
