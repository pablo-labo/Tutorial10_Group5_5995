package defpackage;

import android.content.res.AssetManager;
import android.os.Bundle;
import android.util.Log;
import com.facebook.react.bridge.JSBundleLoaderDelegate;
import com.facebook.react.runtime.ReactInstance;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class b36 implements t20, JSBundleLoaderDelegate {
    public final Object a;

    public b36() {
        this.a = new AtomicReference(null);
    }

    public hbe a(JSONObject jSONObject) throws JSONException {
        obe sbeVar;
        int i = jSONObject.getInt("settings_version");
        if (i != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i + ". Using default settings values.", null);
            sbeVar = new iq3();
        } else {
            sbeVar = new sbe();
        }
        return sbeVar.a((ojh) this.a, jSONObject);
    }

    @Override // defpackage.t20
    public void g(Bundle bundle) {
        ((n20) this.a).a("clx", "_ae", bundle);
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public void loadScriptFromAssets(AssetManager assetManager, String str, boolean z) {
        assetManager.getClass();
        str.getClass();
        ReactInstance reactInstance = (ReactInstance) this.a;
        reactInstance.a.b.set(str);
        reactInstance.loadJSBundleFromAssets(assetManager, str);
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public void loadScriptFromFile(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        ReactInstance reactInstance = (ReactInstance) this.a;
        reactInstance.a.b.set(str2);
        reactInstance.loadJSBundleFromFile(str, str2);
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public void loadSplitBundleFromFile(String str, String str2) {
        str.getClass();
        str2.getClass();
        ((ReactInstance) this.a).loadJSBundleFromFile(str, str2);
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public void setSourceURLs(String str, String str2) {
        str.getClass();
        str2.getClass();
        ((ReactInstance) this.a).a.b.set(str);
    }

    public /* synthetic */ b36(Object obj) {
        this.a = obj;
    }
}
