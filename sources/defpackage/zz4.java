package defpackage;

import com.indeed.android.jobsearch.fcm.NotificationNextActionReceiver;
import defpackage.lx5;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zz4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ zz4(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
                lx5.b bVar = (lx5.b) obj;
                w40.l(bVar, "subTabName", "Interview", "interviewId", str);
                bVar.a("myjobsPageTk", ie7.Z);
                break;
            case 1:
                lx5.b bVar2 = (lx5.b) obj;
                bVar2.getClass();
                if (str == null) {
                    str = "null";
                }
                bVar2.a("confirmUrl", str);
                break;
            case 2:
                lx5.b bVar3 = (lx5.b) obj;
                int i2 = NotificationNextActionReceiver.c;
                bVar3.getClass();
                if (str != null) {
                    bVar3.a("entityId", str);
                }
                break;
            default:
                s5e s5eVar = (s5e) obj;
                s5eVar.getClass();
                o5e.f(s5eVar, str);
                break;
        }
        return j6g.a;
    }
}
