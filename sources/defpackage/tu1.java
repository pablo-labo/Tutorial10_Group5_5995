package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class tu1 implements Function1 {
    public static final tu1 b = new tu1(0);
    public static final tu1 c = new tu1(1);
    public static final tu1 d = new tu1(2);
    public final /* synthetic */ int a;

    public /* synthetic */ tu1(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                kn2 kn2Var = uu1.a;
                ((Class) obj).getClass();
                return new ConcurrentHashMap();
            case 1:
                sfe sfeVar = (sfe) obj;
                qf8<Object>[] qf8VarArr = qp8.m;
                sfeVar.getClass();
                return sfeVar;
            default:
                ParameterizedType parameterizedType = (ParameterizedType) obj;
                List<yd8<? extends Object>> list = wuc.a;
                parameterizedType.getClass();
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                actualTypeArguments.getClass();
                return ut0.e0(actualTypeArguments);
        }
    }
}
