package defpackage;

import defpackage.lx5;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class ny5 extends mj8 implements Function1<lx5.b, j6g> {
    final /* synthetic */ Map<String, String> $loggedParams;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ny5(Map<String, String> map) {
        super(1);
        this.$loggedParams = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(lx5.b bVar) {
        lx5.b bVar2 = bVar;
        bVar2.getClass();
        for (Map.Entry<String, String> entry : this.$loggedParams.entrySet()) {
            bVar2.a(entry.getKey(), entry.getValue());
        }
        return j6g.a;
    }
}
