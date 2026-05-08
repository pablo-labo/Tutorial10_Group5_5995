package defpackage;

import android.app.Application;
import defpackage.p63;
import defpackage.wkd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class grg {
    public static final f b = new f();
    public final hrg a;

    public static class a extends d {
        public static a c;
        public static final C0252a d = new C0252a();
        public final Application b;

        /* JADX INFO: renamed from: grg$a$a, reason: collision with other inner class name */
        public static final class C0252a {
        }

        public a(Application application) {
            this.b = application;
        }

        @Override // grg.d, grg.c
        public final brg a(Class cls, u2a u2aVar) {
            if (this.b != null) {
                return c(cls);
            }
            Application application = (Application) u2aVar.a.get(d);
            if (application != null) {
                return d(cls, application);
            }
            if (!sb0.class.isAssignableFrom(cls)) {
                return u63.t(cls);
            }
            l5.q("CreationExtras must have an application by `APPLICATION_KEY`");
            return null;
        }

        @Override // grg.d, grg.c
        public final <T extends brg> T c(Class<T> cls) {
            Application application = this.b;
            if (application != null) {
                return (T) d(cls, application);
            }
            b0.u("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }

        public final <T extends brg> T d(Class<T> cls, Application application) {
            if (!sb0.class.isAssignableFrom(cls)) {
                return (T) u63.t(cls);
            }
            try {
                T tNewInstance = cls.getConstructor(Application.class).newInstance(application);
                tNewInstance.getClass();
                return tNewInstance;
            } catch (IllegalAccessException e) {
                l6.p(m6.f(cls, "Cannot create an instance of "), e);
                return null;
            } catch (InstantiationException e2) {
                l6.p(m6.f(cls, "Cannot create an instance of "), e2);
                return null;
            } catch (NoSuchMethodException e3) {
                l6.p(m6.f(cls, "Cannot create an instance of "), e3);
                return null;
            } catch (InvocationTargetException e4) {
                l6.p(m6.f(cls, "Cannot create an instance of "), e4);
                return null;
            }
        }
    }

    public static final class b {
        public static grg a(jrg jrgVar, wkd.a aVar, int i) {
            c defaultViewModelProviderFactory = aVar;
            if ((i & 2) != 0) {
                jrgVar.getClass();
                defaultViewModelProviderFactory = jrgVar instanceof hg6 ? ((hg6) jrgVar).getDefaultViewModelProviderFactory() : rr3.a;
            }
            jrgVar.getClass();
            p63 defaultViewModelCreationExtras = jrgVar instanceof hg6 ? ((hg6) jrgVar).getDefaultViewModelCreationExtras() : p63.a.b;
            jrgVar.getClass();
            defaultViewModelProviderFactory.getClass();
            defaultViewModelCreationExtras.getClass();
            return new grg(jrgVar.getViewModelStore(), defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        }
    }

    public interface c {
        default brg a(Class cls, u2a u2aVar) {
            return c(cls);
        }

        default brg b(yd8 yd8Var, u2a u2aVar) {
            yd8Var.getClass();
            return a(jh2.p(yd8Var), u2aVar);
        }

        default <T extends brg> T c(Class<T> cls) {
            throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
        }
    }

    public static class d implements c {
        public static d a;

        @Override // grg.c
        public brg a(Class cls, u2a u2aVar) {
            return c(cls);
        }

        @Override // grg.c
        public final brg b(yd8 yd8Var, u2a u2aVar) {
            yd8Var.getClass();
            return a(jh2.p(yd8Var), u2aVar);
        }

        @Override // grg.c
        public <T extends brg> T c(Class<T> cls) {
            return (T) u63.t(cls);
        }
    }

    public static class e {
        public void d(brg brgVar) {
        }
    }

    public static final class f {
    }

    public grg(irg irgVar, c cVar, p63 p63Var) {
        irgVar.getClass();
        cVar.getClass();
        p63Var.getClass();
        this.a = new hrg(irgVar, cVar, p63Var);
    }
}
