package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.indeed.android.jobsearch.R;
import defpackage.ma6;
import defpackage.s87;
import defpackage.vf0;
import defpackage.xh8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class ua6 implements xh8 {
    public final Lazy a;
    public db6 b;
    public final tx5 c;
    public final Lazy d;

    public static final class a extends mj8 implements gu5<Context> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ua6 ua6Var) {
            super(0);
            this.$this_inject = ua6Var;
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
        public b(ua6 ua6Var) {
            super(0);
            this.$this_inject = ua6Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [gz4, java.lang.Object] */
        @Override // defpackage.gu5
        public final gz4 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(gz4.class), a9cVar);
        }
    }

    public ua6() {
        a aVar = new a(this);
        qt8 qt8Var = qt8.a;
        this.a = boa.E(qt8Var, aVar);
        this.c = new tx5();
        this.d = boa.E(qt8Var, new b(this));
    }

    public final db6 a(String str, String str2) {
        Account account;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        hashSet.add(GoogleSignInOptions.a0);
        fib.f(str2);
        if (str != null) {
            fib.f(str);
            account = new Account(str, "com.google");
        } else {
            account = null;
        }
        Account account2 = account;
        if (hashSet.contains(GoogleSignInOptions.d0)) {
            Scope scope = GoogleSignInOptions.c0;
            if (hashSet.contains(scope)) {
                hashSet.remove(scope);
            }
        }
        if (account2 == null || !hashSet.isEmpty()) {
            hashSet.add(GoogleSignInOptions.b0);
        }
        return new db6((Context) this.a.getValue(), null, xy0.a, new GoogleSignInOptions(3, new ArrayList(hashSet), account2, true, false, false, str2, null, map, null), new ma6.a(new yid(), Looper.getMainLooper()));
    }

    public final void b(Intent intent, final Function1<? super String, j6g> function1, final gu5<j6g> gu5Var) {
        fb6 fb6Var;
        GoogleSignInAccount googleSignInAccount;
        b49 b49Var = jeh.a;
        if (intent == null) {
            fb6Var = new fb6(null, Status.V);
        } else {
            Status status = (Status) intent.getParcelableExtra("googleSignInStatus");
            GoogleSignInAccount googleSignInAccount2 = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
            if (googleSignInAccount2 == null) {
                if (status == null) {
                    status = Status.V;
                }
                fb6Var = new fb6(null, status);
            } else {
                fb6Var = new fb6(googleSignInAccount2, Status.e);
            }
        }
        Status status2 = fb6Var.a;
        ((!status2.s0() || (googleSignInAccount = fb6Var.b) == null) ? Tasks.forException(hh2.q(status2)) : Tasks.forResult(googleSignInAccount)).addOnCompleteListener(new OnCompleteListener() { // from class: sa6
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ua6 ua6Var = this;
                tx5 tx5Var = ua6Var.c;
                Lazy lazy = ua6Var.d;
                task.getClass();
                ArrayList arrayList = lz2.a;
                lz2.d("GoogleAuthManager", "Google sign in was successful: " + task.isSuccessful(), false, null);
                boolean zIsSuccessful = task.isSuccessful();
                gu5 gu5Var2 = gu5Var;
                if (!zIsSuccessful) {
                    Lazy<s87> lazy2 = s87.f;
                    s87.a.a((gz4) lazy.getValue(), tx5Var.a(false));
                    lz2.b("GoogleAuthManager", "Google sign in result", false, task.getException());
                    gu5Var2.invoke();
                    return;
                }
                gu5Var2.invoke();
                GoogleSignInAccount googleSignInAccount3 = (GoogleSignInAccount) task.getResult();
                if (googleSignInAccount3 == null) {
                    Lazy<s87> lazy3 = s87.f;
                    s87.a.a((gz4) lazy.getValue(), tx5Var.a(false));
                    lz2.b("GoogleAuthManager", "handleSignInResult: result is null", false, new Exception("handleSignInResult: result is null"));
                    return;
                }
                String str = googleSignInAccount3.c;
                if (str == null) {
                    Lazy<s87> lazy4 = s87.f;
                    s87.a.a((gz4) lazy.getValue(), tx5Var.a(false));
                    lz2.b("GoogleAuthManager", "handleSignInResult: idToken is null", false, new Exception("handleSignInResult: idToken is null"));
                    return;
                }
                Lazy<s87> lazy5 = s87.f;
                s87.a.a((gz4) lazy.getValue(), tx5Var.a(true));
                function1.invoke(str);
                db6 db6Var = ua6Var.b;
                if (db6Var != null) {
                    db6Var.f();
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(boolean z, Function1<? super Intent, j6g> function1) {
        Intent intentA;
        Lazy<s87> lazy = s87.f;
        s87.a.a((gz4) this.d.getValue(), tx5.g(this.c, "google-sign-in", new ta6(0, z), 2));
        String string = ((Context) (this instanceof ai8 ? ((ai8) this).d() : (qpd) xh8.a.a().a.b).a(null, fwc.a.b(Context.class), null)).getString(R.string.indeed_passport_google_auth_id);
        string.getClass();
        db6 db6VarA = a(null, string);
        this.b = db6VarA;
        vf0.d dVar = db6VarA.d;
        Context context = db6VarA.a;
        int iG = db6VarA.g();
        int i = iG - 1;
        if (iG == 0) {
            throw null;
        }
        if (i == 2) {
            jeh.a.a("getFallbackSignInIntent()", new Object[0]);
            intentA = jeh.a(context, (GoogleSignInOptions) dVar);
            intentA.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
        } else if (i != 3) {
            jeh.a.a("getNoImplementationSignInIntent()", new Object[0]);
            intentA = jeh.a(context, (GoogleSignInOptions) dVar);
            intentA.setAction("com.google.android.gms.auth.NO_IMPL");
        } else {
            intentA = jeh.a(context, (GoogleSignInOptions) dVar);
        }
        function1.invoke(intentA);
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
