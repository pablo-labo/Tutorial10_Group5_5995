package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class su1 implements Function1 {
    public static final su1 b = new su1(0);
    public static final su1 c = new su1(1);
    public final /* synthetic */ int a;

    public /* synthetic */ su1(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                Class cls = (Class) obj;
                kn2 kn2Var = uu1.a;
                cls.getClass();
                ke8 ke8VarA = uu1.a(cls);
                zr4 zr4Var = zr4.a;
                return qe8.a(ke8VarA, zr4Var, true, zr4Var);
            default:
                ParameterizedType parameterizedType = (ParameterizedType) obj;
                List<yd8<? extends Object>> list = wuc.a;
                parameterizedType.getClass();
                Type ownerType = parameterizedType.getOwnerType();
                if (ownerType instanceof ParameterizedType) {
                    return (ParameterizedType) ownerType;
                }
                return null;
        }
    }
}
