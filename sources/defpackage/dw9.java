package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class dw9 extends mj8 implements Function1<s5e, j6g> {
    final /* synthetic */ String $closeSheet;
    final /* synthetic */ gu5<j6g> $onDismissRequest;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dw9(String str, gu5<j6g> gu5Var) {
        super(1);
        this.$closeSheet = str;
        this.$onDismissRequest = gu5Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(s5e s5eVar) {
        s5e s5eVar2 = s5eVar;
        o5e.l(s5eVar2, 1.0f);
        o5e.f(s5eVar2, this.$closeSheet);
        s5eVar2.a(v4e.b, new r5(null, new cw9(this.$onDismissRequest)));
        return j6g.a;
    }
}
