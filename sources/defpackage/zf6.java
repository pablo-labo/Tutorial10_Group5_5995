package defpackage;

import expo.modules.haptics.arguments.HapticsInvalidArgumentException;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class zf6 {
    public static final Map<String, dg6> a = lc9.a0(new Pair("light", new dg6(new long[]{0, 50}, new int[]{0, 30}, new long[]{0, 20})), new Pair("soft", new dg6(new long[]{0, 50}, new int[]{0, 30}, new long[]{0, 20})), new Pair("medium", new dg6(new long[]{0, 43}, new int[]{0, 50}, new long[]{0, 43})), new Pair("rigid", new dg6(new long[]{0, 43}, new int[]{0, 50}, new long[]{0, 43})), new Pair("heavy", new dg6(new long[]{0, 60}, new int[]{0, 70}, new long[]{0, 61})));

    public static dg6 a(String str) throws HapticsInvalidArgumentException {
        str.getClass();
        dg6 dg6Var = a.get(str);
        if (dg6Var != null) {
            return dg6Var;
        }
        throw new HapticsInvalidArgumentException(l5.m("'style' must be one of ['light', 'medium', 'heavy', 'rigid', 'soft']. Obtained ", str, "'."));
    }
}
