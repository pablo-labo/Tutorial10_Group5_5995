package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class d5e extends mj8 implements Function1<s5e, j6g> {
    final /* synthetic */ qed $nodeRole;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5e(qed qedVar) {
        super(1);
        this.$nodeRole = qedVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(s5e s5eVar) {
        o5e.i(s5eVar, this.$nodeRole.a);
        return j6g.a;
    }
}
