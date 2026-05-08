package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.q;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.ffb;
import defpackage.rxa;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f81 extends e.c implements lm8, eb4, c5e, dfb, nx9, px9, c4b, ql8, z96, sl5, om5, um5, sxa, wo1 {
    public e.b d0;
    public boolean e0;
    public e81 f0;
    public HashSet<kx9<?>> g0;
    public sl8 h0;

    public static final class a extends mj8 implements gu5<j6g> {
        public a() {
            super(0);
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            f81.this.e2();
            return j6g.a;
        }
    }

    public static final class b implements rxa.a {
        public b() {
        }

        @Override // rxa.a
        public final void l() {
            f81 f81Var = f81.this;
            if (f81Var.h0 == null) {
                f81Var.P0(us3.d(f81Var, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT));
            }
        }
    }

    public static final class c extends mj8 implements gu5<j6g> {
        public c() {
            super(0);
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            e.b bVar = f81.this.d0;
            bVar.getClass();
            ((lx9) bVar).h(f81.this);
            return j6g.a;
        }
    }

    @Override // defpackage.c5e
    public final void F0(s5e s5eVar) {
        e.b bVar = this.d0;
        bVar.getClass();
        w4e w4eVarG = ((a5e) bVar).g();
        s5eVar.getClass();
        w4e w4eVar = (w4e) s5eVar;
        z3a<r5e<?>, Object> z3aVar = w4eVar.a;
        if (w4eVarG.c) {
            w4eVar.c = true;
        }
        if (w4eVarG.d) {
            w4eVar.d = true;
        }
        z3a<r5e<?>, Object> z3aVar2 = w4eVarG.a;
        Object[] objArr = z3aVar2.b;
        Object[] objArr2 = z3aVar2.c;
        long[] jArr = z3aVar2.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        r5e<?> r5eVar = (r5e) obj;
                        if (!z3aVar.a(r5eVar)) {
                            z3aVar.m(r5eVar, obj2);
                        } else if (obj2 instanceof r5) {
                            Object objD = z3aVar.d(r5eVar);
                            objD.getClass();
                            r5 r5Var = (r5) objD;
                            String str = r5Var.a;
                            if (str == null) {
                                str = ((r5) obj2).a;
                            }
                            vu5 vu5Var = r5Var.b;
                            if (vu5Var == null) {
                                vu5Var = ((r5) obj2).b;
                            }
                            z3aVar.m(r5eVar, new r5(str, vu5Var));
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.ql8
    public final void G(long j) {
        e.b bVar = this.d0;
        if (bVar instanceof fra) {
            ((fra) bVar).l();
        }
    }

    @Override // defpackage.dfb
    public final boolean G1() {
        e.b bVar = this.d0;
        bVar.getClass();
        ((cfb) bVar).u().getClass();
        return true;
    }

    @Override // defpackage.c4b
    public final Object N(iy3 iy3Var, Object obj) {
        e.b bVar = this.d0;
        bVar.getClass();
        return ((b4b) bVar).A();
    }

    @Override // defpackage.ql8
    public final void P0(sl8 sl8Var) {
        this.h0 = sl8Var;
        e.b bVar = this.d0;
        if (bVar instanceof xqa) {
            ((xqa) bVar).n();
        }
    }

    @Override // defpackage.dfb
    public final void R(neb nebVar, peb pebVar, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        e.b bVar = this.d0;
        bVar.getClass();
        ffb.b bVarU = ((cfb) bVar).u();
        ffb ffbVar = ffb.this;
        List<yeb> list = nebVar.a;
        List<yeb> list2 = list;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            yeb yebVar = list.get(i);
            if (mh2.g(yebVar) || mh2.i(yebVar)) {
                z = false;
                break;
            }
        }
        z = true;
        if (!z) {
            z2 = false;
            break;
        }
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (list.get(i2).b()) {
                z2 = false;
                break;
            }
        }
        z2 = true;
        if (ffbVar.d) {
            z3 = true;
        } else {
            int size3 = list2.size();
            int i3 = 0;
            while (true) {
                if (i3 < size3) {
                    yeb yebVar2 = list.get(i3);
                    if (mh2.g(yebVar2) || mh2.i(yebVar2)) {
                        break;
                    } else {
                        i3++;
                    }
                } else if (z2) {
                    break;
                } else {
                    z3 = false;
                }
            }
            z3 = true;
        }
        ffb.a aVar = bVarU.b;
        ffb.a aVar2 = ffb.a.c;
        peb pebVar2 = peb.c;
        if (aVar != aVar2) {
            if (pebVar == peb.a && z3) {
                bVarU.c = nebVar;
                bVarU.W(nebVar, !z || ffbVar.d);
            }
            if (pebVar == peb.b && z && nebVar == bVarU.c && ffbVar.d) {
                int size4 = list2.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    list.get(i4).a();
                }
            }
            if (pebVar == pebVar2 && !z3 && nebVar != bVarU.c) {
                bVarU.W(nebVar, true);
            }
        }
        if (pebVar == pebVar2) {
            int size5 = list2.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size5) {
                    bVarU.b = ffb.a.a;
                    ffbVar.d = false;
                    bVarU.c = null;
                    break;
                } else if (!mh2.i(list.get(i5))) {
                    break;
                } else {
                    i5++;
                }
            }
            if (nebVar == bVarU.c && z) {
                int size6 = list2.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size6) {
                        break;
                    }
                    if (!list.get(i6).b()) {
                        i6++;
                    } else if (!ffbVar.d) {
                        bVarU.X(nebVar);
                        return;
                    }
                }
                int size7 = list2.size();
                for (int i7 = 0; i7 < size7; i7++) {
                    list.get(i7).a();
                }
            }
        }
    }

    @Override // androidx.compose.ui.e.c
    public final void U1() {
        c2(true);
    }

    @Override // defpackage.om5
    public final void V(lm5 lm5Var) {
        e.b bVar = this.d0;
        if (!(bVar instanceof gm5)) {
            ae7.b("applyFocusProperties called on wrong node");
        }
        ((gm5) bVar).C();
    }

    @Override // androidx.compose.ui.e.c
    public final void V1() {
        d2();
    }

    @Override // defpackage.sxa
    public final boolean W0() {
        return this.c0;
    }

    @Override // defpackage.sl5
    public final void X(ym5 ym5Var) {
        e.b bVar = this.d0;
        if (!(bVar instanceof rl5)) {
            ae7.b("onFocusEvent called on wrong node");
        }
        ((rl5) bVar).w();
    }

    @Override // defpackage.wo1
    public final long c() {
        return hh1.Y(us3.d(this, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT).c);
    }

    public final void c2(boolean z) {
        if (!this.c0) {
            ae7.b("initializeModifier called on unattached node");
        }
        e.b bVar = this.d0;
        if ((this.c & 32) != 0) {
            if (bVar instanceof lx9) {
                us3.g(this).w(new a());
            }
            if (bVar instanceof ox9) {
                ox9<?> ox9Var = (ox9) bVar;
                e81 e81Var = this.f0;
                if (e81Var == null || !e81Var.O(ox9Var.getKey())) {
                    e81 e81Var2 = new e81();
                    e81Var2.b = ox9Var;
                    this.f0 = e81Var2;
                    if (h81.a(this)) {
                        mx9 modifierLocalManager = us3.g(this).getModifierLocalManager();
                        g6c<?> key = ox9Var.getKey();
                        modifierLocalManager.b.b(this);
                        modifierLocalManager.c.b(key);
                        modifierLocalManager.a();
                    }
                } else {
                    e81Var.b = ox9Var;
                    mx9 modifierLocalManager2 = us3.g(this).getModifierLocalManager();
                    g6c<?> key2 = ox9Var.getKey();
                    modifierLocalManager2.b.b(this);
                    modifierLocalManager2.c.b(key2);
                    modifierLocalManager2.a();
                }
            }
        }
        if ((this.c & 4) != 0) {
            if (bVar instanceof ab4) {
                this.e0 = true;
            }
            if (!z) {
                us3.d(this, 2).G1();
            }
        }
        if ((this.c & 2) != 0) {
            if (h81.a(this)) {
                tia tiaVar = this.W;
                tiaVar.getClass();
                ((mm8) tiaVar).f2(this);
                qxa qxaVar = tiaVar.A0;
                if (qxaVar != null) {
                    qxaVar.invalidate();
                }
            }
            if (!z) {
                us3.d(this, 2).G1();
                us3.f(this).S();
            }
        }
        if (bVar instanceof a0d) {
            ((a0d) bVar).q(us3.f(this));
        }
        if ((this.c & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            if ((bVar instanceof fra) && h81.a(this)) {
                us3.f(this).S();
            }
            if (bVar instanceof xqa) {
                this.h0 = null;
                if (h81.a(this)) {
                    us3.g(this).e(new b());
                }
            }
        }
        if ((this.c & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 && (bVar instanceof mqa) && h81.a(this)) {
            us3.f(this).S();
        }
        if (bVar instanceof tm5) {
            ((tm5) bVar).j().a.b(this);
        }
        if ((this.c & 16) != 0 && (bVar instanceof cfb)) {
            ((cfb) bVar).u().a = this.W;
        }
        if ((this.c & 8) != 0) {
            us3.g(this).A();
        }
    }

    @Override // defpackage.lm8
    public final bg9 d(q qVar, vf9 vf9Var, long j) {
        e.b bVar = this.d0;
        bVar.getClass();
        return ((jm8) bVar).d(qVar, vf9Var, j);
    }

    public final void d2() {
        if (!this.c0) {
            ae7.b("unInitializeModifier called on unattached node");
        }
        e.b bVar = this.d0;
        if ((this.c & 32) != 0) {
            if (bVar instanceof ox9) {
                mx9 modifierLocalManager = us3.g(this).getModifierLocalManager();
                g6c key = ((ox9) bVar).getKey();
                modifierLocalManager.d.b(us3.f(this));
                modifierLocalManager.e.b(key);
                modifierLocalManager.a();
            }
            if (bVar instanceof lx9) {
                ((lx9) bVar).h(h81.a);
            }
        }
        if ((this.c & 8) != 0) {
            us3.g(this).A();
        }
        if (bVar instanceof tm5) {
            ((tm5) bVar).j().a.j(this);
        }
    }

    public final void e2() {
        if (this.c0) {
            this.g0.clear();
            us3.g(this).getSnapshotObserver().a(this, h81.c, new c());
        }
    }

    @Override // defpackage.dfb
    public final void f0() {
        e.b bVar = this.d0;
        bVar.getClass();
        ((cfb) bVar).u().getClass();
    }

    @Override // defpackage.dfb
    public final void f1() {
        e.b bVar = this.d0;
        bVar.getClass();
        ffb.b bVarU = ((cfb) bVar).u();
        ffb ffbVar = ffb.this;
        if (bVarU.b == ffb.a.b) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            gfb gfbVar = new gfb(ffbVar);
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            motionEventObtain.setSource(0);
            gfbVar.invoke(motionEventObtain);
            motionEventObtain.recycle();
            bVarU.b = ffb.a.a;
            ffbVar.d = false;
            bVarU.c = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [j4a] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [j4a] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // defpackage.nx9, defpackage.px9
    public final <T> T g(kx9<T> kx9Var) {
        ria riaVar;
        this.g0.add(kx9Var);
        if (!this.a.c0) {
            ae7.b("visitAncestors called on an unattached node");
        }
        e.c cVar = this.a.e;
        pm8 pm8VarF = us3.f(this);
        while (pm8VarF != null) {
            if ((pm8VarF.t0.f.d & 32) != 0) {
                while (cVar != null) {
                    if ((cVar.c & 32) != 0) {
                        ?? B = cVar;
                        ?? j4aVar = 0;
                        while (B != 0) {
                            if (B instanceof nx9) {
                                nx9 nx9Var = (nx9) B;
                                if (nx9Var.j0().O(kx9Var)) {
                                    return (T) nx9Var.j0().V(kx9Var);
                                }
                            } else if ((B.c & 32) != 0 && (B instanceof zs3)) {
                                e.c cVar2 = ((zs3) B).e0;
                                int i = 0;
                                B = B;
                                j4aVar = j4aVar;
                                while (cVar2 != null) {
                                    if ((cVar2.c & 32) != 0) {
                                        i++;
                                        j4aVar = j4aVar;
                                        if (i == 1) {
                                            B = cVar2;
                                        } else {
                                            if (j4aVar == 0) {
                                                j4aVar = new j4a(new e.c[16]);
                                            }
                                            if (B != 0) {
                                                j4aVar.b(B);
                                                B = 0;
                                            }
                                            j4aVar.b(cVar2);
                                        }
                                    }
                                    cVar2 = cVar2.f;
                                    B = B;
                                    j4aVar = j4aVar;
                                }
                                if (i == 1) {
                                }
                            }
                            B = us3.b(j4aVar);
                        }
                    }
                    cVar = cVar.e;
                }
            }
            pm8VarF = pm8VarF.K();
            cVar = (pm8VarF == null || (riaVar = pm8VarF.t0) == null) ? null : riaVar.e;
        }
        return kx9Var.a.invoke();
    }

    @Override // defpackage.wo1
    public final iy3 getDensity() {
        return us3.f(this).m0;
    }

    @Override // defpackage.wo1
    public final vl8 getLayoutDirection() {
        return us3.f(this).n0;
    }

    @Override // defpackage.eb4
    public final void i1() {
        this.e0 = true;
        fb4.a(this);
    }

    @Override // defpackage.nx9
    public final v1 j0() {
        e81 e81Var = this.f0;
        return e81Var != null ? e81Var : cs4.b;
    }

    @Override // defpackage.z96
    public final void n0(tia tiaVar) {
        e.b bVar = this.d0;
        bVar.getClass();
        ((mqa) bVar).B();
    }

    @Override // defpackage.lm8
    public final int p(w59 w59Var, pl7 pl7Var, int i) {
        e.b bVar = this.d0;
        bVar.getClass();
        return ((jm8) bVar).p(w59Var, pl7Var, i);
    }

    @Override // defpackage.lm8
    public final int r(w59 w59Var, pl7 pl7Var, int i) {
        e.b bVar = this.d0;
        bVar.getClass();
        return ((jm8) bVar).r(w59Var, pl7Var, i);
    }

    public final String toString() {
        return this.d0.toString();
    }

    @Override // defpackage.lm8
    public final int v(w59 w59Var, pl7 pl7Var, int i) {
        e.b bVar = this.d0;
        bVar.getClass();
        return ((jm8) bVar).v(w59Var, pl7Var, i);
    }

    @Override // defpackage.ts3
    public final void w() {
        if (this.d0 instanceof cfb) {
            f1();
        }
    }

    @Override // defpackage.eb4
    public final void y(sm8 sm8Var) {
        e.b bVar = this.d0;
        bVar.getClass();
        db4 db4Var = (db4) bVar;
        if (this.e0 && (bVar instanceof ab4)) {
            e.b bVar2 = this.d0;
            if (bVar2 instanceof ab4) {
                us3.g(this).getSnapshotObserver().a(this, h81.b, new g81(bVar2, this));
            }
            this.e0 = false;
        }
        db4Var.y(sm8Var);
    }

    @Override // defpackage.lm8
    public final int z(w59 w59Var, pl7 pl7Var, int i) {
        e.b bVar = this.d0;
        bVar.getClass();
        return ((jm8) bVar).z(w59Var, pl7Var, i);
    }
}
