package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class yl7 extends pu2 {
    final /* synthetic */ Object $receiver$inlined;
    final /* synthetic */ Function2 $this_createCoroutineUnintercepted$inlined;
    private int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yl7(lu2 lu2Var, v03 v03Var, Function2 function2, lu2 lu2Var2) {
        super(lu2Var, v03Var);
        this.$this_createCoroutineUnintercepted$inlined = function2;
        this.$receiver$inlined = lu2Var2;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                r6.g("This coroutine had already completed");
                return null;
            }
            this.label = 2;
            r7d.b(obj);
            return obj;
        }
        this.label = 1;
        r7d.b(obj);
        this.$this_createCoroutineUnintercepted$inlined.getClass();
        Function2 function2 = this.$this_createCoroutineUnintercepted$inlined;
        pxf.d(2, function2);
        return function2.invoke(this.$receiver$inlined, this);
    }
}
