package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class b47 implements Serializable {
    public static final b47 a = new b47(new int[0]);
    private final int[] array;
    private final int end;

    public b47(int[] iArr) {
        int length = iArr.length;
        this.array = iArr;
        this.end = length;
    }

    public static b47 d(int i) {
        return new b47(new int[]{i});
    }

    public final boolean a() {
        int i = 0;
        while (true) {
            if (i >= this.end) {
                i = -1;
                break;
            }
            if (this.array[i] == 6) {
                break;
            }
            i++;
        }
        return i >= 0;
    }

    public final int b(int i) {
        pnb.s(i, this.end);
        return this.array[i];
    }

    public final int c() {
        return this.end;
    }

    public final int[] e() {
        return Arrays.copyOfRange(this.array, 0, this.end);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b47) {
            b47 b47Var = (b47) obj;
            if (this.end == b47Var.end) {
                for (int i = 0; i < this.end; i++) {
                    if (b(i) == b47Var.b(i)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.end; i2++) {
            i = (i * 31) + this.array[i2];
        }
        return i;
    }

    public Object readResolve() {
        return this.end == 0 ? a : this;
    }

    public final String toString() {
        int i = this.end;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        sb.append(this.array[0]);
        for (int i2 = 1; i2 < this.end; i2++) {
            sb.append(", ");
            sb.append(this.array[i2]);
        }
        sb.append(']');
        return sb.toString();
    }

    public Object writeReplace() {
        return this.end < this.array.length ? new b47(e()) : this;
    }
}
