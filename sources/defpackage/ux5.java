package defpackage;

import defpackage.lx5;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class ux5 extends mj8 implements Function1<lx5.b, j6g> {
    final /* synthetic */ Function1<lx5.b, j6g> $extraParams;
    final /* synthetic */ boolean $isCompatible;
    final /* synthetic */ String $screenName = "DeviceCompatibilityDialog";
    final /* synthetic */ Map<String, Boolean> $serviceCompatibility;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ux5(boolean z, Map map, Function1 function1) {
        super(1);
        this.$isCompatible = z;
        this.$serviceCompatibility = map;
        this.$extraParams = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(lx5.b bVar) {
        lx5.b bVar2 = bVar;
        bVar2.getClass();
        bVar2.a("screenName", this.$screenName);
        bVar2.c("isCompatible", Boolean.valueOf(this.$isCompatible));
        for (Map.Entry<String, Boolean> entry : this.$serviceCompatibility.entrySet()) {
            String key = entry.getKey();
            Boolean value = entry.getValue();
            value.getClass();
            bVar2.c(key, value);
        }
        this.$extraParams.invoke(bVar2);
        return j6g.a;
    }
}
