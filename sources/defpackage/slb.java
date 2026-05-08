package defpackage;

import android.os.Trace;
import androidx.compose.ui.layout.e0;
import defpackage.mr8;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class slb {
    public final qq8 a;
    public final e0 b;
    public final wlb c;
    public boolean d = true;

    public final class a implements mr8.b, ulb, mr8.c {
        public final int a;
        public final tlb b;
        public final Function1<mr8.c, j6g> c;
        public iq2 d;
        public e0.b e;
        public boolean f;
        public boolean g;
        public boolean h;
        public Object i;
        public boolean j;
        public C0416a k;
        public boolean l;
        public long m;
        public long n;
        public long o = ny9.a();

        /* JADX INFO: renamed from: slb$a$a, reason: collision with other inner class name */
        public final class C0416a {
            public final List<mr8> a;
            public final List<ulb>[] b;
            public int c;
            public int d;
            public boolean e;

            public C0416a(List<mr8> list) {
                this.a = list;
                this.b = new List[list.size()];
                if (list.isEmpty()) {
                    de7.a("NestedPrefetchController shouldn't be created with no states");
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(int i, tlb tlbVar, nnb nnbVar, Function1<? super mr8.c, j6g> function1) {
            this.a = i;
            this.b = tlbVar;
            this.c = function1;
        }

        @Override // mr8.c
        public final long a(int i) {
            e0.b bVar = this.e;
            if (bVar != null) {
                return bVar.a(i);
            }
            return 0L;
        }

        @Override // mr8.c
        public final int b() {
            e0.b bVar = this.e;
            if (bVar != null) {
                return bVar.b();
            }
            return 0;
        }

        @Override // mr8.b
        public final void c() {
            this.l = true;
        }

        @Override // mr8.b
        public final void cancel() {
            if (this.g) {
                return;
            }
            this.g = true;
            e();
        }

        @Override // defpackage.ulb
        public final boolean d(vlb vlbVar) {
            boolean zF;
            if (!slb.this.d) {
                return false;
            }
            if (this.l) {
                Trace.beginSection("compose:lazy:prefetch:execute:urgent");
                try {
                    zF = f(vlbVar);
                } finally {
                    Trace.endSection();
                }
            } else {
                zF = f(vlbVar);
            }
            fb0.a(-1L, "compose:lazy:prefetch:execute:item");
            return zF;
        }

        public final void e() {
            e0.b bVar = this.e;
            if (bVar != null) {
                bVar.dispose();
            }
            this.e = null;
            this.k = null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:127:0x026c  */
        /* JADX WARN: Removed duplicated region for block: B:131:0x027a  */
        /* JADX WARN: Removed duplicated region for block: B:134:0x0283 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:137:0x028f  */
        /* JADX WARN: Removed duplicated region for block: B:160:0x02e9  */
        /* JADX WARN: Removed duplicated region for block: B:180:0x0340 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0146  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0191  */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean f(defpackage.vlb r19) {
            /*
                Method dump skipped, instruction units count: 839
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: slb.a.f(vlb):boolean");
        }

        public final boolean g() {
            return this.h;
        }

        public final boolean h(long j, long j2) {
            if (this.l) {
                j2 = 0;
            }
            return j > j2;
        }

        public final void i() {
            long jA = ny9.a();
            long jA2 = ylf.a(jA, this.o);
            long j = jA2 >> 1;
            int i = wd4.d;
            if ((((int) jA2) & 1) != 0) {
                j = j > 9223372036854L ? Long.MAX_VALUE : j < -9223372036854L ? Long.MIN_VALUE : j * 1000000;
            }
            this.n = j;
            long j2 = this.m - j;
            this.m = j2;
            this.o = jA;
            fb0.a(j2, "compose:lazy:prefetch:available_time_nanos");
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HandleAndRequestImpl { index = ");
            sb.append(this.a);
            sb.append(", constraints = ");
            sb.append(this.d);
            sb.append(", isComposed = ");
            sb.append(g());
            sb.append(", isMeasured = ");
            sb.append(this.f);
            sb.append(", isCanceled = ");
            return z3.o(sb, this.g, " }");
        }
    }

    public slb(qq8 qq8Var, e0 e0Var, wlb wlbVar) {
        this.a = qq8Var;
        this.b = e0Var;
        this.c = wlbVar;
    }
}
