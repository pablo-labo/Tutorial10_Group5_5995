package androidx.credentials.playservices;

import android.content.IntentSender;
import android.os.ResultReceiver;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import defpackage.j6g;
import defpackage.mj8;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/android/gms/auth/api/identity/SavePasswordResult;", "kotlin.jvm.PlatformType", "it", "Lj6g;", "invoke", "(Lcom/google/android/gms/auth/api/identity/SavePasswordResult;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class HiddenActivity$handleCreatePassword$1$1 extends mj8 implements Function1<SavePasswordResult, j6g> {
    final /* synthetic */ int $requestCode;
    final /* synthetic */ HiddenActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HiddenActivity$handleCreatePassword$1$1(HiddenActivity hiddenActivity, int i) {
        super(1);
        this.this$0 = hiddenActivity;
        this.$requestCode = i;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(SavePasswordResult savePasswordResult) {
        try {
            this.this$0.mWaitingForActivityResult = true;
            this.this$0.startIntentSenderForResult(savePasswordResult.a.getIntentSender(), this.$requestCode, null, 0, 0, 0, null);
        } catch (IntentSender.SendIntentException e) {
            HiddenActivity hiddenActivity = this.this$0;
            ResultReceiver resultReceiver = hiddenActivity.resultReceiver;
            resultReceiver.getClass();
            hiddenActivity.setupFailure(resultReceiver, CredentialProviderBaseController.CREATE_UNKNOWN, "During save password, found UI intent sender failure: " + e.getMessage());
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ j6g invoke(SavePasswordResult savePasswordResult) {
        invoke2(savePasswordResult);
        return j6g.a;
    }
}
