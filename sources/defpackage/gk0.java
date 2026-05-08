package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.react.bridge.ReactApplicationContext;
import defpackage.v03;
import expo.modules.adapters.react.NativeModulesProxy;
import expo.modules.core.errors.ModuleNotFoundException;
import expo.modules.kotlin.exception.CodedException;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class gk0 {
    public final ey9 a;
    public final ohd b;
    public final kmc c;
    public boolean d;
    public final eu2 e;
    public final eu2 f;
    public final eu2 g;
    public WeakReference<NativeModulesProxy> h;
    public final o9 i;
    public final gl3 j;
    public final d2f k;
    public final d2f l;

    public gk0(hy9 hy9Var, ey9 ey9Var, WeakReference<ReactApplicationContext> weakReference) {
        ey9Var.getClass();
        this.a = ey9Var;
        ohd ohdVar = new ohd(this, weakReference);
        this.b = ohdVar;
        kmc kmcVar = new kmc(this);
        this.c = kmcVar;
        HandlerThread handlerThread = new HandlerThread("expo.modules.AsyncFunctionQueue");
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        int i = rf6.a;
        int i2 = 0;
        pf6 pf6Var = new pf6(handler, null, false);
        eq3 eq3Var = a74.a;
        no3 no3Var = no3.c;
        eze ezeVarA = wea.a();
        no3Var.getClass();
        this.e = f13.a(v03.a.C0438a.c(no3Var, ezeVarA).d1(new c13("expo.modules.BackgroundCoroutineScope")));
        this.f = f13.a(v03.a.C0438a.c(pf6Var, wea.a()).d1(new c13("expo.modules.AsyncFunctionQueue")));
        k89 k89Var = m89.a;
        eze ezeVarA2 = wea.a();
        k89Var.getClass();
        this.g = f13.a(v03.a.C0438a.c(k89Var, ezeVarA2).d1(new c13("expo.modules.MainQueue")));
        o9 o9Var = new o9(this);
        this.i = o9Var;
        this.j = new gl3(o9Var);
        ReactApplicationContext reactApplicationContext = weakReference.get();
        if (reactApplicationContext == null) {
            l5.q("The app context should be created with valid react context.");
            throw null;
        }
        ReactApplicationContext reactApplicationContext2 = reactApplicationContext;
        reactApplicationContext2.addLifecycleEventListener(kmcVar);
        reactApplicationContext2.addActivityEventListener(kmcVar);
        y9a y9aVar = new y9a();
        dy9 dy9Var = ohdVar.c;
        dy9Var.i(y9aVar);
        dy9Var.i(new uo7());
        ey9Var.b(new fa5());
        ey9Var.b(new rk0(reactApplicationContext2));
        Iterator<T> it = hy9Var.getModulesList().iterator();
        while (it.hasNext()) {
            sx9 sx9Var = (sx9) ((Class) it.next()).getDeclaredConstructor(null).newInstance(null);
            sx9Var.getClass();
            dy9Var.i(sx9Var);
        }
        mz2.a.a(o39.Info, "✅ AppContext was initialized", null);
        this.k = new d2f(new a1(this, 2));
        this.l = new d2f(new fk0(this, i2));
    }

    public final File a() throws ModuleNotFoundException {
        Object obj;
        try {
            obj = this.a.a.get(tk0.class);
        } catch (Exception unused) {
            obj = null;
        }
        tk0 tk0Var = (tk0) obj;
        if (tk0Var != null) {
            return tk0Var.a();
        }
        throw new ModuleNotFoundException("expo.modules.interfaces.filesystem.AppDirectories");
    }

    public final Activity b() {
        Object obj;
        Activity activityB;
        try {
            obj = this.a.a.get(i8.class);
        } catch (Exception unused) {
            obj = null;
        }
        i8 i8Var = (i8) obj;
        if (i8Var != null && (activityB = i8Var.b()) != null) {
            return activityB;
        }
        ReactApplicationContext reactApplicationContextD = d();
        if (reactApplicationContextD == null) {
            reactApplicationContextD = null;
        }
        if (reactApplicationContextD != null) {
            return reactApplicationContextD.getCurrentActivity();
        }
        return null;
    }

    public final h8b c() {
        Object obj;
        try {
            obj = this.a.a.get(h8b.class);
        } catch (Exception unused) {
            obj = null;
        }
        return (h8b) obj;
    }

    public final ReactApplicationContext d() {
        return this.b.a.get();
    }

    public final Activity e() throws CodedException {
        Object obj;
        Activity activityB;
        Activity currentActivity = null;
        try {
            obj = this.a.a.get(i8.class);
        } catch (Exception unused) {
            obj = null;
        }
        i8 i8Var = (i8) obj;
        if (i8Var == null || (activityB = i8Var.b()) == null) {
            ReactApplicationContext reactApplicationContextD = d();
            if (reactApplicationContextD == null) {
                reactApplicationContextD = null;
            }
            if (reactApplicationContextD != null) {
                currentActivity = reactApplicationContextD.getCurrentActivity();
            }
        } else {
            currentActivity = activityB;
        }
        if (currentActivity != null) {
            return currentActivity;
        }
        throw new CodedException() { // from class: expo.modules.kotlin.exception.Exceptions$MissingActivity
        };
    }
}
