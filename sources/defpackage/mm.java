package defpackage;

import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class mm {
    public final String a;
    public final String b;
    public final hva<String> c;
    public final hva<fp> d;
    public final hva<rp> e;
    public final hva<l48> f;
    public final hva<List<String>> g;
    public final String h;
    public final String i;
    public final String j;
    public final hva<String> k;

    public mm() {
        throw null;
    }

    public mm(String str, String str2, hva.c cVar, hva.c cVar2, String str3, String str4, String str5, hva hvaVar) {
        hva.a aVar = hva.a.a;
        str.getClass();
        str2.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        str3.getClass();
        hvaVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = cVar;
        this.d = aVar;
        this.e = aVar;
        this.f = cVar2;
        this.g = aVar;
        this.h = str3;
        this.i = str4;
        this.j = str5;
        this.k = hvaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm)) {
            return false;
        }
        mm mmVar = (mm) obj;
        return wl7.b(this.a, mmVar.a) && wl7.b(this.b, mmVar.b) && wl7.b(this.c, mmVar.c) && wl7.b(this.d, mmVar.d) && wl7.b(this.e, mmVar.e) && wl7.b(this.f, mmVar.f) && wl7.b(this.g, mmVar.g) && wl7.b(this.h, mmVar.h) && wl7.b(this.i, mmVar.i) && wl7.b(this.j, mmVar.j) && wl7.b(this.k, mmVar.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + akb.d(akb.d(akb.d(b0.e(this.g, b0.e(this.f, b0.e(this.e, b0.e(this.d, b0.e(this.c, akb.d(this.a.hashCode() * 31, 31, this.b), 31), 31), 31), 31), 31), 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("AddJobSeekerProfileResumeFileInput(fileId=", this.a, ", name=", this.b, ", description=");
        w40.o(sbF, this.c, ", resumeState=", this.d, ", sourcingElection=");
        w40.o(sbF, this.e, ", resumeType=", this.f, ", tags=");
        sbF.append(this.g);
        sbF.append(", mediaType=");
        sbF.append(this.h);
        sbF.append(", geoCountry=");
        ia.r(sbF, this.i, ", ipCountry=", this.j, ", replaceFileId=");
        return akb.l(sbF, this.k, ")");
    }
}
