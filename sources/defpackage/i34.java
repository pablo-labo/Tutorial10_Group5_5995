package defpackage;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.datadog.android.core.internal.CoreFeature;
import com.facebook.react.bridge.DefaultJSExceptionHandler;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.JavascriptException;
import com.facebook.react.devsupport.HMRClient;
import com.facebook.react.modules.core.RCTNativeAppEventEmitter;
import com.facebook.react.runtime.ReactHostImpl;
import defpackage.pqe;
import defpackage.w24;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Set;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.internal.connection.RealCall;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i34 implements w24 {
    public final Context a;
    public final vlc b;
    public final String c;
    public final tm3 d;
    public final w6b e;
    public ReactContext f;
    public final j24 g;
    public final m24 h;
    public String i;
    public nqe[] j;
    public ix4 k;
    public final cce l;
    public final k34 m;
    public final LinkedHashMap<String, l24> n;
    public final File o;
    public final DefaultJSExceptionHandler p;
    public b0f q;
    public AlertDialog r;
    public wh3 s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public final ArrayList x;

    public static final class a {
    }

    public static final class b {
        public b() {
        }
    }

    public static final class c extends ArrayAdapter<String> {
        public final /* synthetic */ HashSet a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Activity activity, HashSet hashSet, String[] strArr) {
            super(activity, R.layout.simple_list_item_1, strArr);
            this.a = hashSet;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public final boolean areAllItemsEnabled() {
            return false;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            viewGroup.getClass();
            View view2 = super.getView(i, view, viewGroup);
            view2.getClass();
            view2.setEnabled(isEnabled(i));
            return view2;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public final boolean isEnabled(int i) {
            return !this.a.contains(getItem(i));
        }
    }

    public i34(Context context, vlc vlcVar, String str) {
        this.a = context;
        this.b = vlcVar;
        this.c = str;
        this.d = null;
        this.e = null;
        ym1 ym1Var = (ym1) this;
        j24 j24Var = new j24(context, new j34(ym1Var));
        this.g = j24Var;
        this.h = new m24(j24Var, context, j24Var.c);
        int i = 2;
        this.l = new cce(new r20(ym1Var, i));
        this.m = new k34(ym1Var);
        this.n = new LinkedHashMap<>();
        this.p = new DefaultJSExceptionHandler();
        this.x = new ArrayList();
        this.o = new File(context.getFilesDir(), "BridgelessReactNativeDevBundle.js");
        String lowerCase = "Bridgeless".toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        context.getDir(lowerCase.concat("_dev_js_split_bundles"), 0).getClass();
        k(true);
        this.d = new tm3(vlcVar);
        this.e = new w6b(new r20(ym1Var, i));
    }

    @Override // defpackage.w24
    public final void A() {
        RCTNativeAppEventEmitter rCTNativeAppEventEmitter;
        if (this.r == null && this.w && !ActivityManager.isUserAMonkey()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            HashSet hashSet = new HashSet();
            Context context = this.a;
            linkedHashMap.put(context.getString(com.indeed.android.jobsearch.R.string.catalyst_reload), new l24() { // from class: a34
                @Override // defpackage.l24
                public final void a() {
                    i34 i34Var = this.a;
                    j24 j24Var = i34Var.g;
                    if (!j24Var.c() && j24Var.b()) {
                        Context context2 = i34Var.a;
                        Toast.makeText(context2, context2.getString(com.indeed.android.jobsearch.R.string.catalyst_hot_reloading_auto_disable), 1).show();
                        j24Var.b.edit().putBoolean("hot_module_replacement", false).apply();
                    }
                    ((ym1) i34Var).w();
                }
            });
            j24 j24Var = this.g;
            j24Var.getClass();
            linkedHashMap.put(context.getString(com.indeed.android.jobsearch.R.string.catalyst_change_bundle_location), new l24() { // from class: b34
                @Override // defpackage.l24
                public final void a() {
                    i34 i34Var = this.a;
                    Activity activityA = i34Var.b.a();
                    if (activityA == null || activityA.isFinishing()) {
                        s55.f("ReactNative", "Unable to launch change bundle location because react activity is not available");
                        return;
                    }
                    j24 j24Var2 = i34Var.g;
                    final q20 q20Var = new q20(i34Var, 1);
                    j24Var2.getClass();
                    yya yyaVar = j24Var2.c;
                    String strA = yyaVar.a();
                    yyaVar.b("");
                    final String strA2 = yyaVar.a();
                    yyaVar.b(strA);
                    LinearLayout linearLayout = new LinearLayout(activityA);
                    linearLayout.setOrientation(1);
                    int i = (int) (4.0f * activityA.getResources().getDisplayMetrics().density);
                    int i2 = (int) (16.0f * activityA.getResources().getDisplayMetrics().density);
                    linearLayout.setPadding(i2, i2, i2, i2);
                    TextView textView = new TextView(activityA);
                    textView.setText(activityA.getString(com.indeed.android.jobsearch.R.string.catalyst_change_bundle_location_input_label));
                    textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                    final EditText editText = new EditText(activityA);
                    editText.setInputType(1);
                    editText.setHint(activityA.getString(com.indeed.android.jobsearch.R.string.catalyst_change_bundle_location_input_hint));
                    editText.setBackgroundResource(R.drawable.edit_text);
                    editText.setHintTextColor(-3355444);
                    editText.setTextColor(-16777216);
                    editText.setText(strA);
                    Button button = new Button(activityA);
                    button.setText(strA2);
                    button.setTextSize(12.0f);
                    button.setAllCaps(false);
                    button.setOnClickListener(new View.OnClickListener() { // from class: d02
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            editText.setText(strA2);
                        }
                    });
                    x70.a.getClass();
                    final String str = activityA.getResources().getString(com.indeed.android.jobsearch.R.string.react_native_dev_server_ip) + ":" + activityA.getResources().getInteger(com.indeed.android.jobsearch.R.integer.react_native_dev_server_port);
                    Button button2 = new Button(activityA);
                    button2.setText(str);
                    button2.setTextSize(12.0f);
                    button2.setAllCaps(false);
                    button2.setOnClickListener(new View.OnClickListener() { // from class: e02
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            editText.setText(str);
                        }
                    });
                    LinearLayout linearLayout2 = new LinearLayout(activityA);
                    linearLayout2.setOrientation(0);
                    linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                    linearLayout2.addView(button);
                    linearLayout2.addView(button2);
                    TextView textView2 = new TextView(activityA);
                    textView2.setText(activityA.getString(com.indeed.android.jobsearch.R.string.catalyst_change_bundle_location_instructions, x70.a(activityA)));
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams.setMargins(0, i, 0, i2);
                    textView2.setLayoutParams(layoutParams);
                    Button button3 = new Button(activityA);
                    button3.setText(activityA.getString(com.indeed.android.jobsearch.R.string.catalyst_change_bundle_location_apply));
                    Button button4 = new Button(activityA);
                    button4.setText(activityA.getString(com.indeed.android.jobsearch.R.string.catalyst_change_bundle_location_cancel));
                    linearLayout.addView(textView);
                    linearLayout.addView(editText);
                    linearLayout.addView(linearLayout2);
                    linearLayout.addView(textView2);
                    linearLayout.addView(button3);
                    linearLayout.addView(button4);
                    final AlertDialog alertDialogCreate = new AlertDialog.Builder(activityA).setTitle(activityA.getString(com.indeed.android.jobsearch.R.string.catalyst_change_bundle_location)).setView(linearLayout).create();
                    button3.setOnClickListener(new View.OnClickListener() { // from class: f02
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            String string = editText.getText().toString();
                            i34 i34Var2 = (i34) q20Var.b;
                            string.getClass();
                            i34Var2.g.c.b(string);
                            ((ym1) i34Var2).w();
                            alertDialogCreate.dismiss();
                        }
                    });
                    button4.setOnClickListener(new View.OnClickListener() { // from class: g02
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            alertDialogCreate.dismiss();
                        }
                    });
                    alertDialogCreate.show();
                }
            });
            linkedHashMap.put(context.getString(com.indeed.android.jobsearch.R.string.catalyst_inspector_toggle), new l24() { // from class: c34
                @Override // defpackage.l24
                public final void a() {
                    i34 i34Var = this.a;
                    i34Var.g.b.edit().putBoolean("inspector_debug", !r0.b.getBoolean("inspector_debug", false)).apply();
                    i34Var.b.b();
                }
            });
            String string = j24Var.b() ? context.getString(com.indeed.android.jobsearch.R.string.catalyst_hot_reloading_stop) : context.getString(com.indeed.android.jobsearch.R.string.catalyst_hot_reloading);
            string.getClass();
            linkedHashMap.put(string, new l24() { // from class: d34
                @Override // defpackage.l24
                public final void a() {
                    i34 i34Var = this.a;
                    j24 j24Var2 = i34Var.g;
                    boolean zB = j24Var2.b();
                    j24Var2.b.edit().putBoolean("hot_module_replacement", !zB).apply();
                    ReactContext reactContext = i34Var.f;
                    if (reactContext != null) {
                        if (zB) {
                            HMRClient hMRClient = (HMRClient) reactContext.getJSModule(HMRClient.class);
                            if (hMRClient != null) {
                                hMRClient.disable();
                            }
                        } else {
                            HMRClient hMRClient2 = (HMRClient) reactContext.getJSModule(HMRClient.class);
                            if (hMRClient2 != null) {
                                hMRClient2.enable();
                            }
                        }
                    }
                    if (zB || j24Var2.c()) {
                        return;
                    }
                    Context context2 = i34Var.a;
                    Toast.makeText(context2, context2.getString(com.indeed.android.jobsearch.R.string.catalyst_hot_reloading_auto_enable), 1).show();
                    j24Var2.b.edit().putBoolean("js_dev_mode_debug", true).apply();
                    ((ym1) i34Var).w();
                }
            });
            String string2 = j24Var.a() ? context.getString(com.indeed.android.jobsearch.R.string.catalyst_perf_monitor_stop) : context.getString(com.indeed.android.jobsearch.R.string.catalyst_perf_monitor);
            string2.getClass();
            linkedHashMap.put(string2, new l24() { // from class: e34
                @Override // defpackage.l24
                public final void a() {
                    i34 i34Var = this.a;
                    j24 j24Var2 = i34Var.g;
                    if (!j24Var2.a()) {
                        Activity activityA = i34Var.b.a();
                        if (activityA == null) {
                            s55.f("ReactNative", "Unable to get reference to react activity");
                        } else if (!Settings.canDrawOverlays(activityA)) {
                            Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + activityA.getPackageName()));
                            intent.setFlags(268435456);
                            s55.n("ReactNative", "Overlay permissions needs to be granted in order for react native apps to run in dev mode");
                            PackageManager packageManager = activityA.getPackageManager();
                            if (packageManager != null && intent.resolveActivity(packageManager) != null) {
                                activityA.startActivity(intent);
                            }
                        }
                    }
                    j24Var2.b.edit().putBoolean("fps_debug", !j24Var2.a()).apply();
                }
            });
            linkedHashMap.put(context.getString(com.indeed.android.jobsearch.R.string.catalyst_settings), new l24() { // from class: f34
                @Override // defpackage.l24
                public final void a() {
                    Context context2 = this.a.a;
                    Intent intent = new Intent(context2, (Class<?>) u24.class);
                    intent.setFlags(268435456);
                    context2.startActivity(intent);
                }
            });
            LinkedHashMap<String, l24> linkedHashMap2 = this.n;
            if (!linkedHashMap2.isEmpty()) {
                linkedHashMap.putAll(linkedHashMap2);
            }
            Collection collectionValues = linkedHashMap.values();
            collectionValues.getClass();
            final l24[] l24VarArr = (l24[]) collectionValues.toArray(new l24[0]);
            Activity activityA = this.b.a();
            if (activityA == null || activityA.isFinishing()) {
                s55.f("ReactNative", "Unable to launch dev options menu because react activity isn't available");
                return;
            }
            LinearLayout linearLayout = new LinearLayout(activityA);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(activityA);
            textView.setText(activityA.getString(com.indeed.android.jobsearch.R.string.catalyst_dev_menu_header, "Bridgeless"));
            textView.setPadding(0, 50, 0, 0);
            textView.setGravity(17);
            textView.setTextSize(16.0f);
            textView.setTypeface(textView.getTypeface(), 1);
            linearLayout.addView(textView);
            try {
                throw new IllegalStateException("Not implemented for bridgeless mode");
            } catch (IllegalStateException unused) {
                Set setKeySet = linkedHashMap.keySet();
                setKeySet.getClass();
                AlertDialog alertDialogCreate = new AlertDialog.Builder(activityA).setCustomTitle(linearLayout).setAdapter(new c(activityA, hashSet, (String[]) setKeySet.toArray(new String[0])), new DialogInterface.OnClickListener() { // from class: g34
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        l24VarArr[i].a();
                        this.r = null;
                    }
                }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: h34
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        this.a.r = null;
                    }
                }).create();
                this.r = alertDialogCreate;
                if (alertDialogCreate != null) {
                    alertDialogCreate.show();
                }
                ReactContext reactContext = this.f;
                if (reactContext == null || (rCTNativeAppEventEmitter = (RCTNativeAppEventEmitter) reactContext.getJSModule(RCTNativeAppEventEmitter.class)) == null) {
                    return;
                }
                rCTNativeAppEventEmitter.emit("RCTDevMenuShown", null);
            }
        }
    }

    @Override // defpackage.w24
    public final void B(ReactApplicationContext reactApplicationContext) {
        H(reactApplicationContext);
    }

    @Override // defpackage.w24
    public final void C(ReactContext reactContext) {
        reactContext.getClass();
        if (reactContext == this.f) {
            H(null);
        }
        System.gc();
    }

    @Override // defpackage.w24
    public final void D() {
        ReactContext reactContext = this.f;
        String string = this.a.getString(com.indeed.android.jobsearch.R.string.catalyst_open_debugger_error);
        m24 m24Var = this.h;
        m24Var.getClass();
        String str = String.format(Locale.US, "http://%s/open-debugger?device=%s", Arrays.copyOf(new Object[]{m24Var.c.a(), Uri.encode(m24Var.b())}, 2));
        Request.Builder builder = new Request.Builder();
        builder.g(str);
        RequestBody.INSTANCE.getClass();
        builder.e("POST", RequestBody.Companion.a("", null));
        Request requestB = builder.b();
        OkHttpClient okHttpClient = m24Var.d;
        okHttpClient.getClass();
        new RealCall(okHttpClient, requestB, false).R0(new p24(0, reactContext, string));
    }

    @Override // defpackage.w24
    public final void E(zya zyaVar) {
        m24 m24Var = this.h;
        m24Var.getClass();
        bza bzaVar = m24Var.f;
        String strA = m24Var.c.a();
        bzaVar.getClass();
        String str = String.format(Locale.US, "http://%s/status", Arrays.copyOf(new Object[]{strA}, 1));
        Request.Builder builder = new Request.Builder();
        builder.g(str);
        new RealCall(bzaVar.a, builder.b(), false).R0(new aza(zyaVar));
    }

    public final void F() {
        UiThreadUtil.assertOnUiThread();
        boolean z = this.w;
        wh3 wh3Var = this.s;
        m24 m24Var = this.h;
        tm3 tm3Var = this.d;
        k34 k34Var = this.m;
        cce cceVar = this.l;
        Context context = this.a;
        boolean z2 = false;
        if (!z) {
            if (wh3Var != null) {
                UiThreadUtil.runOnUiThread(new vh3(z2, wh3Var));
            }
            if (this.v) {
                SensorManager sensorManager = cceVar.e;
                if (sensorManager != null) {
                    sensorManager.unregisterListener(cceVar);
                }
                cceVar.e = null;
                this.v = false;
            }
            if (this.u) {
                context.unregisterReceiver(k34Var);
                this.u = false;
            }
            i();
            AlertDialog alertDialog = this.r;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
            this.r = null;
            if (tm3Var != null) {
                tm3Var.c();
            }
            m24Var.getClass();
            new o24(m24Var).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            return;
        }
        if (wh3Var != null) {
            UiThreadUtil.runOnUiThread(new vh3(this.g.a(), wh3Var));
        }
        if (!this.v) {
            Object systemService = context.getSystemService("sensor");
            systemService.getClass();
            SensorManager sensorManager2 = (SensorManager) systemService;
            cceVar.getClass();
            Sensor defaultSensor = sensorManager2.getDefaultSensor(1);
            if (defaultSensor != null) {
                cceVar.e = sensorManager2;
                cceVar.f = -1L;
                sensorManager2.registerListener(cceVar, defaultSensor, 2);
                cceVar.h = 0L;
                cceVar.g = 0;
                cceVar.b = 0.0f;
                cceVar.c = 0.0f;
                cceVar.d = 0.0f;
            }
            this.v = true;
        }
        if (!this.u) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(context.getPackageName() + ".RELOAD_APP_ACTION");
            if (Build.VERSION.SDK_INT < 34 || context.getApplicationInfo().targetSdkVersion < 34) {
                context.registerReceiver(k34Var, intentFilter);
            } else {
                context.registerReceiver(k34Var, intentFilter, 2);
            }
            this.u = true;
        }
        if (this.t && tm3Var != null) {
            tm3Var.d("Reloading...");
        }
        String simpleName = getClass().getSimpleName();
        b bVar = new b();
        m24Var.getClass();
        if (m24Var.h != null) {
            s55.n("ReactNative", "Packager connection already open, nooping.");
        } else {
            new t24(bVar, simpleName, m24Var).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public final void G() {
        if (UiThreadUtil.isOnUiThread()) {
            F();
        } else {
            UiThreadUtil.runOnUiThread(new qx0(this, 4));
        }
    }

    public final void H(ReactApplicationContext reactApplicationContext) {
        if (this.f == reactApplicationContext) {
            return;
        }
        this.f = reactApplicationContext;
        wh3 wh3Var = this.s;
        if (wh3Var != null) {
            UiThreadUtil.runOnUiThread(new vh3(false, wh3Var));
        }
        if (reactApplicationContext != null) {
            this.s = new wh3(reactApplicationContext);
        }
        if (reactApplicationContext != null) {
            try {
                URL url = new URL(m());
                String path = url.getPath();
                if (path != null) {
                    path = path.substring(1);
                }
                ((HMRClient) reactApplicationContext.getJSModule(HMRClient.class)).setup(CoreFeature.DEFAULT_SOURCE_NAME, path, url.getHost(), url.getPort() != -1 ? url.getPort() : url.getDefaultPort(), this.g.b(), url.getProtocol());
            } catch (MalformedURLException e) {
                I(e, e.getMessage());
            }
        }
        G();
    }

    public final void I(Exception exc, String str) {
        exc.getClass();
        s55.g("ReactNative", "Exception in native call", exc);
        int i = pqe.a;
        StackTraceElement[] stackTrace = exc.getStackTrace();
        int length = stackTrace.length;
        nqe[] nqeVarArr = new nqe[length];
        for (int i2 = 0; i2 < length; i2++) {
            String className = stackTrace[i2].getClassName();
            String fileName = stackTrace[i2].getFileName();
            String methodName = stackTrace[i2].getMethodName();
            methodName.getClass();
            nqeVarArr[i2] = new pqe.a(className, fileName, methodName, stackTrace[i2].getLineNumber());
        }
        UiThreadUtil.runOnUiThread(new rm3(this, str, nqeVarArr, ix4.NATIVE));
    }

    @Override // defpackage.w24
    public final ReactContext a() {
        return this.f;
    }

    @Override // defpackage.w24
    public final Activity b() {
        return this.b.a();
    }

    @Override // defpackage.w24
    public final String c() {
        String absolutePath = this.o.getAbsolutePath();
        absolutePath.getClass();
        return absolutePath;
    }

    @Override // defpackage.w24
    public final String d() {
        return this.i;
    }

    @Override // defpackage.w24
    public final void e() {
        m24 m24Var = this.h;
        m24Var.getClass();
        new n24(m24Var).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @Override // defpackage.w24
    public final boolean f() {
        return this.w;
    }

    @Override // defpackage.w24
    public final void g(final boolean z) {
        if (this.w) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: y24
                @Override // java.lang.Runnable
                public final void run() {
                    i34 i34Var = this.a;
                    i34Var.g.b.edit().putBoolean("hot_module_replacement", z).apply();
                    ((ym1) i34Var).w();
                }
            });
        }
    }

    @Override // defpackage.w24
    public final b0f h(String str) {
        return null;
    }

    @Override // com.facebook.react.bridge.JSExceptionHandler
    public final void handleException(Exception exc) {
        exc.getClass();
        if (!this.w) {
            this.p.handleException(exc);
            return;
        }
        String message = exc.getMessage();
        if (message == null) {
            message = "Exception in native call from JS";
        }
        StringBuilder sb = new StringBuilder(message);
        for (Throwable cause = exc.getCause(); cause != null; cause = cause.getCause()) {
            sb.append("\n\n");
            sb.append(cause.getMessage());
        }
        if (!(exc instanceof JavascriptException)) {
            I(exc, sb.toString());
        } else {
            s55.g("ReactNative", "Exception in native call from JS", exc);
            UiThreadUtil.runOnUiThread(new rm3(this, exc.getMessage(), new nqe[0], ix4.JS));
        }
    }

    @Override // defpackage.w24
    public final void i() {
        b0f b0fVar = this.q;
        if (b0fVar != null) {
            b0fVar.c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w24
    public final Pair<String, nqe[]> j(Pair<String, nqe[]> pair) {
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            pair = ((kw4) it.next()).a();
        }
        return pair;
    }

    @Override // defpackage.w24
    public final void k(boolean z) {
        this.w = z;
        G();
    }

    @Override // defpackage.w24
    public final ix4 l() {
        return this.k;
    }

    @Override // defpackage.w24
    public final String m() {
        String str = this.c;
        if (str == null) {
            return "";
        }
        m24 m24Var = this.h;
        m24Var.getClass();
        return m24.a(m24Var, str, null, 28);
    }

    @Override // defpackage.w24
    public final void n(String str, v24 v24Var) {
        this.n.put(str, v24Var);
    }

    @Override // defpackage.w24
    public final void o(View view) {
    }

    @Override // defpackage.w24
    public final void p() {
        w6b w6bVar = this.e;
        if (w6bVar != null) {
            UiThreadUtil.runOnUiThread(new jy1(w6bVar, 2));
        }
    }

    @Override // defpackage.w24
    public final View q() {
        boolean z;
        vlc vlcVar = this.b;
        Activity activityA = vlcVar.a();
        if (activityA == null) {
            return null;
        }
        ReactHostImpl reactHostImpl = vlcVar.a;
        synchronized (reactHostImpl.j) {
            try {
                HashSet hashSet = reactHostImpl.j;
                z = false;
                if (hashSet == null || !hashSet.isEmpty()) {
                    Iterator it = hashSet.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (wl7.b(((qoc) it.next()).a.b(), "LogBox")) {
                            z = true;
                            break;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            return null;
        }
        qoc qocVar = new qoc(activityA, "LogBox", new Bundle());
        qocVar.c(new roc(activityA, qocVar));
        qocVar.a(vlcVar.a);
        qocVar.start();
        return qocVar.b();
    }

    @Override // defpackage.w24
    public final void r() {
        if (this.w) {
            UiThreadUtil.runOnUiThread(new zf3(this, 1));
        }
    }

    @Override // defpackage.w24
    public final fuc s() {
        return null;
    }

    @Override // defpackage.w24
    public final void t() {
        if (this.w) {
            m24 m24Var = this.h;
            if (m24Var.i != null) {
                s55.n("ReactNative", "Inspector connection already open, nooping.");
            } else {
                new q24(m24Var).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            }
        }
    }

    @Override // defpackage.w24
    public final nqe[] u() {
        return this.j;
    }

    @Override // defpackage.w24
    public final void v(final String str, final w24.a aVar) {
        final w6b w6bVar = this.e;
        if (w6bVar != null) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: v6b
                @Override // java.lang.Runnable
                public final void run() {
                    w6b w6bVar2 = w6bVar;
                    Dialog dialog = w6bVar2.b;
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    Activity activityA = ((ym1) w6bVar2.a.b).b.a();
                    if (activityA == null || activityA.isFinishing()) {
                        activityA = null;
                    }
                    if (activityA == null) {
                        return;
                    }
                    View viewInflate = LayoutInflater.from(activityA).inflate(com.indeed.android.jobsearch.R.layout.paused_in_debugger_view, (ViewGroup) null);
                    viewInflate.getClass();
                    viewInflate.findViewById(com.indeed.android.jobsearch.R.id.button).setOnClickListener(new dh3(aVar, 2));
                    ((TextView) viewInflate.findViewById(com.indeed.android.jobsearch.R.id.button_text)).setText(str);
                    Dialog dialog2 = new Dialog(activityA, com.indeed.android.jobsearch.R.style.NoAnimationDialog);
                    dialog2.setContentView(viewInflate);
                    dialog2.setCancelable(false);
                    w6bVar2.b = dialog2;
                    Window window = dialog2.getWindow();
                    if (window != null) {
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.getClass();
                        attributes.dimAmount = 0.2f;
                        window.setAttributes(attributes);
                        window.addFlags(2);
                        window.setGravity(48);
                        window.setElevation(0.0f);
                        window.setBackgroundDrawable(new ColorDrawable(0));
                        window.setBackgroundDrawableResource(com.indeed.android.jobsearch.R.drawable.paused_in_debugger_background);
                    }
                    Dialog dialog3 = w6bVar2.b;
                    if (dialog3 != null) {
                        dialog3.show();
                    }
                }
            });
        }
    }

    @Override // defpackage.w24
    public final void x(final boolean z) {
        if (this.w) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: x24
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.g.b.edit().putBoolean("fps_debug", z).apply();
                }
            });
        }
    }

    @Override // defpackage.w24
    public final n34 y() {
        return this.g;
    }

    @Override // defpackage.w24
    public final boolean z() {
        Context context = this.a;
        if (this.w) {
            File file = this.o;
            if (file.exists()) {
                try {
                    String packageName = context.getPackageName();
                    PackageManager packageManager = context.getPackageManager();
                    if (packageManager != null) {
                        if (file.lastModified() > packageManager.getPackageInfo(packageName, 0).lastUpdateTime) {
                            File file2 = new File(String.format(Locale.US, "/data/local/tmp/exopackage/%s//secondary-dex", Arrays.copyOf(new Object[]{packageName}, 1)));
                            if (file2.exists()) {
                                if (file.lastModified() > file2.lastModified()) {
                                }
                            }
                            return true;
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    s55.f("ReactNative", "DevSupport is unable to get current app info");
                }
            }
        }
        return false;
    }
}
