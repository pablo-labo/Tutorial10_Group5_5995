package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.internal.firebase_remote_config.zzhp;
import com.google.android.gms.internal.firebase_remote_config.zzhq;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f4b {
    public int a;
    public int b;
    public int c;
    public Object d;

    public f4b() {
        this.d = vjg.b;
    }

    public static void t(int i) throws zzhq {
        if ((i & 7) != 0) {
            throw zzhq.g();
        }
    }

    public static void u(int i) throws zzhq {
        if ((i & 3) != 0) {
            throw zzhq.g();
        }
    }

    public void A(List list) throws zzhq {
        int iH;
        int iH2;
        a2i a2iVar = (a2i) this.d;
        boolean z = list instanceof x4i;
        int i = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iQ = a2iVar.q();
                u(iQ);
                int iX = a2iVar.x() + iQ;
                do {
                    list.add(Float.valueOf(a2iVar.b()));
                } while (a2iVar.x() < iX);
                return;
            }
            if (i2 != 5) {
                throw zzhq.f();
            }
            do {
                list.add(Float.valueOf(a2iVar.b()));
                if (a2iVar.w()) {
                    return;
                } else {
                    iH = a2iVar.h();
                }
            } while (iH == this.a);
            this.c = iH;
            return;
        }
        x4i x4iVar = (x4i) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int iQ2 = a2iVar.q();
            u(iQ2);
            int iX2 = a2iVar.x() + iQ2;
            do {
                x4iVar.b(a2iVar.b(), x4iVar.c);
            } while (a2iVar.x() < iX2);
            return;
        }
        if (i3 != 5) {
            throw zzhq.f();
        }
        do {
            x4iVar.b(a2iVar.b(), x4iVar.c);
            if (a2iVar.w()) {
                return;
            } else {
                iH2 = a2iVar.h();
            }
        } while (iH2 == this.a);
        this.c = iH2;
    }

    public void B(List list) throws zzhq {
        int iH;
        int iH2;
        a2i a2iVar = (a2i) this.d;
        boolean z = list instanceof u7i;
        int i = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(a2iVar.i()));
                    if (a2iVar.w()) {
                        return;
                    } else {
                        iH = a2iVar.h();
                    }
                } while (iH == this.a);
                this.c = iH;
                return;
            }
            if (i2 != 2) {
                throw zzhq.f();
            }
            int iX = a2iVar.x() + a2iVar.q();
            do {
                list.add(Long.valueOf(a2iVar.i()));
            } while (a2iVar.x() < iX);
            v(iX);
            return;
        }
        u7i u7iVar = (u7i) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                u7iVar.c(a2iVar.i());
                if (a2iVar.w()) {
                    return;
                } else {
                    iH2 = a2iVar.h();
                }
            } while (iH2 == this.a);
            this.c = iH2;
            return;
        }
        if (i3 != 2) {
            throw zzhq.f();
        }
        int iX2 = a2iVar.x() + a2iVar.q();
        do {
            u7iVar.c(a2iVar.i());
        } while (a2iVar.x() < iX2);
        v(iX2);
    }

    public void C(List list) throws zzhq {
        int iH;
        int iH2;
        a2i a2iVar = (a2i) this.d;
        boolean z = list instanceof u7i;
        int i = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(a2iVar.j()));
                    if (a2iVar.w()) {
                        return;
                    } else {
                        iH = a2iVar.h();
                    }
                } while (iH == this.a);
                this.c = iH;
                return;
            }
            if (i2 != 2) {
                throw zzhq.f();
            }
            int iX = a2iVar.x() + a2iVar.q();
            do {
                list.add(Long.valueOf(a2iVar.j()));
            } while (a2iVar.x() < iX);
            v(iX);
            return;
        }
        u7i u7iVar = (u7i) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                u7iVar.c(a2iVar.j());
                if (a2iVar.w()) {
                    return;
                } else {
                    iH2 = a2iVar.h();
                }
            } while (iH2 == this.a);
            this.c = iH2;
            return;
        }
        if (i3 != 2) {
            throw zzhq.f();
        }
        int iX2 = a2iVar.x() + a2iVar.q();
        do {
            u7iVar.c(a2iVar.j());
        } while (a2iVar.x() < iX2);
        v(iX2);
    }

    public h0i D() throws zzhp {
        s(2);
        return ((a2i) this.d).p();
    }

    public int E() {
        int i = this.c;
        if (i != 0) {
            this.a = i;
            this.c = 0;
        } else {
            this.a = ((a2i) this.d).h();
        }
        int i2 = this.a;
        if (i2 == 0 || i2 == this.b) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    public void F(List list) throws zzhq {
        int iH;
        int iH2;
        a2i a2iVar = (a2i) this.d;
        boolean z = list instanceof k5i;
        int i = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(a2iVar.k()));
                    if (a2iVar.w()) {
                        return;
                    } else {
                        iH = a2iVar.h();
                    }
                } while (iH == this.a);
                this.c = iH;
                return;
            }
            if (i2 != 2) {
                throw zzhq.f();
            }
            int iX = a2iVar.x() + a2iVar.q();
            do {
                list.add(Integer.valueOf(a2iVar.k()));
            } while (a2iVar.x() < iX);
            v(iX);
            return;
        }
        k5i k5iVar = (k5i) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                k5iVar.b(a2iVar.k());
                if (a2iVar.w()) {
                    return;
                } else {
                    iH2 = a2iVar.h();
                }
            } while (iH2 == this.a);
            this.c = iH2;
            return;
        }
        if (i3 != 2) {
            throw zzhq.f();
        }
        int iX2 = a2iVar.x() + a2iVar.q();
        do {
            k5iVar.b(a2iVar.k());
        } while (a2iVar.x() < iX2);
        v(iX2);
    }

    public void G(List list) throws zzhq {
        int iH;
        int iH2;
        a2i a2iVar = (a2i) this.d;
        boolean z = list instanceof u7i;
        int i = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(a2iVar.l()));
                    if (a2iVar.w()) {
                        return;
                    } else {
                        iH = a2iVar.h();
                    }
                } while (iH == this.a);
                this.c = iH;
                return;
            }
            if (i2 != 2) {
                throw zzhq.f();
            }
            int iQ = a2iVar.q();
            t(iQ);
            int iX = a2iVar.x() + iQ;
            do {
                list.add(Long.valueOf(a2iVar.l()));
            } while (a2iVar.x() < iX);
            return;
        }
        u7i u7iVar = (u7i) list;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                u7iVar.c(a2iVar.l());
                if (a2iVar.w()) {
                    return;
                } else {
                    iH2 = a2iVar.h();
                }
            } while (iH2 == this.a);
            this.c = iH2;
            return;
        }
        if (i3 != 2) {
            throw zzhq.f();
        }
        int iQ2 = a2iVar.q();
        t(iQ2);
        int iX2 = a2iVar.x() + iQ2;
        do {
            u7iVar.c(a2iVar.l());
        } while (a2iVar.x() < iX2);
    }

    public void H(List list) throws zzhq {
        int iH;
        int iH2;
        a2i a2iVar = (a2i) this.d;
        boolean z = list instanceof k5i;
        int i = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iQ = a2iVar.q();
                u(iQ);
                int iX = a2iVar.x() + iQ;
                do {
                    list.add(Integer.valueOf(a2iVar.m()));
                } while (a2iVar.x() < iX);
                return;
            }
            if (i2 != 5) {
                throw zzhq.f();
            }
            do {
                list.add(Integer.valueOf(a2iVar.m()));
                if (a2iVar.w()) {
                    return;
                } else {
                    iH = a2iVar.h();
                }
            } while (iH == this.a);
            this.c = iH;
            return;
        }
        k5i k5iVar = (k5i) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int iQ2 = a2iVar.q();
            u(iQ2);
            int iX2 = a2iVar.x() + iQ2;
            do {
                k5iVar.b(a2iVar.m());
            } while (a2iVar.x() < iX2);
            return;
        }
        if (i3 != 5) {
            throw zzhq.f();
        }
        do {
            k5iVar.b(a2iVar.m());
            if (a2iVar.w()) {
                return;
            } else {
                iH2 = a2iVar.h();
            }
        } while (iH2 == this.a);
        this.c = iH2;
    }

    public void I(List list) throws zzhq {
        int iH;
        int iH2;
        a2i a2iVar = (a2i) this.d;
        boolean z = list instanceof b0i;
        int i = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(a2iVar.n()));
                    if (a2iVar.w()) {
                        return;
                    } else {
                        iH = a2iVar.h();
                    }
                } while (iH == this.a);
                this.c = iH;
                return;
            }
            if (i2 != 2) {
                throw zzhq.f();
            }
            int iX = a2iVar.x() + a2iVar.q();
            do {
                list.add(Boolean.valueOf(a2iVar.n()));
            } while (a2iVar.x() < iX);
            v(iX);
            return;
        }
        b0i b0iVar = (b0i) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                b0iVar.b(b0iVar.c, a2iVar.n());
                if (a2iVar.w()) {
                    return;
                } else {
                    iH2 = a2iVar.h();
                }
            } while (iH2 == this.a);
            this.c = iH2;
            return;
        }
        if (i3 != 2) {
            throw zzhq.f();
        }
        int iX2 = a2iVar.x() + a2iVar.q();
        do {
            b0iVar.b(b0iVar.c, a2iVar.n());
        } while (a2iVar.x() < iX2);
        v(iX2);
    }

    public void J(List list) throws zzhp {
        int iH;
        a2i a2iVar = (a2i) this.d;
        if ((this.a & 7) != 2) {
            throw zzhq.f();
        }
        do {
            list.add(D());
            if (a2iVar.w()) {
                return;
            } else {
                iH = a2iVar.h();
            }
        } while (iH == this.a);
        this.c = iH;
    }

    public void K(List list) throws zzhq {
        int iH;
        int iH2;
        a2i a2iVar = (a2i) this.d;
        boolean z = list instanceof k5i;
        int i = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(a2iVar.q()));
                    if (a2iVar.w()) {
                        return;
                    } else {
                        iH = a2iVar.h();
                    }
                } while (iH == this.a);
                this.c = iH;
                return;
            }
            if (i2 != 2) {
                throw zzhq.f();
            }
            int iX = a2iVar.x() + a2iVar.q();
            do {
                list.add(Integer.valueOf(a2iVar.q()));
            } while (a2iVar.x() < iX);
            v(iX);
            return;
        }
        k5i k5iVar = (k5i) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                k5iVar.b(a2iVar.q());
                if (a2iVar.w()) {
                    return;
                } else {
                    iH2 = a2iVar.h();
                }
            } while (iH2 == this.a);
            this.c = iH2;
            return;
        }
        if (i3 != 2) {
            throw zzhq.f();
        }
        int iX2 = a2iVar.x() + a2iVar.q();
        do {
            k5iVar.b(a2iVar.q());
        } while (a2iVar.x() < iX2);
        v(iX2);
    }

    public void L(List list) throws zzhq {
        int iH;
        int iH2;
        a2i a2iVar = (a2i) this.d;
        boolean z = list instanceof k5i;
        int i = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(a2iVar.r()));
                    if (a2iVar.w()) {
                        return;
                    } else {
                        iH = a2iVar.h();
                    }
                } while (iH == this.a);
                this.c = iH;
                return;
            }
            if (i2 != 2) {
                throw zzhq.f();
            }
            int iX = a2iVar.x() + a2iVar.q();
            do {
                list.add(Integer.valueOf(a2iVar.r()));
            } while (a2iVar.x() < iX);
            v(iX);
            return;
        }
        k5i k5iVar = (k5i) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                k5iVar.b(a2iVar.r());
                if (a2iVar.w()) {
                    return;
                } else {
                    iH2 = a2iVar.h();
                }
            } while (iH2 == this.a);
            this.c = iH2;
            return;
        }
        if (i3 != 2) {
            throw zzhq.f();
        }
        int iX2 = a2iVar.x() + a2iVar.q();
        do {
            k5iVar.b(a2iVar.r());
        } while (a2iVar.x() < iX2);
        v(iX2);
    }

    public void M(List list) throws zzhq {
        int iH;
        int iH2;
        a2i a2iVar = (a2i) this.d;
        boolean z = list instanceof k5i;
        int i = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iQ = a2iVar.q();
                u(iQ);
                int iX = a2iVar.x() + iQ;
                do {
                    list.add(Integer.valueOf(a2iVar.s()));
                } while (a2iVar.x() < iX);
                return;
            }
            if (i2 != 5) {
                throw zzhq.f();
            }
            do {
                list.add(Integer.valueOf(a2iVar.s()));
                if (a2iVar.w()) {
                    return;
                } else {
                    iH = a2iVar.h();
                }
            } while (iH == this.a);
            this.c = iH;
            return;
        }
        k5i k5iVar = (k5i) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int iQ2 = a2iVar.q();
            u(iQ2);
            int iX2 = a2iVar.x() + iQ2;
            do {
                k5iVar.b(a2iVar.s());
            } while (a2iVar.x() < iX2);
            return;
        }
        if (i3 != 5) {
            throw zzhq.f();
        }
        do {
            k5iVar.b(a2iVar.s());
            if (a2iVar.w()) {
                return;
            } else {
                iH2 = a2iVar.h();
            }
        } while (iH2 == this.a);
        this.c = iH2;
    }

    public void N(List list) throws zzhq {
        int iH;
        int iH2;
        a2i a2iVar = (a2i) this.d;
        boolean z = list instanceof u7i;
        int i = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(a2iVar.t()));
                    if (a2iVar.w()) {
                        return;
                    } else {
                        iH = a2iVar.h();
                    }
                } while (iH == this.a);
                this.c = iH;
                return;
            }
            if (i2 != 2) {
                throw zzhq.f();
            }
            int iQ = a2iVar.q();
            t(iQ);
            int iX = a2iVar.x() + iQ;
            do {
                list.add(Long.valueOf(a2iVar.t()));
            } while (a2iVar.x() < iX);
            return;
        }
        u7i u7iVar = (u7i) list;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                u7iVar.c(a2iVar.t());
                if (a2iVar.w()) {
                    return;
                } else {
                    iH2 = a2iVar.h();
                }
            } while (iH2 == this.a);
            this.c = iH2;
            return;
        }
        if (i3 != 2) {
            throw zzhq.f();
        }
        int iQ2 = a2iVar.q();
        t(iQ2);
        int iX2 = a2iVar.x() + iQ2;
        do {
            u7iVar.c(a2iVar.t());
        } while (a2iVar.x() < iX2);
    }

    public void O(List list) throws zzhq {
        int iH;
        int iH2;
        a2i a2iVar = (a2i) this.d;
        boolean z = list instanceof k5i;
        int i = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(a2iVar.u()));
                    if (a2iVar.w()) {
                        return;
                    } else {
                        iH = a2iVar.h();
                    }
                } while (iH == this.a);
                this.c = iH;
                return;
            }
            if (i2 != 2) {
                throw zzhq.f();
            }
            int iX = a2iVar.x() + a2iVar.q();
            do {
                list.add(Integer.valueOf(a2iVar.u()));
            } while (a2iVar.x() < iX);
            v(iX);
            return;
        }
        k5i k5iVar = (k5i) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                k5iVar.b(a2iVar.u());
                if (a2iVar.w()) {
                    return;
                } else {
                    iH2 = a2iVar.h();
                }
            } while (iH2 == this.a);
            this.c = iH2;
            return;
        }
        if (i3 != 2) {
            throw zzhq.f();
        }
        int iX2 = a2iVar.x() + a2iVar.q();
        do {
            k5iVar.b(a2iVar.u());
        } while (a2iVar.x() < iX2);
        v(iX2);
    }

    public void P(List list) throws zzhq {
        int iH;
        int iH2;
        a2i a2iVar = (a2i) this.d;
        boolean z = list instanceof u7i;
        int i = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(a2iVar.v()));
                    if (a2iVar.w()) {
                        return;
                    } else {
                        iH = a2iVar.h();
                    }
                } while (iH == this.a);
                this.c = iH;
                return;
            }
            if (i2 != 2) {
                throw zzhq.f();
            }
            int iX = a2iVar.x() + a2iVar.q();
            do {
                list.add(Long.valueOf(a2iVar.v()));
            } while (a2iVar.x() < iX);
            v(iX);
            return;
        }
        u7i u7iVar = (u7i) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                u7iVar.c(a2iVar.v());
                if (a2iVar.w()) {
                    return;
                } else {
                    iH2 = a2iVar.h();
                }
            } while (iH2 == this.a);
            this.c = iH2;
            return;
        }
        if (i3 != 2) {
            throw zzhq.f();
        }
        int iX2 = a2iVar.x() + a2iVar.q();
        do {
            u7iVar.c(a2iVar.v());
        } while (a2iVar.x() < iX2);
        v(iX2);
    }

    public void a() {
        int i;
        int i2 = this.a;
        ka2.q(i2 >= 0 && (i2 < (i = this.c) || (i2 == i && this.b == 0)));
    }

    public int b() {
        return ((this.c - this.a) * 8) - this.b;
    }

    public void c() {
        if (this.b == 0) {
            return;
        }
        this.b = 0;
        this.a++;
        a();
    }

    public int d() {
        ka2.q(this.b == 0);
        return this.a;
    }

    public int e() {
        return (this.a * 8) + this.b;
    }

    public boolean f() {
        boolean z = (((byte[]) this.d)[this.a] & (IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT >> this.b)) != 0;
        n();
        return z;
    }

    public int g(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.b += i;
        int i3 = 0;
        while (true) {
            i2 = this.b;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.b = i4;
            byte[] bArr = (byte[]) this.d;
            int i5 = this.a;
            this.a = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = (byte[]) this.d;
        int i6 = this.a;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.b = 0;
            this.a = i6 + 1;
        }
        a();
        return i7;
    }

    public void h(int i, byte[] bArr) {
        int i2 = i >> 3;
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = (byte[]) this.d;
            int i4 = this.a;
            int i5 = i4 + 1;
            this.a = i5;
            byte b = bArr2[i4];
            int i6 = this.b;
            byte b2 = (byte) (b << i6);
            bArr[i3] = b2;
            bArr[i3] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | b2);
        }
        int i7 = i & 7;
        if (i7 == 0) {
            return;
        }
        byte b3 = (byte) (bArr[i2] & (255 >> i7));
        bArr[i2] = b3;
        int i8 = this.b;
        if (i8 + i7 > 8) {
            byte[] bArr3 = (byte[]) this.d;
            int i9 = this.a;
            this.a = i9 + 1;
            bArr[i2] = (byte) (b3 | ((bArr3[i9] & 255) << i8));
            this.b = i8 - 8;
        }
        int i10 = this.b + i7;
        this.b = i10;
        byte[] bArr4 = (byte[]) this.d;
        int i11 = this.a;
        bArr[i2] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | bArr[i2]);
        if (i10 == 8) {
            this.b = 0;
            this.a = i11 + 1;
        }
        a();
    }

    public long i(int i) {
        if (i <= 32) {
            int iG = g(i);
            String str = vjg.a;
            return ((long) iG) & 4294967295L;
        }
        int iG2 = g(i - 32);
        int iG3 = g(32);
        String str2 = vjg.a;
        return (((long) iG3) & 4294967295L) | ((((long) iG2) & 4294967295L) << 32);
    }

    public void j(int i, byte[] bArr) {
        ka2.q(this.b == 0);
        System.arraycopy((byte[]) this.d, this.a, bArr, 0, i);
        this.a += i;
        a();
    }

    public void k(int i, byte[] bArr) {
        this.d = bArr;
        this.a = 0;
        this.b = 0;
        this.c = i;
    }

    public void l(g4b g4bVar) {
        k(g4bVar.c, g4bVar.a);
        m(g4bVar.b * 8);
    }

    public void m(int i) {
        int i2 = i / 8;
        this.a = i2;
        this.b = i - (i2 * 8);
        a();
    }

    public void n() {
        int i = this.b + 1;
        this.b = i;
        if (i == 8) {
            this.b = 0;
            this.a++;
        }
        a();
    }

    public void o(int i) {
        int i2 = i / 8;
        int i3 = this.a + i2;
        this.a = i3;
        int i4 = (i - (i2 * 8)) + this.b;
        this.b = i4;
        if (i4 > 7) {
            this.a = i3 + 1;
            this.b = i4 - 8;
        }
        a();
    }

    public void p(int i) {
        ka2.q(this.b == 0);
        this.a += i;
        a();
    }

    public void q(List list, cbi cbiVar, m3i m3iVar) throws zzhp {
        int iH;
        a2i a2iVar = (a2i) this.d;
        int i = this.a;
        if ((i & 7) != 2) {
            throw zzhq.f();
        }
        do {
            list.add(x(cbiVar, m3iVar));
            if (a2iVar.w() || this.c != 0) {
                return;
            } else {
                iH = a2iVar.h();
            }
        } while (iH == i);
        this.c = iH;
    }

    public void r(List list, boolean z) throws zzhp {
        String strC;
        int iH;
        int iH2;
        a2i a2iVar = (a2i) this.d;
        if ((this.a & 7) != 2) {
            throw zzhq.f();
        }
        if ((list instanceof q6i) && !z) {
            q6i q6iVar = (q6i) list;
            do {
                q6iVar.j1(D());
                if (a2iVar.w()) {
                    return;
                } else {
                    iH2 = a2iVar.h();
                }
            } while (iH2 == this.a);
            this.c = iH2;
            return;
        }
        do {
            if (z) {
                s(2);
                strC = a2iVar.o();
            } else {
                s(2);
                strC = a2iVar.c();
            }
            list.add(strC);
            if (a2iVar.w()) {
                return;
            } else {
                iH = a2iVar.h();
            }
        } while (iH == this.a);
        this.c = iH;
    }

    public void s(int i) throws zzhp {
        if ((this.a & 7) != i) {
            throw zzhq.f();
        }
    }

    public void v(int i) throws zzhq {
        if (((a2i) this.d).x() != i) {
            throw zzhq.b();
        }
    }

    public void w(List list, cbi cbiVar, m3i m3iVar) throws zzhp {
        int iH;
        a2i a2iVar = (a2i) this.d;
        int i = this.a;
        if ((i & 7) != 3) {
            throw zzhq.f();
        }
        do {
            list.add(z(cbiVar, m3iVar));
            if (a2iVar.w() || this.c != 0) {
                return;
            } else {
                iH = a2iVar.h();
            }
        } while (iH == i);
        this.c = iH;
    }

    public Object x(cbi cbiVar, m3i m3iVar) throws zzhq {
        a2i a2iVar = (a2i) this.d;
        int iQ = a2iVar.q();
        if (a2iVar.a >= a2iVar.b) {
            throw new zzhq("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iD = a2iVar.d(iQ);
        Object objA = cbiVar.a();
        a2iVar.a++;
        cbiVar.g(objA, this, m3iVar);
        cbiVar.f(objA);
        a2iVar.y(0);
        a2iVar.a--;
        a2iVar.e(iD);
        return objA;
    }

    public void y(List list) throws zzhq {
        int iH;
        int iH2;
        a2i a2iVar = (a2i) this.d;
        boolean z = list instanceof d3i;
        int i = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(a2iVar.a()));
                    if (a2iVar.w()) {
                        return;
                    } else {
                        iH = a2iVar.h();
                    }
                } while (iH == this.a);
                this.c = iH;
                return;
            }
            if (i2 != 2) {
                throw zzhq.f();
            }
            int iQ = a2iVar.q();
            t(iQ);
            int iX = a2iVar.x() + iQ;
            do {
                list.add(Double.valueOf(a2iVar.a()));
            } while (a2iVar.x() < iX);
            return;
        }
        d3i d3iVar = (d3i) list;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                d3iVar.b(d3iVar.c, a2iVar.a());
                if (a2iVar.w()) {
                    return;
                } else {
                    iH2 = a2iVar.h();
                }
            } while (iH2 == this.a);
            this.c = iH2;
            return;
        }
        if (i3 != 2) {
            throw zzhq.f();
        }
        int iQ2 = a2iVar.q();
        t(iQ2);
        int iX2 = a2iVar.x() + iQ2;
        do {
            d3iVar.b(d3iVar.c, a2iVar.a());
        } while (a2iVar.x() < iX2);
    }

    public Object z(cbi cbiVar, m3i m3iVar) {
        int i = this.b;
        this.b = ((this.a >>> 3) << 3) | 4;
        try {
            Object objA = cbiVar.a();
            cbiVar.g(objA, this, m3iVar);
            cbiVar.f(objA);
            if (this.a == this.b) {
                return objA;
            }
            throw zzhq.g();
        } finally {
            this.b = i;
        }
    }

    public f4b(byte[] bArr, int i) {
        this.d = bArr;
        this.c = i;
    }
}
