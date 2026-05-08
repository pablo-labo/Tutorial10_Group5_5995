package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class b53 implements p4a<b> {
    public final z43 a;

    public static final class a {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && wl7.b(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return l5.m("CreateJobSeekerProfileRenderedResumeDownloadTempUrls(pdf=", this.a, ")");
        }
    }

    public static final class b implements p4a.a {
        public final a a;

        public b(a aVar) {
            this.a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && wl7.b(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            a aVar = this.a;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        public final String toString() {
            return "Data(createJobSeekerProfileRenderedResumeDownloadTempUrls=" + this.a + ")";
        }
    }

    public b53(z43 z43Var) {
        this.a = z43Var;
    }

    @Override // defpackage.g15
    public final ena a() {
        e53 e53Var = e53.a;
        ha.g gVar = ha.a;
        return new ena(e53Var, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation CreateJobSeekerProfileRenderedResumeDownloadTempUrls($input: CreateJobSeekerProfileRenderedResumeDownloadTempUrlsInput!) { createJobSeekerProfileRenderedResumeDownloadTempUrls(input: $input) { pdf } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = s4a.R;
        snaVar.getClass();
        List<vd2> list = c53.b;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hc8Var.u0("input");
        ha.g gVar = ha.a;
        hc8Var.j();
        a53.a.b(hc8Var, lb3Var, this.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b53) && this.a.equals(((b53) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "d42a189cd1fc471a07be8a89d10c6f744c0cfabd6b01fa499daf221ecd1c07da";
    }

    @Override // defpackage.pua
    public final String name() {
        return "CreateJobSeekerProfileRenderedResumeDownloadTempUrls";
    }

    public final String toString() {
        return "CreateJobSeekerProfileRenderedResumeDownloadTempUrlsMutation(input=" + this.a + ")";
    }
}
