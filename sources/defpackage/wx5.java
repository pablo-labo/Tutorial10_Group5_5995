package defpackage;

import defpackage.lx5;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class wx5 extends mj8 implements Function1<lx5.b, j6g> {
    final /* synthetic */ Function1<lx5.b, j6g> $extraParams;
    final /* synthetic */ String $screenName;
    final /* synthetic */ String $url;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public wx5(String str, String str2, Function1<? super lx5.b, j6g> function1) {
        super(1);
        this.$screenName = str;
        this.$url = str2;
        this.$extraParams = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(lx5.b bVar) {
        lx5.b bVar2 = bVar;
        bVar2.getClass();
        bVar2.a("screenName", this.$screenName);
        bVar2.a("url", this.$url);
        this.$extraParams.invoke(bVar2);
        return j6g.a;
    }
}
