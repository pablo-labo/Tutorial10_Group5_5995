package defpackage;

import defpackage.lx5;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class wy5 extends mj8 implements Function1<lx5.b, j6g> {
    final /* synthetic */ String $result;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy5(String str) {
        super(1);
        this.$result = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(lx5.b bVar) {
        lx5.b bVar2 = bVar;
        bVar2.getClass();
        bVar2.a("result", this.$result);
        return j6g.a;
    }
}
