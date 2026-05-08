package defpackage;

import defpackage.hv1;
import defpackage.lf0;
import defpackage.rw5;
import defpackage.s5c;
import defpackage.w5c;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gn9 {
    public final h04 a;
    public final cf0 b;

    public gn9(h04 h04Var) {
        this.a = h04Var;
        g04 g04Var = h04Var.a;
        this.b = new cf0(g04Var.b, g04Var.l);
    }

    public final s5c a(aj3 aj3Var) {
        if (aj3Var instanceof lya) {
            mq5 mq5VarH = ((lya) aj3Var).h();
            h04 h04Var = this.a;
            return new s5c.b(mq5VarH, h04Var.b, h04Var.d, h04Var.g);
        }
        if (aj3Var instanceof v04) {
            return ((v04) aj3Var).l0;
        }
        return null;
    }

    public final lf0 b(rw5.c cVar, int i, je0 je0Var) {
        return !ch5.c.c(i).booleanValue() ? lf0.a.a : new kja(this.a.a.a, new by6(1, this, cVar, je0Var));
    }

    public final lf0 c(g5c g5cVar, boolean z) {
        return !ch5.c.c(g5cVar.Q()).booleanValue() ? lf0.a.a : new kja(this.a.a.a, new cn9(this, z, g5cVar));
    }

    public final m04 d(w4c w4cVar, boolean z) {
        e04 e04Var;
        h04 h04Var = this.a;
        aj3 aj3Var = h04Var.c;
        aj3Var.getClass();
        t52 t52Var = (t52) aj3Var;
        int iB = w4cVar.B();
        je0 je0Var = je0.a;
        m04 m04Var = new m04(t52Var, null, b(w4cVar, iB, je0Var), z, hv1.a.a, w4cVar, h04Var.b, h04Var.d, h04Var.e, h04Var.g, null);
        gn9 gn9Var = h04Var.a(m04Var, zr4.a, h04Var.b, h04Var.d, h04Var.e, h04Var.f).i;
        List<n5c> listC = w4cVar.C();
        listC.getClass();
        List listG = gn9Var.g(listC, w4cVar, je0Var);
        q5c q5cVar = (q5c) ch5.d.c(w4cVar.B());
        switch (q5cVar == null ? -1 : w5c.a.b[q5cVar.ordinal()]) {
            case 1:
                e04Var = d04.d;
                e04Var.getClass();
                break;
            case 2:
                e04Var = d04.a;
                e04Var.getClass();
                break;
            case 3:
                e04Var = d04.b;
                e04Var.getClass();
                break;
            case 4:
                e04Var = d04.c;
                e04Var.getClass();
                break;
            case 5:
                e04Var = d04.e;
                e04Var.getClass();
                break;
            case 6:
                e04Var = d04.f;
                e04Var.getClass();
                break;
            default:
                e04Var = d04.a;
                e04Var.getClass();
                break;
        }
        m04Var.X0(listG, e04Var);
        m04Var.U0(t52Var.o());
        m04Var.g0 = t52Var.i0();
        m04Var.l0 = !ch5.o.c(w4cVar.B()).booleanValue();
        return m04Var;
    }

    public final r14 e(b5c b5cVar) {
        int iS;
        ui8 ui8VarG;
        h04 h04Var = this.a;
        o8a o8aVar = h04Var.b;
        hyf hyfVar = h04Var.d;
        b5cVar.getClass();
        if (b5cVar.d0()) {
            iS = b5cVar.S();
        } else {
            int iU = b5cVar.U();
            iS = ((iU >> 8) << 6) + (iU & 63);
        }
        int i = iS;
        je0 je0Var = je0.a;
        lf0 lf0VarB = b(b5cVar, i, je0Var);
        boolean zG0 = b5cVar.g0();
        lf0.a.C0307a c0307a = lf0.a.a;
        lf0 k04Var = (zG0 || b5cVar.h0()) ? new k04(h04Var.a.a, new dn9(this, b5cVar, je0Var)) : c0307a;
        cng cngVar = b04.g(h04Var.c).a(q8a.b(o8aVar, b5cVar.T())).equals(a1f.a) ? cng.b : h04Var.e;
        aj3 aj3Var = h04Var.c;
        n8a n8aVarB = q8a.b(o8aVar, b5cVar.T());
        c5c c5cVar = (c5c) ch5.p.c(i);
        int i2 = c5cVar == null ? -1 : w5c.a.a[c5cVar.ordinal()];
        hv1.a aVar = hv1.a.a;
        if (i2 != 1) {
            if (i2 == 2) {
                aVar = hv1.a.b;
            } else if (i2 == 3) {
                aVar = hv1.a.c;
            } else if (i2 == 4) {
                aVar = hv1.a.d;
            }
        }
        lf0 lf0Var = k04Var;
        r14 r14Var = new r14(aj3Var, null, lf0VarB, n8aVarB, aVar, b5cVar, h04Var.b, hyfVar, cngVar, h04Var.g, null);
        List<l5c> listZ = b5cVar.Z();
        listZ.getClass();
        h04 h04VarA = h04Var.a(r14Var, listZ, h04Var.b, h04Var.d, h04Var.e, h04Var.f);
        gxf gxfVar = h04VarA.h;
        j5c j5cVarB = y5c.b(b5cVar, hyfVar);
        isc iscVarH = (j5cVarB == null || (ui8VarG = gxfVar.g(j5cVarB)) == null) ? null : jz3.h(r14Var, ui8VarG, lf0Var);
        aj3 aj3Var2 = h04Var.c;
        t52 t52Var = aj3Var2 instanceof t52 ? (t52) aj3Var2 : null;
        hsc hscVarJ0 = t52Var != null ? t52Var.J0() : null;
        List<j5c> listQ = b5cVar.Q();
        if (listQ.isEmpty()) {
            listQ = null;
        }
        if (listQ == null) {
            List<Integer> listP = b5cVar.P();
            listP.getClass();
            List<Integer> list = listP;
            ArrayList arrayList = new ArrayList(t92.r0(list, 10));
            for (Integer num : list) {
                num.getClass();
                arrayList.add(hyfVar.a(num.intValue()));
            }
            listQ = arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        int i3 = 0;
        for (Object obj : listQ) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                u63.o0();
                throw null;
            }
            isc iscVarB = jz3.b(r14Var, gxfVar.g((j5c) obj), null, c0307a, i3);
            if (iscVarB != null) {
                arrayList2.add(iscVarB);
            }
            i3 = i4;
        }
        List<rxf> listB = gxfVar.b();
        gn9 gn9Var = h04VarA.i;
        List<n5c> listB0 = b5cVar.b0();
        listB0.getClass();
        r14Var.Z0(iscVarH, hscVarJ0, arrayList2, listB, gn9Var.g(listB0, b5cVar, je0Var), gxfVar.g(y5c.c(b5cVar, hyfVar)), v5c.a((d5c) ch5.e.c(i)), w5c.a((q5c) ch5.d.c(i)), bs4.a);
        r14Var.b0 = ch5.q.c(i).booleanValue();
        r14Var.c0 = ch5.r.c(i).booleanValue();
        r14Var.d0 = ch5.u.c(i).booleanValue();
        r14Var.e0 = ch5.s.c(i).booleanValue();
        r14Var.f0 = ch5.t.c(i).booleanValue();
        r14Var.k0 = ch5.v.c(i).booleanValue();
        r14Var.g0 = ch5.w.c(i).booleanValue();
        r14Var.l0 = !ch5.x.c(i).booleanValue();
        h04Var.a.m.getClass();
        return r14Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.q14 f(defpackage.g5c r28) {
        /*
            Method dump skipped, instruction units count: 987
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gn9.f(g5c):q14");
    }

    public final List g(List list, rw5.c cVar, je0 je0Var) {
        int i;
        lf0 kjaVar;
        gn9 gn9Var = this;
        h04 h04Var = gn9Var.a;
        hyf hyfVar = h04Var.d;
        gxf gxfVar = h04Var.h;
        aj3 aj3Var = h04Var.c;
        aj3Var.getClass();
        fv1 fv1Var = (fv1) aj3Var;
        aj3 aj3VarD = fv1Var.d();
        aj3VarD.getClass();
        s5c s5cVarA = gn9Var.a(aj3VarD);
        List list2 = list;
        ArrayList arrayList = new ArrayList(t92.r0(list2, 10));
        int i2 = 0;
        for (Object obj : list2) {
            int i3 = i2 + 1;
            ui8 ui8VarG = null;
            if (i2 < 0) {
                u63.o0();
                throw null;
            }
            n5c n5cVar = (n5c) obj;
            int iA = n5cVar.G() ? n5cVar.A() : 0;
            if (s5cVarA == null || !ch5.c.c(iA).booleanValue()) {
                i = i2;
                kjaVar = lf0.a.a;
            } else {
                i = i2;
                kjaVar = new kja(h04Var.a.a, new en9(gn9Var, s5cVarA, cVar, je0Var, i, n5cVar));
            }
            n8a n8aVarB = q8a.b(h04Var.b, n5cVar.B());
            ui8 ui8VarG2 = gxfVar.g(y5c.e(n5cVar, hyfVar));
            boolean zBooleanValue = ch5.H.c(iA).booleanValue();
            boolean zBooleanValue2 = ch5.I.c(iA).booleanValue();
            boolean zBooleanValue3 = ch5.J.c(iA).booleanValue();
            j5c j5cVarE = n5cVar.K() ? n5cVar.E() : n5cVar.L() ? hyfVar.a(n5cVar.F()) : null;
            if (j5cVarE != null) {
                ui8VarG = gxfVar.g(j5cVarE);
            }
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new slg(fv1Var, null, i, kjaVar, n8aVarB, ui8VarG2, zBooleanValue, zBooleanValue2, zBooleanValue3, ui8VarG, qne.p));
            arrayList = arrayList2;
            i2 = i3;
            gn9Var = this;
        }
        return z92.z1(arrayList);
    }
}
