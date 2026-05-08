package defpackage;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes.dex */
public final class bh5 {
    public final SparseBooleanArray a;

    public static final class a {
        public final SparseBooleanArray a = new SparseBooleanArray();
        public boolean b;

        public final void a(int i) {
            ka2.q(!this.b);
            this.a.append(i, true);
        }

        public final void b(bh5 bh5Var) {
            for (int i = 0; i < bh5Var.a.size(); i++) {
                a(bh5Var.b(i));
            }
        }

        public final void c(int... iArr) {
            for (int i : iArr) {
                a(i);
            }
        }

        public final bh5 d() {
            ka2.q(!this.b);
            this.b = true;
            return new bh5(this.a);
        }
    }

    public bh5(SparseBooleanArray sparseBooleanArray) {
        this.a = sparseBooleanArray;
    }

    public final boolean a(int... iArr) {
        for (int i : iArr) {
            if (this.a.get(i)) {
                return true;
            }
        }
        return false;
    }

    public final int b(int i) {
        SparseBooleanArray sparseBooleanArray = this.a;
        ka2.m(i, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bh5) {
            return this.a.equals(((bh5) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
