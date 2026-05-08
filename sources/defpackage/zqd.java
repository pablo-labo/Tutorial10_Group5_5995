package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zqd implements nse {
    @Override // defpackage.nse
    public final String a() {
        return "ScreenContext";
    }

    @Override // defpackage.nse
    public final List<String> b() {
        return zr4.a;
    }

    @Override // defpackage.nse
    public final List c(qqf qqfVar, cse cseVar) {
        t4e t4eVar;
        if (cseVar == null) {
            return new ArrayList();
        }
        yqd yqdVar = cseVar instanceof yqd ? (yqd) cseVar : null;
        if (yqdVar != null) {
            rqf rqfVar = new rqf();
            rqfVar.c("id", yqdVar.c);
            rqfVar.c("name", yqdVar.a);
            rqfVar.c("type", yqdVar.b);
            rqfVar.c("fragment", null);
            String str = yqdVar.d;
            String str2 = yqdVar.e;
            if (str == null || str.length() <= 0) {
                str = (str2 == null || str2.length() <= 0) ? null : str2;
            }
            rqfVar.c("activity", str);
            t4eVar = new t4e(rqfVar);
        } else {
            t4eVar = null;
        }
        if (t4eVar != null) {
            return u63.Z(t4eVar);
        }
        return null;
    }

    @Override // defpackage.nse
    public final List<rx4> d(rx4 rx4Var) {
        return null;
    }

    @Override // defpackage.nse
    public final List<String> e() {
        return u63.Z("iglu:com.snowplowanalytics.mobile/screen_view/jsonschema/1-0-0");
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
        return u63.Z("iglu:com.snowplowanalytics.mobile/screen_view/jsonschema/1-0-0");
    }

    @Override // defpackage.nse
    public final Map i(qqf qqfVar, cse cseVar) {
        if (!(cseVar instanceof yqd)) {
            return null;
        }
        HashMap map = new HashMap();
        yqd yqdVar = ((yqd) cseVar).f;
        String str = yqdVar != null ? yqdVar.a : null;
        if (str != null && str.length() > 0) {
            map.put("previousName", str);
        }
        String str2 = yqdVar != null ? yqdVar.c : null;
        if (str2 != null && str2.length() > 0) {
            map.put("previousId", str2);
        }
        String str3 = yqdVar != null ? yqdVar.b : null;
        if (str3 != null && str3.length() > 0) {
            map.put("previousType", str3);
        }
        return map;
    }

    @Override // defpackage.nse
    public final cse j(rx4 rx4Var, cse cseVar) {
        rx4Var.getClass();
        drd drdVar = rx4Var instanceof drd ? (drd) rx4Var : null;
        if (drdVar == null) {
            return null;
        }
        return new yqd(drdVar.b, drdVar.d, drdVar.c, drdVar.i, drdVar.j, cseVar instanceof yqd ? (yqd) cseVar : null);
    }

    @Override // defpackage.nse
    public final void k(qqf qqfVar) {
    }

    @Override // defpackage.nse
    public final Boolean l(qqf qqfVar, cse cseVar) {
        return null;
    }
}
