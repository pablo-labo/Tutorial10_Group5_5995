package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class si7 extends gr6 {
    public final String b;
    public final String c;
    public final String d;

    public si7(String str, String str2, String str3) {
        super("----");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || si7.class != obj.getClass()) {
            return false;
        }
        si7 si7Var = (si7) obj;
        return this.c.equals(si7Var.c) && this.b.equals(si7Var.b) && this.d.equals(si7Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + akb.d(akb.d(527, 31, this.b), 31, this.c);
    }

    @Override // defpackage.gr6
    public final String toString() {
        return this.a + ": domain=" + this.b + ", description=" + this.c;
    }
}
