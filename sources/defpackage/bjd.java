package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes3.dex */
public final class bjd extends tpc implements ViewTreeObserver.OnPreDrawListener {
    public fjd a;
    public gf4 b;
    public djd c;
    public View d;
    public vse e;

    public final void g() {
        gf4 gf4Var = this.b;
        if (gf4Var != null) {
            djd djdVar = this.c;
            if (djdVar == null) {
                cjd cjdVar = cjd.b;
                djdVar = new djd(cjdVar, cjdVar, cjdVar, cjdVar);
            }
            vse stateWrapper = getStateWrapper();
            if (stateWrapper != null) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.getClass();
                writableMapCreateMap.putMap("insets", hh2.p(gf4Var));
                stateWrapper.updateState(writableMapCreateMap);
                return;
            }
            ejd ejdVar = new ejd(gf4Var, this.a, djdVar);
            ReactContext reactContextF = dmc.f(this);
            UIManagerModule uIManagerModule = (UIManagerModule) reactContextF.getNativeModule(UIManagerModule.class);
            if (uIManagerModule != null) {
                uIManagerModule.setViewLocalData(getId(), ejdVar);
                reactContextF.runOnNativeModulesQueueThread(new i50(uIManagerModule, 6));
                final huc hucVar = new huc();
                final ReentrantLock reentrantLock = new ReentrantLock();
                final Condition conditionNewCondition = reentrantLock.newCondition();
                long jNanoTime = System.nanoTime();
                dmc.f(this).runOnNativeModulesQueueThread(new Runnable() { // from class: ajd
                    @Override // java.lang.Runnable
                    public final void run() {
                        huc hucVar2 = hucVar;
                        Condition condition = conditionNewCondition;
                        ReentrantLock reentrantLock2 = reentrantLock;
                        reentrantLock2.lock();
                        try {
                            if (!hucVar2.element) {
                                hucVar2.element = true;
                                condition.signal();
                            }
                            j6g j6gVar = j6g.a;
                            reentrantLock2.unlock();
                        } catch (Throwable th) {
                            reentrantLock2.unlock();
                            throw th;
                        }
                    }
                });
                reentrantLock.lock();
                long jNanoTime2 = 0;
                while (!hucVar.element && jNanoTime2 < 500000000) {
                    try {
                        try {
                            conditionNewCondition.awaitNanos(500000000L);
                        } catch (InterruptedException unused) {
                            hucVar.element = true;
                        }
                        jNanoTime2 += System.nanoTime() - jNanoTime;
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                }
                j6g j6gVar = j6g.a;
                reentrantLock.unlock();
                if (jNanoTime2 >= 500000000) {
                    Log.w("SafeAreaView", "Timed out waiting for layout.");
                }
            }
        }
    }

    public final vse getStateWrapper() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tpc, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        View view;
        gf4 gf4VarB;
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        while (true) {
            if (parent == 0) {
                view = this;
                break;
            } else {
                if (parent instanceof xid) {
                    view = (View) parent;
                    break;
                }
                parent = parent.getParent();
            }
        }
        this.d = view;
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnPreDrawListener(this);
        }
        View view2 = this.d;
        if (view2 == null || (gf4VarB = zid.b(view2)) == null || wl7.b(this.b, gf4VarB)) {
            return;
        }
        this.b = gf4VarB;
        g();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver;
        super.onDetachedFromWindow();
        View view = this.d;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        this.d = null;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        gf4 gf4VarB;
        View view = this.d;
        boolean z = false;
        if (view != null && (gf4VarB = zid.b(view)) != null && !wl7.b(this.b, gf4VarB)) {
            this.b = gf4VarB;
            g();
            z = true;
        }
        if (z) {
            requestLayout();
        }
        return !z;
    }

    public final void setEdges(djd djdVar) {
        djdVar.getClass();
        this.c = djdVar;
        g();
    }

    public final void setMode(fjd fjdVar) {
        fjdVar.getClass();
        this.a = fjdVar;
        g();
    }

    public final void setStateWrapper(vse vseVar) {
        this.e = vseVar;
    }
}
