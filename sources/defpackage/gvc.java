package defpackage;

import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gvc extends qv5 implements Function1<Method, rvc> {
    public static final gvc a = new gvc(1, rvc.class, "<init>", "<init>(Ljava/lang/reflect/Method;)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final rvc invoke(Method method) {
        Method method2 = method;
        method2.getClass();
        return new rvc(method2);
    }
}
