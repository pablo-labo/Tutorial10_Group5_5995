package defpackage;

import android.os.Build;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.compose.ui.focus.FocusTargetNode;
import defpackage.d0a;
import defpackage.ia4;
import defpackage.j22;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class jsd extends ja4 implements rg8, c5e, nm2 {
    public nxa o0;
    public nh5 p0;
    public final tea q0;
    public final esd r0;
    public final ln3 s0;
    public final xsd t0;
    public final gsd u0;
    public final us2 v0;
    public pj w0;
    public msd x0;
    public d0a y0;

    @uh3(c = "androidx.compose.foundation.gestures.ScrollableNode$onDragStopped$1", f = "Scrollable.kt", l = {351}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ long $velocity;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$velocity = j;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return jsd.this.new a(this.$velocity, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                xsd xsdVar = jsd.this.t0;
                long j = this.$velocity;
                this.label = 1;
                Object objB = xsdVar.b(j, false, this);
                g13 g13Var = g13.a;
                if (objB == g13Var) {
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

    @uh3(c = "androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1", f = "Scrollable.kt", l = {485}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ long $scrollAmount;
        int label;

        @uh3(c = "androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1$1", f = "Scrollable.kt", l = {}, m = "invokeSuspend")
        public static final class a extends c1f implements Function2<afa, lu2<? super j6g>, Object> {
            final /* synthetic */ long $scrollAmount;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(long j, lu2<? super a> lu2Var) {
                super(2, lu2Var);
                this.$scrollAmount = j;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                a aVar = new a(this.$scrollAmount, lu2Var);
                aVar.L$0 = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(afa afaVar, lu2<? super j6g> lu2Var) {
                return ((a) create(afaVar, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
                ((afa) this.L$0).a(this.$scrollAmount);
                return j6g.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, lu2<? super b> lu2Var) {
            super(2, lu2Var);
            this.$scrollAmount = j;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return jsd.this.new b(this.$scrollAmount, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                xsd xsdVar = jsd.this.t0;
                a aVar = new a(this.$scrollAmount, null);
                this.label = 1;
                Object objF = xsdVar.f(n4a.b, aVar, this);
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
            return j6g.a;
        }
    }

    public jsd(mn1 mn1Var, nh5 nh5Var, d3a d3aVar, dwa dwaVar, nxa nxaVar, nsd nsdVar, boolean z, boolean z2) {
        super(androidx.compose.foundation.gestures.a.a, z, d3aVar, dwaVar);
        this.o0 = nxaVar;
        this.p0 = nh5Var;
        tea teaVar = new tea();
        this.q0 = teaVar;
        esd esdVar = new esd(z);
        c2(esdVar);
        this.r0 = esdVar;
        ln3 ln3Var = new ln3(new zi3(new npe(androidx.compose.foundation.gestures.a.d)));
        this.s0 = ln3Var;
        nxa nxaVar2 = this.o0;
        nh5 nh5Var2 = this.p0;
        xsd xsdVar = new xsd(nsdVar, nxaVar2, nh5Var2 == null ? ln3Var : nh5Var2, dwaVar, z2, teaVar, this, new nv(this, 20));
        this.t0 = xsdVar;
        gsd gsdVar = new gsd(xsdVar, z);
        this.u0 = gsdVar;
        us2 us2Var = new us2(dwaVar, xsdVar, z2, mn1Var);
        c2(us2Var);
        this.v0 = us2Var;
        c2(new xea(gsdVar, teaVar));
        c2(new FocusTargetNode(2, null, 4));
        ln1 ln1Var = new ln1();
        ln1Var.d0 = us2Var;
        c2(ln1Var);
        c2(new in5(new q2(this, 23)));
    }

    @Override // defpackage.c5e
    public final void F0(s5e s5eVar) {
        if (this.h0 && (this.w0 == null || this.x0 == null)) {
            this.w0 = new pj(this, 14);
            this.x0 = new msd(this, null);
        }
        pj pjVar = this.w0;
        if (pjVar != null) {
            qf8<Object>[] qf8VarArr = o5e.a;
            s5eVar.a(v4e.d, new r5(null, pjVar));
        }
        msd msdVar = this.x0;
        if (msdVar != null) {
            qf8<Object>[] qf8VarArr2 = o5e.a;
            s5eVar.a(v4e.e, msdVar);
        }
    }

    @Override // defpackage.rg8
    public final boolean N0(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.ja4, defpackage.dfb
    public final void R(neb nebVar, peb pebVar, long j) {
        long j2;
        boolean zD;
        List<yeb> list = nebVar.a;
        List<yeb> list2 = nebVar.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (this.g0.invoke(list.get(i)).booleanValue()) {
                super.R(nebVar, pebVar, j);
                break;
            }
            i++;
        }
        if (this.h0) {
            if (pebVar == peb.a && nebVar.e == 6) {
                if (this.y0 == null) {
                    this.y0 = new d0a(this.t0, new k60(ViewConfiguration.get(vs3.a(this).getContext())), new isd(2, this, jsd.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4), us3.f(this).m0);
                }
                d0a d0aVar = this.y0;
                if (d0aVar != null) {
                    e13 e13VarQ1 = Q1();
                    if (d0aVar.g == null) {
                        d0aVar.g = u63.Y(e13VarQ1, null, null, new k0a(d0aVar, null), 3);
                    }
                }
            }
            d0a d0aVar2 = this.y0;
            if (d0aVar2 != null && pebVar == peb.b && nebVar.e == 6) {
                List<yeb> list3 = list2;
                int size2 = list3.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    if (list2.get(i2).b()) {
                        return;
                    }
                }
                k60 k60Var = d0aVar2.b;
                iy3 iy3Var = d0aVar2.d;
                ViewConfiguration viewConfiguration = k60Var.a;
                int i3 = Build.VERSION.SDK_INT;
                float f = -(i3 > 26 ? viewConfiguration.getScaledVerticalScrollFactor() : iy3Var.t1(64.0f));
                float f2 = -(i3 > 26 ? viewConfiguration.getScaledHorizontalScrollFactor() : iy3Var.t1(64.0f));
                ooa ooaVar = new ooa(0L);
                int size3 = list2.size();
                int i4 = 0;
                while (true) {
                    j2 = ooaVar.a;
                    if (i4 >= size3) {
                        break;
                    }
                    ooaVar = new ooa(ooa.f(j2, list2.get(i4).j));
                    i4++;
                }
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) * f2)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) * f)) & 4294967295L);
                xsd xsdVar = d0aVar2.a;
                float fG = xsdVar.g(xsdVar.e(jFloatToRawIntBits));
                if (fG == 0.0f) {
                    zD = false;
                } else {
                    nsd nsdVar = xsdVar.a;
                    zD = fG > 0.0f ? nsdVar.d() : nsdVar.c();
                }
                if (zD ? !(d0aVar2.e.f(new d0a.a(jFloatToRawIntBits, ((yeb) z92.O0(list2)).b, false)) instanceof j22.b) : d0aVar2.f) {
                    int size4 = list3.size();
                    for (int i5 = 0; i5 < size4; i5++) {
                        list2.get(i5).a();
                    }
                }
            }
        }
    }

    @Override // androidx.compose.ui.e.c
    public final boolean R1() {
        return false;
    }

    @Override // androidx.compose.ui.e.c
    public final void U1() {
        if (this.c0) {
            iy3 iy3Var = us3.f(this).m0;
            ln3 ln3Var = this.s0;
            ln3Var.getClass();
            ln3Var.a = new zi3(new npe(iy3Var));
        }
        d0a d0aVar = this.y0;
        if (d0aVar != null) {
            d0aVar.d = us3.f(this).m0;
        }
    }

    @Override // defpackage.rg8
    public final boolean b1(KeyEvent keyEvent) {
        long jFloatToRawIntBits;
        if (!this.h0 || ((!lg8.a(pg8.y(keyEvent), lg8.n) && !lg8.a(ak2.a(keyEvent.getKeyCode()), lg8.m)) || pg8.A(keyEvent) != 2 || keyEvent.isCtrlPressed())) {
            return false;
        }
        boolean z = this.t0.d == dwa.a;
        us2 us2Var = this.v0;
        if (z) {
            int i = (int) (us2Var.l0 & 4294967295L);
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(lg8.a(ak2.a(keyEvent.getKeyCode()), lg8.m) ? i : -i)));
        } else {
            int i2 = (int) (us2Var.l0 >> 32);
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(lg8.a(ak2.a(keyEvent.getKeyCode()), lg8.m) ? i2 : -i2)) << 32);
        }
        u63.Y(Q1(), null, null, new b(jFloatToRawIntBits, null), 3);
        return true;
    }

    @Override // defpackage.ja4
    public final Object j2(ia4.a aVar, ia4 ia4Var) {
        xsd xsdVar = this.t0;
        Object objF = xsdVar.f(n4a.b, new hsd(null, xsdVar, aVar), ia4Var);
        return objF == g13.a ? objF : j6g.a;
    }

    @Override // defpackage.ja4
    public final void k2(long j) {
    }

    @Override // defpackage.ja4
    public final void l2(long j) {
        u63.Y(this.q0.c(), null, null, new a(j, null), 3);
    }

    @Override // defpackage.ja4
    public final boolean m2() {
        xsd xsdVar = this.t0;
        if (xsdVar.a.b()) {
            return true;
        }
        nxa nxaVar = xsdVar.b;
        return nxaVar != null ? nxaVar.c() : false;
    }

    public final void o2(mn1 mn1Var, nh5 nh5Var, d3a d3aVar, dwa dwaVar, nxa nxaVar, nsd nsdVar, boolean z, boolean z2) {
        boolean z3;
        boolean z4 = true;
        boolean z5 = false;
        if (this.h0 != z) {
            this.u0.b = z;
            this.r0.e0 = z;
            z3 = true;
        } else {
            z3 = false;
        }
        nh5 nh5Var2 = nh5Var == null ? this.s0 : nh5Var;
        xsd xsdVar = this.t0;
        if (!wl7.b(xsdVar.a, nsdVar)) {
            xsdVar.a = nsdVar;
            z5 = true;
        }
        xsdVar.b = nxaVar;
        if (xsdVar.d != dwaVar) {
            xsdVar.d = dwaVar;
            z5 = true;
        }
        if (xsdVar.e != z2) {
            xsdVar.e = z2;
        } else {
            z4 = z5;
        }
        xsdVar.c = nh5Var2;
        xsdVar.f = this.q0;
        us2 us2Var = this.v0;
        us2Var.d0 = dwaVar;
        us2Var.f0 = z2;
        us2Var.g0 = mn1Var;
        this.o0 = nxaVar;
        this.p0 = nh5Var;
        tr trVar = androidx.compose.foundation.gestures.a.a;
        dwa dwaVar2 = xsdVar.d;
        dwa dwaVar3 = dwa.a;
        if (dwaVar2 != dwaVar3) {
            dwaVar3 = dwa.b;
        }
        n2(trVar, z, d3aVar, dwaVar3, z4);
        if (z3) {
            this.w0 = null;
            this.x0 = null;
            us3.f(this).U();
        }
    }

    @Override // defpackage.ts3
    public final void w() {
        f1();
        if (this.c0) {
            iy3 iy3Var = us3.f(this).m0;
            ln3 ln3Var = this.s0;
            ln3Var.getClass();
            ln3Var.a = new zi3(new npe(iy3Var));
        }
        d0a d0aVar = this.y0;
        if (d0aVar != null) {
            d0aVar.d = us3.f(this).m0;
        }
    }
}
