package defpackage;

import defpackage.ere;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class lc8 {
    public static final mq5 a;
    public static final mq5 b;
    public static final mq5 c;
    public static final mq5 d;
    public static final mq5 e;
    public static final mq5 f;
    public static final mq5 g;
    public static final mq5 h;
    public static final mq5 i;
    public static final Set<mq5> j;
    public static final Set<mq5> k;
    public static final Set<mq5> l;
    public static final Set<mq5> m;
    public static final Set<mq5> n;
    public static final Set<mq5> o;
    public static final Map<mq5, mq5> p;
    public static final mq5 q;

    static {
        mq5 mq5Var = new mq5("org.jspecify.nullness.Nullable");
        mq5 mq5Var2 = new mq5("org.jspecify.nullness.NullMarked");
        a = mq5Var2;
        mq5 mq5Var3 = new mq5("org.jspecify.nullness.NullnessUnspecified");
        mq5 mq5Var4 = new mq5("org.jspecify.annotations.NonNull");
        mq5 mq5Var5 = new mq5("org.jspecify.annotations.Nullable");
        mq5 mq5Var6 = new mq5("org.jspecify.annotations.NullMarked");
        b = mq5Var6;
        mq5 mq5Var7 = new mq5("org.jspecify.annotations.NullnessUnspecified");
        mq5 mq5Var8 = new mq5("org.jspecify.annotations.NullUnmarked");
        c = mq5Var8;
        d = new mq5("javax.annotation.meta.TypeQualifier");
        e = new mq5("javax.annotation.meta.TypeQualifierNickname");
        f = new mq5("javax.annotation.meta.TypeQualifierDefault");
        mq5 mq5Var9 = new mq5("javax.annotation.Nonnull");
        g = mq5Var9;
        mq5 mq5Var10 = new mq5("javax.annotation.Nullable");
        mq5 mq5Var11 = new mq5("javax.annotation.CheckForNull");
        h = new mq5("javax.annotation.ParametersAreNonnullByDefault");
        i = new mq5("javax.annotation.ParametersAreNullableByDefault");
        j = ut0.I0(new mq5[]{mq5Var9, mq5Var11});
        Set<mq5> setI0 = ut0.I0(new mq5[]{kc8.h, mq5Var4, new mq5("android.annotation.NonNull"), new mq5("androidx.annotation.NonNull"), new mq5("androidx.annotation.RecentlyNonNull"), new mq5("android.support.annotation.NonNull"), new mq5("com.android.annotations.NonNull"), new mq5("org.checkerframework.checker.nullness.compatqual.NonNullDecl"), new mq5("org.checkerframework.checker.nullness.qual.NonNull"), new mq5("edu.umd.cs.findbugs.annotations.NonNull"), new mq5("io.reactivex.annotations.NonNull"), new mq5("io.reactivex.rxjava3.annotations.NonNull"), new mq5("org.eclipse.jdt.annotation.NonNull"), new mq5("lombok.NonNull")});
        k = setI0;
        Set<mq5> setI02 = ut0.I0(new mq5[]{kc8.i, mq5Var, mq5Var5, mq5Var10, mq5Var11, new mq5("android.annotation.Nullable"), new mq5("androidx.annotation.Nullable"), new mq5("androidx.annotation.RecentlyNullable"), new mq5("android.support.annotation.Nullable"), new mq5("com.android.annotations.Nullable"), new mq5("org.checkerframework.checker.nullness.compatqual.NullableDecl"), new mq5("org.checkerframework.checker.nullness.qual.Nullable"), new mq5("edu.umd.cs.findbugs.annotations.Nullable"), new mq5("edu.umd.cs.findbugs.annotations.PossiblyNull"), new mq5("edu.umd.cs.findbugs.annotations.CheckForNull"), new mq5("io.reactivex.annotations.Nullable"), new mq5("io.reactivex.rxjava3.annotations.Nullable"), new mq5("org.eclipse.jdt.annotation.Nullable")});
        l = setI02;
        m = ut0.I0(new mq5[]{mq5Var3, mq5Var7});
        bbe.p(bbe.p(bbe.p(bbe.p(bbe.o(bbe.o(new LinkedHashSet(), setI0), setI02), mq5Var9), mq5Var2), mq5Var6), mq5Var8);
        n = ut0.I0(new mq5[]{kc8.k, kc8.l});
        o = ut0.I0(new mq5[]{kc8.j, kc8.m});
        p = lc9.a0(new Pair(kc8.c, ere.a.t), new Pair(kc8.d, ere.a.w), new Pair(kc8.e, ere.a.m), new Pair(kc8.f, ere.a.x));
        q = new mq5("kotlin.annotations.jvm.UnderMigration");
    }
}
