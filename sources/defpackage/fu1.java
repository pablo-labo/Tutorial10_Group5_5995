package defpackage;

import java.util.ArrayList;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public final class fu1 {
    public final int a;
    public final String b;
    public final TreeSet<mfe> c = new TreeSet<>();
    public final ArrayList<a> d = new ArrayList<>();
    public nm3 e;

    public static final class a {
        public final long a;
        public final long b;

        public a(long j, long j2) {
            this.a = j;
            this.b = j2;
        }
    }

    public fu1(int i, String str, nm3 nm3Var) {
        this.a = i;
        this.b = str;
        this.e = nm3Var;
    }

    public final boolean a(long j, long j2) {
        int i = 0;
        while (true) {
            ArrayList<a> arrayList = this.d;
            if (i >= arrayList.size()) {
                return false;
            }
            a aVar = arrayList.get(i);
            long j3 = aVar.a;
            long j4 = aVar.b;
            if (j4 == -1) {
                if (j >= j3) {
                    return true;
                }
            } else if (j2 != -1 && j3 <= j && j + j2 <= j3 + j4) {
                return true;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fu1.class == obj.getClass()) {
            fu1 fu1Var = (fu1) obj;
            if (this.a == fu1Var.a && this.b.equals(fu1Var.b) && this.c.equals(fu1Var.c) && this.e.equals(fu1Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + akb.d(this.a * 31, 31, this.b);
    }
}
