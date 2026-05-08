package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uga {
    public final String a;
    public final String b;
    public final hga c;
    public final vga d;

    public uga(String str, String str2, hga hgaVar, vga vgaVar) {
        this.a = str;
        this.b = str2;
        this.c = hgaVar;
        this.d = vgaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uga)) {
            return false;
        }
        uga ugaVar = (uga) obj;
        return this.a.equals(ugaVar.a) && wl7.b(this.b, ugaVar.b) && this.c.equals(ugaVar.c) && wl7.b(this.d, ugaVar.d);
    }

    public final int hashCode() {
        int iB = k20.b(this.c.a, akb.d(this.a.hashCode() * 31, 31, this.b), 31);
        vga vgaVar = this.d;
        return iB + (vgaVar == null ? 0 : vgaVar.hashCode());
    }

    public final String toString() {
        return "NetworkRequest(url=" + this.a + ", method=" + this.b + ", headers=" + this.c + ", body=" + this.d + ')';
    }
}
