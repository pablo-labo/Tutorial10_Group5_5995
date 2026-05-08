package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o;
import androidx.fragment.app.strictmode.FragmentReuseViolation;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.akb;
import defpackage.cr5;
import defpackage.cs5;
import defpackage.ja;
import defpackage.kv8;
import defpackage.m6;
import defpackage.q39;
import defpackage.q6;
import defpackage.r6;
import defpackage.w40;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a extends o implements FragmentManager.m {
    public final FragmentManager r;
    public boolean s;
    public int t;
    public boolean u;

    public a(a aVar) {
        aVar.r.H();
        cr5<?> cr5Var = aVar.r.v;
        if (cr5Var != null) {
            cr5Var.b.getClassLoader();
        }
        for (o.a aVar2 : aVar.a) {
            ArrayList<o.a> arrayList = this.a;
            o.a aVar3 = new o.a();
            aVar3.a = aVar2.a;
            aVar3.b = aVar2.b;
            aVar3.c = aVar2.c;
            aVar3.d = aVar2.d;
            aVar3.e = aVar2.e;
            aVar3.f = aVar2.f;
            aVar3.g = aVar2.g;
            aVar3.h = aVar2.h;
            aVar3.i = aVar2.i;
            arrayList.add(aVar3);
        }
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        this.f = aVar.f;
        this.g = aVar.g;
        this.h = aVar.h;
        this.i = aVar.i;
        this.l = aVar.l;
        this.m = aVar.m;
        this.j = aVar.j;
        this.k = aVar.k;
        if (aVar.n != null) {
            ArrayList<String> arrayList2 = new ArrayList<>();
            this.n = arrayList2;
            arrayList2.addAll(aVar.n);
        }
        if (aVar.o != null) {
            ArrayList<String> arrayList3 = new ArrayList<>();
            this.o = arrayList3;
            arrayList3.addAll(aVar.o);
        }
        this.p = aVar.p;
        this.t = -1;
        this.u = false;
        this.r = aVar.r;
        this.s = aVar.s;
        this.t = aVar.t;
        this.u = aVar.u;
    }

    @Override // androidx.fragment.app.FragmentManager.m
    public final boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (FragmentManager.K(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.g) {
            return true;
        }
        FragmentManager fragmentManager = this.r;
        if (fragmentManager.d == null) {
            fragmentManager.d = new ArrayList<>();
        }
        fragmentManager.d.add(this);
        return true;
    }

    @Override // androidx.fragment.app.o
    public final void d(int i, Fragment fragment, String str, int i2) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            cs5.a aVar = cs5.a;
            cs5.b(new FragmentReuseViolation(fragment, str2));
            cs5.a(fragment).getClass();
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            ja.q("Fragment ", cls.getCanonicalName(), " must be a public static class to be  properly recreated from instance state.");
            return;
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(fragment);
                sb.append(": was ");
                r6.g(m6.h(sb, fragment.mTag, " now ", str));
                return;
            }
            fragment.mTag = str;
        }
        if (i != 0) {
            if (i == -1) {
                q6.l("Can't add fragment ", fragment, " with tag ", str, " to container view with no id");
                return;
            }
            int i3 = fragment.mFragmentId;
            if (i3 != 0 && i3 != i) {
                StringBuilder sb2 = new StringBuilder("Can't change container ID of fragment ");
                sb2.append(fragment);
                int i4 = fragment.mFragmentId;
                sb2.append(": was ");
                sb2.append(i4);
                sb2.append(" now ");
                sb2.append(i);
                throw new IllegalStateException(sb2.toString());
            }
            fragment.mFragmentId = i;
            fragment.mContainerId = i;
        }
        b(new o.a(fragment, i2));
        fragment.mFragmentManager = this.r;
    }

    public final void g(int i) {
        if (this.g) {
            if (FragmentManager.K(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList<o.a> arrayList = this.a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                o.a aVar = arrayList.get(i2);
                Fragment fragment = aVar.b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i;
                    if (FragmentManager.K(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.b + " to " + aVar.b.mBackStackNesting);
                    }
                }
            }
        }
    }

    public final int h(boolean z) {
        if (this.s) {
            r6.g("commit already called");
            return 0;
        }
        if (FragmentManager.K(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new q39());
            k("  ", printWriter, true);
            printWriter.close();
        }
        this.s = true;
        boolean z2 = this.g;
        FragmentManager fragmentManager = this.r;
        if (z2) {
            this.t = fragmentManager.i.getAndIncrement();
        } else {
            this.t = -1;
        }
        fragmentManager.v(this, z);
        return this.t;
    }

    public final void i() {
        if (this.g) {
            r6.g("This transaction is already being added to the back stack");
        } else {
            this.h = false;
            this.r.y(this, false);
        }
    }

    public final void j() {
        if (this.g) {
            r6.g("This transaction is already being added to the back stack");
        } else {
            this.h = false;
            this.r.y(this, true);
        }
    }

    public final void k(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.i);
            printWriter.print(" mIndex=");
            printWriter.print(this.t);
            printWriter.print(" mCommitted=");
            printWriter.println(this.s);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f));
            }
            if (this.b != 0 || this.c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.c));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.j != 0 || this.k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.k);
            }
            if (this.l != 0 || this.m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.m);
            }
        }
        ArrayList<o.a> arrayList = this.a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            o.a aVar = arrayList.get(i);
            switch (aVar.a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case DatadogLogGenerator.CRASH /* 9 */:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.b);
            if (z) {
                if (aVar.d != 0 || aVar.e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.e));
                }
                if (aVar.f != 0 || aVar.g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.g));
                }
            }
        }
    }

    public final a l(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.r) {
            b(new o.a(fragment, 3));
            return this;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public final a m(Fragment fragment, kv8.b bVar) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        FragmentManager fragmentManager2 = this.r;
        if (fragmentManager != fragmentManager2) {
            akb.o(fragmentManager2, "Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
            return null;
        }
        if (bVar == kv8.b.b && fragment.mState > -1) {
            w40.m("Cannot set maximum Lifecycle to ", bVar, " after the Fragment has been created");
            return null;
        }
        if (bVar == kv8.b.a) {
            w40.m("Cannot set maximum Lifecycle to ", bVar, ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
            return null;
        }
        o.a aVar = new o.a();
        aVar.a = 10;
        aVar.b = fragment;
        aVar.c = false;
        aVar.h = fragment.mMaxState;
        aVar.i = bVar;
        b(aVar);
        return this;
    }

    public final a n(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.r) {
            b(new o.a(fragment, 8));
            return this;
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.t >= 0) {
            sb.append(" #");
            sb.append(this.t);
        }
        if (this.i != null) {
            sb.append(" ");
            sb.append(this.i);
        }
        sb.append("}");
        return sb.toString();
    }

    public a(FragmentManager fragmentManager) {
        fragmentManager.H();
        cr5<?> cr5Var = fragmentManager.v;
        if (cr5Var != null) {
            cr5Var.b.getClassLoader();
        }
        this.t = -1;
        this.u = false;
        this.r = fragmentManager;
    }
}
