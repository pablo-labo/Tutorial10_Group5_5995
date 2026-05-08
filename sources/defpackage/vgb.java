package defpackage;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class vgb extends mj8 implements Function1<gu5<? extends j6g>, j6g> {
    final /* synthetic */ tgb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vgb(tgb tgbVar) {
        super(1);
        this.this$0 = tgbVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(gu5<? extends j6g> gu5Var) {
        gu5<? extends j6g> gu5Var2 = gu5Var;
        Handler handler = this.this$0.getHandler();
        if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
            gu5Var2.invoke();
        } else {
            Handler handler2 = this.this$0.getHandler();
            if (handler2 != null) {
                handler2.post(new gg2(gu5Var2, 9));
            }
        }
        return j6g.a;
    }
}
