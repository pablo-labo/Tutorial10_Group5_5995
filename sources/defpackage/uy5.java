package defpackage;

import defpackage.ax1;
import defpackage.lx5;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class uy5 extends mj8 implements Function1 {
    public static final uy5 b;
    public static final uy5 c;
    public final /* synthetic */ int a;

    static {
        int i = 1;
        b = new uy5(i, 0);
        c = new uy5(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uy5(int i, int i2) {
        super(i);
        this.a = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((lx5.b) obj).getClass();
                return j6g.a;
            default:
                ss2 ss2Var = (ss2) obj;
                ax1.b bVarW1 = ss2Var.w1();
                long jD = bVarW1.d();
                bVarW1.a().o();
                try {
                    bVarW1.a.d(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, 1);
                    ss2Var.N1();
                    g7.k(bVarW1, jD);
                    return j6g.a;
                } catch (Throwable th) {
                    g7.k(bVarW1, jD);
                    throw th;
                }
        }
    }
}
