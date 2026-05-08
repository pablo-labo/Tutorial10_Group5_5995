package defpackage;

import android.text.Layout;

/* JADX INFO: loaded from: classes.dex */
public final class avf {
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public float k;
    public String l;
    public Layout.Alignment o;
    public Layout.Alignment p;
    public wdf r;
    public String t;
    public String u;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int m = -1;
    public int n = -1;
    public int q = -1;
    public float s = Float.MAX_VALUE;

    public final void a(avf avfVar) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (avfVar != null) {
            if (!this.c && avfVar.c) {
                this.b = avfVar.b;
                this.c = true;
            }
            if (this.h == -1) {
                this.h = avfVar.h;
            }
            if (this.i == -1) {
                this.i = avfVar.i;
            }
            if (this.a == null && (str = avfVar.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = avfVar.f;
            }
            if (this.g == -1) {
                this.g = avfVar.g;
            }
            if (this.n == -1) {
                this.n = avfVar.n;
            }
            if (this.o == null && (alignment2 = avfVar.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = avfVar.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = avfVar.q;
            }
            if (this.j == -1) {
                this.j = avfVar.j;
                this.k = avfVar.k;
            }
            if (this.r == null) {
                this.r = avfVar.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = avfVar.s;
            }
            if (this.t == null) {
                this.t = avfVar.t;
            }
            if (this.u == null) {
                this.u = avfVar.u;
            }
            if (!this.e && avfVar.e) {
                this.d = avfVar.d;
                this.e = true;
            }
            if (this.m != -1 || (i = avfVar.m) == -1) {
                return;
            }
            this.m = i;
        }
    }
}
