package defpackage;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class oic implements sjd, onb {
    public volatile Map<String, pic> a;

    public oic(Double d) {
        double dDoubleValue = d.doubleValue();
        this.a = Collections.singletonMap("service:,env:", new h24((dDoubleValue < 0.0d || dDoubleValue > 1.0d) ? 1.0d : dDoubleValue));
    }

    @Override // defpackage.sjd
    public final boolean a(rc3 rc3Var) {
        return true;
    }

    @Override // defpackage.onb
    public final void b(rc3 rc3Var) {
        String strL = t40.l("service:", rc3Var.b.h, ",env:", rc3Var.l().get("env") == null ? "" : String.valueOf(rc3Var.l().get("env")));
        Map<String, pic> map = this.a;
        pic picVar = this.a.get(strL);
        if (picVar == null) {
            picVar = map.get("service:,env:");
        }
        boolean zA = picVar.a(rc3Var);
        sc3 sc3Var = rc3Var.b;
        if (zA ? sc3Var.f(1) : sc3Var.f(0)) {
            rc3Var.b.e(Double.valueOf(picVar.getSampleRate()), "_dd.agent_psr");
        }
    }
}
