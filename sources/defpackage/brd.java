package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class brd implements nse {
    @Override // defpackage.nse
    public final String a() {
        return "ScreenSummaryContext";
    }

    @Override // defpackage.nse
    public final List<String> b() {
        return u63.a0("iglu:com.snowplowanalytics.mobile/list_item_view/jsonschema/1-0-0", "iglu:com.snowplowanalytics.mobile/screen_end/jsonschema/1-0-0", "iglu:com.snowplowanalytics.mobile/scroll_changed/jsonschema/1-0-0");
    }

    @Override // defpackage.nse
    public final List c(qqf qqfVar, cse cseVar) {
        ard ardVar = (ard) cseVar;
        if (ardVar == null) {
            return null;
        }
        LinkedHashMap linkedHashMapB0 = lc9.b0(new Pair("foreground_sec", Double.valueOf(ardVar.b / 1000.0d)), new Pair("background_sec", Double.valueOf(ardVar.c / 1000.0d)));
        Integer num = ardVar.d;
        if (num != null) {
            linkedHashMapB0.put("last_item_index", Integer.valueOf(num.intValue()));
        }
        return u63.Z(new t4e(linkedHashMapB0, "iglu:com.snowplowanalytics.mobile/screen_summary/jsonschema/1-0-0"));
    }

    @Override // defpackage.nse
    public final List<rx4> d(rx4 rx4Var) {
        return u63.Z(new lqd());
    }

    @Override // defpackage.nse
    public final List<String> e() {
        return u63.a0("iglu:com.snowplowanalytics.mobile/screen_view/jsonschema/1-0-0", "iglu:com.snowplowanalytics.mobile/screen_end/jsonschema/1-0-0", "iglu:com.snowplowanalytics.snowplow/application_foreground/jsonschema/1-0-0", "iglu:com.snowplowanalytics.snowplow/application_background/jsonschema/1-0-0", "iglu:com.snowplowanalytics.mobile/list_item_view/jsonschema/1-0-0", "iglu:com.snowplowanalytics.mobile/scroll_changed/jsonschema/1-0-0");
    }

    @Override // defpackage.nse
    public final List<String> f() {
        return u63.Z("iglu:com.snowplowanalytics.mobile/screen_view/jsonschema/1-0-0");
    }

    @Override // defpackage.nse
    public final List<String> g() {
        return u63.a0("iglu:com.snowplowanalytics.mobile/screen_end/jsonschema/1-0-0", "iglu:com.snowplowanalytics.snowplow/application_foreground/jsonschema/1-0-0", "iglu:com.snowplowanalytics.snowplow/application_background/jsonschema/1-0-0");
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
        if (rx4Var instanceof drd) {
            return new ard();
        }
        ard ardVar = (ard) cseVar;
        if (ardVar == null) {
            return null;
        }
        if (rx4Var instanceof gp5) {
            long jLongValue = ((Number) ard.e.invoke()).longValue();
            ardVar.c = (jLongValue - ardVar.a) + ardVar.c;
            ardVar.a = jLongValue;
            return cseVar;
        }
        if (rx4Var instanceof m71) {
            long jLongValue2 = ((Number) ard.e.invoke()).longValue();
            ardVar.b = (jLongValue2 - ardVar.a) + ardVar.b;
            ardVar.a = jLongValue2;
            return cseVar;
        }
        if (rx4Var instanceof lqd) {
            long jLongValue3 = ((Number) ard.e.invoke()).longValue();
            ardVar.b = (jLongValue3 - ardVar.a) + ardVar.b;
            ardVar.a = jLongValue3;
            return cseVar;
        }
        if (rx4Var instanceof yy8) {
            Integer num = ardVar.d;
            ardVar.d = Integer.valueOf(Integer.max(0, num != null ? num.intValue() : 0));
        }
        return cseVar;
    }

    @Override // defpackage.nse
    public final void k(qqf qqfVar) {
    }

    @Override // defpackage.nse
    public final Boolean l(qqf qqfVar, cse cseVar) {
        if (wl7.b(qqfVar.a, "iglu:com.snowplowanalytics.mobile/screen_end/jsonschema/1-0-0")) {
            return Boolean.valueOf(cseVar != null);
        }
        return Boolean.FALSE;
    }
}
