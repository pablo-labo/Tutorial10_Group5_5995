package androidx.credentials.playservices.controllers.GetSignInIntent;

import defpackage.d06;
import defpackage.gu5;
import defpackage.j6g;
import defpackage.mj8;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lj6g;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class CredentialProviderGetSignInIntentController$handleResponse$3 extends mj8 implements gu5<j6g> {
    final /* synthetic */ d06 $response;
    final /* synthetic */ CredentialProviderGetSignInIntentController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetSignInIntentController$handleResponse$3(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, d06 d06Var) {
        super(0);
        this.this$0 = credentialProviderGetSignInIntentController;
        this.$response = d06Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, d06 d06Var) {
        credentialProviderGetSignInIntentController.getClass();
        d06Var.getClass();
        credentialProviderGetSignInIntentController.getCallback().onResult(d06Var);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Executor executor = this.this$0.getExecutor();
        final CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController = this.this$0;
        final d06 d06Var = this.$response;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.GetSignInIntent.b
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetSignInIntentController$handleResponse$3.invoke$lambda$0(credentialProviderGetSignInIntentController, d06Var);
            }
        });
    }

    @Override // defpackage.gu5
    public /* bridge */ /* synthetic */ j6g invoke() {
        invoke2();
        return j6g.a;
    }
}
