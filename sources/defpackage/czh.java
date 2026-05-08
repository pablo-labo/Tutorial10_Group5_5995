package defpackage;

import com.google.android.gms.internal.measurement.zzev;
import defpackage.lxh;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class czh<T extends lxh> {
    public static final Logger a = Logger.getLogger(zzev.class.getName());
    public static final String b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    public static lxh a() {
        String strF;
        ClassLoader classLoader = czh.class.getClassLoader();
        if (lxh.class.equals(lxh.class)) {
            strF = b;
        } else {
            if (!lxh.class.getPackage().equals(czh.class.getPackage())) {
                l5.q(lxh.class.getName());
                return null;
            }
            strF = o6.f(lxh.class.getPackage().getName(), ".BlazeGenerated", lxh.class.getSimpleName(), "Loader");
        }
        try {
            try {
                try {
                    try {
                        return (lxh) lxh.class.cast(((czh) Class.forName(strF, true, classLoader).getConstructor(null).newInstance(null)).b());
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException(e);
                    } catch (InstantiationException e2) {
                        throw new IllegalStateException(e2);
                    }
                } catch (NoSuchMethodException e3) {
                    throw new IllegalStateException(e3);
                }
            } catch (InvocationTargetException e4) {
                throw new IllegalStateException(e4);
            }
        } catch (ClassNotFoundException unused) {
            try {
                Iterator it = Arrays.asList(new czh[0]).iterator();
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    try {
                        arrayList.add(lxh.class.cast(((czh) it.next()).b()));
                    } catch (ServiceConfigurationError e5) {
                        Level level = Level.SEVERE;
                        String simpleName = lxh.class.getSimpleName();
                        a.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", simpleName.length() != 0 ? "Unable to load ".concat(simpleName) : new String("Unable to load "), (Throwable) e5);
                    }
                }
                if (arrayList.size() == 1) {
                    return (lxh) arrayList.get(0);
                }
                if (arrayList.size() == 0) {
                    return null;
                }
                try {
                    return (lxh) lxh.class.getMethod("combine", Collection.class).invoke(null, arrayList);
                } catch (IllegalAccessException e6) {
                    z3.q(e6);
                    return null;
                } catch (NoSuchMethodException e7) {
                    z3.q(e7);
                    return null;
                } catch (InvocationTargetException e8) {
                    z3.q(e8);
                    return null;
                }
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }

    public abstract T b();
}
