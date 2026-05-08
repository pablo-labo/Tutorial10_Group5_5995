package androidx.compose.ui.layout;

import androidx.compose.ui.layout.w;
import defpackage.ae7;
import defpackage.bg9;
import defpackage.d20;
import defpackage.j6g;
import defpackage.khd;
import defpackage.ql7;
import defpackage.vl8;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class g implements q, ql7 {
    public final /* synthetic */ ql7 a;
    public final vl8 b;

    public static final class a implements bg9 {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ Map<d20, Integer> c;
        public final /* synthetic */ Function1<khd, j6g> d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(int i, int i2, Map<d20, Integer> map, Function1<? super khd, j6g> function1) {
            this.a = i;
            this.b = i2;
            this.c = map;
            this.d = function1;
        }

        @Override // defpackage.bg9
        public final int getHeight() {
            return this.b;
        }

        @Override // defpackage.bg9
        public final int getWidth() {
            return this.a;
        }

        @Override // defpackage.bg9
        public final void j() {
        }

        @Override // defpackage.bg9
        public final Function1<khd, j6g> k() {
            return this.d;
        }

        @Override // defpackage.bg9
        public final Map<d20, Integer> r() {
            return this.c;
        }
    }

    public g(ql7 ql7Var, vl8 vl8Var) {
        this.a = ql7Var;
        this.b = vl8Var;
    }

    @Override // defpackage.iy3
    public final float C0(long j) {
        return this.a.C0(j);
    }

    @Override // defpackage.iy3
    public final long H(float f) {
        return this.a.H(f);
    }

    @Override // defpackage.iy3
    public final long I(long j) {
        return this.a.I(j);
    }

    @Override // defpackage.iy3
    public final long I1(long j) {
        return this.a.I1(j);
    }

    @Override // defpackage.iy3
    public final float S(long j) {
        return this.a.S(j);
    }

    @Override // defpackage.iy3
    public final long d0(float f) {
        return this.a.d0(f);
    }

    @Override // defpackage.iy3
    public final float getDensity() {
        return this.a.getDensity();
    }

    @Override // defpackage.ql7
    public final vl8 getLayoutDirection() {
        return this.b;
    }

    @Override // defpackage.iy3
    public final float k1(int i) {
        return this.a.k1(i);
    }

    @Override // defpackage.iy3
    public final float l1(float f) {
        return this.a.l1(f);
    }

    @Override // defpackage.ql7
    public final boolean m0() {
        return this.a.m0();
    }

    @Override // defpackage.iy3
    public final float p1() {
        return this.a.p1();
    }

    @Override // defpackage.iy3
    public final float t1(float f) {
        return this.a.t1(f);
    }

    @Override // defpackage.iy3
    public final int x0(float f) {
        return this.a.x0(f);
    }

    @Override // defpackage.iy3
    public final int x1(long j) {
        return this.a.x1(j);
    }

    @Override // androidx.compose.ui.layout.q
    public final bg9 z1(int i, int i2, Map<d20, Integer> map, Function1<? super khd, j6g> function1, Function1<? super w.a, j6g> function12) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            ae7.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new a(i, i2, map, function1);
    }
}
