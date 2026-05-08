package androidx.credentials.playservices;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.tasks.Task;
import defpackage.b0;
import defpackage.ceh;
import defpackage.ddh;
import defpackage.fib;
import defpackage.i62;
import defpackage.i73;
import defpackage.l35;
import defpackage.ldh;
import defpackage.ma6;
import defpackage.ndh;
import defpackage.nfa;
import defpackage.oq2;
import defpackage.paf;
import defpackage.qei;
import defpackage.sk3;
import defpackage.t85;
import defpackage.t91;
import defpackage.tf2;
import defpackage.tk3;
import defpackage.u85;
import defpackage.u91;
import defpackage.vf0;
import defpackage.vh6;
import defpackage.yid;
import defpackage.zeh;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0017\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J'\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0003J\u0019\u0010\u0014\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0014\u0010\bJ\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0016\u0010\bJ)\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Landroidx/credentials/playservices/HiddenActivity;", "Landroid/app/Activity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lj6g;", "restoreState", "(Landroid/os/Bundle;)V", "handleCreatePublicKeyCredential", "Landroid/os/ResultReceiver;", "resultReceiver", "", "errName", "errMsg", "setupFailure", "(Landroid/os/ResultReceiver;Ljava/lang/String;Ljava/lang/String;)V", "handleGetSignInIntent", "handleBeginSignIn", "handleCreatePassword", "onCreate", "outState", "onSaveInstanceState", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Landroid/os/ResultReceiver;", "", "mWaitingForActivityResult", "Z", "Companion", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class HiddenActivity extends Activity {
    private static final int DEFAULT_VALUE = 1;
    private static final String KEY_AWAITING_RESULT = "androidx.credentials.playservices.AWAITING_RESULT";
    private static final String TAG = "HiddenActivity";
    private boolean mWaitingForActivityResult;
    private ResultReceiver resultReceiver;

    private final void handleBeginSignIn() {
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) getIntent().getParcelableExtra(CredentialProviderBaseController.REQUEST_TAG);
        int i = 1;
        int intExtra = getIntent().getIntExtra(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, 1);
        Task taskAddOnFailureListener = null;
        if (beginSignInRequest != null) {
            ldh ldhVar = new ldh(this, new zeh());
            new BeginSignInRequest.PasswordRequestOptions(false);
            BeginSignInRequest.GoogleIdTokenRequestOptions.a aVarS0 = BeginSignInRequest.GoogleIdTokenRequestOptions.s0();
            aVarS0.a = false;
            aVarS0.a();
            new BeginSignInRequest.PasskeysRequestOptions(false, null, null);
            new BeginSignInRequest.PasskeyJsonRequestOptions(null, false);
            BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptions = beginSignInRequest.b;
            fib.i(googleIdTokenRequestOptions);
            BeginSignInRequest.PasswordRequestOptions passwordRequestOptions = beginSignInRequest.a;
            fib.i(passwordRequestOptions);
            BeginSignInRequest.PasskeysRequestOptions passkeysRequestOptions = beginSignInRequest.f;
            fib.i(passkeysRequestOptions);
            BeginSignInRequest.PasskeyJsonRequestOptions passkeyJsonRequestOptions = beginSignInRequest.V;
            fib.i(passkeyJsonRequestOptions);
            BeginSignInRequest beginSignInRequest2 = new BeginSignInRequest(passwordRequestOptions, googleIdTokenRequestOptions, ldhVar.k, beginSignInRequest.d, beginSignInRequest.e, passkeysRequestOptions, passkeyJsonRequestOptions);
            paf.a aVarA = paf.a();
            aVarA.c = new Feature[]{ndh.a};
            i62 i62Var = new i62();
            i62Var.a = beginSignInRequest2;
            aVarA.a = i62Var;
            aVarA.b = false;
            aVarA.d = 1553;
            taskAddOnFailureListener = ldhVar.e(0, aVarA.a()).addOnSuccessListener(new tk3(new HiddenActivity$handleBeginSignIn$1$1(this, intExtra), i)).addOnFailureListener(new l35(this, 2));
        }
        if (taskAddOnFailureListener == null) {
            Log.i(TAG, "During begin sign in, params is null, nothing to launch for begin sign in");
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleBeginSignIn$lambda$10$lambda$8(Function1 function1, Object obj) {
        function1.getClass();
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleBeginSignIn$lambda$10$lambda$9(HiddenActivity hiddenActivity, Exception exc) {
        hiddenActivity.getClass();
        exc.getClass();
        String str = ((exc instanceof ApiException) && CredentialProviderBaseController.INSTANCE.getRetryables().contains(Integer.valueOf(((ApiException) exc).getStatusCode()))) ? CredentialProviderBaseController.GET_INTERRUPTED : CredentialProviderBaseController.GET_NO_CREDENTIALS;
        ResultReceiver resultReceiver = hiddenActivity.resultReceiver;
        resultReceiver.getClass();
        hiddenActivity.setupFailure(resultReceiver, str, b0.h(exc, new StringBuilder("During begin sign in, failure response from one tap: ")));
    }

    private final void handleCreatePassword() {
        Task taskAddOnFailureListener;
        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) getIntent().getParcelableExtra(CredentialProviderBaseController.REQUEST_TAG);
        int intExtra = getIntent().getIntExtra(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, 1);
        if (savePasswordRequest != null) {
            ddh ddhVar = new ddh(this, new ceh());
            SavePasswordRequest savePasswordRequest2 = new SavePasswordRequest(savePasswordRequest.a, ddhVar.k, savePasswordRequest.c);
            paf.a aVarA = paf.a();
            aVarA.c = new Feature[]{ndh.b};
            aVarA.a = new qei(ddhVar, savePasswordRequest2);
            aVarA.b = false;
            aVarA.d = 1536;
            taskAddOnFailureListener = ddhVar.e(0, aVarA.a()).addOnSuccessListener(new u91(new HiddenActivity$handleCreatePassword$1$1(this, intExtra), 4)).addOnFailureListener(new tf2(this, 2));
        } else {
            taskAddOnFailureListener = null;
        }
        if (taskAddOnFailureListener == null) {
            Log.i(TAG, "During save password, params is null, nothing to launch for create password");
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleCreatePassword$lambda$14$lambda$12(Function1 function1, Object obj) {
        function1.getClass();
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleCreatePassword$lambda$14$lambda$13(HiddenActivity hiddenActivity, Exception exc) {
        hiddenActivity.getClass();
        exc.getClass();
        String str = ((exc instanceof ApiException) && CredentialProviderBaseController.INSTANCE.getRetryables().contains(Integer.valueOf(((ApiException) exc).getStatusCode()))) ? CredentialProviderBaseController.CREATE_INTERRUPTED : CredentialProviderBaseController.CREATE_UNKNOWN;
        ResultReceiver resultReceiver = hiddenActivity.resultReceiver;
        resultReceiver.getClass();
        hiddenActivity.setupFailure(resultReceiver, str, b0.h(exc, new StringBuilder("During save password, found password failure response from one tap ")));
    }

    private final void handleCreatePublicKeyCredential() {
        HiddenActivity hiddenActivity;
        Task taskAddOnFailureListener;
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) getIntent().getParcelableExtra(CredentialProviderBaseController.REQUEST_TAG);
        int intExtra = getIntent().getIntExtra(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, 1);
        if (publicKeyCredentialCreationOptions != null) {
            int i = u85.a;
            vf0 vf0Var = t85.k;
            yid yidVar = new yid();
            Looper mainLooper = getMainLooper();
            fib.j(mainLooper, "Looper must not be null.");
            ma6.a aVar = new ma6.a(yidVar, mainLooper);
            hiddenActivity = this;
            t85 t85Var = new t85(hiddenActivity, this, vf0Var, vf0.d.g, aVar);
            paf.a aVarA = paf.a();
            aVarA.a = new nfa(t85Var, publicKeyCredentialCreationOptions);
            aVarA.d = 5407;
            taskAddOnFailureListener = t85Var.e(0, aVarA.a()).addOnSuccessListener(new i73(new HiddenActivity$handleCreatePublicKeyCredential$1$1(hiddenActivity, intExtra), 5)).addOnFailureListener(new t91(hiddenActivity, 3));
        } else {
            hiddenActivity = this;
            taskAddOnFailureListener = null;
        }
        if (taskAddOnFailureListener == null) {
            Log.w(TAG, "During create public key credential, request is null, so nothing to launch for public key credentials");
            hiddenActivity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleCreatePublicKeyCredential$lambda$2$lambda$0(Function1 function1, Object obj) {
        function1.getClass();
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleCreatePublicKeyCredential$lambda$2$lambda$1(HiddenActivity hiddenActivity, Exception exc) {
        hiddenActivity.getClass();
        exc.getClass();
        String str = ((exc instanceof ApiException) && CredentialProviderBaseController.INSTANCE.getRetryables().contains(Integer.valueOf(((ApiException) exc).getStatusCode()))) ? CredentialProviderBaseController.CREATE_INTERRUPTED : CredentialProviderBaseController.CREATE_UNKNOWN;
        ResultReceiver resultReceiver = hiddenActivity.resultReceiver;
        resultReceiver.getClass();
        hiddenActivity.setupFailure(resultReceiver, str, b0.h(exc, new StringBuilder("During create public key credential, fido registration failure: ")));
    }

    private final void handleGetSignInIntent() {
        Task taskAddOnFailureListener;
        GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) getIntent().getParcelableExtra(CredentialProviderBaseController.REQUEST_TAG);
        int intExtra = getIntent().getIntExtra(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, 1);
        if (getSignInIntentRequest != null) {
            ldh ldhVar = new ldh(this, new zeh());
            String str = getSignInIntentRequest.a;
            fib.i(str);
            String str2 = getSignInIntentRequest.d;
            String str3 = getSignInIntentRequest.b;
            boolean z = getSignInIntentRequest.e;
            GetSignInIntentRequest getSignInIntentRequest2 = new GetSignInIntentRequest(str, str3, ldhVar.k, getSignInIntentRequest.f, z, str2);
            paf.a aVarA = paf.a();
            aVarA.c = new Feature[]{ndh.c};
            aVarA.a = new oq2(ldhVar, getSignInIntentRequest2);
            aVarA.d = 1555;
            taskAddOnFailureListener = ldhVar.e(0, aVarA.a()).addOnSuccessListener(new sk3(new HiddenActivity$handleGetSignInIntent$1$1(this, intExtra), 2)).addOnFailureListener(new vh6(this, 0));
        } else {
            taskAddOnFailureListener = null;
        }
        if (taskAddOnFailureListener == null) {
            Log.i(TAG, "During get sign-in intent, params is null, nothing to launch for get sign-in intent");
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleGetSignInIntent$lambda$6$lambda$4(Function1 function1, Object obj) {
        function1.getClass();
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleGetSignInIntent$lambda$6$lambda$5(HiddenActivity hiddenActivity, Exception exc) {
        hiddenActivity.getClass();
        exc.getClass();
        String str = ((exc instanceof ApiException) && CredentialProviderBaseController.INSTANCE.getRetryables().contains(Integer.valueOf(((ApiException) exc).getStatusCode()))) ? CredentialProviderBaseController.GET_INTERRUPTED : CredentialProviderBaseController.GET_NO_CREDENTIALS;
        ResultReceiver resultReceiver = hiddenActivity.resultReceiver;
        resultReceiver.getClass();
        hiddenActivity.setupFailure(resultReceiver, str, b0.h(exc, new StringBuilder("During get sign-in intent, failure response from one tap: ")));
    }

    private final void restoreState(Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            this.mWaitingForActivityResult = savedInstanceState.getBoolean(KEY_AWAITING_RESULT, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupFailure(ResultReceiver resultReceiver, String errName, String errMsg) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(CredentialProviderBaseController.FAILURE_RESPONSE_TAG, true);
        bundle.putString(CredentialProviderBaseController.EXCEPTION_TYPE_TAG, errName);
        bundle.putString(CredentialProviderBaseController.EXCEPTION_MESSAGE_TAG, errMsg);
        resultReceiver.send(Integer.MAX_VALUE, bundle);
        finish();
    }

    @Override // android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bundle bundle = new Bundle();
        bundle.putBoolean(CredentialProviderBaseController.FAILURE_RESPONSE_TAG, false);
        bundle.putInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, requestCode);
        bundle.putParcelable(CredentialProviderBaseController.RESULT_DATA_TAG, data);
        ResultReceiver resultReceiver = this.resultReceiver;
        if (resultReceiver != null) {
            resultReceiver.send(resultCode, bundle);
        }
        this.mWaitingForActivityResult = false;
        finish();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(0, 0);
        String stringExtra = getIntent().getStringExtra(CredentialProviderBaseController.TYPE_TAG);
        ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra(CredentialProviderBaseController.RESULT_RECEIVER_TAG);
        this.resultReceiver = resultReceiver;
        if (resultReceiver == null) {
            finish();
        }
        restoreState(savedInstanceState);
        if (this.mWaitingForActivityResult) {
            return;
        }
        if (stringExtra != null) {
            switch (stringExtra.hashCode()) {
                case -441061071:
                    if (stringExtra.equals(CredentialProviderBaseController.BEGIN_SIGN_IN_TAG)) {
                        handleBeginSignIn();
                        return;
                    }
                    break;
                case 15545322:
                    if (stringExtra.equals(CredentialProviderBaseController.CREATE_PUBLIC_KEY_CREDENTIAL_TAG)) {
                        handleCreatePublicKeyCredential();
                        return;
                    }
                    break;
                case 1246634622:
                    if (stringExtra.equals(CredentialProviderBaseController.CREATE_PASSWORD_TAG)) {
                        handleCreatePassword();
                        return;
                    }
                    break;
                case 1980564212:
                    if (stringExtra.equals(CredentialProviderBaseController.SIGN_IN_INTENT_TAG)) {
                        handleGetSignInIntent();
                        return;
                    }
                    break;
            }
        }
        Log.w(TAG, "Activity handed an unsupported type");
        finish();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        outState.getClass();
        outState.putBoolean(KEY_AWAITING_RESULT, this.mWaitingForActivityResult);
        super.onSaveInstanceState(outState);
    }
}
