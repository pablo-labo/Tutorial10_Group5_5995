package defpackage;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.runtime.r;
import defpackage.mr8;
import defpackage.wle;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ss8 implements nsd {
    public static final ko2 x = pnb.H(new rh2(11, 0), new lg(8));
    public final po3 a;
    public boolean b;
    public is8 c;
    public boolean d;
    public final ms8 e;
    public final g4a<is8> f;
    public final e3a g;
    public float h;
    public final hq3 i;
    public final boolean j;
    public zzc k;
    public final rs8 l;
    public final i61 m;
    public final LazyLayoutItemAnimator<js8> n;
    public final zp8 o;
    public final mr8 p;
    public final qs8 q;
    public final lr8 r;
    public final g4a<j6g> s;
    public final g4a t;
    public final g4a u;
    public final g4a<j6g> v;
    public final or8 w;

    @uh3(c = "androidx.compose.foundation.lazy.LazyListState", f = "LazyListState.kt", l = {443, 444}, m = "scroll")
    public static final class a extends pu2 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public a(lu2<? super a> lu2Var) {
            super(lu2Var);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ss8.this.a(null, null, this);
        }
    }

    public ss8(final int i, int i2, po3 po3Var) {
        this.a = po3Var;
        this.e = new ms8(i, i2);
        this.f = r.e(us8.a, zkd.f);
        this.g = new e3a();
        this.i = new hq3(new ir(this, 7));
        this.j = true;
        this.l = new rs8(this);
        this.m = new i61();
        this.n = new LazyLayoutItemAnimator<>();
        this.o = new zp8();
        this.p = new mr8(null, new Function1() { // from class: os8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                qea qeaVar = (qea) obj;
                po3 po3Var2 = this.a.a;
                wle.e.getClass();
                wle wleVarA = wle.a.a();
                wle.a.e(wleVarA, wle.a.b(wleVarA), wleVarA != null ? wleVarA.e() : null);
                po3Var2.getClass();
                int iB = qeaVar.b() == -1 ? 2 : qeaVar.b();
                for (int i3 = 0; i3 < iB; i3++) {
                    qeaVar.a(i + i3);
                }
                return j6g.a;
            }
        });
        this.q = new qs8(this);
        this.r = new lr8();
        this.s = boa.k();
        Boolean bool = Boolean.FALSE;
        this.t = r.f(bool);
        this.u = r.f(bool);
        this.v = boa.k();
        this.w = new or8();
    }

    public static Object f(ss8 ss8Var, int i, pu2 pu2Var) {
        ss8Var.getClass();
        Object objA = ss8Var.a(n4a.a, new ps8(ss8Var, i, 0, null), pu2Var);
        return objA == g13.a ? objA : j6g.a;
    }

    public static Object k(ss8 ss8Var, int i, c1f c1fVar) {
        ss8Var.getClass();
        Object objA = ss8Var.a(n4a.a, new ts8(ss8Var, i, 0, null), c1fVar);
        return objA == g13.a ? objA : j6g.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        if (r6.i.a(r7, r8, r0) == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.nsd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.n4a r7, kotlin.jvm.functions.Function2<? super defpackage.xrd, ? super defpackage.lu2<? super defpackage.j6g>, ? extends java.lang.Object> r8, defpackage.lu2<? super defpackage.j6g> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof ss8.a
            if (r0 == 0) goto L13
            r0 = r9
            ss8$a r0 = (ss8.a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            ss8$a r0 = new ss8$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 2
            r4 = 1
            g13 r5 = defpackage.g13.a
            if (r1 == 0) goto L3e
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.r7d.b(r9)
            goto L5f
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r6)
            return r2
        L31:
            java.lang.Object r7 = r0.L$1
            r8 = r7
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            java.lang.Object r7 = r0.L$0
            n4a r7 = (defpackage.n4a) r7
            defpackage.r7d.b(r9)
            goto L50
        L3e:
            defpackage.r7d.b(r9)
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r4
            i61 r9 = r6.m
            java.lang.Object r9 = r9.a(r0)
            if (r9 != r5) goto L50
            goto L5e
        L50:
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            hq3 r6 = r6.i
            java.lang.Object r6 = r6.a(r7, r8, r0)
            if (r6 != r5) goto L5f
        L5e:
            return r5
        L5f:
            j6g r6 = defpackage.j6g.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ss8.a(n4a, kotlin.jvm.functions.Function2, lu2):java.lang.Object");
    }

    @Override // defpackage.nsd
    public final boolean b() {
        return this.i.b();
    }

    @Override // defpackage.nsd
    public final boolean c() {
        return ((Boolean) ((gme) this.u).getValue()).booleanValue();
    }

    @Override // defpackage.nsd
    public final boolean d() {
        return ((Boolean) ((gme) this.t).getValue()).booleanValue();
    }

    @Override // defpackage.nsd
    public final float e(float f) {
        return this.i.e(f);
    }

    public final void g(is8 is8Var, boolean z, boolean z2) {
        String str;
        long j;
        int i = is8Var.n;
        List<js8> list = is8Var.k;
        int i2 = is8Var.b;
        js8 js8Var = is8Var.a;
        this.p.f = list.size();
        or8 or8Var = this.w;
        ms8 ms8Var = this.e;
        if (!z && this.b) {
            this.c = is8Var;
            wle.e.getClass();
            wle wleVarA = wle.a.a();
            Function1<Object, j6g> function1E = wleVarA != null ? wleVarA.e() : null;
            wle wleVarB = wle.a.b(wleVarA);
            try {
                if (((Number) ((gme) or8Var.b.b).getValue()).floatValue() != 0.0f && js8Var != null && js8Var.a == ((dme) ms8Var.a).e() && i2 == ((dme) ms8Var.b).e()) {
                    uqe uqeVar = or8Var.a;
                    if (uqeVar != null) {
                        uqeVar.h(null);
                    }
                    or8Var.b = new ae0<>(q92.c0, Float.valueOf(0.0f), null, 60);
                }
                j6g j6gVar = j6g.a;
                wle.a.e(wleVarA, wleVarB, function1E);
                return;
            } catch (Throwable th) {
                wle.a.e(wleVarA, wleVarB, function1E);
                throw th;
            }
        }
        if (z) {
            this.b = true;
        }
        ((gme) this.u).setValue(Boolean.valueOf(((js8Var != null ? js8Var.a : 0) == 0 && i2 == 0) ? false : true));
        ((gme) this.t).setValue(Boolean.valueOf(is8Var.c));
        this.h -= is8Var.d;
        ((gme) this.f).setValue(is8Var);
        if (z2) {
            ms8Var.getClass();
            if (!(((float) i2) >= 0.0f)) {
                de7.c("scrollOffset should be non-negative");
            }
            ((dme) ms8Var.b).h(i2);
        } else {
            js8 js8Var2 = (js8) z92.Q0(list);
            js8 js8Var3 = (js8) z92.Z0(list);
            if (js8Var2 != null) {
                str = "scrollOffset should be non-negative";
                j = js8Var2.a;
            } else {
                str = "scrollOffset should be non-negative";
                j = -1;
            }
            fb0.a(j, "firstVisibleItem:index");
            fb0.a(js8Var3 != null ? js8Var3.a : -1L, "lastVisibleItem:index");
            ms8Var.getClass();
            ms8Var.d = js8Var != null ? js8Var.l : null;
            if (ms8Var.c || i > 0) {
                ms8Var.c = true;
                if (!(((float) i2) >= 0.0f)) {
                    de7.c(str);
                }
                ms8Var.a(js8Var != null ? js8Var.a : 0, i2);
            }
            if (this.j) {
                po3 po3Var = this.a;
                int i3 = po3Var.a;
                boolean z3 = po3Var.c;
                if (i3 != -1 && !list.isEmpty() && i3 != po3.a(is8Var, z3)) {
                    po3Var.a = -1;
                    mr8.b bVar = po3Var.b;
                    if (bVar != null) {
                        bVar.cancel();
                    }
                    po3Var.b = null;
                }
                int i4 = po3Var.d;
                if (i4 != -1 && po3Var.e != 0.0f && i4 != i && !list.isEmpty()) {
                    int iA = po3.a(is8Var, po3Var.e < 0.0f);
                    if (iA >= 0 && iA < i) {
                        po3Var.a = iA;
                        po3Var.b = this.q.a(iA);
                    }
                }
                po3Var.d = i;
            }
        }
        if (z) {
            or8Var.a(is8Var.f, is8Var.i, is8Var.h);
        }
    }

    public final int h() {
        return ((dme) this.e.a).e();
    }

    public final int i() {
        return ((dme) this.e.b).e();
    }

    public final gs8 j() {
        return (gs8) ((gme) this.f).getValue();
    }

    public final void l(int i, int i2) {
        ms8 ms8Var = this.e;
        if (((dme) ms8Var.a).e() != i || ((dme) ms8Var.b).e() != i2) {
            LazyLayoutItemAnimator<js8> lazyLayoutItemAnimator = this.n;
            lazyLayoutItemAnimator.e();
            lazyLayoutItemAnimator.b = null;
            lazyLayoutItemAnimator.c = -1;
        }
        ms8Var.a(i, i2);
        ms8Var.d = null;
        zzc zzcVar = this.k;
        if (zzcVar != null) {
            zzcVar.e();
        }
    }

    public ss8(int i, int i2) {
        po3 po3Var = new po3();
        po3Var.a = -1;
        po3Var.d = -1;
        this(i, i2, po3Var);
    }

    public ss8() {
        po3 po3Var = new po3();
        po3Var.a = -1;
        po3Var.d = -1;
        this(0, 0, po3Var);
    }
}
