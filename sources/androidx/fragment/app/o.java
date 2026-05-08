package androidx.fragment.app;

import defpackage.kv8;
import defpackage.l5;
import defpackage.r6;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public String i;
    public int j;
    public CharSequence k;
    public int l;
    public CharSequence m;
    public ArrayList<String> n;
    public ArrayList<String> o;
    public ArrayList<Runnable> q;
    public final ArrayList<a> a = new ArrayList<>();
    public boolean h = true;
    public boolean p = false;

    public final void b(a aVar) {
        this.a.add(aVar);
        aVar.d = this.b;
        aVar.e = this.c;
        aVar.f = this.d;
        aVar.g = this.e;
    }

    public final void c(String str) {
        if (!this.h) {
            r6.g("This FragmentTransaction is not allowed to be added to the back stack.");
        } else {
            this.g = true;
            this.i = str;
        }
    }

    public abstract void d(int i, Fragment fragment, String str, int i2);

    public final void e(int i, Fragment fragment, String str) {
        if (i != 0) {
            d(i, fragment, str, 2);
        } else {
            l5.q("Must use non-zero containerViewId");
        }
    }

    public final void f(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public static final class a {
        public int a;
        public Fragment b;
        public boolean c;
        public int d;
        public int e;
        public int f;
        public int g;
        public kv8.b h;
        public kv8.b i;

        public a(Fragment fragment, int i) {
            this.a = i;
            this.b = fragment;
            this.c = false;
            kv8.b bVar = kv8.b.e;
            this.h = bVar;
            this.i = bVar;
        }

        public a() {
        }

        public a(int i, Fragment fragment, int i2) {
            this.a = i;
            this.b = fragment;
            this.c = true;
            kv8.b bVar = kv8.b.e;
            this.h = bVar;
            this.i = bVar;
        }
    }
}
