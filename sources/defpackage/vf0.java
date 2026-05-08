package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import defpackage.g91;
import defpackage.pa6;
import java.util.Set;
import vf0.d;

/* JADX INFO: loaded from: classes2.dex */
public final class vf0<O extends d> {
    public final a a;
    public final String b;

    public static abstract class a<T extends f, O> extends e<T, O> {
        @Deprecated
        public T a(Context context, Looper looper, w72 w72Var, O o, pa6.a aVar, pa6.b bVar) {
            return (T) b(context, looper, w72Var, o, (y9h) aVar, (y9h) bVar);
        }

        public f b(Context context, Looper looper, w72 w72Var, Object obj, y9h y9hVar, y9h y9hVar2) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    public interface b {
    }

    public static class c<C extends b> {
    }

    public interface d {
        public static final c g = new c();

        public interface a extends d {
            Account N();
        }

        public interface b extends d {
            GoogleSignInAccount s();
        }

        public static final class c implements d {
        }
    }

    public static abstract class e<T extends b, O> {
    }

    public interface f extends b {
        String A0();

        void B0(c00 c00Var);

        boolean o0();

        void p0(String str);

        boolean q0();

        String r0();

        boolean s0();

        boolean t0();

        Set<Scope> u0();

        void v0(com.google.android.gms.common.internal.b bVar, Set<Scope> set);

        void w0(g91.c cVar);

        void x0();

        int y0();

        Feature[] z0();
    }

    public static final class g<C extends f> extends c<C> {
    }

    public <C extends f> vf0(String str, a<C, O> aVar, g<C> gVar) {
        this.b = str;
        this.a = aVar;
    }
}
