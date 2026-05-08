package defpackage;

import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.eg4;
import defpackage.le0;
import defpackage.oq7;
import defpackage.v03;
import defpackage.vb;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wa implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ wa(ky3 ky3Var) {
        this.a = 14;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = 0;
        switch (this.a) {
            case 0:
                ((m74) obj).getClass();
                return new vb.b();
            case 1:
                ((m74) obj).getClass();
                return new kw();
            case 2:
                ((m74) obj).getClass();
                return new fz(i);
            case 3:
                return Boolean.valueOf(!(((le0.a) obj) instanceof l3b));
            case 4:
                return j6g.a;
            case 5:
                v03.a aVar = (v03.a) obj;
                if (aVar instanceof y03) {
                    return (y03) aVar;
                }
                return null;
            case 6:
                ((m74) obj).getClass();
                return new eg4.c();
            case 7:
                e6g e6gVar = (e6g) obj;
                e6gVar.getClass();
                return Boolean.valueOf(e6gVar.isFile());
            case 8:
                s5e s5eVar = (s5e) obj;
                s5eVar.getClass();
                o5e.c(s5eVar);
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                ((oq7.i) obj).getClass();
                return j6g.a;
            case 10:
                s5e s5eVar2 = (s5e) obj;
                s5eVar2.getClass();
                qf8<Object>[] qf8VarArr = o5e.a;
                r5e<j6g> r5eVar = k5e.o;
                j6g j6gVar = j6g.a;
                s5eVar2.a(r5eVar, j6gVar);
                return j6gVar;
            case 11:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                String str = (String) entry.getKey();
                JsonElement jsonElement = (JsonElement) entry.getValue();
                StringBuilder sb = new StringBuilder();
                jve.a(sb, str);
                sb.append(':');
                sb.append(jsonElement);
                return sb.toString();
            case 12:
                ((mq7) obj).getClass();
                return j6g.a;
            case 13:
                ((wf7) obj).getClass();
                return j6g.a;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                po5 po5Var = (po5) obj;
                return "'" + po5Var.b() + "' " + po5Var.a();
            case 15:
                s5e s5eVar3 = (s5e) obj;
                s5eVar3.getClass();
                o5e.i(s5eVar3, 0);
                return j6g.a;
            case 16:
                ((xmc) obj).getClass();
                return null;
            case 17:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                Integer num = obj2 != null ? (Integer) obj2 : null;
                num.getClass();
                int iIntValue = num.intValue();
                Object obj3 = list.get(1);
                Integer num2 = obj3 != null ? (Integer) obj3 : null;
                num2.getClass();
                return new kjf(cr8.c(iIntValue, num2.intValue()));
            case 18:
                obj.getClass();
                List list2 = (List) obj;
                Object obj4 = list2.get(0);
                Boolean bool = obj4 != null ? (Boolean) obj4 : null;
                bool.getClass();
                boolean zBooleanValue = bool.booleanValue();
                Object obj5 = list2.get(1);
                (obj5 != null ? (vq4) obj5 : null).getClass();
                return new acb(0, zBooleanValue);
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                return Integer.valueOf((int) ((ce0) obj).a);
            default:
                ((String) obj).getClass();
                return j6g.a;
        }
    }

    public /* synthetic */ wa(int i) {
        this.a = i;
    }
}
