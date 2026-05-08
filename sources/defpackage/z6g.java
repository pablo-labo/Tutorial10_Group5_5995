package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class z6g extends d7g {
    public final /* synthetic */ Method b;

    public z6g(Method method) {
        this.b = method;
    }

    @Override // defpackage.d7g
    public final <T> T a(Class<T> cls) {
        String strA = pq2.a(cls);
        if (strA == null) {
            return (T) this.b.invoke(null, cls, Object.class);
        }
        g7.l("UnsafeAllocator is used for non-instantiable type: ".concat(strA));
        return null;
    }
}
