package defpackage;

import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.JNIAsyncFunctionBody;
import expo.modules.kotlin.jni.PromiseImpl;
import expo.modules.kotlin.jni.decorators.JSDecoratorsBridgingObject;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dv0 extends s81 {
    @Override // defpackage.qf0
    public final void a(final gk0 gk0Var, JSDecoratorsBridgingObject jSDecoratorsBridgingObject, final String str) {
        str.getClass();
        final WeakReference weakReference = new WeakReference(gk0Var);
        boolean zD = d();
        boolean z = this.e;
        rf0[] rf0VarArr = this.b;
        ArrayList arrayList = new ArrayList(rf0VarArr.length);
        for (rf0 rf0Var : rf0VarArr) {
            arrayList.add(((owf) rf0Var.c.getValue()).c());
        }
        jSDecoratorsBridgingObject.registerAsyncFunction(this.a, zD, z, (ExpectedType[]) arrayList.toArray(new ExpectedType[0]), new JNIAsyncFunctionBody(weakReference, str, this, gk0Var) { // from class: yu0
            public final /* synthetic */ String a;
            public final /* synthetic */ dv0 b;
            public final /* synthetic */ gk0 c;

            {
                this.a = str;
                this.b = this;
                this.c = gk0Var;
            }

            @Override // expo.modules.kotlin.jni.JNIAsyncFunctionBody
            public final void invoke(Object[] objArr, PromiseImpl promiseImpl) {
                objArr.getClass();
                promiseImpl.getClass();
                dv0 dv0Var = this.b;
                String str2 = this.a;
                gk0 gk0Var2 = this.c;
                zu0 zu0Var = new zu0(promiseImpl, dv0Var, str2, objArr, gk0Var2, 0);
                cac cacVar = dv0Var.g;
                if (cacVar == cac.b) {
                    u63.Y(gk0Var2.f, null, null, new av0(zu0Var, null), 3);
                } else if (cacVar == cac.a) {
                    u63.Y(gk0Var2.g, null, null, new bv0(zu0Var, null), 3);
                } else {
                    l.g();
                }
            }
        });
    }

    public abstract void g(Object[] objArr, p3c p3cVar, gk0 gk0Var);
}
