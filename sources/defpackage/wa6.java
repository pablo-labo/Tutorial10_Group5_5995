package defpackage;

import android.app.Activity;
import androidx.credentials.exceptions.GetCredentialException;
import com.datadog.android.trace.AndroidTracer;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.auth.GoogleAuthManagerV2$signInWithGoogle$2", f = "GoogleAuthManagerV2.kt", l = {AndroidTracer.SPAN_ID_BIT_SIZE}, m = "invokeSuspend")
public final class wa6 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ s63 $credentialManager;
    final /* synthetic */ gu5<Activity> $getActivity;
    final /* synthetic */ c06 $getCredentialRequest;
    final /* synthetic */ gu5<j6g> $onNoGoogleCredentialsFound;
    final /* synthetic */ Function1<String, j6g> $onPostGoogleAuthToPassport;
    final /* synthetic */ gu5<j6g> $onUserCanceledSignIn;
    int label;
    final /* synthetic */ xa6 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public wa6(s63 s63Var, gu5<? extends Activity> gu5Var, c06 c06Var, xa6 xa6Var, Function1<? super String, j6g> function1, gu5<j6g> gu5Var2, gu5<j6g> gu5Var3, lu2<? super wa6> lu2Var) {
        super(2, lu2Var);
        this.$credentialManager = s63Var;
        this.$getActivity = gu5Var;
        this.$getCredentialRequest = c06Var;
        this.this$0 = xa6Var;
        this.$onPostGoogleAuthToPassport = function1;
        this.$onNoGoogleCredentialsFound = gu5Var2;
        this.$onUserCanceledSignIn = gu5Var3;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new wa6(this.$credentialManager, this.$getActivity, this.$getCredentialRequest, this.this$0, this.$onPostGoogleAuthToPassport, this.$onNoGoogleCredentialsFound, this.$onUserCanceledSignIn, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((wa6) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        try {
            if (i == 0) {
                r7d.b(obj);
                s63 s63Var = this.$credentialManager;
                Activity activityInvoke = this.$getActivity.invoke();
                c06 c06Var = this.$getCredentialRequest;
                this.label = 1;
                obj = s63Var.b(activityInvoke, c06Var, this);
                g13 g13Var = g13.a;
                if (obj == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            xa6.a(this.this$0, ((d06) obj).a, this.$onPostGoogleAuthToPassport);
        } catch (GetCredentialException e) {
            if (wve.E(e.getType(), "android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL", true)) {
                ArrayList arrayList = lz2.a;
                lz2.b("GoogleAuthManagerV2", "Google SignIn - no credentials", false, e);
                this.$onNoGoogleCredentialsFound.invoke();
            } else if (wve.E(e.getType(), "android.credentials.GetCredentialException.TYPE_USER_CANCELED", true)) {
                gu5<j6g> gu5Var = this.$onUserCanceledSignIn;
                if (gu5Var != null) {
                    gu5Var.invoke();
                }
                ArrayList arrayList2 = lz2.a;
                lz2.b("GoogleAuthManagerV2", "Google SignIn - user canceled", false, e);
            } else {
                ArrayList arrayList3 = lz2.a;
                lz2.b("GoogleAuthManagerV2", "Google SignIn failed", false, e);
            }
        }
        return j6g.a;
    }
}
