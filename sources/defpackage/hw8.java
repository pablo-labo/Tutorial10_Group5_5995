package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class hw8 implements nse {
    @Override // defpackage.nse
    public final String a() {
        return "Lifecycle";
    }

    @Override // defpackage.nse
    public final List<String> b() {
        return zr4.a;
    }

    @Override // defpackage.nse
    public final List c(qqf qqfVar, cse cseVar) {
        if (cseVar == null) {
            return u63.Z(new sv8(true));
        }
        gw8 gw8Var = cseVar instanceof gw8 ? (gw8) cseVar : null;
        if (gw8Var == null) {
            return null;
        }
        sv8 sv8Var = new sv8(gw8Var.a);
        Integer num = gw8Var.b;
        HashMap<String, Object> map = sv8Var.b;
        if (num != null) {
            map.put("index", Integer.valueOf(num.intValue()));
        }
        sv8Var.a(map);
        return u63.Z(sv8Var);
    }

    @Override // defpackage.nse
    public final List<rx4> d(rx4 rx4Var) {
        return null;
    }

    @Override // defpackage.nse
    public final List<String> e() {
        return u63.a0("iglu:com.snowplowanalytics.snowplow/application_background/jsonschema/1-0-0", "iglu:com.snowplowanalytics.snowplow/application_foreground/jsonschema/1-0-0");
    }

    @Override // defpackage.nse
    public final List<String> f() {
        return zr4.a;
    }

    @Override // defpackage.nse
    public final List<String> g() {
        return u63.Z("*");
    }

    @Override // defpackage.nse
    public final List<String> h() {
        return zr4.a;
    }

    @Override // defpackage.nse
    public final Map i(qqf qqfVar, cse cseVar) {
        return null;
    }

    @Override // defpackage.nse
    public final cse j(rx4 rx4Var, cse cseVar) {
        rx4Var.getClass();
        if (rx4Var instanceof gp5) {
            return new gw8(((gp5) rx4Var).b, true);
        }
        if (rx4Var instanceof m71) {
            return new gw8(((m71) rx4Var).b, false);
        }
        return null;
    }

    @Override // defpackage.nse
    public final void k(qqf qqfVar) {
    }

    @Override // defpackage.nse
    public final Boolean l(qqf qqfVar, cse cseVar) {
        return null;
    }
}
