package defpackage;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class z15 implements j6c {
    @Override // defpackage.j6c
    public final Object get() {
        cn8<ScheduledExecutorService> cn8Var = ExecutorsRegistrar.a;
        return new lt3(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new zb3("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), ExecutorsRegistrar.d.get());
    }
}
