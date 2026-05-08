package defpackage;

import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.JNIFunctionBody;
import expo.modules.kotlin.jni.decorators.JSDecoratorsBridgingObject;

/* JADX INFO: loaded from: classes3.dex */
public final class a4c {
    public final String a;
    public final a2f b;
    public final a2f c;

    public a4c(String str, a2f a2fVar, a2f a2fVar2) {
        this.a = str;
        this.b = a2fVar;
        this.c = a2fVar2;
    }

    public final void a(final gk0 gk0Var, JSDecoratorsBridgingObject jSDecoratorsBridgingObject) {
        ExpectedType[] expectedTypeArr;
        ExpectedType[] expectedTypeArr2;
        a2f a2fVar = this.b;
        ra6 ra6Var = a2fVar != null ? new ra6(this, gk0Var) : null;
        a2f a2fVar2 = this.c;
        JNIFunctionBody jNIFunctionBody = a2fVar2 != null ? new JNIFunctionBody() { // from class: z3c
            @Override // expo.modules.kotlin.jni.JNIFunctionBody
            public final Object invoke(Object[] objArr) {
                objArr.getClass();
                a2f a2fVar3 = this.a.c;
                a2fVar3.h.invoke(qf0.b(a2fVar3, objArr, gk0Var));
                return null;
            }
        } : null;
        boolean z = a2fVar != null && a2fVar.d();
        if (a2fVar == null || (expectedTypeArr = (ExpectedType[]) a2fVar.c().toArray(new ExpectedType[0])) == null) {
            expectedTypeArr = new ExpectedType[0];
        }
        ExpectedType[] expectedTypeArr3 = expectedTypeArr;
        boolean z2 = a2fVar2 != null && a2fVar2.d();
        if (a2fVar2 == null || (expectedTypeArr2 = (ExpectedType[]) a2fVar2.c().toArray(new ExpectedType[0])) == null) {
            expectedTypeArr2 = new ExpectedType[0];
        }
        jSDecoratorsBridgingObject.registerProperty(this.a, z, expectedTypeArr3, ra6Var, z2, expectedTypeArr2, jNIFunctionBody);
    }
}
