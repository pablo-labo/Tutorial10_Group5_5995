package androidx.compose.foundation.text.modifiers;

import android.os.Trace;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.w;
import defpackage.a1;
import defpackage.bg9;
import defpackage.c5e;
import defpackage.cd;
import defpackage.d20;
import defpackage.e20;
import defpackage.eb4;
import defpackage.fb4;
import defpackage.fj;
import defpackage.h3e;
import defpackage.ia;
import defpackage.iq2;
import defpackage.iy3;
import defpackage.j6g;
import defpackage.k5e;
import defpackage.le0;
import defpackage.lm8;
import defpackage.mif;
import defpackage.mte;
import defpackage.o5e;
import defpackage.oa2;
import defpackage.or;
import defpackage.pl7;
import defpackage.pn5;
import defpackage.pq;
import defpackage.qf8;
import defpackage.qtc;
import defpackage.r5;
import defpackage.r5e;
import defpackage.rdf;
import defpackage.s1a;
import defpackage.s5e;
import defpackage.sab;
import defpackage.tjf;
import defpackage.u63;
import defpackage.us3;
import defpackage.v4e;
import defpackage.vf9;
import defpackage.w59;
import defpackage.wl7;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class b extends e.c implements lm8, eb4, c5e {
    public le0 d0;
    public tjf e0;
    public pn5.a f0;
    public Function1<? super mif, j6g> g0;
    public int h0;
    public boolean i0;
    public int j0;
    public int k0;
    public List<le0.c<sab>> l0;
    public Function1<? super List<qtc>, j6g> m0;
    public h3e n0;
    public oa2 o0;
    public Function1<? super a, j6g> p0;
    public Map<d20, Integer> q0;
    public s1a r0;
    public pq s0;
    public a t0;

    public static final class a {
        public final le0 a;
        public le0 b;
        public boolean c = false;
        public s1a d = null;

        public a(le0 le0Var, le0 le0Var2) {
            this.a = le0Var;
            this.b = le0Var2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return wl7.b(this.a, aVar.a) && wl7.b(this.b, aVar.b) && this.c == aVar.c && wl7.b(this.d, aVar.d);
        }

        public final int hashCode() {
            int iF = ia.f((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
            s1a s1aVar = this.d;
            return iF + (s1aVar == null ? 0 : s1aVar.hashCode());
        }

        public final String toString() {
            return "TextSubstitutionValue(original=" + ((Object) this.a) + ", substitution=" + ((Object) this.b) + ", isShowingSubstitution=" + this.c + ", layoutCache=" + this.d + ')';
        }
    }

    public b() {
        throw null;
    }

    public b(le0 le0Var, tjf tjfVar, pn5.a aVar, Function1 function1, int i, boolean z, int i2, int i3, List list, Function1 function12, h3e h3eVar, oa2 oa2Var, Function1 function13) {
        this.d0 = le0Var;
        this.e0 = tjfVar;
        this.f0 = aVar;
        this.g0 = function1;
        this.h0 = i;
        this.i0 = z;
        this.j0 = i2;
        this.k0 = i3;
        this.l0 = list;
        this.m0 = function12;
        this.n0 = h3eVar;
        this.o0 = oa2Var;
        this.p0 = function13;
    }

    @Override // defpackage.c5e
    public final void F0(s5e s5eVar) {
        pq pqVar = this.s0;
        if (pqVar == null) {
            pqVar = new pq(this, 17);
            this.s0 = pqVar;
        }
        le0 le0Var = this.d0;
        qf8<Object>[] qf8VarArr = o5e.a;
        s5eVar.a(k5e.A, u63.Z(le0Var));
        a aVar = this.t0;
        if (aVar != null) {
            le0 le0Var2 = aVar.b;
            r5e<le0> r5eVar = k5e.B;
            qf8<Object>[] qf8VarArr2 = o5e.a;
            qf8<Object> qf8Var = qf8VarArr2[15];
            s5eVar.a(r5eVar, le0Var2);
            boolean z = aVar.c;
            r5e<Boolean> r5eVar2 = k5e.C;
            qf8<Object> qf8Var2 = qf8VarArr2[16];
            s5eVar.a(r5eVar2, Boolean.valueOf(z));
        }
        int i = 21;
        s5eVar.a(v4e.k, new r5(null, new or(this, i)));
        s5eVar.a(v4e.l, new r5(null, new fj(this, i)));
        s5eVar.a(v4e.m, new r5(null, new a1(this, 25)));
        o5e.b(s5eVar, pqVar);
    }

    @Override // androidx.compose.ui.e.c
    public final boolean R1() {
        return false;
    }

    public final void c2(boolean z, boolean z2, boolean z3, boolean z4) {
        if (z2 || z3 || z4) {
            s1a s1aVarD2 = d2();
            le0 le0Var = this.d0;
            tjf tjfVar = this.e0;
            pn5.a aVar = this.f0;
            int i = this.h0;
            boolean z5 = this.i0;
            int i2 = this.j0;
            int i3 = this.k0;
            List<le0.c<sab>> list = this.l0;
            s1aVarD2.a = le0Var;
            boolean zC = tjfVar.c(s1aVarD2.k);
            s1aVarD2.k = tjfVar;
            if (!zC) {
                s1aVarD2.q <<= 2;
                s1aVarD2.l = null;
                s1aVarD2.n = null;
                s1aVarD2.p = -1;
                s1aVarD2.o = -1;
            }
            s1aVarD2.b = aVar;
            s1aVarD2.c = i;
            s1aVarD2.d = z5;
            s1aVarD2.e = i2;
            s1aVarD2.f = i3;
            s1aVarD2.g = list;
            s1aVarD2.q = (s1aVarD2.q << 2) | 2;
            s1aVarD2.l = null;
            s1aVarD2.n = null;
            s1aVarD2.p = -1;
            s1aVarD2.o = -1;
        }
        if (this.c0) {
            if (z2 || (z && this.s0 != null)) {
                us3.f(this).U();
            }
            if (z2 || z3 || z4) {
                us3.f(this).S();
                fb4.a(this);
            }
            if (z) {
                fb4.a(this);
            }
        }
    }

    @Override // defpackage.lm8
    public final bg9 d(q qVar, vf9 vf9Var, long j) {
        Trace.beginSection("TextAnnotatedStringNode:measure");
        try {
            s1a s1aVarE2 = e2(qVar);
            boolean zC = s1aVarE2.c(j, qVar.getLayoutDirection());
            mif mifVar = s1aVarE2.n;
            if (mifVar == null) {
                throw new IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: " + s1aVarE2);
            }
            long j2 = mifVar.c;
            mifVar.b.a.a();
            if (zC) {
                us3.d(this, 2).G1();
                Function1<? super mif, j6g> function1 = this.g0;
                if (function1 != null) {
                    function1.invoke(mifVar);
                }
                h3e h3eVar = this.n0;
                if (h3eVar != null) {
                    mif mifVar2 = (mif) h3eVar.d.b;
                    if (mifVar2 != null && !wl7.b(mifVar2.a.a, mifVar.a.a)) {
                        h3eVar.b.e(h3eVar.a);
                    }
                    h3eVar.d = mte.a(h3eVar.d, null, mifVar, 1);
                }
                Map<d20, Integer> linkedHashMap = this.q0;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap<>(2);
                }
                linkedHashMap.put(e20.a, Integer.valueOf(Math.round(mifVar.d)));
                linkedHashMap.put(e20.b, Integer.valueOf(Math.round(mifVar.e)));
                this.q0 = linkedHashMap;
            }
            Function1<? super List<qtc>, j6g> function12 = this.m0;
            if (function12 != null) {
                function12.invoke(mifVar.f);
            }
            int i = (int) (j2 >> 32);
            int i2 = (int) (j2 & 4294967295L);
            w wVarR = vf9Var.R(iq2.a.b(i, i, i2, i2));
            Map<d20, Integer> map = this.q0;
            map.getClass();
            return qVar.Y0(i, i2, map, new cd(wVarR, 17));
        } finally {
            Trace.endSection();
        }
    }

    public final s1a d2() {
        if (this.r0 == null) {
            this.r0 = new s1a(this.d0, this.e0, this.f0, this.h0, this.i0, this.j0, this.k0, this.l0);
        }
        s1a s1aVar = this.r0;
        s1aVar.getClass();
        return s1aVar;
    }

    public final s1a e2(iy3 iy3Var) {
        s1a s1aVar;
        a aVar = this.t0;
        if (aVar != null && aVar.c && (s1aVar = aVar.d) != null) {
            s1aVar.d(iy3Var);
            return s1aVar;
        }
        s1a s1aVarD2 = d2();
        s1aVarD2.d(iy3Var);
        return s1aVarD2;
    }

    public final boolean f2(Function1<? super mif, j6g> function1, Function1<? super List<qtc>, j6g> function12, h3e h3eVar, Function1<? super a, j6g> function13) {
        boolean z;
        if (this.g0 != function1) {
            this.g0 = function1;
            z = true;
        } else {
            z = false;
        }
        if (this.m0 != function12) {
            this.m0 = function12;
            z = true;
        }
        if (!wl7.b(this.n0, h3eVar)) {
            this.n0 = h3eVar;
            z = true;
        }
        if (this.p0 == function13) {
            return z;
        }
        this.p0 = function13;
        return true;
    }

    public final boolean g2(tjf tjfVar, List list, int i, int i2, boolean z, pn5.a aVar, int i3) {
        boolean z2 = !this.e0.c(tjfVar);
        this.e0 = tjfVar;
        if (!wl7.b(this.l0, list)) {
            this.l0 = list;
            z2 = true;
        }
        if (this.k0 != i) {
            this.k0 = i;
            z2 = true;
        }
        if (this.j0 != i2) {
            this.j0 = i2;
            z2 = true;
        }
        if (this.i0 != z) {
            this.i0 = z;
            z2 = true;
        }
        if (!wl7.b(this.f0, aVar)) {
            this.f0 = aVar;
            z2 = true;
        }
        if (this.h0 == i3) {
            return z2;
        }
        this.h0 = i3;
        return true;
    }

    public final boolean h2(le0 le0Var) {
        boolean zB = wl7.b(this.d0.b, le0Var.b);
        boolean z = (zB && wl7.b(this.d0.a, le0Var.a)) ? false : true;
        if (z) {
            this.d0 = le0Var;
        }
        if (!zB) {
            this.t0 = null;
        }
        return z;
    }

    @Override // defpackage.lm8
    public final int p(w59 w59Var, pl7 pl7Var, int i) {
        return rdf.a(e2(w59Var).e(w59Var.getLayoutDirection()).c());
    }

    @Override // defpackage.lm8
    public final int r(w59 w59Var, pl7 pl7Var, int i) {
        return e2(w59Var).a(i, w59Var.getLayoutDirection());
    }

    @Override // defpackage.lm8
    public final int v(w59 w59Var, pl7 pl7Var, int i) {
        return e2(w59Var).a(i, w59Var.getLayoutDirection());
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00d4  */
    @Override // defpackage.eb4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y(defpackage.sm8 r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 431
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.b.y(sm8):void");
    }

    @Override // defpackage.lm8
    public final int z(w59 w59Var, pl7 pl7Var, int i) {
        return rdf.a(e2(w59Var).e(w59Var.getLayoutDirection()).b());
    }
}
