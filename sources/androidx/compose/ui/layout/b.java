package androidx.compose.ui.layout;

import androidx.compose.ui.layout.w;
import defpackage.ae7;
import defpackage.bg9;
import defpackage.d20;
import defpackage.j6g;
import defpackage.khd;
import defpackage.mm8;
import defpackage.ur0;
import defpackage.vl8;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ur0, q {
    public final mm8 a;
    public androidx.compose.ui.layout.a b;
    public boolean c;

    public static final class a implements bg9 {
        public final int a;
        public final int b;
        public final Map<d20, Integer> c;
        public final Function1<khd, j6g> d;
        public final /* synthetic */ Function1<w.a, j6g> e;
        public final /* synthetic */ b f;

        /* JADX WARN: Multi-variable type inference failed */
        public a(int i, int i2, Map<d20, Integer> map, Function1<? super khd, j6g> function1, Function1<? super w.a, j6g> function12, b bVar) {
            this.e = function12;
            this.f = bVar;
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
            this.e.invoke(this.f.a.a0);
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

    public b(mm8 mm8Var, androidx.compose.ui.layout.a aVar) {
        this.a = mm8Var;
        this.b = aVar;
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

    @Override // androidx.compose.ui.layout.q
    public final bg9 Y0(int i, int i2, Map<d20, Integer> map, Function1<? super w.a, j6g> function1) {
        return this.a.z1(i, i2, map, null, function1);
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
        return this.a.e0.n0;
    }

    @Override // defpackage.iy3
    public final float k1(int i) {
        return this.a.k1(i);
    }

    @Override // defpackage.iy3
    public final float l1(float f) {
        return f / this.a.getDensity();
    }

    @Override // defpackage.ql7
    public final boolean m0() {
        return false;
    }

    @Override // defpackage.iy3
    public final float p1() {
        return this.a.p1();
    }

    @Override // defpackage.iy3
    public final float t1(float f) {
        return this.a.getDensity() * f;
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
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            ae7.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new a(i, i2, map, function1, function12, this);
    }
}
