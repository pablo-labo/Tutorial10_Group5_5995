package defpackage;

import androidx.compose.runtime.r;
import defpackage.ax1;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class dmg extends ykg {
    public final nd6 b;
    public String c;
    public boolean d;
    public final za4 e;
    public gu5<j6g> f;
    public final g4a g;
    public ih1 h;
    public final g4a i;
    public long j;
    public float k;
    public float l;
    public final b m;

    public static final class a extends mj8 implements Function1<ykg, j6g> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(ykg ykgVar) {
            dmg dmgVar = dmg.this;
            dmgVar.d = true;
            dmgVar.f.invoke();
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements Function1<gb4, j6g> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(gb4 gb4Var) {
            gb4 gb4Var2 = gb4Var;
            dmg dmgVar = dmg.this;
            nd6 nd6Var = dmgVar.b;
            float f = dmgVar.k;
            float f2 = dmgVar.l;
            ax1.b bVarW1 = gb4Var2.w1();
            long jD = bVarW1.d();
            bVarW1.a().o();
            try {
                bVarW1.a.g(0L, f, f2);
                nd6Var.a(gb4Var2);
                g7.k(bVarW1, jD);
                return j6g.a;
            } catch (Throwable th) {
                g7.k(bVarW1, jD);
                throw th;
            }
        }
    }

    public static final class c extends mj8 implements gu5<j6g> {
        public static final c a = new c(0);

        @Override // defpackage.gu5
        public final /* bridge */ /* synthetic */ j6g invoke() {
            return j6g.a;
        }
    }

    public dmg(nd6 nd6Var) {
        this.b = nd6Var;
        nd6Var.i = new a();
        this.c = "";
        this.d = true;
        this.e = new za4();
        this.f = c.a;
        this.g = r.f(null);
        this.i = r.f(new kie(0L));
        this.j = 9205357640488583168L;
        this.k = 1.0f;
        this.l = 1.0f;
        this.m = new b();
    }

    @Override // defpackage.ykg
    public final void a(gb4 gb4Var) {
        e(gb4Var, 1.0f, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(defpackage.gb4 r26, float r27, defpackage.ga2 r28) {
        /*
            Method dump skipped, instruction units count: 443
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmg.e(gb4, float, ga2):void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.c);
        sb.append("\n\tviewportWidth: ");
        g4a g4aVar = this.i;
        sb.append(Float.intBitsToFloat((int) (((kie) ((gme) g4aVar).getValue()).a >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((kie) ((gme) g4aVar).getValue()).a & 4294967295L)));
        sb.append("\n");
        return sb.toString();
    }
}
