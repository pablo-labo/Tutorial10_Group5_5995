package defpackage;

import android.os.Build;
import defpackage.sp7;

/* JADX INFO: loaded from: classes3.dex */
public final class d8c {
    public final boolean a;
    public final p8c b = new p8c();

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[xj1.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[s8c.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[4] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[5] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            a = iArr2;
        }
    }

    public d8c(boolean z) {
        this.a = z;
    }

    public final void a(s8c s8cVar, boolean z) {
        s8cVar.getClass();
        q92.o().i(System.currentTimeMillis(), "PushPrimer", "LastPushPrimerTimestamp");
        Integer numC = q92.o().c("PushPrimer", 0, "PushPrimerShownCount");
        int iIntValue = numC != null ? numC.intValue() : 0;
        int i = 1;
        q92.o().a(iIntValue + 1, "PushPrimer", "PushPrimerShownCount");
        String string = s8cVar.toString();
        this.b.getClass();
        string.getClass();
        ((tp7) cr8.p(tp7.class)).b(new sp7.f(2, z ? "reengagementModal" : "push-notification-primer", null, new jb8(string, i)));
    }

    public final boolean b(long j, boolean z) {
        if (this.a || !((bp7) cr8.p(bp7.class)).e() || Build.VERSION.SDK_INT < 33 || ((at7) cr8.p(at7.class)).a() == ft7.c) {
            return false;
        }
        if (z) {
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long lH = ((kq7) cr8.p(kq7.class)).h(0L, "PushPrimer", "LastPushPrimerTimestamp");
        return jCurrentTimeMillis - (lH != null ? lH.longValue() : 0L) > j;
    }

    public final boolean c(xj1 xj1Var, boolean z) {
        xj1Var.getClass();
        if (!b(((z0g) cr8.p(z0g.class)).a(172800000L), z)) {
            return false;
        }
        return u63.a0(xj1.c, xj1.f, xj1.d, xj1.b0).contains(xj1Var);
    }
}
