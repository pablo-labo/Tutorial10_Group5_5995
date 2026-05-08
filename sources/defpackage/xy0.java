package defpackage;

import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import defpackage.vf0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class xy0 {
    public static final vf0<GoogleSignInOptions> a;

    @Deprecated
    public static class a implements vf0.d {
        public static final a c;
        public final boolean a;
        public final String b;

        /* JADX INFO: renamed from: xy0$a$a, reason: collision with other inner class name */
        @Deprecated
        public static class C0477a {
            public Boolean a;
            public String b;
        }

        static {
            C0477a c0477a = new C0477a();
            c0477a.a = Boolean.FALSE;
            c = new a(c0477a);
        }

        public a(C0477a c0477a) {
            this.a = c0477a.a.booleanValue();
            this.b = c0477a.b;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return xna.a(null, null) && this.a == aVar.a && xna.a(this.b, aVar.b);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.a), this.b});
        }
    }

    static {
        vf0.g gVar = new vf0.g();
        new vch();
        hdh hdhVar = new hdh();
        vf0<az0> vf0Var = zy0.a;
        a = new vf0<>("Auth.GOOGLE_SIGN_IN_API", hdhVar, gVar);
    }
}
