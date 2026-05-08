package defpackage;

import com.facebook.react.bridge.ReadableMap;
import com.horcrux.svg.SVGLength;
import com.horcrux.svg.h;
import com.horcrux.svg.p;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ia6 {
    public double[] A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public final float M;
    public final float N;
    public final float O;
    public final ArrayList<on5> a;
    public final ArrayList<SVGLength[]> b;
    public final ArrayList<SVGLength[]> c;
    public final ArrayList<SVGLength[]> d;
    public final ArrayList<SVGLength[]> e;
    public final ArrayList<double[]> f;
    public final ArrayList<Integer> g;
    public final ArrayList<Integer> h;
    public final ArrayList<Integer> i;
    public final ArrayList<Integer> j;
    public final ArrayList<Integer> k;
    public final ArrayList<Integer> l;
    public final ArrayList<Integer> m;
    public final ArrayList<Integer> n;
    public final ArrayList<Integer> o;
    public final ArrayList<Integer> p;
    public double q;
    public on5 r;
    public double s;
    public double t;
    public double u;
    public double v;
    public SVGLength[] w;
    public SVGLength[] x;
    public SVGLength[] y;
    public SVGLength[] z;

    public ia6(float f, float f2, float f3) {
        ArrayList<on5> arrayList = new ArrayList<>();
        this.a = arrayList;
        ArrayList<SVGLength[]> arrayList2 = new ArrayList<>();
        this.b = arrayList2;
        ArrayList<SVGLength[]> arrayList3 = new ArrayList<>();
        this.c = arrayList3;
        ArrayList<SVGLength[]> arrayList4 = new ArrayList<>();
        this.d = arrayList4;
        ArrayList<SVGLength[]> arrayList5 = new ArrayList<>();
        this.e = arrayList5;
        ArrayList<double[]> arrayList6 = new ArrayList<>();
        this.f = arrayList6;
        ArrayList<Integer> arrayList7 = new ArrayList<>();
        this.g = arrayList7;
        ArrayList<Integer> arrayList8 = new ArrayList<>();
        this.h = arrayList8;
        ArrayList<Integer> arrayList9 = new ArrayList<>();
        this.i = arrayList9;
        ArrayList<Integer> arrayList10 = new ArrayList<>();
        this.j = arrayList10;
        ArrayList<Integer> arrayList11 = new ArrayList<>();
        this.k = arrayList11;
        this.l = new ArrayList<>();
        this.m = new ArrayList<>();
        this.n = new ArrayList<>();
        this.o = new ArrayList<>();
        this.p = new ArrayList<>();
        this.q = 12.0d;
        this.r = on5.p;
        SVGLength[] sVGLengthArr = new SVGLength[0];
        this.w = sVGLengthArr;
        this.x = new SVGLength[0];
        this.y = new SVGLength[0];
        this.z = new SVGLength[0];
        this.A = new double[]{0.0d};
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.M = f;
        this.N = f2;
        this.O = f3;
        arrayList2.add(sVGLengthArr);
        arrayList3.add(this.x);
        arrayList4.add(this.y);
        arrayList5.add(this.z);
        arrayList6.add(this.A);
        arrayList7.add(Integer.valueOf(this.G));
        arrayList8.add(Integer.valueOf(this.H));
        arrayList9.add(Integer.valueOf(this.I));
        arrayList10.add(Integer.valueOf(this.J));
        arrayList11.add(Integer.valueOf(this.K));
        arrayList.add(this.r);
        e();
    }

    public static SVGLength[] a(ArrayList arrayList) {
        int size = arrayList.size();
        SVGLength[] sVGLengthArr = new SVGLength[size];
        for (int i = 0; i < size; i++) {
            sVGLengthArr[i] = (SVGLength) arrayList.get(i);
        }
        return sVGLengthArr;
    }

    public static void b(int i, ArrayList arrayList) {
        while (i >= 0) {
            arrayList.set(i, Integer.valueOf(((Integer) arrayList.get(i)).intValue() + 1));
            i--;
        }
    }

    public final double c(double d) {
        b(this.B, this.g);
        int i = this.G + 1;
        SVGLength[] sVGLengthArr = this.w;
        if (i < sVGLengthArr.length) {
            this.u = 0.0d;
            this.G = i;
            this.s = p.a(sVGLengthArr[i], this.N, this.M, this.q);
        }
        double d2 = this.s + d;
        this.s = d2;
        return d2;
    }

    public final double d() {
        b(this.C, this.h);
        int i = this.H + 1;
        SVGLength[] sVGLengthArr = this.x;
        if (i < sVGLengthArr.length) {
            this.v = 0.0d;
            this.H = i;
            this.t = p.a(sVGLengthArr[i], this.O, this.M, this.q);
        }
        return this.t;
    }

    public final void e() {
        this.l.add(Integer.valueOf(this.B));
        this.m.add(Integer.valueOf(this.C));
        this.n.add(Integer.valueOf(this.D));
        this.o.add(Integer.valueOf(this.E));
        this.p.add(Integer.valueOf(this.F));
    }

    public final void f(h hVar, ReadableMap readableMap) {
        on5 on5Var;
        if (this.L > 0) {
            on5Var = this.r;
        } else {
            h parentTextRoot = hVar.getParentTextRoot();
            while (true) {
                if (parentTextRoot == null) {
                    on5Var = on5.p;
                    break;
                }
                on5 on5Var2 = parentTextRoot.b.r;
                if (on5Var2 != on5.p) {
                    on5Var = on5Var2;
                    break;
                }
                parentTextRoot = parentTextRoot.getParentTextRoot();
            }
        }
        this.L++;
        ArrayList<on5> arrayList = this.a;
        if (readableMap == null) {
            arrayList.add(on5Var);
            return;
        }
        on5 on5Var3 = new on5(readableMap, on5Var, this.M);
        this.q = on5Var3.a;
        arrayList.add(on5Var3);
        this.r = on5Var3;
    }
}
