package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.indeed.android.jsmappservices.bridge.DisplayToastData;
import defpackage.eg4;
import defpackage.uh;
import expo.modules.kotlin.exception.EnumNoSuchValueException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lg implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ lg(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        wif wifVar = null;
        switch (this.a) {
            case 0:
                ((m74) obj).getClass();
                return new uh.b();
            case 1:
                ((String) obj).getClass();
                return j6g.a;
            case 2:
                s5e s5eVar = (s5e) obj;
                s5eVar.getClass();
                p5e.a(s5eVar);
                return j6g.a;
            case 3:
                s5e s5eVar2 = (s5e) obj;
                s5eVar2.getClass();
                o5e.c(s5eVar2);
                return j6g.a;
            case 4:
                ((m74) obj).getClass();
                return new eg4.b();
            case 5:
                Enum r15 = (Enum) obj;
                int i = EnumNoSuchValueException.a;
                r15.getClass();
                return l5.m("'", r15.name(), "'");
            case 6:
                return obj;
            case 7:
                y98 y98Var = (y98) obj;
                y98Var.getClass();
                y98Var.b = true;
                y98Var.c = true;
                return j6g.a;
            case 8:
                List list = (List) obj;
                return new ss8(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            case DatadogLogGenerator.CRASH /* 9 */:
                y98 y98Var2 = (y98) obj;
                y98Var2.getClass();
                y98Var2.b = true;
                y98Var2.c = true;
                return j6g.a;
            case 10:
                ((DisplayToastData) obj).getClass();
                ArrayList arrayList = lz2.a;
                lz2.h("ModalWebviewFragment", "onDisplayToast called unexpectedly", null, 12);
                return j6g.a;
            case 11:
                obj.getClass();
                List list2 = (List) obj;
                Object obj2 = list2.get(0);
                dcf dcfVar = obj2 != null ? (dcf) obj2 : null;
                dcfVar.getClass();
                int i2 = dcfVar.a;
                Object obj3 = list2.get(1);
                sdf sdfVar = obj3 != null ? (sdf) obj3 : null;
                sdfVar.getClass();
                int i3 = sdfVar.a;
                Object obj4 = list2.get(2);
                ckf[] ckfVarArr = bkf.b;
                xld xldVar = wld.q;
                Boolean bool = Boolean.FALSE;
                wl7.b(obj4, bool);
                bkf bkfVar = obj4 != null ? (bkf) xldVar.b.invoke(obj4) : null;
                bkfVar.getClass();
                long j = bkfVar.a;
                Object obj5 = list2.get(3);
                nhf nhfVar = nhf.c;
                nhf nhfVar2 = (wl7.b(obj5, bool) || obj5 == null) ? null : (nhf) ((Function1) wld.l.b).invoke(obj5);
                Object obj6 = list2.get(4);
                acb acbVar = acb.b;
                acb acbVar2 = (wl7.b(obj6, bool) || obj6 == null) ? null : (acb) ((Function1) yld.a.b).invoke(obj6);
                Object obj7 = list2.get(5);
                fx8 fx8Var = fx8.c;
                fx8 fx8Var2 = (wl7.b(obj7, bool) || obj7 == null) ? null : (fx8) ((Function1) wld.u.b).invoke(obj7);
                Object obj8 = list2.get(6);
                bx8 bx8Var = (wl7.b(obj8, bool) || obj8 == null) ? null : (bx8) ((Function1) yld.b.b).invoke(obj8);
                bx8Var.getClass();
                int i4 = bx8Var.a;
                Object obj9 = list2.get(7);
                zm6 zm6Var = obj9 != null ? (zm6) obj9 : null;
                zm6Var.getClass();
                int i5 = zm6Var.a;
                Object obj10 = list2.get(8);
                boolean zB = wl7.b(obj10, bool);
                ko2 ko2Var = yld.c;
                if (!zB && obj10 != null) {
                    wifVar = (wif) ((Function1) ko2Var.b).invoke(obj10);
                }
                return new l3b(i2, i3, j, nhfVar2, acbVar2, fx8Var2, i4, i5, wifVar);
            case 12:
                dgf dgfVar = (dgf) obj;
                String str = dgfVar.g.b;
                long j2 = dgfVar.f;
                int i6 = kjf.c;
                int iC = wea.c((int) (j2 & 4294967295L), str);
                if (iC != -1) {
                    return new tx3(0, iC - ((int) (dgfVar.f & 4294967295L)));
                }
                return null;
            default:
                ((kcf) obj).getClass();
                return j6g.a;
        }
    }
}
