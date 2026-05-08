package defpackage;

import defpackage.lx5;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class xx5 extends mj8 implements Function1<lx5.b, j6g> {
    final /* synthetic */ String $elementName;
    final /* synthetic */ Function1<lx5.b, j6g> $extraParams;
    final /* synthetic */ String $screenName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xx5(String str, String str2, Function1 function1) {
        super(1);
        this.$extraParams = function1;
        this.$elementName = str;
        this.$screenName = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(lx5.b bVar) {
        lx5.b bVar2 = bVar;
        bVar2.getClass();
        this.$extraParams.invoke(bVar2);
        bVar2.a("elementName", this.$elementName);
        bVar2.a("screenName", this.$screenName);
        return j6g.a;
    }
}
