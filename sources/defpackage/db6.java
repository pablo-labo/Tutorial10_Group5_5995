package defpackage;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
public final class db6 extends ma6<GoogleSignInOptions> {
    public static final oie k = new oie();
    public static int l = 1;

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
    public final Task<Void> f() {
        BasePendingResult basePendingResult;
        boolean z = g() == 3;
        jeh.a.a("Signing out", new Object[0]);
        jeh.b(this.a);
        cah cahVar = this.h;
        if (z) {
            Status status = Status.e;
            fib.j(status, "Result must not be null");
            ste steVar = new ste(cahVar);
            steVar.f(status);
            basePendingResult = steVar;
        } else {
            deh dehVar = new deh(cahVar);
            cahVar.b.d(1, dehVar);
            basePendingResult = dehVar;
        }
        mxg mxgVar = new mxg();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        basePendingResult.b(new gch(basePendingResult, taskCompletionSource, mxgVar));
        return taskCompletionSource.getTask();
    }

    public final synchronized int g() {
        int i;
        try {
            i = l;
            if (i == 1) {
                Context context = this.a;
                na6 na6Var = na6.d;
                int iC = na6Var.c(context, 12451000);
                if (iC == 0) {
                    i = 4;
                    l = 4;
                } else if (na6Var.a(context, null, iC) != null || DynamiteModule.a(context, "com.google.android.gms.auth.api.fallback") == 0) {
                    i = 2;
                    l = 2;
                } else {
                    i = 3;
                    l = 3;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return i;
    }
}
