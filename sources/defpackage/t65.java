package defpackage;

import defpackage.zoe;
import java.lang.reflect.Constructor;
import java.util.function.Function;
import org.apache.avro.reflect.ReflectionUtil;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t65 implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ t65(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Class cls = (Class) obj;
        switch (this.a) {
            case 0:
                return ReflectionUtil.getConstructorAsFunction(String.class, cls);
            default:
                try {
                    Constructor declaredConstructor = cls.getDeclaredConstructor(zoe.b.class.isAssignableFrom(cls) ? zoe.q : zoe.p);
                    declaredConstructor.setAccessible(true);
                    return declaredConstructor;
                } catch (Exception e) {
                    l5.r(e);
                    return null;
                }
        }
    }
}
