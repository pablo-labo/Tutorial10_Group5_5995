package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import androidx.credentials.exceptions.CreateCredentialException;
import defpackage.j6g;
import defpackage.mj8;
import defpackage.t63;
import defpackage.wl7;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/credentials/exceptions/CreateCredentialException;", "e", "Lj6g;", "invoke", "(Landroidx/credentials/exceptions/CreateCredentialException;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class CredentialProviderCreatePublicKeyCredentialController$handleResponse$2 extends mj8 implements Function1<CreateCredentialException, j6g> {
    final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePublicKeyCredentialController$handleResponse$2(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController) {
        super(1);
        this.this$0 = credentialProviderCreatePublicKeyCredentialController;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, CreateCredentialException createCredentialException) {
        credentialProviderCreatePublicKeyCredentialController.getClass();
        createCredentialException.getClass();
        t63 t63Var = credentialProviderCreatePublicKeyCredentialController.callback;
        if (t63Var != null) {
            t63Var.a(createCredentialException);
        } else {
            wl7.g("callback");
            throw null;
        }
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(final CreateCredentialException createCredentialException) {
        createCredentialException.getClass();
        Executor executor = this.this$0.executor;
        if (executor == null) {
            wl7.g("executor");
            throw null;
        }
        final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.this$0;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.a
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderCreatePublicKeyCredentialController$handleResponse$2.invoke$lambda$0(credentialProviderCreatePublicKeyCredentialController, createCredentialException);
            }
        });
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ j6g invoke(CreateCredentialException createCredentialException) {
        invoke2(createCredentialException);
        return j6g.a;
    }
}
