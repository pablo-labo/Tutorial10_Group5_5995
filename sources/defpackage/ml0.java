package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import androidx.startup.StartupException;
import com.indeed.android.jobsearch.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ml0 {
    public static volatile ml0 d;
    public static final Object e = new Object();
    public final Context c;
    public final HashSet b = new HashSet();
    public final HashMap a = new HashMap();

    public ml0(Context context) {
        this.c = context.getApplicationContext();
    }

    public static ml0 c(Context context) {
        if (d == null) {
            synchronized (e) {
                try {
                    if (d == null) {
                        d = new ml0(context);
                    }
                } finally {
                }
            }
        }
        return d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.b;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (nd7.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new StartupException(e2);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object objCreate;
        HashMap map = this.a;
        if (jpf.f()) {
            try {
                Trace.beginSection(jpf.g(cls.getSimpleName()));
            } finally {
                Trace.endSection();
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objCreate = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                nd7 nd7Var = (nd7) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class<? extends nd7<?>>> listDependencies = nd7Var.dependencies();
                if (!listDependencies.isEmpty()) {
                    for (Class<? extends nd7<?>> cls2 : listDependencies) {
                        if (!map.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                objCreate = nd7Var.create(this.c);
                hashSet.remove(cls);
                map.put(cls, objCreate);
            } catch (Throwable th) {
                throw new StartupException(th);
            }
        }
        return objCreate;
    }
}
