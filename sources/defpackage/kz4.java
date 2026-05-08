package defpackage;

import defpackage.lx5;
import java.io.Serializable;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kz4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Serializable c;
    public final /* synthetic */ Object d;

    public /* synthetic */ kz4(Serializable serializable, Object obj, int i, int i2) {
        this.a = i2;
        this.c = serializable;
        this.d = obj;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.b;
        Object obj2 = this.d;
        Serializable serializable = this.c;
        switch (i) {
            case 0:
                lx5.b bVar = (lx5.b) obj;
                w40.l(bVar, "subTabName", "Applied", "jobKey", (String) serializable);
                bVar.a("nexusWorkflowResumeUrl", (String) obj2);
                bVar.b("minutesRemaining", Long.valueOf(i2));
                break;
            default:
                y3b y3bVar = (y3b) obj;
                y3bVar.getClass();
                y3bVar.b("exception", ((Exception) serializable).toString());
                y3bVar.b("app_widget_type", "relevant_jobs");
                y3bVar.a(((czc) obj2).b.size(), "items_list_length");
                y3bVar.b("position_on_demand", String.valueOf(i2));
                break;
        }
        return j6g.a;
    }
}
