package defpackage;

import com.indeed.android.jobsearch.JobSearchApplication;
import defpackage.lx5;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mk3 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ mk3(String str, String str2, String str3, int i) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        String str = this.d;
        String str2 = this.c;
        String str3 = this.b;
        switch (i) {
            case 0:
                y3b y3bVar = (y3b) obj;
                y3bVar.getClass();
                y3bVar.b("ctk", str3);
                JobSearchApplication jobSearchApplication = JobSearchApplication.X;
                String strA = JobSearchApplication.a.a();
                if (strA == null) {
                    strA = "";
                }
                y3bVar.b("deviceId", strA);
                y3bVar.b("keyword", str2);
                y3bVar.b("location", str);
                break;
            default:
                lx5.b bVar = (lx5.b) obj;
                w40.l(bVar, "subTabName", str3, "userJobStatus", str2);
                bVar.a("myjobsPageTk", ie7.Z);
                bVar.a("appTk", str);
                break;
        }
        return j6g.a;
    }
}
