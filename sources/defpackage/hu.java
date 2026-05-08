package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.indeed.android.tare.broadcast.ApplyType;
import com.indeed.android.tare.broadcast.JSTBroadcastEvent;
import defpackage.rx8;
import defpackage.yk4;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hu implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ hu(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = 1;
        switch (this.a) {
            case 0:
                ((m74) obj).getClass();
                return new dv();
            case 1:
                ((m74) obj).getClass();
                return new az();
            case 2:
                s5e s5eVar = (s5e) obj;
                s5eVar.getClass();
                o5e.g(s5eVar, 0);
                return j6g.a;
            case 3:
                y98 y98Var = (y98) obj;
                y98Var.getClass();
                y98Var.b = true;
                y98Var.c = true;
                return j6g.a;
            case 4:
                return j6g.a;
            case 5:
                s5e s5eVar2 = (s5e) obj;
                s5eVar2.getClass();
                p5e.a(s5eVar2);
                return j6g.a;
            case 6:
                ((m74) obj).getClass();
                return new nh4(0);
            case 7:
                ((m74) obj).getClass();
                return new ez(i);
            case 8:
                ((m74) obj).getClass();
                return new yk4.c();
            case DatadogLogGenerator.CRASH /* 9 */:
                return j6g.a;
            case 10:
                return j6g.a;
            case 11:
                y98 y98Var2 = (y98) obj;
                y98Var2.getClass();
                y98Var2.b = true;
                y98Var2.c = true;
                return j6g.a;
            case 12:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                String str = obj2 != null ? (String) obj2 : null;
                str.getClass();
                Object obj3 = list.get(1);
                return new rx8.a(str, (wl7.b(obj3, Boolean.FALSE) || obj3 == null) ? null : (rif) ((Function1) wld.i.b).invoke(obj3), null);
            case 13:
                JSTBroadcastEvent.ApplyStart applyStart = (JSTBroadcastEvent.ApplyStart) obj;
                int i2 = mud.t0;
                applyStart.getClass();
                return Boolean.valueOf(applyStart.getApplyType() == ApplyType.AutoApply);
            default:
                je9 je9Var = (je9) obj;
                je9Var.getClass();
                return ((Object) je9Var.a().get(1)) + "source=tel_myjobs";
        }
    }
}
