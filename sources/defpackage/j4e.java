package defpackage;

import androidx.compose.runtime.r;
import defpackage.le0;
import defpackage.p2e;
import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class j4e {
    public final p4e a;
    public yf6 e;
    public Function1<? super le0, j6g> f;
    public ujf g;
    public ooa l;
    public sl8 m;
    public u3e u;
    public boolean v;
    public e13 w;
    public dcb x;
    public boolean y;
    public final g4a<p2e> b = r.f(null);
    public final g4a<Boolean> c = r.f(Boolean.TRUE);
    public Function1<? super p2e, j6g> d = new y2e(this, 1);
    public final tu2 h = new tu2();
    public final sm5 i = new sm5();
    public final g4a j = r.f(Boolean.FALSE);
    public final az3 k = r.c(new nj(this, 23));
    public final g4a n = r.e(j6g.a, zkd.f);
    public final g4a o = r.f(new ooa(0));
    public final g4a p = r.f(new ooa(0));
    public final g4a q = r.f(null);
    public final g4a r = r.f(null);
    public final g4a s = r.f(null);
    public final g4a t = r.f(null);

    public j4e(p4e p4eVar) {
        this.a = p4eVar;
        int i = 14;
        p4eVar.e = new se(this, i);
        p4eVar.f = new b4e(this);
        p4eVar.g = new c4e(this);
        p4eVar.h = new i30(this, 15);
        p4eVar.i = new fj(this, 20);
        p4eVar.j = new pe0(this, i);
    }

    public static final Object a(j4e j4eVar, c1f c1fVar) {
        Object objA;
        Pair<le0, kjf> pairE = j4eVar.e();
        if (pairE == null) {
            return j6g.a;
        }
        le0 le0VarA = pairE.a();
        long j = pairE.b().a;
        dcb dcbVar = j4eVar.x;
        return (dcbVar == null || (objA = dcbVar.a(le0VarA, j, c1fVar)) != g13.a) ? j6g.a : objA;
    }

    public final long b(sl8 sl8Var, long j) {
        sl8 sl8Var2 = this.m;
        if (sl8Var2 == null || !sl8Var2.d()) {
            return 9205357640488583168L;
        }
        return k().G(sl8Var, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            r13 = this;
            p2e r0 = r13.g()
            r1 = 0
            if (r0 == 0) goto La4
            p4e r0 = r13.a
            i59 r2 = r0.b()
            int r2 = r2.e
            if (r2 != 0) goto L13
            goto La4
        L13:
            le0$b r2 = new le0$b
            r2.<init>()
            sl8 r3 = r13.k()
            java.util.ArrayList r3 = r0.j(r3)
            int r4 = r3.size()
            java.util.ListIterator r4 = r3.listIterator(r4)
        L28:
            boolean r5 = r4.hasPrevious()
            r6 = -1
            if (r5 == 0) goto L54
            java.lang.Object r5 = r4.previous()
            uzd r5 = (defpackage.uzd) r5
            i59 r7 = r0.b()
            long r8 = r5.i()
            java.lang.Object r5 = r7.b(r8)
            p2e r5 = (defpackage.p2e) r5
            if (r5 == 0) goto L28
            p2e$a r7 = r5.a
            int r7 = r7.b
            p2e$a r5 = r5.b
            int r5 = r5.b
            if (r7 == r5) goto L28
            int r4 = r4.nextIndex()
            goto L55
        L54:
            r4 = r6
        L55:
            if (r4 == r6) goto L9f
            int r5 = r3.size()
            r6 = 0
            r7 = r6
        L5d:
            if (r7 >= r5) goto L9f
            java.lang.Object r8 = r3.get(r7)
            uzd r8 = (defpackage.uzd) r8
            i59 r9 = r0.b()
            long r10 = r8.i()
            java.lang.Object r9 = r9.b(r10)
            p2e r9 = (defpackage.p2e) r9
            if (r9 == 0) goto L9c
            le0 r8 = r8.getText()
            p2e$a r10 = r9.a
            int r10 = r10.b
            p2e$a r9 = r9.b
            int r9 = r9.b
            long r9 = defpackage.cr8.c(r10, r9)
            if (r7 < r4) goto L89
            r11 = 1
            goto L8a
        L89:
            r11 = r6
        L8a:
            int r12 = defpackage.kjf.f(r9)
            int r9 = defpackage.kjf.e(r9)
            r2.e(r8, r12, r9)
            if (r11 != 0) goto L9c
            r8 = 10
            r2.c(r8)
        L9c:
            int r7 = r7 + 1
            goto L5d
        L9f:
            le0 r0 = r2.l()
            goto La5
        La4:
            r0 = r1
        La5:
            if (r0 == 0) goto Lb9
            java.lang.String r2 = r0.b
            int r2 = r2.length()
            if (r2 <= 0) goto Lb0
            r1 = r0
        Lb0:
            if (r1 == 0) goto Lb9
            kotlin.jvm.functions.Function1<? super le0, j6g> r13 = r13.f
            if (r13 == 0) goto Lb9
            r13.invoke(r1)
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j4e.c():void");
    }

    public final uzd d(p2e.a aVar) {
        return this.a.c.b(aVar.c);
    }

    public final Pair<le0, kjf> e() {
        int iNextIndex;
        int iF;
        int length;
        if (g() == null) {
            return null;
        }
        p4e p4eVar = this.a;
        if (p4eVar.b.isEmpty()) {
            return null;
        }
        le0.b bVar = new le0.b();
        ArrayList arrayListJ = p4eVar.j(k());
        ListIterator listIterator = arrayListJ.listIterator(arrayListJ.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            p2e p2eVarB = p4eVar.b().b(((uzd) listIterator.previous()).i());
            if (p2eVarB != null && p2eVarB.a.b != p2eVarB.b.b) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        if (iNextIndex != -1) {
            int size = arrayListJ.size();
            iF = -1;
            length = -1;
            int i = 0;
            while (i < size) {
                uzd uzdVar = (uzd) arrayListJ.get(i);
                p2e p2eVarB2 = p4eVar.b().b(uzdVar.i());
                if (p2eVarB2 != null) {
                    le0 text = uzdVar.getText();
                    long jC = cr8.c(p2eVarB2.a.b, p2eVarB2.b.b);
                    boolean z = i >= iNextIndex;
                    if (iF == -1) {
                        iF = kjf.f(jC);
                        bVar.e(text, 0, kjf.f(jC));
                    }
                    bVar.e(text, kjf.f(jC), kjf.e(jC));
                    if (z) {
                        length = bVar.a.length();
                        bVar.e(text, kjf.e(jC), text.b.length());
                    } else {
                        bVar.c('\n');
                    }
                }
                i++;
            }
        } else {
            iF = -1;
            length = -1;
        }
        le0 le0VarL = bVar.l();
        if (iF == -1 || length == -1) {
            return null;
        }
        return new Pair<>(le0VarL, new kjf(cr8.c(iF, length)));
    }

    public final jf6 f() {
        return (jf6) ((gme) this.s).getValue();
    }

    public final p2e g() {
        return (p2e) ((gme) this.b).getValue();
    }

    public final boolean h() {
        return ((Boolean) ((gme) this.c).getValue()).booleanValue();
    }

    public final boolean i() {
        p2e p2eVarG = g();
        if (p2eVarG != null) {
            p2e.a aVar = p2eVarG.b;
            p2e.a aVar2 = p2eVarG.a;
            if (!wl7.b(aVar2, aVar)) {
                if (aVar2.c == aVar.c) {
                    return true;
                }
                sl8 sl8VarK = k();
                p4e p4eVar = this.a;
                ArrayList arrayListJ = p4eVar.j(sl8VarK);
                int size = arrayListJ.size();
                for (int i = 0; i < size; i++) {
                    p2e p2eVarB = p4eVar.b().b(((uzd) arrayListJ.get(i)).i());
                    if (p2eVarB != null && p2eVarB.a.b != p2eVarB.b.b) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void j() {
        yf6 yf6Var;
        k3a k3aVar = j59.a;
        k3aVar.getClass();
        ((gme) this.a.k).setValue(k3aVar);
        this.y = false;
        p();
        if (g() != null) {
            this.d.invoke(null);
            if (!h() || (yf6Var = this.e) == null) {
                return;
            }
            yf6Var.a(9);
        }
    }

    public final sl8 k() {
        sl8 sl8Var = this.m;
        if (sl8Var != null) {
            if (!sl8Var.d()) {
                de7.a("unattached coordinates");
            }
            return sl8Var;
        }
        de7.b("null coordinates");
        r40.e();
        return null;
    }

    public final void l(boolean z) {
        g4a<Boolean> g4aVar = this.c;
        if (((Boolean) ((gme) g4aVar).getValue()).booleanValue() != z) {
            ((gme) g4aVar).setValue(Boolean.valueOf(z));
            p();
        }
    }

    public final void m(p2e p2eVar) {
        ((gme) this.b).setValue(p2eVar);
        if (p2eVar != null) {
            n();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n() {
        /*
            r20 = this;
            r0 = r20
            p2e r1 = r0.g()
            sl8 r2 = r0.m
            r3 = 0
            if (r1 == 0) goto L14
            p2e$a r4 = r1.a
            if (r4 == 0) goto L14
            uzd r4 = r0.d(r4)
            goto L15
        L14:
            r4 = r3
        L15:
            if (r1 == 0) goto L20
            p2e$a r5 = r1.b
            if (r5 == 0) goto L20
            uzd r5 = r0.d(r5)
            goto L21
        L20:
            r5 = r3
        L21:
            if (r4 == 0) goto L28
            sl8 r6 = r4.d()
            goto L29
        L28:
            r6 = r3
        L29:
            if (r5 == 0) goto L30
            sl8 r7 = r5.d()
            goto L31
        L30:
            r7 = r3
        L31:
            g4a r8 = r0.r
            g4a r9 = r0.q
            if (r1 == 0) goto Lb0
            if (r2 == 0) goto Lb0
            boolean r10 = r2.d()
            if (r10 == 0) goto Lb0
            if (r6 != 0) goto L45
            if (r7 != 0) goto L45
            goto Lb0
        L45:
            qtc r10 = defpackage.k4e.c(r2)
            r13 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            if (r6 == 0) goto L79
            r15 = 1
            r16 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            long r11 = r4.a(r1, r15)
            long r18 = r11 & r13
            int r4 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r4 != 0) goto L61
            goto L7e
        L61:
            long r11 = r2.G(r6, r11)
            ooa r4 = new ooa
            r4.<init>(r11)
            jf6 r6 = r0.f()
            jf6 r15 = defpackage.jf6.b
            if (r6 == r15) goto L7f
            boolean r6 = defpackage.k4e.a(r10, r11)
            if (r6 == 0) goto L7e
            goto L7f
        L79:
            r16 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
        L7e:
            r4 = r3
        L7f:
            gme r9 = (defpackage.gme) r9
            r9.setValue(r4)
            if (r7 == 0) goto Laa
            r4 = 0
            long r4 = r5.a(r1, r4)
            long r11 = r4 & r13
            int r1 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r1 != 0) goto L92
            goto Laa
        L92:
            long r1 = r2.G(r7, r4)
            ooa r4 = new ooa
            r4.<init>(r1)
            jf6 r0 = r0.f()
            jf6 r5 = defpackage.jf6.c
            if (r0 == r5) goto La9
            boolean r0 = defpackage.k4e.a(r10, r1)
            if (r0 == 0) goto Laa
        La9:
            r3 = r4
        Laa:
            gme r8 = (defpackage.gme) r8
            r8.setValue(r3)
            return
        Lb0:
            gme r9 = (defpackage.gme) r9
            r9.setValue(r3)
            gme r8 = (defpackage.gme) r8
            r8.setValue(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j4e.n():void");
    }

    public final boolean o(long j, long j2, boolean z, u2e u2eVar) {
        ((gme) this.s).setValue(z ? jf6.b : jf6.c);
        ((gme) this.t).setValue(new ooa(j));
        sl8 sl8VarK = k();
        p4e p4eVar = this.a;
        ArrayList arrayListJ = p4eVar.j(sl8VarK);
        int i = f59.a;
        i3a i3aVar = new i3a(6);
        int size = arrayListJ.size();
        for (int i2 = 0; i2 < size; i2++) {
            i3aVar.e(i2, ((uzd) arrayListJ.get(i2)).i());
        }
        u3e uheVar = null;
        v3e v3eVar = new v3e(j, j2, sl8VarK, z, (j2 & 9223372034707292159L) == 9205357640488583168L ? null : g(), new f4e(i3aVar));
        int size2 = arrayListJ.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((uzd) arrayListJ.get(i3)).k(v3eVar);
        }
        int i4 = v3eVar.k + 1;
        ArrayList arrayList = v3eVar.h;
        int size3 = arrayList.size();
        if (size3 != 0) {
            if (size3 != 1) {
                int i5 = v3eVar.i;
                if (i5 == -1) {
                    i5 = i4;
                }
                int i6 = v3eVar.j;
                if (i6 == -1) {
                    i6 = i4;
                }
                uheVar = new u1a(v3eVar.g, arrayList, i5, i6, v3eVar.d, v3eVar.e);
            } else {
                vzd vzdVar = (vzd) z92.k1(arrayList);
                int i7 = v3eVar.i;
                int i8 = i7 == -1 ? i4 : i7;
                int i9 = v3eVar.j;
                uheVar = new uhe(v3eVar.d, i8, i9 == -1 ? i4 : i9, v3eVar.e, vzdVar);
            }
        }
        if (uheVar == null || !uheVar.l(this.u)) {
            return false;
        }
        p2e p2eVarA = u2eVar.a(uheVar);
        if (!wl7.b(p2eVarA, g())) {
            if (h()) {
                ArrayList arrayList2 = p4eVar.b;
                int size4 = arrayList2.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size4) {
                        break;
                    }
                    if (((uzd) arrayList2.get(i10)).getText().b.length() > 0) {
                        yf6 yf6Var = this.e;
                        if (yf6Var != null) {
                            yf6Var.a(9);
                        }
                    } else {
                        i10++;
                    }
                }
            }
            ((gme) p4eVar.k).setValue(uheVar.m(p2eVarA));
            this.d.invoke(p2eVarA);
            this.v = false;
        }
        this.u = uheVar;
        return true;
    }

    public final void p() {
        uqe uqeVar;
        if (((Boolean) ((gme) this.j).getValue()).booleanValue()) {
            boolean z = this.y;
            tu2 tu2Var = this.h;
            if (z && h()) {
                if (((qtc) this.k.getValue()) == null) {
                    return;
                }
                tu2Var.k();
            } else {
                ndf ndfVar = (ndf) tu2Var.a;
                if (ndfVar == null || (uqeVar = ndfVar.j0) == null) {
                    return;
                }
                uqeVar.h(null);
                ndfVar.j0 = null;
            }
        }
    }
}
