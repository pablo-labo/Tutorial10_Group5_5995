package defpackage;

import expo.modules.kotlin.jni.JavaScriptTypedArray;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qg7 extends qv5 implements Function1<JavaScriptTypedArray, pg7> {
    public static final qg7 a = new qg7(1, pg7.class, "<init>", "<init>(Lexpo/modules/kotlin/jni/JavaScriptTypedArray;)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final pg7 invoke(JavaScriptTypedArray javaScriptTypedArray) {
        JavaScriptTypedArray javaScriptTypedArray2 = javaScriptTypedArray;
        javaScriptTypedArray2.getClass();
        return new pg7(javaScriptTypedArray2);
    }
}
