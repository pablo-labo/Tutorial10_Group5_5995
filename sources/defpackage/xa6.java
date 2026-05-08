package defpackage;

import android.content.Context;
import com.google.android.libraries.identity.googleid.GoogleIdTokenParsingException;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jobsearch.auth.UnexpectedCredentialException;
import defpackage.s87;
import defpackage.xh8;
import defpackage.za6;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class xa6 implements xh8 {
    public final Lazy a;
    public final tx5 b;
    public final Lazy c;
    public final d2f d;

    public static final class a extends mj8 implements gu5<Context> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xa6 xa6Var) {
            super(0);
            this.$this_inject = xa6Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [android.content.Context, java.lang.Object] */
        @Override // defpackage.gu5
        public final Context invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(Context.class), a9cVar);
        }
    }

    public static final class b extends mj8 implements gu5<gz4> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xa6 xa6Var) {
            super(0);
            this.$this_inject = xa6Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [gz4, java.lang.Object] */
        @Override // defpackage.gu5
        public final gz4 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(gz4.class), a9cVar);
        }
    }

    public xa6() {
        a aVar = new a(this);
        qt8 qt8Var = qt8.a;
        this.a = boa.E(qt8Var, aVar);
        this.b = new tx5();
        this.c = boa.E(qt8Var, new b(this));
        this.d = new d2f(new ag3(2));
    }

    public static final void a(xa6 xa6Var, q63 q63Var, Function1 function1) {
        xa6Var.getClass();
        if (!(q63Var instanceof ma3)) {
            ArrayList arrayList = lz2.a;
            lz2.b("GoogleAuthManagerV2", "Unexpected type of credential: ".concat(q63Var.a), false, new UnexpectedCredentialException());
            return;
        }
        String str = q63Var.a;
        if (!str.equals("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL")) {
            ArrayList arrayList2 = lz2.a;
            lz2.b("GoogleAuthManagerV2", "Unexpected type of credential: ".concat(str), false, new UnexpectedCredentialException());
            return;
        }
        try {
            String str2 = za6.a.a(q63Var.b).c;
            if (zve.U(str2)) {
                return;
            }
            function1.invoke(str2);
        } catch (GoogleIdTokenParsingException e) {
            ArrayList arrayList3 = lz2.a;
            lz2.b("GoogleAuthManagerV2", "Received an invalid google id token response", false, e);
        }
    }

    public static void b(xa6 xa6Var, gu5 gu5Var, boolean z, Function1 function1, gu5 gu5Var2, int i) {
        int i2 = 0;
        boolean z2 = (i & 2) != 0 ? false : z;
        xa6Var.getClass();
        Lazy<s87> lazy = s87.f;
        s87.a.a((gz4) xa6Var.c.getValue(), tx5.g(xa6Var.b, "google-sign-in", new va6(0, z2), 2));
        ((Context) gu5Var.invoke()).getClass();
        u63 u63Var = new u63(i2);
        String string = ((Context) xa6Var.a.getValue()).getString(R.string.indeed_passport_google_auth_id);
        string.getClass();
        i56 i56Var = new i56(string, UUID.randomUUID().toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add(i56Var);
        u63.Y((e13) xa6Var.d.getValue(), null, null, new wa6(u63Var, gu5Var, new c06(z92.z1(arrayList)), xa6Var, function1, gu5Var2, null, null), 3);
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
