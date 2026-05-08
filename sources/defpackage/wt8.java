package defpackage;

import androidx.media3.datasource.cache.b;
import androidx.media3.datasource.cache.c;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public final class wt8 implements b {
    public final long a;
    public final TreeSet<au1> b = new TreeSet<>(new vt8());
    public long c;

    public wt8(long j) {
        this.a = j;
    }

    @Override // androidx.media3.datasource.cache.Cache.a
    public final void a(c cVar, mfe mfeVar) {
        this.b.add(mfeVar);
        this.c += mfeVar.c;
        TreeSet<au1> treeSet = this.b;
        while (this.c > this.a && !treeSet.isEmpty()) {
            au1 au1VarFirst = treeSet.first();
            synchronized (cVar) {
                ka2.q(!cVar.i);
                cVar.o(au1VarFirst);
            }
        }
    }

    @Override // androidx.media3.datasource.cache.b
    public final void b(c cVar, long j) {
        if (j != -1) {
            TreeSet<au1> treeSet = this.b;
            while (this.c + j > this.a && !treeSet.isEmpty()) {
                au1 au1VarFirst = treeSet.first();
                synchronized (cVar) {
                    ka2.q(!cVar.i);
                    cVar.o(au1VarFirst);
                }
            }
        }
    }

    @Override // androidx.media3.datasource.cache.Cache.a
    public final void c(au1 au1Var) {
        this.b.remove(au1Var);
        this.c -= au1Var.c;
    }

    @Override // androidx.media3.datasource.cache.Cache.a
    public final void d(c cVar, mfe mfeVar, mfe mfeVar2) {
        c(mfeVar);
        a(cVar, mfeVar2);
    }
}
