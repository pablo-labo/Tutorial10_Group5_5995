package defpackage;

import expo.modules.kotlin.jni.JavaScriptTypedArray;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class df1 extends qv5 implements Function1<JavaScriptTypedArray, cf1> {
    public static final df1 a = new df1(1, cf1.class, "<init>", "<init>(Lexpo/modules/kotlin/jni/JavaScriptTypedArray;)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final cf1 invoke(JavaScriptTypedArray javaScriptTypedArray) {
        JavaScriptTypedArray javaScriptTypedArray2 = javaScriptTypedArray;
        javaScriptTypedArray2.getClass();
        return new cf1(javaScriptTypedArray2);
    }
}
