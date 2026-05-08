package defpackage;

import defpackage.a62;

/* JADX INFO: loaded from: classes3.dex */
public final class jc8 {
    public static final mq5 a;
    public static final a62 b;

    static {
        mq5 mq5Var = new mq5("kotlin.jvm.JvmField");
        a = mq5Var;
        a62.a.b(mq5Var);
        a62.a.b(new mq5("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        b = a62.a.a("kotlin/jvm/internal/RepeatableContainer", false);
    }

    public static final String a(String str) {
        str.getClass();
        return b(str) ? str : "get".concat(ie7.h(str));
    }

    public static final boolean b(String str) {
        str.getClass();
        if (wve.K(str, "is", false) && str.length() != 2) {
            char cCharAt = str.charAt(2);
            if (wl7.c(97, cCharAt) > 0 || wl7.c(cCharAt, 122) > 0) {
                return true;
            }
        }
        return false;
    }
}
