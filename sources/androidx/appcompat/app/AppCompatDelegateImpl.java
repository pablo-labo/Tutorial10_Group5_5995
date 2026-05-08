package androidx.appcompat.app;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.e;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.ViewStubCompat;
import defpackage.apg;
import defpackage.bj0;
import defpackage.c19;
import defpackage.dj0;
import defpackage.dk0;
import defpackage.dpg;
import defpackage.e19;
import defpackage.ek0;
import defpackage.emg;
import defpackage.epg;
import defpackage.evf;
import defpackage.fk3;
import defpackage.fu2;
import defpackage.fvf;
import defpackage.h4;
import defpackage.hj0;
import defpackage.hzg;
import defpackage.i7;
import defpackage.ij0;
import defpackage.isg;
import defpackage.jfe;
import defpackage.jj0;
import defpackage.k6;
import defpackage.kca;
import defpackage.kj0;
import defpackage.l5;
import defpackage.lze;
import defpackage.nze;
import defpackage.oie;
import defpackage.oze;
import defpackage.pj0;
import defpackage.pnb;
import defpackage.prg;
import defpackage.qj0;
import defpackage.r6;
import defpackage.tj0;
import defpackage.tqe;
import defpackage.uo9;
import defpackage.wac;
import defpackage.wi0;
import defpackage.xj0;
import defpackage.z3;
import defpackage.zj0;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class AppCompatDelegateImpl extends androidx.appcompat.app.d implements f.a, LayoutInflater.Factory2 {
    public static final jfe<String, Integer> X0 = new jfe<>();
    public static final int[] Y0 = {R.attr.windowBackground};
    public static final boolean Z0 = !"robolectric".equals(Build.FINGERPRINT);
    public boolean A0;
    public PanelFeatureState[] B0;
    public PanelFeatureState C0;
    public boolean D0;
    public boolean E0;
    public boolean F0;
    public boolean G0;
    public Configuration H0;
    public final int I0;
    public int J0;
    public int K0;
    public boolean L0;
    public k M0;
    public i N0;
    public boolean O0;
    public int P0;
    public boolean R0;
    public Rect S0;
    public Rect T0;
    public ek0 U0;
    public OnBackInvokedDispatcher V0;
    public OnBackInvokedCallback W0;
    public final Object Y;
    public final Context Z;
    public Window a0;
    public h b0;
    public final bj0 c0;
    public androidx.appcompat.app.a d0;
    public oze e0;
    public CharSequence f0;
    public fk3 g0;
    public c h0;
    public m i0;
    public i7 j0;
    public ActionBarContextView k0;
    public PopupWindow l0;
    public jj0 m0;
    public boolean p0;
    public ViewGroup q0;
    public TextView r0;
    public View s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;
    public boolean w0;
    public boolean x0;
    public boolean y0;
    public boolean z0;
    public prg n0 = null;
    public final boolean o0 = true;
    public final a Q0 = new a();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl.P0 & 1) != 0) {
                appCompatDelegateImpl.C(0);
            }
            if ((appCompatDelegateImpl.P0 & 4096) != 0) {
                appCompatDelegateImpl.C(108);
            }
            appCompatDelegateImpl.O0 = false;
            appCompatDelegateImpl.P0 = 0;
        }
    }

    public interface b {
    }

    public final class c implements j.a {
        public c() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void c(androidx.appcompat.view.menu.f fVar, boolean z) {
            AppCompatDelegateImpl.this.y(fVar);
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean d(androidx.appcompat.view.menu.f fVar) {
            Window.Callback callback = AppCompatDelegateImpl.this.a0.getCallback();
            if (callback == null) {
                return true;
            }
            callback.onMenuOpened(108, fVar);
            return true;
        }
    }

    public class d {
        public final lze.a a;

        public class a extends oie {
            public a() {
            }

            @Override // defpackage.rrg
            public final void c() {
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                appCompatDelegateImpl.k0.setVisibility(8);
                PopupWindow popupWindow = appCompatDelegateImpl.l0;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (appCompatDelegateImpl.k0.getParent() instanceof View) {
                    View view = (View) appCompatDelegateImpl.k0.getParent();
                    WeakHashMap<View, prg> weakHashMap = epg.a;
                    epg.c.c(view);
                }
                appCompatDelegateImpl.k0.h();
                appCompatDelegateImpl.n0.d(null);
                appCompatDelegateImpl.n0 = null;
                ViewGroup viewGroup = appCompatDelegateImpl.q0;
                WeakHashMap<View, prg> weakHashMap2 = epg.a;
                epg.c.c(viewGroup);
            }
        }

        public d(lze.a aVar) {
            this.a = aVar;
        }

        public final void a(i7 i7Var) {
            lze.a aVar = this.a;
            aVar.a.onDestroyActionMode(aVar.a(i7Var));
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl.l0 != null) {
                appCompatDelegateImpl.a0.getDecorView().removeCallbacks(appCompatDelegateImpl.m0);
            }
            if (appCompatDelegateImpl.k0 != null) {
                prg prgVar = appCompatDelegateImpl.n0;
                if (prgVar != null) {
                    prgVar.b();
                }
                prg prgVarA = epg.a(appCompatDelegateImpl.k0);
                prgVarA.a(0.0f);
                appCompatDelegateImpl.n0 = prgVarA;
                prgVarA.d(new a());
            }
            appCompatDelegateImpl.j0 = null;
            ViewGroup viewGroup = appCompatDelegateImpl.q0;
            WeakHashMap<View, prg> weakHashMap = epg.a;
            epg.c.c(viewGroup);
            appCompatDelegateImpl.P();
        }

        public final boolean b(i7 i7Var, Menu menu) {
            ViewGroup viewGroup = AppCompatDelegateImpl.this.q0;
            WeakHashMap<View, prg> weakHashMap = epg.a;
            epg.c.c(viewGroup);
            lze.a aVar = this.a;
            ActionMode.Callback callback = aVar.a;
            lze lzeVarA = aVar.a(i7Var);
            jfe<Menu, Menu> jfeVar = aVar.d;
            Menu uo9Var = jfeVar.get(menu);
            if (uo9Var == null) {
                uo9Var = new uo9(aVar.b, (nze) menu);
                jfeVar.put(menu, uo9Var);
            }
            return callback.onPrepareActionMode(lzeVarA, uo9Var);
        }
    }

    public static class e {
        public static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        public static String b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    public static class f {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        public static c19 b(Configuration configuration) {
            return c19.a(configuration.getLocales().toLanguageTags());
        }

        public static void c(c19 c19Var) {
            LocaleList.setDefault(LocaleList.forLanguageTags(c19Var.a.a.toLanguageTags()));
        }

        public static void d(Configuration configuration, c19 c19Var) {
            configuration.setLocales(LocaleList.forLanguageTags(c19Var.a.a.toLanguageTags()));
        }
    }

    public static class g {
        public static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        public static OnBackInvokedCallback b(Object obj, final AppCompatDelegateImpl appCompatDelegateImpl) {
            Objects.requireNonNull(appCompatDelegateImpl);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: lj0
                public final void onBackInvoked() {
                    appCompatDelegateImpl.K();
                }
            };
            k6.g(obj).registerOnBackInvokedCallback(1000000, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        public static void c(Object obj, Object obj2) {
            k6.g(obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    public class i extends j {
        public final PowerManager c;

        public i(Context context) {
            super();
            this.c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.j
        public final IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.j
        public final int c() {
            return e.a(this.c) ? 2 : 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.j
        public final void d() {
            AppCompatDelegateImpl.this.u(true, true);
        }
    }

    public abstract class j {
        public a a;

        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                j.this.d();
            }
        }

        public j() {
        }

        public final void a() {
            a aVar = this.a;
            if (aVar != null) {
                try {
                    AppCompatDelegateImpl.this.Z.unregisterReceiver(aVar);
                } catch (IllegalArgumentException unused) {
                }
                this.a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public final void e() {
            a();
            IntentFilter intentFilterB = b();
            if (intentFilterB.countActions() == 0) {
                return;
            }
            if (this.a == null) {
                this.a = new a();
            }
            AppCompatDelegateImpl.this.Z.registerReceiver(this.a, intentFilterB);
        }
    }

    public class k extends j {
        public final fvf c;

        public k(fvf fvfVar) {
            super();
            this.c = fvfVar;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.j
        public final IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.j
        public final int c() {
            Location location;
            boolean z;
            long j;
            fvf fvfVar = this.c;
            fvf.a aVar = fvfVar.c;
            LocationManager locationManager = fvfVar.b;
            if (aVar.b > System.currentTimeMillis()) {
                z = aVar.a;
            } else {
                Context context = fvfVar.a;
                Location lastKnownLocation = null;
                if (h4.h(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                    try {
                    } catch (Exception e) {
                        Log.d("TwilightManager", "Failed to get last known location", e);
                    }
                    Location lastKnownLocation2 = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                    location = lastKnownLocation2;
                } else {
                    location = null;
                }
                if (h4.h(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                    try {
                        if (locationManager.isProviderEnabled("gps")) {
                            lastKnownLocation = locationManager.getLastKnownLocation("gps");
                        }
                    } catch (Exception e2) {
                        Log.d("TwilightManager", "Failed to get last known location", e2);
                    }
                }
                if (lastKnownLocation == null || location == null ? lastKnownLocation != null : lastKnownLocation.getTime() > location.getTime()) {
                    location = lastKnownLocation;
                }
                if (location != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (evf.d == null) {
                        evf.d = new evf();
                    }
                    evf evfVar = evf.d;
                    evfVar.a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                    evfVar.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
                    z = evfVar.c == 1;
                    long j2 = evfVar.b;
                    long j3 = evfVar.a;
                    evfVar.a(86400000 + jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
                    long j4 = evfVar.b;
                    if (j2 == -1 || j3 == -1) {
                        j = jCurrentTimeMillis + 43200000;
                    } else {
                        if (jCurrentTimeMillis > j3) {
                            j2 = j4;
                        } else if (jCurrentTimeMillis > j2) {
                            j2 = j3;
                        }
                        j = j2 + 60000;
                    }
                    aVar.a = z;
                    aVar.b = j;
                } else {
                    Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                    int i = Calendar.getInstance().get(11);
                    if (i < 6 || i >= 22) {
                        z = true;
                    }
                }
            }
            return z ? 2 : 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.j
        public final void d() {
            AppCompatDelegateImpl.this.u(true, true);
        }
    }

    public class l extends ContentFrameLayout {
        public l(fu2 fu2Var) {
            super(fu2Var, null);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.B(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                    AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                    appCompatDelegateImpl.z(appCompatDelegateImpl.G(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public final void setBackgroundResource(int i) {
            setBackgroundDrawable(pnb.A(getContext(), i));
        }
    }

    public final class m implements j.a {
        public m() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void c(androidx.appcompat.view.menu.f fVar, boolean z) {
            PanelFeatureState panelFeatureState;
            androidx.appcompat.view.menu.f fVarK = fVar.k();
            int i = 0;
            boolean z2 = fVarK != fVar;
            if (z2) {
                fVar = fVarK;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            PanelFeatureState[] panelFeatureStateArr = appCompatDelegateImpl.B0;
            int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
            while (true) {
                if (i < length) {
                    panelFeatureState = panelFeatureStateArr[i];
                    if (panelFeatureState != null && panelFeatureState.h == fVar) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    panelFeatureState = null;
                    break;
                }
            }
            if (panelFeatureState != null) {
                if (!z2) {
                    appCompatDelegateImpl.z(panelFeatureState, z);
                } else {
                    appCompatDelegateImpl.x(panelFeatureState.a, panelFeatureState, fVarK);
                    appCompatDelegateImpl.z(panelFeatureState, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean d(androidx.appcompat.view.menu.f fVar) {
            Window.Callback callback;
            if (fVar != fVar.k()) {
                return true;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (!appCompatDelegateImpl.v0 || (callback = appCompatDelegateImpl.a0.getCallback()) == null || appCompatDelegateImpl.G0) {
                return true;
            }
            callback.onMenuOpened(108, fVar);
            return true;
        }
    }

    public AppCompatDelegateImpl(Context context, Window window, bj0 bj0Var, Object obj) {
        wi0 wi0Var = null;
        this.I0 = -100;
        this.Z = context;
        this.c0 = bj0Var;
        this.Y = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof wi0)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        wi0Var = (wi0) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (wi0Var != null) {
                this.I0 = wi0Var.w().e();
            }
        }
        if (this.I0 == -100) {
            String name = this.Y.getClass().getName();
            jfe<String, Integer> jfeVar = X0;
            Integer num = jfeVar.get(name);
            if (num != null) {
                this.I0 = num.intValue();
                jfeVar.remove(this.Y.getClass().getName());
            }
        }
        if (window != null) {
            v(window);
        }
        pj0.d();
    }

    public static Configuration A(Context context, int i2, c19 c19Var, Configuration configuration, boolean z) {
        int i3 = i2 != 1 ? i2 != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        if (c19Var != null) {
            f.d(configuration2, c19Var);
        }
        return configuration2;
    }

    public static c19 w(Context context) {
        c19 c19Var;
        c19 c19Var2;
        if (Build.VERSION.SDK_INT >= 33 || (c19Var = androidx.appcompat.app.d.c) == null) {
            return null;
        }
        c19 c19VarB = f.b(context.getApplicationContext().getResources().getConfiguration());
        LocaleList localeList = c19Var.a.a;
        if (localeList.isEmpty()) {
            c19Var2 = c19.b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i2 = 0;
            while (i2 < c19VarB.a.a.size() + localeList.size()) {
                Locale locale = i2 < localeList.size() ? localeList.get(i2) : c19VarB.a.a.get(i2 - localeList.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i2++;
            }
            c19Var2 = new c19(new e19(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return c19Var2.a.a.isEmpty() ? c19VarB : c19Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean B(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.B(android.view.KeyEvent):boolean");
    }

    public final void C(int i2) {
        PanelFeatureState panelFeatureStateG = G(i2);
        if (panelFeatureStateG.h != null) {
            Bundle bundle = new Bundle();
            panelFeatureStateG.h.t(bundle);
            if (bundle.size() > 0) {
                panelFeatureStateG.p = bundle;
            }
            panelFeatureStateG.h.w();
            panelFeatureStateG.h.clear();
        }
        panelFeatureStateG.o = true;
        panelFeatureStateG.n = true;
        if ((i2 == 108 || i2 == 0) && this.g0 != null) {
            PanelFeatureState panelFeatureStateG2 = G(0);
            panelFeatureStateG2.k = false;
            N(panelFeatureStateG2, null);
        }
    }

    public final void D() {
        ViewGroup viewGroup;
        if (this.p0) {
            return;
        }
        Context context = this.Z;
        int[] iArr = wac.j;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            r6.g("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            return;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            n(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            n(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            n(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            n(10);
        }
        this.y0 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        E();
        this.a0.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.z0) {
            viewGroup = this.x0 ? (ViewGroup) layoutInflaterFrom.inflate(com.indeed.android.jobsearch.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.indeed.android.jobsearch.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.y0) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.indeed.android.jobsearch.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.w0 = false;
            this.v0 = false;
        } else if (this.v0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.indeed.android.jobsearch.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new fu2(context, typedValue.resourceId) : context).inflate(com.indeed.android.jobsearch.R.layout.abc_screen_toolbar, (ViewGroup) null);
            fk3 fk3Var = (fk3) viewGroup.findViewById(com.indeed.android.jobsearch.R.id.decor_content_parent);
            this.g0 = fk3Var;
            fk3Var.setWindowCallback(this.a0.getCallback());
            if (this.w0) {
                this.g0.h(109);
            }
            if (this.t0) {
                this.g0.h(2);
            }
            if (this.u0) {
                this.g0.h(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder sb = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
            sb.append(this.v0);
            sb.append(", windowActionBarOverlay: ");
            sb.append(this.w0);
            sb.append(", android:windowIsFloating: ");
            sb.append(this.y0);
            sb.append(", windowActionModeOverlay: ");
            sb.append(this.x0);
            sb.append(", windowNoTitle: ");
            l5.q(z3.o(sb, this.z0, " }"));
            return;
        }
        hj0 hj0Var = new hj0(this);
        WeakHashMap<View, prg> weakHashMap = epg.a;
        epg.d.m(viewGroup, hj0Var);
        if (this.g0 == null) {
            this.r0 = (TextView) viewGroup.findViewById(com.indeed.android.jobsearch.R.id.title);
        }
        boolean z = isg.a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e3) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e3);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.indeed.android.jobsearch.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.a0.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.a0.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new ij0(this));
        this.q0 = viewGroup;
        Object obj = this.Y;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f0;
        if (!TextUtils.isEmpty(title)) {
            fk3 fk3Var2 = this.g0;
            if (fk3Var2 != null) {
                fk3Var2.setWindowTitle(title);
            } else {
                androidx.appcompat.app.a aVar = this.d0;
                if (aVar != null) {
                    aVar.u(title);
                } else {
                    TextView textView = this.r0;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.q0.findViewById(R.id.content);
        View decorView = this.a0.getDecorView();
        contentFrameLayout2.V.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.p0 = true;
        PanelFeatureState panelFeatureStateG = G(0);
        if (this.G0 || panelFeatureStateG.h != null) {
            return;
        }
        I(108);
    }

    public final void E() {
        if (this.a0 == null) {
            Object obj = this.Y;
            if (obj instanceof Activity) {
                v(((Activity) obj).getWindow());
            }
        }
        if (this.a0 != null) {
            return;
        }
        r6.g("We have not been given a Window");
    }

    public final j F(Context context) {
        if (this.M0 == null) {
            if (fvf.d == null) {
                Context applicationContext = context.getApplicationContext();
                fvf.d = new fvf(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.M0 = new k(fvf.d);
        }
        return this.M0;
    }

    public final PanelFeatureState G(int i2) {
        PanelFeatureState[] panelFeatureStateArr = this.B0;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i2) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[i2 + 1];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.B0 = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i2];
        if (panelFeatureState != null) {
            return panelFeatureState;
        }
        PanelFeatureState panelFeatureState2 = new PanelFeatureState();
        panelFeatureState2.a = i2;
        panelFeatureState2.n = false;
        panelFeatureStateArr[i2] = panelFeatureState2;
        return panelFeatureState2;
    }

    public final void H() {
        D();
        if (this.v0 && this.d0 == null) {
            Object obj = this.Y;
            if (obj instanceof Activity) {
                this.d0 = new androidx.appcompat.app.f((Activity) obj, this.w0);
            } else if (obj instanceof Dialog) {
                this.d0 = new androidx.appcompat.app.f((Dialog) obj);
            }
            androidx.appcompat.app.a aVar = this.d0;
            if (aVar != null) {
                aVar.m(this.R0);
            }
        }
    }

    public final void I(int i2) {
        this.P0 = (1 << i2) | this.P0;
        if (this.O0) {
            return;
        }
        View decorView = this.a0.getDecorView();
        WeakHashMap<View, prg> weakHashMap = epg.a;
        decorView.postOnAnimation(this.Q0);
        this.O0 = true;
    }

    public final int J(Context context, int i2) {
        if (i2 != -100) {
            if (i2 != -1) {
                if (i2 != 0) {
                    if (i2 != 1 && i2 != 2) {
                        if (i2 != 3) {
                            r6.g("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                            return 0;
                        }
                        if (this.N0 == null) {
                            this.N0 = new i(context);
                        }
                        return this.N0.c();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return F(context).c();
                }
            }
            return i2;
        }
        return -1;
    }

    public final boolean K() {
        boolean z = this.D0;
        this.D0 = false;
        PanelFeatureState panelFeatureStateG = G(0);
        if (!panelFeatureStateG.m) {
            i7 i7Var = this.j0;
            if (i7Var != null) {
                i7Var.T();
                return true;
            }
            H();
            androidx.appcompat.app.a aVar = this.d0;
            if (aVar == null || !aVar.b()) {
                return false;
            }
        } else if (!z) {
            z(panelFeatureStateG, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0175, code lost:
    
        if (r2.f.getCount() > 0) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void L(androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instruction units count: 473
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.L(androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState, android.view.KeyEvent):void");
    }

    public final boolean M(PanelFeatureState panelFeatureState, int i2, KeyEvent keyEvent) {
        androidx.appcompat.view.menu.f fVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.k || N(panelFeatureState, keyEvent)) && (fVar = panelFeatureState.h) != null) {
            return fVar.performShortcut(i2, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean N(androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.N(androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState, android.view.KeyEvent):boolean");
    }

    public final void O() {
        if (this.p0) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void P() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.V0 != null && (G(0).m || this.j0 != null)) {
                z = true;
            }
            if (z && this.W0 == null) {
                this.W0 = g.b(this.V0, this);
            } else {
                if (z || (onBackInvokedCallback = this.W0) == null) {
                    return;
                }
                g.c(this.V0, onBackInvokedCallback);
                this.W0 = null;
            }
        }
    }

    @Override // androidx.appcompat.app.d
    public final void a(View view, ViewGroup.LayoutParams layoutParams) {
        D();
        ((ViewGroup) this.q0.findViewById(R.id.content)).addView(view, layoutParams);
        this.b0.a(this.a0.getCallback());
    }

    @Override // androidx.appcompat.app.d
    public final boolean b() {
        return u(true, true);
    }

    @Override // androidx.appcompat.app.d
    public final <T extends View> T c(int i2) {
        D();
        return (T) this.a0.findViewById(i2);
    }

    @Override // androidx.appcompat.app.d
    public final Context d() {
        return this.Z;
    }

    @Override // androidx.appcompat.app.d
    public final int e() {
        return this.I0;
    }

    @Override // androidx.appcompat.app.d
    public final void f() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.Z);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof AppCompatDelegateImpl) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // androidx.appcompat.app.d
    public final void g() {
        if (this.d0 != null) {
            H();
            if (this.d0.f()) {
                return;
            }
            I(0);
        }
    }

    @Override // androidx.appcompat.app.d
    public final void i() {
        String strC;
        this.E0 = true;
        u(false, true);
        E();
        Object obj = this.Y;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strC = kca.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e2) {
                    throw new IllegalArgumentException(e2);
                }
            } catch (IllegalArgumentException unused) {
                strC = null;
            }
            if (strC != null) {
                androidx.appcompat.app.a aVar = this.d0;
                if (aVar == null) {
                    this.R0 = true;
                } else {
                    aVar.m(true);
                }
            }
            synchronized (androidx.appcompat.app.d.W) {
                androidx.appcompat.app.d.m(this);
                androidx.appcompat.app.d.V.add(new WeakReference<>(this));
            }
        }
        this.H0 = new Configuration(this.Z.getResources().getConfiguration());
        this.F0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // androidx.appcompat.app.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.Y
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = androidx.appcompat.app.d.W
            monitor-enter(r0)
            androidx.appcompat.app.d.m(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r3
        L11:
            boolean r0 = r3.O0
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.a0
            android.view.View r0 = r0.getDecorView()
            androidx.appcompat.app.AppCompatDelegateImpl$a r1 = r3.Q0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.G0 = r0
            int r0 = r3.I0
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.Y
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            jfe<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.AppCompatDelegateImpl.X0
            java.lang.Object r1 = r3.Y
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.I0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            jfe<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.AppCompatDelegateImpl.X0
            java.lang.Object r1 = r3.Y
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            androidx.appcompat.app.a r0 = r3.d0
            if (r0 == 0) goto L63
            r0.h()
        L63:
            androidx.appcompat.app.AppCompatDelegateImpl$k r0 = r3.M0
            if (r0 == 0) goto L6a
            r0.a()
        L6a:
            androidx.appcompat.app.AppCompatDelegateImpl$i r3 = r3.N0
            if (r3 == 0) goto L71
            r3.a()
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.j():void");
    }

    @Override // androidx.appcompat.app.d
    public final void k() {
        H();
        androidx.appcompat.app.a aVar = this.d0;
        if (aVar != null) {
            aVar.s(false);
        }
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final boolean l(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
        PanelFeatureState panelFeatureState;
        Window.Callback callback = this.a0.getCallback();
        if (callback != null && !this.G0) {
            androidx.appcompat.view.menu.f fVarK = fVar.k();
            PanelFeatureState[] panelFeatureStateArr = this.B0;
            int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    panelFeatureState = panelFeatureStateArr[i2];
                    if (panelFeatureState != null && panelFeatureState.h == fVarK) {
                        break;
                    }
                    i2++;
                } else {
                    panelFeatureState = null;
                    break;
                }
            }
            if (panelFeatureState != null) {
                return callback.onMenuItemSelected(panelFeatureState.a, menuItem);
            }
        }
        return false;
    }

    @Override // androidx.appcompat.app.d
    public final boolean n(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i2 = 108;
        } else if (i2 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i2 = 109;
        }
        if (this.z0 && i2 == 108) {
            return false;
        }
        if (this.v0 && i2 == 1) {
            this.v0 = false;
        }
        if (i2 == 1) {
            O();
            this.z0 = true;
            return true;
        }
        if (i2 == 2) {
            O();
            this.t0 = true;
            return true;
        }
        if (i2 == 5) {
            O();
            this.u0 = true;
            return true;
        }
        if (i2 == 10) {
            O();
            this.x0 = true;
            return true;
        }
        if (i2 == 108) {
            O();
            this.v0 = true;
            return true;
        }
        if (i2 != 109) {
            return this.a0.requestFeature(i2);
        }
        O();
        this.w0 = true;
        return true;
    }

    @Override // androidx.appcompat.app.d
    public final void o(int i2) {
        D();
        ViewGroup viewGroup = (ViewGroup) this.q0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.Z).inflate(i2, viewGroup);
        this.b0.a(this.a0.getCallback());
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        ek0 ek0Var;
        Context fu2Var;
        View xj0Var;
        View view2 = null;
        if (this.U0 == null) {
            int[] iArr = wac.j;
            Context context2 = this.Z;
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = typedArrayObtainStyledAttributes.getString(116);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.U0 = new ek0();
            } else {
                try {
                    this.U0 = (ek0) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.U0 = new ek0();
                }
            }
        }
        ek0Var = this.U0;
        int i2 = emg.a;
        ek0Var.getClass();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, wac.z, 0, 0);
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes2.recycle();
        fu2Var = (resourceId == 0 || ((context instanceof fu2) && ((fu2) context).a == resourceId)) ? context : new fu2(context, resourceId);
        str.getClass();
        switch (str) {
            case "RatingBar":
                xj0Var = new xj0(fu2Var, attributeSet);
                break;
            case "CheckedTextView":
                xj0Var = new dj0(fu2Var, attributeSet);
                break;
            case "MultiAutoCompleteTextView":
                xj0Var = new tj0(fu2Var, attributeSet);
                break;
            case "TextView":
                xj0Var = ek0Var.e(fu2Var, attributeSet);
                break;
            case "ImageButton":
                xj0Var = new AppCompatImageButton(fu2Var, attributeSet);
                break;
            case "SeekBar":
                xj0Var = new zj0(fu2Var, attributeSet);
                break;
            case "Spinner":
                xj0Var = new AppCompatSpinner(fu2Var, attributeSet, com.indeed.android.jobsearch.R.attr.spinnerStyle);
                break;
            case "RadioButton":
                xj0Var = ek0Var.d(fu2Var, attributeSet);
                break;
            case "ToggleButton":
                xj0Var = new dk0(fu2Var, attributeSet);
                break;
            case "ImageView":
                xj0Var = new AppCompatImageView(fu2Var, attributeSet);
                break;
            case "AutoCompleteTextView":
                xj0Var = ek0Var.a(fu2Var, attributeSet);
                break;
            case "CheckBox":
                xj0Var = ek0Var.c(fu2Var, attributeSet);
                break;
            case "EditText":
                xj0Var = new qj0(fu2Var, attributeSet);
                break;
            case "Button":
                xj0Var = ek0Var.b(fu2Var, attributeSet);
                break;
            default:
                xj0Var = null;
                break;
        }
        if (xj0Var == null && context != fu2Var) {
            Object[] objArr = ek0Var.a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = fu2Var;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i3 = 0;
                    while (true) {
                        String[] strArr = ek0.g;
                        if (i3 < 3) {
                            View viewF = ek0Var.f(fu2Var, str, strArr[i3]);
                            if (viewF != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = viewF;
                            } else {
                                i3++;
                            }
                        }
                    }
                } else {
                    View viewF2 = ek0Var.f(fu2Var, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = viewF2;
                }
            } catch (Exception unused) {
            } finally {
                objArr[0] = null;
                objArr[1] = null;
            }
            xj0Var = view2;
        }
        if (xj0Var != null) {
            Context context3 = xj0Var.getContext();
            if ((context3 instanceof ContextWrapper) && xj0Var.hasOnClickListeners()) {
                TypedArray typedArrayObtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, ek0.c);
                String string2 = typedArrayObtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    xj0Var.setOnClickListener(new ek0.a(xj0Var, string2));
                }
                typedArrayObtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray typedArrayObtainStyledAttributes4 = fu2Var.obtainStyledAttributes(attributeSet, ek0.d);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    boolean z = typedArrayObtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap<View, prg> weakHashMap = epg.a;
                    new dpg(com.indeed.android.jobsearch.R.id.tag_accessibility_heading, Boolean.class, 0, 28).c(xj0Var, Boolean.valueOf(z));
                }
                typedArrayObtainStyledAttributes4.recycle();
                TypedArray typedArrayObtainStyledAttributes5 = fu2Var.obtainStyledAttributes(attributeSet, ek0.e);
                if (typedArrayObtainStyledAttributes5.hasValue(0)) {
                    epg.p(xj0Var, typedArrayObtainStyledAttributes5.getString(0));
                }
                typedArrayObtainStyledAttributes5.recycle();
                TypedArray typedArrayObtainStyledAttributes6 = fu2Var.obtainStyledAttributes(attributeSet, ek0.f);
                if (typedArrayObtainStyledAttributes6.hasValue(0)) {
                    boolean z2 = typedArrayObtainStyledAttributes6.getBoolean(0, false);
                    WeakHashMap<View, prg> weakHashMap2 = epg.a;
                    new apg(com.indeed.android.jobsearch.R.id.tag_screen_reader_focusable, Boolean.class, 0, 28).c(xj0Var, Boolean.valueOf(z2));
                }
                typedArrayObtainStyledAttributes6.recycle();
            }
        }
        return xj0Var;
    }

    @Override // androidx.appcompat.app.d
    public final void p(View view) {
        D();
        ViewGroup viewGroup = (ViewGroup) this.q0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.b0.a(this.a0.getCallback());
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final void q(androidx.appcompat.view.menu.f fVar) {
        fk3 fk3Var = this.g0;
        if (fk3Var == null || !fk3Var.a() || (ViewConfiguration.get(this.Z).hasPermanentMenuKey() && !this.g0.g())) {
            PanelFeatureState panelFeatureStateG = G(0);
            panelFeatureStateG.n = true;
            z(panelFeatureStateG, false);
            L(panelFeatureStateG, null);
            return;
        }
        Window.Callback callback = this.a0.getCallback();
        if (this.g0.e()) {
            this.g0.b();
            if (this.G0) {
                return;
            }
            callback.onPanelClosed(108, G(0).h);
            return;
        }
        if (callback == null || this.G0) {
            return;
        }
        if (this.O0 && (1 & this.P0) != 0) {
            View decorView = this.a0.getDecorView();
            a aVar = this.Q0;
            decorView.removeCallbacks(aVar);
            aVar.run();
        }
        PanelFeatureState panelFeatureStateG2 = G(0);
        androidx.appcompat.view.menu.f fVar2 = panelFeatureStateG2.h;
        if (fVar2 == null || panelFeatureStateG2.o || !callback.onPreparePanel(0, panelFeatureStateG2.g, fVar2)) {
            return;
        }
        callback.onMenuOpened(108, panelFeatureStateG2.h);
        this.g0.c();
    }

    @Override // androidx.appcompat.app.d
    public final void r(View view, ViewGroup.LayoutParams layoutParams) {
        D();
        ViewGroup viewGroup = (ViewGroup) this.q0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.b0.a(this.a0.getCallback());
    }

    @Override // androidx.appcompat.app.d
    public final void t(CharSequence charSequence) {
        this.f0 = charSequence;
        fk3 fk3Var = this.g0;
        if (fk3Var != null) {
            fk3Var.setWindowTitle(charSequence);
            return;
        }
        androidx.appcompat.app.a aVar = this.d0;
        if (aVar != null) {
            aVar.u(charSequence);
            return;
        }
        TextView textView = this.r0;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean u(boolean r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.u(boolean, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(android.view.Window r8) {
        /*
            r7 = this;
            java.lang.String r0 = "AppCompat has already installed itself into the Window"
            android.view.Window r1 = r7.a0
            if (r1 != 0) goto L7e
            android.view.Window$Callback r1 = r8.getCallback()
            boolean r2 = r1 instanceof androidx.appcompat.app.AppCompatDelegateImpl.h
            if (r2 != 0) goto L7a
            androidx.appcompat.app.AppCompatDelegateImpl$h r0 = new androidx.appcompat.app.AppCompatDelegateImpl$h
            r0.<init>(r1)
            r7.b0 = r0
            r8.setCallback(r0)
            android.content.Context r0 = r7.Z
            int[] r1 = androidx.appcompat.app.AppCompatDelegateImpl.Y0
            r2 = 0
            android.content.res.TypedArray r1 = r0.obtainStyledAttributes(r2, r1)
            r3 = 0
            boolean r4 = r1.hasValue(r3)
            if (r4 == 0) goto L3f
            int r3 = r1.getResourceId(r3, r3)
            if (r3 == 0) goto L3f
            pj0 r4 = defpackage.pj0.a()
            monitor-enter(r4)
            w5d r5 = r4.a     // Catch: java.lang.Throwable -> L3c
            r6 = 1
            android.graphics.drawable.Drawable r0 = r5.d(r0, r3, r6)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r4)
            goto L40
        L3c:
            r7 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3c
            throw r7
        L3f:
            r0 = r2
        L40:
            if (r0 == 0) goto L45
            r8.setBackgroundDrawable(r0)
        L45:
            r1.recycle()
            r7.a0 = r8
            int r8 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r8 < r0) goto L79
            android.window.OnBackInvokedDispatcher r8 = r7.V0
            if (r8 != 0) goto L79
            java.lang.Object r0 = r7.Y
            if (r8 == 0) goto L61
            android.window.OnBackInvokedCallback r1 = r7.W0
            if (r1 == 0) goto L61
            androidx.appcompat.app.AppCompatDelegateImpl.g.c(r8, r1)
            r7.W0 = r2
        L61:
            boolean r8 = r0 instanceof android.app.Activity
            if (r8 == 0) goto L74
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r8 = r0.getWindow()
            if (r8 == 0) goto L74
            android.window.OnBackInvokedDispatcher r8 = androidx.appcompat.app.AppCompatDelegateImpl.g.a(r0)
            r7.V0 = r8
            goto L76
        L74:
            r7.V0 = r2
        L76:
            r7.P()
        L79:
            return
        L7a:
            defpackage.r6.g(r0)
            return
        L7e:
            defpackage.r6.g(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.v(android.view.Window):void");
    }

    public final void x(int i2, PanelFeatureState panelFeatureState, androidx.appcompat.view.menu.f fVar) {
        if (fVar == null) {
            if (panelFeatureState == null && i2 >= 0) {
                PanelFeatureState[] panelFeatureStateArr = this.B0;
                if (i2 < panelFeatureStateArr.length) {
                    panelFeatureState = panelFeatureStateArr[i2];
                }
            }
            if (panelFeatureState != null) {
                fVar = panelFeatureState.h;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.m) && !this.G0) {
            h hVar = this.b0;
            Window.Callback callback = this.a0.getCallback();
            hVar.getClass();
            try {
                hVar.e = true;
                callback.onPanelClosed(i2, fVar);
            } finally {
                hVar.e = false;
            }
        }
    }

    public final void y(androidx.appcompat.view.menu.f fVar) {
        if (this.A0) {
            return;
        }
        this.A0 = true;
        this.g0.l();
        Window.Callback callback = this.a0.getCallback();
        if (callback != null && !this.G0) {
            callback.onPanelClosed(108, fVar);
        }
        this.A0 = false;
    }

    public final void z(PanelFeatureState panelFeatureState, boolean z) {
        l lVar;
        fk3 fk3Var;
        if (z && panelFeatureState.a == 0 && (fk3Var = this.g0) != null && fk3Var.e()) {
            y(panelFeatureState.h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.Z.getSystemService("window");
        if (windowManager != null && panelFeatureState.m && (lVar = panelFeatureState.e) != null) {
            windowManager.removeView(lVar);
            if (z) {
                x(panelFeatureState.a, panelFeatureState, null);
            }
        }
        panelFeatureState.k = false;
        panelFeatureState.l = false;
        panelFeatureState.m = false;
        panelFeatureState.f = null;
        panelFeatureState.n = true;
        if (this.C0 == panelFeatureState) {
            this.C0 = null;
        }
        if (panelFeatureState.a == 0) {
            P();
        }
    }

    public static final class PanelFeatureState {
        public int a;
        public int b;
        public int c;
        public int d;
        public l e;
        public View f;
        public View g;
        public androidx.appcompat.view.menu.f h;
        public androidx.appcompat.view.menu.d i;
        public fu2 j;
        public boolean k;
        public boolean l;
        public boolean m;
        public boolean n;
        public boolean o;
        public Bundle p;

        @SuppressLint({"BanParcelableUsage"})
        public static class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = new a();
            public int a;
            public boolean b;
            public Bundle c;

            public static SavedState a(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.a = parcel.readInt();
                boolean z = parcel.readInt() == 1;
                savedState.b = z;
                if (z) {
                    savedState.c = parcel.readBundle(classLoader);
                }
                return savedState;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.a);
                parcel.writeInt(this.b ? 1 : 0);
                if (this.b) {
                    parcel.writeBundle(this.c);
                }
            }

            public class a implements Parcelable.ClassLoaderCreator<SavedState> {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    return SavedState.a(parcel, null);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new SavedState[i];
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.a(parcel, classLoader);
                }
            }
        }
    }

    public class h extends hzg {
        public b b;
        public boolean c;
        public boolean d;
        public boolean e;

        public h(Window.Callback callback) {
            super(callback);
        }

        public final void a(Window.Callback callback) {
            try {
                this.c = true;
                callback.onContentChanged();
            } finally {
                this.c = false;
            }
        }

        @Override // android.view.Window.Callback
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            boolean z = this.d;
            Window.Callback callback = this.a;
            return z ? callback.dispatchKeyEvent(keyEvent) : AppCompatDelegateImpl.this.B(keyEvent) || callback.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.Window.Callback
        public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            if (!this.a.dispatchKeyShortcutEvent(keyEvent)) {
                int keyCode = keyEvent.getKeyCode();
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                appCompatDelegateImpl.H();
                androidx.appcompat.app.a aVar = appCompatDelegateImpl.d0;
                if (aVar == null || !aVar.i(keyCode, keyEvent)) {
                    PanelFeatureState panelFeatureState = appCompatDelegateImpl.C0;
                    if (panelFeatureState == null || !appCompatDelegateImpl.M(panelFeatureState, keyEvent.getKeyCode(), keyEvent)) {
                        if (appCompatDelegateImpl.C0 == null) {
                            PanelFeatureState panelFeatureStateG = appCompatDelegateImpl.G(0);
                            appCompatDelegateImpl.N(panelFeatureStateG, keyEvent);
                            boolean zM = appCompatDelegateImpl.M(panelFeatureStateG, keyEvent.getKeyCode(), keyEvent);
                            panelFeatureStateG.k = false;
                            if (zM) {
                            }
                        }
                        return false;
                    }
                    PanelFeatureState panelFeatureState2 = appCompatDelegateImpl.C0;
                    if (panelFeatureState2 != null) {
                        panelFeatureState2.l = true;
                        return true;
                    }
                }
            }
            return true;
        }

        @Override // android.view.Window.Callback
        public final void onContentChanged() {
            if (this.c) {
                this.a.onContentChanged();
            }
        }

        @Override // android.view.Window.Callback
        public final boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof androidx.appcompat.view.menu.f)) {
                return this.a.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // android.view.Window.Callback
        public final View onCreatePanelView(int i) {
            b bVar = this.b;
            if (bVar != null) {
                View view = i == 0 ? new View(androidx.appcompat.app.e.this.a.a.getContext()) : null;
                if (view != null) {
                    return view;
                }
            }
            return this.a.onCreatePanelView(i);
        }

        @Override // defpackage.hzg, android.view.Window.Callback
        public final boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            if (i == 108) {
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                appCompatDelegateImpl.H();
                androidx.appcompat.app.a aVar = appCompatDelegateImpl.d0;
                if (aVar != null) {
                    aVar.c(true);
                }
            }
            return true;
        }

        @Override // defpackage.hzg, android.view.Window.Callback
        public final void onPanelClosed(int i, Menu menu) {
            if (this.e) {
                this.a.onPanelClosed(i, menu);
                return;
            }
            super.onPanelClosed(i, menu);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (i == 108) {
                appCompatDelegateImpl.H();
                androidx.appcompat.app.a aVar = appCompatDelegateImpl.d0;
                if (aVar != null) {
                    aVar.c(false);
                    return;
                }
                return;
            }
            if (i == 0) {
                PanelFeatureState panelFeatureStateG = appCompatDelegateImpl.G(i);
                if (panelFeatureStateG.m) {
                    appCompatDelegateImpl.z(panelFeatureStateG, false);
                }
            }
        }

        @Override // android.view.Window.Callback
        public final boolean onPreparePanel(int i, View view, Menu menu) {
            androidx.appcompat.view.menu.f fVar = menu instanceof androidx.appcompat.view.menu.f ? (androidx.appcompat.view.menu.f) menu : null;
            if (i == 0 && fVar == null) {
                return false;
            }
            if (fVar != null) {
                fVar.x = true;
            }
            b bVar = this.b;
            if (bVar != null) {
                e.C0008e c0008e = (e.C0008e) bVar;
                if (i == 0) {
                    androidx.appcompat.app.e eVar = androidx.appcompat.app.e.this;
                    if (!eVar.d) {
                        eVar.a.l = true;
                        eVar.d = true;
                    }
                }
            }
            boolean zOnPreparePanel = this.a.onPreparePanel(i, view, menu);
            if (fVar != null) {
                fVar.x = false;
            }
            return zOnPreparePanel;
        }

        @Override // defpackage.hzg, android.view.Window.Callback
        public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            androidx.appcompat.view.menu.f fVar = AppCompatDelegateImpl.this.G(0).h;
            if (fVar != null) {
                super.onProvideKeyboardShortcuts(list, fVar, i);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i);
            }
        }

        @Override // android.view.Window.Callback
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            ViewGroup viewGroup;
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            Context context = appCompatDelegateImpl.Z;
            if (!appCompatDelegateImpl.o0 || i != 0) {
                return hzg.a.b(this.a, callback, i);
            }
            lze.a aVar = new lze.a(context, callback);
            bj0 bj0Var = appCompatDelegateImpl.c0;
            i7 i7Var = appCompatDelegateImpl.j0;
            if (i7Var != null) {
                i7Var.T();
            }
            d dVar = appCompatDelegateImpl.new d(aVar);
            appCompatDelegateImpl.H();
            androidx.appcompat.app.a aVar2 = appCompatDelegateImpl.d0;
            if (aVar2 != null) {
                appCompatDelegateImpl.j0 = aVar2.v(dVar);
            }
            if (appCompatDelegateImpl.j0 == null) {
                prg prgVar = appCompatDelegateImpl.n0;
                if (prgVar != null) {
                    prgVar.b();
                }
                i7 i7Var2 = appCompatDelegateImpl.j0;
                if (i7Var2 != null) {
                    i7Var2.T();
                }
                if (bj0Var != null) {
                    boolean z = appCompatDelegateImpl.G0;
                }
                if (appCompatDelegateImpl.k0 == null) {
                    if (appCompatDelegateImpl.y0) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(com.indeed.android.jobsearch.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            Resources.Theme themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            fu2 fu2Var = new fu2(context, 0);
                            fu2Var.getTheme().setTo(themeNewTheme);
                            context = fu2Var;
                        }
                        appCompatDelegateImpl.k0 = new ActionBarContextView(context, null);
                        PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, com.indeed.android.jobsearch.R.attr.actionModePopupWindowStyle);
                        appCompatDelegateImpl.l0 = popupWindow;
                        popupWindow.setWindowLayoutType(2);
                        appCompatDelegateImpl.l0.setContentView(appCompatDelegateImpl.k0);
                        appCompatDelegateImpl.l0.setWidth(-1);
                        context.getTheme().resolveAttribute(com.indeed.android.jobsearch.R.attr.actionBarSize, typedValue, true);
                        appCompatDelegateImpl.k0.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                        appCompatDelegateImpl.l0.setHeight(-2);
                        appCompatDelegateImpl.m0 = new jj0(appCompatDelegateImpl);
                    } else {
                        ViewStubCompat viewStubCompat = (ViewStubCompat) appCompatDelegateImpl.q0.findViewById(com.indeed.android.jobsearch.R.id.action_mode_bar_stub);
                        if (viewStubCompat != null) {
                            appCompatDelegateImpl.H();
                            androidx.appcompat.app.a aVar3 = appCompatDelegateImpl.d0;
                            Context contextE = aVar3 != null ? aVar3.e() : null;
                            if (contextE != null) {
                                context = contextE;
                            }
                            viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                            appCompatDelegateImpl.k0 = (ActionBarContextView) viewStubCompat.a();
                        }
                    }
                }
                if (appCompatDelegateImpl.k0 != null) {
                    prg prgVar2 = appCompatDelegateImpl.n0;
                    if (prgVar2 != null) {
                        prgVar2.b();
                    }
                    appCompatDelegateImpl.k0.h();
                    Context context2 = appCompatDelegateImpl.k0.getContext();
                    ActionBarContextView actionBarContextView = appCompatDelegateImpl.k0;
                    tqe tqeVar = new tqe(0);
                    tqeVar.d = context2;
                    tqeVar.e = actionBarContextView;
                    tqeVar.f = dVar;
                    androidx.appcompat.view.menu.f fVar = new androidx.appcompat.view.menu.f(actionBarContextView.getContext());
                    fVar.l = 1;
                    tqeVar.X = fVar;
                    fVar.e = tqeVar;
                    if (dVar.a.c(tqeVar, fVar)) {
                        tqeVar.b0();
                        appCompatDelegateImpl.k0.f(tqeVar);
                        appCompatDelegateImpl.j0 = tqeVar;
                        boolean z2 = appCompatDelegateImpl.p0 && (viewGroup = appCompatDelegateImpl.q0) != null && viewGroup.isLaidOut();
                        ActionBarContextView actionBarContextView2 = appCompatDelegateImpl.k0;
                        if (z2) {
                            actionBarContextView2.setAlpha(0.0f);
                            prg prgVarA = epg.a(appCompatDelegateImpl.k0);
                            prgVarA.a(1.0f);
                            appCompatDelegateImpl.n0 = prgVarA;
                            prgVarA.d(new kj0(appCompatDelegateImpl));
                        } else {
                            actionBarContextView2.setAlpha(1.0f);
                            appCompatDelegateImpl.k0.setVisibility(0);
                            if (appCompatDelegateImpl.k0.getParent() instanceof View) {
                                View view = (View) appCompatDelegateImpl.k0.getParent();
                                WeakHashMap<View, prg> weakHashMap = epg.a;
                                epg.c.c(view);
                            }
                        }
                        if (appCompatDelegateImpl.l0 != null) {
                            appCompatDelegateImpl.a0.getDecorView().post(appCompatDelegateImpl.m0);
                        }
                    } else {
                        appCompatDelegateImpl.j0 = null;
                    }
                }
                appCompatDelegateImpl.P();
                appCompatDelegateImpl.j0 = appCompatDelegateImpl.j0;
            }
            appCompatDelegateImpl.P();
            i7 i7Var3 = appCompatDelegateImpl.j0;
            if (i7Var3 != null) {
                return aVar.a(i7Var3);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
