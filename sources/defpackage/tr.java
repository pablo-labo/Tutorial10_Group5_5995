package defpackage;

import android.net.Uri;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.util.AppStartupTimes;
import defpackage.ph8;
import defpackage.yn4;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tr implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ tr(iu2 iu2Var) {
        this.a = 3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws IllegalAccessException, InvocationTargetException {
        switch (this.a) {
            case 0:
                ((m74) obj).getClass();
                return new xs();
            case 1:
                y3b y3bVar = (y3b) obj;
                ConcurrentHashMap<String, Long> concurrentHashMap = AppStartupTimes.V;
                y3bVar.getClass();
                if (AppStartupTimes.c == 0) {
                    y3bVar.b("error_type", "start_time_zero");
                    return j6g.a;
                }
                if (!concurrentHashMap.isEmpty()) {
                    Iterator<Map.Entry<String, Long>> it = concurrentHashMap.entrySet().iterator();
                    while (it.hasNext()) {
                        if (it.next().getValue().longValue() < AppStartupTimes.c) {
                            y3bVar.b("error_type", "earlier_than_start_time");
                            return j6g.a;
                        }
                    }
                }
                y3bVar.a(AppStartupTimes.c, "start_time");
                for (Map.Entry<String, Long> entry : concurrentHashMap.entrySet()) {
                    y3bVar.a(entry.getValue().longValue() - AppStartupTimes.c, entry.getKey());
                }
                return j6g.a;
            case 2:
                ((Object[]) obj).getClass();
                return j6g.a;
            case 3:
                j62 j62Var = (j62) obj;
                j62Var.getClass();
                p09 p09Var = p09.a;
                anb anbVar = p09.b;
                zr4 zr4Var = zr4.a;
                zr4 zr4Var2 = anbVar != null ? zr4Var : null;
                if (zr4Var2 != null) {
                    zr4Var = zr4Var2;
                }
                j62Var.b = zr4Var;
                return j6g.a;
            case 4:
                ((hc8) obj).getClass();
                return j6g.a;
            case 5:
                ((m74) obj).getClass();
                return new yn4.c();
            case 6:
                o5e.i((s5e) obj, 0);
                return j6g.a;
            case 7:
                ((String) obj).getClass();
                return j6g.a;
            case 8:
                File file = (File) obj;
                file.getClass();
                return new cv7(Uri.fromFile(file));
            case DatadogLogGenerator.CRASH /* 9 */:
                ((Integer) obj).getClass();
                return null;
            case 10:
                hr7 hr7Var = (hr7) obj;
                hr7Var.getClass();
                hr7Var.a("fromScreenName", "messagingConversation");
                return j6g.a;
            case 11:
                f3b f3bVar = (f3b) obj;
                StringBuilder sb = new StringBuilder("[");
                sb.append(f3bVar.b);
                sb.append(", ");
                return k6.h(sb, f3bVar.c, ')');
            case 12:
                s5e s5eVar = (s5e) obj;
                s5eVar.getClass();
                qf8<Object>[] qf8VarArr = o5e.a;
                r5e<j6g> r5eVar = k5e.o;
                j6g j6gVar = j6g.a;
                s5eVar.a(r5eVar, j6gVar);
                return j6gVar;
            case 13:
                ph8.b bVar = (ph8.b) obj;
                bVar.a = 1800;
                bVar.a(Float.valueOf(0.0f), 0).b = c3c.a;
                bVar.a(Float.valueOf(1.0f), 750);
                return j6g.a;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                s5e s5eVar2 = (s5e) obj;
                s5eVar2.getClass();
                o5e.c(s5eVar2);
                return j6g.a;
            case 15:
                obj.getClass();
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                while (i < size) {
                    Object obj2 = list.get(i);
                    a19 a19Var = (wl7.b(obj2, Boolean.FALSE) || obj2 == null) ? null : (a19) ((Function1) wld.t.b).invoke(obj2);
                    a19Var.getClass();
                    arrayList.add(a19Var);
                    i++;
                }
                return new b19(arrayList);
            case 16:
                return Boolean.valueOf((((yeb) obj).i == 2 ? 1 : 0) ^ 1);
            case 17:
                yd8 yd8Var = (yd8) obj;
                yd8Var.getClass();
                KSerializer kSerializerO = awd.o(yd8Var);
                if (kSerializerO == null) {
                    kSerializerO = jh2.p(yd8Var).isInterface() ? new mfb(yd8Var) : null;
                }
                if (kSerializerO != null) {
                    return qp1.b(kSerializerO);
                }
                return null;
            case 18:
                return j6g.a;
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                y98 y98Var = (y98) obj;
                y98Var.getClass();
                y98Var.b = true;
                return j6g.a;
            default:
                long j = ((lh7) obj).a;
                return new de0((int) (j >> 32), (int) (j & 4294967295L));
        }
    }

    public /* synthetic */ tr(int i) {
        this.a = i;
    }
}
