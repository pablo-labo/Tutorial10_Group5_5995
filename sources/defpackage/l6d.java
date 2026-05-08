package defpackage;

import com.android.volley.VolleyError;
import defpackage.ts1;

/* JADX INFO: loaded from: classes.dex */
public final class l6d<T> {
    public final T a;
    public final ts1.a b;
    public final VolleyError c;
    public boolean d;

    public interface a {
        void e(VolleyError volleyError);
    }

    public interface b<T> {
        void e(T t);
    }

    public l6d(T t, ts1.a aVar) {
        this.d = false;
        this.a = t;
        this.b = aVar;
        this.c = null;
    }

    public l6d(VolleyError volleyError) {
        this.d = false;
        this.a = null;
        this.b = null;
        this.c = volleyError;
    }
}
