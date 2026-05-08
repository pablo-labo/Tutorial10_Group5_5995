package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import defpackage.bh5;
import defpackage.gdb;
import defpackage.lz8;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class lz8<T> {
    public final d82 a;
    public final sf6 b;
    public final b<T> c;
    public final CopyOnWriteArraySet<c<T>> d;
    public final ArrayDeque<Runnable> e;
    public final ArrayDeque<Runnable> f;
    public final Object g;
    public boolean h;
    public final boolean i;

    public interface a<T> {
        void invoke(T t);
    }

    public interface b<T> {
        void i(T t, bh5 bh5Var);
    }

    public static final class c<T> {
        public final T a;
        public bh5.a b = new bh5.a();
        public boolean c;
        public boolean d;

        public c(T t) {
            this.a = t;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.a.equals(((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    public lz8(CopyOnWriteArraySet<c<T>> copyOnWriteArraySet, Looper looper, d82 d82Var, b<T> bVar, boolean z) {
        this.a = d82Var;
        this.d = copyOnWriteArraySet;
        this.c = bVar;
        this.g = new Object();
        this.e = new ArrayDeque<>();
        this.f = new ArrayDeque<>();
        this.b = d82Var.c(looper, new Handler.Callback() { // from class: jz8
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
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                lz8 lz8Var = this.a;
                Iterator it = lz8Var.d.iterator();
                while (it.hasNext()) {
                    lz8.c cVar = (lz8.c) it.next();
                    lz8.b<T> bVar2 = lz8Var.c;
                    if (!cVar.d && cVar.c) {
                        bh5 bh5VarD = cVar.b.d();
                        cVar.b = new bh5.a();
                        cVar.c = false;
                        bVar2.i(cVar.a, bh5VarD);
                    }
                    if (lz8Var.b.a()) {
                        return true;
                    }
                }
                return true;
            }
        });
        this.i = z;
    }

    public final void a(T t) {
        t.getClass();
        synchronized (this.g) {
            try {
                if (this.h) {
                    return;
                }
                this.d.add(new c<>(t));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        g();
        ArrayDeque<Runnable> arrayDeque = this.f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        sf6 sf6Var = this.b;
        if (!sf6Var.a()) {
            sf6Var.h(sf6Var.c(1));
        }
        ArrayDeque<Runnable> arrayDeque2 = this.e;
        boolean zIsEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (zIsEmpty) {
            while (!arrayDeque2.isEmpty()) {
                arrayDeque2.peekFirst().run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public final void c(int i, a<T> aVar) {
        g();
        this.f.add(new kz8(new CopyOnWriteArraySet(this.d), i, aVar));
    }

    public final void d() {
        g();
        synchronized (this.g) {
            this.h = true;
        }
        for (c<T> cVar : this.d) {
            b<T> bVar = this.c;
            cVar.d = true;
            if (cVar.c) {
                cVar.c = false;
                bVar.i(cVar.a, cVar.b.d());
            }
        }
        this.d.clear();
    }

    public final void e(gdb.c cVar) {
        g();
        CopyOnWriteArraySet<c<T>> copyOnWriteArraySet = this.d;
        for (c<T> cVar2 : copyOnWriteArraySet) {
            if (cVar2.a.equals(cVar)) {
                cVar2.d = true;
                if (cVar2.c) {
                    cVar2.c = false;
                    this.c.i(cVar2.a, cVar2.b.d());
                }
                copyOnWriteArraySet.remove(cVar2);
            }
        }
    }

    public final void f(int i, a<T> aVar) {
        c(i, aVar);
        b();
    }

    public final void g() {
        if (this.i) {
            ka2.q(Thread.currentThread() == this.b.f().getThread());
        }
    }

    public lz8(Looper looper, d82 d82Var, b<T> bVar) {
        this(new CopyOnWriteArraySet(), looper, d82Var, bVar, true);
    }
}
