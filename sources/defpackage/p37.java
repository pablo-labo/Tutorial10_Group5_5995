package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p37 {
    public static int k;
    public static final b l = new b();
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final fmg f;
    public final long g;
    public final int h;
    public final boolean i;
    public final int j;

    public static final class b {
    }

    public p37(String str, float f, float f2, float f3, float f4, fmg fmgVar, long j, int i, boolean z) {
        int i2;
        synchronized (l) {
            i2 = k;
            k = i2 + 1;
        }
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = fmgVar;
        this.g = j;
        this.h = i;
        this.i = z;
        this.j = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p37)) {
            return false;
        }
        p37 p37Var = (p37) obj;
        return wl7.b(this.a, p37Var.a) && j94.c(this.b, p37Var.b) && j94.c(this.c, p37Var.c) && this.d == p37Var.d && this.e == p37Var.e && this.f.equals(p37Var.f) && da2.c(this.g, p37Var.g) && this.h == p37Var.h && this.i == p37Var.i;
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + k6.c(k6.c(k6.c(k6.c(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31)) * 31;
        int i = da2.j;
        return Boolean.hashCode(this.i) + w40.c(this.h, ia.d(iHashCode, 31, this.g), 31);
    }

    public static final class a {
        public final String a;
        public final float b;
        public final float c;
        public final float d;
        public final float e;
        public final long f;
        public final int g;
        public final boolean h;
        public final ArrayList<C0383a> i;
        public final C0383a j;
        public boolean k;

        public a(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, int i2) {
            str = (i2 & 1) != 0 ? "" : str;
            long j2 = (i2 & 32) != 0 ? da2.i : j;
            int i3 = (i2 & 64) != 0 ? 5 : i;
            this.a = str;
            this.b = f;
            this.c = f2;
            this.d = f3;
            this.e = f4;
            this.f = j2;
            this.g = i3;
            this.h = z;
            ArrayList<C0383a> arrayList = new ArrayList<>();
            this.i = arrayList;
            C0383a c0383a = new C0383a(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
            this.j = c0383a;
            arrayList.add(c0383a);
        }

        public static void a(a aVar, ArrayList arrayList, kne kneVar) {
            if (aVar.k) {
                ae7.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            ((C0383a) ia.k(1, aVar.i)).j.add(new kmg("", arrayList, 0, kneVar, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f));
        }

        public final p37 b() {
            if (this.k) {
                ae7.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            while (true) {
                ArrayList<C0383a> arrayList = this.i;
                if (arrayList.size() <= 1) {
                    C0383a c0383a = this.j;
                    p37 p37Var = new p37(this.a, this.b, this.c, this.d, this.e, new fmg(c0383a.a, c0383a.b, c0383a.c, c0383a.d, c0383a.e, c0383a.f, c0383a.g, c0383a.h, c0383a.i, c0383a.j), this.f, this.g, this.h);
                    this.k = true;
                    return p37Var;
                }
                if (this.k) {
                    ae7.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                }
                C0383a c0383aRemove = arrayList.remove(arrayList.size() - 1);
                ((C0383a) ia.k(1, arrayList)).j.add(new fmg(c0383aRemove.a, c0383aRemove.b, c0383aRemove.c, c0383aRemove.d, c0383aRemove.e, c0383aRemove.f, c0383aRemove.g, c0383aRemove.h, c0383aRemove.i, c0383aRemove.j));
            }
        }

        /* JADX INFO: renamed from: p37$a$a, reason: collision with other inner class name */
        public static final class C0383a {
            public final String a;
            public final float b;
            public final float c;
            public final float d;
            public final float e;
            public final float f;
            public final float g;
            public final float h;
            public final List<? extends i6b> i;
            public final ArrayList j;

            public C0383a(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, int i) {
                str = (i & 1) != 0 ? "" : str;
                f = (i & 2) != 0 ? 0.0f : f;
                f2 = (i & 4) != 0 ? 0.0f : f2;
                f3 = (i & 8) != 0 ? 0.0f : f3;
                f4 = (i & 16) != 0 ? 1.0f : f4;
                f5 = (i & 32) != 0 ? 1.0f : f5;
                f6 = (i & 64) != 0 ? 0.0f : f6;
                f7 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? 0.0f : f7;
                if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
                    int i2 = gmg.a;
                    list = zr4.a;
                }
                ArrayList arrayList = new ArrayList();
                this.a = str;
                this.b = f;
                this.c = f2;
                this.d = f3;
                this.e = f4;
                this.f = f5;
                this.g = f6;
                this.h = f7;
                this.i = list;
                this.j = arrayList;
            }

            public C0383a() {
                this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
            }
        }
    }
}
