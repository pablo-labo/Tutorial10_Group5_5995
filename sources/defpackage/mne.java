package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class mne implements Comparable<mne> {
    public a X;
    public boolean a;
    public float e;
    public int b = -1;
    public int c = -1;
    public int d = 0;
    public boolean f = false;
    public final float[] V = new float[9];
    public final float[] W = new float[9];
    public nt0[] Y = new nt0[16];
    public int Z = 0;
    public int a0 = 0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final /* synthetic */ a[] e;

        static {
            a aVar = new a("UNRESTRICTED", 0);
            a = aVar;
            a aVar2 = new a("CONSTANT", 1);
            a aVar3 = new a("SLACK", 2);
            b = aVar3;
            a aVar4 = new a("ERROR", 3);
            c = aVar4;
            a aVar5 = new a("UNKNOWN", 4);
            d = aVar5;
            e = new a[]{aVar, aVar2, aVar3, aVar4, aVar5};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) e.clone();
        }
    }

    public mne(a aVar) {
        this.X = aVar;
    }

    public final void a(nt0 nt0Var) {
        int i = 0;
        while (true) {
            int i2 = this.Z;
            nt0[] nt0VarArr = this.Y;
            if (i >= i2) {
                if (i2 >= nt0VarArr.length) {
                    this.Y = (nt0[]) Arrays.copyOf(nt0VarArr, nt0VarArr.length * 2);
                }
                nt0[] nt0VarArr2 = this.Y;
                int i3 = this.Z;
                nt0VarArr2[i3] = nt0Var;
                this.Z = i3 + 1;
                return;
            }
            if (nt0VarArr[i] == nt0Var) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void c(nt0 nt0Var) {
        int i = this.Z;
        int i2 = 0;
        while (i2 < i) {
            if (this.Y[i2] == nt0Var) {
                while (i2 < i - 1) {
                    nt0[] nt0VarArr = this.Y;
                    int i3 = i2 + 1;
                    nt0VarArr[i2] = nt0VarArr[i3];
                    i2 = i3;
                }
                this.Z--;
                return;
            }
            i2++;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(mne mneVar) {
        return this.b - mneVar.b;
    }

    public final void e() {
        this.X = a.d;
        this.d = 0;
        this.b = -1;
        this.c = -1;
        this.e = 0.0f;
        this.f = false;
        int i = this.Z;
        for (int i2 = 0; i2 < i; i2++) {
            this.Y[i2] = null;
        }
        this.Z = 0;
        this.a0 = 0;
        this.a = false;
        Arrays.fill(this.W, 0.0f);
    }

    public final void f(ox8 ox8Var, float f) {
        this.e = f;
        this.f = true;
        int i = this.Z;
        this.c = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.Y[i2].h(ox8Var, this, false);
        }
        this.Z = 0;
    }

    public final void h(ox8 ox8Var, nt0 nt0Var) {
        int i = this.Z;
        for (int i2 = 0; i2 < i; i2++) {
            this.Y[i2].i(ox8Var, nt0Var, false);
        }
        this.Z = 0;
    }

    public final String toString() {
        return "" + this.b;
    }
}
