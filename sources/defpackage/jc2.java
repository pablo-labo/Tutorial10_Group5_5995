package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class jc2 extends gr6 {
    public final String b;
    public final String c;
    public final String d;

    public jc2(String str, String str2, String str3) {
        super("COMM");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jc2.class != obj.getClass()) {
            return false;
        }
        jc2 jc2Var = (jc2) obj;
        return this.c.equals(jc2Var.c) && this.b.equals(jc2Var.b) && Objects.equals(this.d, jc2Var.d);
    }

    public final int hashCode() {
        int iD = akb.d(akb.d(527, 31, this.b), 31, this.c);
        String str = this.d;
        return iD + (str != null ? str.hashCode() : 0);
    }

    @Override // defpackage.gr6
    public final String toString() {
        return this.a + ": language=" + this.b + ", description=" + this.c + ", text=" + this.d;
    }
}
