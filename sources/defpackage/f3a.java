package defpackage;

import androidx.compose.foundation.lazy.layout.b;

/* JADX INFO: loaded from: classes.dex */
public final class f3a {
    public int a;
    public Object b = new j4a(new mj7[16]);
    public Object c;

    public void a(int i, b.a aVar) {
        if (i < 0) {
            de7.a("size should be >=0");
        }
        if (i == 0) {
            return;
        }
        mj7 mj7Var = new mj7(this.a, i, aVar);
        this.a += i;
        ((j4a) this.b).b(mj7Var);
    }

    public mj7 b(int i) {
        if (i < 0 || i >= this.a) {
            StringBuilder sbG = o6.g(i, "Index ", ", size ");
            sbG.append(this.a);
            de7.e(sbG.toString());
        }
        mj7 mj7Var = (mj7) this.c;
        if (mj7Var != null) {
            int i2 = mj7Var.a;
            if (i < mj7Var.b + i2 && i2 <= i) {
                return mj7Var;
            }
        }
        j4a j4aVar = (j4a) this.b;
        mj7 mj7Var2 = (mj7) j4aVar.a[c0h.e(i, j4aVar)];
        this.c = mj7Var2;
        return mj7Var2;
    }
}
