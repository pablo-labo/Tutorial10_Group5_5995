package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public abstract class wle {
    public static final a e = new a();
    public zle a;
    public long b;
    public boolean c;
    public int d;

    public static final class a {
        public static wle a() {
            return ame.b.a();
        }

        public static wle b(wle wleVar) {
            if (wleVar instanceof wsf) {
                wsf wsfVar = (wsf) wleVar;
                if (wsfVar.u == hh1.u()) {
                    wsfVar.s = null;
                    return wleVar;
                }
            }
            if (wleVar instanceof xsf) {
                xsf xsfVar = (xsf) wleVar;
                if (xsfVar.j == hh1.u()) {
                    xsfVar.i = null;
                    return wleVar;
                }
            }
            wle wleVarG = ame.g(wleVar, null, false);
            wleVarG.j();
            return wleVarG;
        }

        public static Object c(Function1 function1, gu5 gu5Var) {
            wle wsfVar;
            if (function1 == null) {
                return gu5Var.invoke();
            }
            wle wleVarA = ame.b.a();
            if (wleVarA instanceof wsf) {
                wsf wsfVar2 = (wsf) wleVarA;
                if (wsfVar2.u == hh1.u()) {
                    Function1<Object, j6g> function12 = wsfVar2.s;
                    Function1<Object, j6g> function13 = wsfVar2.t;
                    try {
                        ((wsf) wleVarA).s = ame.k(function1, function12, true);
                        ((wsf) wleVarA).t = function13;
                        return gu5Var.invoke();
                    } finally {
                        wsfVar2.s = function12;
                        wsfVar2.t = function13;
                    }
                }
            }
            if (wleVarA == null || (wleVarA instanceof d4a)) {
                wsfVar = new wsf(wleVarA instanceof d4a ? (d4a) wleVarA : null, function1, null, true, false);
            } else {
                if (function1 == null) {
                    return gu5Var.invoke();
                }
                wsfVar = wleVarA.u(function1);
            }
            try {
                wle wleVarJ = wsfVar.j();
                try {
                    Object objInvoke = gu5Var.invoke();
                    wle.q(wleVarJ);
                    wsfVar.c();
                    return objInvoke;
                } catch (Throwable th) {
                    wle.q(wleVarJ);
                    throw th;
                }
            } catch (Throwable th2) {
                wsfVar.c();
                throw th2;
            }
        }

        public static vle d(Function2 function2) {
            ame.e(ame.a);
            synchronized (ame.c) {
                ame.h = z92.g1(function2, ame.h);
                j6g j6gVar = j6g.a;
            }
            return new vle(function2);
        }

        public static void e(wle wleVar, wle wleVar2, Function1 function1) {
            if (wleVar != wleVar2) {
                wleVar2.getClass();
                wle.q(wleVar);
                wleVar2.c();
            } else if (wleVar instanceof wsf) {
                ((wsf) wleVar).s = function1;
            } else if (wleVar instanceof xsf) {
                ((xsf) wleVar).i = function1;
            } else {
                ja.i(wleVar, "Non-transparent snapshot was reused: ");
            }
        }

        public static void f() {
            boolean z;
            synchronized (ame.c) {
                a4a<pse> a4aVar = ame.j.i;
                z = false;
                if (a4aVar != null) {
                    if (a4aVar.c()) {
                        z = true;
                    }
                }
            }
            if (z) {
                ame.e(ame.a);
            }
        }

        public static d4a g(a3 a3Var, mm1 mm1Var) {
            d4a d4aVarC;
            wle wleVarJ = ame.j();
            d4a d4aVar = wleVarJ instanceof d4a ? (d4a) wleVarJ : null;
            if (d4aVar != null && (d4aVarC = d4aVar.C(a3Var, mm1Var)) != null) {
                return d4aVarC;
            }
            r6.g("Cannot create a mutable snapshot of an read-only snapshot");
            return null;
        }
    }

    public wle(long j, zle zleVar) {
        int iA;
        int iNumberOfTrailingZeros;
        this.a = zleVar;
        this.b = j;
        nf nfVar = ame.a;
        if (j != 0) {
            zle zleVarD = d();
            long j2 = zleVarD.c;
            long[] jArr = zleVarD.d;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = zleVarD.b;
                if (j3 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = zleVarD.a;
                    if (j4 != 0) {
                        j2 += 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = ((long) iNumberOfTrailingZeros) + j2;
            }
            synchronized (ame.c) {
                iA = ame.f.a(j);
            }
        } else {
            iA = -1;
        }
        this.d = iA;
    }

    public static void q(wle wleVar) {
        ame.b.b(wleVar);
    }

    public final void a() {
        synchronized (ame.c) {
            b();
            p();
            j6g j6gVar = j6g.a;
        }
    }

    public void b() {
        ame.d = ame.d.b(g());
    }

    public void c() {
        this.c = true;
        synchronized (ame.c) {
            o();
            j6g j6gVar = j6g.a;
        }
    }

    public zle d() {
        return this.a;
    }

    public abstract Function1<Object, j6g> e();

    public abstract boolean f();

    public long g() {
        return this.b;
    }

    public int h() {
        return 0;
    }

    public abstract Function1<Object, j6g> i();

    public final wle j() {
        sme<wle> smeVar = ame.b;
        wle wleVarA = smeVar.a();
        smeVar.b(this);
        return wleVarA;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(pse pseVar);

    public final void o() {
        int i = this.d;
        if (i >= 0) {
            ame.t(i);
            this.d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(zle zleVar) {
        this.a = zleVar;
    }

    public void s(long j) {
        this.b = j;
    }

    public void t(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract wle u(Function1<Object, j6g> function1);
}
