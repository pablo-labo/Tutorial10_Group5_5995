package defpackage;

import defpackage.pyf;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.JavaScriptTypedArray;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class hb1<T extends pyf> extends kka<T> {
    public final Function1<JavaScriptTypedArray, T> a;

    /* JADX WARN: Multi-variable type inference failed */
    public hb1(Function1<? super JavaScriptTypedArray, ? extends T> function1) {
        function1.getClass();
        this.a = function1;
    }

    @Override // defpackage.kka, defpackage.owf
    public boolean b() {
        return this instanceof ryf;
    }

    @Override // defpackage.owf
    public final ExpectedType c() {
        return new ExpectedType(s23.a0);
    }

    @Override // defpackage.kka
    public final Object d(Object obj, gk0 gk0Var, boolean z) {
        return this.a.invoke((JavaScriptTypedArray) obj);
    }
}
