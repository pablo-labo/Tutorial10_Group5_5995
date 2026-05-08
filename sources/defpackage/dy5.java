package defpackage;

import defpackage.lx5;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class dy5 extends mj8 implements Function1<lx5.b, j6g> {
    final /* synthetic */ Function1<lx5.b, j6g> $extraParams;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy5(r19 r19Var) {
        super(1);
        this.$extraParams = r19Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(lx5.b bVar) {
        lx5.b bVar2 = bVar;
        bVar2.getClass();
        this.$extraParams.invoke(bVar2);
        return j6g.a;
    }
}
