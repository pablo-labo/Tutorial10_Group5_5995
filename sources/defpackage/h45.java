package defpackage;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.media.AudioRecord;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.speech.RecognitionListener;
import android.speech.SpeechRecognizer;
import android.util.Log;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.bridge.ReactApplicationContext;
import expo.modules.speechrecognition.SpeechRecognitionOptions;
import expo.modules.speechrecognition.VolumeChangeEventOptions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class h45 implements RecognitionListener {
    public final ReactApplicationContext a;
    public Function2<? super String, ? super Map<String, ? extends Object>, j6g> b;
    public SpeechRecognizer c;
    public SpeechRecognitionOptions e;
    public long f;
    public x35 g;
    public qs3 h;
    public String i;
    public Float j;
    public final Handler d = new Handler(Looper.getMainLooper());
    public ssc k = ssc.a;

    public static final class a {
        @SuppressLint({"QueryPermissionsNeeded"})
        public static ComponentName a(ReactApplicationContext reactApplicationContext, String str) throws Exception {
            str.getClass();
            List<ResolveInfo> listQueryIntentServices = reactApplicationContext.getPackageManager().queryIntentServices(new Intent("android.speech.RecognitionService"), 0);
            listQueryIntentServices.getClass();
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                if (wl7.b(resolveInfo.serviceInfo.packageName, str)) {
                    Log.d("ExpoSpeechService", "Found service for package " + str + ": " + resolveInfo.serviceInfo.name);
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    return new ComponentName(serviceInfo.packageName, serviceInfo.name);
                }
            }
            throw new Exception("No service found for package ".concat(str));
        }
    }

    public h45(ReactApplicationContext reactApplicationContext, e45 e45Var) {
        this.a = reactApplicationContext;
        this.b = e45Var;
    }

    public static void a(h45 h45Var, SpeechRecognitionOptions speechRecognitionOptions) {
        d("Start recognition.");
        SpeechRecognizer speechRecognizer = h45Var.c;
        if (speechRecognizer != null) {
            speechRecognizer.destroy();
        }
        x35 x35Var = h45Var.g;
        if (x35Var != null) {
            x35Var.a();
        }
        h45Var.g = null;
        qs3 qs3Var = h45Var.h;
        if (qs3Var != null) {
            try {
                qs3Var.b.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        h45Var.h = null;
        h45Var.i = null;
        h45Var.j = null;
        h45Var.k = ssc.b;
        h45Var.f = 0L;
        try {
            Intent intentB = h45Var.b(speechRecognitionOptions);
            ReactApplicationContext reactApplicationContext = h45Var.a;
            h45Var.c = (Build.VERSION.SDK_INT < 33 || !wl7.b(speechRecognitionOptions.getRequiresOnDeviceRecognition(), Boolean.TRUE)) ? speechRecognitionOptions.getAndroidRecognitionServicePackage() != null ? SpeechRecognizer.createSpeechRecognizer(reactApplicationContext, a.a(reactApplicationContext, speechRecognitionOptions.getAndroidRecognitionServicePackage())) : SpeechRecognizer.createSpeechRecognizer(reactApplicationContext) : SpeechRecognizer.createOnDeviceSpeechRecognizer(reactApplicationContext);
            x35 x35Var2 = h45Var.g;
            if (x35Var2 != null) {
                AudioRecord audioRecord = new AudioRecord(6, x35Var2.h, x35Var2.i, 2, x35Var2.k);
                x35Var2.b = audioRecord;
                if (audioRecord.getState() == 1) {
                    audioRecord.startRecording();
                    x35Var2.l = true;
                    new flf(new n30(x35Var2, 5)).start();
                }
            }
            SpeechRecognizer speechRecognizer2 = h45Var.c;
            if (speechRecognizer2 != null) {
                speechRecognizer2.setRecognitionListener(h45Var);
            }
            SpeechRecognizer speechRecognizer3 = h45Var.c;
            if (speechRecognizer3 != null) {
                speechRecognizer3.startListening(intentB);
            }
            qs3 qs3Var2 = h45Var.h;
            if (qs3Var2 != null) {
                eq3 eq3Var = a74.a;
                u63.Y(f13.a(no3.c), null, null, new os3(qs3Var2, null), 3);
            }
            Function2<? super String, ? super Map<String, ? extends Object>, j6g> function2 = h45Var.b;
            x35 x35Var3 = h45Var.g;
            function2.invoke("audiostart", kc9.W(new Pair("uri", x35Var3 != null ? x35Var3.d : null)));
        } catch (Exception e2) {
            String localizedMessage = e2.getLocalizedMessage() != null ? e2.getLocalizedMessage() : e2.getMessage() != null ? e2.getMessage() : "Unknown error";
            e2.printStackTrace();
            d("Failed to create Speech Recognizer with error: " + localizedMessage);
            h45Var.b.invoke("error", lc9.a0(new Pair("error", "audio-capture"), new Pair("message", localizedMessage), new Pair("code", -1)));
            e(h45Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARN: Type inference failed for: r9v4, types: [zr4] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList c(android.os.Bundle r23) {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h45.c(android.os.Bundle):java.util.ArrayList");
    }

    public static void d(String str) {
        Log.d("ExpoSpeechService", str);
    }

    public static void e(h45 h45Var) {
        h45Var.k = ssc.d;
        h45Var.d.post(new cg2(1, h45Var, ssc.a));
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x03c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.content.Intent b(expo.modules.speechrecognition.SpeechRecognitionOptions r23) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1033
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h45.b(expo.modules.speechrecognition.SpeechRecognitionOptions):android.content.Intent");
    }

    @Override // android.speech.RecognitionListener
    public final void onBeginningOfSpeech() {
        this.b.invoke("speechstart", null);
    }

    @Override // android.speech.RecognitionListener
    public final void onBufferReceived(byte[] bArr) {
    }

    @Override // android.speech.RecognitionListener
    public final void onEndOfSegmentedSession() {
        d("onEndOfSegmentedSession()");
        e(this);
    }

    @Override // android.speech.RecognitionListener
    public final void onEndOfSpeech() {
        this.b.invoke("speechend", null);
        d("onEndOfSpeech()");
    }

    @Override // android.speech.RecognitionListener
    public final void onError(int i) {
        String str;
        String str2 = "language-not-supported";
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 11:
                str2 = "network";
                break;
            case 3:
                str2 = "audio-capture";
                break;
            case 5:
                str2 = "client";
                break;
            case 6:
                str2 = "speech-timeout";
                break;
            case 7:
                str2 = "no-speech";
                break;
            case 8:
                str2 = "busy";
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                str2 = "service-not-allowed";
                break;
            case 10:
                str2 = "too-many-requests";
                break;
            case 12:
            case 13:
                break;
            default:
                str2 = "unknown";
                break;
        }
        switch (i) {
            case 1:
                str = "Network operation timed out.";
                break;
            case 2:
                str = "Other network related errors.";
                break;
            case 3:
                str = "Audio recording error.";
                break;
            case 4:
                str = "Server sent error status.";
                break;
            case 5:
                str = "Other client side errors.";
                break;
            case 6:
                str = "No speech input.";
                break;
            case 7:
                str = "No speech was detected.";
                break;
            case 8:
                str = "RecognitionService busy.";
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                str = "Insufficient permissions";
                break;
            case 10:
                str = "Too many requests from the same client.";
                break;
            case 11:
                str = "Server disconnected.";
                break;
            case 12:
                str = "Requested language is not available to be used with the current recognizer.";
                break;
            case 13:
                str = "Requested language is supported, but not yet downloaded.";
                break;
            default:
                str = "Unknown error";
                break;
        }
        if (i == 7) {
            this.b.invoke("nomatch", null);
        }
        this.b.invoke("error", lc9.a0(new Pair("error", str2), new Pair("message", str), new Pair("code", Integer.valueOf(i))));
        this.k = ssc.d;
        this.d.post(new cg2(1, this, ssc.e));
        d("onError() - " + str2 + ": " + str + " - code: " + i);
    }

    @Override // android.speech.RecognitionListener
    public final void onEvent(int i, Bundle bundle) {
    }

    @Override // android.speech.RecognitionListener
    public final void onLanguageDetection(Bundle bundle) {
        Float f;
        bundle.getClass();
        String string = bundle.getString("detected_language");
        int i = bundle.getInt("language_detection_confidence_level");
        float f2 = 0.0f;
        if (i != 0) {
            if (i == 1) {
                f2 = 0.5f;
            } else if (i == 2) {
                f2 = 0.8f;
            } else if (i == 3) {
                f2 = 1.0f;
            }
        }
        if (wl7.b(string, this.i) && (f = this.j) != null && f2 == f.floatValue()) {
            return;
        }
        this.i = string;
        this.j = Float.valueOf(f2);
        this.b.invoke("languagedetection", lc9.a0(new Pair("detectedLanguage", string), new Pair("confidence", Float.valueOf(f2)), new Pair("topLocaleAlternatives", bundle.getStringArrayList("top_locale_alternatives"))));
    }

    @Override // android.speech.RecognitionListener
    public final void onPartialResults(Bundle bundle) {
        String string;
        ArrayList arrayListC = c(bundle);
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListC) {
            Object obj2 = ((Map) obj).get("transcript");
            if (obj2 != null && (string = obj2.toString()) != null && string.length() > 0) {
                arrayList.add(obj);
            }
        }
        d("onPartialResults(), results: " + arrayList);
        if (arrayList.isEmpty()) {
            return;
        }
        this.b.invoke("result", lc9.a0(new Pair("results", arrayList), new Pair("isFinal", Boolean.FALSE)));
    }

    @Override // android.speech.RecognitionListener
    public final void onReadyForSpeech(Bundle bundle) {
        if (this.k != ssc.e) {
            this.b.invoke("start", null);
            this.k = ssc.c;
        }
    }

    @Override // android.speech.RecognitionListener
    public final void onResults(Bundle bundle) {
        ArrayList arrayListC = c(bundle);
        boolean zIsEmpty = arrayListC.isEmpty();
        Function2<? super String, ? super Map<String, ? extends Object>, j6g> function2 = this.b;
        if (zIsEmpty) {
            function2.invoke("nomatch", null);
        } else {
            function2.invoke("result", lc9.a0(new Pair("results", arrayListC), new Pair("isFinal", Boolean.TRUE)));
        }
        d("onResults(), results: " + arrayListC);
        e(this);
    }

    @Override // android.speech.RecognitionListener
    public final void onRmsChanged(float f) {
        SpeechRecognitionOptions speechRecognitionOptions = this.e;
        if (speechRecognitionOptions == null) {
            wl7.g("options");
            throw null;
        }
        VolumeChangeEventOptions volumeChangeEventOptions = speechRecognitionOptions.getVolumeChangeEventOptions();
        if (volumeChangeEventOptions != null ? wl7.b(volumeChangeEventOptions.getEnabled(), Boolean.TRUE) : false) {
            SpeechRecognitionOptions speechRecognitionOptions2 = this.e;
            if (speechRecognitionOptions2 == null) {
                wl7.g("options");
                throw null;
            }
            VolumeChangeEventOptions volumeChangeEventOptions2 = speechRecognitionOptions2.getVolumeChangeEventOptions();
            if ((volumeChangeEventOptions2 != null ? volumeChangeEventOptions2.getIntervalMillis() : null) == null) {
                this.b.invoke("volumechange", kc9.W(new Pair("value", Float.valueOf(f))));
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.f >= r2.intValue()) {
                this.b.invoke("volumechange", kc9.W(new Pair("value", Float.valueOf(f))));
                this.f = jCurrentTimeMillis;
            }
        }
    }

    @Override // android.speech.RecognitionListener
    public final void onSegmentResults(Bundle bundle) {
        bundle.getClass();
        ArrayList arrayListC = c(bundle);
        boolean zIsEmpty = arrayListC.isEmpty();
        Function2<? super String, ? super Map<String, ? extends Object>, j6g> function2 = this.b;
        if (zIsEmpty) {
            function2.invoke("nomatch", null);
        } else {
            function2.invoke("result", lc9.a0(new Pair("results", arrayListC), new Pair("isFinal", Boolean.TRUE)));
        }
        d("onSegmentResults(), transcriptions: " + arrayListC);
        if (this.k == ssc.d) {
            e(this);
        }
    }
}
