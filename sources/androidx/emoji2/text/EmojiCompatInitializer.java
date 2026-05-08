package androidx.emoji2.text;

import android.content.Context;
import android.os.Trace;
import androidx.emoji2.text.d;
import androidx.lifecycle.ProcessLifecycleInitializer;
import defpackage.dm3;
import defpackage.hn2;
import defpackage.kv8;
import defpackage.lpf;
import defpackage.ml0;
import defpackage.mq4;
import defpackage.nd7;
import defpackage.zv8;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements nd7<Boolean> {

    public static class a extends d.c {
    }

    public static class b implements d.h {
        public final Context a;

        public b(Context context) {
            this.a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.d.h
        public final void a(d.i iVar) {
            hn2 hn2Var = new hn2("EmojiCompatInitializer");
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), hn2Var);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            threadPoolExecutor.execute(new dm3(1, this, iVar, threadPoolExecutor));
        }
    }

    public static class c implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            try {
                int i = lpf.a;
                Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                if (d.d()) {
                    d.a().e();
                }
                Trace.endSection();
            } catch (Throwable th) {
                int i2 = lpf.a;
                Trace.endSection();
                throw th;
            }
        }
    }

    @Override // defpackage.nd7
    public final Boolean create(Context context) {
        Object objB;
        a aVar = new a(new b(context));
        aVar.b = 1;
        if (d.k == null) {
            synchronized (d.j) {
                try {
                    if (d.k == null) {
                        d.k = new d(aVar);
                    }
                } finally {
                }
            }
        }
        ml0 ml0VarC = ml0.c(context);
        ml0VarC.getClass();
        synchronized (ml0.e) {
            try {
                objB = ml0VarC.a.get(ProcessLifecycleInitializer.class);
                if (objB == null) {
                    objB = ml0VarC.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        kv8 lifecycle = ((zv8) objB).getLifecycle();
        lifecycle.a(new mq4(this, lifecycle));
        return Boolean.TRUE;
    }

    @Override // defpackage.nd7
    public final List<Class<? extends nd7<?>>> dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
