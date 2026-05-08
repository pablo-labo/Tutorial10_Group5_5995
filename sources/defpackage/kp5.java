package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kp5 implements Comparable<kp5> {
    public final int a;
    public final int b;
    public final String c;
    public final String d;

    public kp5(String str, int i, int i2, String str2) {
        str.getClass();
        str2.getClass();
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(kp5 kp5Var) {
        kp5 kp5Var2 = kp5Var;
        kp5Var2.getClass();
        int i = this.a - kp5Var2.a;
        return i == 0 ? this.b - kp5Var2.b : i;
    }
}
