package defpackage;

import com.facebook.react.bridge.Promise;
import com.indeed.android.reactnative.rntarebridge.RNTareBridge;
import com.indeed.android.reactnative.rntarebridge.nav.RNJSTNavigator;
import com.indeed.android.rninterviewprep.RNResumeCoachModule;
import defpackage.oq7;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tdc implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Promise b;

    public /* synthetic */ tdc(int i, Promise promise) {
        this.a = i;
        this.b = promise;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Promise promise = this.b;
        switch (i) {
            case 0:
                return RNJSTNavigator.openModal$lambda$15$lambda$6(promise, (oq7.l) obj);
            case 1:
                return RNResumeCoachModule.requestMicrophonePermission$lambda$1$lambda$0(promise, ((Boolean) obj).booleanValue());
            default:
                return RNTareBridge.openLoginModal$lambda$153$lambda$152(promise, (oq7.g) obj);
        }
    }
}
