package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.indeed.android.jobsearch.viewjob.a;
import com.indeed.android.jsmappservices.bridge.DisplayToastData;
import defpackage.le0;
import defpackage.uh;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bh implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ bh(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((m74) obj).getClass();
                return new uh.d();
            case 1:
                s5e s5eVar = (s5e) obj;
                s5eVar.getClass();
                o5e.l(s5eVar, 1.0f);
                return j6g.a;
            case 2:
                dvf<Float> dvfVar = nc4.a;
                return Boolean.TRUE;
            case 3:
                ((m74) obj).getClass();
                return new yi4();
            case 4:
                y98 y98Var = (y98) obj;
                y98Var.getClass();
                y98Var.b = true;
                y98Var.c = true;
                return j6g.a;
            case 5:
                ((vnd) obj).getClass();
                return j6g.a;
            case 6:
                y98 y98Var2 = (y98) obj;
                y98Var2.getClass();
                y98Var2.b = true;
                y98Var2.c = true;
                return j6g.a;
            case 7:
                s5e s5eVar2 = (s5e) obj;
                s5eVar2.getClass();
                o5e.c(s5eVar2);
                o5e.l(s5eVar2, -1.0f);
                return j6g.a;
            case 8:
                s5e s5eVar3 = (s5e) obj;
                s5eVar3.getClass();
                p5e.a(s5eVar3);
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                String str = (String) obj;
                hvb hvbVar = hvb.c;
                if (str != null) {
                    m2c.b(hvbVar, str);
                } else {
                    m2c.a(hvbVar);
                }
                return j6g.a;
            case 10:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(1);
                List list2 = (wl7.b(obj2, Boolean.FALSE) || obj2 == null) ? null : (List) ((Function1) wld.a.b).invoke(obj2);
                Object obj3 = list.get(0);
                String str2 = obj3 != null ? (String) obj3 : null;
                str2.getClass();
                return new le0((List<? extends le0.c<? extends le0.a>>) list2, str2);
            case 11:
                iid iidVar = (iid) obj;
                iidVar.getClass();
                fae faeVar = new fae();
                while (iidVar.M1()) {
                    faeVar.add(Integer.valueOf((int) iidVar.getLong(0)));
                }
                return faeVar.b();
            case 12:
                return Float.valueOf(((ce0) obj).a);
            default:
                int i = a.H0;
                ((DisplayToastData) obj).getClass();
                ArrayList arrayList = lz2.a;
                lz2.h("view-job-bottom-sheet", "onDisplayToast called unexpectedly", null, 12);
                return j6g.a;
        }
    }
}
