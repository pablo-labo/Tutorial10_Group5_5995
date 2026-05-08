package defpackage;

import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class z43 {
    public final String a;
    public final hva<String> b;
    public final hva<Boolean> c;
    public final hva<List<s85>> d;

    public z43() {
        throw null;
    }

    public z43(String str) {
        hva.a aVar = hva.a.a;
        str.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        this.a = str;
        this.b = aVar;
        this.c = aVar;
        this.d = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z43)) {
            return false;
        }
        z43 z43Var = (z43) obj;
        return wl7.b(this.a, z43Var.a) && wl7.b(this.b, z43Var.b) && wl7.b(this.c, z43Var.c) && wl7.b(this.d, z43Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + b0.e(this.c, b0.e(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreateJobSeekerProfileRenderedResumeDownloadTempUrlsInput(resumeId=");
        sb.append(this.a);
        sb.append(", emailOverride=");
        sb.append(this.b);
        sb.append(", showLocationDetails=");
        return uz.e(sb, this.c, ", allFidelityContext=", this.d, ")");
    }
}
