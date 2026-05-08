package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import kotlinx.coroutines.android.AndroidDispatcherFactory;
import kotlinx.coroutines.test.internal.TestMainDispatcherFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class m89 {
    public static final k89 a;

    static {
        String property;
        int i = e3f.a;
        Object next = null;
        try {
            property = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null) {
            Boolean.parseBoolean(property);
        }
        try {
            List<? extends l89> listW = a7e.W(v6e.L(Arrays.asList(new AndroidDispatcherFactory(), new TestMainDispatcherFactory()).iterator()));
            Iterator it = listW.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iB = ((l89) next).b();
                    do {
                        Object next2 = it.next();
                        int iB2 = ((l89) next2).b();
                        if (iB < iB2) {
                            next = next2;
                            iB = iB2;
                        }
                    } while (it.hasNext());
                }
            }
            l89 l89Var = (l89) next;
            if (l89Var != null) {
                a = l89Var.a(listW);
            } else {
                r6.g("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
            }
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
