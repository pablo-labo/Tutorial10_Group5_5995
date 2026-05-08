package defpackage;

import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.UIManager;
import defpackage.hb9;
import defpackage.irf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class r4c extends hd0 {
    public final d9a e;
    public final LinkedHashMap g;
    public UIManager i;
    public int f = -1;
    public final JavaOnlyMap h = new JavaOnlyMap();

    public r4c(ReadableMap readableMap, d9a d9aVar) {
        this.e = d9aVar;
        ReadableMap map = readableMap.getMap("props");
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = map != null ? map.keySetIterator() : null;
        this.g = new LinkedHashMap();
        while (readableMapKeySetIteratorKeySetIterator != null && readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            this.g.put(strNextKey, Integer.valueOf(map.getInt(strNextKey)));
        }
    }

    @Override // defpackage.hd0
    public final String d() {
        StringBuilder sbF = uz.f("PropsAnimatedNode[", this.d, "] connectedViewTag: ", this.f, " propNodeMapping: ");
        sbF.append(this.g);
        sbF.append(" propMap: ");
        sbF.append(this.h);
        return sbF.toString();
    }

    public final void f() {
        double dG;
        if (this.f == -1) {
            return;
        }
        Iterator it = this.g.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            JavaOnlyMap javaOnlyMap = this.h;
            if (!zHasNext) {
                UIManager uIManager = this.i;
                if (uIManager != null) {
                    uIManager.synchronouslyUpdateViewOnUIThread(this.f, javaOnlyMap);
                    return;
                }
                return;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            hd0 hd0VarJ = this.e.j(((Number) entry.getValue()).intValue());
            if (hd0VarJ == null) {
                l5.q("Mapped property node does not exist");
                return;
            }
            if (hd0VarJ instanceof jwe) {
                jwe jweVar = (jwe) hd0VarJ;
                javaOnlyMap.getClass();
                Object it2 = ((ib9) jweVar.f.entrySet()).iterator();
                while (((hb9.d) it2).hasNext()) {
                    Map.Entry entry2 = (Map.Entry) ((hb9.b) it2).next();
                    String str2 = (String) entry2.getKey();
                    hd0 hd0VarJ2 = jweVar.e.j(((Number) entry2.getValue()).intValue());
                    if (hd0VarJ2 == null) {
                        l5.q("Mapped style node does not exist");
                        return;
                    }
                    if (hd0VarJ2 instanceof irf) {
                        irf irfVar = (irf) hd0VarJ2;
                        List<irf.c> list = irfVar.f;
                        int size = list.size();
                        ArrayList arrayList = new ArrayList(size);
                        for (int i = 0; i < size; i++) {
                            irf.c cVar = list.get(i);
                            if (cVar instanceof irf.a) {
                                hd0 hd0VarJ3 = irfVar.e.j(((irf.a) cVar).b);
                                if (hd0VarJ3 == null) {
                                    l5.q("Mapped style node does not exist");
                                    return;
                                } else {
                                    if (!(hd0VarJ3 instanceof elg)) {
                                        l5.q(m6.f(hd0VarJ3.getClass(), "Unsupported type of node used as a transform child node "));
                                        return;
                                    }
                                    dG = ((elg) hd0VarJ3).g();
                                }
                            } else {
                                cVar.getClass();
                                dG = ((irf.b) cVar).b;
                            }
                            arrayList.add(JavaOnlyMap.INSTANCE.of(cVar.a, Double.valueOf(dG)));
                        }
                        javaOnlyMap.putArray("transform", JavaOnlyArray.INSTANCE.from(arrayList));
                    } else if (hd0VarJ2 instanceof elg) {
                        elg elgVar = (elg) hd0VarJ2;
                        Object objF = elgVar.f();
                        if (objF instanceof Integer) {
                            javaOnlyMap.putInt(str2, ((Number) objF).intValue());
                        } else if (objF instanceof String) {
                            javaOnlyMap.putString(str2, (String) objF);
                        } else {
                            javaOnlyMap.putDouble(str2, elgVar.g());
                        }
                    } else if (hd0VarJ2 instanceof ea2) {
                        javaOnlyMap.putInt(str2, ((ea2) hd0VarJ2).f());
                    } else {
                        if (!(hd0VarJ2 instanceof fna)) {
                            l5.q(m6.f(hd0VarJ2.getClass(), "Unsupported type of node used in property node "));
                            return;
                        }
                        ((fna) hd0VarJ2).f(str2, javaOnlyMap);
                    }
                }
            } else if (hd0VarJ instanceof elg) {
                elg elgVar2 = (elg) hd0VarJ;
                Object objF2 = elgVar2.f();
                if (objF2 instanceof Integer) {
                    javaOnlyMap.putInt(str, ((Number) objF2).intValue());
                } else if (objF2 instanceof String) {
                    javaOnlyMap.putString(str, (String) objF2);
                } else {
                    javaOnlyMap.putDouble(str, elgVar2.g());
                }
            } else if (hd0VarJ instanceof ea2) {
                javaOnlyMap.putInt(str, ((ea2) hd0VarJ).f());
            } else {
                if (!(hd0VarJ instanceof fna)) {
                    l5.q(m6.f(hd0VarJ.getClass(), "Unsupported type of node used in property node "));
                    return;
                }
                ((fna) hd0VarJ).f(str, javaOnlyMap);
            }
        }
    }
}
