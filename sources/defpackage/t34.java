package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class t34 {
    public static final /* synthetic */ int a = 0;

    public static final class a {
        public static final Object a(Object obj, String str, Object... objArr) {
            Class<?> cls = obj.getClass();
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            return cls.getMethod(str, null).invoke(obj, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        }
    }
}
