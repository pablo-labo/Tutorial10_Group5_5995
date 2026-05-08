package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.mj;
import defpackage.yk4;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class li implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ li(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j;
        da2 da2Var;
        byte b = 0;
        switch (this.a) {
            case 0:
                ((m74) obj).getClass();
                return new mj.e();
            case 1:
                s5e s5eVar = (s5e) obj;
                s5eVar.getClass();
                o5e.g(s5eVar, 0);
                return j6g.a;
            case 2:
                rx9 rx9Var = (rx9) obj;
                rx9Var.getClass();
                cm0 cm0Var = new cm0(b);
                iwc iwcVar = fwc.a;
                yd8 yd8VarB = iwcVar.b(pld.class);
                lve lveVar = zpd.c;
                uh8 uh8Var = uh8.b;
                rx9Var.a(new e65(new ue1(lveVar, yd8VarB, null, cm0Var, uh8Var)));
                rx9Var.a(new e65(new ue1(lveVar, iwcVar.b(ude.class), null, new dm0(b, b), uh8Var)));
                rx9Var.a(new e65(new ue1(lveVar, iwcVar.b(rs0.class), null, new em0(b), uh8Var)));
                rx9Var.a(new e65(new ue1(lveVar, iwcVar.b(fr0.class), null, new fm0(b), uh8Var)));
                rx9Var.a(new e65(new ue1(lveVar, iwcVar.b(mk7.class), null, new gm0(b, b), uh8Var)));
                rx9Var.a(new e65(new ue1(lveVar, iwcVar.b(bn7.class), null, new hm0(b), uh8Var)));
                rx9Var.a(new e65(new ue1(lveVar, iwcVar.b(ap0.class), null, new im0(b, b), uh8Var)));
                rx9Var.a(new e65(new ue1(lveVar, iwcVar.b(gka.class), null, new jm0(b), uh8Var)));
                return j6g.a;
            case 3:
                ((Integer) obj).getClass();
                return -100;
            case 4:
                s5e s5eVar2 = (s5e) obj;
                s5eVar2.getClass();
                o5e.e(s5eVar2, new l92(0));
                return j6g.a;
            case 5:
                s5e s5eVar3 = (s5e) obj;
                s5eVar3.getClass();
                o5e.i(s5eVar3, 0);
                return j6g.a;
            case 6:
                ((m74) obj).getClass();
                return new yk4.b();
            case 7:
                ((Long) obj).longValue();
                return j6g.a;
            case 8:
                s5e s5eVar4 = (s5e) obj;
                s5eVar4.getClass();
                o5e.i(s5eVar4, 0);
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                obj.getClass();
                return new lc1(((Float) obj).floatValue());
            case 10:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                int i = da2.j;
                ko2 ko2Var = wld.a;
                Boolean bool = Boolean.FALSE;
                wl7.b(obj2, bool);
                da2 da2Var2 = obj2 != null ? wl7.b(obj2, Boolean.FALSE) ? new da2(da2.i) : new da2(pnb.d(((Integer) obj2).intValue())) : null;
                da2Var2.getClass();
                long j2 = da2Var2.a;
                Object obj3 = list.get(1);
                ckf[] ckfVarArr = bkf.b;
                Function1<Object, Object> function1 = wld.q.b;
                wl7.b(obj3, bool);
                bkf bkfVar = obj3 != null ? (bkf) function1.invoke(obj3) : null;
                bkfVar.getClass();
                long j3 = bkfVar.a;
                Object obj4 = list.get(2);
                to5 to5Var = to5.b;
                to5 to5Var2 = (wl7.b(obj4, bool) || obj4 == null) ? null : (to5) ((Function1) wld.m.b).invoke(obj4);
                Object obj5 = list.get(3);
                mo5 mo5Var = obj5 != null ? (mo5) obj5 : null;
                Object obj6 = list.get(4);
                no5 no5Var = obj6 != null ? (no5) obj6 : null;
                Object obj7 = list.get(6);
                String str = obj7 != null ? (String) obj7 : null;
                Object obj8 = list.get(7);
                wl7.b(obj8, bool);
                bkf bkfVar2 = obj8 != null ? (bkf) function1.invoke(obj8) : null;
                bkfVar2.getClass();
                long j4 = bkfVar2.a;
                Object obj9 = list.get(8);
                lc1 lc1Var = (wl7.b(obj9, bool) || obj9 == null) ? null : (lc1) ((Function1) wld.n.b).invoke(obj9);
                Object obj10 = list.get(9);
                lhf lhfVar = (wl7.b(obj10, bool) || obj10 == null) ? null : (lhf) ((Function1) wld.k.b).invoke(obj10);
                Object obj11 = list.get(10);
                b19 b19Var = b19.c;
                b19 b19Var2 = (wl7.b(obj11, bool) || obj11 == null) ? null : (b19) ((Function1) wld.s.b).invoke(obj11);
                Object obj12 = list.get(11);
                wl7.b(obj12, bool);
                if (obj12 == null) {
                    j = j4;
                    da2Var = null;
                } else if (wl7.b(obj12, Boolean.FALSE)) {
                    j = j4;
                    da2Var = new da2(da2.i);
                } else {
                    j = j4;
                    da2Var = new da2(pnb.d(((Integer) obj12).intValue()));
                }
                da2Var.getClass();
                long j5 = da2Var.a;
                Object obj13 = list.get(12);
                odf odfVar = (wl7.b(obj13, bool) || obj13 == null) ? null : (odf) ((Function1) wld.j.b).invoke(obj13);
                Object obj14 = list.get(13);
                vbe vbeVar = vbe.d;
                return new foe(j2, j3, to5Var2, mo5Var, no5Var, (pn5) null, str, j, lc1Var, lhfVar, b19Var2, j5, odfVar, (wl7.b(obj14, bool) || obj14 == null) ? null : (vbe) ((Function1) wld.o.b).invoke(obj14), 49184);
            case 11:
                de0 de0Var = (de0) obj;
                return new ooa((((long) Float.floatToRawIntBits(de0Var.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(de0Var.a)) << 32));
            case 12:
                s5e s5eVar5 = (s5e) obj;
                s5eVar5.getClass();
                o5e.c(s5eVar5);
                return j6g.a;
            default:
                dgf dgfVar = (dgf) obj;
                Integer numC = dgfVar.c();
                if (numC == null) {
                    return null;
                }
                int iIntValue = numC.intValue();
                long j6 = dgfVar.f;
                int i2 = kjf.c;
                return new tx3(0, iIntValue - ((int) (4294967295L & j6)));
        }
    }
}
