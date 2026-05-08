package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class xy7 extends mj8 implements Function1<Throwable, j6g> {
    final /* synthetic */ yy7<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xy7(yy7<Object> yy7Var) {
        super(1);
        this.this$0 = yy7Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(Throwable th) {
        Throwable th2 = th;
        yy7<Object> yy7Var = this.this$0;
        if (th2 == null) {
            if (!yy7Var.a.isDone()) {
                l5.q("Failed requirement.");
                return null;
            }
        } else if (th2 instanceof CancellationException) {
            yy7Var.a.cancel(true);
        } else {
            fbe<Object> fbeVar = yy7Var.a;
            Throwable cause = th2.getCause();
            if (cause != null) {
                th2 = cause;
            }
            fbeVar.j(th2);
        }
        return j6g.a;
    }
}
