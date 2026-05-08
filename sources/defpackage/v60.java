package defpackage;

import defpackage.ax1;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v60 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ v60(float f, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = f;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        float f = this.b;
        switch (i) {
            case 0:
                m07 m07Var = (m07) obj3;
                ih1 ih1Var = (ih1) obj2;
                ss2 ss2Var = (ss2) obj;
                ss2Var.N1();
                ax1.b bVarW1 = ss2Var.w1();
                long jD = bVarW1.d();
                bVarW1.a().o();
                try {
                    bx1 bx1Var = bVarW1.a;
                    bx1Var.k(f, 0.0f);
                    bx1Var.f(0L, 45.0f);
                    ss2Var.o0(m07Var, ib5.a, ih1Var);
                    g7.k(bVarW1, jD);
                    return j6g.a;
                } catch (Throwable th) {
                    g7.k(bVarW1, jD);
                    throw th;
                }
            default:
                c88 c88Var = (c88) obj3;
                g4a g4aVar = (g4a) obj2;
                sl8 sl8Var = (sl8) obj;
                sl8Var.getClass();
                ra8 ra8Var = i6a.a;
                if (((kr7) cr8.p(kr7.class)).e("droid_native_myjobs_red_dot_tst").a >= 1) {
                    qtc qtcVarH = ojh.h(sl8Var);
                    if (qtcVarH.b >= 0.0f && qtcVarH.d <= f && !((Boolean) g4aVar.getValue()).booleanValue()) {
                        g4aVar.setValue(Boolean.TRUE);
                        c88Var.I.invoke();
                    }
                }
                return j6g.a;
        }
    }
}
