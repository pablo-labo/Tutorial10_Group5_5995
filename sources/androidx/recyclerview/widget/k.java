package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.k6;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class k extends z {
    public static TimeInterpolator s;
    public ArrayList<RecyclerView.b0> h;
    public ArrayList<RecyclerView.b0> i;
    public ArrayList<b> j;
    public ArrayList<a> k;
    public ArrayList<ArrayList<RecyclerView.b0>> l;
    public ArrayList<ArrayList<b>> m;
    public ArrayList<ArrayList<a>> n;
    public ArrayList<RecyclerView.b0> o;
    public ArrayList<RecyclerView.b0> p;
    public ArrayList<RecyclerView.b0> q;
    public ArrayList<RecyclerView.b0> r;

    public static class a {
        public RecyclerView.b0 a;
        public RecyclerView.b0 b;
        public int c;
        public int d;
        public int e;
        public int f;

        @SuppressLint({"UnknownNullness"})
        public final String toString() {
            StringBuilder sb = new StringBuilder("ChangeInfo{oldHolder=");
            sb.append(this.a);
            sb.append(", newHolder=");
            sb.append(this.b);
            sb.append(", fromX=");
            sb.append(this.c);
            sb.append(", fromY=");
            sb.append(this.d);
            sb.append(", toX=");
            sb.append(this.e);
            sb.append(", toY=");
            return k6.h(sb, this.f, '}');
        }
    }

    public static class b {
        public RecyclerView.b0 a;
        public int b;
        public int c;
        public int d;
        public int e;
    }

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((RecyclerView.b0) arrayList.get(size)).a.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    @SuppressLint({"UnknownNullness"})
    public final void d(RecyclerView.b0 b0Var) {
        ArrayList<ArrayList<RecyclerView.b0>> arrayList = this.l;
        ArrayList<ArrayList<b>> arrayList2 = this.m;
        ArrayList<ArrayList<a>> arrayList3 = this.n;
        View view = b0Var.a;
        view.animate().cancel();
        ArrayList<b> arrayList4 = this.j;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (arrayList4.get(size).a == b0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(b0Var);
                arrayList4.remove(size);
            }
        }
        j(this.k, b0Var);
        if (this.h.remove(b0Var)) {
            view.setAlpha(1.0f);
            c(b0Var);
        }
        if (this.i.remove(b0Var)) {
            view.setAlpha(1.0f);
            c(b0Var);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList<a> arrayList5 = arrayList3.get(size2);
            j(arrayList5, b0Var);
            if (arrayList5.isEmpty()) {
                arrayList3.remove(size2);
            }
        }
        for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
            ArrayList<b> arrayList6 = arrayList2.get(size3);
            int size4 = arrayList6.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (arrayList6.get(size4).a == b0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(b0Var);
                    arrayList6.remove(size4);
                    if (arrayList6.isEmpty()) {
                        arrayList2.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = arrayList.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.b0> arrayList7 = arrayList.get(size5);
            if (arrayList7.remove(b0Var)) {
                view.setAlpha(1.0f);
                c(b0Var);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.q.remove(b0Var);
        this.o.remove(b0Var);
        this.r.remove(b0Var);
        this.p.remove(b0Var);
        i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final void e() {
        ArrayList<a> arrayList = this.k;
        ArrayList<ArrayList<a>> arrayList2 = this.n;
        ArrayList<ArrayList<RecyclerView.b0>> arrayList3 = this.l;
        ArrayList<ArrayList<b>> arrayList4 = this.m;
        ArrayList<RecyclerView.b0> arrayList5 = this.i;
        ArrayList<RecyclerView.b0> arrayList6 = this.h;
        ArrayList<b> arrayList7 = this.j;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            b bVar = arrayList7.get(size);
            View view = bVar.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(bVar.a);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            c(arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.b0 b0Var = arrayList5.get(size3);
            b0Var.a.setAlpha(1.0f);
            c(b0Var);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList.size() - 1; size4 >= 0; size4--) {
            a aVar = arrayList.get(size4);
            RecyclerView.b0 b0Var2 = aVar.a;
            if (b0Var2 != null) {
                k(aVar, b0Var2);
            }
            RecyclerView.b0 b0Var3 = aVar.b;
            if (b0Var3 != null) {
                k(aVar, b0Var3);
            }
        }
        arrayList.clear();
        if (f()) {
            for (int size5 = arrayList4.size() - 1; size5 >= 0; size5--) {
                ArrayList<b> arrayList8 = arrayList4.get(size5);
                for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                    b bVar2 = arrayList8.get(size6);
                    View view2 = bVar2.a.a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(bVar2.a);
                    arrayList8.remove(size6);
                    if (arrayList8.isEmpty()) {
                        arrayList4.remove(arrayList8);
                    }
                }
            }
            for (int size7 = arrayList3.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.b0> arrayList9 = arrayList3.get(size7);
                for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.b0 b0Var4 = arrayList9.get(size8);
                    b0Var4.a.setAlpha(1.0f);
                    c(b0Var4);
                    arrayList9.remove(size8);
                    if (arrayList9.isEmpty()) {
                        arrayList3.remove(arrayList9);
                    }
                }
            }
            for (int size9 = arrayList2.size() - 1; size9 >= 0; size9--) {
                ArrayList<a> arrayList10 = arrayList2.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    a aVar2 = arrayList10.get(size10);
                    RecyclerView.b0 b0Var5 = aVar2.a;
                    if (b0Var5 != null) {
                        k(aVar2, b0Var5);
                    }
                    RecyclerView.b0 b0Var6 = aVar2.b;
                    if (b0Var6 != null) {
                        k(aVar2, b0Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList2.remove(arrayList10);
                    }
                }
            }
            h(this.q);
            h(this.p);
            h(this.o);
            h(this.r);
            ArrayList<RecyclerView.j.a> arrayList11 = this.b;
            int size11 = arrayList11.size();
            for (int i = 0; i < size11; i++) {
                arrayList11.get(i).a();
            }
            arrayList11.clear();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final boolean f() {
        return (this.i.isEmpty() && this.k.isEmpty() && this.j.isEmpty() && this.h.isEmpty() && this.p.isEmpty() && this.q.isEmpty() && this.o.isEmpty() && this.r.isEmpty() && this.m.isEmpty() && this.l.isEmpty() && this.n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.z
    @SuppressLint({"UnknownNullness"})
    public final boolean g(RecyclerView.b0 b0Var, int i, int i2, int i3, int i4) {
        View view = b0Var.a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) b0Var.a.getTranslationY());
        l(b0Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            c(b0Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList<b> arrayList = this.j;
        b bVar = new b();
        bVar.a = b0Var;
        bVar.b = translationX;
        bVar.c = translationY;
        bVar.d = i3;
        bVar.e = i4;
        arrayList.add(bVar);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList<RecyclerView.j.a> arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).a();
        }
        arrayList.clear();
    }

    public final void j(ArrayList arrayList, RecyclerView.b0 b0Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a aVar = (a) arrayList.get(size);
            if (k(aVar, b0Var) && aVar.a == null && aVar.b == null) {
                arrayList.remove(aVar);
            }
        }
    }

    public final boolean k(a aVar, RecyclerView.b0 b0Var) {
        if (aVar.b == b0Var) {
            aVar.b = null;
        } else {
            if (aVar.a != b0Var) {
                return false;
            }
            aVar.a = null;
        }
        View view = b0Var.a;
        View view2 = b0Var.a;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        c(b0Var);
        return true;
    }

    public final void l(RecyclerView.b0 b0Var) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        b0Var.a.animate().setInterpolator(s);
        d(b0Var);
    }
}
