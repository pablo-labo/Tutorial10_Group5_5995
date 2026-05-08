package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class e31 extends xu8 {
    public final String a;
    public final String b;

    public e31(String str, String str2) {
        this.a = str;
        if (str2 != null) {
            this.b = str2;
        } else {
            ja.k("Null version");
            throw null;
        }
    }

    @Override // defpackage.xu8
    public final String a() {
        return this.a;
    }

    @Override // defpackage.xu8
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xu8)) {
            return false;
        }
        xu8 xu8Var = (xu8) obj;
        return this.a.equals(xu8Var.a()) && this.b.equals(xu8Var.b());
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.a);
        sb.append(", version=");
        return l6.i(sb, this.b, "}");
    }
}
