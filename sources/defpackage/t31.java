package defpackage;

import android.os.Build;
import defpackage.lte;

/* JADX INFO: loaded from: classes2.dex */
public final class t31 extends lte.c {
    public final String a;
    public final String b;
    public final boolean c;

    public t31(boolean z) {
        String str = Build.VERSION.RELEASE;
        String str2 = Build.VERSION.CODENAME;
        if (str == null) {
            ja.k("Null osRelease");
            throw null;
        }
        this.a = str;
        if (str2 == null) {
            ja.k("Null osCodeName");
            throw null;
        }
        this.b = str2;
        this.c = z;
    }

    @Override // lte.c
    public final boolean a() {
        return this.c;
    }

    @Override // lte.c
    public final String b() {
        return this.b;
    }

    @Override // lte.c
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lte.c)) {
            return false;
        }
        lte.c cVar = (lte.c) obj;
        return this.a.equals(cVar.c()) && this.b.equals(cVar.b()) && this.c == cVar.a();
    }

    public final int hashCode() {
        return (this.c ? 1231 : 1237) ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OsData{osRelease=");
        sb.append(this.a);
        sb.append(", osCodeName=");
        sb.append(this.b);
        sb.append(", isRooted=");
        return z3.o(sb, this.c, "}");
    }
}
