package defpackage;

import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.JavaScriptFunction;

/* JADX INFO: loaded from: classes3.dex */
public final class xv7<T> extends kka<JavaScriptFunction<T>> {
    public final zf8 a;

    public xv7(zf8 zf8Var) {
        zf8Var.getClass();
        this.a = zf8Var;
    }

    @Override // defpackage.kka, defpackage.owf
    public final boolean b() {
        return false;
    }

    @Override // defpackage.owf
    public final ExpectedType c() {
        return new ExpectedType(s23.h0);
    }

    @Override // defpackage.kka
    public final Object d(Object obj, gk0 gk0Var, boolean z) {
        JavaScriptFunction javaScriptFunction = (JavaScriptFunction) obj;
        zf8 zf8Var = ((gg8) z92.O0(this.a.g())).b;
        if (zf8Var != null) {
            javaScriptFunction.a = zf8Var;
            return javaScriptFunction;
        }
        l5.q("Required value was null.");
        return null;
    }
}
