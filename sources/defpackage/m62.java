package defpackage;

import java.util.function.Function;

/* JADX INFO: loaded from: classes3.dex */
public final class m62<R> implements Function<Class<?>, R> {
    public final Function<Class<?>, R> a;

    public m62(Function<Class<?>, R> function) {
        this.a = function;
    }

    @Override // java.util.function.Function
    public final Object apply(Class<?> cls) {
        return this.a.apply(cls);
    }
}
