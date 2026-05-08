package androidx.credentials.playservices.controllers.CreatePassword;

import android.os.CancellationSignal;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import defpackage.gu5;
import defpackage.j6g;
import defpackage.mj8;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/os/CancellationSignal;", "s", "Lkotlin/Function0;", "Lj6g;", "f", "invoke", "(Landroid/os/CancellationSignal;Lgu5;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class CredentialProviderCreatePasswordController$handleResponse$1 extends mj8 implements Function2<CancellationSignal, gu5<? extends j6g>, j6g> {
    public static final CredentialProviderCreatePasswordController$handleResponse$1 INSTANCE = new CredentialProviderCreatePasswordController$handleResponse$1();

    public CredentialProviderCreatePasswordController$handleResponse$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ j6g invoke(CancellationSignal cancellationSignal, gu5<? extends j6g> gu5Var) {
        invoke2(cancellationSignal, (gu5<j6g>) gu5Var);
        return j6g.a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CancellationSignal cancellationSignal, gu5<j6g> gu5Var) {
        gu5Var.getClass();
        CredentialProviderController.Companion companion = CredentialProviderController.INSTANCE;
        CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, gu5Var);
    }
}
