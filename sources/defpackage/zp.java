package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zp {
    public final hva<String> a;
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

    public zp(hva.c cVar, hva hvaVar, hva hvaVar2, hva hvaVar3, hva.c cVar2, int i) {
        hva.a aVar = hva.a.a;
        hva<y58> hvaVar4 = (i & 8) != 0 ? aVar : cVar;
        hvaVar = (i & 16) != 0 ? aVar : hvaVar;
        hvaVar2 = (i & 32) != 0 ? aVar : hvaVar2;
        hvaVar3 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? aVar : hvaVar3;
        hva<w48> hvaVar5 = (i & 16384) != 0 ? aVar : cVar2;
        aVar.getClass();
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
        this.a = aVar;
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
        if (!(obj instanceof zp)) {
            return false;
        }
        zp zpVar = (zp) obj;
        return wl7.b(this.a, zpVar.a) && wl7.b(this.b, zpVar.b) && wl7.b(this.c, zpVar.c) && wl7.b(this.d, zpVar.d) && wl7.b(this.e, zpVar.e) && wl7.b(this.f, zpVar.f) && wl7.b(this.g, zpVar.g) && wl7.b(this.h, zpVar.h) && wl7.b(this.i, zpVar.i) && wl7.b(this.j, zpVar.j) && wl7.b(this.k, zpVar.k) && wl7.b(this.l, zpVar.l) && wl7.b(this.m, zpVar.m) && wl7.b(this.n, zpVar.n) && wl7.b(this.o, zpVar.o) && wl7.b(this.p, zpVar.p);
    }

    public final int hashCode() {
        return this.p.hashCode() + b0.e(this.o, b0.e(this.n, b0.e(this.m, b0.e(this.l, b0.e(this.k, b0.e(this.j, b0.e(this.i, b0.e(this.h, b0.e(this.g, b0.e(this.f, b0.e(this.e, b0.e(this.d, b0.e(this.c, b0.e(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbG = v40.g("AddJobSeekerProfileStructuredDataPreferenceInput(id=", this.a, ", rezId=", this.b, ", ableToRelocate=");
        w40.o(sbG, this.c, ", relocation=", this.d, ", locations=");
        w40.o(sbG, this.e, ", jobTitles=", this.f, ", salary=");
        w40.o(sbG, this.g, ", minimumPay=", this.h, ", occupations=");
        w40.o(sbG, this.i, ", companies=", this.j, ", companySectors=");
        w40.o(sbG, this.k, ", remoteWorkTypes=", this.l, ", shifts=");
        w40.o(sbG, this.m, ", jobTypes=", this.n, ", maximumCommute=");
        return uz.e(sbG, this.o, ", willingnessToTravel=", this.p, ")");
    }

    public zp() {
        this(null, null, null, null, null, 65535);
    }
}
