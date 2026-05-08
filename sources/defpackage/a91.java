package defpackage;

import androidx.media3.datasource.a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class a91 implements a {
    public final boolean a;
    public final ArrayList<grf> b = new ArrayList<>(1);
    public int c;
    public gf3 d;

    public a91(boolean z) {
        this.a = z;
    }

    @Override // androidx.media3.datasource.a
    public final void i(grf grfVar) {
        grfVar.getClass();
        ArrayList<grf> arrayList = this.b;
        if (arrayList.contains(grfVar)) {
            return;
        }
        arrayList.add(grfVar);
        this.c++;
    }

    public final void o(int i) {
        gf3 gf3Var = this.d;
        String str = vjg.a;
        for (int i2 = 0; i2 < this.c; i2++) {
            this.b.get(i2).b(gf3Var, this.a, i);
        }
    }

    public final void p() {
        gf3 gf3Var = this.d;
        String str = vjg.a;
        for (int i = 0; i < this.c; i++) {
            this.b.get(i).f(gf3Var, this.a);
        }
        this.d = null;
    }

    public final void q(gf3 gf3Var) {
        for (int i = 0; i < this.c; i++) {
            this.b.get(i).getClass();
        }
    }

    public final void r(gf3 gf3Var) {
        this.d = gf3Var;
        for (int i = 0; i < this.c; i++) {
            this.b.get(i).g(gf3Var, this.a);
        }
    }
}
