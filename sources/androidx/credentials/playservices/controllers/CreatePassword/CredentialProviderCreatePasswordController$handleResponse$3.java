package androidx.credentials.playservices.controllers.CreatePassword;

import defpackage.gu5;
import defpackage.j6g;
import defpackage.mj8;
import defpackage.t63;
import defpackage.wl7;
import defpackage.y43;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lj6g;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class CredentialProviderCreatePasswordController$handleResponse$3 extends mj8 implements gu5<j6g> {
    final /* synthetic */ y43 $response;
    final /* synthetic */ CredentialProviderCreatePasswordController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePasswordController$handleResponse$3(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, y43 y43Var) {
        super(0);
        this.this$0 = credentialProviderCreatePasswordController;
        this.$response = y43Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, y43 y43Var) {
        credentialProviderCreatePasswordController.getClass();
        y43Var.getClass();
        t63 t63Var = credentialProviderCreatePasswordController.callback;
        if (t63Var != null) {
            t63Var.onResult(y43Var);
        } else {
            wl7.g("callback");
            throw null;
        }
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Executor executor = this.this$0.executor;
        if (executor == null) {
            wl7.g("executor");
            throw null;
        }
        final CredentialProviderCreatePasswordController credentialProviderCreatePasswordController = this.this$0;
        final y43 y43Var = this.$response;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CreatePassword.b
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderCreatePasswordController$handleResponse$3.invoke$lambda$0(credentialProviderCreatePasswordController, y43Var);
            }
        });
    }

    @Override // defpackage.gu5
    public /* bridge */ /* synthetic */ j6g invoke() {
        invoke2();
        return j6g.a;
    }
}
