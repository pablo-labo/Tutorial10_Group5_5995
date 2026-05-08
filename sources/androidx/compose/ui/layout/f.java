package androidx.compose.ui.layout;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.layout.j0;
import defpackage.a3a;
import defpackage.b74;
import defpackage.c3a;
import defpackage.cme;
import defpackage.dme;
import defpackage.eme;
import defpackage.epg;
import defpackage.g4a;
import defpackage.gme;
import defpackage.kf7;
import defpackage.nzg;
import defpackage.p3a;
import defpackage.pg8;
import defpackage.prg;
import defpackage.q0h;
import defpackage.rzg;
import defpackage.tpa;
import defpackage.utc;
import defpackage.vtc;
import defpackage.wl7;
import defpackage.wle;
import defpackage.x2a;
import defpackage.z3a;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class f extends nzg.b implements Runnable, tpa, View.OnAttachStateChangeListener {
    public final c3a V;
    public final p3a<g4a<Rect>> W;
    public final SnapshotStateList<utc> X;
    public boolean c;
    public int d;
    public rzg e;
    public final z3a f;

    public f() {
        super(1);
        z3a z3aVar = new z3a(9);
        j0.a.getClass();
        z3aVar.m(j0.a.b, new q0h("caption bar"));
        z3aVar.m(j0.a.c, new q0h("display cutout"));
        z3aVar.m(j0.a.d, new q0h("ime"));
        z3aVar.m(j0.a.e, new q0h("mandatory system gestures"));
        z3aVar.m(j0.a.f, new q0h("navigation bars"));
        z3aVar.m(j0.a.g, new q0h("status bars"));
        z3aVar.m(j0.a.h, new q0h("system gestures"));
        z3aVar.m(j0.a.i, new q0h("tappable element"));
        z3aVar.m(j0.a.j, new q0h("waterfall"));
        this.f = z3aVar;
        this.V = androidx.compose.runtime.p.a(0);
        this.W = new p3a<>(4);
        this.X = new SnapshotStateList<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // nzg.b
    public final void a(nzg nzgVar) {
        this.c = false;
        int iC = nzgVar.a.c();
        this.d &= ~iC;
        this.e = null;
        j0 j0VarB = l0.c.b(iC);
        if (j0VarB != null) {
            V vD = this.f.d(j0VarB);
            vD.getClass();
            q0h q0hVar = (q0h) vD;
            x2a x2aVar = q0hVar.c;
            ((cme) x2aVar).q(0.0f);
            ((cme) q0hVar.e).q(1.0f);
            ((eme) q0hVar.d).v(0L);
            ((cme) x2aVar).q(0.0f);
            ((gme) q0hVar.b).setValue(Boolean.FALSE);
            q0hVar.j = -1L;
            q0hVar.k = -1L;
            dme dmeVar = (dme) this.V;
            dmeVar.h(dmeVar.e() + 1);
            wle.e.getClass();
            wle.a.f();
        }
    }

    @Override // defpackage.tpa
    public final rzg b(View view, rzg rzgVar) {
        if (this.c) {
            this.e = rzgVar;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return rzgVar;
            }
        } else if (this.d == 0) {
            f(rzgVar);
        }
        return rzgVar;
    }

    @Override // nzg.b
    public final void c() {
        this.c = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // nzg.b
    public final rzg d(rzg rzgVar, List<nzg> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            nzg nzgVar = list.get(i);
            j0 j0VarB = l0.c.b(nzgVar.a.c());
            if (j0VarB != null) {
                V vD = this.f.d(j0VarB);
                vD.getClass();
                q0h q0hVar = (q0h) vD;
                if (((Boolean) ((gme) q0hVar.b).getValue()).booleanValue()) {
                    nzg.e eVar = nzgVar.a;
                    ((cme) q0hVar.c).q(eVar.b());
                    ((cme) q0hVar.e).q(0.0f);
                    ((eme) q0hVar.d).v(eVar.a());
                }
            }
        }
        f(rzgVar);
        return rzgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // nzg.b
    public final nzg.a e(nzg nzgVar, nzg.a aVar) {
        rzg rzgVar = this.e;
        this.c = false;
        this.e = null;
        nzg.e eVar = nzgVar.a;
        if (eVar.a() > 0 && rzgVar != null) {
            int iC = eVar.c();
            this.d |= iC;
            j0 j0VarB = l0.c.b(iC);
            if (j0VarB != null) {
                V vD = this.f.d(j0VarB);
                vD.getClass();
                q0h q0hVar = (q0h) vD;
                kf7 kf7VarG = rzgVar.a.g(iC);
                long j = ((long) kf7VarG.d) | (((long) kf7VarG.a) << 48) | (((long) kf7VarG.b) << 32) | (((long) kf7VarG.c) << 16);
                long j2 = q0hVar.h;
                if (!pg8.s(j, j2)) {
                    q0hVar.j = j2;
                    q0hVar.k = j;
                    ((gme) q0hVar.b).setValue(Boolean.TRUE);
                    ((cme) q0hVar.c).q(eVar.b());
                    ((cme) q0hVar.e).q(0.0f);
                    ((eme) q0hVar.d).v(eVar.a());
                    dme dmeVar = (dme) this.V;
                    dmeVar.h(dmeVar.e() + 1);
                    wle.e.getClass();
                    wle.a.f();
                }
            }
        }
        return aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(rzg rzgVar) {
        char c;
        boolean z;
        char c2;
        char c3;
        char c4;
        long j;
        boolean z2;
        boolean z3;
        long j2;
        long jB;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int[] iArr2;
        long[] jArr3;
        int[] iArr3;
        long[] jArr4;
        int i;
        char c5;
        int[] iArr4;
        a3a a3aVar = l0.a;
        int[] iArr5 = a3aVar.b;
        Object[] objArr = a3aVar.c;
        long[] jArr5 = a3aVar.a;
        int length = jArr5.length - 2;
        char c6 = 7;
        z3a z3aVar = this.f;
        int i2 = 8;
        if (length >= 0) {
            int i3 = 0;
            z2 = false;
            z3 = false;
            z = true;
            c2 = 16;
            c3 = ' ';
            while (true) {
                long j3 = jArr5[i3];
                c4 = '0';
                j = -9187201950435737472L;
                if ((((~j3) << c6) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j3 & 255) < 128) {
                            int i6 = (i3 << 3) + i5;
                            c5 = c6;
                            int i7 = iArr5[i6];
                            i = i2;
                            j0 j0Var = (j0) objArr[i6];
                            kf7 kf7VarG = rzgVar.a.g(i7);
                            jArr4 = jArr5;
                            iArr4 = iArr5;
                            long j4 = (((long) kf7VarG.a) << 48) | (((long) kf7VarG.b) << 32) | (((long) kf7VarG.c) << 16) | ((long) kf7VarG.d);
                            V vD = z3aVar.d(j0Var);
                            vD.getClass();
                            q0h q0hVar = (q0h) vD;
                            if (!pg8.s(j4, q0hVar.h)) {
                                q0hVar.h = j4;
                                z2 = true;
                                if (!pg8.s(j4, 0L)) {
                                    z3 = true;
                                }
                            }
                        } else {
                            jArr4 = jArr5;
                            i = i2;
                            c5 = c6;
                            iArr4 = iArr5;
                        }
                        j3 >>= i;
                        i5++;
                        iArr5 = iArr4;
                        jArr5 = jArr4;
                        c6 = c5;
                        i2 = i;
                    }
                    jArr3 = jArr5;
                    c = c6;
                    iArr3 = iArr5;
                    if (i4 != i2) {
                        break;
                    }
                } else {
                    jArr3 = jArr5;
                    c = c6;
                    iArr3 = iArr5;
                }
                if (i3 == length) {
                    break;
                }
                i3++;
                iArr5 = iArr3;
                jArr5 = jArr3;
                c6 = c;
                i2 = 8;
            }
        } else {
            c = 7;
            z = true;
            c2 = 16;
            c3 = ' ';
            c4 = '0';
            j = -9187201950435737472L;
            z2 = false;
            z3 = false;
        }
        a3a<j0> a3aVar2 = l0.c;
        int[] iArr6 = a3aVar2.b;
        Object[] objArr2 = a3aVar2.c;
        long[] jArr6 = a3aVar2.a;
        int length2 = jArr6.length - 2;
        if (length2 >= 0) {
            int i8 = 0;
            while (true) {
                long j5 = jArr6[i8];
                if ((((~j5) << c) & j5 & j) != j) {
                    int i9 = 8 - ((~(i8 - length2)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j5 & 255) < 128) {
                            int i11 = (i8 << 3) + i10;
                            int i12 = iArr6[i11];
                            V vD2 = z3aVar.d((j0) objArr2[i11]);
                            vD2.getClass();
                            q0h q0hVar2 = (q0h) vD2;
                            if (i12 != 8) {
                                kf7 kf7VarH = rzgVar.a.h(i12);
                                jArr2 = jArr6;
                                iArr2 = iArr6;
                                long j6 = (((long) kf7VarH.a) << c4) | (((long) kf7VarH.b) << c3) | (((long) kf7VarH.c) << c2) | ((long) kf7VarH.d);
                                if (!pg8.s(q0hVar2.i, j6)) {
                                    q0hVar2.i = j6;
                                    z2 = z;
                                    if (!pg8.s(j6, 0L)) {
                                        z3 = z2;
                                    }
                                }
                            } else {
                                jArr2 = jArr6;
                                iArr2 = iArr6;
                            }
                            ((gme) q0hVar2.a).setValue(Boolean.valueOf(rzgVar.a.q(i12)));
                        } else {
                            jArr2 = jArr6;
                            iArr2 = iArr6;
                        }
                        j5 >>= 8;
                        i10++;
                        iArr6 = iArr2;
                        jArr6 = jArr2;
                    }
                    jArr = jArr6;
                    iArr = iArr6;
                    if (i9 != 8) {
                        break;
                    }
                } else {
                    jArr = jArr6;
                    iArr = iArr6;
                }
                if (i8 == length2) {
                    break;
                }
                i8++;
                iArr6 = iArr;
                jArr6 = jArr;
            }
        }
        b74 b74VarF = rzgVar.a.f();
        if (b74VarF == null) {
            j2 = 0;
        } else {
            kf7 kf7VarA = b74VarF.a();
            j2 = (((long) kf7VarA.a) << c4) | (((long) kf7VarA.b) << c3) | (((long) kf7VarA.c) << c2) | ((long) kf7VarA.d);
        }
        j0.a.getClass();
        V vD3 = z3aVar.d(j0.a.j);
        vD3.getClass();
        q0h q0hVar3 = (q0h) vD3;
        if (!pg8.s(q0hVar3.h, j2)) {
            q0hVar3.h = j2;
            q0hVar3.i = j2;
            z2 = z;
            if (!pg8.s(j2, 0L)) {
                z3 = z2;
            }
        }
        if (b74VarF == null) {
            jB = 0;
        } else {
            int i13 = Build.VERSION.SDK_INT;
            jB = ((long) (i13 >= 28 ? b74.a.b(b74VarF.a) : 0)) | (((long) (i13 >= 28 ? b74.a.e(b74VarF.a) : 0)) << c3) | (((long) (i13 >= 28 ? b74.a.c(b74VarF.a) : 0)) << c4) | (((long) (i13 >= 28 ? b74.a.d(b74VarF.a) : 0)) << c2);
        }
        V vD4 = z3aVar.d(j0.a.c);
        vD4.getClass();
        q0h q0hVar4 = (q0h) vD4;
        if (!pg8.s(jB, q0hVar4.h)) {
            q0hVar4.h = jB;
            q0hVar4.i = jB;
            z2 = z;
            if (!pg8.s(jB, 0L)) {
                z3 = z2;
            }
        }
        SnapshotStateList<utc> snapshotStateList = this.X;
        p3a<g4a<Rect>> p3aVar = this.W;
        if (b74VarF != null) {
            List<Rect> listA = Build.VERSION.SDK_INT >= 28 ? b74.a.a(b74VarF.a) : Collections.EMPTY_LIST;
            if (listA.size() < p3aVar.b) {
                p3aVar.l(listA.size(), p3aVar.b);
                snapshotStateList.a(listA.size(), snapshotStateList.size());
                z2 = z;
            } else {
                int size = listA.size() - p3aVar.b;
                int i14 = 0;
                while (i14 < size) {
                    p3aVar.g(androidx.compose.runtime.r.f(listA.get(p3aVar.b)));
                    snapshotStateList.add(new vtc("display cutout rect " + p3aVar.b));
                    i14++;
                    z2 = z;
                }
            }
            List<Rect> list = listA;
            int size2 = list.size();
            for (int i15 = 0; i15 < size2; i15++) {
                Rect rect = listA.get(i15);
                g4a<Rect> g4aVarB = p3aVar.b(i15);
                if (!wl7.b(g4aVarB.getValue(), rect)) {
                    g4aVarB.setValue(rect);
                    z2 = z;
                }
            }
            if (!list.isEmpty()) {
                z3 = z;
            }
        } else if (p3aVar.b > 0) {
            p3aVar.i();
            snapshotStateList.clear();
            z2 = z;
        }
        c3a c3aVar = this.V;
        if ((z3 || ((dme) c3aVar).e() != 0) && z2) {
            dme dmeVar = (dme) c3aVar;
            dmeVar.h(dmeVar.e() + 1);
            wle.e.getClass();
            wle.a.f();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap<View, prg> weakHashMap = epg.a;
        epg.d.m(view, this);
        epg.q(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap<View, prg> weakHashMap = epg.a;
        epg.d.m(view, null);
        epg.q(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c) {
            this.d = 0;
            this.c = false;
            rzg rzgVar = this.e;
            if (rzgVar != null) {
                f(rzgVar);
                this.e = null;
            }
        }
    }
}
