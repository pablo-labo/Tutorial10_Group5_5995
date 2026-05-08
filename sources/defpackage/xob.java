package defpackage;

import com.wlproctor.common.model.Payload;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class xob extends mj8 implements Function1<ybf, Payload> {
    final /* synthetic */ yob<k2> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xob(ed4 ed4Var) {
        super(1);
        this.this$0 = ed4Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Payload invoke(ybf ybfVar) {
        ybf ybfVar2 = ybfVar;
        ybfVar2.getClass();
        return this.this$0.b(ybfVar2.getName());
    }
}
