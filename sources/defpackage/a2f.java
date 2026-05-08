package defpackage;

import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.decorators.JSDecoratorsBridgingObject;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class a2f extends qf0 {
    public final gad g;
    public final Function1<Object[], Object> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a2f(String str, rf0[] rf0VarArr, gad gadVar, Function1<? super Object[], ? extends Object> function1) {
        super(str, rf0VarArr);
        str.getClass();
        this.g = gadVar;
        this.h = function1;
    }

    @Override // defpackage.qf0
    public final void a(gk0 gk0Var, JSDecoratorsBridgingObject jSDecoratorsBridgingObject, String str) {
        str.getClass();
        jSDecoratorsBridgingObject.registerSyncFunction(this.a, d(), this.e, (ExpectedType[]) c().toArray(new ExpectedType[0]), new z1f(this, str, gk0Var));
    }
}
