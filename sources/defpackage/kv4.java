package defpackage;

import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.w;
import defpackage.c20;
import defpackage.csf;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class kv4 extends nm8 {
    public csf<iu4> d0;
    public csf<iu4>.a<th7, de0> e0;
    public csf<iu4>.a<lh7, de0> f0;
    public csf<iu4>.a<lh7, de0> g0;
    public lv4 h0;
    public r25 i0;
    public gu5<Boolean> j0;
    public yc6 k0;
    public long l0 = -9223372034707292160L;
    public c20 m0;
    public final h n0;
    public final i o0;

    public static final class a extends mj8 implements Function1<w.a, j6g> {
        final /* synthetic */ w $placeable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(w wVar) {
            super(1);
            this.$placeable = wVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(w.a aVar) {
            aVar.r(this.$placeable, 0, 0, 0.0f);
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements Function1<w.a, j6g> {
        final /* synthetic */ Function1<cd6, j6g> $layerBlock;
        final /* synthetic */ long $offset;
        final /* synthetic */ long $offsetDelta;
        final /* synthetic */ w $placeable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(w wVar, long j, long j2, Function1<? super cd6, j6g> function1) {
            super(1);
            this.$placeable = wVar;
            this.$offset = j;
            this.$offsetDelta = j2;
            this.$layerBlock = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(w.a aVar) {
            w.a aVar2 = aVar;
            w wVar = this.$placeable;
            long j = this.$offset;
            long j2 = this.$offsetDelta;
            Function1<cd6, j6g> function1 = this.$layerBlock;
            aVar2.getClass();
            w.a.d(aVar2, wVar);
            wVar.h0(lh7.d((((long) (((int) (j >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) (((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L), wVar.e), 0.0f, function1);
            return j6g.a;
        }
    }

    public static final class c extends mj8 implements Function1<w.a, j6g> {
        final /* synthetic */ w $this_run;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(w wVar) {
            super(1);
            this.$this_run = wVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(w.a aVar) {
            aVar.r(this.$this_run, 0, 0, 0.0f);
            return j6g.a;
        }
    }

    public static final class d extends mj8 implements Function1<iu4, th7> {
        final /* synthetic */ long $target;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j) {
            super(1);
            this.$target = j;
        }

        @Override // kotlin.jvm.functions.Function1
        public final th7 invoke(iu4 iu4Var) {
            Function1<th7, th7> function1;
            Function1<th7, th7> function12;
            kv4 kv4Var = kv4.this;
            long j = this.$target;
            kv4Var.getClass();
            int iOrdinal = iu4Var.ordinal();
            if (iOrdinal == 0) {
                t12 t12Var = kv4Var.h0.a().c;
                if (t12Var != null && (function1 = t12Var.b) != null) {
                    j = function1.invoke(new th7(j)).a;
                }
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    l.g();
                    return null;
                }
                t12 t12Var2 = kv4Var.i0.a().c;
                if (t12Var2 != null && (function12 = t12Var2.b) != null) {
                    j = function12.invoke(new th7(j)).a;
                }
            }
            return new th7(j);
        }
    }

    public static final class e extends mj8 implements Function1<csf.b<iu4>, jf5<lh7>> {
        public static final e a = new e(1);

        @Override // kotlin.jvm.functions.Function1
        public final jf5<lh7> invoke(csf.b<iu4> bVar) {
            return ku4.c;
        }
    }

    public static final class f extends mj8 implements Function1<iu4, lh7> {
        final /* synthetic */ long $target;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(long j) {
            super(1);
            this.$target = j;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
        @Override // kotlin.jvm.functions.Function1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final defpackage.lh7 invoke(defpackage.iu4 r8) {
            /*
                r7 = this;
                iu4 r8 = (defpackage.iu4) r8
                kv4 r0 = defpackage.kv4.this
                long r2 = r7.$target
                c20 r7 = r0.m0
                if (r7 != 0) goto Lb
                goto L67
            Lb:
                c20 r7 = r0.c2()
                if (r7 != 0) goto L12
                goto L67
            L12:
                c20 r7 = r0.m0
                c20 r1 = r0.c2()
                boolean r7 = defpackage.wl7.b(r7, r1)
                if (r7 == 0) goto L1f
                goto L67
            L1f:
                int r7 = r8.ordinal()
                if (r7 == 0) goto L67
                r8 = 1
                if (r7 == r8) goto L67
                r8 = 2
                if (r7 != r8) goto L62
                r25 r7 = r0.i0
                gsf r7 = r7.a()
                t12 r7 = r7.c
                if (r7 == 0) goto L67
                kotlin.jvm.functions.Function1<th7, th7> r7 = r7.b
                th7 r8 = new th7
                r8.<init>(r2)
                java.lang.Object r7 = r7.invoke(r8)
                th7 r7 = (defpackage.th7) r7
                long r4 = r7.a
                c20 r7 = r0.c2()
                r7.getClass()
                r1 = r7
                af1 r1 = (defpackage.af1) r1
                vl8 r6 = defpackage.vl8.a
                long r7 = r1.a(r2, r4, r6)
                c20 r1 = r0.m0
                r1.getClass()
                long r0 = r1.a(r2, r4, r6)
                long r7 = defpackage.lh7.c(r7, r0)
                goto L69
            L62:
                defpackage.l.g()
                r7 = 0
                return r7
            L67:
                r7 = 0
            L69:
                lh7 r0 = new lh7
                r0.<init>(r7)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kv4.f.invoke(java.lang.Object):java.lang.Object");
        }
    }

    public static final class g extends mj8 implements Function1<iu4, lh7> {
        final /* synthetic */ long $target;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(long j) {
            super(1);
            this.$target = j;
        }

        @Override // kotlin.jvm.functions.Function1
        public final lh7 invoke(iu4 iu4Var) {
            iu4 iu4Var2 = iu4Var;
            kv4 kv4Var = kv4.this;
            long j = this.$target;
            bke bkeVar = kv4Var.h0.a().b;
            long j2 = 0;
            long j3 = bkeVar != null ? bkeVar.a.invoke(new th7(j)).a : 0L;
            bke bkeVar2 = kv4Var.i0.a().b;
            long j4 = bkeVar2 != null ? bkeVar2.a.invoke(new th7(j)).a : 0L;
            int iOrdinal = iu4Var2.ordinal();
            if (iOrdinal == 0) {
                j2 = j3;
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    l.g();
                    return null;
                }
                j2 = j4;
            }
            return new lh7(j2);
        }
    }

    public static final class h extends mj8 implements Function1<csf.b<iu4>, jf5<th7>> {
        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final jf5<th7> invoke(csf.b<iu4> bVar) {
            csf.b<iu4> bVar2 = bVar;
            iu4 iu4Var = iu4.a;
            iu4 iu4Var2 = iu4.b;
            vpe<th7> vpeVar = null;
            if (bVar2.c(iu4Var, iu4Var2)) {
                t12 t12Var = kv4.this.h0.a().c;
                if (t12Var != null) {
                    vpeVar = t12Var.c;
                }
            } else if (bVar2.c(iu4Var2, iu4.c)) {
                t12 t12Var2 = kv4.this.i0.a().c;
                if (t12Var2 != null) {
                    vpeVar = t12Var2.c;
                }
            } else {
                vpeVar = ku4.d;
            }
            return vpeVar == null ? ku4.d : vpeVar;
        }
    }

    public static final class i extends mj8 implements Function1<csf.b<iu4>, jf5<lh7>> {
        public i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final jf5<lh7> invoke(csf.b<iu4> bVar) {
            bke bkeVar;
            csf.b<iu4> bVar2 = bVar;
            iu4 iu4Var = iu4.a;
            iu4 iu4Var2 = iu4.b;
            if (bVar2.c(iu4Var, iu4Var2)) {
                bke bkeVar2 = kv4.this.h0.a().b;
                return bkeVar2 != null ? bkeVar2.b : ku4.c;
            }
            if (bVar2.c(iu4Var2, iu4.c) && (bkeVar = kv4.this.i0.a().b) != null) {
                return bkeVar.b;
            }
            return ku4.c;
        }
    }

    public kv4(csf<iu4> csfVar, csf<iu4>.a<th7, de0> aVar, csf<iu4>.a<lh7, de0> aVar2, csf<iu4>.a<lh7, de0> aVar3, lv4 lv4Var, r25 r25Var, gu5<Boolean> gu5Var, yc6 yc6Var) {
        this.d0 = csfVar;
        this.e0 = aVar;
        this.f0 = aVar2;
        this.g0 = aVar3;
        this.h0 = lv4Var;
        this.i0 = r25Var;
        this.j0 = gu5Var;
        this.k0 = yc6Var;
        mq2.b(0, 0, 15);
        this.n0 = new h();
        this.o0 = new i();
    }

    @Override // androidx.compose.ui.e.c
    public final void U1() {
        this.l0 = -9223372034707292160L;
    }

    public final c20 c2() {
        if (this.d0.f().c(iu4.a, iu4.b)) {
            t12 t12Var = this.h0.a().c;
            if (t12Var != null) {
                return t12Var.a;
            }
            t12 t12Var2 = this.i0.a().c;
            if (t12Var2 != null) {
                return t12Var2.a;
            }
            return null;
        }
        t12 t12Var3 = this.i0.a().c;
        if (t12Var3 != null) {
            return t12Var3.a;
        }
        t12 t12Var4 = this.h0.a().c;
        if (t12Var4 != null) {
            return t12Var4.a;
        }
        return null;
    }

    @Override // defpackage.lm8
    public final bg9 d(q qVar, vf9 vf9Var, long j) {
        char c2;
        long j2;
        if (this.d0.a.a() == ((gme) this.d0.d).getValue()) {
            this.m0 = null;
        } else if (this.m0 == null) {
            c20 c20VarC2 = c2();
            if (c20VarC2 == null) {
                c20VarC2 = c20.a.a;
            }
            this.m0 = c20VarC2;
        }
        boolean zM0 = qVar.m0();
        bs4 bs4Var = bs4.a;
        if (zM0) {
            w wVarR = vf9Var.R(j);
            long j3 = (((long) wVarR.a) << 32) | (((long) wVarR.b) & 4294967295L);
            this.l0 = j3;
            return qVar.Y0((int) (j3 >> 32), (int) (j3 & 4294967295L), bs4Var, new a(wVarR));
        }
        if (!this.j0.invoke().booleanValue()) {
            w wVarR2 = vf9Var.R(j);
            return qVar.Y0(wVarR2.a, wVarR2.b, bs4Var, new c(wVarR2));
        }
        nu4 nu4VarA = this.k0.a();
        w wVarR3 = vf9Var.R(j);
        long j4 = (((long) wVarR3.a) << 32) | (((long) wVarR3.b) & 4294967295L);
        long j5 = !th7.b(this.l0, -9223372034707292160L) ? this.l0 : j4;
        csf<iu4>.a<th7, de0> aVar = this.e0;
        csf.a.C0199a c0199aA = aVar != null ? aVar.a(this.n0, new d(j5)) : null;
        if (c0199aA != null) {
            j4 = ((th7) c0199aA.getValue()).a;
        }
        long jD = mq2.d(j, j4);
        csf<iu4>.a<lh7, de0> aVar2 = this.f0;
        long j6 = aVar2 != null ? ((lh7) aVar2.a(e.a, new f(j5)).getValue()).a : 0L;
        csf<iu4>.a<lh7, de0> aVar3 = this.g0;
        if (aVar3 != null) {
            c2 = ' ';
            j2 = ((lh7) aVar3.a(this.o0, new g(j5)).getValue()).a;
        } else {
            c2 = ' ';
            j2 = 0;
        }
        c20 c20Var = this.m0;
        return qVar.Y0((int) (jD >> c2), (int) (jD & 4294967295L), bs4Var, new b(wVarR3, lh7.d(c20Var != null ? c20Var.a(j5, jD, vl8.a) : 0L, j2), j6, nu4VarA));
    }
}
