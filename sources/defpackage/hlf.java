package defpackage;

import android.util.Pair;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class hlf<T> implements opb<T> {
    public final w4d a;
    public int b;
    public final ConcurrentLinkedQueue<Pair<xq2<T>, ppb>> c;
    public final Executor d;

    public class a extends xs3<T, T> {

        /* JADX INFO: renamed from: hlf$a$a, reason: collision with other inner class name */
        public class RunnableC0257a implements Runnable {
            public final /* synthetic */ Pair a;

            public RunnableC0257a(Pair pair) {
                this.a = pair;
            }

            @Override // java.lang.Runnable
            public final void run() {
                hlf hlfVar = hlf.this;
                Pair pair = this.a;
                xq2 xq2Var = (xq2) pair.first;
                ppb ppbVar = (ppb) pair.second;
                hlfVar.getClass();
                ppbVar.G().a(ppbVar, "ThrottlingProducer", null);
                hlfVar.a.a(new a(xq2Var), ppbVar);
            }
        }

        public a(xq2 xq2Var) {
            super(xq2Var);
        }

        @Override // defpackage.xs3, defpackage.w81
        public final void c() {
            this.b.u();
            i();
        }

        @Override // defpackage.xs3, defpackage.w81
        public final void d(Throwable th) {
            this.b.t(th);
            i();
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // defpackage.w81
        public final void e(int i, Object obj) {
            this.b.v(i, obj);
            if (w81.a(i)) {
                i();
            }
        }

        public final void i() {
            Pair<xq2<T>, ppb> pairPoll;
            synchronized (hlf.this) {
                try {
                    pairPoll = hlf.this.c.poll();
                    if (pairPoll == null) {
                        hlf hlfVar = hlf.this;
                        hlfVar.b--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (pairPoll != null) {
                hlf.this.d.execute(new RunnableC0257a(pairPoll));
            }
        }
    }

    public hlf(Executor executor, w4d w4dVar) {
        executor.getClass();
        this.d = executor;
        this.a = w4dVar;
        this.c = new ConcurrentLinkedQueue<>();
        this.b = 0;
    }

    @Override // defpackage.opb
    public final void a(xq2<T> xq2Var, ppb ppbVar) {
        boolean z;
        ppbVar.G().k(ppbVar, "ThrottlingProducer");
        synchronized (this) {
            try {
                int i = this.b;
                z = true;
                if (i >= 5) {
                    this.c.add(Pair.create(xq2Var, ppbVar));
                } else {
                    this.b = i + 1;
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            return;
        }
        ppbVar.G().a(ppbVar, "ThrottlingProducer", null);
        this.a.a(new a(xq2Var), ppbVar);
    }
}
