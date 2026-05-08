package defpackage;

import android.util.Log;
import defpackage.use;

/* JADX INFO: loaded from: classes.dex */
public final class f65 {
    public static final a a = new a();

    public class a implements e<Object> {
        @Override // f65.e
        public final void a(Object obj) {
        }
    }

    public interface b<T> {
        T create();
    }

    public static final class c<T> implements ngb<T> {
        public final b<T> a;
        public final e<T> b;
        public final pgb c;

        public c(pgb pgbVar, b bVar, e eVar) {
            this.c = pgbVar;
            this.a = bVar;
            this.b = eVar;
        }

        @Override // defpackage.ngb
        public final boolean a(T t) {
            if (t instanceof d) {
                ((d) t).c().a = true;
            }
            this.b.a(t);
            return this.c.a(t);
        }

        @Override // defpackage.ngb
        public final T acquire() {
            T tCreate = (T) this.c.acquire();
            if (tCreate == null) {
                tCreate = this.a.create();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + tCreate.getClass());
                }
            }
            if (tCreate instanceof d) {
                tCreate.c().a = false;
            }
            return (T) tCreate;
        }
    }

    public interface d {
        use.a c();
    }

    public interface e<T> {
        void a(T t);
    }

    public static c a(int i, b bVar) {
        return new c(new pgb(i), bVar, a);
    }
}
