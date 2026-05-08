package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class n5e extends mj8 implements Function1<List<Float>, Boolean> {
    final /* synthetic */ gu5<Float> $action;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5e(qr qrVar) {
        super(1);
        this.$action = qrVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(List<Float> list) {
        boolean z;
        List<Float> list2 = list;
        Float fInvoke = this.$action.invoke();
        if (fInvoke == null) {
            z = false;
        } else {
            list2.add(fInvoke);
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
