package defpackage;

import defpackage.lx5;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class jy5 extends mj8 implements Function1<lx5.b, j6g> {
    final /* synthetic */ Function1<lx5.b, j6g> $extraParams;
    final /* synthetic */ String $screenName = "notification-center";
    final /* synthetic */ String $elementName = "action-next";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jy5(zz4 zz4Var) {
        super(1);
        this.$extraParams = zz4Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(lx5.b bVar) {
        lx5.b bVar2 = bVar;
        bVar2.getClass();
        this.$extraParams.invoke(bVar2);
        bVar2.a("screenName", this.$screenName);
        bVar2.a("elementName", this.$elementName);
        return j6g.a;
    }
}
