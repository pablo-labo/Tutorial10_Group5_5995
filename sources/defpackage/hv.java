package defpackage;

import defpackage.lx5;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hv implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ hv(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
                s5e s5eVar = (s5e) obj;
                s5eVar.getClass();
                o5e.f(s5eVar, str);
                break;
            case 1:
                lx5.b bVar = (lx5.b) obj;
                bVar.getClass();
                bVar.a("source", str);
                break;
            case 2:
                lx5.b bVar2 = (lx5.b) obj;
                w40.l(bVar2, "subTabName", "Interview", "interviewId", str);
                bVar2.a("myjobsPageTk", ie7.Z);
                break;
            case 3:
                s5e s5eVar2 = (s5e) obj;
                s5eVar2.getClass();
                o5e.f(s5eVar2, str);
                break;
            default:
                lx5.b bVar3 = (lx5.b) obj;
                bVar3.getClass();
                bVar3.a("fromScreenName", str);
                break;
        }
        return j6g.a;
    }
}
