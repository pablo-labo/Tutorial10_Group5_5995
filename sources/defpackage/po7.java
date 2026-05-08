package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class po7 extends sbb {

    public static final class a {
        public static final Integer a;

        static {
            Object obj;
            Integer num = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            Integer num2 = obj instanceof Integer ? (Integer) obj : null;
            if (num2 != null && num2.intValue() > 0) {
                num = num2;
            }
            a = num;
        }
    }

    @Override // defpackage.sbb
    public final void a(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        th.getClass();
        th2.getClass();
        Integer num = a.a;
        if (num == null || num.intValue() >= 19) {
            th.addSuppressed(th2);
        } else {
            super.a(th, th2);
        }
    }

    @Override // defpackage.sbb
    public final List<Throwable> b(Throwable th) {
        th.getClass();
        Integer num = a.a;
        if (num != null && num.intValue() < 19) {
            return super.b(th);
        }
        Throwable[] suppressed = th.getSuppressed();
        suppressed.getClass();
        List<Throwable> listAsList = Arrays.asList(suppressed);
        listAsList.getClass();
        return listAsList;
    }
}
