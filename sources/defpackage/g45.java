package defpackage;

import android.os.Handler;
import android.speech.RecognitionSupport;
import android.speech.RecognitionSupportCallback;
import android.speech.SpeechRecognizer;
import android.util.Log;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class g45 implements RecognitionSupportCallback {
    public final /* synthetic */ huc a;
    public final /* synthetic */ p3c b;
    public final /* synthetic */ SpeechRecognizer c;
    public final /* synthetic */ ReactApplicationContext d;

    public g45(huc hucVar, p3c p3cVar, SpeechRecognizer speechRecognizer, ReactApplicationContext reactApplicationContext) {
        this.a = hucVar;
        this.b = p3cVar;
        this.c = speechRecognizer;
        this.d = reactApplicationContext;
    }

    public final void onError(int i) {
        Log.e("ExpoSpeechService", "getSupportedLocales.onError() called with error code: " + i);
        new Handler(this.d.getMainLooper()).postDelayed(new z34(this.a, this.b, i), 50L);
        this.c.destroy();
    }

    public final void onSupportResult(RecognitionSupport recognitionSupport) {
        recognitionSupport.getClass();
        Log.d("ExpoSpeechService", "onSupportResult() called with recognitionSupport: " + recognitionSupport);
        huc hucVar = this.a;
        if (hucVar.element) {
            return;
        }
        hucVar.element = true;
        List<String> installedOnDeviceLanguages = recognitionSupport.getInstalledOnDeviceLanguages();
        installedOnDeviceLanguages.getClass();
        List<String> supportedOnDeviceLanguages = recognitionSupport.getSupportedOnDeviceLanguages();
        supportedOnDeviceLanguages.getClass();
        Set setD1 = z92.D1(supportedOnDeviceLanguages);
        w92.w0(setD1, installedOnDeviceLanguages);
        List<String> onlineLanguages = recognitionSupport.getOnlineLanguages();
        onlineLanguages.getClass();
        Set setD12 = z92.D1(setD1);
        w92.w0(setD12, onlineLanguages);
        this.b.f(lc9.a0(new Pair("locales", z92.o1(setD12)), new Pair("installedLocales", installedOnDeviceLanguages)));
        this.c.destroy();
    }
}
