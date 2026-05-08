package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.runtime.r;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class i70 implements nxa {
    public final iy3 a;
    public long b = 9205357640488583168L;
    public final ff4 c;
    public final g4a<j6g> d;
    public final boolean e;
    public boolean f;
    public long g;
    public long h;
    public final zs3 i;

    public static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: i70$a$a, reason: collision with other inner class name */
        @uh3(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1", f = "AndroidOverscroll.android.kt", l = {783, 787}, m = "invokeSuspend")
        public static final class C0264a extends n7d implements Function2<l61, lu2<? super j6g>, Object> {
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ i70 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0264a(i70 i70Var, lu2<? super C0264a> lu2Var) {
                super(2, lu2Var);
                this.this$0 = i70Var;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                C0264a c0264a = new C0264a(this.this$0, lu2Var);
                c0264a.L$0 = obj;
                return c0264a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(l61 l61Var, lu2<? super j6g> lu2Var) {
                return ((C0264a) create(l61Var, lu2Var)).invokeSuspend(j6g.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
            
                if (r13 == r4) goto L16;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
            
                if (r13 != r4) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
            
                return r4;
             */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:17:0x004f). Please report as a decompilation issue!!! */
            @Override // defpackage.x81
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    r12 = this;
                    int r0 = r12.label
                    r1 = 2
                    r2 = 0
                    r3 = 1
                    g13 r4 = defpackage.g13.a
                    if (r0 == 0) goto L23
                    if (r0 == r3) goto L1b
                    if (r0 != r1) goto L15
                    java.lang.Object r0 = r12.L$0
                    l61 r0 = (defpackage.l61) r0
                    defpackage.r7d.b(r13)
                    goto L4f
                L15:
                    java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.r6.g(r12)
                    return r2
                L1b:
                    java.lang.Object r0 = r12.L$0
                    l61 r0 = (defpackage.l61) r0
                    defpackage.r7d.b(r13)
                    goto L36
                L23:
                    defpackage.r7d.b(r13)
                    java.lang.Object r13 = r12.L$0
                    r0 = r13
                    l61 r0 = (defpackage.l61) r0
                    r12.L$0 = r0
                    r12.label = r3
                    java.lang.Object r13 = defpackage.i8f.c(r0, r12, r1)
                    if (r13 != r4) goto L36
                    goto L4e
                L36:
                    yeb r13 = (defpackage.yeb) r13
                    i70 r3 = r12.this$0
                    long r5 = r13.a
                    r3.h = r5
                    long r5 = r13.c
                    r3.b = r5
                L42:
                    r12.L$0 = r0
                    r12.label = r1
                    peb r13 = defpackage.peb.b
                    java.lang.Object r13 = r0.B1(r13, r12)
                    if (r13 != r4) goto L4f
                L4e:
                    return r4
                L4f:
                    neb r13 = (defpackage.neb) r13
                    java.util.List<yeb> r13 = r13.a
                    java.util.ArrayList r3 = new java.util.ArrayList
                    int r5 = r13.size()
                    r3.<init>(r5)
                    r5 = r13
                    java.util.Collection r5 = (java.util.Collection) r5
                    int r5 = r5.size()
                    r6 = 0
                    r7 = r6
                L65:
                    if (r7 >= r5) goto L78
                    java.lang.Object r8 = r13.get(r7)
                    r9 = r8
                    yeb r9 = (defpackage.yeb) r9
                    boolean r9 = r9.d
                    if (r9 == 0) goto L75
                    r3.add(r8)
                L75:
                    int r7 = r7 + 1
                    goto L65
                L78:
                    i70 r13 = r12.this$0
                    int r5 = r3.size()
                L7e:
                    if (r6 >= r5) goto L95
                    java.lang.Object r7 = r3.get(r6)
                    r8 = r7
                    yeb r8 = (defpackage.yeb) r8
                    long r8 = r8.a
                    long r10 = r13.h
                    boolean r8 = defpackage.web.m(r8, r10)
                    if (r8 == 0) goto L92
                    goto L96
                L92:
                    int r6 = r6 + 1
                    goto L7e
                L95:
                    r7 = r2
                L96:
                    yeb r7 = (defpackage.yeb) r7
                    if (r7 != 0) goto La1
                    java.lang.Object r13 = defpackage.z92.Q0(r3)
                    r7 = r13
                    yeb r7 = (defpackage.yeb) r7
                La1:
                    if (r7 == 0) goto Lad
                    i70 r13 = r12.this$0
                    long r5 = r7.a
                    r13.h = r5
                    long r5 = r7.c
                    r13.b = r5
                Lad:
                    boolean r13 = r3.isEmpty()
                    if (r13 == 0) goto L42
                    i70 r12 = r12.this$0
                    r0 = -1
                    r12.h = r0
                    j6g r12 = defpackage.j6g.a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: i70.a.C0264a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public a() {
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(efb efbVar, lu2<? super j6g> lu2Var) {
            Object objC = ap5.c(efbVar, new C0264a(i70.this, null), lu2Var);
            return objC == g13.a ? objC : j6g.a;
        }
    }

    public i70(Context context, iy3 iy3Var, long j, gza gzaVar) {
        this.a = iy3Var;
        ff4 ff4Var = new ff4(context, pnb.P(j));
        this.c = ff4Var;
        this.d = r.e(j6g.a, zkd.f);
        this.e = true;
        this.g = 0L;
        this.h = -1L;
        k1f k1fVarA = f1f.a(new a());
        this.i = Build.VERSION.SDK_INT >= 31 ? new uue(k1fVarA, this, ff4Var) : new ha6(k1fVarA, this, ff4Var, gzaVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        if (r20.invoke(r0, r5) == r6) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0127, code lost:
    
        if (r4 == r6) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // defpackage.nxa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(long r18, defpackage.vsd r20, defpackage.pu2 r21) {
        /*
            Method dump skipped, instruction units count: 469
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i70.a(long, vsd, pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x023d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0131 A[PHI: r7
  0x0131: PHI (r7v9 float) = (r7v8 float), (r7v12 float) binds: [B:73:0x015f, B:62:0x012a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f1  */
    @Override // defpackage.nxa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long b(long r20, int r22, defpackage.tv r23) {
        /*
            Method dump skipped, instruction units count: 862
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i70.b(long, int, tv):long");
    }

    @Override // defpackage.nxa
    public final boolean c() {
        ff4 ff4Var = this.c;
        EdgeEffect edgeEffect = ff4Var.d;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? dg0.b(edgeEffect) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = ff4Var.e;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? dg0.b(edgeEffect2) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = ff4Var.f;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? dg0.b(edgeEffect3) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = ff4Var.g;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? dg0.b(edgeEffect4) : 0.0f) != 0.0f;
        }
        return false;
    }

    public final void d() {
        boolean z;
        ff4 ff4Var = this.c;
        EdgeEffect edgeEffect = ff4Var.d;
        boolean z2 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = ff4Var.e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        EdgeEffect edgeEffect3 = ff4Var.f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = !edgeEffect3.isFinished() || z;
        }
        EdgeEffect edgeEffect4 = ff4Var.g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            f();
        }
    }

    public final long e() {
        long j = this.b;
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            j = oie.j(this.g);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / Float.intBitsToFloat((int) (this.g >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) / Float.intBitsToFloat((int) (this.g & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public final void f() {
        if (this.e) {
            ((gme) this.d).setValue(j6g.a);
        }
    }

    public final float g(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (e() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect edgeEffectB = this.c.b();
        float fC = -fIntBitsToFloat2;
        float f = 1.0f - fIntBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fC = dg0.c(edgeEffectB, fC, f);
        } else {
            edgeEffectB.onPull(fC, f);
        }
        return (i2 >= 31 ? dg0.b(edgeEffectB) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (4294967295L & this.g)) * (-fC) : Float.intBitsToFloat(i);
    }

    public final float h(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (e() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect edgeEffectC = this.c.c();
        float f = 1.0f - fIntBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fIntBitsToFloat2 = dg0.c(edgeEffectC, fIntBitsToFloat2, f);
        } else {
            edgeEffectC.onPull(fIntBitsToFloat2, f);
        }
        return (i2 >= 31 ? dg0.b(edgeEffectC) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g >> 32)) * fIntBitsToFloat2 : Float.intBitsToFloat(i);
    }

    public final float i(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (e() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect edgeEffectD = this.c.d();
        float fC = -fIntBitsToFloat2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fC = dg0.c(edgeEffectD, fC, fIntBitsToFloat);
        } else {
            edgeEffectD.onPull(fC, fIntBitsToFloat);
        }
        return (i2 >= 31 ? dg0.b(edgeEffectD) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g >> 32)) * (-fC) : Float.intBitsToFloat(i);
    }

    public final float j(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (e() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect edgeEffectE = this.c.e();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fIntBitsToFloat2 = dg0.c(edgeEffectE, fIntBitsToFloat2, fIntBitsToFloat);
        } else {
            edgeEffectE.onPull(fIntBitsToFloat2, fIntBitsToFloat);
        }
        return (i2 >= 31 ? dg0.b(edgeEffectE) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g & 4294967295L)) * fIntBitsToFloat2 : Float.intBitsToFloat(i);
    }

    @Override // defpackage.nxa
    public final ts3 k() {
        return this.i;
    }

    public final void l(long j) {
        boolean zA = kie.a(this.g, 0L);
        boolean zA2 = kie.a(j, this.g);
        this.g = j;
        if (!zA2) {
            int iB = gf9.b(Float.intBitsToFloat((int) (j >> 32)));
            long jB = (((long) gf9.b(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iB) << 32);
            ff4 ff4Var = this.c;
            ff4Var.c = jB;
            EdgeEffect edgeEffect = ff4Var.d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jB >> 32), (int) (jB & 4294967295L));
            }
            EdgeEffect edgeEffect2 = ff4Var.e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jB >> 32), (int) (jB & 4294967295L));
            }
            EdgeEffect edgeEffect3 = ff4Var.f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jB & 4294967295L), (int) (jB >> 32));
            }
            EdgeEffect edgeEffect4 = ff4Var.g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jB & 4294967295L), (int) (jB >> 32));
            }
            EdgeEffect edgeEffect5 = ff4Var.h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jB >> 32), (int) (jB & 4294967295L));
            }
            EdgeEffect edgeEffect6 = ff4Var.i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jB >> 32), (int) (jB & 4294967295L));
            }
            EdgeEffect edgeEffect7 = ff4Var.j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jB & 4294967295L), (int) (jB >> 32));
            }
            EdgeEffect edgeEffect8 = ff4Var.k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & jB), (int) (jB >> 32));
            }
        }
        if (zA || zA2) {
            return;
        }
        d();
    }
}
