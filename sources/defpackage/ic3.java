package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1", f = "DBUtil.android.kt", l = {109}, m = "invokeSuspend")
public final class ic3 extends c1f implements Function2<e13, lu2<Object>, Object> {
    final /* synthetic */ Function1 $block$inlined;
    final /* synthetic */ xed $db$inlined;
    final /* synthetic */ boolean $inTransaction$inlined;
    final /* synthetic */ boolean $isReadOnly$inlined;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic3(lu2 lu2Var, xed xedVar, Function1 function1, boolean z, boolean z2) {
        super(2, lu2Var);
        this.$db$inlined = xedVar;
        this.$isReadOnly$inlined = z;
        this.$inTransaction$inlined = z2;
        this.$block$inlined = function1;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new ic3(lu2Var, this.$db$inlined, this.$block$inlined, this.$isReadOnly$inlined, this.$inTransaction$inlined);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<Object> lu2Var) {
        return ((ic3) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                r7d.b(obj);
                return obj;
            }
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        xed xedVar = this.$db$inlined;
        boolean z = this.$isReadOnly$inlined;
        kc3 kc3Var = new kc3(null, xedVar, this.$block$inlined, this.$inTransaction$inlined, z);
        this.label = 1;
        Object objX = xedVar.x(z, kc3Var, this);
        g13 g13Var = g13.a;
        return objX == g13Var ? g13Var : objX;
    }
}
