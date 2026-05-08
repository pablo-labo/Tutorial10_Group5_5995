package androidx.credentials.playservices;

import android.content.Context;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.exceptions.ClearCredentialException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController;
import androidx.credentials.playservices.controllers.CreatePassword.CredentialProviderCreatePasswordController;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController;
import androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import com.google.android.gms.common.ConnectionResult;
import defpackage.b0;
import defpackage.c06;
import defpackage.d06;
import defpackage.d63;
import defpackage.f63;
import defpackage.gu5;
import defpackage.i56;
import defpackage.j6g;
import defpackage.mj8;
import defpackage.na6;
import defpackage.oa6;
import defpackage.t63;
import defpackage.v63;
import defpackage.w63;
import defpackage.x43;
import defpackage.y43;
import defpackage.z62;
import defpackage.zlb;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001-B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJE\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015JE\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00162\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ?\u0010!\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u001e2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0014\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020 0\u000fH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R(\u0010%\u001a\u00020$8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b%\u0010&\u0012\u0004\b+\u0010,\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006."}, d2 = {"Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;", "Lw63;", "Landroid/content/Context;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "<init>", "(Landroid/content/Context;)V", "", "isGooglePlayServicesAvailable", "(Landroid/content/Context;)I", "Lc06;", "request", "Landroid/os/CancellationSignal;", "cancellationSignal", "Ljava/util/concurrent/Executor;", "executor", "Lt63;", "Ld06;", "Landroidx/credentials/exceptions/GetCredentialException;", "callback", "Lj6g;", "onGetCredential", "(Landroid/content/Context;Lc06;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Lt63;)V", "Lx43;", "Ly43;", "Landroidx/credentials/exceptions/CreateCredentialException;", "onCreateCredential", "(Landroid/content/Context;Lx43;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Lt63;)V", "", "isAvailableOnDevice", "()Z", "Lz62;", "Ljava/lang/Void;", "Landroidx/credentials/exceptions/ClearCredentialException;", "onClearCredential", "(Lz62;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Lt63;)V", "Landroid/content/Context;", "Lna6;", "googleApiAvailability", "Lna6;", "getGoogleApiAvailability", "()Lna6;", "setGoogleApiAvailability", "(Lna6;)V", "getGoogleApiAvailability$annotations", "()V", "Companion", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CredentialProviderPlayServicesImpl implements w63 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "PlayServicesImpl";
    private final Context context;
    private na6 googleApiAvailability;

    public CredentialProviderPlayServicesImpl(Context context) {
        context.getClass();
        this.context = context;
        na6 na6Var = na6.d;
        na6Var.getClass();
        this.googleApiAvailability = na6Var;
    }

    public static /* synthetic */ void getGoogleApiAvailability$annotations() {
    }

    private final int isGooglePlayServicesAvailable(Context context) {
        return this.googleApiAvailability.c(context, oa6.a);
    }

    private static final void onClearCredential$lambda$0(Function1 function1, Object obj) {
        function1.getClass();
        function1.invoke(obj);
    }

    private static final void onClearCredential$lambda$2(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, CancellationSignal cancellationSignal, Executor executor, t63 t63Var, Exception exc) {
        credentialProviderPlayServicesImpl.getClass();
        executor.getClass();
        t63Var.getClass();
        exc.getClass();
        INSTANCE.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new CredentialProviderPlayServicesImpl$onClearCredential$2$1$1(exc, executor, t63Var));
    }

    public final na6 getGoogleApiAvailability() {
        return this.googleApiAvailability;
    }

    @Override // defpackage.w63
    public boolean isAvailableOnDevice() {
        int iIsGooglePlayServicesAvailable = isGooglePlayServicesAvailable(this.context);
        boolean z = iIsGooglePlayServicesAvailable == 0;
        if (!z) {
            Log.w(TAG, "Connection with Google Play Services was not successful. Connection result is: " + new ConnectionResult(iIsGooglePlayServicesAvailable, null, null));
        }
        return z;
    }

    public void onClearCredential(z62 request, CancellationSignal cancellationSignal, Executor executor, t63<Void, ClearCredentialException> callback) {
        throw null;
    }

    public void onCreateCredential(Context context, x43 request, CancellationSignal cancellationSignal, Executor executor, t63<y43, CreateCredentialException> callback) {
        context.getClass();
        request.getClass();
        executor.getClass();
        callback.getClass();
        if (INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        if (request instanceof d63) {
            CredentialProviderCreatePasswordController.INSTANCE.getInstance(context).invokePlayServices((d63) request, callback, executor, cancellationSignal);
        } else if (request instanceof f63) {
            CredentialProviderCreatePublicKeyCredentialController.INSTANCE.getInstance(context).invokePlayServices((f63) request, callback, executor, cancellationSignal);
        } else {
            b0.u("Create Credential request is unsupported, not password or publickeycredential");
        }
    }

    @Override // defpackage.w63
    public void onGetCredential(Context context, c06 request, CancellationSignal cancellationSignal, Executor executor, t63<d06, GetCredentialException> callback) {
        context.getClass();
        request.getClass();
        executor.getClass();
        callback.getClass();
        Companion companion = INSTANCE;
        if (companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        if (companion.isGetSignInIntentRequest$credentials_play_services_auth_release(request)) {
            new CredentialProviderGetSignInIntentController(context).invokePlayServices(request, callback, executor, cancellationSignal);
        } else {
            new CredentialProviderBeginSignInController(context).invokePlayServices(request, callback, executor, cancellationSignal);
        }
    }

    public void onPrepareCredential(c06 c06Var, CancellationSignal cancellationSignal, Executor executor, t63 t63Var) {
        c06Var.getClass();
        executor.getClass();
        t63Var.getClass();
    }

    public final void setGoogleApiAvailability(na6 na6Var) {
        na6Var.getClass();
        this.googleApiAvailability = na6Var;
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000f\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl$Companion;", "", "<init>", "()V", "Landroid/os/CancellationSignal;", "cancellationSignal", "Lkotlin/Function0;", "Lj6g;", "callback", "cancellationReviewerWithCallback$credentials_play_services_auth_release", "(Landroid/os/CancellationSignal;Lgu5;)V", "cancellationReviewerWithCallback", "", "cancellationReviewer$credentials_play_services_auth_release", "(Landroid/os/CancellationSignal;)Z", "cancellationReviewer", "Lc06;", "request", "isGetSignInIntentRequest$credentials_play_services_auth_release", "(Lc06;)Z", "isGetSignInIntentRequest", "", "TAG", "Ljava/lang/String;", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean cancellationReviewer$credentials_play_services_auth_release(CancellationSignal cancellationSignal) {
            if (cancellationSignal == null) {
                Log.i(CredentialProviderPlayServicesImpl.TAG, "No cancellationSignal found");
                return false;
            }
            if (!cancellationSignal.isCanceled()) {
                return false;
            }
            Log.i(CredentialProviderPlayServicesImpl.TAG, "the flow has been canceled");
            return true;
        }

        public final void cancellationReviewerWithCallback$credentials_play_services_auth_release(CancellationSignal cancellationSignal, gu5<j6g> callback) {
            callback.getClass();
            if (cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
                return;
            }
            callback.invoke();
        }

        public final boolean isGetSignInIntentRequest$credentials_play_services_auth_release(c06 request) {
            request.getClass();
            Iterator<v63> it = request.a.iterator();
            while (it.hasNext()) {
                if (it.next() instanceof i56) {
                    return true;
                }
            }
            return false;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onClearCredential$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/Void;", "kotlin.jvm.PlatformType", "it", "Lj6g;", "invoke", "(Ljava/lang/Void;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends mj8 implements Function1<Void, j6g> {
        final /* synthetic */ t63<Void, ClearCredentialException> $callback;
        final /* synthetic */ CancellationSignal $cancellationSignal;
        final /* synthetic */ Executor $executor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CancellationSignal cancellationSignal, Executor executor, t63<Void, ClearCredentialException> t63Var) {
            super(1);
            this.$cancellationSignal = cancellationSignal;
            this.$executor = executor;
            this.$callback = t63Var;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Void r4) {
            CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewerWithCallback$credentials_play_services_auth_release(this.$cancellationSignal, new C00291(this.$executor, this.$callback));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ j6g invoke(Void r1) {
            invoke2(r1);
            return j6g.a;
        }

        /* JADX INFO: renamed from: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onClearCredential$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lj6g;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class C00291 extends mj8 implements gu5<j6g> {
            final /* synthetic */ t63<Void, ClearCredentialException> $callback;
            final /* synthetic */ Executor $executor;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00291(Executor executor, t63<Void, ClearCredentialException> t63Var) {
                super(0);
                this.$executor = executor;
                this.$callback = t63Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void invoke$lambda$0(t63 t63Var) {
                t63Var.getClass();
                t63Var.onResult(null);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Log.i(CredentialProviderPlayServicesImpl.TAG, "During clear credential, signed out successfully!");
                Executor executor = this.$executor;
                final t63<Void, ClearCredentialException> t63Var = this.$callback;
                executor.execute(new Runnable() { // from class: androidx.credentials.playservices.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        CredentialProviderPlayServicesImpl.AnonymousClass1.C00291.invoke$lambda$0(t63Var);
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

    public void onGetCredential(Context context, zlb zlbVar, CancellationSignal cancellationSignal, Executor executor, t63 t63Var) {
        context.getClass();
        throw null;
    }
}
