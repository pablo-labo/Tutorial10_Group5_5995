package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.fabric.SurfaceHandlerBinding;
import com.facebook.react.runtime.ReactHostImpl;
import com.facebook.react.runtime.ReactInstance;
import defpackage.maf;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class qoc implements poc {
    public final SurfaceHandlerBinding a;
    public Context b;
    public final AtomicReference<roc> c;
    public final AtomicReference<ReactHostImpl> d;

    public static final class a {
    }

    public qoc(Context context, String str, Bundle bundle) {
        context.getClass();
        str.getClass();
        SurfaceHandlerBinding surfaceHandlerBinding = new SurfaceHandlerBinding(str);
        this.a = surfaceHandlerBinding;
        this.b = context;
        NativeMap nativeMap = null;
        this.c = new AtomicReference<>(null);
        this.d = new AtomicReference<>(null);
        if (bundle != null) {
            Object objFromBundle = Arguments.fromBundle(bundle);
            objFromBundle.getClass();
            nativeMap = (NativeMap) objFromBundle;
        }
        surfaceHandlerBinding.setProps(nativeMap);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        surfaceHandlerBinding.g(View.MeasureSpec.makeMeasureSpec(displayMetrics.widthPixels, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(displayMetrics.heightPixels, Integer.MIN_VALUE), 0, 0, context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean("RCTI18nUtil_makeRTLFlipLeftAndRightStyles", true), an6.a(context), displayMetrics.density, ie7.g0.enableFontScaleChangesUpdatingLayout() ? context.getResources().getConfiguration().fontScale : 1.0f);
    }

    public final void a(rkc rkcVar) {
        AtomicReference<ReactHostImpl> atomicReference;
        if (!(rkcVar instanceof ReactHostImpl)) {
            l5.q("ReactSurfaceImpl.attach can only attach to ReactHostImpl.");
            return;
        }
        do {
            atomicReference = this.d;
            if (atomicReference.compareAndSet(null, rkcVar)) {
                return;
            }
        } while (atomicReference.get() == null);
        r6.g("This surface is already attached to a host!");
    }

    @Override // defpackage.poc
    public final ViewGroup b() {
        return this.c.get();
    }

    public final void c(roc rocVar) {
        AtomicReference<roc> atomicReference;
        do {
            atomicReference = this.c;
            if (atomicReference.compareAndSet(null, rocVar)) {
                Context context = rocVar.getContext();
                context.getClass();
                this.b = context;
                return;
            }
        } while (atomicReference.get() == null);
        r6.g("Trying to call ReactSurface.attachView(), but the view is already attached.");
    }

    public final ReactHostImpl d() {
        return this.d.get();
    }

    public final synchronized void e(int i, int i2, int i3, int i4) {
        SurfaceHandlerBinding surfaceHandlerBinding = this.a;
        Context context = this.b;
        context.getClass();
        surfaceHandlerBinding.g(i, i2, i3, i4, context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean("RCTI18nUtil_makeRTLFlipLeftAndRightStyles", true), an6.a(this.b), this.b.getResources().getDisplayMetrics().density, ie7.g0.enableFontScaleChangesUpdatingLayout() ? this.b.getResources().getConfiguration().fontScale : 1.0f);
    }

    @Override // defpackage.poc
    public final maf start() {
        if (this.c.get() == null) {
            maf<Void> mafVar = maf.g;
            return maf.a.c(new IllegalStateException("Trying to call ReactSurface.start(), but view is not created."));
        }
        final ReactHostImpl reactHostImplD = d();
        if (reactHostImplD == null) {
            maf<Void> mafVar2 = maf.g;
            return maf.a.c(new IllegalStateException("Trying to call ReactSurface.start(), but no ReactHost is attached."));
        }
        final String str = "startSurface(surfaceId = " + this.a.d() + ")";
        reactHostImplD.t(str, "Schedule");
        reactHostImplD.s("attachSurface(surfaceId = " + this.a.d() + ")");
        synchronized (reactHostImplD.j) {
            reactHostImplD.j.add(this);
        }
        Executor executor = reactHostImplD.d;
        final ky4 ky4Var = new ky4(2, reactHostImplD, str, this);
        maf<Void> mafVar3 = maf.g;
        return maf.a(maf.a.b(executor, new lr6(reactHostImplD, 1)).g(new ku2() { // from class: plc
            @Override // defpackage.ku2
            public final Object a(maf mafVar4) {
                AtomicInteger atomicInteger = ReactHostImpl.A;
                mafVar4.getClass();
                ReactInstance reactInstance = (ReactInstance) mafVar4.d();
                if (reactInstance == null) {
                    reactHostImplD.u(l5.m("callAfterGetOrCreateReactInstance(", str, ")"), "Execute: reactInstance is null. Dropping work.", null);
                } else {
                    ky4Var.invoke(reactInstance);
                }
                return null;
            }
        }, executor), new ku2() { // from class: rlc
            @Override // defpackage.ku2
            public final Object a(maf mafVar4) {
                AtomicInteger atomicInteger = ReactHostImpl.A;
                mafVar4.getClass();
                if (mafVar4.f()) {
                    Exception excC = mafVar4.c();
                    if (excC != null) {
                        reactHostImplD.r(excC);
                    } else {
                        r6.g("Required value was null.");
                    }
                }
                return null;
            }
        });
    }

    @Override // defpackage.poc
    public final maf stop() {
        ReactHostImpl reactHostImplD = d();
        if (reactHostImplD == null) {
            maf<Void> mafVar = maf.g;
            return maf.a.c(new IllegalStateException("Trying to call ReactSurface.stop(), but no ReactHost is attached."));
        }
        String str = "stopSurface(surfaceId = " + this.a.d() + ")";
        reactHostImplD.t(str, "Schedule");
        reactHostImplD.s("detachSurface(surfaceId = " + this.a.d() + ")");
        synchronized (reactHostImplD.j) {
            reactHostImplD.j.remove(this);
        }
        return reactHostImplD.k.a().g(new alc(reactHostImplD, str, new ur(3, reactHostImplD, str, this)), reactHostImplD.d).b(new daf(), x15.b);
    }
}
