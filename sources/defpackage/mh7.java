package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class mh7 implements Iterable<Integer>, ze8 {
    public final int a;
    public final int b;
    public final int c;

    public mh7(int i, int i2, int i3) {
        if (i3 == 0) {
            l5.q("Step must be non-zero.");
            throw null;
        }
        if (i3 == Integer.MIN_VALUE) {
            l5.q("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.a = i;
        this.b = ojh.o(i, i2, i3);
        this.c = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof mh7)) {
            return false;
        }
        if (isEmpty() && ((mh7) obj).isEmpty()) {
            return true;
        }
        mh7 mh7Var = (mh7) obj;
        return this.a == mh7Var.a && this.b == mh7Var.b && this.c == mh7Var.c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public boolean isEmpty() {
        int i = this.b;
        int i2 = this.c;
        int i3 = this.a;
        return i2 > 0 ? i3 > i : i3 < i;
    }

    @Override // java.lang.Iterable
    public final Iterator<Integer> iterator() {
        return new nh7(this.a, this.b, this.c);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.b;
        int i2 = this.c;
        int i3 = this.a;
        if (i2 > 0) {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i2);
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i2);
        }
        return sb.toString();
    }
}
