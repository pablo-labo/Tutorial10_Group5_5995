package defpackage;

import android.os.SystemClock;
import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.core.a;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.NoSuchNativeViewException;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class e4g {
    public static final String A = e4g.class.getSimpleName();
    public final haa b;
    public final i e;
    public final ReactApplicationContext f;
    public ila k;
    public long o;
    public long p;
    public long q;
    public long r;
    public long s;
    public long t;
    public long u;
    public long v;
    public long w;
    public long x;
    public long y;
    public long z;
    public final int[] a = new int[4];
    public final Object c = new Object();
    public final Object d = new Object();
    public ArrayList<g> g = new ArrayList<>();
    public ArrayList<r> h = new ArrayList<>();
    public ArrayList<Runnable> i = new ArrayList<>();
    public ArrayDeque<r> j = new ArrayDeque<>();
    public boolean l = false;
    public boolean m = false;
    public boolean n = false;

    public class a implements Runnable {
        public final /* synthetic */ long V;
        public final /* synthetic */ long W;
        public final /* synthetic */ int a;
        public final /* synthetic */ ArrayList b;
        public final /* synthetic */ ArrayDeque c;
        public final /* synthetic */ ArrayList d;
        public final /* synthetic */ long e;
        public final /* synthetic */ long f;

        public a(int i, ArrayList arrayList, ArrayDeque arrayDeque, ArrayList arrayList2, long j, long j2, long j3, long j4) {
            this.a = i;
            this.b = arrayList;
            this.c = arrayDeque;
            this.d = arrayList2;
            this.e = j;
            this.f = j2;
            this.V = j3;
            this.W = j4;
        }

        @Override // java.lang.Runnable
        public final void run() {
            i3f i3fVar = new i3f("DispatchUI");
            i3fVar.R("BatchId", String.valueOf(this.a));
            i3fVar.T();
            try {
                try {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    ArrayList<g> arrayList = this.b;
                    if (arrayList != null) {
                        for (g gVar : arrayList) {
                            try {
                                gVar.d();
                            } catch (RetryableMountingLayerException e) {
                                if (gVar.a() == 0) {
                                    gVar.c();
                                    e4g.this.g.add(gVar);
                                } else {
                                    ReactSoftExceptionLogger.logSoftException(e4g.A, new ReactNoCrashSoftException(e));
                                }
                            } catch (Throwable th) {
                                ReactSoftExceptionLogger.logSoftException(e4g.A, th);
                            }
                        }
                    }
                    ArrayDeque arrayDeque = this.c;
                    if (arrayDeque != null) {
                        Iterator it = arrayDeque.iterator();
                        while (it.hasNext()) {
                            ((r) it.next()).b();
                        }
                    }
                    ArrayList arrayList2 = this.d;
                    if (arrayList2 != null) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            ((r) it2.next()).b();
                        }
                    }
                    e4g e4gVar = e4g.this;
                    if (e4gVar.n && e4gVar.p == 0) {
                        e4gVar.p = this.e;
                        e4gVar.q = SystemClock.uptimeMillis();
                        e4g e4gVar2 = e4g.this;
                        e4gVar2.r = this.f;
                        e4gVar2.s = this.V;
                        e4gVar2.t = jUptimeMillis;
                        e4gVar2.u = e4gVar2.q;
                        e4gVar2.x = this.W;
                        jpf.a(0, "delayBeforeDispatchViewUpdates");
                        jpf.c(0, "delayBeforeDispatchViewUpdates");
                        jpf.a(0, "delayBeforeBatchRunStart");
                        jpf.c(0, "delayBeforeBatchRunStart");
                    }
                    haa haaVar = e4g.this.b;
                    synchronized (haaVar) {
                        haaVar.g.d();
                    }
                    ila ilaVar = e4g.this.k;
                    if (ilaVar != null) {
                        ilaVar.a();
                    }
                } catch (Exception e2) {
                    e4g.this.m = true;
                    throw e2;
                }
            } finally {
                Trace.endSection();
            }
        }
    }

    public class b extends GuardedRunnable {
        public b(ReactContext reactContext) {
            super(reactContext);
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public final void runGuarded() {
            e4g.this.c();
        }
    }

    public final class c extends v {
        public final int b;
        public final boolean c;
        public final boolean d;

        public c(int i, int i2, boolean z, boolean z2) {
            super(i);
            this.b = i2;
            this.d = z;
            this.c = z2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // e4g.r
        public final void b() {
            boolean z = this.d;
            e4g e4gVar = e4g.this;
            if (z) {
                haa haaVar = e4gVar.b;
                synchronized (haaVar) {
                    zo7 zo7Var = haaVar.e;
                    zo7Var.a = -1;
                    ViewParent viewParent = zo7Var.b;
                    if (viewParent != null) {
                        viewParent.requestDisallowInterceptTouchEvent(false);
                    }
                    zo7Var.b = null;
                }
                return;
            }
            haa haaVar2 = e4gVar.b;
            int i = this.a;
            int i2 = this.b;
            boolean z2 = this.c;
            synchronized (haaVar2) {
                if (!z2) {
                    haaVar2.e.a(i2, null);
                    return;
                }
                View view = haaVar2.a.get(i);
                if (i2 != i && (view instanceof ViewParent)) {
                    haaVar2.e.a(i2, (ViewParent) view);
                    return;
                }
                if (haaVar2.c.get(i)) {
                    SoftAssertions.assertUnreachable("Cannot block native responder on " + i + " that is a root view");
                }
                haaVar2.e.a(i2, view.getParent());
            }
        }
    }

    public class d implements r {
        public final ReadableMap a;
        public final Callback b;

        public d(ReadableMap readableMap, Callback callback) {
            this.a = readableMap;
            this.b = callback;
        }

        @Override // e4g.r
        public final void b() {
            haa haaVar = e4g.this.b;
            ReadableMap readableMap = this.a;
            Callback callback = this.b;
            synchronized (haaVar) {
                haaVar.g.c(readableMap, callback);
            }
        }
    }

    public final class e extends v {
        public final mkf b;
        public final String c;
        public final noc d;

        public e(mkf mkfVar, int i, String str, noc nocVar) {
            super(i);
            this.b = mkfVar;
            this.c = str;
            this.d = nocVar;
            jpf.a(i, "createView");
        }

        @Override // e4g.r
        public final void b() {
            jpf.c(this.a, "createView");
            haa haaVar = e4g.this.b;
            mkf mkfVar = this.b;
            int i = this.a;
            String str = this.c;
            noc nocVar = this.d;
            synchronized (haaVar) {
                UiThreadUtil.assertOnUiThread();
                i3f i3fVar = new i3f("NativeViewHierarchyManager_createView");
                i3fVar.R("tag", String.valueOf(i));
                i3fVar.S(str, "className");
                i3fVar.T();
                try {
                    ViewManager<?, ?> viewManagerA = haaVar.d.a(str);
                    haaVar.a.put(i, viewManagerA.createView(i, mkfVar, nocVar, null, haaVar.e));
                    haaVar.b.put(i, viewManagerA);
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
        }
    }

    @Deprecated
    public final class f extends v implements g {
        public final int b;
        public final ReadableArray c;
        public int d;

        public f(int i, int i2, ReadableArray readableArray) {
            super(i);
            this.d = 0;
            this.b = i2;
            this.c = readableArray;
        }

        @Override // e4g.g
        public final int a() {
            return this.d;
        }

        @Override // e4g.r
        public final void b() {
            try {
                e4g.this.b.d(this.a, this.b, this.c);
            } catch (Throwable th) {
                ReactSoftExceptionLogger.logSoftException(e4g.A, new RuntimeException("Error dispatching View Command", th));
            }
        }

        @Override // e4g.g
        public final void c() {
            this.d++;
        }

        @Override // e4g.g
        public final void d() {
            e4g.this.b.d(this.a, this.b, this.c);
        }
    }

    public interface g {
        int a();

        void c();

        void d();
    }

    public final class h extends v implements g {
        public final String b;
        public final ReadableArray c;
        public int d;

        public h(int i, String str, ReadableArray readableArray) {
            super(i);
            this.d = 0;
            this.b = str;
            this.c = readableArray;
        }

        @Override // e4g.g
        public final int a() {
            return this.d;
        }

        @Override // e4g.r
        public final void b() {
            try {
                e4g.this.b.e(this.a, this.b, this.c);
            } catch (Throwable th) {
                ReactSoftExceptionLogger.logSoftException(e4g.A, new RuntimeException("Error dispatching View Command", th));
            }
        }

        @Override // e4g.g
        public final void c() {
            this.d++;
        }

        @Override // e4g.g
        public final void d() {
            e4g.this.b.e(this.a, this.b, this.c);
        }
    }

    public class i extends ee6 {
        public final int b;

        public i(ReactApplicationContext reactApplicationContext, int i) {
            super(reactApplicationContext);
            this.b = i;
        }

        @Override // defpackage.ee6
        public final void a(long j) {
            e4g e4gVar = e4g.this;
            if (e4gVar.m) {
                s55.n("ReactNative", "Not flushing pending UI operations because of previously thrown Exception");
                return;
            }
            Trace.beginSection(jpf.g("dispatchNonBatchedUIOperations"));
            try {
                b(j);
                Trace.endSection();
                e4gVar.c();
                com.facebook.react.modules.core.a aVar = com.facebook.react.modules.core.a.f;
                if (aVar != null) {
                    aVar.b(a.EnumC0132a.a, this);
                } else {
                    r6.g("ReactChoreographer needs to be initialized.");
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }

        public final void b(long j) throws Exception {
            r rVarPollFirst;
            while (16 - ((System.nanoTime() - j) / 1000000) >= this.b) {
                synchronized (e4g.this.d) {
                    try {
                        if (e4g.this.j.isEmpty()) {
                            return;
                        } else {
                            rVarPollFirst = e4g.this.j.pollFirst();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                try {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    rVarPollFirst.b();
                    e4g e4gVar = e4g.this;
                    e4gVar.o = (SystemClock.uptimeMillis() - jUptimeMillis) + e4gVar.o;
                } catch (Exception e) {
                    e4g.this.m = true;
                    throw e;
                }
            }
        }
    }

    public final class j implements r {
        public final int a;
        public final float b;
        public final float c;
        public final Callback d;

        public j(int i, float f, float f2, Callback callback) {
            this.a = i;
            this.b = f;
            this.c = f2;
            this.d = callback;
        }

        @Override // e4g.r
        public final void b() {
            int iA;
            try {
                e4g e4gVar = e4g.this;
                e4gVar.b.h(this.a, e4gVar.a);
                e4g e4gVar2 = e4g.this;
                int[] iArr = e4gVar2.a;
                float f = iArr[0];
                float f2 = iArr[1];
                haa haaVar = e4gVar2.b;
                int i = this.a;
                float f3 = this.b;
                float f4 = this.c;
                synchronized (haaVar) {
                    UiThreadUtil.assertOnUiThread();
                    View view = haaVar.a.get(i);
                    if (view == null) {
                        throw new JSApplicationIllegalArgumentException("Could not find view with tag " + i);
                    }
                    iA = gpf.a(f3, f4, (ViewGroup) view, gpf.a);
                }
                try {
                    e4g e4gVar3 = e4g.this;
                    e4gVar3.b.h(iA, e4gVar3.a);
                    this.d.invoke(Integer.valueOf(iA), Float.valueOf(nn2.C(e4g.this.a[0] - f)), Float.valueOf(nn2.C(e4g.this.a[1] - f2)), Float.valueOf(nn2.C(e4g.this.a[2])), Float.valueOf(nn2.C(e4g.this.a[3])));
                } catch (IllegalViewOperationException unused) {
                    this.d.invoke(new Object[0]);
                }
            } catch (IllegalViewOperationException unused2) {
                this.d.invoke(new Object[0]);
            }
        }
    }

    public final class k extends v {
        public final int[] b;
        public final xog[] c;
        public final int[] d;

        public k(int i, int[] iArr, xog[] xogVarArr, int[] iArr2) {
            super(i);
            this.b = iArr;
            this.c = xogVarArr;
            this.d = iArr2;
        }

        @Override // e4g.r
        public final void b() {
            haa haaVar = e4g.this.b;
            int i = this.a;
            int[] iArr = this.b;
            xog[] xogVarArr = this.c;
            int[] iArr2 = this.d;
            synchronized (haaVar) {
                UiThreadUtil.assertOnUiThread();
                Set<Integer> setG = haaVar.g(i);
                ViewGroup viewGroup = (ViewGroup) haaVar.a.get(i);
                ViewGroupManager viewGroupManager = (ViewGroupManager) haaVar.k(i);
                if (viewGroup == null) {
                    throw new IllegalViewOperationException("Trying to manageChildren view with tag " + i + " which doesn't exist\n detail: " + haa.c(viewGroup, viewGroupManager, iArr, xogVarArr, iArr2));
                }
                int childCount = viewGroupManager.getChildCount(viewGroup);
                if (iArr != null) {
                    int length = iArr.length - 1;
                    while (length >= 0) {
                        int i2 = iArr[length];
                        if (i2 < 0) {
                            throw new IllegalViewOperationException("Trying to remove a negative view index:" + i2 + " view tag: " + i + "\n detail: " + haa.c(viewGroup, viewGroupManager, iArr, xogVarArr, iArr2));
                        }
                        if (viewGroupManager.getChildAt(viewGroup, i2) == null) {
                            if (haaVar.c.get(i) && viewGroupManager.getChildCount(viewGroup) == 0) {
                                return;
                            }
                            throw new IllegalViewOperationException("Trying to remove a view index above child count " + i2 + " view tag: " + i + "\n detail: " + haa.c(viewGroup, viewGroupManager, iArr, xogVarArr, iArr2));
                        }
                        if (i2 >= childCount) {
                            throw new IllegalViewOperationException("Trying to remove an out of order view index:" + i2 + " view tag: " + i + "\n detail: " + haa.c(viewGroup, viewGroupManager, iArr, xogVarArr, iArr2));
                        }
                        View childAt = viewGroupManager.getChildAt(viewGroup, i2);
                        if (haaVar.i && haaVar.g.e(childAt)) {
                            int id = childAt.getId();
                            if (iArr2 != null) {
                                for (int i3 : iArr2) {
                                    if (i3 == id) {
                                        break;
                                    }
                                }
                            }
                            viewGroupManager.removeViewAt(viewGroup, i2);
                        } else {
                            viewGroupManager.removeViewAt(viewGroup, i2);
                        }
                        length--;
                        childCount = i2;
                    }
                }
                if (iArr2 != null) {
                    for (int i4 : iArr2) {
                        View view = haaVar.a.get(i4);
                        if (view == null) {
                            throw new IllegalViewOperationException("Trying to destroy unknown view tag: " + i4 + "\n detail: " + haa.c(viewGroup, viewGroupManager, iArr, xogVarArr, iArr2));
                        }
                        if (haaVar.i && haaVar.g.e(view)) {
                            setG.add(Integer.valueOf(i4));
                            haaVar.g.a(view, new gaa(haaVar, viewGroupManager, viewGroup, view, setG, i));
                        } else {
                            haaVar.f(view);
                        }
                    }
                }
                if (xogVarArr != null) {
                    for (xog xogVar : xogVarArr) {
                        View view2 = haaVar.a.get(xogVar.a);
                        if (view2 == null) {
                            throw new IllegalViewOperationException("Trying to add unknown view tag: " + xogVar.a + "\n detail: " + haa.c(viewGroup, viewGroupManager, iArr, xogVarArr, iArr2));
                        }
                        int i5 = xogVar.b;
                        if (!setG.isEmpty()) {
                            i5 = 0;
                            int i6 = 0;
                            while (i5 < viewGroup.getChildCount() && i6 != xogVar.b) {
                                if (!setG.contains(Integer.valueOf(viewGroup.getChildAt(i5).getId()))) {
                                    i6++;
                                }
                                i5++;
                            }
                        }
                        viewGroupManager.addView(viewGroup, view2, i5);
                    }
                }
                if (setG.isEmpty()) {
                    haaVar.j.remove(Integer.valueOf(i));
                }
            }
        }
    }

    public final class l implements r {
        public final int a;
        public final Callback b;

        public l(int i, Callback callback) {
            this.a = i;
            this.b = callback;
        }

        @Override // e4g.r
        public final void b() {
            Callback callback = this.b;
            e4g e4gVar = e4g.this;
            try {
                e4gVar.b.i(this.a, e4gVar.a);
                callback.invoke(Float.valueOf(nn2.C(r1[0])), Float.valueOf(nn2.C(r1[1])), Float.valueOf(nn2.C(r1[2])), Float.valueOf(nn2.C(r1[3])));
            } catch (NoSuchNativeViewException unused) {
                callback.invoke(new Object[0]);
            }
        }
    }

    public final class m implements r {
        public final int a;
        public final Callback b;

        public m(int i, Callback callback) {
            this.a = i;
            this.b = callback;
        }

        @Override // e4g.r
        public final void b() {
            Callback callback = this.b;
            e4g e4gVar = e4g.this;
            try {
                e4gVar.b.h(this.a, e4gVar.a);
                callback.invoke(0, 0, Float.valueOf(nn2.C(r3[2])), Float.valueOf(nn2.C(r3[3])), Float.valueOf(nn2.C(r3[0])), Float.valueOf(nn2.C(r3[1])));
            } catch (NoSuchNativeViewException unused) {
                callback.invoke(new Object[0]);
            }
        }
    }

    public final class n extends v {
        public n(int i) {
            super(i);
        }

        @Override // e4g.r
        public final void b() {
            haa haaVar = e4g.this.b;
            int i = this.a;
            synchronized (haaVar) {
                try {
                    UiThreadUtil.assertOnUiThread();
                    if (!haaVar.c.get(i)) {
                        SoftAssertions.assertUnreachable("View with tag " + i + " is not registered as a root view");
                    }
                    View view = haaVar.a.get(i);
                    haaVar.f(view);
                    haaVar.c.delete(i);
                    if (view != null) {
                        view.setId(-1);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final class o extends v {
        public final int b;

        public o(int i, int i2) {
            super(i);
            this.b = i2;
        }

        @Override // e4g.r
        public final void b() {
            try {
                e4g.this.b.l(this.a, this.b);
            } catch (RetryableMountingLayerException e) {
                ReactSoftExceptionLogger.logSoftException(e4g.A, e);
            }
        }
    }

    public class p implements r {
        public final boolean a;

        public p(boolean z) {
            this.a = z;
        }

        @Override // e4g.r
        public final void b() {
            e4g.this.b.i = this.a;
        }
    }

    public class q implements r {
        public final h0g a;

        public q(h0g h0gVar) {
            this.a = h0gVar;
        }

        @Override // e4g.r
        public final void b() {
            this.a.b(e4g.this.b);
        }
    }

    public interface r {
        void b();
    }

    public final class s extends v {
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final e6h g;

        public s(int i, int i2, int i3, int i4, int i5, int i6, e6h e6hVar) {
            super(i2);
            this.b = i;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = e6hVar;
            jpf.a(i2, "updateLayout");
        }

        @Override // e4g.r
        public final void b() {
            jpf.c(this.a, "updateLayout");
            haa haaVar = e4g.this.b;
            int i = this.b;
            int i2 = this.a;
            int i3 = this.c;
            int i4 = this.d;
            int i5 = this.e;
            int i6 = this.f;
            e6h e6hVar = this.g;
            synchronized (haaVar) {
                UiThreadUtil.assertOnUiThread();
                i3f i3fVar = new i3f("NativeViewHierarchyManager_updateLayout");
                i3fVar.R("parentTag", String.valueOf(i));
                i3fVar.R("tag", String.valueOf(i2));
                i3fVar.T();
                try {
                    View viewJ = haaVar.j(i2);
                    int i7 = wl8.a;
                    e6hVar.getClass();
                    int iOrdinal = e6hVar.ordinal();
                    int i8 = 1;
                    if (iOrdinal == 1) {
                        i8 = 0;
                    } else if (iOrdinal != 2) {
                        i8 = 2;
                    }
                    viewJ.setLayoutDirection(i8);
                    viewJ.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
                    ViewParent parent = viewJ.getParent();
                    if (parent instanceof qfd) {
                        parent.requestLayout();
                    }
                    if (haaVar.c.get(i)) {
                        haaVar.m(viewJ, i3, i4, i5, i6);
                    } else {
                        NativeModule nativeModule = (ViewManager) haaVar.b.get(i);
                        if (!(nativeModule instanceof wo6)) {
                            throw new IllegalViewOperationException("Trying to use view with tag " + i + " as a parent, but its Manager doesn't implement IViewManagerWithChildren");
                        }
                        wo6 wo6Var = (wo6) nativeModule;
                        if (wo6Var != null && !wo6Var.needsCustomLayoutForChildren()) {
                            haaVar.m(viewJ, i3, i4, i5, i6);
                        }
                    }
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
        }
    }

    public final class t extends v {
        public final noc b;

        public t(int i, noc nocVar) {
            super(i);
            this.b = nocVar;
        }

        @Override // e4g.r
        public final void b() {
            e4g.this.b.n(this.a, this.b);
        }
    }

    public final class u extends v {
        public final npc b;

        public u(int i, npc npcVar) {
            super(i);
            this.b = npcVar;
        }

        @Override // e4g.r
        public final void b() {
            haa haaVar = e4g.this.b;
            int i = this.a;
            npc npcVar = this.b;
            synchronized (haaVar) {
                UiThreadUtil.assertOnUiThread();
                haaVar.k(i).updateExtraData(haaVar.j(i), npcVar);
            }
        }
    }

    public abstract class v implements r {
        public final int a;

        public v(int i) {
            this.a = i;
        }
    }

    public e4g(ReactApplicationContext reactApplicationContext, haa haaVar, int i2) {
        this.b = haaVar;
        this.e = new i(reactApplicationContext, i2 == -1 ? 8 : i2);
        this.f = reactApplicationContext;
    }

    public final void a(long j2, int i2, long j3) {
        ArrayList<g> arrayList;
        ArrayList<r> arrayList2;
        i3f i3fVar = new i3f("UIViewOperationQueue.dispatchViewUpdates");
        i3fVar.R("batchId", String.valueOf(i2));
        i3fVar.T();
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            ArrayDeque<r> arrayDeque = null;
            if (this.g.isEmpty()) {
                arrayList = null;
            } else {
                ArrayList<g> arrayList3 = this.g;
                this.g = new ArrayList<>();
                arrayList = arrayList3;
            }
            if (this.h.isEmpty()) {
                arrayList2 = null;
            } else {
                ArrayList<r> arrayList4 = this.h;
                this.h = new ArrayList<>();
                arrayList2 = arrayList4;
            }
            synchronized (this.d) {
                try {
                    if (!this.j.isEmpty()) {
                        arrayDeque = this.j;
                        this.j = new ArrayDeque<>();
                    }
                } finally {
                }
            }
            ila ilaVar = this.k;
            if (ilaVar != null) {
                ilaVar.b();
            }
            a aVar = new a(i2, arrayList, arrayDeque, arrayList2, j2, j3, jUptimeMillis, jCurrentThreadTimeMillis);
            i3f i3fVar2 = new i3f("acquiring mDispatchRunnablesLock");
            i3fVar2.R("batchId", String.valueOf(i2));
            i3fVar2.T();
            synchronized (this.c) {
                Trace.endSection();
                this.i.add(aVar);
            }
            if (!this.l) {
                UiThreadUtil.runOnUiThread(new b(this.f));
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void b(mkf mkfVar, int i2, String str, noc nocVar) {
        synchronized (this.d) {
            this.y++;
            this.j.addLast(new e(mkfVar, i2, str, nocVar));
        }
    }

    public final void c() {
        if (this.m) {
            s55.n("ReactNative", "Not flushing pending UI operations because of previously thrown Exception");
            return;
        }
        synchronized (this.c) {
            if (this.i.isEmpty()) {
                return;
            }
            ArrayList<Runnable> arrayList = this.i;
            this.i = new ArrayList<>();
            long jUptimeMillis = SystemClock.uptimeMillis();
            Iterator<Runnable> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            if (this.n) {
                this.v = SystemClock.uptimeMillis() - jUptimeMillis;
                this.w = this.o;
                this.n = false;
                jpf.a(0, "batchedExecutionTime");
                jpf.c(0, "batchedExecutionTime");
            }
            this.o = 0L;
        }
    }
}
