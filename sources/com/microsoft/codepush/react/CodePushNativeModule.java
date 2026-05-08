package com.microsoft.codepush.react;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.NoSuchKeyException;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.runtime.ReactHostDelegate;
import com.facebook.react.runtime.ReactHostImpl;
import defpackage.a92;
import defpackage.b92;
import defpackage.c92;
import defpackage.fmc;
import defpackage.n34;
import defpackage.pbe;
import defpackage.pjc;
import defpackage.rkc;
import defpackage.w24;
import defpackage.wnc;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class CodePushNativeModule extends BaseJavaModule {
    private boolean _allowed;
    private boolean _restartInProgress;
    private ArrayList<Boolean> _restartQueue;
    private String mBinaryContentsHash;
    private String mClientUniqueId;
    private com.microsoft.codepush.react.b mCodePush;
    private LifecycleEventListener mLifecycleEventListener;
    private int mMinimumBackgroundDuration;
    private pbe mSettingsManager;
    private b92 mTelemetryManager;
    private com.microsoft.codepush.react.e mUpdateManager;

    public class a implements Runnable {
        public final /* synthetic */ Activity a;

        public a(Activity activity) {
            this.a = activity;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.a.recreate();
        }
    }

    public class b extends AsyncTask<Void, Void, Void> {
        public final /* synthetic */ ReadableMap a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ Promise c;

        public b(ReadableMap readableMap, boolean z, Promise promise) {
            this.a = readableMap;
            this.b = z;
            this.c = promise;
        }

        @Override // android.os.AsyncTask
        public final Void doInBackground(Void[] voidArr) throws Throwable {
            String string;
            JSONObject jSONObjectF;
            Promise promise = this.c;
            ReadableMap readableMap = this.a;
            CodePushNativeModule codePushNativeModule = CodePushNativeModule.this;
            try {
                try {
                    JSONObject jSONObjectE = g.e(readableMap);
                    codePushNativeModule.mCodePush.getClass();
                    g.k(jSONObjectE, "binaryModifiedTime", "0");
                    com.microsoft.codepush.react.e eVar = codePushNativeModule.mUpdateManager;
                    String str = codePushNativeModule.mCodePush.b;
                    com.microsoft.codepush.react.c cVar = new com.microsoft.codepush.react.c(this);
                    codePushNativeModule.mCodePush.getClass();
                    eVar.c(jSONObjectE, str, cVar, com.microsoft.codepush.react.b.n);
                    com.microsoft.codepush.react.e eVar2 = codePushNativeModule.mUpdateManager;
                    try {
                        string = readableMap.getString("packageHash");
                    } catch (NoSuchKeyException unused) {
                        string = null;
                    }
                    try {
                        jSONObjectF = g.f(g.a(eVar2.j(string), "app.json"));
                    } catch (IOException unused2) {
                        jSONObjectF = null;
                    }
                    promise.resolve(g.c(jSONObjectF));
                } catch (CodePushInvalidUpdateException e) {
                    g.i(e);
                    codePushNativeModule.mSettingsManager.f(g.e(readableMap));
                    promise.reject(e);
                } catch (CodePushUnknownException e2) {
                    e = e2;
                    g.i(e);
                    promise.reject(e);
                }
            } catch (IOException e3) {
                e = e3;
                g.i(e);
                promise.reject(e);
                return null;
            }
            return null;
        }
    }

    public class c extends AsyncTask<Void, Void, Void> {
        public final /* synthetic */ Promise a;
        public final /* synthetic */ int b;

        public c(Promise promise, int i) {
            this.a = promise;
            this.b = i;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x007a A[Catch: CodePushUnknownException -> 0x0017, CodePushMalformedDataException -> 0x001a, TRY_ENTER, TryCatch #3 {CodePushMalformedDataException -> 0x001a, CodePushUnknownException -> 0x0017, blocks: (B:3:0x0009, B:5:0x0013, B:11:0x001d, B:13:0x0025, B:14:0x0035, B:17:0x003f, B:19:0x0045, B:20:0x004a, B:22:0x0052, B:24:0x0058, B:30:0x007a, B:31:0x007e, B:27:0x006a, B:28:0x0074, B:32:0x0086, B:34:0x0091, B:35:0x0098), top: B:43:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x007e A[Catch: CodePushUnknownException -> 0x0017, CodePushMalformedDataException -> 0x001a, TryCatch #3 {CodePushMalformedDataException -> 0x001a, CodePushUnknownException -> 0x0017, blocks: (B:3:0x0009, B:5:0x0013, B:11:0x001d, B:13:0x0025, B:14:0x0035, B:17:0x003f, B:19:0x0045, B:20:0x004a, B:22:0x0052, B:24:0x0058, B:30:0x007a, B:31:0x007e, B:27:0x006a, B:28:0x0074, B:32:0x0086, B:34:0x0091, B:35:0x0098), top: B:43:0x0009 }] */
        @Override // android.os.AsyncTask
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Void doInBackground(java.lang.Void[] r7) {
            /*
                r6 = this;
                java.lang.Void[] r7 = (java.lang.Void[]) r7
                java.lang.String r7 = "packageHash"
                com.microsoft.codepush.react.CodePushNativeModule r0 = com.microsoft.codepush.react.CodePushNativeModule.this
                com.facebook.react.bridge.Promise r1 = r6.a
                r2 = 0
                com.microsoft.codepush.react.e r3 = com.microsoft.codepush.react.CodePushNativeModule.g(r0)     // Catch: com.microsoft.codepush.react.CodePushUnknownException -> L17 com.microsoft.codepush.react.CodePushMalformedDataException -> L1a
                org.json.JSONObject r3 = r3.g()     // Catch: com.microsoft.codepush.react.CodePushUnknownException -> L17 com.microsoft.codepush.react.CodePushMalformedDataException -> L1a
                if (r3 != 0) goto L1d
                r1.resolve(r2)     // Catch: com.microsoft.codepush.react.CodePushUnknownException -> L17 com.microsoft.codepush.react.CodePushMalformedDataException -> L1a
                return r2
            L17:
                r6 = move-exception
                goto La5
            L1a:
                r6 = move-exception
                goto Lac
            L1d:
                java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch: com.microsoft.codepush.react.CodePushUnknownException -> L17 com.microsoft.codepush.react.CodePushMalformedDataException -> L1a
                boolean r5 = r3.has(r7)     // Catch: com.microsoft.codepush.react.CodePushUnknownException -> L17 com.microsoft.codepush.react.CodePushMalformedDataException -> L1a
                if (r5 == 0) goto L35
                java.lang.String r7 = r3.optString(r7, r2)     // Catch: com.microsoft.codepush.react.CodePushUnknownException -> L17 com.microsoft.codepush.react.CodePushMalformedDataException -> L1a
                pbe r4 = com.microsoft.codepush.react.CodePushNativeModule.e(r0)     // Catch: com.microsoft.codepush.react.CodePushUnknownException -> L17 com.microsoft.codepush.react.CodePushMalformedDataException -> L1a
                boolean r7 = r4.e(r7)     // Catch: com.microsoft.codepush.react.CodePushUnknownException -> L17 com.microsoft.codepush.react.CodePushMalformedDataException -> L1a
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r7)     // Catch: com.microsoft.codepush.react.CodePushUnknownException -> L17 com.microsoft.codepush.react.CodePushMalformedDataException -> L1a
            L35:
                c92 r7 = defpackage.c92.PENDING     // Catch: com.microsoft.codepush.react.CodePushUnknownException -> L17 com.microsoft.codepush.react.CodePushMalformedDataException -> L1a
                int r7 = r7.a()     // Catch: com.microsoft.codepush.react.CodePushUnknownException -> L17 com.microsoft.codepush.react.CodePushMalformedDataException -> L1a
                int r6 = r6.b
                if (r6 != r7) goto L4a
                boolean r7 = r4.booleanValue()     // Catch: com.microsoft.codepush.react.CodePushUnknownException -> L17 com.microsoft.codepush.react.CodePushMalformedDataException -> L1a
                if (r7 != 0) goto L4a
                r1.resolve(r2)     // Catch: com.microsoft.codepush.react.CodePushUnknownException -> L17 com.microsoft.codepush.react.CodePushMalformedDataException -> L1a
                goto Lb9
            L4a:
                c92 r7 = defpackage.c92.RUNNING     // Catch: com.microsoft.codepush.react.CodePushUnknownException -> L17 com.microsoft.codepush.react.CodePushMalformedDataException -> L1a
                int r7 = r7.a()     // Catch: com.microsoft.codepush.react.CodePushUnknownException -> L17 com.microsoft.codepush.react.CodePushMalformedDataException -> L1a
                if (r6 != r7) goto L86
                boolean r6 = r4.booleanValue()     // Catch: com.microsoft.codepush.react.CodePushUnknownException -> L17 com.microsoft.codepush.react.CodePushMalformedDataException -> L1a
                if (r6 == 0) goto L86
                com.microsoft.codepush.react.e r6 = com.microsoft.codepush.react.CodePushNativeModule.g(r0)     // Catch: com.microsoft.codepush.react.CodePushUnknownException -> L17 com.microsoft.codepush.react.CodePushMalformedDataException -> L1a
                org.json.JSONObject r7 = r6.i()     // Catch: com.microsoft.codepush.react.CodePushUnknownException -> L17 com.microsoft.codepush.react.CodePushMalformedDataException -> L1a
                java.lang.String r3 = "previousPackage"
                java.lang.String r7 = r7.optString(r3, r2)     // Catch: com.microsoft.codepush.react.CodePushUnknownException -> L17 com.microsoft.codepush.react.CodePushMalformedDataException -> L1a
                if (r7 != 0) goto L6a
            L68:
                r6 = r2
                goto L78
            L6a:
                java.lang.String r6 = r6.j(r7)     // Catch: com.microsoft.codepush.react.CodePushUnknownException -> L17 com.microsoft.codepush.react.CodePushMalformedDataException -> L1a
                java.lang.String r7 = "app.json"
                java.lang.String r6 = com.microsoft.codepush.react.g.a(r6, r7)     // Catch: com.microsoft.codepush.react.CodePushUnknownException -> L17 com.microsoft.codepush.react.CodePushMalformedDataException -> L1a
                org.json.JSONObject r6 = com.microsoft.codepush.react.g.f(r6)     // Catch: com.microsoft.codepush.react.CodePushUnknownException -> L17 com.microsoft.codepush.react.CodePushMalformedDataException -> L1a java.io.IOException -> L68
            L78:
                if (r6 != 0) goto L7e
                r1.resolve(r2)     // Catch: com.microsoft.codepush.react.CodePushUnknownException -> L17 com.microsoft.codepush.react.CodePushMalformedDataException -> L1a
                goto Lb9
            L7e:
                com.facebook.react.bridge.WritableMap r6 = com.microsoft.codepush.react.g.c(r6)     // Catch: com.microsoft.codepush.react.CodePushUnknownException -> L17 com.microsoft.codepush.react.CodePushMalformedDataException -> L1a
                r1.resolve(r6)     // Catch: com.microsoft.codepush.react.CodePushUnknownException -> L17 com.microsoft.codepush.react.CodePushMalformedDataException -> L1a
                goto Lb9
            L86:
                com.microsoft.codepush.react.b r6 = com.microsoft.codepush.react.CodePushNativeModule.a(r0)     // Catch: com.microsoft.codepush.react.CodePushUnknownException -> L17 com.microsoft.codepush.react.CodePushMalformedDataException -> L1a
                r6.getClass()     // Catch: com.microsoft.codepush.react.CodePushUnknownException -> L17 com.microsoft.codepush.react.CodePushMalformedDataException -> L1a
                boolean r6 = com.microsoft.codepush.react.b.j     // Catch: com.microsoft.codepush.react.CodePushUnknownException -> L17 com.microsoft.codepush.react.CodePushMalformedDataException -> L1a
                if (r6 == 0) goto L98
                java.lang.String r6 = "_isDebugOnly"
                java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: com.microsoft.codepush.react.CodePushUnknownException -> L17 com.microsoft.codepush.react.CodePushMalformedDataException -> L1a
                com.microsoft.codepush.react.g.k(r3, r6, r7)     // Catch: com.microsoft.codepush.react.CodePushUnknownException -> L17 com.microsoft.codepush.react.CodePushMalformedDataException -> L1a
            L98:
                java.lang.String r6 = "isPending"
                com.microsoft.codepush.react.g.k(r3, r6, r4)     // Catch: com.microsoft.codepush.react.CodePushUnknownException -> L17 com.microsoft.codepush.react.CodePushMalformedDataException -> L1a
                com.facebook.react.bridge.WritableMap r6 = com.microsoft.codepush.react.g.c(r3)     // Catch: com.microsoft.codepush.react.CodePushUnknownException -> L17 com.microsoft.codepush.react.CodePushMalformedDataException -> L1a
                r1.resolve(r6)     // Catch: com.microsoft.codepush.react.CodePushUnknownException -> L17 com.microsoft.codepush.react.CodePushMalformedDataException -> L1a
                goto Lb9
            La5:
                com.microsoft.codepush.react.g.i(r6)
                r1.reject(r6)
                goto Lb9
            Lac:
                java.lang.String r6 = r6.getMessage()
                com.microsoft.codepush.react.g.h(r6)
                r0.clearUpdates()
                r1.resolve(r2)
            Lb9:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.microsoft.codepush.react.CodePushNativeModule.c.doInBackground(java.lang.Object[]):java.lang.Object");
        }
    }

    public class d extends AsyncTask<Void, Void, Void> {
        public final /* synthetic */ Promise a;

        public d(Promise promise) {
            this.a = promise;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x00c7 A[Catch: CodePushUnknownException -> 0x0053, TryCatch #1 {CodePushUnknownException -> 0x0053, blocks: (B:3:0x0007, B:5:0x0012, B:7:0x002a, B:38:0x00cb, B:12:0x0057, B:13:0x005e, B:14:0x005f, B:16:0x0067, B:18:0x0071, B:20:0x007f, B:22:0x0083, B:24:0x008e, B:26:0x00a1, B:28:0x00a5, B:30:0x00b3, B:31:0x00b6, B:37:0x00c7, B:34:0x00c1), top: B:44:0x0007, inners: #0, #2 }] */
        @Override // android.os.AsyncTask
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Void doInBackground(java.lang.Void[] r4) {
            /*
                Method dump skipped, instruction units count: 216
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.microsoft.codepush.react.CodePushNativeModule.d.doInBackground(java.lang.Object[]):java.lang.Object");
        }
    }

    public class e extends AsyncTask<Void, Void, Void> {
        public final /* synthetic */ ReadableMap a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ Promise d;

        public e(ReadableMap readableMap, int i, int i2, Promise promise) {
            this.a = readableMap;
            this.b = i;
            this.c = i2;
            this.d = promise;
        }

        @Override // android.os.AsyncTask
        public final Void doInBackground(Void[] voidArr) throws Throwable {
            String string;
            Promise promise = this.d;
            ReadableMap readableMap = this.a;
            CodePushNativeModule codePushNativeModule = CodePushNativeModule.this;
            try {
                codePushNativeModule.mUpdateManager.k(g.e(readableMap), codePushNativeModule.mSettingsManager.e(null));
                try {
                    string = readableMap.getString("packageHash");
                } catch (NoSuchKeyException unused) {
                    string = null;
                }
            } catch (CodePushUnknownException e) {
                g.i(e);
                promise.reject(e);
            }
            if (string == null) {
                throw new CodePushUnknownException("Update package to be installed has no hash.");
            }
            codePushNativeModule.mSettingsManager.g(string, false);
            int iA = a92.ON_NEXT_RESUME.a();
            int i = this.b;
            if (i == iA || i == a92.IMMEDIATE.a() || i == a92.ON_NEXT_SUSPEND.a()) {
                codePushNativeModule.mMinimumBackgroundDuration = this.c;
                if (codePushNativeModule.mLifecycleEventListener == null) {
                    codePushNativeModule.mLifecycleEventListener = new com.microsoft.codepush.react.d(this);
                    codePushNativeModule.getReactApplicationContext().addLifecycleEventListener(codePushNativeModule.mLifecycleEventListener);
                }
            }
            promise.resolve("");
            return null;
        }
    }

    public CodePushNativeModule(ReactApplicationContext reactApplicationContext, com.microsoft.codepush.react.b bVar, com.microsoft.codepush.react.e eVar, b92 b92Var, pbe pbeVar) throws Throwable {
        String strG;
        super(reactApplicationContext);
        this.mBinaryContentsHash = null;
        this.mClientUniqueId = null;
        this.mLifecycleEventListener = null;
        this.mMinimumBackgroundDuration = 0;
        this._allowed = true;
        this._restartInProgress = false;
        this._restartQueue = new ArrayList<>();
        this.mCodePush = bVar;
        this.mSettingsManager = pbeVar;
        this.mTelemetryManager = b92Var;
        this.mUpdateManager = eVar;
        bVar.getClass();
        String str = f.a;
        try {
            try {
                strG = g.g(reactApplicationContext.getAssets().open("CodePushHash"));
            } catch (IOException unused) {
                g.h("Unable to get the hash of the binary's bundled resources - \"codepush.gradle\" may have not been added to the build definition.");
                strG = null;
            }
        } catch (IOException unused2) {
            strG = g.g(reactApplicationContext.getAssets().open("CodePushHash.json"));
        }
        this.mBinaryContentsHash = strG;
        SharedPreferences sharedPreferences = bVar.g.getSharedPreferences("CodePush", 0);
        String string = sharedPreferences.getString("clientUniqueId", null);
        this.mClientUniqueId = string;
        if (string == null) {
            this.mClientUniqueId = UUID.randomUUID().toString();
            sharedPreferences.edit().putString("clientUniqueId", this.mClientUniqueId).apply();
        }
    }

    private void clearLifecycleEventListener() {
        if (this.mLifecycleEventListener != null) {
            getReactApplicationContext().removeLifecycleEventListener(this.mLifecycleEventListener);
            this.mLifecycleEventListener = null;
        }
    }

    private boolean isLiveReloadEnabled(w24 w24Var) {
        if (w24Var != null) {
            n34 n34VarY = w24Var.y();
            Method[] methods = n34VarY.getClass().getMethods();
            int length = methods.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Method method = methods[i];
                if (method.getName().equals("isReloadOnJSChangeEnabled")) {
                    try {
                        return ((Boolean) method.invoke(n34VarY, null)).booleanValue();
                    } catch (Exception unused) {
                    }
                } else {
                    i++;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.microsoft.codepush.react.b] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0078 -> B:39:0x0096). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x008c -> B:39:0x0096). Please report as a decompilation issue!!! */
    private void loadBundle() throws Throwable {
        String str = "Exception during the reflective setJSBundle block: ";
        clearLifecycleEventListener();
        try {
            rkc rkcVarResolveReactHost = resolveReactHost();
            isLiveReloadEnabled(rkcVarResolveReactHost != null ? rkcVarResolveReactHost.getH() : null);
            this.mCodePush.getClass();
        } catch (Exception unused) {
            this.mCodePush.getClass();
        }
        try {
            rkc rkcVarResolveReactHost2 = resolveReactHost();
            if (rkcVarResolveReactHost2 == null) {
                loadBundleLegacy();
                return;
            }
            com.microsoft.codepush.react.b bVar = this.mCodePush;
            String strC = bVar.c(bVar.b);
            g.h("[MyDebug] Latest JS bundle for New Arch: ".concat(strC));
            try {
                if (rkcVarResolveReactHost2 instanceof ReactHostImpl) {
                    ReactHostDelegate reactHostDelegate = getReactHostDelegate((ReactHostImpl) rkcVarResolveReactHost2);
                    if (reactHostDelegate != null) {
                        setJSBundle(reactHostDelegate, strC);
                    } else {
                        g.h("Could not get ReactHostDelegate from ReactHostImpl.");
                    }
                } else {
                    g.h("ReactHost is not a direct ReactHostImpl instance (" + rkcVarResolveReactHost2.getClass().getName() + "), skipping direct setJSBundle reflection attempt. This is expected with Expo.");
                }
            } catch (ClassCastException e2) {
                g.i(new Exception("ClassCastException trying to get/use ReactHostDelegate. Skipping reflection call to setJSBundle. This is expected for Expo.", e2));
            } catch (Exception e3) {
                g.h(str + e3.getMessage());
            }
            try {
                rkcVarResolveReactHost2.d("CodePush triggers reload");
                str = this.mCodePush;
                str.d();
            } catch (Exception unused2) {
                loadBundleLegacy();
            }
        } catch (Exception e4) {
            g.h("Failed to load the bundle, falling back to restarting the Activity (if it exists). " + e4.getMessage());
            loadBundleLegacy();
        }
    }

    private void loadBundleLegacy() {
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        this.mCodePush.getClass();
        com.microsoft.codepush.react.b.i = null;
        currentActivity.runOnUiThread(new a(currentActivity));
    }

    private void resetReactRootViews(fmc fmcVar) throws IllegalAccessException, NoSuchFieldException {
        Field declaredField = fmcVar.getClass().getDeclaredField("mAttachedRootViews");
        declaredField.setAccessible(true);
        List<wnc> list = (List) declaredField.get(fmcVar);
        for (wnc wncVar : list) {
            wncVar.removeAllViews();
            wncVar.setId(-1);
        }
        declaredField.set(fmcVar, list);
    }

    private fmc resolveInstanceManager() {
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity == null) {
            return null;
        }
        return ((pjc) currentActivity.getApplication()).getV().a();
    }

    private rkc resolveReactHost() {
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity == null) {
            return null;
        }
        return ((pjc) currentActivity.getApplication()).b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void restartAppInternal(boolean z) throws Throwable {
        if (this._restartInProgress) {
            g.h("Restart request queued until the current restart is completed");
            this._restartQueue.add(Boolean.valueOf(z));
            return;
        }
        if (!this._allowed) {
            g.h("Restart request queued until restarts are re-allowed");
            this._restartQueue.add(Boolean.valueOf(z));
            return;
        }
        this._restartInProgress = true;
        if (!z || this.mSettingsManager.e(null)) {
            loadBundle();
            g.h("Restarting app");
            return;
        }
        this._restartInProgress = false;
        if (this._restartQueue.size() > 0) {
            boolean zBooleanValue = this._restartQueue.get(0).booleanValue();
            this._restartQueue.remove(0);
            restartAppInternal(zBooleanValue);
        }
    }

    private void setJSBundle(ReactHostDelegate reactHostDelegate, String str) throws IllegalAccessException {
        try {
            JSBundleLoader jSBundleLoaderCreateAssetLoader = str.toLowerCase().startsWith("assets://") ? JSBundleLoader.createAssetLoader(getReactApplicationContext(), str, false) : JSBundleLoader.createFileLoader(str);
            Field declaredField = reactHostDelegate.getClass().getDeclaredField("jsBundleLoader");
            declaredField.setAccessible(true);
            declaredField.set(reactHostDelegate, jSBundleLoaderCreateAssetLoader);
        } catch (NoSuchFieldException unused) {
            StringBuilder sb = new StringBuilder("Field 'jsBundleLoader' NOT FOUND on ");
            sb.append(reactHostDelegate != null ? reactHostDelegate.getClass().getName() : "null");
            sb.append(". This is an EXPECTED and IGNORED failure with ExpoReactHostDelegate. Will rely on reactHost.reload(). Original log: Unable to set JSBundle of ReactHostDelegate - CodePush may not support this version of React Native");
            g.h(sb.toString());
        } catch (Exception unused2) {
            g.h("Unable to set JSBundle of ReactHostDelegate - CodePush may not support this version of React Native");
            throw new IllegalAccessException("Could not setJSBundle");
        }
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void allow(Promise promise) throws Throwable {
        g.h("Re-allowing restarts");
        this._allowed = true;
        if (this._restartQueue.size() > 0) {
            g.h("Executing pending restart");
            boolean zBooleanValue = this._restartQueue.get(0).booleanValue();
            this._restartQueue.remove(0);
            restartAppInternal(zBooleanValue);
        }
        promise.resolve(null);
    }

    @ReactMethod
    public void clearPendingRestart(Promise promise) {
        this._restartQueue.clear();
        promise.resolve(null);
    }

    @ReactMethod
    public void clearUpdates() {
        g.h("Clearing updates.");
        this.mCodePush.a();
    }

    @ReactMethod
    public void disallow(Promise promise) {
        g.h("Disallowing restarts");
        this._allowed = false;
        promise.resolve(null);
    }

    @ReactMethod
    public void downloadAndReplaceCurrentBundle(String str) {
    }

    @ReactMethod
    public void downloadUpdate(ReadableMap readableMap, boolean z, Promise promise) {
        new b(readableMap, z, promise).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @ReactMethod
    public void getConfiguration(Promise promise) {
        try {
            WritableMap writableMapCreateMap = Arguments.createMap();
            this.mCodePush.getClass();
            writableMapCreateMap.putString("appVersion", com.microsoft.codepush.react.b.l);
            writableMapCreateMap.putString("clientUniqueId", this.mClientUniqueId);
            writableMapCreateMap.putString("deploymentKey", this.mCodePush.f);
            this.mCodePush.getClass();
            writableMapCreateMap.putString("serverUrl", com.microsoft.codepush.react.b.m);
            String str = this.mBinaryContentsHash;
            if (str != null) {
                writableMapCreateMap.putString("packageHash", str);
            }
            promise.resolve(writableMapCreateMap);
        } catch (CodePushUnknownException e2) {
            g.i(e2);
            promise.reject(e2);
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap map = new HashMap();
        map.put("codePushInstallModeImmediate", Integer.valueOf(a92.IMMEDIATE.a()));
        map.put("codePushInstallModeOnNextRestart", Integer.valueOf(a92.ON_NEXT_RESTART.a()));
        map.put("codePushInstallModeOnNextResume", Integer.valueOf(a92.ON_NEXT_RESUME.a()));
        map.put("codePushInstallModeOnNextSuspend", Integer.valueOf(a92.ON_NEXT_SUSPEND.a()));
        map.put("codePushUpdateStateRunning", Integer.valueOf(c92.RUNNING.a()));
        map.put("codePushUpdateStatePending", Integer.valueOf(c92.PENDING.a()));
        map.put("codePushUpdateStateLatest", Integer.valueOf(c92.LATEST.a()));
        return map;
    }

    @ReactMethod
    public void getLatestRollbackInfo(Promise promise) {
        try {
            JSONObject jSONObjectB = this.mSettingsManager.b();
            if (jSONObjectB != null) {
                promise.resolve(g.c(jSONObjectB));
            } else {
                promise.resolve(null);
            }
        } catch (CodePushUnknownException e2) {
            g.i(e2);
            promise.reject(e2);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "CodePush";
    }

    @ReactMethod
    public void getNewStatusReport(Promise promise) {
        new d(promise).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public ReactHostDelegate getReactHostDelegate(ReactHostImpl reactHostImpl) {
        try {
            Field declaredField = reactHostImpl.getClass().getDeclaredField("mReactHostDelegate");
            declaredField.setAccessible(true);
            return (ReactHostDelegate) declaredField.get(reactHostImpl);
        } catch (IllegalAccessException | NoSuchFieldException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @ReactMethod
    public void getUpdateMetadata(int i, Promise promise) {
        new c(promise, i).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @ReactMethod
    public void installUpdate(ReadableMap readableMap, int i, int i2, Promise promise) {
        new e(readableMap, i, i2, promise).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @ReactMethod
    public void isFailedUpdate(String str, Promise promise) {
        try {
            promise.resolve(Boolean.valueOf(this.mSettingsManager.d(str)));
        } catch (CodePushUnknownException e2) {
            g.i(e2);
            promise.reject(e2);
        }
    }

    @ReactMethod
    public void isFirstRun(String str, Promise promise) {
        try {
            promise.resolve(Boolean.valueOf(this.mCodePush.a && str != null && str.length() > 0 && str.equals(this.mUpdateManager.i().optString("currentPackage", null))));
        } catch (CodePushUnknownException e2) {
            g.i(e2);
            promise.reject(e2);
        }
    }

    @ReactMethod
    public void notifyApplicationReady(Promise promise) {
        try {
            this.mSettingsManager.a.edit().remove("CODE_PUSH_PENDING_UPDATE").commit();
            promise.resolve("");
        } catch (CodePushUnknownException e2) {
            g.i(e2);
            promise.reject(e2);
        }
    }

    @ReactMethod
    public void recordStatusReported(ReadableMap readableMap) {
        try {
            this.mTelemetryManager.e(readableMap);
        } catch (CodePushUnknownException e2) {
            g.i(e2);
        }
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    @ReactMethod
    public void restartApp(boolean z, Promise promise) throws Throwable {
        try {
            restartAppInternal(z);
            promise.resolve(null);
        } catch (CodePushUnknownException e2) {
            g.i(e2);
            promise.reject(e2);
        }
    }

    @ReactMethod
    public void saveStatusReportForRetry(ReadableMap readableMap) {
        try {
            b92 b92Var = this.mTelemetryManager;
            b92Var.getClass();
            b92Var.a.edit().putString("CODE_PUSH_RETRY_DEPLOYMENT_REPORT", g.e(readableMap).toString()).commit();
        } catch (CodePushUnknownException e2) {
            g.i(e2);
        }
    }

    @ReactMethod
    public void setLatestRollbackInfo(String str, Promise promise) {
        try {
            this.mSettingsManager.h(str);
            promise.resolve(null);
        } catch (CodePushUnknownException e2) {
            g.i(e2);
            promise.reject(e2);
        }
    }

    private void setJSBundle(fmc fmcVar, String str) throws IllegalAccessException {
        JSBundleLoader jSBundleLoaderCreateFileLoader;
        try {
            if (str.toLowerCase().startsWith("assets://")) {
                jSBundleLoaderCreateFileLoader = JSBundleLoader.createAssetLoader(getReactApplicationContext(), str, false);
            } else {
                jSBundleLoaderCreateFileLoader = JSBundleLoader.createFileLoader(str);
            }
            Field declaredField = fmcVar.getClass().getDeclaredField("mBundleLoader");
            declaredField.setAccessible(true);
            declaredField.set(fmcVar, jSBundleLoaderCreateFileLoader);
        } catch (Exception unused) {
            g.h("Unable to set JSBundle of ReactInstanceManager - CodePush may not support this version of React Native");
            throw new IllegalAccessException("Could not setJSBundle");
        }
    }
}
