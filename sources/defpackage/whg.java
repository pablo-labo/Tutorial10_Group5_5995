package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class whg extends gr6 {
    public final String b;
    public final String c;

    public whg(String str, String str2, String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || whg.class != obj.getClass()) {
            return false;
        }
        whg whgVar = (whg) obj;
        return this.a.equals(whgVar.a) && Objects.equals(this.b, whgVar.b) && this.c.equals(whgVar.c);
    }

    public final int hashCode() {
        int iD = akb.d(527, 31, this.a);
        String str = this.b;
        return this.c.hashCode() + ((iD + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // defpackage.gr6
    public final String toString() {
        return this.a + ": url=" + this.c;
    }
}
