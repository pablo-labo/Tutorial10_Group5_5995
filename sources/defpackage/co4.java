package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class co4 {
    public final t4b a;
    public int b;
    public int c;
    public int d;
    public int e;

    public co4(le0 le0Var, long j) {
        String str = le0Var.b;
        t4b t4bVar = new t4b();
        t4bVar.a = str;
        t4bVar.c = -1;
        t4bVar.d = -1;
        this.a = t4bVar;
        this.b = kjf.f(j);
        this.c = kjf.e(j);
        this.d = -1;
        this.e = -1;
        int iF = kjf.f(j);
        int iE = kjf.e(j);
        if (iF < 0 || iF > str.length()) {
            v40.k(str.length(), o6.g(iF, "start (", ") offset is outside of text region "));
            throw null;
        }
        if (iE < 0 || iE > str.length()) {
            v40.k(str.length(), o6.g(iE, "end (", ") offset is outside of text region "));
            throw null;
        }
        if (iF <= iE) {
            return;
        }
        l5.q(k20.l("Do not set reversed range: ", iF, iE, " > "));
        throw null;
    }

    public final void a(int i, int i2) {
        long jC = cr8.c(i, i2);
        this.a.b(i, i2, "");
        long jG = web.G(cr8.c(this.b, this.c), jC);
        j(kjf.f(jG));
        i(kjf.e(jG));
        if (e()) {
            long jG2 = web.G(cr8.c(this.d, this.e), jC);
            if (kjf.c(jG2)) {
                this.d = -1;
                this.e = -1;
            } else {
                this.d = kjf.f(jG2);
                this.e = kjf.e(jG2);
            }
        }
    }

    public final char b(int i) {
        t4b t4bVar = this.a;
        jw5 jw5Var = t4bVar.b;
        if (jw5Var != null && i >= t4bVar.c) {
            int iA = jw5Var.a - jw5Var.a();
            int i2 = t4bVar.c;
            if (i >= iA + i2) {
                return t4bVar.a.charAt(i - ((iA - t4bVar.d) + i2));
            }
            int i3 = i - i2;
            int i4 = jw5Var.c;
            char[] cArr = jw5Var.b;
            return i3 < i4 ? cArr[i3] : cArr[(i3 - i4) + jw5Var.d];
        }
        return t4bVar.a.charAt(i);
    }

    public final kjf c() {
        if (e()) {
            return new kjf(cr8.c(this.d, this.e));
        }
        return null;
    }

    public final int d() {
        int i = this.b;
        int i2 = this.c;
        if (i == i2) {
            return i2;
        }
        return -1;
    }

    public final boolean e() {
        return this.d != -1;
    }

    public final void f(int i, int i2, String str) {
        t4b t4bVar = this.a;
        if (i < 0 || i > t4bVar.a()) {
            v40.k(t4bVar.a(), o6.g(i, "start (", ") offset is outside of text region "));
            return;
        }
        if (i2 < 0 || i2 > t4bVar.a()) {
            v40.k(t4bVar.a(), o6.g(i2, "end (", ") offset is outside of text region "));
        } else {
            if (i > i2) {
                l5.q(k20.l("Do not set reversed range: ", i, i2, " > "));
                return;
            }
            t4bVar.b(i, i2, str);
            j(str.length() + i);
            i(str.length() + i);
            this.d = -1;
            this.e = -1;
        }
    }

    public final void g(int i, int i2) {
        t4b t4bVar = this.a;
        if (i < 0 || i > t4bVar.a()) {
            v40.k(t4bVar.a(), o6.g(i, "start (", ") offset is outside of text region "));
        } else if (i2 < 0 || i2 > t4bVar.a()) {
            v40.k(t4bVar.a(), o6.g(i2, "end (", ") offset is outside of text region "));
        } else if (i >= i2) {
            l5.q(k20.l("Do not set reversed or empty range: ", i, i2, " > "));
        } else {
            this.d = i;
            this.e = i2;
        }
    }

    public final void h(int i, int i2) {
        t4b t4bVar = this.a;
        if (i < 0 || i > t4bVar.a()) {
            v40.k(t4bVar.a(), o6.g(i, "start (", ") offset is outside of text region "));
        } else if (i2 < 0 || i2 > t4bVar.a()) {
            v40.k(t4bVar.a(), o6.g(i2, "end (", ") offset is outside of text region "));
        } else if (i > i2) {
            l5.q(k20.l("Do not set reversed range: ", i, i2, " > "));
        } else {
            j(i);
            i(i2);
        }
    }

    public final void i(int i) {
        if (!(i >= 0)) {
            be7.a("Cannot set selectionEnd to a negative value: " + i);
        }
        this.c = i;
    }

    public final void j(int i) {
        if (!(i >= 0)) {
            be7.a("Cannot set selectionStart to a negative value: " + i);
        }
        this.b = i;
    }

    public final String toString() {
        return this.a.toString();
    }
}
