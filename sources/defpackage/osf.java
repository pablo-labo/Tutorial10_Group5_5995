package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.indeed.android.jobsearch.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class osf {
    public static final p11 a = new p11();
    public static final ThreadLocal<WeakReference<ht0<ViewGroup, ArrayList<esf>>>> b = new ThreadLocal<>();
    public static final ArrayList<ViewGroup> c = new ArrayList<>();

    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
        public esf a;
        public ViewGroup b;

        /* JADX INFO: renamed from: osf$a$a, reason: collision with other inner class name */
        public class C0380a extends nsf {
            public final /* synthetic */ ht0 a;

            public C0380a(ht0 ht0Var) {
                this.a = ht0Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // esf.d
            public final void d(esf esfVar) {
                ((ArrayList) this.a.get(a.this.b)).remove(esfVar);
                esfVar.x(this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:100:0x01f9  */
        /* JADX WARN: Removed duplicated region for block: B:107:0x0227  */
        /* JADX WARN: Removed duplicated region for block: B:134:0x01d1 A[EDGE_INSN: B:134:0x01d1->B:90:0x01d1 BREAK  A[LOOP:1: B:19:0x0081->B:89:0x01ca], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00e8  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x01d8  */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean onPreDraw() {
            /*
                Method dump skipped, instruction units count: 667
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: osf.a.onPreDraw():boolean");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            ViewGroup viewGroup = this.b;
            viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
            viewGroup.removeOnAttachStateChangeListener(this);
            osf.c.remove(viewGroup);
            ArrayList<esf> arrayList = osf.b().get(viewGroup);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<esf> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().z(viewGroup);
                }
            }
            this.a.k(true);
        }
    }

    public static void a(ViewGroup viewGroup, esf esfVar) {
        ArrayList<ViewGroup> arrayList = c;
        if (arrayList.contains(viewGroup)) {
            return;
        }
        WeakHashMap<View, prg> weakHashMap = epg.a;
        if (viewGroup.isLaidOut()) {
            arrayList.add(viewGroup);
            if (esfVar == null) {
                esfVar = a;
            }
            esf esfVarClone = esfVar.clone();
            ArrayList<esf> arrayList2 = b().get(viewGroup);
            if (arrayList2 != null && arrayList2.size() > 0) {
                Iterator<esf> it = arrayList2.iterator();
                while (it.hasNext()) {
                    it.next().w(viewGroup);
                }
            }
            if (esfVarClone != null) {
                esfVarClone.j(viewGroup, true);
            }
            if (((pnd) viewGroup.getTag(R.id.transition_current_scene)) != null) {
                throw null;
            }
            viewGroup.setTag(R.id.transition_current_scene, null);
            if (esfVarClone != null) {
                a aVar = new a();
                aVar.a = esfVarClone;
                aVar.b = viewGroup;
                viewGroup.addOnAttachStateChangeListener(aVar);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
            }
        }
    }

    public static ht0<ViewGroup, ArrayList<esf>> b() {
        ht0<ViewGroup, ArrayList<esf>> ht0Var;
        ThreadLocal<WeakReference<ht0<ViewGroup, ArrayList<esf>>>> threadLocal = b;
        WeakReference<ht0<ViewGroup, ArrayList<esf>>> weakReference = threadLocal.get();
        if (weakReference != null && (ht0Var = weakReference.get()) != null) {
            return ht0Var;
        }
        ht0<ViewGroup, ArrayList<esf>> ht0Var2 = new ht0<>();
        threadLocal.set(new WeakReference<>(ht0Var2));
        return ht0Var2;
    }
}
