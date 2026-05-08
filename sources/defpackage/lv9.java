package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class lv9 extends mj8 implements Function1<Throwable, j6g> {
    final /* synthetic */ gu5<j6g> $onDismissRequest;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv9(gu5<j6g> gu5Var) {
        super(1);
        this.$onDismissRequest = gu5Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(Throwable th) {
        this.$onDismissRequest.invoke();
        return j6g.a;
    }
}
