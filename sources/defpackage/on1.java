package defpackage;

import defpackage.o7d;
import defpackage.v03;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class on1 implements ky9 {
    public final n30 a;
    public Throwable c;
    public final Object b = new Object();
    public final iw0 d = new iw0(0);
    public p3a<a<?>> e = new p3a<>((Object) null);
    public p3a<a<?>> f = new p3a<>((Object) null);

    public static final class a<R> {
        public Function1<? super Long, ? extends R> a;
        public qw1 b;

        public a() {
            throw null;
        }
    }

    public static final class b implements Function1<Throwable, j6g> {
        public final /* synthetic */ a<R> a;
        public final /* synthetic */ on1 b;
        public final /* synthetic */ juc c;

        public b(a<R> aVar, on1 on1Var, juc jucVar) {
            this.a = aVar;
            this.b = on1Var;
            this.c = jucVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(Throwable th) {
            int i;
            a<R> aVar = this.a;
            aVar.a = null;
            aVar.b = null;
            iw0 iw0Var = this.b.d;
            int i2 = this.c.element;
            do {
                i = iw0Var.get();
            } while (!iw0Var.compareAndSet(i, ((i >>> 27) & 15) == i2 ? i - 1 : i));
            return j6g.a;
        }
    }

    public on1(n30 n30Var) {
        this.a = n30Var;
    }

    @Override // defpackage.v03
    public final v03 P(v03.b<?> bVar) {
        return v03.a.C0438a.b(this, bVar);
    }

    @Override // defpackage.ky9
    public final <R> Object W(Function1<? super Long, ? extends R> function1, lu2<? super R> lu2Var) {
        int i;
        int i2;
        int i3;
        qw1 qw1Var = new qw1(1, ewa.v(lu2Var));
        qw1Var.q();
        a aVar = new a();
        aVar.a = function1;
        aVar.b = qw1Var;
        juc jucVar = new juc();
        jucVar.element = -1;
        synchronized (this.b) {
            Throwable th = this.c;
            if (th != null) {
                qw1Var.resumeWith(new o7d.a(th));
            } else {
                iw0 iw0Var = this.d;
                do {
                    i = iw0Var.get();
                    i2 = i + 1;
                } while (!iw0Var.compareAndSet(i, i2));
                boolean z = (134217727 & i2) == 1;
                jucVar.element = (i2 >>> 27) & 15;
                this.e.g(aVar);
                qw1Var.t(new b(aVar, this, jucVar));
                if (z) {
                    try {
                        this.a.invoke();
                    } catch (Throwable th2) {
                        synchronized (this.b) {
                            try {
                                if (this.c == null) {
                                    this.c = th2;
                                    p3a<a<?>> p3aVar = this.e;
                                    Object[] objArr = p3aVar.a;
                                    int i4 = p3aVar.b;
                                    for (int i5 = 0; i5 < i4; i5++) {
                                        qw1 qw1Var2 = ((a) objArr[i5]).b;
                                        if (qw1Var2 != null) {
                                            qw1Var2.resumeWith(new o7d.a(th2));
                                        }
                                    }
                                    this.e.i();
                                    iw0 iw0Var2 = this.d;
                                    do {
                                        i3 = iw0Var2.get();
                                    } while (!iw0Var2.compareAndSet(i3, ((((i3 >>> 27) & 15) + 1) & 15) << 27));
                                    j6g j6gVar = j6g.a;
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                }
            }
        }
        return qw1Var.p();
    }

    public final void b(long j) {
        int i;
        qw1 qw1Var;
        Object aVar;
        synchronized (this.b) {
            try {
                p3a<a<?>> p3aVar = this.e;
                this.e = this.f;
                this.f = p3aVar;
                iw0 iw0Var = this.d;
                do {
                    i = iw0Var.get();
                } while (!iw0Var.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
                int i2 = p3aVar.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    a<?> aVarB = p3aVar.b(i3);
                    Function1<? super Long, ? extends Object> function1 = aVarB.a;
                    if (function1 != null && (qw1Var = aVarB.b) != null) {
                        try {
                            aVar = function1.invoke(Long.valueOf(j));
                        } catch (Throwable th) {
                            aVar = new o7d.a(th);
                        }
                        qw1Var.resumeWith(aVar);
                    }
                }
                p3aVar.i();
                j6g j6gVar = j6g.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
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
