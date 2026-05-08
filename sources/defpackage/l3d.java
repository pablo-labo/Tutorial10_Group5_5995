package defpackage;

import android.net.Uri;
import defpackage.nyd;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class l3d {
    public final androidx.media3.common.a a;
    public final e47<tb1> b;
    public final long c;
    public final List<ez3> d;
    public final List<ez3> e;
    public final List<ez3> f;
    public final mic g;

    public static class a extends l3d implements qd3 {
        public final nyd.a h;

        public a(androidx.media3.common.a aVar, e47 e47Var, nyd.a aVar2, ArrayList arrayList, List list, List list2) {
            super(aVar, e47Var, aVar2, arrayList, list, list2);
            this.h = aVar2;
        }

        @Override // defpackage.qd3
        public final long a(long j) {
            return this.h.g(j);
        }

        @Override // defpackage.qd3
        public final boolean b() {
            return this.h.i();
        }

        @Override // defpackage.qd3
        public final long c(long j, long j2) {
            return this.h.e(j, j2);
        }

        @Override // defpackage.qd3
        public final long d(long j, long j2) {
            return this.h.c(j, j2);
        }

        @Override // defpackage.qd3
        public final long e(long j, long j2) {
            nyd.a aVar = this.h;
            if (aVar.f != null) {
                return -9223372036854775807L;
            }
            long jB = aVar.b(j, j2) + aVar.c(j, j2);
            return (aVar.e(jB, j) + aVar.g(jB)) - aVar.i;
        }

        @Override // defpackage.qd3
        public final mic f(long j) {
            return this.h.h(this, j);
        }

        @Override // defpackage.qd3
        public final long g(long j, long j2) {
            return this.h.f(j, j2);
        }

        @Override // defpackage.qd3
        public final long h(long j) {
            return this.h.d(j);
        }

        @Override // defpackage.qd3
        public final long i() {
            return this.h.d;
        }

        @Override // defpackage.qd3
        public final long j(long j, long j2) {
            return this.h.b(j, j2);
        }

        @Override // defpackage.l3d
        public final String k() {
            return null;
        }

        @Override // defpackage.l3d
        public final qd3 l() {
            return this;
        }

        @Override // defpackage.l3d
        public final mic m() {
            return null;
        }
    }

    public static class b extends l3d {
        public final mic h;
        public final tu2 i;

        /* JADX WARN: Multi-variable type inference failed */
        public b(androidx.media3.common.a aVar, e47 e47Var, nyd.e eVar, ArrayList arrayList, List list, List list2) {
            super(aVar, e47Var, eVar, arrayList, list, list2);
            Uri.parse(((tb1) e47Var.get(0)).a);
            long j = eVar.e;
            tu2 tu2Var = null;
            mic micVar = j <= 0 ? null : new mic(eVar.d, null, j);
            this.h = micVar;
            if (micVar == null) {
                mic micVar2 = new mic(0L, null, -1L);
                tu2Var = new tu2();
                tu2Var.a = micVar2;
            }
            this.i = tu2Var;
        }

        @Override // defpackage.l3d
        public final String k() {
            return null;
        }

        @Override // defpackage.l3d
        public final qd3 l() {
            return this.i;
        }

        @Override // defpackage.l3d
        public final mic m() {
            return this.h;
        }
    }

    public l3d() {
        throw null;
    }

    public l3d(androidx.media3.common.a aVar, List list, nyd nydVar, List list2, List list3, List list4) {
        ka2.l(!list.isEmpty());
        this.a = aVar;
        this.b = e47.j(list);
        this.d = list2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list2);
        this.e = list3;
        this.f = list4;
        this.g = nydVar.a(this);
        long j = nydVar.c;
        long j2 = nydVar.b;
        String str = vjg.a;
        this.c = vjg.X(j, 1000000L, j2, RoundingMode.DOWN);
    }

    public abstract String k();

    public abstract qd3 l();

    public abstract mic m();
}
