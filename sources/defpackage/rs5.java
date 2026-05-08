package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class rs5 {
    public final List<Object> a;
    public long b;
    public long c;
    public boolean d;

    public rs5(List list) {
        list.getClass();
        this.a = list;
        this.b = 0L;
        this.c = 0L;
        this.d = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        rs5 rs5Var = (rs5) obj;
        return this.b == rs5Var.b && this.c == rs5Var.c && this.d == rs5Var.d && wl7.b(this.a, rs5Var.a);
    }

    public int hashCode() {
        return this.a.hashCode() + ia.f(ia.d(Long.hashCode(this.b) * 31, 31, this.c), 31, this.d);
    }

    public String toString() {
        return "FrameData(frameStartNanos=" + this.b + ", frameDurationUiNanos=" + this.c + ", isJank=" + this.d + ", states=" + this.a + ')';
    }
}
