package defpackage;

import com.facebook.cache.disk.c;
import com.facebook.cache.disk.d;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public final class q64 {
    public final c a(a64 a64Var) {
        d dVar = new d(a64Var.a, a64Var.c, a64Var.b, a64Var.h);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        return new c(dVar, a64Var.g, new c.b(a64Var.f, a64Var.e, a64Var.d), a64Var.i, a64Var.h, executorServiceNewSingleThreadExecutor);
    }
}
