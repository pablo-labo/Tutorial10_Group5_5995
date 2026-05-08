package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class y6g extends d7g {
    public final /* synthetic */ Method b;
    public final /* synthetic */ int c;

    public y6g(int i, Method method) {
        this.b = method;
        this.c = i;
    }

    @Override // defpackage.d7g
    public final <T> T a(Class<T> cls) {
        String strA = pq2.a(cls);
        if (strA == null) {
            return (T) this.b.invoke(null, cls, Integer.valueOf(this.c));
        }
        g7.l("UnsafeAllocator is used for non-instantiable type: ".concat(strA));
        return null;
    }
}
