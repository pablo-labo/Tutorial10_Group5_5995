package androidx.credentials.playservices.controllers.BeginSignIn;

import androidx.credentials.exceptions.GetCredentialException;
import defpackage.j6g;
import defpackage.mj8;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/credentials/exceptions/GetCredentialException;", "e", "Lj6g;", "invoke", "(Landroidx/credentials/exceptions/GetCredentialException;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class CredentialProviderBeginSignInController$handleResponse$2 extends mj8 implements Function1<GetCredentialException, j6g> {
    final /* synthetic */ CredentialProviderBeginSignInController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderBeginSignInController$handleResponse$2(CredentialProviderBeginSignInController credentialProviderBeginSignInController) {
        super(1);
        this.this$0 = credentialProviderBeginSignInController;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(CredentialProviderBeginSignInController credentialProviderBeginSignInController, GetCredentialException getCredentialException) {
        credentialProviderBeginSignInController.getClass();
        getCredentialException.getClass();
        credentialProviderBeginSignInController.getCallback().a(getCredentialException);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(final GetCredentialException getCredentialException) {
        getCredentialException.getClass();
        Executor executor = this.this$0.getExecutor();
        final CredentialProviderBeginSignInController credentialProviderBeginSignInController = this.this$0;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.BeginSignIn.a
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderBeginSignInController$handleResponse$2.invoke$lambda$0(credentialProviderBeginSignInController, getCredentialException);
            }
        });
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ j6g invoke(GetCredentialException getCredentialException) {
        invoke2(getCredentialException);
        return j6g.a;
    }
}
