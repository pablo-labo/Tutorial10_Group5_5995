package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class t7h implements x7h {
    public static final Object c = new Object();
    public volatile x7h a;
    public volatile Object b;

    /* JADX WARN: Multi-variable type inference failed */
    public static t7h b(u7h u7hVar) {
        if (u7hVar instanceof t7h) {
            return (t7h) u7hVar;
        }
        t7h t7hVar = new t7h();
        t7hVar.b = c;
        t7hVar.a = u7hVar;
        return t7hVar;
    }

    @Override // defpackage.y7h
    public final Object a() {
        Object objA;
        Object obj = this.b;
        Object obj2 = c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objA = this.b;
                if (objA == obj2) {
                    objA = this.a.a();
                    Object obj3 = this.b;
                    if (obj3 != obj2 && obj3 != objA) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objA + ". This is likely due to a circular dependency.");
                    }
                    this.b = objA;
                    this.a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objA;
    }
}
