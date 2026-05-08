package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.source.h;
import defpackage.ad2;
import defpackage.e2a;
import defpackage.e47;
import defpackage.ee3;
import defpackage.emf;
import defpackage.f2a;
import defpackage.grf;
import defpackage.ij9;
import defpackage.oj9;
import defpackage.qk3;
import defpackage.qyc;
import defpackage.ryc;
import defpackage.vjg;
import defpackage.wg2;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class MergingMediaSource extends c<Integer> {
    public static final ij9 s;
    public final h[] k;
    public final ArrayList l;
    public final emf[] m;
    public final ArrayList<h> n;
    public final ee3 o;
    public int p;
    public long[][] q;
    public IllegalMergeException r;

    public static final class IllegalMergeException extends IOException {
        public final int reason = 0;
    }

    public static final class a {
        public final h.b a;
        public final g b;

        public a(h.b bVar, g gVar) {
            this.a = bVar;
            this.b = gVar;
        }
    }

    static {
        ij9.b.a aVar = new ij9.b.a();
        ryc rycVar = ryc.V;
        e47.b bVar = e47.b;
        qyc qycVar = qyc.e;
        List list = Collections.EMPTY_LIST;
        qyc qycVar2 = qyc.e;
        ij9.e.a aVar2 = new ij9.e.a();
        s = new ij9("MergingMediaSource", new ij9.c(aVar), null, new ij9.e(aVar2), oj9.K, ij9.g.d);
    }

    public MergingMediaSource(h... hVarArr) {
        ee3 ee3Var = new ee3(16);
        this.k = hVarArr;
        this.o = ee3Var;
        this.n = new ArrayList<>(Arrays.asList(hVarArr));
        this.p = -1;
        this.l = new ArrayList(hVarArr.length);
        for (int i = 0; i < hVarArr.length; i++) {
            this.l.add(new ArrayList());
        }
        this.m = new emf[hVarArr.length];
        this.q = new long[0][];
        new HashMap();
        wg2.o(8, "expectedKeys");
        wg2.o(2, "expectedValuesPerKey");
        new f2a(ad2.a(8)).f = new e2a();
    }

    @Override // androidx.media3.exoplayer.source.h
    public final boolean a(ij9 ij9Var) {
        h[] hVarArr = this.k;
        return hVarArr.length > 0 && hVarArr[0].a(ij9Var);
    }

    @Override // androidx.media3.exoplayer.source.h
    public final ij9 d() {
        h[] hVarArr = this.k;
        return hVarArr.length > 0 ? hVarArr[0].d() : s;
    }

    @Override // androidx.media3.exoplayer.source.h
    public final void f(ij9 ij9Var) {
        this.k[0].f(ij9Var);
    }

    @Override // androidx.media3.exoplayer.source.h
    public final void h(g gVar) {
        j jVar = (j) gVar;
        int i = 0;
        while (true) {
            h[] hVarArr = this.k;
            if (i >= hVarArr.length) {
                return;
            }
            List list = (List) this.l.get(i);
            boolean[] zArr = jVar.b;
            g[] gVarArr = jVar.a;
            g gVar2 = zArr[i] ? ((s) gVarArr[i]).a : gVarArr[i];
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                }
                if (((a) list.get(i2)).b.equals(gVar2)) {
                    list.remove(i2);
                    break;
                }
                i2++;
            }
            hVarArr[i].h(jVar.b[i] ? ((s) gVarArr[i]).a : gVarArr[i]);
            i++;
        }
    }

    @Override // androidx.media3.exoplayer.source.c, androidx.media3.exoplayer.source.h
    public final void m() throws IllegalMergeException {
        IllegalMergeException illegalMergeException = this.r;
        if (illegalMergeException != null) {
            throw illegalMergeException;
        }
        super.m();
    }

    @Override // androidx.media3.exoplayer.source.h
    public final g o(h.b bVar, qk3 qk3Var, long j) {
        h[] hVarArr = this.k;
        int length = hVarArr.length;
        g[] gVarArr = new g[length];
        emf[] emfVarArr = this.m;
        int iB = emfVarArr[0].b(bVar.a);
        for (int i = 0; i < length; i++) {
            h.b bVarA = bVar.a(emfVarArr[i].l(iB));
            gVarArr[i] = hVarArr[i].o(bVarA, qk3Var, j - this.q[iB][i]);
            ((List) this.l.get(i)).add(new a(bVarA, gVarArr[i]));
        }
        return new j(this.o, this.q[iB], gVarArr);
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void t(grf grfVar) {
        this.j = grfVar;
        this.i = vjg.p(null);
        int i = 0;
        while (true) {
            h[] hVarArr = this.k;
            if (i >= hVarArr.length) {
                return;
            }
            A(Integer.valueOf(i), hVarArr[i]);
            i++;
        }
    }

    @Override // androidx.media3.exoplayer.source.c, androidx.media3.exoplayer.source.a
    public final void v() {
        super.v();
        Arrays.fill(this.m, (Object) null);
        this.p = -1;
        this.r = null;
        ArrayList<h> arrayList = this.n;
        arrayList.clear();
        Collections.addAll(arrayList, this.k);
    }

    @Override // androidx.media3.exoplayer.source.c
    public final h.b w(Integer num, h.b bVar) {
        int iIntValue = num.intValue();
        ArrayList arrayList = this.l;
        List list = (List) arrayList.get(iIntValue);
        for (int i = 0; i < list.size(); i++) {
            if (((a) list.get(i)).a.equals(bVar)) {
                return ((a) ((List) arrayList.get(0)).get(i)).a;
            }
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.source.c
    public final void z(Object obj, androidx.media3.exoplayer.source.a aVar, emf emfVar) {
        Integer num = (Integer) obj;
        if (this.r != null) {
            return;
        }
        if (this.p == -1) {
            this.p = emfVar.h();
        } else if (emfVar.h() != this.p) {
            this.r = new IllegalMergeException();
            return;
        }
        int length = this.q.length;
        emf[] emfVarArr = this.m;
        if (length == 0) {
            this.q = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.p, emfVarArr.length);
        }
        ArrayList<h> arrayList = this.n;
        arrayList.remove(aVar);
        emfVarArr[num.intValue()] = emfVar;
        if (arrayList.isEmpty()) {
            u(emfVarArr[0]);
        }
    }
}
