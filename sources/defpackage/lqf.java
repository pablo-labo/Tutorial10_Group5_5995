package defpackage;

import defpackage.lla;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class lqf extends lla.a {
    public final /* synthetic */ mqf a;

    public lqf(mqf mqfVar) {
        this.a = mqfVar;
    }

    @Override // lla.a
    public final void a(HashMap map) {
        mqf mqfVar = this.a;
        if (mqfVar.v) {
            Object obj = map.get("event");
            drd drdVar = obj instanceof drd ? (drd) obj : null;
            if (drdVar != null) {
                cse cseVarB = mqfVar.d.i.b("ScreenContext");
                yqd yqdVar = cseVarB instanceof yqd ? (yqd) cseVarB : null;
                if (yqdVar == null) {
                    mqfVar.c(drdVar);
                    return;
                }
                String str = drdVar.i;
                if (str == null || str.length() == 0 || !wl7.b(drdVar.i, yqdVar.d) || !wl7.b(drdVar.j, yqdVar.e)) {
                    mqfVar.c(drdVar);
                }
            }
        }
    }
}
