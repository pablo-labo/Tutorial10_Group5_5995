package defpackage;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.speech.ModelDownloadListener;
import android.speech.SpeechRecognizer;
import android.util.Log;
import com.facebook.react.bridge.ReactApplicationContext;
import defpackage.h45;
import expo.modules.speechrecognition.GetSupportedLocaleOptions;
import expo.modules.speechrecognition.SpeechRecognitionOptions;
import expo.modules.speechrecognition.TriggerOfflineModelDownloadOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lf45;", "Lsx9;", "<init>", "()V", "Lwx9;", "a", "()Lwx9;", "expo-speech-recognition_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f45 extends sx9 {
    public final d2f c = new d2f(new wm1(this, 5));

    public static final class a implements Runnable {
        public final /* synthetic */ Intent b;

        public a(Intent intent) {
            this.b = intent;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ReactApplicationContext reactApplicationContextD = f45.this.b().d();
            reactApplicationContextD.getClass();
            SpeechRecognizer speechRecognizerCreateOnDeviceSpeechRecognizer = SpeechRecognizer.createOnDeviceSpeechRecognizer(reactApplicationContextD);
            speechRecognizerCreateOnDeviceSpeechRecognizer.getClass();
            speechRecognizerCreateOnDeviceSpeechRecognizer.triggerModelDownload(this.b);
        }
    }

    public static final class a0 implements Function2<Object[], p3c, j6g> {
        public final /* synthetic */ huc a;
        public final /* synthetic */ f45 b;

        public a0(huc hucVar, f45 f45Var) {
            this.a = hucVar;
            this.b = f45Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(Object[] objArr, p3c p3cVar) {
            Object[] objArr2 = objArr;
            p3c p3cVar2 = p3cVar;
            objArr2.getClass();
            p3cVar2.getClass();
            TriggerOfflineModelDownloadOptions triggerOfflineModelDownloadOptions = (TriggerOfflineModelDownloadOptions) objArr2[0];
            huc hucVar = this.a;
            if (hucVar.element) {
                p3cVar2.reject("download_in_progress", "An offline model download is already in progress.", new Throwable());
            } else {
                int i = Build.VERSION.SDK_INT;
                if (i < 33) {
                    p3cVar2.reject("not_supported", "Android version is too old to trigger offline model download.", new Throwable());
                } else {
                    Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
                    intent.putExtra("android.speech.extra.LANGUAGE", triggerOfflineModelDownloadOptions.getLocale());
                    f45 f45Var = this.b;
                    if (i < 34) {
                        ReactApplicationContext reactApplicationContextD = f45Var.b().d();
                        reactApplicationContextD.getClass();
                        new Handler(reactApplicationContextD.getMainLooper()).post(f45Var.new a(intent));
                        p3cVar2.f(lc9.a0(new Pair("status", "opened_dialog"), new Pair("message", "Opened the model download dialog.")));
                    } else {
                        hucVar.element = true;
                        ReactApplicationContext reactApplicationContextD2 = f45Var.b().d();
                        reactApplicationContextD2.getClass();
                        new Handler(reactApplicationContextD2.getMainLooper()).post(f45Var.new b(intent, p3cVar2, hucVar));
                    }
                }
            }
            return j6g.a;
        }
    }

    public static final class b implements Runnable {
        public final /* synthetic */ Intent b;
        public final /* synthetic */ p3c c;
        public final /* synthetic */ huc d;

        @SuppressLint({"NewApi"})
        public static final class a implements ModelDownloadListener {
            public final /* synthetic */ p3c a;
            public final /* synthetic */ huc b;
            public final /* synthetic */ SpeechRecognizer c;

            public a(p3c p3cVar, huc hucVar, SpeechRecognizer speechRecognizer) {
                this.a = p3cVar;
                this.b = hucVar;
                this.c = speechRecognizer;
            }

            public final void onError(int i) {
                Log.e("ExpoSpeechService", "Error downloading model with code: " + i);
                this.b.element = false;
                this.a.reject(p6.c(i, "error_"), p6.c(i, "Failed to download offline model download with error: "), new Throwable());
                this.c.destroy();
            }

            public final void onProgress(int i) {
            }

            public final void onScheduled() {
                this.a.f(lc9.a0(new Pair("status", "download_canceled"), new Pair("message", "The offline model download was canceled.")));
            }

            public final void onSuccess() {
                this.a.f(lc9.a0(new Pair("status", "download_success"), new Pair("message", "Offline model download completed successfully.")));
                this.b.element = false;
                this.c.destroy();
            }
        }

        public b(Intent intent, p3c p3cVar, huc hucVar) {
            this.b = intent;
            this.c = p3cVar;
            this.d = hucVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ReactApplicationContext reactApplicationContextD = f45.this.b().d();
            reactApplicationContextD.getClass();
            SpeechRecognizer speechRecognizerCreateOnDeviceSpeechRecognizer = SpeechRecognizer.createOnDeviceSpeechRecognizer(reactApplicationContextD);
            speechRecognizerCreateOnDeviceSpeechRecognizer.getClass();
            speechRecognizerCreateOnDeviceSpeechRecognizer.triggerModelDownload(this.b, Executors.newSingleThreadExecutor(), new a(this.c, this.d, speechRecognizerCreateOnDeviceSpeechRecognizer));
        }
    }

    public static final class b0 implements gu5<zf8> {
        public static final b0 a = new b0();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(SpeechRecognitionOptions.class);
        }
    }

    public static final class c implements Function2<Object[], p3c, j6g> {
        public c() {
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(Object[] objArr, p3c p3cVar) {
            p3c p3cVar2 = p3cVar;
            objArr.getClass();
            p3cVar2.getClass();
            h8b.e(f45.this.b().c(), p3cVar2, "android.permission.RECORD_AUDIO");
            return j6g.a;
        }
    }

    public static final class c0 implements Function1<Object[], Object> {
        public c0() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            SpeechRecognitionOptions speechRecognitionOptions = (SpeechRecognitionOptions) objArr2[0];
            f45 f45Var = f45.this;
            h8b h8bVarC = f45Var.b().c();
            if (h8bVarC == null || h8bVarC.c("android.permission.RECORD_AUDIO")) {
                h45 h45Var = (h45) f45Var.c.getValue();
                h45Var.getClass();
                speechRecognitionOptions.getClass();
                h45Var.e = speechRecognitionOptions;
                h45Var.d.post(new kl3(1, h45Var, speechRecognitionOptions));
            } else {
                Map<?, ?> mapA0 = lc9.a0(new Pair("error", "not-allowed"), new Pair("message", "Missing RECORD_AUDIO permissions."), new Pair("code", -1));
                ey4 ey4Var = (ey4) f45Var.b.getValue();
                if (ey4Var != null) {
                    ey4Var.b("error", mapA0);
                }
                f45Var.d("end", Bundle.EMPTY);
            }
            return j6g.a;
        }
    }

    public static final class d implements gu5<zf8> {
        public static final d a = new d();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(p3c.class);
        }
    }

    public static final class d0 implements gu5<zf8> {
        public static final d0 a = new d0();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(Object.class);
        }
    }

    public static final class e implements Function1<Object[], j6g> {
        public e() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            h8b.e(f45.this.b().c(), (p3c) objArr2[0], "android.permission.RECORD_AUDIO");
            return j6g.a;
        }
    }

    public static final class e0 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            Object obj = objArr2[0];
            return j6g.a;
        }
    }

    public static final class f implements Function2<Object[], p3c, j6g> {
        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(Object[] objArr, p3c p3cVar) {
            p3c p3cVar2 = p3cVar;
            objArr.getClass();
            p3cVar2.getClass();
            Log.w("ESRModule", "getSpeechRecognizerPermissionsAsync is not supported on Android. Returning a granted permission response.");
            Bundle bundle = new Bundle();
            bundle.putString("expires", "never");
            bundle.putString("status", "granted");
            bundle.putBoolean("canAskAgain", false);
            bundle.putBoolean("granted", true);
            p3cVar2.resolve(bundle);
            return j6g.a;
        }
    }

    public static final class f0 implements gu5<zf8> {
        public static final f0 a = new f0();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(Object.class);
        }
    }

    public static final class g implements gu5<zf8> {
        public static final g a = new g();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(p3c.class);
        }
    }

    public static final class g0 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            Object obj = objArr2[0];
            return j6g.a;
        }
    }

    public static final class h implements Function1<Object[], j6g> {
        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            p3c p3cVar = (p3c) objArr2[0];
            Log.w("ESRModule", "getSpeechRecognizerPermissionsAsync is not supported on Android. Returning a granted permission response.");
            Bundle bundle = new Bundle();
            bundle.putString("expires", "never");
            bundle.putString("status", "granted");
            bundle.putBoolean("canAskAgain", false);
            bundle.putBoolean("granted", true);
            p3cVar.resolve(bundle);
            return j6g.a;
        }
    }

    public static final class h0 implements Function1<Object[], Object> {
        public h0() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            String packageName;
            ContentResolver contentResolver;
            String string;
            objArr.getClass();
            ReactApplicationContext reactApplicationContextD = f45.this.b().d();
            ComponentName componentNameUnflattenFromString = (reactApplicationContextD == null || (contentResolver = reactApplicationContextD.getContentResolver()) == null || (string = Settings.Secure.getString(contentResolver, "voice_recognition_service")) == null || string.length() == 0) ? null : ComponentName.unflattenFromString(string);
            if (componentNameUnflattenFromString == null || (packageName = componentNameUnflattenFromString.getPackageName()) == null) {
                packageName = "";
            }
            return j6.c("packageName", packageName);
        }
    }

    public static final class i implements Function2<Object[], p3c, j6g> {
        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(Object[] objArr, p3c p3cVar) {
            p3c p3cVar2 = p3cVar;
            objArr.getClass();
            p3cVar2.getClass();
            Log.w("ESRModule", "requestSpeechRecognizerPermissionsAsync is not supported on Android. Returning a granted permission response.");
            Bundle bundle = new Bundle();
            bundle.putString("expires", "never");
            bundle.putString("status", "granted");
            bundle.putBoolean("canAskAgain", false);
            bundle.putBoolean("granted", true);
            p3cVar2.resolve(bundle);
            return j6g.a;
        }
    }

    public static final class i0 implements Function1<Object[], Object> {
        public i0() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            String packageName;
            ContentResolver contentResolver;
            String string;
            objArr.getClass();
            ReactApplicationContext reactApplicationContextD = f45.this.b().d();
            ComponentName componentNameUnflattenFromString = (reactApplicationContextD == null || (contentResolver = reactApplicationContextD.getContentResolver()) == null || (string = Settings.Secure.getString(contentResolver, "assistant")) == null || string.length() == 0) ? null : ComponentName.unflattenFromString(string);
            if (componentNameUnflattenFromString == null || (packageName = componentNameUnflattenFromString.getPackageName()) == null) {
                packageName = "";
            }
            return j6.c("packageName", packageName);
        }
    }

    public static final class j implements gu5<zf8> {
        public static final j a = new j();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(p3c.class);
        }
    }

    public static final class j0 implements Function1<Object[], Object> {
        public j0() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            objArr.getClass();
            ReactApplicationContext reactApplicationContextD = f45.this.b().d();
            PackageManager packageManager = reactApplicationContextD != null ? reactApplicationContextD.getPackageManager() : null;
            ArrayList arrayList = new ArrayList();
            if (packageManager != null) {
                List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(new Intent("android.speech.RecognitionService"), 0);
                listQueryIntentServices.getClass();
                Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
                while (it.hasNext()) {
                    String str = it.next().serviceInfo.packageName;
                    str.getClass();
                    arrayList.add(str);
                }
            }
            return arrayList;
        }
    }

    public static final class k implements Function1<Object[], j6g> {
        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            p3c p3cVar = (p3c) objArr2[0];
            Log.w("ESRModule", "requestSpeechRecognizerPermissionsAsync is not supported on Android. Returning a granted permission response.");
            Bundle bundle = new Bundle();
            bundle.putString("expires", "never");
            bundle.putString("status", "granted");
            bundle.putBoolean("canAskAgain", false);
            bundle.putBoolean("granted", true);
            p3cVar.resolve(bundle);
            return j6g.a;
        }
    }

    public static final class k0 implements Function1<Object[], Object> {
        public k0() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            objArr.getClass();
            h45 h45Var = (h45) f45.this.c.getValue();
            h45Var.d.post(new i50(h45Var, 4));
            return j6g.a;
        }
    }

    public static final class l implements Function2<Object[], p3c, j6g> {
        public l() {
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(Object[] objArr, p3c p3cVar) {
            p3c p3cVar2 = p3cVar;
            objArr.getClass();
            p3cVar2.getClass();
            int iOrdinal = ((h45) f45.this.c.getValue()).k.ordinal();
            String str = "inactive";
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    str = "starting";
                } else if (iOrdinal == 2) {
                    str = "recognizing";
                } else if (iOrdinal == 3) {
                    str = "stopping";
                }
            }
            p3cVar2.resolve(str);
            return j6g.a;
        }
    }

    public static final class l0 implements Function1<Object[], Object> {
        public l0() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            objArr.getClass();
            Map<?, ?> mapA0 = lc9.a0(new Pair("error", "aborted"), new Pair("message", "Speech recognition aborted."), new Pair("code", -1));
            f45 f45Var = f45.this;
            ey4 ey4Var = (ey4) f45Var.b.getValue();
            if (ey4Var != null) {
                ey4Var.b("error", mapA0);
            }
            h45 h45Var = (h45) f45Var.c.getValue();
            h45Var.getClass();
            h45.e(h45Var);
            return j6g.a;
        }
    }

    public static final class m implements Function2<Object[], p3c, j6g> {
        public m() {
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(Object[] objArr, p3c p3cVar) {
            p3c p3cVar2 = p3cVar;
            objArr.getClass();
            p3cVar2.getClass();
            h8b.i(f45.this.b().c(), p3cVar2, "android.permission.RECORD_AUDIO");
            return j6g.a;
        }
    }

    public static final class m0 implements Function1<Object[], Object> {
        public m0() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            boolean zIsOnDeviceRecognitionAvailable;
            objArr.getClass();
            if (Build.VERSION.SDK_INT >= 31) {
                ReactApplicationContext reactApplicationContextD = f45.this.b().d();
                reactApplicationContextD.getClass();
                zIsOnDeviceRecognitionAvailable = SpeechRecognizer.isOnDeviceRecognitionAvailable(reactApplicationContextD);
            } else {
                zIsOnDeviceRecognitionAvailable = false;
            }
            return Boolean.valueOf(zIsOnDeviceRecognitionAvailable);
        }
    }

    public static final class n implements gu5<zf8> {
        public static final n a = new n();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(p3c.class);
        }
    }

    public static final class n0 implements Function1<Object[], Object> {
        public n0() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            objArr.getClass();
            ReactApplicationContext reactApplicationContextD = f45.this.b().d();
            reactApplicationContextD.getClass();
            return Boolean.valueOf(SpeechRecognizer.isRecognitionAvailable(reactApplicationContextD));
        }
    }

    public static final class o implements Function1<Object[], j6g> {
        public o() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            p3c p3cVar = (p3c) objArr2[0];
            int iOrdinal = ((h45) f45.this.c.getValue()).k.ordinal();
            String str = "inactive";
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    str = "starting";
                } else if (iOrdinal == 2) {
                    str = "recognizing";
                } else if (iOrdinal == 3) {
                    str = "stopping";
                }
            }
            p3cVar.resolve(str);
            return j6g.a;
        }
    }

    public static final class o0 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            objArr.getClass();
            return Boolean.valueOf(Build.VERSION.SDK_INT >= 33);
        }
    }

    public static final class p implements gu5<zf8> {
        public static final p a = new p();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(p3c.class);
        }
    }

    public static final class p0 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            objArr.getClass();
            return lc9.a0(new Pair("category", "playAndRecord"), new Pair("categoryOptions", u63.a0("defaultToSpeaker", "allowBluetooth")), new Pair("mode", "measurement"));
        }
    }

    public static final class q implements Function1<Object[], j6g> {
        public q() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            h8b.i(f45.this.b().c(), (p3c) objArr2[0], "android.permission.RECORD_AUDIO");
            return j6g.a;
        }
    }

    public static final class q0 implements gu5<j6g> {
        public q0() {
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            h45 h45Var = (h45) f45.this.c.getValue();
            h45Var.b = new im0(4, (byte) 0);
            h45.e(h45Var);
            return j6g.a;
        }
    }

    public static final class r implements Function2<Object[], p3c, j6g> {
        public r() {
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(Object[] objArr, p3c p3cVar) {
            p3c p3cVar2 = p3cVar;
            objArr.getClass();
            p3cVar2.getClass();
            h8b.e(f45.this.b().c(), p3cVar2, "android.permission.RECORD_AUDIO");
            return j6g.a;
        }
    }

    public static final class s implements gu5<zf8> {
        public static final s a = new s();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(p3c.class);
        }
    }

    public static final class t implements Function1<Object[], j6g> {
        public t() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            h8b.e(f45.this.b().c(), (p3c) objArr2[0], "android.permission.RECORD_AUDIO");
            return j6g.a;
        }
    }

    public static final class u implements Function2<Object[], p3c, j6g> {
        public u() {
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(Object[] objArr, p3c p3cVar) {
            p3c p3cVar2 = p3cVar;
            objArr.getClass();
            p3cVar2.getClass();
            h8b.i(f45.this.b().c(), p3cVar2, "android.permission.RECORD_AUDIO");
            return j6g.a;
        }
    }

    public static final class v implements gu5<zf8> {
        public static final v a = new v();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(p3c.class);
        }
    }

    public static final class w implements Function1<Object[], j6g> {
        public w() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            h8b.i(f45.this.b().c(), (p3c) objArr2[0], "android.permission.RECORD_AUDIO");
            return j6g.a;
        }
    }

    public static final class x implements gu5<zf8> {
        public static final x a = new x();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(GetSupportedLocaleOptions.class);
        }
    }

    public static final class y implements Function2<Object[], p3c, j6g> {
        public y() {
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(Object[] objArr, p3c p3cVar) {
            Object[] objArr2 = objArr;
            p3c p3cVar2 = p3cVar;
            objArr2.getClass();
            p3cVar2.getClass();
            GetSupportedLocaleOptions getSupportedLocaleOptions = (GetSupportedLocaleOptions) objArr2[0];
            f45 f45Var = f45.this;
            ReactApplicationContext reactApplicationContextD = f45Var.b().d();
            reactApplicationContextD.getClass();
            f45.f(f45Var, getSupportedLocaleOptions, reactApplicationContextD, p3cVar2);
            return j6g.a;
        }
    }

    public static final class z implements gu5<zf8> {
        public static final z a = new z();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(TriggerOfflineModelDownloadOptions.class);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void e(luc lucVar, ReactApplicationContext reactApplicationContext, huc hucVar, p3c p3cVar) {
        T t2 = lucVar.element;
        SpeechRecognizer speechRecognizerCreateSpeechRecognizer = t2 != 0 ? SpeechRecognizer.createSpeechRecognizer(reactApplicationContext, (ComponentName) t2) : SpeechRecognizer.createOnDeviceSpeechRecognizer(reactApplicationContext);
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        if (speechRecognizerCreateSpeechRecognizer != null) {
            speechRecognizerCreateSpeechRecognizer.checkRecognitionSupport(intent, Executors.newSingleThreadExecutor(), new g45(hucVar, p3cVar, speechRecognizerCreateSpeechRecognizer, reactApplicationContext));
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [T, android.content.ComponentName] */
    public static final void f(f45 f45Var, GetSupportedLocaleOptions getSupportedLocaleOptions, final ReactApplicationContext reactApplicationContext, final p3c p3cVar) {
        if (Build.VERSION.SDK_INT < 33) {
            p3cVar.f(lc9.a0(new Pair("locales", new ArrayList()), new Pair("installedLocales", new ArrayList())));
            return;
        }
        if (getSupportedLocaleOptions.getAndroidRecognitionServicePackage() == null && !SpeechRecognizer.isOnDeviceRecognitionAvailable(reactApplicationContext)) {
            p3cVar.f(lc9.a0(new Pair("locales", new ArrayList()), new Pair("installedLocales", new ArrayList())));
            return;
        }
        if (getSupportedLocaleOptions.getAndroidRecognitionServicePackage() != null && !SpeechRecognizer.isRecognitionAvailable(reactApplicationContext)) {
            p3cVar.f(lc9.a0(new Pair("locales", new ArrayList()), new Pair("installedLocales", new ArrayList())));
            return;
        }
        final luc lucVar = new luc();
        try {
            if (getSupportedLocaleOptions.getAndroidRecognitionServicePackage() != null) {
                lucVar.element = h45.a.a(reactApplicationContext, getSupportedLocaleOptions.getAndroidRecognitionServicePackage());
            }
            final huc hucVar = new huc();
            new Handler(reactApplicationContext.getMainLooper()).post(new Runnable() { // from class: d45
                @Override // java.lang.Runnable
                public final void run() {
                    f45.e(lucVar, reactApplicationContext, hucVar, p3cVar);
                }
            });
        } catch (Exception e2) {
            Log.e("ExpoSpeechService", "Couldn't resolve package: " + getSupportedLocaleOptions.getAndroidRecognitionServicePackage());
            p3cVar.reject("package_not_found", "Failed to retrieve recognition service package", e2);
        }
    }

    @Override // defpackage.sx9
    public final wx9 a() {
        Class cls;
        Class cls2;
        Class cls3;
        Class cls4;
        qf0 ch7Var;
        qf0 ch7Var2;
        qf0 ch7Var3;
        qf0 ch7Var4;
        qf0 ch7Var5;
        qf0 ch7Var6;
        qf0 ch7Var7;
        jpf.b("[ExpoModulesCore] ".concat(f45.class + ".ModuleDefinition"));
        try {
            vx9 vx9Var = new vx9(this);
            vx9Var.i("ExpoSpeechRecognition");
            LinkedHashMap linkedHashMapM = vx9Var.m();
            i05 i05Var = i05.b;
            linkedHashMapM.put(i05Var, new nc1(i05Var, new q0()));
            vx9Var.b("audiostart", "audioend", "end", "error", "nomatch", "result", "soundstart", "soundend", "speechstart", "speechend", "start", "results", "languagedetection", "volumechange");
            rf0[] rf0VarArr = new rf0[0];
            gad gadVar = (gad) had.a().get(fwc.a(Object.class));
            if (gadVar == null) {
                gadVar = new gad(fwc.a(Object.class));
                had.a().put(fwc.a(Object.class), gadVar);
            }
            vx9Var.h().put("getDefaultRecognitionService", new a2f("getDefaultRecognitionService", rf0VarArr, gadVar, new h0()));
            rf0[] rf0VarArr2 = new rf0[0];
            gad gadVar2 = (gad) had.a().get(fwc.a(Object.class));
            if (gadVar2 == null) {
                gadVar2 = new gad(fwc.a(Object.class));
                had.a().put(fwc.a(Object.class), gadVar2);
            }
            vx9Var.h().put("getAssistantService", new a2f("getAssistantService", rf0VarArr2, gadVar2, new i0()));
            rf0[] rf0VarArr3 = new rf0[0];
            gad gadVar3 = (gad) had.a().get(fwc.a(Object.class));
            if (gadVar3 == null) {
                gadVar3 = new gad(fwc.a(Object.class));
                had.a().put(fwc.a(Object.class), gadVar3);
            }
            vx9Var.h().put("getSpeechRecognitionServices", new a2f("getSpeechRecognitionServices", rf0VarArr3, gadVar3, new j0()));
            boolean zB = wl7.b(p3c.class, p3c.class);
            Class cls5 = Float.TYPE;
            Class cls6 = Double.TYPE;
            Class cls7 = Boolean.TYPE;
            Class cls8 = Integer.TYPE;
            if (zB) {
                cls = TriggerOfflineModelDownloadOptions.class;
                ch7Var = new ev0("requestPermissionsAsync", new rf0[0], new m());
                cls2 = GetSupportedLocaleOptions.class;
                cls3 = SpeechRecognitionOptions.class;
                cls4 = Object.class;
            } else {
                cls = TriggerOfflineModelDownloadOptions.class;
                pwf pwfVarF = vx9Var.f();
                hb9 hb9Var = tf0.a;
                cls2 = GetSupportedLocaleOptions.class;
                rf0 rf0Var = (rf0) tf0.a().get(new Pair(fwc.a(p3c.class), Boolean.FALSE));
                if (rf0Var == null) {
                    cls3 = SpeechRecognitionOptions.class;
                    cls4 = Object.class;
                    rf0Var = new rf0(new xp8(fwc.a(p3c.class), false, p.a), pwfVarF);
                } else {
                    cls3 = SpeechRecognitionOptions.class;
                    cls4 = Object.class;
                }
                rf0[] rf0VarArr4 = {rf0Var};
                q qVar = new q();
                ch7Var = wl7.b(j6g.class, cls8) ? new ch7("requestPermissionsAsync", rf0VarArr4, qVar) : wl7.b(j6g.class, cls7) ? new hi1("requestPermissionsAsync", rf0VarArr4, qVar) : wl7.b(j6g.class, cls6) ? new s84("requestPermissionsAsync", rf0VarArr4, qVar) : wl7.b(j6g.class, cls5) ? new ci5("requestPermissionsAsync", rf0VarArr4, qVar) : wl7.b(j6g.class, String.class) ? new zue("requestPermissionsAsync", rf0VarArr4, qVar) : new o7g("requestPermissionsAsync", rf0VarArr4, qVar);
            }
            vx9Var.d().put("requestPermissionsAsync", ch7Var);
            if (wl7.b(p3c.class, p3c.class)) {
                ch7Var2 = new ev0("getPermissionsAsync", new rf0[0], new r());
            } else {
                pwf pwfVarF2 = vx9Var.f();
                hb9 hb9Var2 = tf0.a;
                rf0 rf0Var2 = (rf0) tf0.a().get(new Pair(fwc.a(p3c.class), Boolean.FALSE));
                if (rf0Var2 == null) {
                    rf0Var2 = new rf0(new xp8(fwc.a(p3c.class), false, s.a), pwfVarF2);
                }
                rf0[] rf0VarArr5 = {rf0Var2};
                t tVar = new t();
                ch7Var2 = wl7.b(j6g.class, cls8) ? new ch7("getPermissionsAsync", rf0VarArr5, tVar) : wl7.b(j6g.class, cls7) ? new hi1("getPermissionsAsync", rf0VarArr5, tVar) : wl7.b(j6g.class, cls6) ? new s84("getPermissionsAsync", rf0VarArr5, tVar) : wl7.b(j6g.class, cls5) ? new ci5("getPermissionsAsync", rf0VarArr5, tVar) : wl7.b(j6g.class, String.class) ? new zue("getPermissionsAsync", rf0VarArr5, tVar) : new o7g("getPermissionsAsync", rf0VarArr5, tVar);
            }
            vx9Var.d().put("getPermissionsAsync", ch7Var2);
            if (wl7.b(p3c.class, p3c.class)) {
                ch7Var3 = new ev0("requestMicrophonePermissionsAsync", new rf0[0], new u());
            } else {
                pwf pwfVarF3 = vx9Var.f();
                hb9 hb9Var3 = tf0.a;
                rf0 rf0Var3 = (rf0) tf0.a().get(new Pair(fwc.a(p3c.class), Boolean.FALSE));
                if (rf0Var3 == null) {
                    rf0Var3 = new rf0(new xp8(fwc.a(p3c.class), false, v.a), pwfVarF3);
                }
                rf0[] rf0VarArr6 = {rf0Var3};
                w wVar = new w();
                ch7Var3 = wl7.b(j6g.class, cls8) ? new ch7("requestMicrophonePermissionsAsync", rf0VarArr6, wVar) : wl7.b(j6g.class, cls7) ? new hi1("requestMicrophonePermissionsAsync", rf0VarArr6, wVar) : wl7.b(j6g.class, cls6) ? new s84("requestMicrophonePermissionsAsync", rf0VarArr6, wVar) : wl7.b(j6g.class, cls5) ? new ci5("requestMicrophonePermissionsAsync", rf0VarArr6, wVar) : wl7.b(j6g.class, String.class) ? new zue("requestMicrophonePermissionsAsync", rf0VarArr6, wVar) : new o7g("requestMicrophonePermissionsAsync", rf0VarArr6, wVar);
            }
            vx9Var.d().put("requestMicrophonePermissionsAsync", ch7Var3);
            if (wl7.b(p3c.class, p3c.class)) {
                ch7Var4 = new ev0("getMicrophonePermissionsAsync", new rf0[0], new c());
            } else {
                pwf pwfVarF4 = vx9Var.f();
                hb9 hb9Var4 = tf0.a;
                rf0 rf0Var4 = (rf0) tf0.a().get(new Pair(fwc.a(p3c.class), Boolean.FALSE));
                if (rf0Var4 == null) {
                    rf0Var4 = new rf0(new xp8(fwc.a(p3c.class), false, d.a), pwfVarF4);
                }
                rf0[] rf0VarArr7 = {rf0Var4};
                e eVar = new e();
                ch7Var4 = wl7.b(j6g.class, cls8) ? new ch7("getMicrophonePermissionsAsync", rf0VarArr7, eVar) : wl7.b(j6g.class, cls7) ? new hi1("getMicrophonePermissionsAsync", rf0VarArr7, eVar) : wl7.b(j6g.class, cls6) ? new s84("getMicrophonePermissionsAsync", rf0VarArr7, eVar) : wl7.b(j6g.class, cls5) ? new ci5("getMicrophonePermissionsAsync", rf0VarArr7, eVar) : wl7.b(j6g.class, String.class) ? new zue("getMicrophonePermissionsAsync", rf0VarArr7, eVar) : new o7g("getMicrophonePermissionsAsync", rf0VarArr7, eVar);
            }
            vx9Var.d().put("getMicrophonePermissionsAsync", ch7Var4);
            if (wl7.b(p3c.class, p3c.class)) {
                ch7Var5 = new ev0("getSpeechRecognizerPermissionsAsync", new rf0[0], new f());
            } else {
                pwf pwfVarF5 = vx9Var.f();
                hb9 hb9Var5 = tf0.a;
                rf0 rf0Var5 = (rf0) tf0.a().get(new Pair(fwc.a(p3c.class), Boolean.FALSE));
                if (rf0Var5 == null) {
                    rf0Var5 = new rf0(new xp8(fwc.a(p3c.class), false, g.a), pwfVarF5);
                }
                rf0[] rf0VarArr8 = {rf0Var5};
                h hVar = new h();
                ch7Var5 = wl7.b(j6g.class, cls8) ? new ch7("getSpeechRecognizerPermissionsAsync", rf0VarArr8, hVar) : wl7.b(j6g.class, cls7) ? new hi1("getSpeechRecognizerPermissionsAsync", rf0VarArr8, hVar) : wl7.b(j6g.class, cls6) ? new s84("getSpeechRecognizerPermissionsAsync", rf0VarArr8, hVar) : wl7.b(j6g.class, cls5) ? new ci5("getSpeechRecognizerPermissionsAsync", rf0VarArr8, hVar) : wl7.b(j6g.class, String.class) ? new zue("getSpeechRecognizerPermissionsAsync", rf0VarArr8, hVar) : new o7g("getSpeechRecognizerPermissionsAsync", rf0VarArr8, hVar);
            }
            vx9Var.d().put("getSpeechRecognizerPermissionsAsync", ch7Var5);
            if (wl7.b(p3c.class, p3c.class)) {
                ch7Var6 = new ev0("requestSpeechRecognizerPermissionsAsync", new rf0[0], new i());
            } else {
                pwf pwfVarF6 = vx9Var.f();
                hb9 hb9Var6 = tf0.a;
                rf0 rf0Var6 = (rf0) tf0.a().get(new Pair(fwc.a(p3c.class), Boolean.FALSE));
                if (rf0Var6 == null) {
                    rf0Var6 = new rf0(new xp8(fwc.a(p3c.class), false, j.a), pwfVarF6);
                }
                rf0[] rf0VarArr9 = {rf0Var6};
                k kVar = new k();
                ch7Var6 = wl7.b(j6g.class, cls8) ? new ch7("requestSpeechRecognizerPermissionsAsync", rf0VarArr9, kVar) : wl7.b(j6g.class, cls7) ? new hi1("requestSpeechRecognizerPermissionsAsync", rf0VarArr9, kVar) : wl7.b(j6g.class, cls6) ? new s84("requestSpeechRecognizerPermissionsAsync", rf0VarArr9, kVar) : wl7.b(j6g.class, cls5) ? new ci5("requestSpeechRecognizerPermissionsAsync", rf0VarArr9, kVar) : wl7.b(j6g.class, String.class) ? new zue("requestSpeechRecognizerPermissionsAsync", rf0VarArr9, kVar) : new o7g("requestSpeechRecognizerPermissionsAsync", rf0VarArr9, kVar);
            }
            vx9Var.d().put("requestSpeechRecognizerPermissionsAsync", ch7Var6);
            if (wl7.b(p3c.class, p3c.class)) {
                ch7Var7 = new ev0("getStateAsync", new rf0[0], new l());
            } else {
                pwf pwfVarF7 = vx9Var.f();
                hb9 hb9Var7 = tf0.a;
                rf0 rf0Var7 = (rf0) tf0.a().get(new Pair(fwc.a(p3c.class), Boolean.FALSE));
                if (rf0Var7 == null) {
                    rf0Var7 = new rf0(new xp8(fwc.a(p3c.class), false, n.a), pwfVarF7);
                }
                rf0[] rf0VarArr10 = {rf0Var7};
                o oVar = new o();
                ch7Var7 = wl7.b(j6g.class, cls8) ? new ch7("getStateAsync", rf0VarArr10, oVar) : wl7.b(j6g.class, cls7) ? new hi1("getStateAsync", rf0VarArr10, oVar) : wl7.b(j6g.class, cls6) ? new s84("getStateAsync", rf0VarArr10, oVar) : wl7.b(j6g.class, cls5) ? new ci5("getStateAsync", rf0VarArr10, oVar) : wl7.b(j6g.class, String.class) ? new zue("getStateAsync", rf0VarArr10, oVar) : new o7g("getStateAsync", rf0VarArr10, oVar);
            }
            vx9Var.d().put("getStateAsync", ch7Var7);
            pwf pwfVarF8 = vx9Var.f();
            hb9 hb9Var8 = tf0.a;
            yd8 yd8VarA = fwc.a(cls3);
            Boolean bool = Boolean.FALSE;
            rf0 rf0Var8 = (rf0) tf0.a().get(new Pair(yd8VarA, bool));
            if (rf0Var8 == null) {
                rf0Var8 = new rf0(new xp8(fwc.a(cls3), false, b0.a), pwfVarF8);
            }
            rf0[] rf0VarArr11 = {rf0Var8};
            gad gadVar4 = (gad) had.a().get(fwc.a(j6g.class));
            if (gadVar4 == null) {
                gadVar4 = new gad(fwc.a(j6g.class));
                had.a().put(fwc.a(j6g.class), gadVar4);
            }
            vx9Var.h().put("start", new a2f("start", rf0VarArr11, gadVar4, new c0()));
            rf0[] rf0VarArr12 = new rf0[0];
            gad gadVar5 = (gad) had.a().get(fwc.a(cls4));
            if (gadVar5 == null) {
                gadVar5 = new gad(fwc.a(cls4));
                had.a().put(fwc.a(cls4), gadVar5);
            }
            vx9Var.h().put("stop", new a2f("stop", rf0VarArr12, gadVar5, new k0()));
            rf0[] rf0VarArr13 = new rf0[0];
            gad gadVar6 = (gad) had.a().get(fwc.a(cls4));
            if (gadVar6 == null) {
                gadVar6 = new gad(fwc.a(cls4));
                had.a().put(fwc.a(cls4), gadVar6);
            }
            vx9Var.h().put("abort", new a2f("abort", rf0VarArr13, gadVar6, new l0()));
            pwf pwfVarF9 = vx9Var.f();
            rf0 rf0Var9 = (rf0) tf0.a().get(new Pair(fwc.a(cls2), bool));
            if (rf0Var9 == null) {
                rf0Var9 = new rf0(new xp8(fwc.a(cls2), false, x.a), pwfVarF9);
            }
            vx9Var.d().put("getSupportedLocales", new ev0("getSupportedLocales", new rf0[]{rf0Var9}, new y()));
            rf0[] rf0VarArr14 = new rf0[0];
            gad gadVar7 = (gad) had.a().get(fwc.a(cls4));
            if (gadVar7 == null) {
                gadVar7 = new gad(fwc.a(cls4));
                had.a().put(fwc.a(cls4), gadVar7);
            }
            vx9Var.h().put("supportsOnDeviceRecognition", new a2f("supportsOnDeviceRecognition", rf0VarArr14, gadVar7, new m0()));
            rf0[] rf0VarArr15 = new rf0[0];
            gad gadVar8 = (gad) had.a().get(fwc.a(cls4));
            if (gadVar8 == null) {
                gadVar8 = new gad(fwc.a(cls4));
                had.a().put(fwc.a(cls4), gadVar8);
            }
            vx9Var.h().put("isRecognitionAvailable", new a2f("isRecognitionAvailable", rf0VarArr15, gadVar8, new n0()));
            rf0[] rf0VarArr16 = new rf0[0];
            gad gadVar9 = (gad) had.a().get(fwc.a(cls4));
            if (gadVar9 == null) {
                gadVar9 = new gad(fwc.a(cls4));
                had.a().put(fwc.a(cls4), gadVar9);
            }
            vx9Var.h().put("supportsRecording", new a2f("supportsRecording", rf0VarArr16, gadVar9, new o0()));
            pwf pwfVarF10 = vx9Var.f();
            rf0 rf0Var10 = (rf0) tf0.a().get(new Pair(fwc.a(cls4), bool));
            if (rf0Var10 == null) {
                rf0Var10 = new rf0(new xp8(fwc.a(cls4), false, d0.a), pwfVarF10);
            }
            rf0[] rf0VarArr17 = {rf0Var10};
            gad gadVar10 = (gad) had.a().get(fwc.a(j6g.class));
            if (gadVar10 == null) {
                gadVar10 = new gad(fwc.a(j6g.class));
                had.a().put(fwc.a(j6g.class), gadVar10);
            }
            vx9Var.h().put("setCategoryIOS", new a2f("setCategoryIOS", rf0VarArr17, gadVar10, new e0()));
            rf0[] rf0VarArr18 = new rf0[0];
            gad gadVar11 = (gad) had.a().get(fwc.a(cls4));
            if (gadVar11 == null) {
                gadVar11 = new gad(fwc.a(cls4));
                had.a().put(fwc.a(cls4), gadVar11);
            }
            vx9Var.h().put("getAudioSessionCategoryAndOptionsIOS", new a2f("getAudioSessionCategoryAndOptionsIOS", rf0VarArr18, gadVar11, new p0()));
            pwf pwfVarF11 = vx9Var.f();
            rf0 rf0Var11 = (rf0) tf0.a().get(new Pair(fwc.a(cls4), bool));
            if (rf0Var11 == null) {
                rf0Var11 = new rf0(new xp8(fwc.a(cls4), false, f0.a), pwfVarF11);
            }
            rf0[] rf0VarArr19 = {rf0Var11};
            gad gadVar12 = (gad) had.a().get(fwc.a(j6g.class));
            if (gadVar12 == null) {
                gadVar12 = new gad(fwc.a(j6g.class));
                had.a().put(fwc.a(j6g.class), gadVar12);
            }
            vx9Var.h().put("setAudioSessionActiveIOS", new a2f("setAudioSessionActiveIOS", rf0VarArr19, gadVar12, new g0()));
            huc hucVar = new huc();
            pwf pwfVarF12 = vx9Var.f();
            rf0 rf0Var12 = (rf0) tf0.a().get(new Pair(fwc.a(cls), bool));
            if (rf0Var12 == null) {
                rf0Var12 = new rf0(new xp8(fwc.a(cls), false, z.a), pwfVarF12);
            }
            vx9Var.d().put("androidTriggerOfflineModelDownload", new ev0("androidTriggerOfflineModelDownload", new rf0[]{rf0Var12}, new a0(hucVar, this)));
            return vx9Var.k();
        } finally {
            jpf.d();
        }
    }
}
