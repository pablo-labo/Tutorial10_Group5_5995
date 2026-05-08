package defpackage;

import android.content.Context;
import android.os.Looper;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.ma6;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class meh extends gdh {
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.gdh
    public final boolean c(int i, Parcel parcel, Parcel parcel2) {
        BasePendingResult basePendingResult;
        String strD;
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            veh vehVar = (veh) this;
            vehVar.e();
            keh.a(vehVar.a).b();
            return true;
        }
        veh vehVar2 = (veh) this;
        vehVar2.e();
        RevocationBoundService revocationBoundService = vehVar2.a;
        yte yteVarA = yte.a(revocationBoundService);
        GoogleSignInAccount googleSignInAccountB = yteVarA.b();
        GoogleSignInOptions googleSignInOptionsS0 = GoogleSignInOptions.Z;
        if (googleSignInAccountB != null) {
            String strD2 = yteVarA.d("defaultGoogleSignInAccount");
            if (TextUtils.isEmpty(strD2) || (strD = yteVarA.d(yte.f("googleSignInOptions", strD2))) == null) {
                googleSignInOptionsS0 = null;
            } else {
                try {
                    googleSignInOptionsS0 = GoogleSignInOptions.s0(strD);
                } catch (JSONException unused) {
                    googleSignInOptionsS0 = null;
                }
            }
        }
        GoogleSignInOptions googleSignInOptions = googleSignInOptionsS0;
        fib.i(googleSignInOptions);
        db6 db6Var = new db6(revocationBoundService, null, xy0.a, googleSignInOptions, new ma6.a(new yid(), Looper.getMainLooper()));
        if (googleSignInAccountB != null) {
            boolean z = db6Var.g() == 3;
            jeh.a.a("Revoking access", new Object[0]);
            Context context = db6Var.a;
            String strD3 = yte.a(context).d("refreshToken");
            jeh.b(context);
            if (!z) {
                cah cahVar = db6Var.h;
                geh gehVar = new geh(cahVar);
                cahVar.b.d(1, gehVar);
                basePendingResult = gehVar;
            } else if (strD3 == null) {
                b49 b49Var = fdh.c;
                Status status = new Status(4, null, null, null);
                fib.a("Status code must not be SUCCESS", !status.s0());
                nbh nbhVar = new nbh(status);
                nbhVar.f(status);
                basePendingResult = nbhVar;
            } else {
                fdh fdhVar = new fdh(strD3);
                new Thread(fdhVar).start();
                basePendingResult = fdhVar.b;
            }
            mxg mxgVar = new mxg();
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            basePendingResult.b(new gch(basePendingResult, taskCompletionSource, mxgVar));
            taskCompletionSource.getTask();
        } else {
            db6Var.f();
        }
        return true;
    }
}
