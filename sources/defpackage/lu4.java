package defpackage;

import defpackage.csf;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class lu4 extends mj8 implements Function1<csf.b<iu4>, jf5<Float>> {
    final /* synthetic */ lv4 $enter;
    final /* synthetic */ r25 $exit;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lu4(lv4 lv4Var, r25 r25Var) {
        super(1);
        this.$enter = lv4Var;
        this.$exit = r25Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final jf5<Float> invoke(csf.b<iu4> bVar) {
        jf5<Float> jf5Var;
        jf5<Float> jf5Var2;
        csf.b<iu4> bVar2 = bVar;
        iu4 iu4Var = iu4.a;
        iu4 iu4Var2 = iu4.b;
        if (bVar2.c(iu4Var, iu4Var2)) {
            k65 k65Var = this.$enter.a().a;
            return (k65Var == null || (jf5Var2 = k65Var.a) == null) ? ku4.b : jf5Var2;
        }
        if (!bVar2.c(iu4Var2, iu4.c)) {
            return ku4.b;
        }
        k65 k65Var2 = this.$exit.a().a;
        return (k65Var2 == null || (jf5Var = k65Var2.a) == null) ? ku4.b : jf5Var;
    }
}
