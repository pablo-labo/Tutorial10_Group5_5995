package defpackage;

import android.content.ComponentCallbacks;
import android.os.Trace;
import androidx.activity.result.ActivityResult;
import androidx.media3.session.r;
import androidx.media3.session.t;
import androidx.media3.session.z;
import app.rive.runtime.kotlin.core.FileAsset;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.MemoryPressureListener;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.defaults.DefaultReactHostDelegate;
import com.facebook.react.devsupport.InspectorFlags;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.react.runtime.ReactHostImpl;
import com.facebook.react.runtime.ReactHostInspectorTarget;
import com.facebook.react.runtime.ReactInstance;
import com.facebook.react.runtime.a;
import com.indeed.android.jobsearch.R;
import com.rivereactnative.j;
import defpackage.e47;
import defpackage.e75;
import defpackage.gdb;
import defpackage.hr3;
import defpackage.l6d;
import defpackage.lz8;
import defpackage.maf;
import defpackage.xh8;
import defpackage.xp1;
import java.io.File;
import java.lang.ref.WeakReference;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.Request;
import okhttp3.internal.connection.RealCall;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class r91 implements n8, hr3.h.a, e75.e, lz8.a, t.g, gna, a.InterfaceC0133a, v84, l6d.b {
    public final /* synthetic */ Object a;

    public /* synthetic */ r91(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.gna
    public Object b() {
        return ((c7g) this.a).a();
    }

    @Override // defpackage.n8
    public void c(Object obj) {
        ComponentCallbacks componentCallbacks = (y91) this.a;
        ActivityResult activityResult = (ActivityResult) obj;
        activityResult.getClass();
        int i = activityResult.a;
        if (i == -1) {
            ((ua6) (componentCallbacks instanceof ai8 ? ((ai8) componentCallbacks).d() : (qpd) xh8.a.a().a.b).a(null, fwc.a.b(ua6.class), null)).b(activityResult.b, new bt(componentCallbacks, 2), new zh(componentCallbacks, 4));
        } else {
            ArrayList arrayList = lz2.a;
            lz2.b("BaseIanWebViewFragment", p6.c(i, "Google SignIn - resultCode "), false, new Throwable(p6.c(i, "Google SignIn - resultCode ")));
        }
    }

    @Override // androidx.media3.session.t.g
    public void d(r.d dVar) {
        ((t) this.a).g.t.p();
    }

    @Override // l6d.b
    public void e(Object obj) {
        FileAsset fileAsset = (FileAsset) this.a;
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        j.l(fileAsset, bArr);
    }

    @Override // defpackage.v84
    public double f(double d) {
        hrf hrfVar = (hrf) this.a;
        float[] fArr = ya2.a;
        return ya2.a(hrfVar, d);
    }

    @Override // hr3.h.a
    public qyc g(int i, wpf wpfVar, int[] iArr) {
        hr3.d dVar = (hr3.d) this.a;
        e47.b bVar = e47.b;
        e47.a aVar = new e47.a();
        for (int i2 = 0; i2 < wpfVar.a; i2++) {
            aVar.c(new hr3.b(i, wpfVar, i2, dVar, iArr[i2]));
        }
        return aVar.f();
    }

    @Override // com.facebook.react.runtime.a.InterfaceC0133a
    public Object get() {
        maf mafVarC;
        final ReactHostImpl reactHostImpl = (ReactHostImpl) this.a;
        AtomicInteger atomicInteger = ReactHostImpl.A;
        reactHostImpl.t("getOrCreateReactInstanceTask()", "Start");
        Executor executor = reactHostImpl.d;
        ReactMarker.logMarker(ReactMarkerConstants.REACT_BRIDGELESS_LOADING_START, 1);
        reactHostImpl.s("getJSBundleLoader()");
        if (reactHostImpl.g && reactHostImpl.f) {
            reactHostImpl.s("isMetroRunning()");
            hzh hzhVar = new hzh();
            reactHostImpl.h.E(new kh9(reactHostImpl, hzhVar));
            maf mafVar = (maf) hzhVar.a;
            ku2 ku2Var = new ku2() { // from class: llc
                @Override // defpackage.ku2
                public final Object a(maf mafVar2) {
                    AtomicInteger atomicInteger2 = ReactHostImpl.A;
                    mafVar2.getClass();
                    Object objD = mafVar2.d();
                    if (objD == null) {
                        r6.g("Required value was null.");
                        return null;
                    }
                    boolean zBooleanValue = ((Boolean) objD).booleanValue();
                    ReactHostImpl reactHostImpl2 = reactHostImpl;
                    if (!zBooleanValue) {
                        maf<Void> mafVar3 = maf.g;
                        return maf.a.d(reactHostImpl2.b.getJsBundleLoader());
                    }
                    reactHostImpl2.s("loadJSBundleFromMetro()");
                    hzh hzhVar2 = new hzh();
                    w24 w24Var = reactHostImpl2.h;
                    w24Var.getClass();
                    i34 i34Var = (i34) w24Var;
                    m24 m24Var = i34Var.h;
                    String str = i34Var.c;
                    if (str == null) {
                        r6.g("Required value was null.");
                        return null;
                    }
                    m24Var.getClass();
                    String strA = m24.a(m24Var, str, m24Var.c.a(), 24);
                    ulc ulcVar = new ulc(reactHostImpl2, strA, i34Var, hzhVar2);
                    ReactMarker.logMarker(ReactMarkerConstants.DOWNLOAD_START);
                    try {
                        URL url = new URL(strA);
                        int port = url.getPort() != -1 ? url.getPort() : url.getDefaultPort();
                        tm3 tm3Var = i34Var.d;
                        if (tm3Var != null) {
                            String string = i34Var.a.getString(R.string.catalyst_loading_from_url, url.getHost() + ":" + port);
                            string.getClass();
                            tm3Var.d(string);
                        }
                        i34Var.t = true;
                    } catch (MalformedURLException e) {
                        s55.f("ReactNative", "Bundle url format is invalid. \n\n" + e);
                    }
                    xp1.a aVar = new xp1.a();
                    l34 l34Var = new l34(i34Var, aVar, ulcVar);
                    File file = i34Var.o;
                    Request.Builder builder = new Request.Builder();
                    file.getClass();
                    xp1 xp1Var = m24Var.e;
                    xp1Var.getClass();
                    builder.g(strA);
                    builder.a("Accept", "multipart/mixed");
                    RealCall realCall = new RealCall(xp1Var.a, builder.b(), false);
                    xp1Var.b = realCall;
                    realCall.R0(new yp1(xp1Var, l34Var, file, aVar));
                    return (maf) hzhVar2.a;
                }
            };
            mafVar.getClass();
            executor.getClass();
            mafVarC = mafVar.b(new gaf(ku2Var), executor);
        } else {
            try {
                maf<Void> mafVar2 = maf.g;
                mafVarC = maf.a.d(reactHostImpl.b.getJsBundleLoader());
            } catch (Exception e) {
                maf<Void> mafVar3 = maf.g;
                mafVarC = maf.a.c(e);
            }
        }
        maf mafVarG = mafVarC.g(new ku2() { // from class: jlc
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, nlc] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // defpackage.ku2
            public final Object a(maf mafVar4) {
                AtomicInteger atomicInteger2 = ReactHostImpl.A;
                mafVar4.getClass();
                Object objD = mafVar4.d();
                if (objD == null) {
                    r6.g("Required value was null.");
                    return null;
                }
                JSBundleLoader jSBundleLoader = (JSBundleLoader) objD;
                final ReactHostImpl reactHostImpl2 = reactHostImpl;
                a<zm1> aVar = reactHostImpl2.m;
                w24 w24Var = reactHostImpl2.h;
                zm1 zm1VarC = aVar.c(new i35(reactHostImpl2, 6));
                zm1VarC.setJSExceptionHandler(w24Var);
                reactHostImpl2.t("getOrCreateReactInstanceTask()", "Creating ReactInstance");
                DefaultReactHostDelegate defaultReactHostDelegate = reactHostImpl2.b;
                ComponentFactory componentFactory = reactHostImpl2.c;
                w24 w24Var2 = reactHostImpl2.h;
                g35 g35Var = new g35(reactHostImpl2);
                boolean z = reactHostImpl2.g;
                if (reactHostImpl2.w == null && InspectorFlags.getFuseboxEnabled()) {
                    reactHostImpl2.w = new ReactHostInspectorTarget(reactHostImpl2);
                }
                ReactInstance reactInstance = new ReactInstance(zm1VarC, defaultReactHostDelegate, componentFactory, w24Var2, g35Var, z, reactHostImpl2.w);
                reactHostImpl2.l = reactInstance;
                final WeakReference weakReference = new WeakReference(reactInstance);
                ?? r4 = new MemoryPressureListener() { // from class: nlc
                    @Override // com.facebook.react.bridge.MemoryPressureListener
                    public final void handleMemoryPressure(final int i) {
                        Executor executor2 = reactHostImpl2.d;
                        final WeakReference weakReference2 = weakReference;
                        executor2.execute(new Runnable() { // from class: olc
                            @Override // java.lang.Runnable
                            public final void run() {
                                AtomicInteger atomicInteger3 = ReactHostImpl.A;
                                ReactInstance reactInstance2 = (ReactInstance) weakReference2.get();
                                if (reactInstance2 != null) {
                                    reactInstance2.f(i);
                                }
                            }
                        });
                    }
                };
                reactHostImpl2.s = r4;
                CopyOnWriteArrayList<MemoryPressureListener> copyOnWriteArrayList = reactHostImpl2.i.a;
                if (!copyOnWriteArrayList.contains(r4)) {
                    copyOnWriteArrayList.add(r4);
                }
                reactInstance.e.getNativeModulesQueueThread().runOnQueue(new qb0(reactInstance, 7));
                reactHostImpl2.t("getOrCreateReactInstanceTask()", "Loading JS Bundle");
                Trace.beginSection(jpf.g("ReactInstance.loadJSBundle"));
                jSBundleLoader.loadScript(new b36(reactInstance));
                Trace.endSection();
                reactHostImpl2.t("getOrCreateReactInstanceTask()", "Calling DevSupportManagerBase.onNewReactContextCreated(reactContext)");
                w24Var.B(zm1VarC);
                zm1VarC.runOnJSQueueThread(new mlc());
                return new ReactHostImpl.a(reactInstance, zm1VarC, reactHostImpl2.y != null);
            }
        }, executor);
        mafVarG.g(new ReactHostImpl.b(new q2(reactHostImpl, 21)), reactHostImpl.e);
        klc klcVar = new klc();
        maf<Void> mafVar4 = maf.g;
        return mafVarG.g(klcVar, x15.b);
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        ((gdb.c) obj).m(((z) this.a).h);
    }

    @Override // defpackage.wg3
    public Object j(Object obj, ka6 ka6Var) {
        rjg rjgVar = (rjg) this.a;
        if (!(obj instanceof rjg)) {
            return new rjg(rjgVar);
        }
        rjg rjgVar2 = (rjg) obj;
        rjgVar2.f(rjgVar);
        return rjgVar2;
    }

    public /* synthetic */ r91(Object obj, Object obj2) {
        this.a = obj2;
    }
}
