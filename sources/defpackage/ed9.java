package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ed9 {
    public final String a;
    public final y b;
    public final ae9 c;

    public ed9(String str, y yVar, ae9 ae9Var) {
        str.getClass();
        yVar.getClass();
        ae9Var.getClass();
        this.a = str;
        this.b = yVar;
        this.c = ae9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ed9)) {
            return false;
        }
        ed9 ed9Var = (ed9) obj;
        return wl7.b(this.a, ed9Var.a) && wl7.b(this.b, ed9Var.b) && wl7.b(this.c, ed9Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "MarkdownComponentModel(content=" + this.a + ", node=" + this.b + ", typography=" + this.c + ")";
    }
}
