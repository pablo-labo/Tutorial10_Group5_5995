package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jhf {
    public final le0 a;
    public final long b;
    public final kjf c;

    public jhf(le0 le0Var, long j, kjf kjfVar) {
        kjf kjfVar2;
        this.a = le0Var;
        this.b = cr8.j(le0Var.b.length(), j);
        if (kjfVar != null) {
            kjfVar2 = new kjf(cr8.j(le0Var.b.length(), kjfVar.a));
        } else {
            kjfVar2 = null;
        }
        this.c = kjfVar2;
    }

    public static jhf a(jhf jhfVar, le0 le0Var, long j, int i) {
        if ((i & 1) != 0) {
            le0Var = jhfVar.a;
        }
        if ((i & 2) != 0) {
            j = jhfVar.b;
        }
        kjf kjfVar = (i & 4) != 0 ? jhfVar.c : null;
        jhfVar.getClass();
        return new jhf(le0Var, j, kjfVar);
    }

    public static jhf b(jhf jhfVar, String str) {
        long j = jhfVar.b;
        kjf kjfVar = jhfVar.c;
        jhfVar.getClass();
        return new jhf(new le0(str), j, kjfVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhf)) {
            return false;
        }
        jhf jhfVar = (jhf) obj;
        return kjf.b(this.b, jhfVar.b) && wl7.b(this.c, jhfVar.c) && wl7.b(this.a, jhfVar.a);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = kjf.c;
        int iD = ia.d(iHashCode, 31, this.b);
        kjf kjfVar = this.c;
        return iD + (kjfVar != null ? Long.hashCode(kjfVar.a) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.a) + "', selection=" + ((Object) kjf.h(this.b)) + ", composition=" + this.c + ')';
    }

    public jhf(String str, long j, int i) {
        this(new le0((i & 1) != 0 ? "" : str), (i & 2) != 0 ? kjf.b : j, (kjf) null);
    }
}
