package com.google.android.gms.internal.play_billing;

import defpackage.ezh;
import defpackage.f2i;
import defpackage.i3i;
import defpackage.ivh;
import defpackage.t5i;
import defpackage.wvh;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {
    public static final Logger b = Logger.getLogger(b.class.getName());
    public static final boolean c = t5i.e;
    public wvh a;

    public b() {
        throw null;
    }

    public static int a(String str) {
        int length;
        try {
            length = c.b(str);
        } catch (zzhq unused) {
            length = str.getBytes(ezh.a).length;
        }
        return b(length) + length;
    }

    public static int b(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int c(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public abstract void d(byte b2);

    public abstract void e(int i, boolean z);

    public abstract void f(int i, ivh ivhVar);

    public abstract void g(int i, int i2);

    public abstract void h(int i);

    public abstract void i(int i, long j);

    public abstract void j(long j);

    public abstract void k(int i, int i2);

    public abstract void l(int i);

    public abstract void m(int i, f2i f2iVar, i3i i3iVar);

    public abstract void n(int i, f2i f2iVar);

    public abstract void o(int i, ivh ivhVar);

    public abstract void p(int i, String str);

    public abstract void q(int i, int i2);

    public abstract void r(int i, int i2);

    public abstract void s(int i);

    public abstract void t(int i, long j);

    public abstract void u(long j);
}
