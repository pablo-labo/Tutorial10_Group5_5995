package defpackage;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReadableMap;
import com.indeed.android.reactnative.rntarebridge.RNTareBridge;
import com.indeed.android.reactnative.rntarebridge.nav.RNJSTNavigator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rdc implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ ReactContextBaseJavaModule d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ rdc(lr5 lr5Var, String str, RNTareBridge rNTareBridge, os7 os7Var, ur7 ur7Var) {
        this.c = lr5Var;
        this.b = str;
        this.d = rNTareBridge;
        this.e = os7Var;
        this.f = ur7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        ReactContextBaseJavaModule reactContextBaseJavaModule = this.d;
        String str = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                RNJSTNavigator.showRNModal$lambda$19(str, (RNJSTNavigator) reactContextBaseJavaModule, (Promise) obj2, (ReadableMap) obj, (String) obj3);
                break;
            default:
                RNTareBridge.presentResumeOtherSectionForm$lambda$14((lr5) obj3, str, (RNTareBridge) reactContextBaseJavaModule, (os7) obj2, (ur7) obj);
                break;
        }
    }

    public /* synthetic */ rdc(String str, RNJSTNavigator rNJSTNavigator, Promise promise, ReadableMap readableMap, String str2) {
        this.b = str;
        this.d = rNJSTNavigator;
        this.e = promise;
        this.f = readableMap;
        this.c = str2;
    }
}
