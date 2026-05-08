package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class msc {
    public final int a;
    public final String b;
    public final String c;

    public msc(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof msc)) {
            return false;
        }
        msc mscVar = (msc) obj;
        return this.a == mscVar.a && this.b.equals(mscVar.b) && this.c.equals(mscVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + akb.d(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return l6.i(m6.j(this.a, "RecentSearchAppWidgetItem(newCount=", ", keyword=", this.b, ", location="), this.c, ")");
    }
}
