package defpackage;

import android.view.Choreographer;
import defpackage.o7d;
import defpackage.v03;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ib0 implements ky9 {
    public final Choreographer a;
    public final hb0 b;

    public static final class a extends mj8 implements Function1<Throwable, j6g> {
        final /* synthetic */ Choreographer.FrameCallback $callback;
        final /* synthetic */ hb0 $uiDispatcher;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(hb0 hb0Var, c cVar) {
            super(1);
            this.$uiDispatcher = hb0Var;
            this.$callback = cVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(Throwable th) {
            hb0 hb0Var = this.$uiDispatcher;
            Choreographer.FrameCallback frameCallback = this.$callback;
            synchronized (hb0Var.e) {
                hb0Var.V.remove(frameCallback);
            }
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements Function1<Throwable, j6g> {
        final /* synthetic */ Choreographer.FrameCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c cVar) {
            super(1);
            this.$callback = cVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(Throwable th) {
            ib0.this.a.removeFrameCallback(this.$callback);
            return j6g.a;
        }
    }

    public static final class c implements Choreographer.FrameCallback {
        public final /* synthetic */ qw1 a;
        public final /* synthetic */ Function1<Long, R> b;

        public c(qw1 qw1Var, ib0 ib0Var, Function1 function1) {
            this.a = qw1Var;
            this.b = function1;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            Object aVar;
            try {
                aVar = this.b.invoke(Long.valueOf(j));
            } catch (Throwable th) {
                aVar = new o7d.a(th);
            }
            this.a.resumeWith(aVar);
        }
    }

    public ib0(Choreographer choreographer, hb0 hb0Var) {
        this.a = choreographer;
        this.b = hb0Var;
    }

    @Override // defpackage.v03
    public final v03 P(v03.b<?> bVar) {
        return v03.a.C0438a.b(this, bVar);
    }

    @Override // defpackage.ky9
    public final <R> Object W(Function1<? super Long, ? extends R> function1, lu2<? super R> lu2Var) {
        hb0 hb0Var = this.b;
        qw1 qw1Var = new qw1(1, ewa.v(lu2Var));
        qw1Var.q();
        c cVar = new c(qw1Var, this, function1);
        if (wl7.b(hb0Var.c, this.a)) {
            synchronized (hb0Var.e) {
                try {
                    hb0Var.V.add(cVar);
                    if (!hb0Var.Y) {
                        hb0Var.Y = true;
                        hb0Var.c.postFrameCallback(hb0Var.Z);
                    }
                    j6g j6gVar = j6g.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            qw1Var.t(new a(hb0Var, cVar));
        } else {
            this.a.postFrameCallback(cVar);
            qw1Var.t(new b(cVar));
        }
        return qw1Var.p();
    }

    @Override // defpackage.v03
    public final v03 d1(v03 v03Var) {
        return v03.a.C0438a.c(this, v03Var);
    }

    @Override // defpackage.v03
    public final <E extends v03.a> E h1(v03.b<E> bVar) {
        return (E) v03.a.C0438a.a(this, bVar);
    }

    @Override // defpackage.v03
    public final <R> R j1(R r, Function2<? super R, ? super v03.a, ? extends R> function2) {
        return function2.invoke(r, this);
    }
}
