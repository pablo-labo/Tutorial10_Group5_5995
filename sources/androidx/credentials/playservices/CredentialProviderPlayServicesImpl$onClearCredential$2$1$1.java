package androidx.credentials.playservices;

import android.util.Log;
import androidx.credentials.exceptions.ClearCredentialException;
import androidx.credentials.exceptions.ClearCredentialUnknownException;
import defpackage.gu5;
import defpackage.j6g;
import defpackage.mj8;
import defpackage.t63;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lj6g;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class CredentialProviderPlayServicesImpl$onClearCredential$2$1$1 extends mj8 implements gu5<j6g> {
    final /* synthetic */ t63<Void, ClearCredentialException> $callback;
    final /* synthetic */ Exception $e;
    final /* synthetic */ Executor $executor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderPlayServicesImpl$onClearCredential$2$1$1(Exception exc, Executor executor, t63<Void, ClearCredentialException> t63Var) {
        super(0);
        this.$e = exc;
        this.$executor = executor;
        this.$callback = t63Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(t63 t63Var, Exception exc) {
        t63Var.getClass();
        exc.getClass();
        t63Var.a(new ClearCredentialUnknownException(exc.getMessage()));
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Log.w("PlayServicesImpl", "During clear credential sign out failed with " + this.$e);
        Executor executor = this.$executor;
        final t63<Void, ClearCredentialException> t63Var = this.$callback;
        final Exception exc = this.$e;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.b
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderPlayServicesImpl$onClearCredential$2$1$1.invoke$lambda$0(t63Var, exc);
            }
        });
    }

    @Override // defpackage.gu5
    public /* bridge */ /* synthetic */ j6g invoke() {
        invoke2();
        return j6g.a;
    }
}
