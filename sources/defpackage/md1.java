package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.indeed.android.messaging.data.events.EventRecord;
import defpackage.nub;
import defpackage.r78;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class md1 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ md1(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                Long l = (Long) obj;
                l.longValue();
                return l;
            case 1:
                y98 y98Var = (y98) obj;
                y98Var.getClass();
                y98Var.b = true;
                y98Var.c = true;
                return j6g.a;
            case 2:
                EventRecord.Attachment attachment = (EventRecord.Attachment) obj;
                attachment.getClass();
                return attachment.getFileName();
            case 3:
                s5e s5eVar = (s5e) obj;
                s5eVar.getClass();
                o5e.c(s5eVar);
                return j6g.a;
            case 4:
                ((m74) obj).getClass();
                return new r78.d();
            case 5:
                return j6g.a;
            case 6:
                EventRecord.Attachment attachment2 = (EventRecord.Attachment) obj;
                attachment2.getClass();
                return attachment2.getContentHash();
            case 7:
                caa caaVar = (caa) obj;
                caaVar.getClass();
                return Boolean.valueOf(caaVar.b());
            case 8:
                ((m74) obj).getClass();
                pub.b.a().a();
                return new nub.a();
            case DatadogLogGenerator.CRASH /* 9 */:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                ckf[] ckfVarArr = bkf.b;
                Function1<Object, Object> function1 = wld.q.b;
                Boolean bool = Boolean.FALSE;
                wl7.b(obj2, bool);
                bkf bkfVar = obj2 != null ? (bkf) function1.invoke(obj2) : null;
                bkfVar.getClass();
                long j = bkfVar.a;
                Object obj3 = list.get(1);
                wl7.b(obj3, bool);
                bkf bkfVar2 = obj3 != null ? (bkf) function1.invoke(obj3) : null;
                bkfVar2.getClass();
                return new nhf(j, bkfVar2.a);
            default:
                String str = obj != null ? (String) obj : null;
                str.getClass();
                return new vhg(str);
        }
    }
}
