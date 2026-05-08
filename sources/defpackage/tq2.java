package defpackage;

import defpackage.kwc;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public final class tq2 implements hna<Object> {
    public final /* synthetic */ Constructor a;

    public tq2(Constructor constructor) {
        this.a = constructor;
    }

    @Override // defpackage.hna
    public final Object b() {
        Constructor constructor = this.a;
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e) {
            kwc.a aVar = kwc.a;
            l6.p("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
            return null;
        } catch (InstantiationException e2) {
            throw new RuntimeException("Failed to invoke constructor '" + kwc.b(constructor) + "' with no args", e2);
        } catch (InvocationTargetException e3) {
            l6.p("Failed to invoke constructor '" + kwc.b(constructor) + "' with no args", e3.getCause());
            return null;
        }
    }
}
