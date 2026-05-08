package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class a90 extends mj8 implements Function1<th7, j6g> {
    final /* synthetic */ tgb $this_apply;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a90(tgb tgbVar) {
        super(1);
        this.$this_apply = tgbVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(th7 th7Var) {
        this.$this_apply.m38setPopupContentSizefhxjrPA(new th7(th7Var.a));
        this.$this_apply.o();
        return j6g.a;
    }
}
