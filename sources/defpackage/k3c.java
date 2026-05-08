package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class k3c {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public final cr1 h;

    public k3c(cr1 cr1Var) {
        cr1Var.getClass();
        this.h = cr1Var;
        this.c = 0;
        this.b = 0;
        this.d = 0;
        this.f = 0;
        this.e = 0;
        this.a = 0;
    }

    public final boolean a(zfb zfbVar) {
        int i;
        int i2 = this.e;
        while (this.a != 6 && (i = zfbVar.read()) != -1) {
            try {
                int i3 = this.c;
                this.c = i3 + 1;
                if (this.g) {
                    this.a = 6;
                    this.g = false;
                    return false;
                }
                int i4 = this.a;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 == 4) {
                                    this.a = 5;
                                } else if (i4 != 5) {
                                    web.i(false);
                                } else {
                                    int i5 = ((this.b << 8) + i) - 2;
                                    ewa.K(zfbVar, i5);
                                    this.c += i5;
                                    this.a = 2;
                                }
                            } else if (i == 255) {
                                this.a = 3;
                            } else if (i == 0) {
                                this.a = 2;
                            } else if (i == 217) {
                                this.g = true;
                                int i6 = i3 - 1;
                                int i7 = this.d;
                                if (i7 > 0) {
                                    this.f = i6;
                                }
                                this.d = i7 + 1;
                                this.e = i7;
                                this.a = 2;
                            } else {
                                if (i == 218) {
                                    int i8 = i3 - 1;
                                    int i9 = this.d;
                                    if (i9 > 0) {
                                        this.f = i8;
                                    }
                                    this.d = i9 + 1;
                                    this.e = i9;
                                }
                                if (i == 1 || ((i >= 208 && i <= 215) || i == 217 || i == 216)) {
                                    this.a = 2;
                                } else {
                                    this.a = 4;
                                }
                            }
                        } else if (i == 255) {
                            this.a = 3;
                        }
                    } else if (i == 216) {
                        this.a = 2;
                    } else {
                        this.a = 6;
                    }
                } else if (i == 255) {
                    this.a = 1;
                } else {
                    this.a = 6;
                }
                this.b = i;
            } catch (IOException e) {
                bf9.f(e);
                throw null;
            }
        }
        return (this.a == 6 || this.e == i2) ? false : true;
    }

    public final boolean b(vs4 vs4Var) {
        if (this.a == 6 || vs4Var.G() <= this.c) {
            return false;
        }
        InputStream inputStreamV = vs4Var.v();
        inputStreamV.getClass();
        cr1 cr1Var = this.h;
        zfb zfbVar = new zfb(inputStreamV, cr1Var.get(16384), cr1Var);
        try {
            try {
                ewa.K(zfbVar, this.c);
                return a(zfbVar);
            } catch (IOException e) {
                bf9.f(e);
                throw null;
            }
        } finally {
            r82.b(zfbVar);
        }
    }
}
