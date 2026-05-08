package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class xeb {
    public int a = 0;
    public Serializable b;

    public xeb(String str) {
        this.b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Serializable, long[]] */
    public void a(long j) {
        if (b(j)) {
            return;
        }
        int i = this.a;
        long[] jArr = (long[]) this.b;
        int length = jArr.length;
        Object[] objArr = jArr;
        if (i >= length) {
            ?? CopyOf = Arrays.copyOf(jArr, Math.max(i + 1, jArr.length * 2));
            this.b = CopyOf;
            objArr = CopyOf;
        }
        objArr[i] = j;
        if (i >= this.a) {
            this.a = i + 1;
        }
    }

    public boolean b(long j) {
        int i = this.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (((long[]) this.b)[i2] == j) {
                return true;
            }
        }
        return false;
    }

    public void c(long j) {
        int i = this.a;
        int i2 = 0;
        while (i2 < i) {
            if (j == ((long[]) this.b)[i2]) {
                int i3 = this.a - 1;
                while (i2 < i3) {
                    long[] jArr = (long[]) this.b;
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.a--;
                return;
            }
            i2++;
        }
    }
}
