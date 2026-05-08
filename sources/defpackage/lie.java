package defpackage;

import androidx.compose.runtime.r;
import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.w;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class lie extends nm8 {
    public yd0<th7> d0;
    public c20 e0;
    public boolean h0;
    public long f0 = -9223372034707292160L;
    public long g0 = mq2.b(0, 0, 15);
    public final g4a i0 = r.f(null);

    public static final class a {
        public final zb0<th7, de0> a;
        public long b;

        public a() {
            throw null;
        }

        public a(zb0 zb0Var, long j) {
            this.a = zb0Var;
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return wl7.b(this.a, aVar.a) && th7.b(this.b, aVar.b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "AnimData(anim=" + this.a + ", startSize=" + ((Object) th7.c(this.b)) + ')';
        }
    }

    public static final class b extends mj8 implements Function1<w.a, j6g> {
        final /* synthetic */ int $height;
        final /* synthetic */ long $measuredSize;
        final /* synthetic */ w $placeable;
        final /* synthetic */ q $this_measure;
        final /* synthetic */ int $width;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, int i, int i2, q qVar, w wVar) {
            super(1);
            this.$measuredSize = j;
            this.$width = i;
            this.$height = i2;
            this.$this_measure = qVar;
            this.$placeable = wVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(w.a aVar) {
            w.a.w(aVar, this.$placeable, lie.this.e0.a(this.$measuredSize, (((long) this.$width) << 32) | (((long) this.$height) & 4294967295L), this.$this_measure.getLayoutDirection()));
            return j6g.a;
        }
    }

    public lie(vpe vpeVar, af1 af1Var) {
        this.d0 = vpeVar;
        this.e0 = af1Var;
    }

    @Override // androidx.compose.ui.e.c
    public final void U1() {
        this.f0 = -9223372034707292160L;
        this.h0 = false;
    }

    @Override // androidx.compose.ui.e.c
    public final void W1() {
        ((gme) this.i0).setValue(null);
    }

    @Override // defpackage.lm8
    public final bg9 d(q qVar, vf9 vf9Var, long j) {
        w wVarR;
        char c;
        long j2;
        a aVar;
        long jD;
        a aVar2;
        if (qVar.m0()) {
            this.g0 = j;
            this.h0 = true;
            wVarR = vf9Var.R(j);
        } else {
            wVarR = vf9Var.R(this.h0 ? this.g0 : j);
        }
        w wVar = wVarR;
        long j3 = (((long) wVar.b) & 4294967295L) | (((long) wVar.a) << 32);
        if (qVar.m0()) {
            this.f0 = j3;
            c = ' ';
            jD = j3;
            j2 = jD;
        } else {
            long j4 = !th7.b(this.f0, -9223372034707292160L) ? this.f0 : j3;
            g4a g4aVar = this.i0;
            a aVar3 = (a) ((gme) g4aVar).getValue();
            if (aVar3 != null) {
                zb0<th7, de0> zb0Var = aVar3.a;
                c = ' ';
                j2 = j3;
                boolean z = (th7.b(j4, zb0Var.d().a) || ((Boolean) ((gme) zb0Var.d).getValue()).booleanValue()) ? false : true;
                if (!th7.b(j4, ((th7) ((gme) zb0Var.e).getValue()).a) || z) {
                    aVar3.b = zb0Var.d().a;
                    aVar2 = aVar3;
                    u63.Y(Q1(), null, null, new mie(aVar2, j4, this, null), 3);
                } else {
                    aVar2 = aVar3;
                }
                aVar = aVar2;
            } else {
                long j5 = j4;
                c = ' ';
                j2 = j3;
                aVar = new a(new zb0(new th7(j5), q92.j0, new th7(4294967297L), 8), j5);
            }
            ((gme) g4aVar).setValue(aVar);
            jD = mq2.d(j, aVar.a.d().a);
        }
        int i = (int) (jD >> c);
        int i2 = (int) (jD & 4294967295L);
        return qVar.Y0(i, i2, bs4.a, new b(j2, i, i2, qVar, wVar));
    }
}
