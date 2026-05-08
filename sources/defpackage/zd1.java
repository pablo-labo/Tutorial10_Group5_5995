package defpackage;

import com.rivereactnative.RiveReactNativeModule;
import com.rivereactnative.j;
import defpackage.lx5;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zd1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ zd1(String str, int i) {
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
                o5e.g(s5eVar, 1);
                o5e.h(s5eVar, str);
                return j6g.a;
            case 1:
                lx5.b bVar = (lx5.b) obj;
                w40.l(bVar, "subTabName", "Interview", "interviewId", str);
                bVar.a("myjobsPageTk", ie7.Z);
                return j6g.a;
            case 2:
                return RiveReactNativeModule.getBooleanState$lambda$0(str, (j) obj);
            default:
                lx5.b bVar2 = (lx5.b) obj;
                bVar2.getClass();
                bVar2.a("fromScreenName", str);
                return j6g.a;
        }
    }
}
