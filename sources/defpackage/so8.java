package defpackage;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.runtime.r;
import defpackage.mr8;
import defpackage.wle;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class so8 implements nsd {
    public static final ko2 w = pnb.H(new em0(9), new rg(7));
    public final oo3 a;
    public boolean b;
    public go8 c;
    public final lo8 d;
    public final g4a<go8> e;
    public final e3a f;
    public float g;
    public final hq3 h;
    public final boolean i;
    public zzc j;
    public final ro8 k;
    public final i61 l;
    public final LazyLayoutItemAnimator<ho8> m;
    public final zp8 n;
    public final mr8 o;
    public final qo8 p;
    public final lr8 q;
    public final g4a<j6g> r;
    public final g4a<j6g> s;
    public final g4a t;
    public final g4a u;
    public final or8 v;

    @uh3(c = "androidx.compose.foundation.lazy.grid.LazyGridState", f = "LazyGridState.kt", l = {475, 476}, m = "scroll")
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
            return so8.this.a(null, null, this);
        }
    }

    public so8(final int i, int i2, oo3 oo3Var) {
        this.a = oo3Var;
        this.d = new lo8(i, i2);
        this.e = r.e(uo8.a, zkd.f);
        this.f = new e3a();
        this.h = new hq3(new bt(this, 11));
        this.i = true;
        this.k = new ro8(this);
        this.l = new i61();
        this.m = new LazyLayoutItemAnimator<>();
        this.n = new zp8();
        this.o = new mr8(null, new Function1() { // from class: oo8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                qea qeaVar = (qea) obj;
                oo3 oo3Var2 = this.a.a;
                wle.e.getClass();
                wle wleVarA = wle.a.a();
                wle.a.e(wleVarA, wle.a.b(wleVarA), wleVarA != null ? wleVarA.e() : null);
                oo3Var2.getClass();
                int iB = qeaVar.b() == -1 ? 2 : qeaVar.b();
                for (int i3 = 0; i3 < iB; i3++) {
                    qeaVar.a(i + i3);
                }
                return j6g.a;
            }
        });
        this.p = new qo8(this);
        this.q = new lr8();
        this.r = boa.k();
        this.s = boa.k();
        Boolean bool = Boolean.FALSE;
        this.t = r.f(bool);
        this.u = r.f(bool);
        this.v = new or8();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        if (r6.h.a(r7, r8, r0) == r5) goto L21;
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
            boolean r0 = r9 instanceof so8.a
            if (r0 == 0) goto L13
            r0 = r9
            so8$a r0 = (so8.a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            so8$a r0 = new so8$a
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
            i61 r9 = r6.l
            java.lang.Object r9 = r9.a(r0)
            if (r9 != r5) goto L50
            goto L5e
        L50:
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            hq3 r6 = r6.h
            java.lang.Object r6 = r6.a(r7, r8, r0)
            if (r6 != r5) goto L5f
        L5e:
            return r5
        L5f:
            j6g r6 = defpackage.j6g.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.so8.a(n4a, kotlin.jvm.functions.Function2, lu2):java.lang.Object");
    }

    @Override // defpackage.nsd
    public final boolean b() {
        return this.h.b();
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
        return this.h.e(f);
    }

    public final void f(go8 go8Var, boolean z, boolean z2) {
        ho8 ho8Var;
        ho8 ho8Var2;
        int i = go8Var.p;
        List<ho8> list = go8Var.m;
        int i2 = go8Var.b;
        io8 io8Var = go8Var.a;
        this.o.f = list.size();
        if (!z && this.b) {
            this.c = go8Var;
            return;
        }
        if (z) {
            this.b = true;
        }
        this.g -= go8Var.d;
        ((gme) this.e).setValue(go8Var);
        ((gme) this.u).setValue(Boolean.valueOf(((io8Var != null ? io8Var.a : 0) == 0 && i2 == 0) ? false : true));
        ((gme) this.t).setValue(Boolean.valueOf(go8Var.c));
        lo8 lo8Var = this.d;
        if (z2) {
            lo8Var.getClass();
            if (!(((float) i2) >= 0.0f)) {
                de7.c("scrollOffset should be non-negative");
            }
            ((dme) lo8Var.b).h(i2);
        } else {
            lo8Var.getClass();
            lo8Var.d = (io8Var == null || (ho8Var2 = (ho8) ut0.k0(io8Var.b)) == null) ? null : ho8Var2.b;
            if (lo8Var.c || i > 0) {
                lo8Var.c = true;
                if (!(((float) i2) >= 0.0f)) {
                    de7.c("scrollOffset should be non-negative (" + i2 + ')');
                }
                lo8Var.a((io8Var == null || (ho8Var = (ho8) ut0.k0(io8Var.b)) == null) ? 0 : ho8Var.a, i2);
            }
            if (this.i) {
                oo3 oo3Var = this.a;
                j4a<mr8.b> j4aVar = oo3Var.b;
                int i3 = oo3Var.a;
                boolean z3 = oo3Var.c;
                if (i3 != -1 && !list.isEmpty() && i3 != oo3.b(go8Var, z3)) {
                    oo3Var.a = -1;
                    mr8.b[] bVarArr = j4aVar.a;
                    int i4 = j4aVar.c;
                    for (int i5 = 0; i5 < i4; i5++) {
                        bVarArr[i5].cancel();
                    }
                    j4aVar.g();
                }
                int i6 = oo3Var.d;
                if (i6 != -1 && oo3Var.e != 0.0f && i6 != i && !list.isEmpty()) {
                    int iB = oo3.b(go8Var, oo3Var.e < 0.0f);
                    int iA = oo3.a(go8Var, oo3Var.e < 0.0f);
                    if (iA >= 0 && iA < i && iB != oo3Var.a && iB >= 0) {
                        oo3Var.a = iB;
                        j4aVar.g();
                        j4aVar.d(j4aVar.c, this.p.a(iB));
                    }
                }
                oo3Var.d = i;
            }
        }
        if (z) {
            this.v.a(go8Var.f, go8Var.i, go8Var.h);
        }
    }

    public final eo8 g() {
        return (eo8) ((gme) this.e).getValue();
    }

    public so8(int i, int i2) {
        this(i, i2, new oo3());
    }

    public so8() {
        this(0, 0, new oo3());
    }
}
