package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class eja {
    public final j4a<qia> a = new j4a<>(new qia[16]);
    public final p3a<eja> b = new p3a<>(10);

    public boolean a(r59<yeb> r59Var, sl8 sl8Var, aj7 aj7Var, boolean z) {
        j4a<qia> j4aVar = this.a;
        qia[] qiaVarArr = j4aVar.a;
        int i = j4aVar.c;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z2 = qiaVarArr[i2].a(r59Var, sl8Var, aj7Var, z) || z2;
        }
        return z2;
    }

    public void b(aj7 aj7Var) {
        j4a<qia> j4aVar = this.a;
        int i = j4aVar.c;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (j4aVar.a[i].d.a == 0) {
                j4aVar.k(i);
            }
        }
    }
}
