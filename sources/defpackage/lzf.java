package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lzf extends qv5 implements Function1<Class<?>, Class<?>> {
    public static final lzf a = new lzf(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Class<?> invoke(Class<?> cls) {
        Class<?> cls2 = cls;
        cls2.getClass();
        return cls2.getComponentType();
    }
}
