package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.indeed.android.jobsearch.LaunchActivity;
import com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource;
import com.swmansion.rnscreens.a;
import defpackage.ag;
import defpackage.gs2;
import defpackage.oq7;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ju implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ ju(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((m74) obj).getClass();
                return new bv();
            case 1:
                ((Boolean) obj).booleanValue();
                return j6g.a;
            case 2:
                ((m74) obj).getClass();
                return new gs2.d();
            case 3:
                return Boolean.valueOf(ConversationsRemoteDataSource.moveConversationToFolder$lambda$6((ag.c) obj));
            case 4:
                s5e s5eVar = (s5e) obj;
                s5eVar.getClass();
                o5e.c(s5eVar);
                return j6g.a;
            case 5:
                ((mif) obj).getClass();
                return j6g.a;
            case 6:
                int iIntValue = ((Integer) obj).intValue();
                int i = LaunchActivity.e1;
                zk8.a(iIntValue);
                return j6g.a;
            case 7:
                return j6g.a;
            case 8:
                wj8 wj8Var = (wj8) obj;
                wj8Var.getClass();
                StringBuilder sb = new StringBuilder();
                String str = wj8Var.b;
                if (str == null) {
                    str = "";
                }
                sb.append(str);
                String str2 = wj8Var.d;
                if (str2 != null) {
                    sb.append(" (" + str2 + ")");
                }
                return sb.toString();
            case DatadogLogGenerator.CRASH /* 9 */:
                sqd sqdVar = (sqd) obj;
                sqdVar.getClass();
                return Boolean.valueOf(sqdVar.l().getActivityState() == a.EnumC0194a.a);
            case 10:
                return Integer.valueOf(((Integer) obj).intValue() / 2);
            case 11:
                return new p4e(((Long) obj).longValue());
            case 12:
                ((oq7.g) obj).getClass();
                return j6g.a;
            case 13:
                dgf dgfVar = (dgf) obj;
                Integer numA = dgfVar.a();
                if (numA == null) {
                    return null;
                }
                int iIntValue2 = numA.intValue();
                long j = dgfVar.f;
                int i2 = kjf.c;
                return new tx3(0, iIntValue2 - ((int) (j & 4294967295L)));
            default:
                return new ce0(((Integer) obj).intValue());
        }
    }
}
