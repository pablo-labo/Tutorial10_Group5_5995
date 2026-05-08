package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import defpackage.epg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class esf implements Cloneable {
    public static final int[] j0 = {2, 1, 3, 4};
    public static final a k0 = new a();
    public static final ThreadLocal<ht0<Animator, b>> l0 = new ThreadLocal<>();
    public ArrayList<usf> Z;
    public ArrayList<usf> a0;
    public c h0;
    public final String a = getClass().getName();
    public long b = -1;
    public long c = -1;
    public TimeInterpolator d = null;
    public final ArrayList<Integer> e = new ArrayList<>();
    public final ArrayList<View> f = new ArrayList<>();
    public vsf V = new vsf();
    public vsf W = new vsf();
    public qsf X = null;
    public final int[] Y = j0;
    public final ArrayList<Animator> b0 = new ArrayList<>();
    public int c0 = 0;
    public boolean d0 = false;
    public boolean e0 = false;
    public ArrayList<d> f0 = null;
    public ArrayList<Animator> g0 = new ArrayList<>();
    public v1 i0 = k0;

    public class a extends v1 {
        @Override // defpackage.v1
        public final Path Z(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    public static class b {
        public View a;
        public String b;
        public usf c;
        public jzg d;
        public esf e;
    }

    public static abstract class c {
    }

    public interface d {
        void a();

        void b();

        void c();

        void d(esf esfVar);

        void e(esf esfVar);
    }

    public static void e(vsf vsfVar, View view, usf usfVar) {
        ht0<View, usf> ht0Var = vsfVar.a;
        ht0<String, View> ht0Var2 = vsfVar.d;
        SparseArray<View> sparseArray = vsfVar.b;
        r59<View> r59Var = vsfVar.c;
        ht0Var.put(view, usfVar);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap<View, prg> weakHashMap = epg.a;
        String strF = epg.d.f(view);
        if (strF != null) {
            if (ht0Var2.containsKey(strF)) {
                ht0Var2.put(strF, null);
            } else {
                ht0Var2.put(strF, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (r59Var.e(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    r59Var.h(view, itemIdAtPosition);
                    return;
                }
                View viewD = r59Var.d(itemIdAtPosition);
                if (viewD != null) {
                    viewD.setHasTransientState(false);
                    r59Var.h(null, itemIdAtPosition);
                }
            }
        }
    }

    public static ht0<Animator, b> q() {
        ThreadLocal<ht0<Animator, b>> threadLocal = l0;
        ht0<Animator, b> ht0Var = threadLocal.get();
        if (ht0Var != null) {
            return ht0Var;
        }
        ht0<Animator, b> ht0Var2 = new ht0<>();
        threadLocal.set(ht0Var2);
        return ht0Var2;
    }

    public void A() {
        H();
        ht0<Animator, b> ht0VarQ = q();
        for (Animator animator : this.g0) {
            if (ht0VarQ.containsKey(animator)) {
                H();
                if (animator != null) {
                    animator.addListener(new asf(this, ht0VarQ));
                    long j = this.c;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.b;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new bsf(this));
                    animator.start();
                }
            }
        }
        this.g0.clear();
        o();
    }

    public void B(long j) {
        this.c = j;
    }

    public void C(c cVar) {
        this.h0 = cVar;
    }

    public void D(TimeInterpolator timeInterpolator) {
        this.d = timeInterpolator;
    }

    public void E(v1 v1Var) {
        if (v1Var == null) {
            this.i0 = k0;
        } else {
            this.i0 = v1Var;
        }
    }

    public void F() {
    }

    public void G(long j) {
        this.b = j;
    }

    public final void H() {
        if (this.c0 == 0) {
            ArrayList<d> arrayList = this.f0;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f0.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((d) arrayList2.get(i)).e(this);
                }
            }
            this.e0 = false;
        }
        this.c0++;
    }

    public String I(String str) {
        StringBuilder sbG = q6.g(str);
        sbG.append(getClass().getSimpleName());
        sbG.append("@");
        sbG.append(Integer.toHexString(hashCode()));
        sbG.append(": ");
        String string = sbG.toString();
        if (this.c != -1) {
            string = r6.d(this.c, ") ", h5.g(string, "dur("));
        }
        if (this.b != -1) {
            string = r6.d(this.b, ") ", h5.g(string, "dly("));
        }
        if (this.d != null) {
            StringBuilder sbG2 = h5.g(string, "interp(");
            sbG2.append(this.d);
            sbG2.append(") ");
            string = sbG2.toString();
        }
        ArrayList<Integer> arrayList = this.e;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.f;
        if (size <= 0 && arrayList2.size() <= 0) {
            return string;
        }
        String strConcat = string.concat("tgts(");
        if (arrayList.size() > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (i > 0) {
                    strConcat = strConcat.concat(", ");
                }
                StringBuilder sbG3 = q6.g(strConcat);
                sbG3.append(arrayList.get(i));
                strConcat = sbG3.toString();
            }
        }
        if (arrayList2.size() > 0) {
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                if (i2 > 0) {
                    strConcat = strConcat.concat(", ");
                }
                StringBuilder sbG4 = q6.g(strConcat);
                sbG4.append(arrayList2.get(i2));
                strConcat = sbG4.toString();
            }
        }
        return strConcat.concat(")");
    }

    public void c(d dVar) {
        if (this.f0 == null) {
            this.f0 = new ArrayList<>();
        }
        this.f0.add(dVar);
    }

    public void cancel() {
        ArrayList<Animator> arrayList = this.b0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).cancel();
        }
        ArrayList<d> arrayList2 = this.f0;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            return;
        }
        ArrayList arrayList3 = (ArrayList) this.f0.clone();
        int size2 = arrayList3.size();
        for (int i = 0; i < size2; i++) {
            ((d) arrayList3.get(i)).b();
        }
    }

    public void d(View view) {
        this.f.add(view);
    }

    public abstract void f(usf usfVar);

    public final void g(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            usf usfVar = new usf(view);
            if (z) {
                i(usfVar);
            } else {
                f(usfVar);
            }
            usfVar.c.add(this);
            h(usfVar);
            if (z) {
                e(this.V, view, usfVar);
            } else {
                e(this.W, view, usfVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), z);
            }
        }
    }

    public void h(usf usfVar) {
    }

    public abstract void i(usf usfVar);

    public final void j(ViewGroup viewGroup, boolean z) {
        k(z);
        ArrayList<Integer> arrayList = this.e;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.f;
        if (size <= 0 && arrayList2.size() <= 0) {
            g(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View viewFindViewById = viewGroup.findViewById(arrayList.get(i).intValue());
            if (viewFindViewById != null) {
                usf usfVar = new usf(viewFindViewById);
                if (z) {
                    i(usfVar);
                } else {
                    f(usfVar);
                }
                usfVar.c.add(this);
                h(usfVar);
                if (z) {
                    e(this.V, viewFindViewById, usfVar);
                } else {
                    e(this.W, viewFindViewById, usfVar);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = arrayList2.get(i2);
            usf usfVar2 = new usf(view);
            if (z) {
                i(usfVar2);
            } else {
                f(usfVar2);
            }
            usfVar2.c.add(this);
            h(usfVar2);
            if (z) {
                e(this.V, view, usfVar2);
            } else {
                e(this.W, view, usfVar2);
            }
        }
    }

    public final void k(boolean z) {
        if (z) {
            this.V.a.clear();
            this.V.b.clear();
            this.V.c.c();
        } else {
            this.W.a.clear();
            this.W.b.clear();
            this.W.c.c();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public esf clone() {
        try {
            esf esfVar = (esf) super.clone();
            esfVar.g0 = new ArrayList<>();
            esfVar.V = new vsf();
            esfVar.W = new vsf();
            esfVar.Z = null;
            esfVar.a0 = null;
            return esfVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator m(ViewGroup viewGroup, usf usfVar, usf usfVar2) {
        return null;
    }

    public void n(ViewGroup viewGroup, vsf vsfVar, vsf vsfVar2, ArrayList<usf> arrayList, ArrayList<usf> arrayList2) {
        Animator animatorM;
        int i;
        int i2;
        View view;
        usf usfVar;
        Animator animator;
        usf usfVar2;
        ht0<Animator, b> ht0VarQ = q();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            usf usfVar3 = arrayList.get(i3);
            usf usfVar4 = arrayList2.get(i3);
            if (usfVar3 != null && !usfVar3.c.contains(this)) {
                usfVar3 = null;
            }
            if (usfVar4 != null && !usfVar4.c.contains(this)) {
                usfVar4 = null;
            }
            if (!(usfVar3 == null && usfVar4 == null) && ((usfVar3 == null || usfVar4 == null || u(usfVar3, usfVar4)) && (animatorM = m(viewGroup, usfVar3, usfVar4)) != null)) {
                String str = this.a;
                if (usfVar4 != null) {
                    view = usfVar4.b;
                    String[] strArrR = r();
                    if (strArrR != null && strArrR.length > 0) {
                        usfVar2 = new usf(view);
                        usf usfVar5 = vsfVar2.a.get(view);
                        i = size;
                        if (usfVar5 != null) {
                            int i4 = 0;
                            while (i4 < strArrR.length) {
                                String str2 = strArrR[i4];
                                usfVar2.a.put(str2, usfVar5.a.get(str2));
                                i4++;
                                i3 = i3;
                                usfVar5 = usfVar5;
                            }
                        }
                        i2 = i3;
                        int i5 = ht0VarQ.c;
                        int i6 = 0;
                        while (true) {
                            if (i6 >= i5) {
                                animator = animatorM;
                                break;
                            }
                            b bVar = ht0VarQ.get(ht0VarQ.h(i6));
                            if (bVar.c != null && bVar.a == view && bVar.b.equals(str) && bVar.c.equals(usfVar2)) {
                                animator = null;
                                break;
                            }
                            i6++;
                        }
                    } else {
                        i = size;
                        i2 = i3;
                        animator = animatorM;
                        usfVar2 = null;
                    }
                    animatorM = animator;
                    usfVar = usfVar2;
                } else {
                    i = size;
                    i2 = i3;
                    view = usfVar3.b;
                    usfVar = null;
                }
                if (animatorM != null) {
                    lsg lsgVar = jsg.a;
                    jzg jzgVar = new jzg(viewGroup);
                    b bVar2 = new b();
                    bVar2.a = view;
                    bVar2.b = str;
                    bVar2.c = usfVar;
                    bVar2.d = jzgVar;
                    bVar2.e = this;
                    ht0VarQ.put(animatorM, bVar2);
                    this.g0.add(animatorM);
                }
            } else {
                i = size;
                i2 = i3;
            }
            i3 = i2 + 1;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i7 = 0; i7 < sparseIntArray.size(); i7++) {
                Animator animator2 = this.g0.get(sparseIntArray.keyAt(i7));
                animator2.setStartDelay(animator2.getStartDelay() + (((long) sparseIntArray.valueAt(i7)) - Long.MAX_VALUE));
            }
        }
    }

    public final void o() {
        int i = this.c0 - 1;
        this.c0 = i;
        if (i == 0) {
            ArrayList<d> arrayList = this.f0;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f0.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((d) arrayList2.get(i2)).d(this);
                }
            }
            for (int i3 = 0; i3 < this.V.c.j(); i3++) {
                View viewK = this.V.c.k(i3);
                if (viewK != null) {
                    WeakHashMap<View, prg> weakHashMap = epg.a;
                    viewK.setHasTransientState(false);
                }
            }
            for (int i4 = 0; i4 < this.W.c.j(); i4++) {
                View viewK2 = this.W.c.k(i4);
                if (viewK2 != null) {
                    WeakHashMap<View, prg> weakHashMap2 = epg.a;
                    viewK2.setHasTransientState(false);
                }
            }
            this.e0 = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002c, code lost:
    
        if (r2 < 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002e, code lost:
    
        if (r6 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0030, code lost:
    
        r4 = r4.a0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0033, code lost:
    
        r4 = r4.Z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:
    
        return r4.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.usf p(android.view.View r5, boolean r6) {
        /*
            r4 = this;
            qsf r0 = r4.X
            if (r0 == 0) goto L9
            usf r4 = r0.p(r5, r6)
            return r4
        L9:
            if (r6 == 0) goto Le
            java.util.ArrayList<usf> r0 = r4.Z
            goto L10
        Le:
            java.util.ArrayList<usf> r0 = r4.a0
        L10:
            if (r0 != 0) goto L13
            goto L3c
        L13:
            int r1 = r0.size()
            r2 = 0
        L18:
            if (r2 >= r1) goto L2b
            java.lang.Object r3 = r0.get(r2)
            usf r3 = (defpackage.usf) r3
            if (r3 != 0) goto L23
            goto L3c
        L23:
            android.view.View r3 = r3.b
            if (r3 != r5) goto L28
            goto L2c
        L28:
            int r2 = r2 + 1
            goto L18
        L2b:
            r2 = -1
        L2c:
            if (r2 < 0) goto L3c
            if (r6 == 0) goto L33
            java.util.ArrayList<usf> r4 = r4.a0
            goto L35
        L33:
            java.util.ArrayList<usf> r4 = r4.Z
        L35:
            java.lang.Object r4 = r4.get(r2)
            usf r4 = (defpackage.usf) r4
            return r4
        L3c:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.esf.p(android.view.View, boolean):usf");
    }

    public String[] r() {
        return null;
    }

    public final usf t(View view, boolean z) {
        qsf qsfVar = this.X;
        if (qsfVar != null) {
            return qsfVar.t(view, z);
        }
        return (z ? this.V : this.W).a.get(view);
    }

    public final String toString() {
        return I("");
    }

    public boolean u(usf usfVar, usf usfVar2) {
        if (usfVar != null) {
            HashMap map = usfVar.a;
            if (usfVar2 != null) {
                HashMap map2 = usfVar2.a;
                String[] strArrR = r();
                if (strArrR != null) {
                    for (String str : strArrR) {
                        Object obj = map.get(str);
                        Object obj2 = map2.get(str);
                        if ((obj == null && obj2 == null) ? false : (obj == null || obj2 == null) ? true : !obj.equals(obj2)) {
                            return true;
                        }
                    }
                } else {
                    for (String str2 : map.keySet()) {
                        Object obj3 = map.get(str2);
                        Object obj4 = map2.get(str2);
                        if ((obj3 == null && obj4 == null) ? false : (obj3 == null || obj4 == null) ? true : !obj3.equals(obj4)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean v(View view) {
        int id = view.getId();
        ArrayList<Integer> arrayList = this.e;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.f;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public void w(View view) {
        if (this.e0) {
            return;
        }
        ArrayList<Animator> arrayList = this.b0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).pause();
        }
        ArrayList<d> arrayList2 = this.f0;
        if (arrayList2 != null && arrayList2.size() > 0) {
            ArrayList arrayList3 = (ArrayList) this.f0.clone();
            int size2 = arrayList3.size();
            for (int i = 0; i < size2; i++) {
                ((d) arrayList3.get(i)).a();
            }
        }
        this.d0 = true;
    }

    public void x(d dVar) {
        ArrayList<d> arrayList = this.f0;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(dVar);
        if (this.f0.size() == 0) {
            this.f0 = null;
        }
    }

    public void y(View view) {
        this.f.remove(view);
    }

    public void z(View view) {
        if (this.d0) {
            if (!this.e0) {
                ArrayList<Animator> arrayList = this.b0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    arrayList.get(size).resume();
                }
                ArrayList<d> arrayList2 = this.f0;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    ArrayList arrayList3 = (ArrayList) this.f0.clone();
                    int size2 = arrayList3.size();
                    for (int i = 0; i < size2; i++) {
                        ((d) arrayList3.get(i)).c();
                    }
                }
            }
            this.d0 = false;
        }
    }
}
