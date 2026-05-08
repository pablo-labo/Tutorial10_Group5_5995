package defpackage;

import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class cwh {
    public static final Pattern c = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    public final n20 a;
    public final Executor b;

    public cwh(String str, n20 n20Var, Executor executor) {
        this.a = n20Var;
        this.b = executor;
        Matcher matcher = c.matcher(str);
        if (matcher.matches()) {
            matcher.group(1);
        }
    }
}
