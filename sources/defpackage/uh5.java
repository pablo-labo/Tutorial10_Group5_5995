package defpackage;

import expo.modules.kotlin.jni.JavaScriptTypedArray;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uh5 extends qv5 implements Function1<JavaScriptTypedArray, th5> {
    public static final uh5 a = new uh5(1, th5.class, "<init>", "<init>(Lexpo/modules/kotlin/jni/JavaScriptTypedArray;)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final th5 invoke(JavaScriptTypedArray javaScriptTypedArray) {
        JavaScriptTypedArray javaScriptTypedArray2 = javaScriptTypedArray;
        javaScriptTypedArray2.getClass();
        return new th5(javaScriptTypedArray2);
    }
}
