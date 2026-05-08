package defpackage;

import android.app.Activity;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.e;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public interface rq7 {

    public static final class a {
        public final String a;
        public final String b;
        public final String c;

        public a(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b) && wl7.b(this.c, aVar.c);
        }

        public final int hashCode() {
            int iD = akb.d(this.a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return iD + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return l6.i(u40.f("ShareSheetInfo(url=", this.a, ", subject=", this.b, ", message="), this.c, ")");
        }
    }

    void a(er7 er7Var, FragmentManager fragmentManager, String str, String str2, Function1 function1);

    void b(lr5 lr5Var, Function1 function1);

    void c(FragmentManager fragmentManager, nq7<?> nq7Var, String str);

    void e(lr5 lr5Var, String str, vg vgVar);

    void f(FragmentManager fragmentManager, e eVar, jq7 jq7Var, String str);

    void g(lr5 lr5Var);

    void h(lr5 lr5Var, jt7 jt7Var, String str, kt7 kt7Var);

    void i(lr5 lr5Var, Function1 function1);

    void j(Activity activity, a aVar, xdc xdcVar);
}
