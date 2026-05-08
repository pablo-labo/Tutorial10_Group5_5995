package defpackage;

import com.facebook.react.bridge.Promise;
import com.indeed.android.myjobs.rnnextstepsdashboard.RNNextStepsDashboardModule;
import com.indeed.android.reactnative.rntarebridge.RNTareBridge;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xdc implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Promise b;

    public /* synthetic */ xdc(int i, Promise promise) {
        this.a = i;
        this.b = promise;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Promise promise = this.b;
        switch (i) {
            case 0:
                return RNNextStepsDashboardModule.showPushOptInModal$lambda$4$lambda$3(promise, ((Boolean) obj).booleanValue());
            default:
                return RNTareBridge.openShareSheet$lambda$10(promise, (nt7) obj);
        }
    }
}
