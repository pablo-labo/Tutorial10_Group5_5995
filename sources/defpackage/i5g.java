package defpackage;

import expo.modules.kotlin.jni.JavaScriptTypedArray;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i5g extends qv5 implements Function1<JavaScriptTypedArray, h5g> {
    public static final i5g a = new i5g(1, h5g.class, "<init>", "<init>(Lexpo/modules/kotlin/jni/JavaScriptTypedArray;)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final h5g invoke(JavaScriptTypedArray javaScriptTypedArray) {
        JavaScriptTypedArray javaScriptTypedArray2 = javaScriptTypedArray;
        javaScriptTypedArray2.getClass();
        return new h5g(javaScriptTypedArray2);
    }
}
