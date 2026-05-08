package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jwh {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final /* synthetic */ ewh d;

    public jwh(ewh ewhVar, int i, boolean z, boolean z2) {
        this.d = ewhVar;
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    public final void a(Object obj, String str) {
        this.d.m(this.a, this.b, this.c, str, obj, null, null);
    }

    public final void b(String str) {
        this.d.m(this.a, this.b, this.c, str, null, null, null);
    }

    public final void c(String str, Object obj, Object obj2) {
        this.d.m(this.a, this.b, this.c, str, obj, obj2, null);
    }

    public final void d(String str, Object obj, Object obj2, Object obj3) {
        this.d.m(this.a, this.b, this.c, str, obj, obj2, obj3);
    }
}
