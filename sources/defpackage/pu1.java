package defpackage;

import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class pu1 implements Function1 {
    public static final pu1 b = new pu1(0);
    public static final pu1 c = new pu1(1);
    public static final pu1 d = new pu1(2);
    public final /* synthetic */ int a;

    public /* synthetic */ pu1(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                Class cls = (Class) obj;
                kn2 kn2Var = uu1.a;
                cls.getClass();
                return new ke8(cls);
            case 1:
                Class<?> returnType = ((Method) obj).getReturnType();
                returnType.getClass();
                return wuc.b(returnType);
            default:
                aj3 aj3Var = (aj3) obj;
                aj3Var.getClass();
                return Boolean.valueOf(aj3Var instanceof fv1);
        }
    }
}
