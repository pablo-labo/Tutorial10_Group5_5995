package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.zjg;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes3.dex */
public final class h49 {
    public static volatile int a;
    public static final uxe b = new uxe();
    public static final k8a c = new k8a();
    public static final boolean d;
    public static volatile vhd e;
    public static final String[] f;

    static {
        String property;
        try {
            property = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
            property = null;
        }
        d = property == null ? false : property.equalsIgnoreCase("true");
        f = new String[]{"2.0"};
    }

    public static ArrayList a() {
        ArrayList arrayList = new ArrayList();
        final ClassLoader classLoader = h49.class.getClassLoader();
        String property = System.getProperty("slf4j.provider");
        vhd vhdVar = null;
        if (property != null && !property.isEmpty()) {
            try {
                k3d.c("Attempting to load provider \"" + property + "\" specified via \"slf4j.provider\" system property");
                vhdVar = (vhd) classLoader.loadClass(property).getConstructor(null).newInstance(null);
            } catch (ClassCastException e2) {
                k3d.a("Specified SLF4JServiceProvider (" + property + ") does not implement SLF4JServiceProvider interface", e2);
            } catch (ClassNotFoundException e3) {
                e = e3;
                k3d.a("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (IllegalAccessException e4) {
                e = e4;
                k3d.a("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (InstantiationException e5) {
                e = e5;
                k3d.a("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (NoSuchMethodException e6) {
                e = e6;
                k3d.a("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (InvocationTargetException e7) {
                e = e7;
                k3d.a("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            }
        }
        if (vhdVar != null) {
            arrayList.add(vhdVar);
            return arrayList;
        }
        Iterator it = (System.getSecurityManager() == null ? ServiceLoader.load(vhd.class, classLoader) : (ServiceLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: g49
            @Override // java.security.PrivilegedAction
            public final Object run() {
                return ServiceLoader.load(vhd.class, classLoader);
            }
        })).iterator();
        while (it.hasNext()) {
            try {
                arrayList.add((vhd) it.next());
            } catch (ServiceConfigurationError e8) {
                k3d.b().println("SLF4J(E): ".concat("A service provider failed to instantiate:\n" + e8.getMessage()));
            }
        }
        return arrayList;
    }

    public static e49 b(Class<?> cls) {
        int i;
        e49 e49VarC = c(cls.getName());
        if (d) {
            zjg.a aVar = zjg.a;
            Class<?> cls2 = null;
            if (aVar == null) {
                if (zjg.b) {
                    aVar = null;
                } else {
                    try {
                        aVar = new zjg.a();
                    } catch (SecurityException unused) {
                        aVar = null;
                    }
                    zjg.a = aVar;
                    zjg.b = true;
                }
            }
            if (aVar != null) {
                Class<?>[] classContext = aVar.getClassContext();
                String name = zjg.class.getName();
                int i2 = 0;
                while (i2 < classContext.length && !name.equals(classContext[i2].getName())) {
                    i2++;
                }
                if (i2 >= classContext.length || (i = i2 + 2) >= classContext.length) {
                    r6.g("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
                    return null;
                }
                cls2 = classContext[i];
            }
            if (cls2 != null && !cls2.isAssignableFrom(cls)) {
                k3d.d("Detected logger name mismatch. Given name: \"" + e49VarC.getName() + "\"; computed name: \"" + cls2.getName() + "\".");
                k3d.d("See https://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
            }
        }
        return e49VarC;
    }

    public static e49 c(String str) {
        vhd vhdVar;
        if (a == 0) {
            synchronized (h49.class) {
                try {
                    if (a == 0) {
                        a = 1;
                        d();
                    }
                } finally {
                }
            }
        }
        int i = a;
        if (i == 1) {
            vhdVar = b;
        } else {
            if (i == 2) {
                r6.g("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit");
                return null;
            }
            if (i == 3) {
                vhdVar = e;
            } else {
                if (i != 4) {
                    r6.g("Unreachable code");
                    return null;
                }
                vhdVar = c;
            }
        }
        return vhdVar.a().a(str);
    }

    public static final void d() {
        try {
            ArrayList arrayListA = a();
            g(arrayListA);
            if (arrayListA.isEmpty()) {
                a = 4;
                k3d.d("No SLF4J providers were found.");
                k3d.d("Defaulting to no-operation (NOP) logger implementation");
                k3d.d("See https://www.slf4j.org/codes.html#noProviders for further details.");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                try {
                    ClassLoader classLoader = h49.class.getClassLoader();
                    Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources("org/slf4j/impl/StaticLoggerBinder.class") : classLoader.getResources("org/slf4j/impl/StaticLoggerBinder.class");
                    while (systemResources.hasMoreElements()) {
                        linkedHashSet.add(systemResources.nextElement());
                    }
                } catch (IOException e2) {
                    k3d.a("Error getting resources from path", e2);
                }
                f(linkedHashSet);
            } else {
                e = (vhd) arrayListA.get(0);
                e.getClass();
                a = 3;
                if (!arrayListA.isEmpty() && arrayListA.size() > 1) {
                    k3d.c("Actual provider is of type [" + arrayListA.get(0) + "]");
                }
            }
            e();
            if (a == 3) {
                try {
                    String strB = e.b();
                    boolean z = false;
                    for (String str : f) {
                        if (strB.startsWith(str)) {
                            z = true;
                        }
                    }
                    if (z) {
                        return;
                    }
                    k3d.d("The requested version " + strB + " by your slf4j provider is not compatible with " + Arrays.asList(f).toString());
                    k3d.d("See https://www.slf4j.org/codes.html#version_mismatch for further details.");
                } catch (Throwable th) {
                    k3d.a("Unexpected problem occurred during version sanity check", th);
                }
            }
        } catch (Exception e3) {
            a = 2;
            k3d.a("Failed to instantiate SLF4J LoggerFactory", e3);
            ja.m("Unexpected initialization failure", e3);
        }
    }

    public static void e() {
        uxe uxeVar = b;
        synchronized (uxeVar) {
            try {
                uxeVar.a.a = true;
                sxe sxeVar = uxeVar.a;
                sxeVar.getClass();
                for (rxe rxeVar : new ArrayList(sxeVar.b.values())) {
                    rxeVar.b = c(rxeVar.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        LinkedBlockingQueue<txe> linkedBlockingQueue = b.a.c;
        int size = linkedBlockingQueue.size();
        ArrayList<txe> arrayList = new ArrayList(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        int i = 0;
        while (linkedBlockingQueue.drainTo(arrayList, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            for (txe txeVar : arrayList) {
                if (txeVar != null) {
                    rxe rxeVar2 = txeVar.b;
                    String str = rxeVar2.a;
                    if (rxeVar2.b == null) {
                        r6.g("Delegate logger cannot be null at this state.");
                        return;
                    } else if (!(rxeVar2.b instanceof j8a)) {
                        if (!rxeVar2.l()) {
                            k3d.d(str);
                        } else if (rxeVar2.j(txeVar.a) && rxeVar2.l()) {
                            try {
                                rxeVar2.d.invoke(rxeVar2.b, txeVar);
                            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                            }
                        }
                    }
                }
                int i2 = i + 1;
                if (i == 0) {
                    if (txeVar.b.l()) {
                        k3d.d("A number (" + size + ") of logging calls during the initialization phase have been intercepted and are");
                        k3d.d("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        k3d.d("See also https://www.slf4j.org/codes.html#replay");
                    } else if (!(txeVar.b.b instanceof j8a)) {
                        k3d.d("The following set of substitute loggers may have been accessed");
                        k3d.d("during the initialization phase. Logging calls during this");
                        k3d.d("phase were not honored. However, subsequent logging calls to these");
                        k3d.d("loggers will work as normally expected.");
                        k3d.d("See also https://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i = i2;
            }
            arrayList.clear();
        }
        sxe sxeVar2 = b.a;
        sxeVar2.b.clear();
        sxeVar2.c.clear();
    }

    public static void f(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.isEmpty()) {
            return;
        }
        k3d.d("Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier.");
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            k3d.d("Ignoring binding found at [" + ((URL) it.next()) + "]");
        }
        k3d.d("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
    }

    public static void g(ArrayList arrayList) {
        if (arrayList.size() > 1) {
            k3d.d("Class path contains multiple SLF4J providers.");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                k3d.d("Found provider [" + ((vhd) it.next()) + "]");
            }
            k3d.d("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }
}
