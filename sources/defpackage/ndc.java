package defpackage;

import com.facebook.react.bridge.Promise;
import com.indeed.android.reactnative.rntarebridge.nav.RNJSTNavigator;
import com.indeed.android.rnmyjobs.RNMyJobsModule;
import com.indeed.android.rnsearch.RNSearchModule;
import defpackage.oq7;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ndc implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Promise b;

    public /* synthetic */ ndc(int i, Promise promise) {
        this.a = i;
        this.b = promise;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Promise promise = this.b;
        switch (i) {
            case 0:
                return RNJSTNavigator.openModal$lambda$15$lambda$13(promise, (oq7.g) obj);
            case 1:
                return RNMyJobsModule.showPushOptInModal$lambda$1$lambda$0(promise, ((Boolean) obj).booleanValue());
            default:
                return RNSearchModule.detectDeviceLocation$lambda$1(promise, (o7d) obj);
        }
    }
}
