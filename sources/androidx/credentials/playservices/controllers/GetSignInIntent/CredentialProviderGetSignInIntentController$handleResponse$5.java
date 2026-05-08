package androidx.credentials.playservices.controllers.GetSignInIntent;

import androidx.credentials.exceptions.GetCredentialException;
import defpackage.gu5;
import defpackage.j6g;
import defpackage.mj8;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lj6g;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class CredentialProviderGetSignInIntentController$handleResponse$5 extends mj8 implements gu5<j6g> {
    final /* synthetic */ GetCredentialException $e;
    final /* synthetic */ CredentialProviderGetSignInIntentController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetSignInIntentController$handleResponse$5(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, GetCredentialException getCredentialException) {
        super(0);
        this.this$0 = credentialProviderGetSignInIntentController;
        this.$e = getCredentialException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, GetCredentialException getCredentialException) {
        credentialProviderGetSignInIntentController.getClass();
        getCredentialException.getClass();
        credentialProviderGetSignInIntentController.getCallback().a(getCredentialException);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Executor executor = this.this$0.getExecutor();
        final CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController = this.this$0;
        final GetCredentialException getCredentialException = this.$e;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.GetSignInIntent.d
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetSignInIntentController$handleResponse$5.invoke$lambda$0(credentialProviderGetSignInIntentController, getCredentialException);
            }
        });
    }

    @Override // defpackage.gu5
    public /* bridge */ /* synthetic */ j6g invoke() {
        invoke2();
        return j6g.a;
    }
}
