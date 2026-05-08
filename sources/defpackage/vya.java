package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vya implements k52 {
    public final Class<?> a;

    public vya(Class cls) {
        cls.getClass();
        this.a = cls;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vya) {
            return wl7.b(this.a, ((vya) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.k52
    public final Class<?> j() {
        return this.a;
    }

    public final String toString() {
        return this.a + " (Kotlin reflection is not available)";
    }
}
