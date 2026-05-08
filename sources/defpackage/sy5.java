package defpackage;

import defpackage.lx5;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class sy5 extends mj8 implements Function1<lx5.b, j6g> {
    final /* synthetic */ String $condition;
    final /* synthetic */ boolean $decision;
    final /* synthetic */ Function1<lx5.b, j6g> $extraParams;
    final /* synthetic */ String $flowName = "onboarding";
    final /* synthetic */ Long $count = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sy5(boolean z, String str, Function1 function1) {
        super(1);
        this.$decision = z;
        this.$condition = str;
        this.$extraParams = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(lx5.b bVar) {
        lx5.b bVar2 = bVar;
        bVar2.getClass();
        bVar2.a("flowName", this.$flowName);
        bVar2.c("decision", Boolean.valueOf(this.$decision));
        bVar2.a("condition", this.$condition);
        Long l = this.$count;
        if (l != null) {
            bVar2.b("value", Long.valueOf(l.longValue()));
        }
        this.$extraParams.invoke(bVar2);
        return j6g.a;
    }
}
