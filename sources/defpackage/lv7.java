package defpackage;

import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class lv7 {
    public static final mq5 a;
    public static final mq5[] b;
    public static final up1 c;
    public static final mv7 d;

    static {
        mq5 mq5Var = new mq5("org.jspecify.nullness");
        mq5 mq5Var2 = new mq5("org.jspecify.annotations");
        a = mq5Var2;
        mq5 mq5Var3 = new mq5("io.reactivex.rxjava3.annotations");
        mq5 mq5Var4 = new mq5("org.checkerframework.checker.nullness.compatqual");
        String str = mq5Var3.a.a;
        b = new mq5[]{new mq5(t40.k(str, ".Nullable")), new mq5(t40.k(str, ".NonNull"))};
        mq5 mq5Var5 = new mq5("org.jetbrains.annotations");
        mv7 mv7Var = mv7.d;
        Pair pair = new Pair(mq5Var5, mv7Var);
        Pair pair2 = new Pair(new mq5("androidx.annotation"), mv7Var);
        Pair pair3 = new Pair(new mq5("android.support.annotation"), mv7Var);
        Pair pair4 = new Pair(new mq5("android.annotation"), mv7Var);
        Pair pair5 = new Pair(new mq5("com.android.annotations"), mv7Var);
        Pair pair6 = new Pair(new mq5("org.eclipse.jdt.annotation"), mv7Var);
        Pair pair7 = new Pair(new mq5("org.checkerframework.checker.nullness.qual"), mv7Var);
        Pair pair8 = new Pair(mq5Var4, mv7Var);
        Pair pair9 = new Pair(new mq5("javax.annotation"), mv7Var);
        Pair pair10 = new Pair(new mq5("edu.umd.cs.findbugs.annotations"), mv7Var);
        Pair pair11 = new Pair(new mq5("io.reactivex.annotations"), mv7Var);
        mq5 mq5Var6 = new mq5("androidx.annotation.RecentlyNullable");
        v2d v2dVar = v2d.WARN;
        Pair pair12 = new Pair(mq5Var6, new mv7(v2dVar, 4));
        Pair pair13 = new Pair(new mq5("androidx.annotation.RecentlyNonNull"), new mv7(v2dVar, 4));
        Pair pair14 = new Pair(new mq5("lombok"), mv7Var);
        cj8 cj8Var = new cj8(2, 1, 0);
        v2d v2dVar2 = v2d.STRICT;
        c = new up1(lc9.a0(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, new Pair(mq5Var, new mv7(v2dVar, cj8Var, v2dVar2)), new Pair(mq5Var2, new mv7(v2dVar, new cj8(2, 1, 0), v2dVar2)), new Pair(mq5Var3, new mv7(v2dVar, new cj8(1, 8, 0), v2dVar2))));
        d = new mv7(v2dVar, 4);
    }
}
