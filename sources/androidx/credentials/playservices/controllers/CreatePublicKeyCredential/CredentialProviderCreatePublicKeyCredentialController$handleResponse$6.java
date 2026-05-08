package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import defpackage.et4;
import defpackage.gu5;
import defpackage.j6g;
import defpackage.mj8;
import defpackage.t63;
import defpackage.wl7;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lj6g;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class CredentialProviderCreatePublicKeyCredentialController$handleResponse$6 extends mj8 implements gu5<j6g> {
    final /* synthetic */ JSONException $e;
    final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePublicKeyCredentialController$handleResponse$6(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, JSONException jSONException) {
        super(0);
        this.this$0 = credentialProviderCreatePublicKeyCredentialController;
        this.$e = jSONException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, JSONException jSONException) {
        credentialProviderCreatePublicKeyCredentialController.getClass();
        jSONException.getClass();
        t63 t63Var = credentialProviderCreatePublicKeyCredentialController.callback;
        if (t63Var != null) {
            t63Var.a(new CreatePublicKeyCredentialDomException(new et4(), jSONException.getMessage()));
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
        final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.this$0;
        final JSONException jSONException = this.$e;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.d
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderCreatePublicKeyCredentialController$handleResponse$6.invoke$lambda$0(credentialProviderCreatePublicKeyCredentialController, jSONException);
            }
        });
    }

    @Override // defpackage.gu5
    public /* bridge */ /* synthetic */ j6g invoke() {
        invoke2();
        return j6g.a;
    }
}
