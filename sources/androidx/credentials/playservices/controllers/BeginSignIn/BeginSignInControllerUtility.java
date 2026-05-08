package androidx.credentials.playservices.controllers.BeginSignIn;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import defpackage.c06;
import defpackage.c36;
import defpackage.fib;
import defpackage.j06;
import defpackage.v63;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/credentials/playservices/controllers/BeginSignIn/BeginSignInControllerUtility;", "", "()V", "Companion", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BeginSignInControllerUtility {
    private static final long AUTH_MIN_VERSION_JSON_PARSING = 231815000;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "BeginSignInUtility";

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/credentials/playservices/controllers/BeginSignIn/BeginSignInControllerUtility$Companion;", "", "<init>", "()V", "Landroid/content/Context;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "", "determineDeviceGMSVersionCode", "(Landroid/content/Context;)J", "curAuthVersion", "", "needsBackwardsCompatibleRequest", "(J)Z", "Lj06;", "option", "Lcom/google/android/gms/auth/api/identity/BeginSignInRequest$GoogleIdTokenRequestOptions;", "convertToGoogleIdTokenOption", "(Lj06;)Lcom/google/android/gms/auth/api/identity/BeginSignInRequest$GoogleIdTokenRequestOptions;", "Lc06;", "request", "Lcom/google/android/gms/auth/api/identity/BeginSignInRequest;", "constructBeginSignInRequest$credentials_play_services_auth_release", "(Lc06;Landroid/content/Context;)Lcom/google/android/gms/auth/api/identity/BeginSignInRequest;", "constructBeginSignInRequest", "AUTH_MIN_VERSION_JSON_PARSING", "J", "", "TAG", "Ljava/lang/String;", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final BeginSignInRequest.GoogleIdTokenRequestOptions convertToGoogleIdTokenOption(j06 option) {
            BeginSignInRequest.GoogleIdTokenRequestOptions.a aVarS0 = BeginSignInRequest.GoogleIdTokenRequestOptions.s0();
            option.getClass();
            aVarS0.b = false;
            fib.f(null);
            aVarS0.a = true;
            return aVarS0.a();
        }

        private final long determineDeviceGMSVersionCode(Context context) {
            context.getPackageManager().getClass();
            return r1.getPackageInfo("com.google.android.gms", 0).versionCode;
        }

        private final boolean needsBackwardsCompatibleRequest(long curAuthVersion) {
            return curAuthVersion < BeginSignInControllerUtility.AUTH_MIN_VERSION_JSON_PARSING;
        }

        public final BeginSignInRequest constructBeginSignInRequest$credentials_play_services_auth_release(c06 request, Context context) throws JSONException {
            request.getClass();
            context.getClass();
            boolean z = false;
            BeginSignInRequest.PasswordRequestOptions passwordRequestOptions = new BeginSignInRequest.PasswordRequestOptions(false);
            BeginSignInRequest.GoogleIdTokenRequestOptions.a aVarS0 = BeginSignInRequest.GoogleIdTokenRequestOptions.s0();
            aVarS0.a = false;
            BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptionsA = aVarS0.a();
            BeginSignInRequest.PasskeysRequestOptions passkeysRequestOptions = new BeginSignInRequest.PasskeysRequestOptions(false, null, null);
            BeginSignInRequest.PasskeyJsonRequestOptions passkeyJsonRequestOptions = new BeginSignInRequest.PasskeyJsonRequestOptions(null, false);
            BeginSignInRequest.PasskeysRequestOptions passkeysRequestOptions2 = passkeysRequestOptions;
            BeginSignInRequest.PasskeyJsonRequestOptions passkeyJsonRequestOptions2 = passkeyJsonRequestOptions;
            for (v63 v63Var : request.a) {
                if ((v63Var instanceof c36) && !z) {
                    if (needsBackwardsCompatibleRequest(determineDeviceGMSVersionCode(context))) {
                        BeginSignInRequest.PasskeysRequestOptions passkeysRequestOptionsConvertToPlayAuthPasskeyRequest = PublicKeyCredentialControllerUtility.INSTANCE.convertToPlayAuthPasskeyRequest((c36) v63Var);
                        fib.i(passkeysRequestOptionsConvertToPlayAuthPasskeyRequest);
                        passkeysRequestOptions2 = passkeysRequestOptionsConvertToPlayAuthPasskeyRequest;
                    } else {
                        BeginSignInRequest.PasskeyJsonRequestOptions passkeyJsonRequestOptionsConvertToPlayAuthPasskeyJsonRequest = PublicKeyCredentialControllerUtility.INSTANCE.convertToPlayAuthPasskeyJsonRequest((c36) v63Var);
                        fib.i(passkeyJsonRequestOptionsConvertToPlayAuthPasskeyJsonRequest);
                        passkeyJsonRequestOptions2 = passkeyJsonRequestOptionsConvertToPlayAuthPasskeyJsonRequest;
                    }
                    z = true;
                } else if (v63Var instanceof j06) {
                    googleIdTokenRequestOptionsA = convertToGoogleIdTokenOption((j06) v63Var);
                    fib.i(googleIdTokenRequestOptionsA);
                }
            }
            return new BeginSignInRequest(passwordRequestOptions, googleIdTokenRequestOptionsA, null, false, 0, passkeysRequestOptions2, passkeyJsonRequestOptions2);
        }

        private Companion() {
        }
    }
}
