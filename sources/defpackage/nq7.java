package defpackage;

import defpackage.oq7;
import defpackage.qq7;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nq7<T extends oq7> {

    public static final class a extends nq7<oq7.a> {
        public final qq7.a a;
        public final j91 b;

        public a(qq7.a aVar, j91 j91Var) {
            this.a = aVar;
            this.b = j91Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return wl7.b(this.a, aVar.a) && wl7.b(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "AceConversation(target=" + this.a + ", callback=" + this.b + ")";
        }
    }

    public static final class b extends nq7<oq7.b> {
        public final qq7.b a;
        public final Function1<oq7.b, j6g> b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(qq7.b bVar, Function1<? super oq7.b, j6g> function1) {
            this.a = bVar;
            this.b = function1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return wl7.b(this.a, bVar.a) && wl7.b(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.b.hashCode() * 31);
        }

        public final String toString() {
            return "AiRecruiter(target=" + this.a + ", callback=" + this.b + ")";
        }
    }

    public static final class c extends nq7<oq7.d> {
        public final qq7.d a;
        public final Function1<oq7.d, j6g> b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(qq7.d dVar, Function1<? super oq7.d, j6g> function1) {
            this.a = dVar;
            this.b = function1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return wl7.b(this.a, cVar.a) && wl7.b(this.b, cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "DocumentPreview(target=" + this.a + ", callback=" + this.b + ")";
        }
    }

    public static final class d extends nq7<oq7.e> {
        public final qq7.e a;
        public final tv b;

        public d(qq7.e eVar, tv tvVar) {
            this.a = eVar;
            this.b = tvVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return wl7.b(this.a, dVar.a) && wl7.b(this.b, dVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.b.hashCode() * 31);
        }

        public final String toString() {
            return "IndeedApply(target=" + this.a + ", callback=" + this.b + ")";
        }
    }

    public static final class e extends nq7<oq7.f> {
        public final qq7.f a;
        public final Function1<oq7.f, j6g> b;

        /* JADX WARN: Multi-variable type inference failed */
        public e(qq7.f fVar, Function1<? super oq7.f, j6g> function1) {
            this.a = fVar;
            this.b = function1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return wl7.b(this.a, eVar.a) && wl7.b(this.b, eVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "InterviewScheduling(target=" + this.a + ", callback=" + this.b + ")";
        }
    }

    public static final class f extends nq7<oq7.g> {
        public final qq7.h a;
        public final Function1<oq7.g, j6g> b;

        /* JADX WARN: Multi-variable type inference failed */
        public f(qq7.h hVar, Function1<? super oq7.g, j6g> function1) {
            this.a = hVar;
            this.b = function1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return wl7.b(this.a, fVar.a) && wl7.b(this.b, fVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Login(target=" + this.a + ", callback=" + this.b + ")";
        }
    }

    public static final class g extends nq7<oq7.h> {
        public final qq7.i a;
        public final pq b;

        public g(qq7.i iVar, pq pqVar) {
            this.a = iVar;
            this.b = pqVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return wl7.b(this.a, gVar.a) && wl7.b(this.b, gVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Onboarding(target=" + this.a + ", callback=" + this.b + ")";
        }
    }

    public static final class h extends nq7<oq7.i> {
        public final qq7.j a;
        public final Function1<oq7.i, j6g> b;

        /* JADX WARN: Multi-variable type inference failed */
        public h(qq7.j jVar, Function1<? super oq7.i, j6g> function1) {
            this.a = jVar;
            this.b = function1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return wl7.b(this.a, hVar.a) && wl7.b(this.b, hVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ProfileForms(target=" + this.a + ", callback=" + this.b + ")";
        }
    }

    public static final class i extends nq7<oq7.j> {
        public final qq7.k a;
        public final fj b;

        public i(qq7.k kVar, fj fjVar) {
            this.a = kVar;
            this.b = fjVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return wl7.b(this.a, iVar.a) && wl7.b(this.b, iVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.b.hashCode() * 31);
        }

        public final String toString() {
            return "ScheduleApplyOnboarding(target=" + this.a + ", callback=" + this.b + ")";
        }
    }

    public static final class j extends nq7<oq7.k> {
        public final qq7.l a;
        public final wi b;

        public j(qq7.l lVar, wi wiVar) {
            this.a = lVar;
            this.b = wiVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return wl7.b(this.a, jVar.a) && wl7.b(this.b, jVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "SearchOverlay(target=" + this.a + ", callback=" + this.b + ")";
        }
    }

    public static final class k extends nq7<oq7.l> {
        public final qq7.m a;
        public final tdc b;

        public k(qq7.m mVar, tdc tdcVar) {
            this.a = mVar;
            this.b = tdcVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return wl7.b(this.a, kVar.a) && wl7.b(this.b, kVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ViewJob(target=" + this.a + ", callback=" + this.b + ")";
        }
    }
}
