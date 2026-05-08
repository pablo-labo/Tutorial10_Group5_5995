package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class v2i implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ h1i c;

    public v2i(h1i h1iVar, String str, String str2, String str3, long j) {
        this.c = h1iVar;
        this.a = str;
        this.b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.a;
        h1i h1iVar = this.c;
        if (str == null) {
            c8i c8iVar = h1iVar.a.X.d0;
            i0i.h(c8iVar);
            String str2 = this.b;
            c8iVar.b();
            synchronized (c8iVar) {
                try {
                    String str3 = c8iVar.b0;
                    if (str3 == null || str3.equals(str2)) {
                        c8iVar.b0 = str2;
                    }
                } finally {
                }
            }
            return;
        }
        c8i c8iVar2 = h1iVar.a.X.d0;
        i0i.h(c8iVar2);
        String str4 = this.b;
        c8iVar2.b();
        synchronized (c8iVar2) {
            try {
                String str5 = c8iVar2.b0;
                if (str5 != null) {
                    str5.equals(str4);
                }
                c8iVar2.b0 = str4;
            } finally {
            }
        }
    }
}
