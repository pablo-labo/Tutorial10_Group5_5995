package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.indeed.android.messaging.data.events.EventRecord;
import defpackage.ph8;
import defpackage.uh;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zg implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ zg(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        switch (this.a) {
            case 0:
                ((m74) obj).getClass();
                return new uh.e();
            case 1:
                s5e s5eVar = (s5e) obj;
                s5eVar.getClass();
                o5e.i(s5eVar, 0);
                return j6g.a;
            case 2:
                EventRecord eventRecord = (EventRecord) obj;
                eventRecord.getClass();
                return eventRecord.getId();
            case 3:
                String str = (String) obj;
                str.getClass();
                return zve.s0(str).toString();
            case 4:
                ((String) obj).getClass();
                return j6g.a;
            case 5:
                s5e s5eVar2 = (s5e) obj;
                s5eVar2.getClass();
                o5e.l(s5eVar2, 7.0f);
                return j6g.a;
            case 6:
                Function1 function1 = (Function1) obj;
                function1.getClass();
                function1.invoke("records");
                return j6g.a;
            case 7:
                String str2 = (String) obj;
                hvb hvbVar = hvb.Y;
                if (str2 != null) {
                    m2c.b(hvbVar, str2);
                } else {
                    m2c.a(hvbVar);
                }
                return j6g.a;
            case 8:
                ph8.b bVar = (ph8.b) obj;
                bVar.a = 1800;
                bVar.a(Float.valueOf(0.0f), 1000).b = c3c.c;
                bVar.a(Float.valueOf(1.0f), 1567);
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                Integer num = (Integer) obj;
                num.getClass();
                gse gseVar = ced.a;
                do {
                    value = gseVar.getValue();
                    ((bed) value).getClass();
                } while (!gseVar.h(value, new bed(num, true)));
                return j6g.a;
            case 10:
                qf8<Object>[] qf8VarArr = o5e.a;
                r5e<Boolean> r5eVar = k5e.l;
                qf8<Object> qf8Var = o5e.a[5];
                ((s5e) obj).a(r5eVar, Boolean.TRUE);
                return j6g.a;
            default:
                long j = ((th7) obj).a;
                return new de0((int) (j >> 32), (int) (j & 4294967295L));
        }
    }
}
