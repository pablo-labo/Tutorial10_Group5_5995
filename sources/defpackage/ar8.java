package defpackage;

import androidx.compose.foundation.lazy.layout.c;
import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.w;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ar8 implements q {
    public final qq8 a;
    public final bxe b;
    public final c c;
    public final a3a<List<vf9>> d;

    public ar8(qq8 qq8Var, bxe bxeVar) {
        this.a = qq8Var;
        this.b = bxeVar;
        this.c = (c) qq8Var.b.invoke();
        kh7.a();
        this.d = new a3a<>();
    }

    @Override // defpackage.iy3
    public final float C0(long j) {
        return this.b.C0(j);
    }

    @Override // defpackage.iy3
    public final long H(float f) {
        return this.b.H(f);
    }

    @Override // defpackage.iy3
    public final long I(long j) {
        return this.b.I(j);
    }

    @Override // defpackage.iy3
    public final long I1(long j) {
        return this.b.I1(j);
    }

    @Override // defpackage.iy3
    public final float S(long j) {
        return this.b.S(j);
    }

    @Override // androidx.compose.ui.layout.q
    public final bg9 Y0(int i, int i2, Map<d20, Integer> map, Function1<? super w.a, j6g> function1) {
        return this.b.Y0(i, i2, map, function1);
    }

    public final List<vf9> d(int i) {
        a3a<List<vf9>> a3aVar = this.d;
        List<vf9> listB = a3aVar.b(i);
        if (listB != null) {
            return listB;
        }
        c cVar = this.c;
        Object objG = cVar.g(i);
        List<vf9> listF = this.b.F(objG, this.a.a(i, objG, cVar.e(i)));
        a3aVar.h(i, listF);
        return listF;
    }

    @Override // defpackage.iy3
    public final long d0(float f) {
        return this.b.d0(f);
    }

    @Override // defpackage.iy3
    public final float getDensity() {
        return this.b.getDensity();
    }

    @Override // defpackage.ql7
    public final vl8 getLayoutDirection() {
        return this.b.getLayoutDirection();
    }

    @Override // defpackage.iy3
    public final float k1(int i) {
        return this.b.k1(i);
    }

    @Override // defpackage.iy3
    public final float l1(float f) {
        return this.b.l1(f);
    }

    @Override // defpackage.ql7
    public final boolean m0() {
        return this.b.m0();
    }

    @Override // defpackage.iy3
    public final float p1() {
        return this.b.p1();
    }

    @Override // defpackage.iy3
    public final float t1(float f) {
        return this.b.t1(f);
    }

    @Override // defpackage.iy3
    public final int x0(float f) {
        return this.b.x0(f);
    }

    @Override // defpackage.iy3
    public final int x1(long j) {
        return this.b.x1(j);
    }

    @Override // androidx.compose.ui.layout.q
    public final bg9 z1(int i, int i2, Map<d20, Integer> map, Function1<? super khd, j6g> function1, Function1<? super w.a, j6g> function12) {
        return this.b.z1(i, i2, map, function1, function12);
    }
}
