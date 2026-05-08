package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class gfe extends mj8 implements Function1<Throwable, j6g> {
    final /* synthetic */ Function1<Throwable, j6g> $onComplete;
    final /* synthetic */ Function2<Object, Throwable, j6g> $onUndeliveredElement;
    final /* synthetic */ ife<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gfe(zge zgeVar, ife ifeVar, Function2 function2) {
        super(1);
        this.$onComplete = zgeVar;
        this.this$0 = ifeVar;
        this.$onUndeliveredElement = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(Throwable th) {
        j6g j6gVar;
        Throwable th2 = th;
        this.$onComplete.invoke(th2);
        this.this$0.c.n(th2, false);
        do {
            Object objA = j22.a(this.this$0.c.j());
            if (objA == null) {
                j6gVar = null;
            } else {
                this.$onUndeliveredElement.invoke(objA, th2);
                j6gVar = j6g.a;
            }
        } while (j6gVar != null);
        return j6g.a;
    }
}
