package defpackage;

import android.os.SystemClock;
import android.os.Trace;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.fabric.b;
import com.facebook.react.fabric.mounting.mountitems.MountItem;
import defpackage.iy8;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes2.dex */
public final class zz9 {
    public final a0a a;
    public final FabricUIManager.g b;
    public final ConcurrentLinkedQueue c = new ConcurrentLinkedQueue();
    public final ConcurrentLinkedQueue d = new ConcurrentLinkedQueue();
    public final ConcurrentLinkedQueue e = new ConcurrentLinkedQueue();
    public boolean f;
    public long g;
    public long h;
    public long i;

    public static final class a {
        public static final iy8 a(ConcurrentLinkedQueue concurrentLinkedQueue) {
            if (concurrentLinkedQueue.isEmpty()) {
                return null;
            }
            iy8 iy8VarS = u63.s();
            do {
                Object objPoll = concurrentLinkedQueue.poll();
                if (objPoll != null) {
                    iy8VarS.add(objPoll);
                }
            } while (!concurrentLinkedQueue.isEmpty());
            iy8 iy8VarL = iy8VarS.l();
            if (iy8VarL.isEmpty()) {
                return null;
            }
            return iy8VarL;
        }

        public static final void b(MountItem mountItem, String str) {
            List listQ1;
            List listK0 = zve.k0(mountItem.toString(), new String[]{"\n"});
            if (listK0.isEmpty()) {
                listQ1 = zr4.a;
            } else {
                ListIterator listIterator = listK0.listIterator(listK0.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        listQ1 = z92.q1(listK0, listIterator.nextIndex() + 1);
                        break;
                    }
                }
                listQ1 = zr4.a;
            }
            Iterator it = listQ1.iterator();
            while (it.hasNext()) {
                s55.f("MountItemDispatcher", str + ": " + ((String) it.next()));
            }
        }
    }

    public zz9(a0a a0aVar, FabricUIManager.g gVar) {
        this.a = a0aVar;
        this.b = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [zz9] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [android.view.View] */
    public final void a() {
        boolean zHasNext;
        boolean zIsIgnorable;
        qmc qmcVar = ie7.g0;
        FabricUIManager.g gVar = this.b;
        FabricUIManager fabricUIManager = FabricUIManager.this;
        this.g = 0L;
        this.h = SystemClock.uptimeMillis();
        ConcurrentLinkedQueue concurrentLinkedQueue = this.c;
        iy8 iy8VarA = a.a(concurrentLinkedQueue);
        iy8 iy8VarA2 = a.a(this.d);
        if (iy8VarA2 == null && iy8VarA == null) {
            return;
        }
        Iterator it = fabricUIManager.mListeners.iterator();
        while (it.hasNext()) {
            ((UIManagerListener) it.next()).willMountItems(fabricUIManager);
        }
        int i = 0;
        if (iy8VarA != null) {
            Trace.beginSection(jpf.g("MountItemDispatcher::mountViews viewCommandMountItems"));
            ListIterator listIterator = iy8VarA.listIterator(0);
            while (true) {
                iy8.b bVar = (iy8.b) listIterator;
                if (!bVar.hasNext()) {
                    break;
                }
                r64 r64Var = (r64) bVar.next();
                if (qmcVar.enableFabricLogs()) {
                    a.b(r64Var, "dispatchMountItems: Executing viewCommandMountItem");
                }
                try {
                    c(r64Var);
                } catch (RetryableMountingLayerException e) {
                    if (r64Var.a == 0) {
                        r64Var.a++;
                        concurrentLinkedQueue.add(r64Var);
                    } else {
                        ReactSoftExceptionLogger.logSoftException("MountItemDispatcher", new ReactNoCrashSoftException("Caught exception executing ViewCommand: " + r64Var, e));
                    }
                } catch (Throwable th) {
                    ReactSoftExceptionLogger.logSoftException("MountItemDispatcher", new RuntimeException("Caught exception executing ViewCommand: " + r64Var, th));
                }
            }
            Trace.endSection();
        }
        iy8 iy8VarA3 = a.a(this.e);
        if (iy8VarA3 != null) {
            Trace.beginSection(jpf.g("MountItemDispatcher::mountViews preMountItems"));
            ListIterator listIterator2 = iy8VarA3.listIterator(0);
            while (true) {
                iy8.b bVar2 = (iy8.b) listIterator2;
                if (!bVar2.hasNext()) {
                    break;
                }
                MountItem mountItem = (MountItem) bVar2.next();
                if (qmcVar.enableFabricLogs()) {
                    a.b(mountItem, "dispatchMountItems: Executing preMountItem");
                }
                c(mountItem);
            }
            Trace.endSection();
        }
        if (iy8VarA2 != null) {
            Trace.beginSection(jpf.g("MountItemDispatcher::mountViews mountItems to execute"));
            long jUptimeMillis = SystemClock.uptimeMillis();
            ListIterator listIterator3 = iy8VarA2.listIterator(0);
            while (true) {
                iy8.b bVar3 = (iy8.b) listIterator3;
                if (!bVar3.hasNext()) {
                    this.g = (SystemClock.uptimeMillis() - jUptimeMillis) + this.g;
                    Trace.endSection();
                    break;
                } else {
                    MountItem mountItem2 = (MountItem) bVar3.next();
                    if (qmcVar.enableFabricLogs()) {
                        a.b(mountItem2, "dispatchMountItems: Executing mountItem");
                    }
                    try {
                        c(mountItem2);
                    } finally {
                        while (true) {
                            if (!zHasNext) {
                                break;
                            }
                        }
                        if (zIsIgnorable) {
                        }
                    }
                }
            }
        }
        Iterator it2 = fabricUIManager.mListeners.iterator();
        while (it2.hasNext()) {
            ((UIManagerListener) it2.next()).didMountItems(fabricUIManager);
        }
        if (iy8VarA2 == null || iy8VarA2.isEmpty()) {
            return;
        }
        ListIterator listIterator4 = iy8VarA2.listIterator(0);
        while (true) {
            iy8.b bVar4 = (iy8.b) listIterator4;
            if (!bVar4.hasNext()) {
                break;
            }
            MountItem mountItem3 = (MountItem) bVar4.next();
            if (mountItem3 != null && !fabricUIManager.mSurfaceIdsWithPendingMountNotification.contains(Integer.valueOf(mountItem3.getSurfaceId()))) {
                fabricUIManager.mSurfaceIdsWithPendingMountNotification.add(Integer.valueOf(mountItem3.getSurfaceId()));
            }
        }
        if (fabricUIManager.mMountNotificationScheduled || fabricUIManager.mSurfaceIdsWithPendingMountNotification.isEmpty()) {
            return;
        }
        fabricUIManager.mMountNotificationScheduled = true;
        UiThreadUtil.getUiThreadHandler().postAtFrontOfQueue(new b(gVar));
    }

    /* JADX WARN: Finally extract failed */
    public final void b(long j) {
        MountItem mountItem;
        this.i = j;
        ConcurrentLinkedQueue concurrentLinkedQueue = this.e;
        if (concurrentLinkedQueue.isEmpty()) {
            return;
        }
        long j2 = this.i + 8333333;
        Trace.beginSection(jpf.g("MountItemDispatcher::premountViews"));
        this.f = true;
        while (System.nanoTime() <= j2 && (mountItem = (MountItem) concurrentLinkedQueue.poll()) != null) {
            try {
                if (ie7.g0.enableFabricLogs()) {
                    a.b(mountItem, "dispatchPreMountItems");
                }
                c(mountItem);
            } catch (Throwable th) {
                this.f = false;
                throw th;
            }
        }
        this.f = false;
        Trace.endSection();
    }

    public final void c(MountItem mountItem) {
        p0f p0fVarA = this.a.a(mountItem.getSurfaceId());
        boolean z = false;
        if (p0fVarA != null && !p0fVarA.a) {
            z = !p0fVarA.b;
        }
        if (!z) {
            mountItem.execute(this.a);
            return;
        }
        if (ie7.g0.enableFabricLogs()) {
            s55.h("MountItemDispatcher", "executeOrEnqueue: Item execution delayed, surface %s is not ready yet", Integer.valueOf(mountItem.getSurfaceId()));
        }
        this.a.b(mountItem.getSurfaceId(), "MountItemDispatcher::executeOrEnqueue").e.add(mountItem);
    }

    public final void d() {
        if (this.f) {
            return;
        }
        this.f = true;
        try {
            a();
            this.f = false;
            FabricUIManager fabricUIManager = FabricUIManager.this;
            Iterator it = fabricUIManager.mListeners.iterator();
            while (it.hasNext()) {
                ((UIManagerListener) it.next()).didDispatchMountItems(fabricUIManager);
            }
        } catch (Throwable th) {
            this.f = false;
            throw th;
        }
    }
}
