package defpackage;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import expo.modules.kotlin.jni.JNIFunctionBody;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ra6 implements OnCompleteListener, JNIFunctionBody, SwipeRefreshLayout.f {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ra6(ua6 ua6Var, cj cjVar, oe oeVar) {
        this.a = cjVar;
        this.b = oeVar;
    }

    @Override // expo.modules.kotlin.jni.JNIFunctionBody
    public Object invoke(Object[] objArr) {
        a4c a4cVar = (a4c) this.a;
        gk0 gk0Var = (gk0) this.b;
        objArr.getClass();
        a2f a2fVar = a4cVar.b;
        return pt7.a(2, a2fVar.h.invoke(qf0.b(a2fVar, objArr, gk0Var)));
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        cj cjVar = (cj) this.a;
        oe oeVar = (oe) this.b;
        task.getClass();
        if (!task.isSuccessful()) {
            ArrayList arrayList = lz2.a;
            lz2.b("GoogleAuthManager", "handleGoogleSignIn no SignedInAccount: false", false, new Exception("handleGoogleSignIn no SignedInAccount: false"));
            oeVar.invoke();
            j6g j6gVar = j6g.a;
            return;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) task.getResult();
        if (googleSignInAccount == null) {
            ArrayList arrayList2 = lz2.a;
            w40.n("handleGoogleSignIn: account is null", "GoogleAuthManager", "handleGoogleSignIn: account is null", false);
            return;
        }
        String str = googleSignInAccount.c;
        if (str != null) {
            cjVar.invoke(str);
            throw null;
        }
        ArrayList arrayList3 = lz2.a;
        w40.n("handleGoogleSignIn: idToken is null", "GoogleAuthManager", "handleGoogleSignIn: idToken is null", false);
    }

    public /* synthetic */ ra6(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }
}
