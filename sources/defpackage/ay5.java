package defpackage;

import defpackage.lx5;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class ay5 extends mj8 implements Function1<lx5.b, j6g> {
    final /* synthetic */ Function1<lx5.b, j6g> $extraParams;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay5(tj8 tj8Var) {
        super(1);
        this.$extraParams = tj8Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(lx5.b bVar) {
        lx5.b bVar2 = bVar;
        bVar2.getClass();
        this.$extraParams.invoke(bVar2);
        return j6g.a;
    }
}
