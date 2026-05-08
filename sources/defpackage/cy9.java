package defpackage;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class cy9 {
    public static final Map<String, Integer> a = lc9.a0(new Pair("host.exp.exponent.experience.splashscreen.legacy.SplashScreenPackage", 11), new Pair("expo.modules.updates.UpdatesPackage", 10));

    public static int a(String str) {
        Integer num;
        if (str == null || (num = a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }
}
