package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class et1 extends mj8 implements Function1<ss2, j6g> {
    final /* synthetic */ Function1<gb4, j6g> $block;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et1(lff lffVar) {
        super(1);
        this.$block = lffVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(ss2 ss2Var) {
        ss2 ss2Var2 = ss2Var;
        this.$block.invoke(ss2Var2);
        ss2Var2.N1();
        return j6g.a;
    }
}
