package defpackage;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class jx9<Params, Progress, Result> {
    public static e V;
    public static volatile ThreadPoolExecutor W;
    public static final ThreadPoolExecutor f;
    public final b a;
    public final c b;
    public volatile f c = f.a;
    public final AtomicBoolean d = new AtomicBoolean();
    public final AtomicBoolean e = new AtomicBoolean();

    public static class a implements ThreadFactory {
        public final AtomicInteger a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.a.getAndIncrement());
        }
    }

    public class b extends g<Params, Result> {
        public b() {
        }

        @Override // java.util.concurrent.Callable
        public final Result call() {
            jx9 jx9Var = jx9.this;
            jx9Var.e.set(true);
            try {
                Process.setThreadPriority(10);
                jx9Var.a();
                Binder.flushPendingCommands();
                return null;
            } finally {
            }
        }
    }

    public class c extends FutureTask<Result> {
        public c(b bVar) {
            super(bVar);
        }

        @Override // java.util.concurrent.FutureTask
        public final void done() {
            jx9 jx9Var = jx9.this;
            AtomicBoolean atomicBoolean = jx9Var.e;
            try {
                Result result = get();
                if (atomicBoolean.get()) {
                    return;
                }
                jx9Var.d(result);
            } catch (InterruptedException e) {
                Log.w("AsyncTask", e);
            } catch (CancellationException unused) {
                if (atomicBoolean.get()) {
                    return;
                }
                jx9Var.d(null);
            } catch (ExecutionException e2) {
                l6.p("An error occurred while executing doInBackground()", e2.getCause());
            } catch (Throwable th) {
                l6.p("An error occurred while executing doInBackground()", th);
            }
        }
    }

    public static class d<Data> {
        public final jx9 a;
        public final Data[] b;

        public d(jx9 jx9Var, Data... dataArr) {
            this.a = jx9Var;
            this.b = dataArr;
        }
    }

    public static class e extends Handler {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            d dVar = (d) message.obj;
            int i = message.what;
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                jx9 jx9Var = dVar.a;
            } else {
                jx9 jx9Var2 = dVar.a;
                Object obj = dVar.b[0];
                if (jx9Var2.d.get()) {
                    jx9Var2.b(obj);
                } else {
                    jx9Var2.c(obj);
                }
                jx9Var2.c = f.c;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class f {
        public static final f a;
        public static final f b;
        public static final f c;
        public static final /* synthetic */ f[] d;

        static {
            f fVar = new f("PENDING", 0);
            a = fVar;
            f fVar2 = new f("RUNNING", 1);
            b = fVar2;
            f fVar3 = new f("FINISHED", 2);
            c = fVar3;
            d = new f[]{fVar, fVar2, fVar3};
        }

        public f() {
            throw null;
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) d.clone();
        }
    }

    public static abstract class g<Params, Result> implements Callable<Result> {
    }

    static {
        a aVar = new a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(10), aVar);
        f = threadPoolExecutor;
        W = threadPoolExecutor;
    }

    public jx9() {
        b bVar = new b();
        this.a = bVar;
        this.b = new c(bVar);
    }

    public abstract void a();

    public void b(Result result) {
    }

    public void c(Result result) {
    }

    public final void d(Object obj) {
        e eVar;
        synchronized (jx9.class) {
            try {
                if (V == null) {
                    V = new e(Looper.getMainLooper());
                }
                eVar = V;
            } catch (Throwable th) {
                throw th;
            }
        }
        eVar.obtainMessage(1, new d(this, obj)).sendToTarget();
    }
}
