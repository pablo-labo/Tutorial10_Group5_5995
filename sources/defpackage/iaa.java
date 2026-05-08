package defpackage;

import android.util.SparseBooleanArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import e4g.k;
import e4g.s;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class iaa {
    public static final /* synthetic */ int d = 0;
    public final e4g a;
    public final ybe b;
    public final SparseBooleanArray c = new SparseBooleanArray();

    public static class a {
        public final koc a;
        public final int b;

        public a(koc kocVar, int i) {
            this.a = kocVar;
            this.b = i;
        }
    }

    public iaa(e4g e4gVar, ybe ybeVar) {
        this.a = e4gVar;
        this.b = ybeVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean f(noc nocVar) {
        boolean z;
        ReadableType type;
        if (nocVar == null) {
            return true;
        }
        if (nocVar.a.hasKey("collapsable")) {
            if (!(nocVar.a.isNull("collapsable") ? true : nocVar.a.getBoolean("collapsable"))) {
                return false;
            }
        }
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = nocVar.a.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            ReadableMap readableMap = nocVar.a;
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            int[] iArr = trg.a;
            readableMap.getClass();
            strNextKey.getClass();
            if (trg.c.contains(strNextKey)) {
                z = true;
            } else if (!"pointerEvents".equals(strNextKey)) {
                switch (strNextKey.hashCode()) {
                    case -1989576717:
                        if (!strNextKey.equals("borderRightColor") || readableMap.getType("borderRightColor") != ReadableType.Number || readableMap.getInt("borderRightColor") != 0) {
                            z = false;
                        }
                        z = true;
                        break;
                    case -1971292586:
                        if (!strNextKey.equals("borderRightWidth")) {
                            z = false;
                        } else {
                            if (!readableMap.isNull("borderRightWidth") && readableMap.getDouble("borderRightWidth") != 0.0d) {
                                z = false;
                            }
                            z = true;
                        }
                        break;
                    case -1470826662:
                        if (!strNextKey.equals("borderTopColor") || readableMap.getType("borderTopColor") != ReadableType.Number || readableMap.getInt("borderTopColor") != 0) {
                            z = false;
                        }
                        z = true;
                        break;
                    case -1452542531:
                        if (!strNextKey.equals("borderTopWidth")) {
                            z = false;
                        } else {
                            if (!readableMap.isNull("borderTopWidth") && readableMap.getDouble("borderTopWidth") != 0.0d) {
                                z = false;
                            }
                            z = true;
                        }
                        break;
                    case -1308858324:
                        if (!strNextKey.equals("borderBottomColor") || readableMap.getType("borderBottomColor") != ReadableType.Number || readableMap.getInt("borderBottomColor") != 0) {
                            z = false;
                        }
                        z = true;
                        break;
                    case -1290574193:
                        if (!strNextKey.equals("borderBottomWidth")) {
                            z = false;
                        } else {
                            if (!readableMap.isNull("borderBottomWidth") && readableMap.getDouble("borderBottomWidth") != 0.0d) {
                                z = false;
                            }
                            z = true;
                        }
                        break;
                    case -1267206133:
                        if (!strNextKey.equals("opacity")) {
                            z = false;
                        } else {
                            if (!readableMap.isNull("opacity") && readableMap.getDouble("opacity") != 1.0d) {
                                z = false;
                            }
                            z = true;
                        }
                        break;
                    case -242276144:
                        if (!strNextKey.equals("borderLeftColor") || readableMap.getType("borderLeftColor") != ReadableType.Number || readableMap.getInt("borderLeftColor") != 0) {
                            z = false;
                        }
                        z = true;
                        break;
                    case -223992013:
                        if (!strNextKey.equals("borderLeftWidth")) {
                            z = false;
                        } else {
                            if (!readableMap.isNull("borderLeftWidth") && readableMap.getDouble("borderLeftWidth") != 0.0d) {
                                z = false;
                            }
                            z = true;
                        }
                        break;
                    case 306963138:
                        if (!strNextKey.equals("borderBlockStartColor") || readableMap.getType("borderBlockStartColor") != ReadableType.Number || readableMap.getInt("borderBlockStartColor") != 0) {
                            z = false;
                        }
                        z = true;
                        break;
                    case 529642498:
                        if (!strNextKey.equals("overflow")) {
                            z = false;
                        } else {
                            if (!readableMap.isNull("overflow") && !"visible".equals(readableMap.getString("overflow"))) {
                                z = false;
                            }
                            z = true;
                        }
                        break;
                    case 684610594:
                        if (!strNextKey.equals("borderBlockColor") || readableMap.getType("borderBlockColor") != ReadableType.Number || readableMap.getInt("borderBlockColor") != 0) {
                            z = false;
                        }
                        z = true;
                        break;
                    case 741115130:
                        if (!strNextKey.equals("borderWidth")) {
                            z = false;
                        } else {
                            if (!readableMap.isNull("borderWidth") && readableMap.getDouble("borderWidth") != 0.0d) {
                                z = false;
                            }
                            z = true;
                        }
                        break;
                    case 762983977:
                        if (!strNextKey.equals("borderBlockEndColor") || readableMap.getType("borderBlockEndColor") != ReadableType.Number || readableMap.getInt("borderBlockEndColor") != 0) {
                            z = false;
                        }
                        z = true;
                        break;
                    case 1349188574:
                        if (!strNextKey.equals("borderRadius")) {
                            z = false;
                        } else if (readableMap.hasKey("backgroundColor") && (((type = readableMap.getType("backgroundColor")) == ReadableType.Number && readableMap.getInt("backgroundColor") != 0) || type != ReadableType.Null)) {
                            z = false;
                        } else {
                            if (readableMap.hasKey("borderWidth") && !readableMap.isNull("borderWidth") && readableMap.getDouble("borderWidth") != 0.0d) {
                                z = false;
                            }
                            z = true;
                        }
                        break;
                    default:
                        z = false;
                        break;
                }
            } else {
                String string = readableMap.getString(strNextKey);
                if (!"auto".equals(string) && !"box-none".equals(string)) {
                    z = false;
                }
                z = true;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final void a(koc kocVar, koc kocVar2, int i) {
        hh1.l(kocVar2.L() != t9a.a);
        for (int i2 = 0; i2 < kocVar2.g(); i2++) {
            loc locVarA = kocVar2.a(i2);
            hh1.l(locVarA.a0 == null);
            int i3 = kocVar.i();
            if (locVarA.L() == t9a.c) {
                a(kocVar, locVarA, i);
            } else {
                b(kocVar, locVarA, i);
            }
            i += kocVar.i() - i3;
        }
    }

    public final void b(koc kocVar, koc kocVar2, int i) {
        kocVar.c(kocVar2, i);
        int iB = kocVar.B();
        xog[] xogVarArr = {new xog(kocVar2.B(), i)};
        e4g e4gVar = this.a;
        e4gVar.h.add(e4gVar.new k(iB, null, xogVarArr, null));
        if (kocVar2.L() != t9a.a) {
            a(kocVar, kocVar2, i + 1);
        }
    }

    public final void c(koc kocVar, koc kocVar2, int i) {
        a aVar;
        int iA = kocVar.A(kocVar.a(i));
        t9a t9aVarL = kocVar.L();
        t9a t9aVar = t9a.a;
        if (t9aVarL != t9aVar) {
            while (true) {
                if (kocVar.L() == t9aVar) {
                    aVar = new a(kocVar, iA);
                    break;
                }
                loc parent = kocVar.getParent();
                if (parent == null) {
                    aVar = null;
                    break;
                } else {
                    iA = iA + (kocVar.L() == t9a.b ? 1 : 0) + parent.A(kocVar);
                    kocVar = parent;
                }
            }
            if (aVar == null) {
                return;
            }
            koc kocVar3 = aVar.a;
            iA = aVar.b;
            kocVar = kocVar3;
        }
        if (kocVar2.L() != t9a.c) {
            b(kocVar, kocVar2, iA);
        } else {
            a(kocVar, kocVar2, iA);
        }
    }

    public final void d(koc kocVar) {
        int iB = kocVar.B();
        SparseBooleanArray sparseBooleanArray = this.c;
        if (sparseBooleanArray.get(iB)) {
            return;
        }
        sparseBooleanArray.put(iB, true);
        int iQ = kocVar.q();
        int iL = kocVar.l();
        for (loc parent = kocVar.getParent(); parent != null; parent = parent.W) {
            com.facebook.yoga.a aVar = parent.j0;
            if (parent.L() == t9a.a) {
                break;
            }
            if (!parent.E()) {
                int iRound = Math.round(aVar.k()) + iQ;
                iL = Math.round(aVar.l()) + iL;
                iQ = iRound;
            }
        }
        e(kocVar, iQ, iL);
    }

    public final void e(koc kocVar, int i, int i2) {
        if (kocVar.L() != t9a.c && kocVar.T() != null) {
            int iB = kocVar.B();
            int i3 = kocVar.S().a;
            int iH = kocVar.H();
            int iU = kocVar.u();
            e6h layoutDirection = kocVar.getLayoutDirection();
            e4g e4gVar = this.a;
            e4gVar.h.add(e4gVar.new s(i3, iB, i, i2, iH, iU, layoutDirection));
            return;
        }
        for (int i4 = 0; i4 < kocVar.g(); i4++) {
            loc locVarA = kocVar.a(i4);
            int i5 = locVarA.a;
            SparseBooleanArray sparseBooleanArray = this.c;
            if (!sparseBooleanArray.get(i5)) {
                sparseBooleanArray.put(i5, true);
                e(locVarA, locVarA.c0 + i, locVarA.d0 + i2);
            }
        }
    }

    public final void g(koc kocVar, boolean z) {
        if (kocVar.L() != t9a.a) {
            for (int iG = kocVar.g() - 1; iG >= 0; iG--) {
                g(kocVar.a(iG), z);
            }
        }
        loc locVarT = kocVar.T();
        if (locVarT != null) {
            hh1.n(locVarT.b0);
            int iIndexOf = locVarT.b0.indexOf((loc) kocVar);
            hh1.n(locVarT.b0);
            locVarT.b0.remove(iIndexOf).a0 = null;
            int i = locVarT.a;
            int[] iArr = {iIndexOf};
            int[] iArr2 = z ? new int[]{kocVar.B()} : null;
            e4g e4gVar = this.a;
            e4gVar.h.add(e4gVar.new k(i, iArr, null, iArr2));
        }
    }

    public final void h(koc kocVar, noc nocVar) {
        loc parent = kocVar.getParent();
        if (parent == null) {
            kocVar.t(false);
            return;
        }
        loc locVar = (loc) kocVar;
        ArrayList<loc> arrayList = parent.V;
        int iIndexOf = arrayList == null ? -1 : arrayList.indexOf(locVar);
        parent.v(iIndexOf);
        g(kocVar, false);
        kocVar.t(false);
        this.a.b(kocVar.K(), kocVar.B(), kocVar.n(), nocVar);
        parent.R(kocVar, iIndexOf);
        c(parent, kocVar, iIndexOf);
        for (int i = 0; i < kocVar.g(); i++) {
            c(kocVar, kocVar.a(i), i);
        }
        StringBuilder sb = new StringBuilder("Transitioning LayoutOnlyView - tag: ");
        sb.append(kocVar.B());
        sb.append(" - rootTag: ");
        sb.append(kocVar.M());
        sb.append(" - hasProps: ");
        sb.append(nocVar != null);
        sb.append(" - tagsWithLayout.size: ");
        SparseBooleanArray sparseBooleanArray = this.c;
        sb.append(sparseBooleanArray.size());
        String string = sb.toString();
        s55.a.getClass();
        if (wab.p(4)) {
            wab.t(4, "NativeViewHierarchyOptimizer", string);
        }
        hh1.l(sparseBooleanArray.size() == 0);
        d(kocVar);
        for (int i2 = 0; i2 < kocVar.g(); i2++) {
            d(kocVar.a(i2));
        }
        sparseBooleanArray.clear();
    }
}
