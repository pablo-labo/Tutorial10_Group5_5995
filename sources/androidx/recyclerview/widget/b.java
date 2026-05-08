package androidx.recyclerview.widget;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.epg;
import defpackage.prg;
import defpackage.r40;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final v a;
    public View e;
    public int d = 0;
    public final a b = new a();
    public final ArrayList c = new ArrayList();

    public static class a {
        public long a = 0;
        public a b;

        public final void a(int i) {
            if (i < 64) {
                this.a &= ~(1 << i);
                return;
            }
            a aVar = this.b;
            if (aVar != null) {
                aVar.a(i - 64);
            }
        }

        public final int b(int i) {
            a aVar = this.b;
            if (aVar == null) {
                long j = this.a;
                return i >= 64 ? Long.bitCount(j) : Long.bitCount(((1 << i) - 1) & j);
            }
            if (i < 64) {
                return Long.bitCount(((1 << i) - 1) & this.a);
            }
            return Long.bitCount(this.a) + aVar.b(i - 64);
        }

        public final void c() {
            if (this.b == null) {
                this.b = new a();
            }
        }

        public final boolean d(int i) {
            if (i < 64) {
                return ((1 << i) & this.a) != 0;
            }
            c();
            return this.b.d(i - 64);
        }

        public final void e(int i, boolean z) {
            if (i >= 64) {
                c();
                this.b.e(i - 64, z);
                return;
            }
            long j = this.a;
            boolean z2 = (Long.MIN_VALUE & j) != 0;
            long j2 = (1 << i) - 1;
            this.a = ((j & (~j2)) << 1) | (j & j2);
            if (z) {
                h(i);
            } else {
                a(i);
            }
            if (z2 || this.b != null) {
                c();
                this.b.e(0, z2);
            }
        }

        public final boolean f(int i) {
            if (i >= 64) {
                c();
                return this.b.f(i - 64);
            }
            long j = 1 << i;
            long j2 = this.a;
            boolean z = (j2 & j) != 0;
            long j3 = j2 & (~j);
            this.a = j3;
            long j4 = j - 1;
            this.a = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
            a aVar = this.b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.b.f(0);
            }
            return z;
        }

        public final void g() {
            this.a = 0L;
            a aVar = this.b;
            if (aVar != null) {
                aVar.g();
            }
        }

        public final void h(int i) {
            if (i < 64) {
                this.a |= 1 << i;
            } else {
                c();
                this.b.h(i - 64);
            }
        }

        public final String toString() {
            if (this.b == null) {
                return Long.toBinaryString(this.a);
            }
            return this.b.toString() + "xx" + Long.toBinaryString(this.a);
        }
    }

    public b(v vVar) {
        this.a = vVar;
    }

    public final void a(View view, int i, boolean z) {
        RecyclerView recyclerView = this.a.a;
        int childCount = i < 0 ? recyclerView.getChildCount() : f(i);
        this.b.e(childCount, z);
        if (z) {
            i(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.b0 b0VarM = RecyclerView.M(view);
        RecyclerView.e eVar = recyclerView.e0;
        if (eVar != null && b0VarM != null) {
            eVar.k(b0VarM);
        }
        ArrayList arrayList = recyclerView.v0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((RecyclerView.o) recyclerView.v0.get(size)).a(view);
            }
        }
    }

    public final void b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        RecyclerView recyclerView = this.a.a;
        int childCount = i < 0 ? recyclerView.getChildCount() : f(i);
        this.b.e(childCount, z);
        if (z) {
            i(view);
        }
        RecyclerView.b0 b0VarM = RecyclerView.M(view);
        if (b0VarM != null) {
            if (!b0VarM.j() && !b0VarM.o()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(b0VarM);
                r40.k(sb, recyclerView.C());
                return;
            } else {
                if (RecyclerView.r1) {
                    Log.d("RecyclerView", "reAttach " + b0VarM);
                }
                b0VarM.j &= -257;
            }
        } else if (RecyclerView.q1) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            String strC = recyclerView.C();
            sb2.append(", index: ");
            sb2.append(childCount);
            sb2.append(strC);
            throw new IllegalArgumentException(sb2.toString());
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public final void c(int i) {
        int iF = f(i);
        this.b.f(iF);
        RecyclerView recyclerView = this.a.a;
        View childAt = recyclerView.getChildAt(iF);
        if (childAt != null) {
            RecyclerView.b0 b0VarM = RecyclerView.M(childAt);
            if (b0VarM != null) {
                if (b0VarM.j() && !b0VarM.o()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(b0VarM);
                    r40.k(sb, recyclerView.C());
                    return;
                } else {
                    if (RecyclerView.r1) {
                        Log.d("RecyclerView", "tmpDetach " + b0VarM);
                    }
                    b0VarM.a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
                }
            }
        } else if (RecyclerView.q1) {
            throw new IllegalArgumentException("No view at offset " + iF + recyclerView.C());
        }
        recyclerView.detachViewFromParent(iF);
    }

    public final View d(int i) {
        return this.a.a.getChildAt(f(i));
    }

    public final int e() {
        return this.a.a.getChildCount() - this.c.size();
    }

    public final int f(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = this.a.a.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            a aVar = this.b;
            int iB = i - (i2 - aVar.b(i2));
            if (iB == 0) {
                while (aVar.d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iB;
        }
        return -1;
    }

    public final View g(int i) {
        return this.a.a.getChildAt(i);
    }

    public final int h() {
        return this.a.a.getChildCount();
    }

    public final void i(View view) {
        this.c.add(view);
        RecyclerView.b0 b0VarM = RecyclerView.M(view);
        if (b0VarM != null) {
            View view2 = b0VarM.a;
            RecyclerView recyclerView = this.a.a;
            int i = b0VarM.q;
            if (i != -1) {
                b0VarM.p = i;
            } else {
                WeakHashMap<View, prg> weakHashMap = epg.a;
                b0VarM.p = view2.getImportantForAccessibility();
            }
            if (recyclerView.P()) {
                b0VarM.q = 4;
                recyclerView.k1.add(b0VarM);
            } else {
                WeakHashMap<View, prg> weakHashMap2 = epg.a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public final void j(View view) {
        RecyclerView.b0 b0VarM;
        if (!this.c.remove(view) || (b0VarM = RecyclerView.M(view)) == null) {
            return;
        }
        RecyclerView recyclerView = this.a.a;
        int i = b0VarM.p;
        if (recyclerView.P()) {
            b0VarM.q = i;
            recyclerView.k1.add(b0VarM);
        } else {
            View view2 = b0VarM.a;
            WeakHashMap<View, prg> weakHashMap = epg.a;
            view2.setImportantForAccessibility(i);
        }
        b0VarM.p = 0;
    }

    public final String toString() {
        return this.b.toString() + ", hidden list:" + this.c.size();
    }
}
