package defpackage;

import expo.modules.haptics.arguments.HapticsInvalidArgumentException;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class bg6 {
    public static final Map<String, dg6> a = lc9.a0(new Pair("success", new dg6(new long[]{0, 40, 100, 40}, new int[]{0, 50, 0, 60}, new long[]{0, 40, 100, 40})), new Pair("warning", new dg6(new long[]{0, 40, 120, 60}, new int[]{0, 40, 0, 60}, new long[]{0, 40, 120, 60})), new Pair("error", new dg6(new long[]{0, 60, 100, 40, 80, 50}, new int[]{0, 50, 0, 40, 0, 50}, new long[]{0, 60, 100, 40, 80, 50})));

    public static dg6 a(String str) throws HapticsInvalidArgumentException {
        str.getClass();
        dg6 dg6Var = a.get(str);
        if (dg6Var != null) {
            return dg6Var;
        }
        throw new HapticsInvalidArgumentException(l5.m("'type' must be one of ['success', 'warning', 'error']. Obtained '", str, "'."));
    }
}
