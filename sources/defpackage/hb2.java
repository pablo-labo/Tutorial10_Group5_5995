package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class hb2 extends mj8 implements Function1<fe0, da2> {
    final /* synthetic */ ta2 $colorSpace;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb2(ta2 ta2Var) {
        super(1);
        this.$colorSpace = ta2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final da2 invoke(fe0 fe0Var) {
        fe0 fe0Var2 = fe0Var;
        float f = fe0Var2.b;
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        float f2 = fe0Var2.c;
        if (f2 < -0.5f) {
            f2 = -0.5f;
        }
        if (f2 > 0.5f) {
            f2 = 0.5f;
        }
        float f3 = fe0Var2.d;
        float f4 = f3 >= -0.5f ? f3 : -0.5f;
        float f5 = f4 <= 0.5f ? f4 : 0.5f;
        float f6 = fe0Var2.a;
        float f7 = f6 >= 0.0f ? f6 : 0.0f;
        return new da2(da2.a(pnb.b(f, f2, f5, f7 <= 1.0f ? f7 : 1.0f, ya2.x), this.$colorSpace));
    }
}
