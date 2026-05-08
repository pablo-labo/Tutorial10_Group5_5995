package defpackage;

import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.FunctionCallException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.JNIFunctionBody;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z1f implements JNIFunctionBody, c7g {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z1f(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // defpackage.c7g
    public Object a() {
        return ((Method) this.a).invoke(this.b, (Class) this.c);
    }

    @Override // expo.modules.kotlin.jni.JNIFunctionBody
    public Object invoke(Object[] objArr) throws FunctionCallException {
        CodedException unexpectedException;
        a2f a2fVar = (a2f) this.a;
        String str = (String) this.b;
        gk0 gk0Var = (gk0) this.c;
        objArr.getClass();
        try {
            return a2fVar.g.b.a(a2fVar.h.invoke(qf0.b(a2fVar, objArr, gk0Var)));
        } catch (Throwable th) {
            if (th instanceof CodedException) {
                unexpectedException = (CodedException) th;
            } else if (th instanceof expo.modules.core.errors.CodedException) {
                expo.modules.core.errors.CodedException codedException = (expo.modules.core.errors.CodedException) th;
                unexpectedException = new CodedException(codedException.a(), codedException.getMessage(), codedException.getCause());
            } else {
                unexpectedException = new UnexpectedException(th);
            }
            throw new FunctionCallException(a2fVar.a, str, unexpectedException);
        }
    }
}
