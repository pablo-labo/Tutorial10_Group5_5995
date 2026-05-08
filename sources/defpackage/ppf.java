package defpackage;

import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public interface ppf extends Closeable {

    public interface a {
        a a(eoe eoeVar);

        doe start();
    }

    doe activeSpan();

    a buildSpan(String str);

    <C> eoe extract(np5<C> np5Var, C c);

    <C> void inject(eoe eoeVar, np5<C> np5Var, C c);
}
