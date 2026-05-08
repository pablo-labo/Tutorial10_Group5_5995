package defpackage;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
public final class kc8 {
    public static final mq5 a;
    public static final n8a b;
    public static final mq5 c;
    public static final mq5 d;
    public static final mq5 e;
    public static final mq5 f;
    public static final mq5 g;
    public static final mq5 h;
    public static final mq5 i;
    public static final mq5 j;
    public static final mq5 k;
    public static final mq5 l;
    public static final mq5 m;
    public static final mq5 n;
    public static final mq5 o;
    public static final mq5 p;
    public static final mq5 q;

    static {
        mq5 mq5Var = new mq5("kotlin.Metadata");
        a = mq5Var;
        xc8.b(mq5Var).d();
        b = n8a.h("value");
        c = new mq5(Target.class.getName());
        new mq5(ElementType.class.getName());
        d = new mq5(Retention.class.getName());
        new mq5(RetentionPolicy.class.getName());
        e = new mq5(Deprecated.class.getName());
        f = new mq5(Documented.class.getName());
        g = new mq5("java.lang.annotation.Repeatable");
        new mq5(Override.class.getName());
        h = new mq5("org.jetbrains.annotations.NotNull");
        i = new mq5("org.jetbrains.annotations.Nullable");
        j = new mq5("org.jetbrains.annotations.Mutable");
        k = new mq5("org.jetbrains.annotations.ReadOnly");
        l = new mq5("kotlin.annotations.jvm.ReadOnly");
        m = new mq5("kotlin.annotations.jvm.Mutable");
        n = new mq5("kotlin.jvm.PurelyImplements");
        new mq5("kotlin.jvm.internal");
        mq5 mq5Var2 = new mq5("kotlin.jvm.internal.SerializedIr");
        o = mq5Var2;
        xc8.b(mq5Var2).d();
        p = new mq5("kotlin.jvm.internal.EnhancedNullability");
        q = new mq5("kotlin.jvm.internal.EnhancedMutability");
    }
}
