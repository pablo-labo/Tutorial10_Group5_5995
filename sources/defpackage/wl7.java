package defpackage;

import java.util.Arrays;
import kotlin.UninitializedPropertyAccessException;

/* JADX INFO: loaded from: classes3.dex */
public final class wl7 {

    public static class a {
    }

    public static boolean a(float f, Float f2) {
        return f2 != null && f2.floatValue() == f;
    }

    public static boolean b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static int c(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static int d(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public static void e(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static String f(Object obj, String str) {
        return str + obj;
    }

    public static void g(String str) {
        UninitializedPropertyAccessException uninitializedPropertyAccessException = new UninitializedPropertyAccessException(l5.m("lateinit property ", str, " has not been initialized"));
        e(uninitializedPropertyAccessException, wl7.class.getName());
        throw uninitializedPropertyAccessException;
    }
}
