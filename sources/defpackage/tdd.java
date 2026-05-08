package defpackage;

import android.view.View;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.hmb;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public abstract class tdd extends e.c implements nm2, eb4, ql8 {
    public final ei7 d0;
    public final boolean e0;
    public final float f0;
    public final oa2 g0;
    public final gu5<idd> h0;
    public jse i0;
    public float j0;
    public boolean l0;
    public long k0 = 0;
    public final p3a<hmb> m0 = new p3a<>((Object) null);

    @uh3(c = "androidx.compose.material.ripple.RippleNode$onAttach$1", f = "Ripple.kt", l = {364}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: tdd$a$a, reason: collision with other inner class name */
        public static final class C0423a<T> implements wi5 {
            public final /* synthetic */ tdd a;
            public final /* synthetic */ e13 b;

            public C0423a(tdd tddVar, e13 e13Var) {
                this.a = tddVar;
                this.b = e13Var;
            }

            @Override // defpackage.wi5
            public final Object a(Object obj, lu2 lu2Var) {
                ci7 ci7Var = (ci7) obj;
                boolean z = ci7Var instanceof hmb;
                tdd tddVar = this.a;
                if (!z) {
                    jse jseVar = tddVar.i0;
                    if (jseVar == null) {
                        jseVar = new jse(tddVar.h0, tddVar.e0);
                        fb4.a(tddVar);
                        tddVar.i0 = jseVar;
                    }
                    jseVar.b(ci7Var, this.b);
                } else if (tddVar.l0) {
                    tddVar.c2((hmb) ci7Var);
                } else {
                    tddVar.m0.g(ci7Var);
                }
                return j6g.a;
            }
        }

        public a(lu2<? super a> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = tdd.this.new a(lu2Var);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    r7d.b(obj);
                    return j6g.a;
                }
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            e13 e13Var = (e13) this.L$0;
            nde ndeVarB = tdd.this.d0.b();
            C0423a c0423a = new C0423a(tdd.this, e13Var);
            this.label = 1;
            ndeVarB.e(c0423a, this);
            return g13.a;
        }
    }

    public tdd(ei7 ei7Var, boolean z, float f, oa2 oa2Var, gu5 gu5Var) {
        this.d0 = ei7Var;
        this.e0 = z;
        this.f0 = f;
        this.g0 = oa2Var;
        this.h0 = gu5Var;
    }

    @Override // defpackage.ql8
    public final void G(long j) {
        this.l0 = true;
        iy3 iy3Var = us3.f(this).m0;
        this.k0 = hh1.Y(j);
        float f = this.f0;
        this.j0 = Float.isNaN(f) ? ojh.p(iy3Var, this.e0, this.k0) : iy3Var.t1(f);
        p3a<hmb> p3aVar = this.m0;
        Object[] objArr = p3aVar.a;
        int i = p3aVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            c2((hmb) objArr[i2]);
        }
        p3aVar.i();
    }

    @Override // androidx.compose.ui.e.c
    public final boolean R1() {
        return false;
    }

    @Override // androidx.compose.ui.e.c
    public final void U1() {
        u63.Y(Q1(), null, null, new a(null), 3);
    }

    public final void c2(hmb hmbVar) {
        ndd nddVar;
        if (!(hmbVar instanceof hmb.b)) {
            if (hmbVar instanceof hmb.c) {
                ndd nddVar2 = ((n90) this).o0;
                if (nddVar2 != null) {
                    nddVar2.d();
                    return;
                }
                return;
            }
            if (!(hmbVar instanceof hmb.a) || (nddVar = ((n90) this).o0) == null) {
                return;
            }
            nddVar.d();
            return;
        }
        hmb.b bVar = (hmb.b) hmbVar;
        long j = this.k0;
        float f = this.j0;
        n90 n90Var = (n90) this;
        ldd lddVarB = n90Var.n0;
        if (lddVarB == null) {
            lddVarB = web.b(web.d((View) om2.a(n90Var, AndroidCompositionLocals_androidKt.f)));
            n90Var.n0 = lddVarB;
        }
        ndd nddVarA = lddVarB.a(n90Var);
        nddVarA.b(bVar, n90Var.e0, j, gf9.b(f), n90Var.g0.a(), n90Var.h0.invoke().d, new m90(n90Var));
        n90Var.o0 = nddVarA;
        fb4.a(n90Var);
    }

    @Override // defpackage.eb4
    public final void y(sm8 sm8Var) {
        sm8Var.N1();
        jse jseVar = this.i0;
        if (jseVar != null) {
            jseVar.a(sm8Var, this.j0, this.g0.a());
        }
        n90 n90Var = (n90) this;
        ww1 ww1VarA = sm8Var.a.b.a();
        ndd nddVar = n90Var.o0;
        if (nddVar != null) {
            nddVar.e(n90Var.k0, gf9.b(n90Var.j0), n90Var.g0.a(), n90Var.h0.invoke().d);
            nddVar.draw(z40.a(ww1VarA));
        }
    }
}
