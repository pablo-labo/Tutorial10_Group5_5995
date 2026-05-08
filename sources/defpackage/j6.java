package defpackage;

import defpackage.dye;
import defpackage.e47;
import defpackage.e75;
import defpackage.lz8;
import java.util.Map;
import kotlin.Pair;
import org.apache.avro.g;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j6 implements lz8.a, e75.b, ru5, cjb, p55 {
    public final /* synthetic */ int a;

    public static Map c(String str, String str2) {
        return kc9.W(new Pair(str, str2));
    }

    public static g d(String str) {
        return new g.p().b(str);
    }

    public static /* synthetic */ void f(Object obj, String str) {
        throw new RuntimeException(str + obj);
    }

    public static /* synthetic */ void g(String str, double d) {
        throw new IllegalArgumentException(str + d);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x039c  */
    @Override // defpackage.ru5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object apply(java.lang.Object r46) {
        /*
            Method dump skipped, instruction units count: 1052
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j6.apply(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.p55
    public m55[] h() {
        qmf qmfVar = new qmf(0L);
        e47.b bVar = e47.b;
        return new m55[]{new uuf(1, 1, dye.a.a, qmfVar, new lr3(0, qyc.e))};
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        ((v20) obj).getClass();
    }

    @Override // defpackage.wg3
    public Object j(Object obj, ka6 ka6Var) {
        switch (this.a) {
            case 5:
                return Float.valueOf(ka6Var.W0());
            default:
                return Float.valueOf(ka6Var.T0());
        }
    }

    public /* synthetic */ j6(int i) {
        this.a = i;
    }

    @Override // defpackage.cjb
    /* JADX INFO: renamed from: apply, reason: collision with other method in class */
    public boolean mo35apply(Object obj) {
        ((ot1) obj).getClass();
        return true;
    }
}
