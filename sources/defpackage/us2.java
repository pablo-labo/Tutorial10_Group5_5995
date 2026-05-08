package defpackage;

import androidx.compose.ui.e;
import defpackage.kn1;
import defpackage.mn1;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class us2 extends e.c implements nm2, ql8 {
    public dwa d0;
    public final xsd e0;
    public boolean f0;
    public mn1 g0;
    public sl8 i0;
    public boolean j0;
    public boolean k0;
    public boolean m0;
    public final en1 h0 = new en1();
    public long l0 = 0;

    public static final class a {
        public final kn1.a.C0296a a;
        public final qw1 b;

        public a(kn1.a.C0296a c0296a, qw1 qw1Var) {
            this.a = c0296a;
            this.b = qw1Var;
        }

        public final String toString() {
            qw1 qw1Var = this.b;
            c13 c13Var = (c13) qw1Var.e.h1(c13.c);
            String str = c13Var != null ? c13Var.b : null;
            StringBuilder sb = new StringBuilder("Request@");
            int iHashCode = hashCode();
            ypd.s(16);
            String string = Integer.toString(iHashCode, 16);
            string.getClass();
            sb.append(string);
            sb.append(str != null ? l5.m("[", str, "](") : "(");
            sb.append("currentBounds()=");
            sb.append(this.a.invoke());
            sb.append(", continuation=");
            sb.append(qw1Var);
            sb.append(')');
            return sb.toString();
        }
    }

    @uh3(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2", f = "ContentInViewNode.kt", l = {215}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ s7g $animationState;
        final /* synthetic */ mn1 $bringIntoViewSpec;
        private /* synthetic */ Object L$0;
        int label;

        @uh3(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1", f = "ContentInViewNode.kt", l = {221}, m = "invokeSuspend")
        public static final class a extends c1f implements Function2<afa, lu2<? super j6g>, Object> {
            final /* synthetic */ ex7 $animationJob;
            final /* synthetic */ s7g $animationState;
            final /* synthetic */ mn1 $bringIntoViewSpec;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ us2 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(s7g s7gVar, us2 us2Var, mn1 mn1Var, ex7 ex7Var, lu2<? super a> lu2Var) {
                super(2, lu2Var);
                this.$animationState = s7gVar;
                this.this$0 = us2Var;
                this.$bringIntoViewSpec = mn1Var;
                this.$animationJob = ex7Var;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                a aVar = new a(this.$animationState, this.this$0, this.$bringIntoViewSpec, this.$animationJob, lu2Var);
                aVar.L$0 = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(afa afaVar, lu2<? super j6g> lu2Var) {
                return ((a) create(afaVar, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                int i = this.label;
                if (i == 0) {
                    r7d.b(obj);
                    afa afaVar = (afa) this.L$0;
                    this.$animationState.e = us2.c2(this.this$0, this.$bringIntoViewSpec);
                    s7g s7gVar = this.$animationState;
                    us2 us2Var = this.this$0;
                    ur urVar = new ur(us2Var, s7gVar, this.$animationJob, afaVar);
                    nw0 nw0Var = new nw0(1, us2Var, s7gVar, this.$bringIntoViewSpec);
                    this.label = 1;
                    Object objA = s7gVar.a(urVar, nw0Var, this);
                    g13 g13Var = g13.a;
                    if (objA == g13Var) {
                        return g13Var;
                    }
                } else {
                    if (i != 1) {
                        r6.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r7d.b(obj);
                }
                return j6g.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(s7g s7gVar, mn1 mn1Var, lu2<? super b> lu2Var) {
            super(2, lu2Var);
            this.$animationState = s7gVar;
            this.$bringIntoViewSpec = mn1Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            b bVar = us2.this.new b(this.$animationState, this.$bringIntoViewSpec, lu2Var);
            bVar.L$0 = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            CancellationException cancellationException = null;
            try {
                try {
                    if (i == 0) {
                        r7d.b(obj);
                        ex7 ex7VarI = u63.I(((e13) this.L$0).getCoroutineContext());
                        us2 us2Var = us2.this;
                        us2Var.m0 = true;
                        xsd xsdVar = us2Var.e0;
                        n4a n4aVar = n4a.a;
                        a aVar = new a(this.$animationState, us2Var, this.$bringIntoViewSpec, ex7VarI, null);
                        this.label = 1;
                        Object objF = xsdVar.f(n4aVar, aVar, this);
                        g13 g13Var = g13.a;
                        if (objF == g13Var) {
                            return g13Var;
                        }
                    } else {
                        if (i != 1) {
                            r6.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r7d.b(obj);
                    }
                    us2.this.h0.b();
                    us2 us2Var2 = us2.this;
                    us2Var2.m0 = false;
                    us2Var2.h0.a(null);
                    us2.this.j0 = false;
                    return j6g.a;
                } catch (CancellationException e) {
                    cancellationException = e;
                    throw cancellationException;
                }
            } catch (Throwable th) {
                us2 us2Var3 = us2.this;
                us2Var3.m0 = false;
                us2Var3.h0.a(cancellationException);
                us2.this.j0 = false;
                throw th;
            }
        }
    }

    public us2(dwa dwaVar, xsd xsdVar, boolean z, mn1 mn1Var) {
        this.d0 = dwaVar;
        this.e0 = xsdVar;
        this.f0 = z;
        this.g0 = mn1Var;
    }

    public static final float c2(us2 us2Var, mn1 mn1Var) {
        float f;
        qtc qtcVar;
        int iCompare;
        if (th7.b(us2Var.l0, 0L)) {
            return 0.0f;
        }
        j4a<a> j4aVar = us2Var.h0.a;
        int i = j4aVar.c - 1;
        a[] aVarArr = j4aVar.a;
        if (i < aVarArr.length) {
            qtcVar = null;
            while (true) {
                if (i < 0) {
                    f = 0.0f;
                    break;
                }
                qtc qtcVar2 = (qtc) aVarArr[i].a.invoke();
                if (qtcVar2 != null) {
                    long jC = qtcVar2.c();
                    long jY = hh1.Y(us2Var.l0);
                    f = 0.0f;
                    int iOrdinal = us2Var.d0.ordinal();
                    if (iOrdinal == 0) {
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jC & 4294967295L)), Float.intBitsToFloat((int) (jY & 4294967295L)));
                    } else {
                        if (iOrdinal != 1) {
                            l.g();
                            return 0.0f;
                        }
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jC >> 32)), Float.intBitsToFloat((int) (jY >> 32)));
                    }
                    if (iCompare <= 0) {
                        qtcVar = qtcVar2;
                    } else if (qtcVar == null) {
                        qtcVar = qtcVar2;
                    }
                }
                i--;
            }
        } else {
            f = 0.0f;
            qtcVar = null;
        }
        if (qtcVar == null) {
            qtc qtcVarD2 = us2Var.j0 ? us2Var.d2() : null;
            if (qtcVarD2 == null) {
                return f;
            }
            qtcVar = qtcVarD2;
        }
        long jY2 = hh1.Y(us2Var.l0);
        int iOrdinal2 = us2Var.d0.ordinal();
        if (iOrdinal2 == 0) {
            float f2 = qtcVar.b;
            return mn1Var.a(f2, qtcVar.d - f2, Float.intBitsToFloat((int) (jY2 & 4294967295L)));
        }
        if (iOrdinal2 == 1) {
            float f3 = qtcVar.a;
            return mn1Var.a(f3, qtcVar.c - f3, Float.intBitsToFloat((int) (jY2 >> 32)));
        }
        l.g();
        return f;
    }

    @Override // defpackage.ql8
    public final void G(long j) {
        int iC;
        qtc qtcVarD2;
        long j2 = this.l0;
        this.l0 = j;
        int iOrdinal = this.d0.ordinal();
        if (iOrdinal == 0) {
            iC = wl7.c((int) (j & 4294967295L), (int) (4294967295L & j2));
        } else {
            if (iOrdinal != 1) {
                l.g();
                return;
            }
            iC = wl7.c((int) (j >> 32), (int) (j2 >> 32));
        }
        if (iC >= 0 || this.m0 || this.j0 || (qtcVarD2 = d2()) == null || !e2(qtcVarD2, j2)) {
            return;
        }
        this.k0 = true;
    }

    @Override // androidx.compose.ui.e.c
    public final boolean R1() {
        return false;
    }

    public final qtc d2() {
        if (this.c0) {
            tia tiaVarE = us3.e(this);
            sl8 sl8Var = this.i0;
            if (sl8Var != null) {
                if (!sl8Var.d()) {
                    sl8Var = null;
                }
                if (sl8Var != null) {
                    return tiaVarE.J(sl8Var, false);
                }
            }
        }
        return null;
    }

    public final boolean e2(qtc qtcVar, long j) {
        long jG2 = g2(qtcVar, j);
        return Math.abs(Float.intBitsToFloat((int) (jG2 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jG2 & 4294967295L))) <= 0.5f;
    }

    public final void f2() {
        mn1 mn1Var = this.g0;
        if (mn1Var == null) {
            mn1Var = (mn1) om2.a(this, nn1.a);
        }
        if (this.m0) {
            de7.c("launchAnimation called when previous animation was running");
        }
        mn1 mn1Var2 = this.g0;
        if (mn1Var2 == null) {
            mn1Var2 = (mn1) om2.a(this, nn1.a);
        }
        mn1Var2.getClass();
        mn1.a.getClass();
        s7g s7gVar = new s7g(mn1.a.b);
        u63.Y(Q1(), null, i13.d, new b(s7gVar, mn1Var, null), 1);
    }

    public final long g2(qtc qtcVar, long j) {
        long jY = hh1.Y(j);
        int iOrdinal = this.d0.ordinal();
        if (iOrdinal == 0) {
            mn1 mn1Var = this.g0;
            if (mn1Var == null) {
                mn1Var = (mn1) om2.a(this, nn1.a);
            }
            float f = qtcVar.b;
            float fA = mn1Var.a(f, qtcVar.d - f, Float.intBitsToFloat((int) (jY & 4294967295L)));
            return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fA)) & 4294967295L);
        }
        if (iOrdinal != 1) {
            l.g();
            return 0L;
        }
        mn1 mn1Var2 = this.g0;
        if (mn1Var2 == null) {
            mn1Var2 = (mn1) om2.a(this, nn1.a);
        }
        float f2 = qtcVar.a;
        return (((long) Float.floatToRawIntBits(mn1Var2.a(f2, qtcVar.c - f2, Float.intBitsToFloat((int) (jY >> 32))))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
    }
}
