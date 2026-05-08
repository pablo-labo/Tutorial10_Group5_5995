package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class f20 {
    public final g20 a;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public g20 h;
    public boolean b = true;
    public final HashMap i = new HashMap();

    public static final class a extends mj8 implements Function1<g20, j6g> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(g20 g20Var) {
            g20 g20Var2 = g20Var;
            if (g20Var2.k()) {
                if (g20Var2.r().b) {
                    g20Var2.E();
                }
                HashMap map = g20Var2.r().i;
                f20 f20Var = f20.this;
                for (Map.Entry entry : map.entrySet()) {
                    f20.a(f20Var, (d20) entry.getKey(), ((Number) entry.getValue()).intValue(), g20Var2.M());
                }
                tia tiaVar = g20Var2.M().i0;
                tiaVar.getClass();
                while (!tiaVar.equals(f20.this.a.M())) {
                    Set<d20> setKeySet = f20.this.c(tiaVar).keySet();
                    f20 f20Var2 = f20.this;
                    for (d20 d20Var : setKeySet) {
                        f20.a(f20Var2, d20Var, f20Var2.d(tiaVar, d20Var), tiaVar);
                    }
                    tiaVar = tiaVar.i0;
                    tiaVar.getClass();
                }
            }
            return j6g.a;
        }
    }

    public f20(g20 g20Var) {
        this.a = g20Var;
    }

    public static final void a(f20 f20Var, d20 d20Var, int i, tia tiaVar) {
        long jB;
        HashMap map = f20Var.i;
        float f = i;
        long jFloatToRawIntBits = ((long) Float.floatToRawIntBits(f)) << 32;
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f)) & 4294967295L;
        loop0: while (true) {
            jB = jFloatToRawIntBits | jFloatToRawIntBits2;
            do {
                jB = f20Var.b(tiaVar, jB);
                tiaVar = tiaVar.i0;
                tiaVar.getClass();
                if (tiaVar.equals(f20Var.a.M())) {
                    break loop0;
                }
            } while (!f20Var.c(tiaVar).containsKey(d20Var));
            float fD = f20Var.d(tiaVar, d20Var);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fD);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fD);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        }
        int iRound = Math.round(d20Var instanceof tj6 ? Float.intBitsToFloat((int) (jB & 4294967295L)) : Float.intBitsToFloat((int) (jB >> 32)));
        if (map.containsKey(d20Var)) {
            int iIntValue = ((Number) lc9.Y(d20Var, map)).intValue();
            tj6 tj6Var = e20.a;
            iRound = d20Var.a.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iRound)).intValue();
        }
        map.put(d20Var, Integer.valueOf(iRound));
    }

    public abstract long b(tia tiaVar, long j);

    public abstract Map<d20, Integer> c(tia tiaVar);

    public abstract int d(tia tiaVar, d20 d20Var);

    public final boolean e() {
        return this.c || this.e || this.f || this.g;
    }

    public final boolean f() {
        i();
        return this.h != null;
    }

    public final void g() {
        this.b = true;
        g20 g20Var = this.a;
        g20 g20VarZ = g20Var.z();
        if (g20VarZ == null) {
            return;
        }
        if (this.c) {
            g20VarZ.b0();
        } else if (this.e || this.d) {
            g20VarZ.requestLayout();
        }
        if (this.f) {
            g20Var.b0();
        }
        if (this.g) {
            g20Var.requestLayout();
        }
        g20VarZ.r().g();
    }

    public final void h() {
        HashMap map = this.i;
        map.clear();
        a aVar = new a();
        g20 g20Var = this.a;
        g20Var.X(aVar);
        map.putAll(c(g20Var.M()));
        this.b = false;
    }

    public final void i() {
        f20 f20VarR;
        f20 f20VarR2;
        boolean zE = e();
        g20 g20Var = this.a;
        if (!zE) {
            g20 g20VarZ = g20Var.z();
            if (g20VarZ == null) {
                return;
            }
            g20Var = g20VarZ.r().h;
            if (g20Var == null || !g20Var.r().e()) {
                g20 g20Var2 = this.h;
                if (g20Var2 == null || g20Var2.r().e()) {
                    return;
                }
                g20 g20VarZ2 = g20Var2.z();
                if (g20VarZ2 != null && (f20VarR2 = g20VarZ2.r()) != null) {
                    f20VarR2.i();
                }
                g20 g20VarZ3 = g20Var2.z();
                g20Var = (g20VarZ3 == null || (f20VarR = g20VarZ3.r()) == null) ? null : f20VarR.h;
            }
        }
        this.h = g20Var;
    }
}
