package defpackage;

import android.view.View;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.uimanager.RootViewManager;
import defpackage.p0f;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class a0a {
    public final vqg a;
    public final FabricUIManager.a b;
    public final ConcurrentHashMap<Integer, p0f> c;
    public final CopyOnWriteArrayList<Integer> d;
    public p0f e;
    public p0f f;
    public final zo7 g;
    public final RootViewManager h;

    public interface a {
    }

    public a0a(vqg vqgVar, FabricUIManager.a aVar) {
        vqgVar.getClass();
        this.a = vqgVar;
        this.b = aVar;
        this.c = new ConcurrentHashMap<>();
        this.d = new CopyOnWriteArrayList<>();
        this.g = new zo7();
        this.h = new RootViewManager();
    }

    public final p0f a(int i) {
        p0f p0fVar = this.f;
        if (p0fVar != null && p0fVar.n == i) {
            return p0fVar;
        }
        p0f p0fVar2 = this.e;
        if (p0fVar2 != null && p0fVar2.n == i) {
            return p0fVar2;
        }
        p0f p0fVar3 = this.c.get(Integer.valueOf(i));
        this.f = p0fVar3;
        return p0fVar3;
    }

    public final p0f b(int i, String str) {
        p0f p0fVarA = a(i);
        if (p0fVarA != null) {
            return p0fVarA;
        }
        throw new RetryableMountingLayerException(v40.c(i, "Unable to find SurfaceMountingManager for surfaceId: [", "]. Context: ", str));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x003a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.p0f c(int r7) {
        /*
            r6 = this;
            p0f r0 = r6.e
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L30
            loe<java.lang.Object> r3 = r0.m
            if (r3 == 0) goto L1d
            boolean r4 = r3.a
            if (r4 == 0) goto L11
            defpackage.u63.i(r3)
        L11:
            int[] r4 = r3.b
            int r3 = r3.d
            int r3 = defpackage.pyd.a(r3, r7, r4)
            if (r3 < 0) goto L1d
            r0 = r2
            goto L2b
        L1d:
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, p0f$b> r0 = r0.d
            if (r0 != 0) goto L23
            r0 = r1
            goto L2b
        L23:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            boolean r0 = r0.containsKey(r3)
        L2b:
            if (r0 != r2) goto L30
            p0f r6 = r6.e
            return r6
        L30:
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, p0f> r0 = r6.c
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L3a:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L7e
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r3 = r3.getValue()
            p0f r3 = (defpackage.p0f) r3
            p0f r4 = r6.e
            if (r3 == r4) goto L3a
            loe<java.lang.Object> r4 = r3.m
            if (r4 == 0) goto L67
            boolean r5 = r4.a
            if (r5 == 0) goto L5b
            defpackage.u63.i(r4)
        L5b:
            int[] r5 = r4.b
            int r4 = r4.d
            int r4 = defpackage.pyd.a(r4, r7, r5)
            if (r4 < 0) goto L67
            r4 = r2
            goto L75
        L67:
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, p0f$b> r4 = r3.d
            if (r4 != 0) goto L6d
            r4 = r1
            goto L75
        L6d:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            boolean r4 = r4.containsKey(r5)
        L75:
            if (r4 == 0) goto L3a
            p0f r7 = r6.e
            if (r7 != 0) goto L7d
            r6.e = r3
        L7d:
            return r3
        L7e:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a0a.c(int):p0f");
    }

    public final p0f d(int i) {
        p0f p0fVarC = c(i);
        if (p0fVarC != null) {
            return p0fVarC;
        }
        throw new RetryableMountingLayerException(bg.d(i, "Unable to find SurfaceMountingManager for tag: [", "]"));
    }

    public final void e(int i, mkf mkfVar, View view) {
        p0f p0fVar = new p0f(i, this.g, this.a, this.h, this.b, mkfVar);
        Integer numValueOf = Integer.valueOf(i);
        ConcurrentHashMap<Integer, p0f> concurrentHashMap = this.c;
        concurrentHashMap.putIfAbsent(numValueOf, p0fVar);
        if (concurrentHashMap.get(Integer.valueOf(i)) != p0fVar) {
            ReactSoftExceptionLogger.logSoftException("a0a", new IllegalStateException(bg.d(i, "Called startSurface more than once for the SurfaceId [", "]")));
        }
        this.e = concurrentHashMap.get(Integer.valueOf(i));
        if (view != null) {
            p0fVar.a(mkfVar, view);
        }
    }

    public final void f(int i) {
        p0f p0fVar = this.c.get(Integer.valueOf(i));
        if (p0fVar == null) {
            ReactSoftExceptionLogger.logSoftException("a0a", new IllegalStateException(bg.d(i, "Cannot call stopSurface on non-existent surface: [", "]")));
            return;
        }
        while (true) {
            int size = this.d.size();
            CopyOnWriteArrayList<Integer> copyOnWriteArrayList = this.d;
            if (size < 15) {
                copyOnWriteArrayList.add(Integer.valueOf(i));
                s55.f("p0f", "Stopping surface [" + p0fVar.n + "]");
                if (!p0fVar.a) {
                    p0fVar.a = true;
                    for (p0f.b bVar : p0fVar.d.values()) {
                        vse vseVar = bVar.f;
                        if (vseVar != null) {
                            vseVar.destroyState();
                            bVar.f = null;
                        }
                        EventEmitterWrapper eventEmitterWrapper = bVar.g;
                        if (eventEmitterWrapper != null) {
                            eventEmitterWrapper.destroy();
                            bVar.g = null;
                        }
                    }
                    bp4 bp4Var = new bp4(p0fVar, 2);
                    if (UiThreadUtil.isOnUiThread()) {
                        bp4Var.run();
                    } else {
                        UiThreadUtil.runOnUiThread(bp4Var);
                    }
                }
                if (this.e == p0fVar) {
                    this.e = null;
                }
                if (this.f == p0fVar) {
                    this.f = null;
                    return;
                }
                return;
            }
            Integer num = copyOnWriteArrayList.get(0);
            if (num == null) {
                r6.g("Required value was null.");
                return;
            } else {
                this.c.remove(num);
                this.d.remove(num);
                s55.a(num, "a0a", "Removing stale SurfaceMountingManager: [%d]");
            }
        }
    }
}
