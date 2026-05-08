package defpackage;

import com.rivereactnative.RiveReactNativeModule;
import com.rivereactnative.j;
import defpackage.lx5;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nz4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ nz4(String str, String str2, int i) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        String str = this.c;
        String str2 = this.b;
        switch (i) {
            case 0:
                lx5.b bVar = (lx5.b) obj;
                bVar.getClass();
                bVar.a("subTabName", "Invitations");
                if (str2 != null) {
                    bVar.a("entityId", str2);
                }
                if (str != null) {
                    bVar.a("jobKey", str);
                }
                return j6g.a;
            case 1:
                lx5.b bVar2 = (lx5.b) obj;
                bVar2.getClass();
                bVar2.a("subTabName", str2);
                bVar2.a("myjobsPageTk", ie7.Z);
                bVar2.a("appTk", str);
                return j6g.a;
            case 2:
                bqe bqeVar = (bqe) obj;
                bqeVar.getClass();
                bqeVar.n(0, str2);
                bqeVar.n(1, str);
                return j6g.a;
            default:
                return RiveReactNativeModule.getNumberStateAtPath$lambda$3(str2, str, (j) obj);
        }
    }
}
