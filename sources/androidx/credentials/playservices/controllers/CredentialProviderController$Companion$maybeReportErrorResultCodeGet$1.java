package androidx.credentials.playservices.controllers;

import androidx.credentials.exceptions.GetCredentialException;
import defpackage.gu5;
import defpackage.j6g;
import defpackage.luc;
import defpackage.mj8;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u0000\"\b\b\u0004\u0010\u0005*\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "T1", "T2", "R2", "R1", "E1", "Lj6g;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class CredentialProviderController$Companion$maybeReportErrorResultCodeGet$1 extends mj8 implements gu5<j6g> {
    final /* synthetic */ luc<GetCredentialException> $exception;
    final /* synthetic */ Function1<GetCredentialException, j6g> $onError;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CredentialProviderController$Companion$maybeReportErrorResultCodeGet$1(Function1<? super GetCredentialException, j6g> function1, luc<GetCredentialException> lucVar) {
        super(0);
        this.$onError = function1;
        this.$exception = lucVar;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onError.invoke(this.$exception.element);
    }

    @Override // defpackage.gu5
    public /* bridge */ /* synthetic */ j6g invoke() {
        invoke2();
        return j6g.a;
    }
}
