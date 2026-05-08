package defpackage;

import android.util.SparseArray;
import com.facebook.react.animated.EventAnimationDriver;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapBuilder;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import defpackage.ox4;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public final class d9a implements by4 {
    public final ReactApplicationContext a;
    public int f;
    public boolean h;
    public boolean i;
    public boolean j;
    public final SparseArray<hd0> b = new SparseArray<>();
    public final SparseArray<td0> c = new SparseArray<>();
    public final SparseArray<hd0> d = new SparseArray<>();
    public final ArrayList e = new ArrayList();
    public final LinkedList g = new LinkedList();

    public d9a(ReactApplicationContext reactApplicationContext) {
        this.a = reactApplicationContext;
    }

    @Override // defpackage.by4
    public final void a(ox4<?> ox4Var) {
        ox4Var.getClass();
        if (UiThreadUtil.isOnUiThread()) {
            l(ox4Var);
        } else {
            UiThreadUtil.runOnUiThread(new yc4(2, this, ox4Var));
        }
    }

    public final void b(int i, String str, ReadableMap readableMap) {
        int i2 = readableMap.getInt("animatedValueTag");
        hd0 hd0Var = this.b.get(i2);
        if (hd0Var == null) {
            m6.m(bg.d(i2, "addAnimatedEventToView: Animated node with tag [", "] does not exist"));
            return;
        }
        if (!(hd0Var instanceof elg)) {
            String name = elg.class.getName();
            StringBuilder sbJ = m6.j(i, "addAnimatedEventToView: Animated node on view [", "] connected to event handler (", str, ") should be of type ");
            sbJ.append(name);
            throw new JSApplicationIllegalArgumentException(sbJ.toString());
        }
        ReadableArray array = readableMap.getArray("nativeEventPath");
        if (array == null) {
            r6.g("Required value was null.");
            return;
        }
        ArrayList arrayList = new ArrayList(array.size());
        int size = array.size();
        for (int i3 = 0; i3 < size; i3++) {
            String string = array.getString(i3);
            if (string == null) {
                r6.g("Required value was null.");
                return;
            }
            arrayList.add(string);
        }
        if (wve.K(str, "on", false)) {
            str = "top".concat(str.substring(2));
        }
        this.e.add(new EventAnimationDriver(str, i, arrayList, (elg) hd0Var));
        if (str.equals("topScroll")) {
            b(i, "topScrollEnded", readableMap);
        }
    }

    public final void c(int i, int i2) {
        hd0 hd0Var = this.b.get(i);
        if (hd0Var == null) {
            m6.m(bg.d(i, "connectAnimatedNodeToView: Animated node with tag [", "] does not exist"));
            return;
        }
        if (!(hd0Var instanceof r4c)) {
            m6.m(v40.c(i2, "connectAnimatedNodeToView: Animated node connected to view [", "] should be of type ", r4c.class.getName()));
            return;
        }
        UIManager uIManagerK = dmc.k(this.a, i2);
        if (uIManagerK == null) {
            ReactSoftExceptionLogger.logSoftException("NativeAnimatedNodesManager", new ReactNoCrashSoftException(p6.c(i2, "connectAnimatedNodeToView: Animated node could not be connected to UIManager - uiManager disappeared for tag: ")));
            return;
        }
        r4c r4cVar = (r4c) hd0Var;
        int i3 = r4cVar.f;
        if (i3 != -1) {
            m6.m(k20.l("Animated node ", r4cVar.d, i3, " is already attached to a view: "));
            return;
        }
        r4cVar.f = i2;
        r4cVar.i = uIManagerK;
        this.d.put(i, hd0Var);
    }

    public final void d(int i, int i2) {
        SparseArray<hd0> sparseArray = this.b;
        hd0 hd0Var = sparseArray.get(i);
        if (hd0Var == null) {
            m6.m(bg.d(i, "connectAnimatedNodes: Animated node with tag (parent) [", "] does not exist"));
            return;
        }
        hd0 hd0Var2 = sparseArray.get(i2);
        if (hd0Var2 == null) {
            m6.m(bg.d(i2, "connectAnimatedNodes: Animated node with tag (child) [", "] does not exist"));
            return;
        }
        ArrayList arrayList = hd0Var.a;
        if (arrayList == null) {
            arrayList = new ArrayList(1);
            hd0Var.a = arrayList;
        }
        arrayList.add(hd0Var2);
        hd0Var2.b(hd0Var);
        this.d.put(i2, hd0Var2);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void e(int i, ReadableMap readableMap) {
        hd0 kyeVar;
        SparseArray<hd0> sparseArray = this.b;
        if (sparseArray.get(i) != null) {
            m6.m(bg.d(i, "createAnimatedNode: Animated node [", "] already exists"));
            return;
        }
        String string = readableMap.getString("type");
        if (string != null) {
            switch (string.hashCode()) {
                case -1774341004:
                    if (string.equals("subtraction")) {
                        kyeVar = new kye(readableMap, this);
                        kyeVar.d = i;
                        sparseArray.put(i, kyeVar);
                        this.d.put(i, kyeVar);
                        return;
                    }
                    break;
                case -1226589444:
                    if (string.equals("addition")) {
                        kyeVar = new iz(readableMap, this);
                        kyeVar.d = i;
                        sparseArray.put(i, kyeVar);
                        this.d.put(i, kyeVar);
                        return;
                    }
                    break;
                case -1023368385:
                    if (string.equals("object")) {
                        kyeVar = new fna(readableMap, this);
                        kyeVar.d = i;
                        sparseArray.put(i, kyeVar);
                        this.d.put(i, kyeVar);
                        return;
                    }
                    break;
                case 94842723:
                    if (string.equals("color")) {
                        kyeVar = new ea2(readableMap, this, this.a);
                        kyeVar.d = i;
                        sparseArray.put(i, kyeVar);
                        this.d.put(i, kyeVar);
                        return;
                    }
                    break;
                case 106940784:
                    if (string.equals("props")) {
                        kyeVar = new r4c(readableMap, this);
                        kyeVar.d = i;
                        sparseArray.put(i, kyeVar);
                        this.d.put(i, kyeVar);
                        return;
                    }
                    break;
                case 109780401:
                    if (string.equals("style")) {
                        kyeVar = new jwe(readableMap, this);
                        kyeVar.d = i;
                        sparseArray.put(i, kyeVar);
                        this.d.put(i, kyeVar);
                        return;
                    }
                    break;
                case 111972721:
                    if (string.equals("value")) {
                        kyeVar = new elg(readableMap);
                        kyeVar.d = i;
                        sparseArray.put(i, kyeVar);
                        this.d.put(i, kyeVar);
                        return;
                    }
                    break;
                case 364720301:
                    if (string.equals("division")) {
                        kyeVar = new c84(readableMap, this);
                        kyeVar.d = i;
                        sparseArray.put(i, kyeVar);
                        this.d.put(i, kyeVar);
                        return;
                    }
                    break;
                case 559331748:
                    if (string.equals("interpolation")) {
                        kyeVar = new gj7(readableMap);
                        kyeVar.d = i;
                        sparseArray.put(i, kyeVar);
                        this.d.put(i, kyeVar);
                        return;
                    }
                    break;
                case 668845958:
                    if (string.equals("multiplication")) {
                        kyeVar = new n2a(readableMap, this);
                        kyeVar.d = i;
                        sparseArray.put(i, kyeVar);
                        this.d.put(i, kyeVar);
                        return;
                    }
                    break;
                case 1052666732:
                    if (string.equals("transform")) {
                        kyeVar = new irf(readableMap, this);
                        kyeVar.d = i;
                        sparseArray.put(i, kyeVar);
                        this.d.put(i, kyeVar);
                        return;
                    }
                    break;
                case 1227434359:
                    if (string.equals("modulus")) {
                        kyeVar = new iy9(readableMap, this);
                        kyeVar.d = i;
                        sparseArray.put(i, kyeVar);
                        this.d.put(i, kyeVar);
                        return;
                    }
                    break;
                case 1270488759:
                    if (string.equals("tracking")) {
                        kyeVar = new vqf(readableMap, this);
                        kyeVar.d = i;
                        sparseArray.put(i, kyeVar);
                        this.d.put(i, kyeVar);
                        return;
                    }
                    break;
                case 1300649942:
                    if (string.equals("diffclamp")) {
                        kyeVar = new r44(readableMap, this);
                        kyeVar.d = i;
                        sparseArray.put(i, kyeVar);
                        this.d.put(i, kyeVar);
                        return;
                    }
                    break;
            }
        }
        m6.m(l5.l("Unsupported node type: ", string));
    }

    public final void f(int i, int i2) {
        hd0 hd0Var = this.b.get(i);
        if (hd0Var == null) {
            m6.m(bg.d(i, "disconnectAnimatedNodeFromView: Animated node with tag [", "] does not exist"));
            return;
        }
        if (!(hd0Var instanceof r4c)) {
            m6.m(v40.c(i2, "disconnectAnimatedNodeFromView: Animated node connected to view [", "] should be of type ", r4c.class.getName()));
            return;
        }
        r4c r4cVar = (r4c) hd0Var;
        int i3 = r4cVar.f;
        if (i3 == i2 || i3 == -1) {
            r4cVar.f = -1;
        } else {
            m6.m(k20.l("Attempting to disconnect view that has not been connected with the given animated node: ", i2, i3, " but is connected to view "));
        }
    }

    public final void g(int i, int i2) {
        SparseArray<hd0> sparseArray = this.b;
        hd0 hd0Var = sparseArray.get(i);
        if (hd0Var == null) {
            m6.m(bg.d(i, "disconnectAnimatedNodes: Animated node with tag (parent) [", "] does not exist"));
            return;
        }
        hd0 hd0Var2 = sparseArray.get(i2);
        if (hd0Var2 == null) {
            m6.m(bg.d(i2, "disconnectAnimatedNodes: Animated node with tag (child) [", "] does not exist"));
            return;
        }
        ArrayList arrayList = hd0Var.a;
        if (arrayList != null) {
            hd0Var2.c(hd0Var);
            arrayList.remove(hd0Var2);
        }
        this.d.put(i2, hd0Var2);
    }

    public final void h(int i) {
        hd0 hd0Var = this.b.get(i);
        if (hd0Var == null || !(hd0Var instanceof elg)) {
            m6.m(bg.d(i, "extractAnimatedNodeOffset: Animated node [", "] does not exist, or is not a 'value' node"));
            return;
        }
        elg elgVar = (elg) hd0Var;
        elgVar.f += elgVar.e;
        elgVar.e = 0.0d;
    }

    public final void i(int i) {
        hd0 hd0Var = this.b.get(i);
        if (hd0Var == null || !(hd0Var instanceof elg)) {
            m6.m(bg.d(i, "flattenAnimatedNodeOffset: Animated node [", "] does not exist, or is not a 'value' node"));
            return;
        }
        elg elgVar = (elg) hd0Var;
        elgVar.e += elgVar.f;
        elgVar.f = 0.0d;
    }

    public final hd0 j(int i) {
        return this.b.get(i);
    }

    public final void k(int i, Callback callback) {
        hd0 hd0Var = this.b.get(i);
        if (hd0Var == null || !(hd0Var instanceof elg)) {
            m6.m(bg.d(i, "getValue: Animated node with tag [", "] does not exist or is not a 'value' node"));
            return;
        }
        double dG = ((elg) hd0Var).g();
        if (callback != null) {
            callback.invoke(Double.valueOf(dG));
            return;
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.getClass();
        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
        readableMapBuilder.put("tag", i);
        readableMapBuilder.put("value", dG);
        this.a.emitDeviceEvent("onNativeAnimatedModuleGetValue", writableMapCreateMap);
    }

    public final void l(ox4<?> ox4Var) {
        LinkedList linkedList;
        ArrayList arrayList = this.e;
        if (arrayList.isEmpty()) {
            return;
        }
        ox4.c eventAnimationDriverMatchSpec = ox4Var.getEventAnimationDriverMatchSpec();
        Iterator it = arrayList.iterator();
        boolean z = false;
        while (true) {
            boolean zHasNext = it.hasNext();
            linkedList = this.g;
            if (!zHasNext) {
                break;
            }
            EventAnimationDriver eventAnimationDriver = (EventAnimationDriver) it.next();
            if (eventAnimationDriverMatchSpec != null && eventAnimationDriverMatchSpec.a(eventAnimationDriver.viewTag, eventAnimationDriver.eventName)) {
                u(eventAnimationDriver.valueNode);
                ox4Var.dispatchModern(eventAnimationDriver);
                linkedList.add(eventAnimationDriver.valueNode);
                z = true;
            }
        }
        if (z) {
            x(linkedList);
            linkedList.clear();
        }
    }

    public final void m(int i, int i2, String str) {
        Object next;
        if (wve.K(str, "on", false)) {
            str = "top".concat(str.substring(2));
        }
        ArrayList arrayList = this.e;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            EventAnimationDriver eventAnimationDriver = (EventAnimationDriver) next;
            if (str.equals(eventAnimationDriver.eventName) && i == eventAnimationDriver.viewTag && i2 == eventAnimationDriver.valueNode.d) {
                break;
            }
        }
        EventAnimationDriver eventAnimationDriver2 = (EventAnimationDriver) next;
        if (eventAnimationDriver2 != null) {
            arrayList.remove(eventAnimationDriver2);
        }
        if (str.equals("topScroll")) {
            m(i, i2, "topScrollEnded");
        }
    }

    public final void n(int i) {
        hd0 hd0Var = this.b.get(i);
        if (hd0Var == null) {
            return;
        }
        if (!(hd0Var instanceof r4c)) {
            m6.m("Animated node connected to view [?] should be of type ".concat(r4c.class.getName()));
            return;
        }
        r4c r4cVar = (r4c) hd0Var;
        JavaOnlyMap javaOnlyMap = r4cVar.h;
        int i2 = r4cVar.f;
        if (i2 == -1 || msb.e(i2) == 2) {
            return;
        }
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = javaOnlyMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            javaOnlyMap.putNull(readableMapKeySetIteratorKeySetIterator.nextKey());
        }
        UIManager uIManager = r4cVar.i;
        if (uIManager != null) {
            uIManager.synchronouslyUpdateViewOnUIThread(r4cVar.f, javaOnlyMap);
        }
    }

    public final void o(long j) {
        LinkedList linkedList;
        UiThreadUtil.assertOnUiThread();
        SparseArray<hd0> sparseArray = this.d;
        int size = sparseArray.size();
        int i = 0;
        while (true) {
            linkedList = this.g;
            if (i >= size) {
                break;
            }
            hd0 hd0VarValueAt = sparseArray.valueAt(i);
            hd0VarValueAt.getClass();
            linkedList.add(hd0VarValueAt);
            i++;
        }
        sparseArray.clear();
        SparseArray<td0> sparseArray2 = this.c;
        int size2 = sparseArray2.size();
        boolean z = false;
        for (int i2 = 0; i2 < size2; i2++) {
            td0 td0VarValueAt = sparseArray2.valueAt(i2);
            td0VarValueAt.b(j);
            elg elgVar = td0VarValueAt.b;
            if (elgVar != null) {
                linkedList.add(elgVar);
            }
            if (td0VarValueAt.a) {
                z = true;
            }
        }
        x(linkedList);
        linkedList.clear();
        if (z) {
            WritableArray writableArrayCreateArray = null;
            for (int size3 = sparseArray2.size() - 1; -1 < size3; size3--) {
                td0 td0VarValueAt2 = sparseArray2.valueAt(size3);
                if (td0VarValueAt2.a) {
                    elg elgVar2 = td0VarValueAt2.b;
                    if (elgVar2 == null) {
                        r6.g("Required value was null.");
                        return;
                    }
                    if (td0VarValueAt2.c != null) {
                        WritableMap writableMapCreateMap = Arguments.createMap();
                        writableMapCreateMap.getClass();
                        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
                        readableMapBuilder.put("finished", true);
                        readableMapBuilder.put("value", elgVar2.e);
                        readableMapBuilder.put("offset", elgVar2.f);
                        Callback callback = td0VarValueAt2.c;
                        if (callback != null) {
                            callback.invoke(writableMapCreateMap);
                        }
                    } else {
                        WritableMap writableMapCreateMap2 = Arguments.createMap();
                        writableMapCreateMap2.getClass();
                        ReadableMapBuilder readableMapBuilder2 = new ReadableMapBuilder(writableMapCreateMap2);
                        readableMapBuilder2.put("animationId", td0VarValueAt2.d);
                        readableMapBuilder2.put("finished", true);
                        readableMapBuilder2.put("value", elgVar2.e);
                        readableMapBuilder2.put("offset", elgVar2.f);
                        if (writableArrayCreateArray == null) {
                            writableArrayCreateArray = Arguments.createArray();
                            writableArrayCreateArray.getClass();
                        }
                        writableArrayCreateArray.pushMap(writableMapCreateMap2);
                    }
                    sparseArray2.removeAt(size3);
                }
            }
            if (writableArrayCreateArray != null) {
                this.a.emitDeviceEvent("onNativeAnimatedModuleAnimationFinished", writableArrayCreateArray);
            }
        }
    }

    public final void p(int i, double d) {
        hd0 hd0Var = this.b.get(i);
        if (hd0Var == null || !(hd0Var instanceof elg)) {
            m6.m(bg.d(i, "setAnimatedNodeOffset: Animated node [", "] does not exist, or is not a 'value' node"));
        } else {
            ((elg) hd0Var).f = d;
            this.d.put(i, hd0Var);
        }
    }

    public final void q(int i, double d) {
        hd0 hd0Var = this.b.get(i);
        if (hd0Var == null || !(hd0Var instanceof elg)) {
            m6.m(bg.d(i, "setAnimatedNodeValue: Animated node [", "] does not exist, or is not a 'value' node"));
            return;
        }
        u(hd0Var);
        ((elg) hd0Var).e = d;
        this.d.put(i, hd0Var);
    }

    public final void r(int i, ReadableMap readableMap, Callback callback, int i2) {
        td0 tpeVar;
        readableMap.getClass();
        hd0 hd0Var = this.b.get(i2);
        if (hd0Var == null) {
            m6.m(bg.d(i2, "startAnimatingNode: Animated node [", "] does not exist"));
            return;
        }
        if (!(hd0Var instanceof elg)) {
            m6.m(v40.c(i2, "startAnimatingNode: Animated node [", "] should be of type ", elg.class.getName()));
            return;
        }
        SparseArray<td0> sparseArray = this.c;
        td0 td0Var = sparseArray.get(i);
        if (td0Var != null) {
            td0Var.a(readableMap);
            return;
        }
        String string = readableMap.getString("type");
        if (string != null) {
            int iHashCode = string.hashCode();
            if (iHashCode != -1266514778) {
                if (iHashCode != -895679987) {
                    if (iHashCode == 95459258 && string.equals("decay")) {
                        wi3 wi3Var = new wi3();
                        wi3Var.g = -1L;
                        wi3Var.j = 1;
                        wi3Var.k = 1;
                        wi3Var.a(readableMap);
                        tpeVar = wi3Var;
                        tpeVar.d = i;
                        tpeVar.c = callback;
                        tpeVar.b = (elg) hd0Var;
                        sparseArray.put(i, tpeVar);
                        return;
                    }
                } else if (string.equals("spring")) {
                    tpeVar = new tpe(readableMap);
                    tpeVar.d = i;
                    tpeVar.c = callback;
                    tpeVar.b = (elg) hd0Var;
                    sparseArray.put(i, tpeVar);
                    return;
                }
            } else if (string.equals("frames")) {
                qs5 qs5Var = new qs5();
                qs5Var.e = -1L;
                qs5Var.f = new double[0];
                qs5Var.i = 1;
                qs5Var.j = 1;
                qs5Var.a(readableMap);
                tpeVar = qs5Var;
                tpeVar.d = i;
                tpeVar.c = callback;
                tpeVar.b = (elg) hd0Var;
                sparseArray.put(i, tpeVar);
                return;
            }
        }
        m6.m(v40.c(i2, "startAnimatingNode: Unsupported animation type [", "]: ", string));
    }

    public final void s(int i, id0 id0Var) {
        hd0 hd0Var = this.b.get(i);
        if (hd0Var == null || !(hd0Var instanceof elg)) {
            m6.m(bg.d(i, "startListeningToAnimatedNodeValue: Animated node [", "] does not exist, or is not a 'value' node"));
        } else {
            ((elg) hd0Var).g = id0Var;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x009c, code lost:
    
        if (r4 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009e, code lost:
    
        r12.a.emitDeviceEvent("onNativeAnimatedModuleAnimationFinished", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(int r13) {
        /*
            r12 = this;
            android.util.SparseArray<td0> r0 = r12.c
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        L8:
            r4 = 0
            if (r3 >= r1) goto L9c
            java.lang.Object r5 = r0.valueAt(r3)
            td0 r5 = (defpackage.td0) r5
            int r6 = r5.d
            if (r6 != r13) goto L98
            com.facebook.react.bridge.Callback r13 = r5.c
            java.lang.String r1 = "offset"
            java.lang.String r6 = "value"
            java.lang.String r7 = "finished"
            java.lang.String r8 = "Required value was null."
            if (r13 == 0) goto L5a
            com.facebook.react.bridge.WritableMap r13 = com.facebook.react.bridge.Arguments.createMap()
            r13.getClass()
            com.facebook.react.bridge.ReadableMapBuilder r9 = new com.facebook.react.bridge.ReadableMapBuilder
            r9.<init>(r13)
            r9.put(r7, r2)
            elg r2 = r5.b
            if (r2 == 0) goto L56
            double r10 = r2.e
            r9.put(r6, r10)
            elg r2 = r5.b
            if (r2 == 0) goto L52
            double r6 = r2.f
            r9.put(r1, r6)
            com.facebook.react.bridge.Callback r1 = r5.c
            if (r1 == 0) goto L4e
            java.lang.Object[] r13 = new java.lang.Object[]{r13}
            r1.invoke(r13)
            goto L8c
        L4e:
            defpackage.r6.g(r8)
            return
        L52:
            defpackage.r6.g(r8)
            return
        L56:
            defpackage.r6.g(r8)
            return
        L5a:
            com.facebook.react.bridge.WritableMap r13 = com.facebook.react.bridge.Arguments.createMap()
            r13.getClass()
            com.facebook.react.bridge.ReadableMapBuilder r4 = new com.facebook.react.bridge.ReadableMapBuilder
            r4.<init>(r13)
            java.lang.String r9 = "animationId"
            int r10 = r5.d
            r4.put(r9, r10)
            r4.put(r7, r2)
            elg r2 = r5.b
            if (r2 == 0) goto L94
            double r9 = r2.e
            r4.put(r6, r9)
            elg r2 = r5.b
            if (r2 == 0) goto L90
            double r5 = r2.f
            r4.put(r1, r5)
            com.facebook.react.bridge.WritableArray r4 = com.facebook.react.bridge.Arguments.createArray()
            r4.getClass()
            r4.pushMap(r13)
        L8c:
            r0.removeAt(r3)
            goto L9c
        L90:
            defpackage.r6.g(r8)
            return
        L94:
            defpackage.r6.g(r8)
            return
        L98:
            int r3 = r3 + 1
            goto L8
        L9c:
            if (r4 == 0) goto La5
            java.lang.String r13 = "onNativeAnimatedModuleAnimationFinished"
            com.facebook.react.bridge.ReactApplicationContext r12 = r12.a
            r12.emitDeviceEvent(r13, r4)
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d9a.t(int):void");
    }

    public final void u(hd0 hd0Var) {
        WritableArray writableArrayCreateArray = null;
        int i = 0;
        while (true) {
            SparseArray<td0> sparseArray = this.c;
            if (i >= sparseArray.size()) {
                if (writableArrayCreateArray != null) {
                    this.a.emitDeviceEvent("onNativeAnimatedModuleAnimationFinished", writableArrayCreateArray);
                    return;
                }
                return;
            }
            td0 td0VarValueAt = sparseArray.valueAt(i);
            if (wl7.b(hd0Var, td0VarValueAt.b)) {
                elg elgVar = td0VarValueAt.b;
                if (elgVar == null) {
                    r6.g("Required value was null.");
                    return;
                }
                if (td0VarValueAt.c != null) {
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    writableMapCreateMap.getClass();
                    ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
                    readableMapBuilder.put("finished", false);
                    readableMapBuilder.put("value", elgVar.e);
                    readableMapBuilder.put("offset", elgVar.f);
                    Callback callback = td0VarValueAt.c;
                    if (callback != null) {
                        callback.invoke(writableMapCreateMap);
                    }
                } else {
                    WritableMap writableMapCreateMap2 = Arguments.createMap();
                    writableMapCreateMap2.getClass();
                    ReadableMapBuilder readableMapBuilder2 = new ReadableMapBuilder(writableMapCreateMap2);
                    readableMapBuilder2.put("animationId", td0VarValueAt.d);
                    readableMapBuilder2.put("finished", false);
                    readableMapBuilder2.put("value", elgVar.e);
                    readableMapBuilder2.put("offset", elgVar.f);
                    if (writableArrayCreateArray == null) {
                        writableArrayCreateArray = Arguments.createArray();
                        writableArrayCreateArray.getClass();
                    }
                    writableArrayCreateArray.pushMap(writableMapCreateMap2);
                }
                sparseArray.removeAt(i);
                i--;
            }
            i++;
        }
    }

    public final void v(int i) {
        hd0 hd0Var = this.b.get(i);
        if (hd0Var == null || !(hd0Var instanceof elg)) {
            m6.m(bg.d(i, "startListeningToAnimatedNodeValue: Animated node [", "] does not exist, or is not a 'value' node"));
        } else {
            ((elg) hd0Var).g = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w(int i, ReadableMap readableMap) {
        hd0 hd0Var = this.b.get(i);
        if (hd0Var == 0) {
            m6.m(bg.d(i, "updateAnimatedNode: Animated node [", "] does not exist"));
        } else if (hd0Var instanceof jd0) {
            u(hd0Var);
            ((jd0) hd0Var).a(readableMap);
            this.d.put(i, hd0Var);
        }
    }

    public final void x(LinkedList linkedList) {
        ArrayList<hd0> arrayList;
        elg elgVar;
        id0 id0Var;
        ArrayList<hd0> arrayList2;
        int i = this.f;
        int i2 = i + 1;
        this.f = i2;
        if (i2 == 0) {
            this.f = i + 2;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        Iterator it = linkedList.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            hd0 hd0Var = (hd0) it.next();
            int i4 = hd0Var.c;
            int i5 = this.f;
            if (i4 != i5) {
                hd0Var.c = i5;
                i3++;
                arrayDeque.add(hd0Var);
            }
        }
        while (!arrayDeque.isEmpty()) {
            hd0 hd0Var2 = (hd0) arrayDeque.poll();
            if (hd0Var2 != null && (arrayList2 = hd0Var2.a) != null) {
                for (hd0 hd0Var3 : arrayList2) {
                    hd0Var3.b++;
                    int i6 = hd0Var3.c;
                    int i7 = this.f;
                    if (i6 != i7) {
                        hd0Var3.c = i7;
                        i3++;
                        arrayDeque.add(hd0Var3);
                    }
                }
            }
        }
        int i8 = this.f;
        int i9 = i8 + 1;
        this.f = i9;
        if (i9 == 0) {
            this.f = i8 + 2;
        }
        Iterator it2 = linkedList.iterator();
        int i10 = 0;
        while (it2.hasNext()) {
            hd0 hd0Var4 = (hd0) it2.next();
            if (hd0Var4.b == 0) {
                int i11 = hd0Var4.c;
                int i12 = this.f;
                if (i11 != i12) {
                    hd0Var4.c = i12;
                    i10++;
                    arrayDeque.add(hd0Var4);
                }
            }
        }
        int i13 = 0;
        while (!arrayDeque.isEmpty()) {
            hd0 hd0Var5 = (hd0) arrayDeque.poll();
            if (hd0Var5 != null) {
                try {
                    hd0Var5.e();
                } catch (JSApplicationCausedNativeException e) {
                    s55.g("NativeAnimatedNodesManager", "Native animation workaround, frame lost as result of race condition", e);
                }
            }
            if (hd0Var5 instanceof r4c) {
                ((r4c) hd0Var5).f();
            }
            if ((hd0Var5 instanceof elg) && (id0Var = (elgVar = (elg) hd0Var5).g) != null) {
                double dG = elgVar.g();
                double d = elgVar.f;
                id0Var.a(dG - d, d);
            }
            if (hd0Var5 != null && (arrayList = hd0Var5.a) != null) {
                for (hd0 hd0Var6 : arrayList) {
                    int i14 = hd0Var6.b - 1;
                    hd0Var6.b = i14;
                    int i15 = hd0Var6.c;
                    int i16 = this.f;
                    if (i15 != i16 && i14 == 0) {
                        hd0Var6.c = i16;
                        i10++;
                        arrayDeque.add(hd0Var6);
                    } else if (i15 == i16) {
                        i13++;
                    }
                }
            }
        }
        if (i3 == i10) {
            this.j = false;
            return;
        }
        if (this.j) {
            return;
        }
        this.j = true;
        s55.f("NativeAnimatedNodesManager", "Detected animation cycle or disconnected graph. ");
        Iterator it3 = linkedList.iterator();
        while (it3.hasNext()) {
            hd0 hd0Var7 = (hd0) it3.next();
            ArrayList arrayList3 = hd0Var7.a;
            String strW0 = arrayList3 != null ? z92.W0(arrayList3, " ", null, null, null, 62) : null;
            s55.f("NativeAnimatedNodesManager", hd0Var7.d().concat((strW0 == null || zve.U(strW0)) ? "" : " children: ".concat(strW0)));
        }
        StringBuilder sbH = w40.h(i3, "Looks like animated nodes graph has ", i13 > 0 ? bg.d(i13, "cycles (", ")") : "disconnected regions", ", there are ", " but toposort visited only ");
        sbH.append(i10);
        IllegalStateException illegalStateException = new IllegalStateException(sbH.toString());
        boolean z = this.h;
        if (z && i13 == 0) {
            ReactSoftExceptionLogger.logSoftException("NativeAnimatedNodesManager", new ReactNoCrashSoftException(illegalStateException));
        } else {
            if (!z) {
                throw illegalStateException;
            }
            ReactSoftExceptionLogger.logSoftException("NativeAnimatedNodesManager", new ReactNoCrashSoftException(illegalStateException));
        }
    }
}
