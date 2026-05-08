package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class x6g extends d7g {
    public final /* synthetic */ Method b;
    public final /* synthetic */ Object c;

    public x6g(Object obj, Method method) {
        this.b = method;
        this.c = obj;
    }

    @Override // defpackage.d7g
    public final <T> T a(Class<T> cls) {
        String strA = pq2.a(cls);
        if (strA == null) {
            return (T) this.b.invoke(this.c, cls);
        }
        g7.l("UnsafeAllocator is used for non-instantiable type: ".concat(strA));
        return null;
    }
}
