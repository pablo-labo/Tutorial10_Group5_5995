package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class lea {
    public final kea a;
    public final String b;
    public final String c;
    public final String d;
    public final hva<String> e;
    public final hva<String> f;
    public final hva<String> g;
    public final hva<String> h;
    public final hva<Boolean> i;
    public final hva<String> j;
    public final hva<String> k;
    public final hva<String> l;
    public final hva<String> m;

    public lea() {
        throw null;
    }

    public lea(int i) {
        kea keaVar = kea.JOBSEEKER_MOBILE_APP;
        hva.a aVar = hva.a.a;
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        this.a = keaVar;
        this.b = "android-native-app";
        this.c = "https://indeed.com";
        this.d = "jsma-jobsearch-android";
        this.e = aVar;
        this.f = aVar;
        this.g = aVar;
        this.h = aVar;
        this.i = aVar;
        this.j = aVar;
        this.k = aVar;
        this.l = aVar;
        this.m = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lea)) {
            return false;
        }
        lea leaVar = (lea) obj;
        return this.a == leaVar.a && wl7.b(this.b, leaVar.b) && wl7.b(this.c, leaVar.c) && wl7.b(this.d, leaVar.d) && wl7.b(this.e, leaVar.e) && wl7.b(this.f, leaVar.f) && wl7.b(this.g, leaVar.g) && wl7.b(this.h, leaVar.h) && wl7.b(this.i, leaVar.i) && wl7.b(this.j, leaVar.j) && wl7.b(this.k, leaVar.k) && wl7.b(this.l, leaVar.l) && wl7.b(this.m, leaVar.m);
    }

    public final int hashCode() {
        return this.m.hashCode() + b0.e(this.l, b0.e(this.k, b0.e(this.j, b0.e(this.i, b0.e(this.h, b0.e(this.g, b0.e(this.f, b0.e(this.e, akb.d((this.c.hashCode() + akb.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavigationQueryInput(variant=");
        sb.append(this.a);
        sb.append(", from=");
        sb.append(this.b);
        sb.append(", continueUrl=");
        sb.append((Object) this.c);
        sb.append(", appName=");
        sb.append(this.d);
        sb.append(", canonicalPageId=");
        w40.o(sb, this.e, ", pageId=", this.f, ", userResumeURL=");
        w40.o(sb, this.g, ", emailAddress=", this.h, ", isUserVerified=");
        w40.o(sb, this.i, ", productGroup=", this.j, ", gitlabGroup=");
        w40.o(sb, this.k, ", repoName=", this.l, ", gitRevision=");
        return akb.l(sb, this.m, ")");
    }
}
