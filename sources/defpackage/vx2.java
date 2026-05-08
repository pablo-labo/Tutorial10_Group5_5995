package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class vx2 implements Function1<Integer, Object> {
    public final /* synthetic */ fn0 a;
    public final /* synthetic */ List b;

    public vx2(fn0 fn0Var, List list) {
        this.a = fn0Var;
        this.b = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Integer num) {
        int iIntValue = num.intValue();
        return this.a.invoke(Integer.valueOf(iIntValue), this.b.get(iIntValue));
    }
}
