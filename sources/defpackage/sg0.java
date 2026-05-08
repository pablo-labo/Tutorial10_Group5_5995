package defpackage;

import android.os.Build;
import defpackage.ywg;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class sg0 implements tn2 {
    public static final HashSet c = new HashSet();
    public final String a;
    public final String b;

    public static class a {
        public static final HashSet a = new HashSet(Arrays.asList(ywg.b.a.f()));
    }

    public static class b extends sg0 {
        @Override // defpackage.sg0
        public final boolean c() {
            return true;
        }
    }

    public static class c extends sg0 {
        @Override // defpackage.sg0
        public final boolean c() {
            return true;
        }
    }

    public static class d extends sg0 {
        @Override // defpackage.sg0
        public final boolean c() {
            return false;
        }
    }

    public static class e extends sg0 {
        @Override // defpackage.sg0
        public final boolean c() {
            return true;
        }
    }

    public static class f extends sg0 {
        @Override // defpackage.sg0
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 27;
        }
    }

    public static class g extends sg0 {
        @Override // defpackage.sg0
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 28;
        }
    }

    public static class h extends sg0 {
        @Override // defpackage.sg0
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 29;
        }
    }

    public static class i extends sg0 {
        @Override // defpackage.sg0
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 33;
        }
    }

    public sg0(String str, String str2) {
        this.a = str;
        this.b = str2;
        c.add(this);
    }

    @Override // defpackage.tn2
    public final boolean a() {
        return c() || d();
    }

    @Override // defpackage.tn2
    public final String b() {
        return this.a;
    }

    public abstract boolean c();

    public boolean d() {
        HashSet hashSet = a.a;
        String str = this.b;
        if (hashSet.contains(str)) {
            return true;
        }
        String str2 = Build.TYPE;
        if (!"eng".equals(str2) && !"userdebug".equals(str2)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":dev");
        return hashSet.contains(sb.toString());
    }
}
