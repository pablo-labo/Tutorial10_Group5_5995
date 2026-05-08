package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.r;
import com.indeed.android.jobsearch.R;
import defpackage.akb;
import defpackage.epg;
import defpackage.j6g;
import defpackage.l5;
import defpackage.o4;
import defpackage.p6;
import defpackage.prg;
import defpackage.rp2;
import defpackage.tw1;
import defpackage.wl7;
import defpackage.z92;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    public final ViewGroup a;
    public final ArrayList b;
    public final ArrayList c;
    public boolean d;
    public boolean e;

    public static final class a extends b {
        public final m h;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(b.EnumC0035b enumC0035b, b.a aVar, m mVar, tw1 tw1Var) {
            Fragment fragment = mVar.c;
            fragment.getClass();
            super(enumC0035b, aVar, fragment, tw1Var);
            this.h = mVar;
        }

        @Override // androidx.fragment.app.r.b
        public final void b() {
            super.b();
            this.h.k();
        }

        @Override // androidx.fragment.app.r.b
        public final void d() {
            b.a aVar = this.b;
            b.a aVar2 = b.a.b;
            m mVar = this.h;
            if (aVar != aVar2) {
                if (aVar == b.a.c) {
                    Fragment fragment = mVar.c;
                    fragment.getClass();
                    View viewRequireView = fragment.requireView();
                    viewRequireView.getClass();
                    if (FragmentManager.K(2)) {
                        Log.v("FragmentManager", "Clearing focus " + viewRequireView.findFocus() + " on view " + viewRequireView + " for Fragment " + fragment);
                    }
                    viewRequireView.clearFocus();
                    return;
                }
                return;
            }
            Fragment fragment2 = mVar.c;
            fragment2.getClass();
            View viewFindFocus = fragment2.mView.findFocus();
            if (viewFindFocus != null) {
                fragment2.setFocusedView(viewFindFocus);
                if (FragmentManager.K(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragment2);
                }
            }
            View viewRequireView2 = this.c.requireView();
            viewRequireView2.getClass();
            if (viewRequireView2.getParent() == null) {
                mVar.b();
                viewRequireView2.setAlpha(0.0f);
            }
            if (viewRequireView2.getAlpha() == 0.0f && viewRequireView2.getVisibility() == 0) {
                viewRequireView2.setVisibility(4);
            }
            viewRequireView2.setAlpha(fragment2.getPostOnViewCreatedAlpha());
        }
    }

    public static class b {
        public EnumC0035b a;
        public a b;
        public final Fragment c;
        public final ArrayList d;
        public final LinkedHashSet e;
        public boolean f;
        public boolean g;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class a {
            public static final a a;
            public static final a b;
            public static final a c;
            public static final /* synthetic */ a[] d;

            static {
                a aVar = new a("NONE", 0);
                a = aVar;
                a aVar2 = new a("ADDING", 1);
                b = aVar2;
                a aVar3 = new a("REMOVING", 2);
                c = aVar3;
                d = new a[]{aVar, aVar2, aVar3};
            }

            public a() {
                throw null;
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) d.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: renamed from: androidx.fragment.app.r$b$b, reason: collision with other inner class name */
        public static final class EnumC0035b {
            public static final EnumC0035b a;
            public static final EnumC0035b b;
            public static final EnumC0035b c;
            public static final EnumC0035b d;
            public static final /* synthetic */ EnumC0035b[] e;

            static {
                EnumC0035b enumC0035b = new EnumC0035b("REMOVED", 0);
                a = enumC0035b;
                EnumC0035b enumC0035b2 = new EnumC0035b("VISIBLE", 1);
                b = enumC0035b2;
                EnumC0035b enumC0035b3 = new EnumC0035b("GONE", 2);
                c = enumC0035b3;
                EnumC0035b enumC0035b4 = new EnumC0035b("INVISIBLE", 3);
                d = enumC0035b4;
                e = new EnumC0035b[]{enumC0035b, enumC0035b2, enumC0035b3, enumC0035b4};
            }

            public EnumC0035b() {
                throw null;
            }

            public static EnumC0035b valueOf(String str) {
                return (EnumC0035b) Enum.valueOf(EnumC0035b.class, str);
            }

            public static EnumC0035b[] values() {
                return (EnumC0035b[]) e.clone();
            }

            public final void a(View view) {
                view.getClass();
                int iOrdinal = ordinal();
                if (iOrdinal == 0) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        if (FragmentManager.K(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (iOrdinal == 1) {
                    if (FragmentManager.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                    return;
                }
                if (iOrdinal == 2) {
                    if (FragmentManager.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (iOrdinal != 3) {
                    return;
                }
                if (FragmentManager.K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        public b(EnumC0035b enumC0035b, a aVar, Fragment fragment, tw1 tw1Var) {
            fragment.getClass();
            this.a = enumC0035b;
            this.b = aVar;
            this.c = fragment;
            this.d = new ArrayList();
            this.e = new LinkedHashSet();
            tw1Var.a(new rp2(this, 4));
        }

        public final void a() {
            LinkedHashSet linkedHashSet = this.e;
            if (this.f) {
                return;
            }
            this.f = true;
            if (linkedHashSet.isEmpty()) {
                b();
                return;
            }
            for (tw1 tw1Var : z92.D1(linkedHashSet)) {
                synchronized (tw1Var) {
                    try {
                        if (!tw1Var.a) {
                            tw1Var.a = true;
                            tw1Var.c = true;
                            tw1.a aVar = tw1Var.b;
                            if (aVar != null) {
                                try {
                                    aVar.onCancel();
                                } catch (Throwable th) {
                                    synchronized (tw1Var) {
                                        tw1Var.c = false;
                                        tw1Var.notifyAll();
                                        throw th;
                                    }
                                }
                            }
                            synchronized (tw1Var) {
                                tw1Var.c = false;
                                tw1Var.notifyAll();
                            }
                        }
                    } finally {
                    }
                }
            }
        }

        public void b() {
            if (this.g) {
                return;
            }
            if (FragmentManager.K(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.g = true;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void c(EnumC0035b enumC0035b, a aVar) {
            int iOrdinal = aVar.ordinal();
            Fragment fragment = this.c;
            EnumC0035b enumC0035b2 = EnumC0035b.a;
            if (iOrdinal == 0) {
                if (this.a != enumC0035b2) {
                    if (FragmentManager.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = " + this.a + " -> " + enumC0035b + JwtParser.SEPARATOR_CHAR);
                    }
                    this.a = enumC0035b;
                    return;
                }
                return;
            }
            if (iOrdinal == 1) {
                if (this.a == enumC0035b2) {
                    if (FragmentManager.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.b + " to ADDING.");
                    }
                    this.a = EnumC0035b.b;
                    this.b = a.b;
                    return;
                }
                return;
            }
            if (iOrdinal != 2) {
                return;
            }
            if (FragmentManager.K(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = " + this.a + " -> REMOVED. mLifecycleImpact  = " + this.b + " to REMOVING.");
            }
            this.a = enumC0035b2;
            this.b = a.c;
        }

        public void d() {
        }

        public final String toString() {
            StringBuilder sbM = akb.m("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
            sbM.append(this.a);
            sbM.append(" lifecycleImpact = ");
            sbM.append(this.b);
            sbM.append(" fragment = ");
            sbM.append(this.c);
            sbM.append('}');
            return sbM.toString();
        }
    }

    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.a.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    public r(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.a = viewGroup;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public static final r f(ViewGroup viewGroup, FragmentManager fragmentManager) {
        viewGroup.getClass();
        fragmentManager.getClass();
        fragmentManager.I().getClass();
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof r) {
            return (r) tag;
        }
        androidx.fragment.app.c cVar = new androidx.fragment.app.c(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, cVar);
        return cVar;
    }

    public final void a(b.EnumC0035b enumC0035b, b.a aVar, m mVar) {
        synchronized (this.b) {
            tw1 tw1Var = new tw1();
            Fragment fragment = mVar.c;
            fragment.getClass();
            b bVarD = d(fragment);
            if (bVarD != null) {
                bVarD.c(enumC0035b, aVar);
                return;
            }
            final a aVar2 = new a(enumC0035b, aVar, mVar, tw1Var);
            this.b.add(aVar2);
            aVar2.d.add(new Runnable() { // from class: androidx.fragment.app.q
                @Override // java.lang.Runnable
                public final void run() {
                    ArrayList arrayList = this.a.b;
                    r.a aVar3 = aVar2;
                    if (arrayList.contains(aVar3)) {
                        r.b.EnumC0035b enumC0035b2 = aVar3.a;
                        View view = aVar3.c.mView;
                        view.getClass();
                        enumC0035b2.a(view);
                    }
                }
            });
            aVar2.d.add(new o4(3, this, aVar2));
            j6g j6gVar = j6g.a;
        }
    }

    public abstract void b(ArrayList arrayList, boolean z);

    public final void c() {
        if (this.e) {
            return;
        }
        ViewGroup viewGroup = this.a;
        WeakHashMap<View, prg> weakHashMap = epg.a;
        if (!viewGroup.isAttachedToWindow()) {
            e();
            this.d = false;
            return;
        }
        synchronized (this.b) {
            try {
                if (!this.b.isEmpty()) {
                    ArrayList<b> arrayListB1 = z92.B1(this.c);
                    this.c.clear();
                    for (b bVar : arrayListB1) {
                        if (FragmentManager.K(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + bVar);
                        }
                        bVar.a();
                        if (!bVar.g) {
                            this.c.add(bVar);
                        }
                    }
                    h();
                    ArrayList arrayListB12 = z92.B1(this.b);
                    this.b.clear();
                    this.c.addAll(arrayListB12);
                    if (FragmentManager.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    Iterator it = arrayListB12.iterator();
                    while (it.hasNext()) {
                        ((b) it.next()).d();
                    }
                    b(arrayListB12, this.d);
                    this.d = false;
                    if (FragmentManager.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final b d(Fragment fragment) {
        Object next;
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            b bVar = (b) next;
            if (wl7.b(bVar.c, fragment) && !bVar.f) {
                break;
            }
        }
        return (b) next;
    }

    public final void e() {
        if (FragmentManager.K(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.a;
        WeakHashMap<View, prg> weakHashMap = epg.a;
        boolean zIsAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.b) {
            try {
                h();
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    ((b) it.next()).d();
                }
                for (b bVar : z92.B1(this.c)) {
                    if (FragmentManager.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.a + " is not attached to window. ") + "Cancelling running operation " + bVar);
                    }
                    bVar.a();
                }
                for (b bVar2 : z92.B1(this.b)) {
                    if (FragmentManager.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.a + " is not attached to window. ") + "Cancelling pending operation " + bVar2);
                    }
                    bVar2.a();
                }
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        Object objPrevious;
        b.EnumC0035b enumC0035b;
        synchronized (this.b) {
            try {
                h();
                ArrayList arrayList = this.b;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                    b bVar = (b) objPrevious;
                    View view = bVar.c.mView;
                    view.getClass();
                    if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
                        enumC0035b = b.EnumC0035b.d;
                    } else {
                        int visibility = view.getVisibility();
                        if (visibility == 0) {
                            enumC0035b = b.EnumC0035b.b;
                        } else if (visibility == 4) {
                            enumC0035b = b.EnumC0035b.d;
                        } else {
                            if (visibility != 8) {
                                throw new IllegalArgumentException("Unknown visibility " + visibility);
                            }
                            enumC0035b = b.EnumC0035b.c;
                        }
                    }
                    b.EnumC0035b enumC0035b2 = bVar.a;
                    b.EnumC0035b enumC0035b3 = b.EnumC0035b.b;
                    if (enumC0035b2 == enumC0035b3 && enumC0035b != enumC0035b3) {
                        break;
                    }
                }
                b bVar2 = (b) objPrevious;
                Fragment fragment = bVar2 != null ? bVar2.c : null;
                this.e = fragment != null ? fragment.isPostponed() : false;
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        b.EnumC0035b enumC0035b;
        for (b bVar : this.b) {
            if (bVar.b == b.a.b) {
                View viewRequireView = bVar.c.requireView();
                viewRequireView.getClass();
                int visibility = viewRequireView.getVisibility();
                if (visibility == 0) {
                    enumC0035b = b.EnumC0035b.b;
                } else if (visibility == 4) {
                    enumC0035b = b.EnumC0035b.d;
                } else {
                    if (visibility != 8) {
                        l5.q(p6.c(visibility, "Unknown visibility "));
                        return;
                    }
                    enumC0035b = b.EnumC0035b.c;
                }
                bVar.c(enumC0035b, b.a.a);
            }
        }
    }
}
