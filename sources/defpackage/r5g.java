package defpackage;

import expo.modules.kotlin.jni.JavaScriptTypedArray;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r5g extends qv5 implements Function1<JavaScriptTypedArray, q5g> {
    public static final r5g a = new r5g(1, q5g.class, "<init>", "<init>(Lexpo/modules/kotlin/jni/JavaScriptTypedArray;)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final q5g invoke(JavaScriptTypedArray javaScriptTypedArray) {
        JavaScriptTypedArray javaScriptTypedArray2 = javaScriptTypedArray;
        javaScriptTypedArray2.getClass();
        return new q5g(javaScriptTypedArray2);
    }
}
