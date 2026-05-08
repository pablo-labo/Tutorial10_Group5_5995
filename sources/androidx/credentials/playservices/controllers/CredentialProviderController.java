package androidx.credentials.playservices.controllers;

import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.credentials.exceptions.CreateCredentialCancellationException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import defpackage.bg;
import defpackage.gu5;
import defpackage.j6g;
import defpackage.luc;
import defpackage.mj8;
import defpackage.t63;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u0000 #*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u0001*\b\b\u0002\u0010\u0004*\u00020\u0001*\b\b\u0003\u0010\u0005*\u00020\u0001*\b\b\u0004\u0010\u0006*\u00020\u00012\u00020\u0007:\u0001#B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ[\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\f2\u001c\u0010\u0010\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00028\u00040\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0004¢\u0006\u0004\b\u0018\u0010\u0019J=\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00028\u00002\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u00132\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00028\u00012\u0006\u0010\u001a\u001a\u00028\u0000H$¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00028\u00032\u0006\u0010 \u001a\u00028\u0002H$¢\u0006\u0004\b!\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"¨\u0006$"}, d2 = {"Landroidx/credentials/playservices/controllers/CredentialProviderController;", "", "T1", "T2", "R2", "R1", "E1", "Landroidx/credentials/playservices/controllers/CredentialProviderBaseController;", "Landroid/content/Context;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "<init>", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "resultData", "Lkotlin/Function2;", "", "conversionFn", "Ljava/util/concurrent/Executor;", "executor", "Lt63;", "callback", "Landroid/os/CancellationSignal;", "cancellationSignal", "", "maybeReportErrorFromResultReceiver", "(Landroid/os/Bundle;Lkotlin/jvm/functions/Function2;Ljava/util/concurrent/Executor;Lt63;Landroid/os/CancellationSignal;)Z", "request", "Lj6g;", "invokePlayServices", "(Ljava/lang/Object;Lt63;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "convertRequestToPlayServices", "(Ljava/lang/Object;)Ljava/lang/Object;", "response", "convertResponseToCredentialManager", "Landroid/content/Context;", "Companion", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class CredentialProviderController<T1, T2, R2, R1, E1> extends CredentialProviderBaseController {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String ERROR_MESSAGE_START_ACTIVITY_FAILED = "Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.";
    private final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderController(Context context) {
        super(context);
        context.getClass();
        this.context = context;
    }

    public static final void cancelOrCallbackExceptionOrResult(CancellationSignal cancellationSignal, gu5<j6g> gu5Var) {
        INSTANCE.cancelOrCallbackExceptionOrResult(cancellationSignal, gu5Var);
    }

    public static final boolean maybeReportErrorResultCodeCreate(int i, Function2<? super CancellationSignal, ? super gu5<j6g>, j6g> function2, Function1<? super CreateCredentialException, j6g> function1, CancellationSignal cancellationSignal) {
        return INSTANCE.maybeReportErrorResultCodeCreate(i, function2, function1, cancellationSignal);
    }

    public static final boolean maybeReportErrorResultCodeGet(int i, Function2<? super CancellationSignal, ? super gu5<j6g>, j6g> function2, Function1<? super GetCredentialException, j6g> function1, CancellationSignal cancellationSignal) {
        return INSTANCE.maybeReportErrorResultCodeGet(i, function2, function1, cancellationSignal);
    }

    public abstract T2 convertRequestToPlayServices(T1 request);

    public abstract R1 convertResponseToCredentialManager(R2 response);

    public abstract void invokePlayServices(T1 request, t63<R1, E1> callback, Executor executor, CancellationSignal cancellationSignal);

    public final boolean maybeReportErrorFromResultReceiver(Bundle resultData, Function2<? super String, ? super String, ? extends E1> conversionFn, Executor executor, t63<R1, E1> callback, CancellationSignal cancellationSignal) {
        resultData.getClass();
        conversionFn.getClass();
        executor.getClass();
        callback.getClass();
        if (!resultData.getBoolean(CredentialProviderBaseController.FAILURE_RESPONSE_TAG)) {
            return false;
        }
        cancelOrCallbackExceptionOrResult(cancellationSignal, new AnonymousClass1(executor, callback, conversionFn.invoke(resultData.getString(CredentialProviderBaseController.EXCEPTION_TYPE_TAG), resultData.getString(CredentialProviderBaseController.EXCEPTION_MESSAGE_TAG))));
        return true;
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JW\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042 \u0010\n\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\t0\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0018\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0016\u0010\u0017JW\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042 \u0010\n\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\t0\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\t0\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0005¢\u0006\u0004\b\u001a\u0010\u0011J'\u0010\u001c\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0005¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00128\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Landroidx/credentials/playservices/controllers/CredentialProviderController$Companion;", "", "<init>", "()V", "", "resultCode", "Lkotlin/Function2;", "Landroid/os/CancellationSignal;", "Lkotlin/Function0;", "Lj6g;", "cancelOnError", "Lkotlin/Function1;", "Landroidx/credentials/exceptions/CreateCredentialException;", "onError", "cancellationSignal", "", "maybeReportErrorResultCodeCreate", "(ILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroid/os/CancellationSignal;)Z", "", "generateErrorStringUnknown$credentials_play_services_auth_release", "(I)Ljava/lang/String;", "generateErrorStringUnknown", "generateErrorStringCanceled$credentials_play_services_auth_release", "()Ljava/lang/String;", "generateErrorStringCanceled", "Landroidx/credentials/exceptions/GetCredentialException;", "maybeReportErrorResultCodeGet", "onResultOrException", "cancelOrCallbackExceptionOrResult", "(Landroid/os/CancellationSignal;Lgu5;)V", "ERROR_MESSAGE_START_ACTIVITY_FAILED", "Ljava/lang/String;", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void cancelOrCallbackExceptionOrResult(CancellationSignal cancellationSignal, gu5<j6g> onResultOrException) {
            onResultOrException.getClass();
            if (CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
                return;
            }
            onResultOrException.invoke();
        }

        public final String generateErrorStringCanceled$credentials_play_services_auth_release() {
            return "activity is cancelled by the user.";
        }

        public final String generateErrorStringUnknown$credentials_play_services_auth_release(int resultCode) {
            return bg.d(resultCode, "activity with result code: ", " indicating not RESULT_OK");
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [T, androidx.credentials.exceptions.CreateCredentialUnknownException] */
        /* JADX WARN: Type inference failed for: r4v1, types: [T, androidx.credentials.exceptions.CreateCredentialCancellationException] */
        public final boolean maybeReportErrorResultCodeCreate(int resultCode, Function2<? super CancellationSignal, ? super gu5<j6g>, j6g> cancelOnError, Function1<? super CreateCredentialException, j6g> onError, CancellationSignal cancellationSignal) {
            cancelOnError.getClass();
            onError.getClass();
            if (resultCode == -1) {
                return false;
            }
            luc lucVar = new luc();
            lucVar.element = new CreateCredentialUnknownException(generateErrorStringUnknown$credentials_play_services_auth_release(resultCode));
            if (resultCode == 0) {
                lucVar.element = new CreateCredentialCancellationException(generateErrorStringCanceled$credentials_play_services_auth_release());
            }
            cancelOnError.invoke(cancellationSignal, new CredentialProviderController$Companion$maybeReportErrorResultCodeCreate$1(onError, lucVar));
            return true;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [T, androidx.credentials.exceptions.GetCredentialUnknownException] */
        /* JADX WARN: Type inference failed for: r4v1, types: [T, androidx.credentials.exceptions.GetCredentialCancellationException] */
        public final boolean maybeReportErrorResultCodeGet(int resultCode, Function2<? super CancellationSignal, ? super gu5<j6g>, j6g> cancelOnError, Function1<? super GetCredentialException, j6g> onError, CancellationSignal cancellationSignal) {
            cancelOnError.getClass();
            onError.getClass();
            if (resultCode == -1) {
                return false;
            }
            luc lucVar = new luc();
            lucVar.element = new GetCredentialUnknownException(generateErrorStringUnknown$credentials_play_services_auth_release(resultCode));
            if (resultCode == 0) {
                lucVar.element = new GetCredentialCancellationException(generateErrorStringCanceled$credentials_play_services_auth_release());
            }
            cancelOnError.invoke(cancellationSignal, new CredentialProviderController$Companion$maybeReportErrorResultCodeGet$1(onError, lucVar));
            return true;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.credentials.playservices.controllers.CredentialProviderController$maybeReportErrorFromResultReceiver$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u0000\"\b\b\u0004\u0010\u0005*\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "T1", "T2", "R2", "R1", "E1", "Lj6g;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends mj8 implements gu5<j6g> {
        final /* synthetic */ t63<R1, E1> $callback;
        final /* synthetic */ E1 $exception;
        final /* synthetic */ Executor $executor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Executor executor, t63<R1, E1> t63Var, E1 e1) {
            super(0);
            this.$executor = executor;
            this.$callback = t63Var;
            this.$exception = e1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(t63 t63Var, Object obj) {
            t63Var.getClass();
            obj.getClass();
            t63Var.a(obj);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Executor executor = this.$executor;
            final t63<R1, E1> t63Var = this.$callback;
            final E1 e1 = this.$exception;
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.a
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderController.AnonymousClass1.invoke$lambda$0(t63Var, e1);
                }
            });
        }

        @Override // defpackage.gu5
        public /* bridge */ /* synthetic */ j6g invoke() {
            invoke2();
            return j6g.a;
        }
    }
}
