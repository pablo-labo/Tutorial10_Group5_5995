package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g1a {
    public Class<?> a;
    public Class<?> b;
    public Class<?> c;

    public g1a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.a = cls;
        this.b = cls2;
        this.c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g1a.class != obj.getClass()) {
            return false;
        }
        g1a g1aVar = (g1a) obj;
        return this.a.equals(g1aVar.a) && this.b.equals(g1aVar.b) && xjg.b(this.c, g1aVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Class<?> cls = this.c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.a + ", second=" + this.b + '}';
    }

    public g1a() {
    }
}
