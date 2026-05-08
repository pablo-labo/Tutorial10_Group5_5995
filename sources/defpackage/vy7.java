package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vy7 {
    public final String a;
    public final String b;
    public final long c;

    public vy7(long j, String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vy7)) {
            return false;
        }
        vy7 vy7Var = (vy7) obj;
        return wl7.b(this.a, vy7Var.a) && this.b.equals(vy7Var.b) && this.c == vy7Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + akb.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return r6.d(this.c, ")", u40.f("JobInvitation(id=", this.a, ", status=", this.b, ", sentAt="));
    }
}
