package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class i8b {
    public final o8b a;
    public final boolean b;

    public i8b(o8b o8bVar, boolean z) {
        this.a = o8bVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8b)) {
            return false;
        }
        i8b i8bVar = (i8b) obj;
        return this.a == i8bVar.a && this.b == i8bVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PermissionsResponse(status=" + this.a + ", canAskAgain=" + this.b + ")";
    }
}
