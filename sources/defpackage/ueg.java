package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ueg {
    public final String a;
    public final hva<String> b;
    public final hva<Boolean> c;
    public final hva<y58> d;
    public final hva<List<o58>> e;
    public final hva<List<h58>> f;
    public final hva<d68> g;
    public final hva<d68> h;
    public final hva<List<q58>> i;
    public final hva<List<y48>> j;
    public final hva<List<a58>> k;
    public final hva<List<a68>> l;
    public final hva<List<k68>> m;
    public final hva<List<j58>> n;
    public final hva<w48> o;
    public final hva<m68> p;

    public ueg() {
        throw null;
    }

    public ueg(String str, hva.c cVar, hva hvaVar, hva hvaVar2, hva hvaVar3, hva.c cVar2, int i) {
        hva.a aVar = hva.a.a;
        hva<y58> hvaVar4 = (i & 8) != 0 ? aVar : cVar;
        hvaVar = (i & 16) != 0 ? aVar : hvaVar;
        hvaVar2 = (i & 32) != 0 ? aVar : hvaVar2;
        hvaVar3 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? aVar : hvaVar3;
        hva<w48> hvaVar5 = (i & 16384) != 0 ? aVar : cVar2;
        str.getClass();
        aVar.getClass();
        aVar.getClass();
        hvaVar4.getClass();
        hvaVar.getClass();
        hvaVar2.getClass();
        aVar.getClass();
        hvaVar3.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        hvaVar5.getClass();
        aVar.getClass();
        this.a = str;
        this.b = aVar;
        this.c = aVar;
        this.d = hvaVar4;
        this.e = hvaVar;
        this.f = hvaVar2;
        this.g = aVar;
        this.h = hvaVar3;
        this.i = aVar;
        this.j = aVar;
        this.k = aVar;
        this.l = aVar;
        this.m = aVar;
        this.n = aVar;
        this.o = hvaVar5;
        this.p = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ueg)) {
            return false;
        }
        ueg uegVar = (ueg) obj;
        return wl7.b(this.a, uegVar.a) && wl7.b(this.b, uegVar.b) && wl7.b(this.c, uegVar.c) && wl7.b(this.d, uegVar.d) && wl7.b(this.e, uegVar.e) && wl7.b(this.f, uegVar.f) && wl7.b(this.g, uegVar.g) && wl7.b(this.h, uegVar.h) && wl7.b(this.i, uegVar.i) && wl7.b(this.j, uegVar.j) && wl7.b(this.k, uegVar.k) && wl7.b(this.l, uegVar.l) && wl7.b(this.m, uegVar.m) && wl7.b(this.n, uegVar.n) && wl7.b(this.o, uegVar.o) && wl7.b(this.p, uegVar.p);
    }

    public final int hashCode() {
        return this.p.hashCode() + b0.e(this.o, b0.e(this.n, b0.e(this.m, b0.e(this.l, b0.e(this.k, b0.e(this.j, b0.e(this.i, b0.e(this.h, b0.e(this.g, b0.e(this.f, b0.e(this.e, b0.e(this.d, b0.e(this.c, b0.e(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdateJobSeekerProfileStructuredDataPreferenceInput(id=");
        sb.append(this.a);
        sb.append(", rezId=");
        sb.append(this.b);
        sb.append(", ableToRelocate=");
        w40.o(sb, this.c, ", relocation=", this.d, ", locations=");
        w40.o(sb, this.e, ", jobTitles=", this.f, ", salary=");
        w40.o(sb, this.g, ", minimumPay=", this.h, ", occupations=");
        w40.o(sb, this.i, ", companies=", this.j, ", companySectors=");
        w40.o(sb, this.k, ", remoteWorkTypes=", this.l, ", shifts=");
        w40.o(sb, this.m, ", jobTypes=", this.n, ", maximumCommute=");
        return uz.e(sb, this.o, ", willingnessToTravel=", this.p, ")");
    }
}
