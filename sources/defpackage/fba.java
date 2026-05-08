package defpackage;

import androidx.navigation.b;
import androidx.navigation.k;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class fba extends mj8 implements Function1<k, String> {
    final /* synthetic */ Object $startDestRoute;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fba(Object obj) {
        super(1);
        this.$startDestRoute = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(k kVar) {
        k kVar2 = kVar;
        kVar2.getClass();
        Map mapG0 = lc9.g0(kVar2.V);
        LinkedHashMap linkedHashMap = new LinkedHashMap(kc9.V(mapG0.size()));
        for (Map.Entry entry : mapG0.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((b) entry.getValue()).a);
        }
        return ygd.c(this.$startDestRoute, linkedHashMap);
    }
}
