package defpackage;

import androidx.media3.exoplayer.g;
import androidx.media3.exoplayer.source.p;
import defpackage.e47;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bm2 implements p {
    public final qyc a;
    public long b;

    public static final class a implements p {
        public final p a;
        public final e47<Integer> b;

        public a(p pVar, List<Integer> list) {
            this.a = pVar;
            this.b = e47.j(list);
        }

        @Override // androidx.media3.exoplayer.source.p
        public final boolean d() {
            return this.a.d();
        }

        @Override // androidx.media3.exoplayer.source.p
        public final boolean e(g gVar) {
            return this.a.e(gVar);
        }

        @Override // androidx.media3.exoplayer.source.p
        public final long h() {
            return this.a.h();
        }

        @Override // androidx.media3.exoplayer.source.p
        public final long s() {
            return this.a.s();
        }

        @Override // androidx.media3.exoplayer.source.p
        public final void u(long j) {
            this.a.u(j);
        }
    }

    public bm2(List<? extends p> list, List<List<Integer>> list2) {
        e47.b bVar = e47.b;
        e47.a aVar = new e47.a();
        ka2.l(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            aVar.c(new a(list.get(i), list2.get(i)));
        }
        this.a = aVar.f();
        this.b = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.p
    public final boolean d() {
        int i = 0;
        while (true) {
            qyc qycVar = this.a;
            if (i >= qycVar.d) {
                return false;
            }
            if (((a) qycVar.get(i)).a.d()) {
                return true;
            }
            i++;
        }
    }

    @Override // androidx.media3.exoplayer.source.p
    public final boolean e(g gVar) {
        boolean zE;
        boolean z = false;
        do {
            long jH = h();
            if (jH == Long.MIN_VALUE) {
                return z;
            }
            int i = 0;
            zE = false;
            while (true) {
                qyc qycVar = this.a;
                if (i >= qycVar.d) {
                    break;
                }
                long jH2 = ((a) qycVar.get(i)).a.h();
                boolean z2 = jH2 != Long.MIN_VALUE && jH2 <= gVar.a;
                if (jH2 == jH || z2) {
                    zE |= ((a) qycVar.get(i)).a.e(gVar);
                }
                i++;
            }
            z |= zE;
        } while (zE);
        return z;
    }

    @Override // androidx.media3.exoplayer.source.p
    public final long h() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            qyc qycVar = this.a;
            if (i >= qycVar.d) {
                break;
            }
            long jH = ((a) qycVar.get(i)).a.h();
            if (jH != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jH);
            }
            i++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // androidx.media3.exoplayer.source.p
    public final long s() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            qyc qycVar = this.a;
            if (i >= qycVar.d) {
                break;
            }
            a aVar = (a) qycVar.get(i);
            long jS = aVar.a.s();
            e47<Integer> e47Var = aVar.b;
            if ((e47Var.contains(1) || e47Var.contains(2) || e47Var.contains(4)) && jS != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jS);
            }
            if (jS != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jS);
            }
            i++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.b = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j = this.b;
        return j != -9223372036854775807L ? j : jMin2;
    }

    @Override // androidx.media3.exoplayer.source.p
    public final void u(long j) {
        int i = 0;
        while (true) {
            qyc qycVar = this.a;
            if (i >= qycVar.d) {
                return;
            }
            ((a) qycVar.get(i)).u(j);
            i++;
        }
    }
}
