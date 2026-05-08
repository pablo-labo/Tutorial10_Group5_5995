package defpackage;

import defpackage.vf1;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import org.apache.avro.g;

/* JADX INFO: loaded from: classes3.dex */
public final class i40 extends dpe {
    public static final g a;
    public static final zoe b;
    public static final bpe c;
    public static final ape d;
    private static final long serialVersionUID = -2734831960322572751L;
    private h40 ageRangeEligibility;

    static {
        g gVarD = j6.d("{\"type\":\"record\",\"name\":\"AndroidAgeSignal\",\"namespace\":\"com.indeed.signals.schema.jsma.evergreen\",\"fields\":[{\"name\":\"ageRangeEligibility\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"AndroidAgeRangeEligibility\",\"symbols\":[\"SUPERVISED\",\"SUPERVISED_APPROVAL_DENIED\",\"SUPERVISED_APPROVAL_PENDING\",\"UNKNOWN\",\"VERIFIED\"]}],\"default\":null}]}");
        a = gVarD;
        zoe zoeVar = new zoe();
        b = zoeVar;
        new vf1.a(zoeVar, gVarD);
        new uf1(zoeVar, gVarD);
        c = new bpe(gVarD, zoeVar);
        d = new ape(gVarD, gVarD, zoeVar);
    }

    @Override // defpackage.xw5
    public final g a() {
        return a;
    }

    @Override // defpackage.la7
    public final void c(int i, Object obj) {
        if (i == 0) {
            this.ageRangeEligibility = (h40) obj;
        } else {
            l5.s(p6.c(i, "Invalid index: "));
        }
    }

    @Override // defpackage.dpe
    public final void f(d5d d5dVar) {
        g.f[] fVarArrL1 = d5dVar.L1();
        if (fVarArrL1 == null) {
            if (d5dVar.U0() == 1) {
                this.ageRangeEligibility = h40.values()[d5dVar.R0()];
                return;
            } else {
                d5dVar.Y0();
                this.ageRangeEligibility = null;
                return;
            }
        }
        if (fVarArrL1[0].c != 0) {
            r40.h("Corrupt ResolvingDecoder.");
        } else if (d5dVar.U0() == 1) {
            this.ageRangeEligibility = h40.values()[d5dVar.R0()];
        } else {
            d5dVar.Y0();
            this.ageRangeEligibility = null;
        }
    }

    @Override // defpackage.la7
    public final Object get(int i) {
        if (i == 0) {
            return this.ageRangeEligibility;
        }
        l5.s(p6.c(i, "Invalid index: "));
        return null;
    }

    @Override // defpackage.dpe
    public final void h(g54 g54Var) {
        if (this.ageRangeEligibility == null) {
            g54Var.d(0);
        } else {
            g54Var.d(1);
            g54Var.d(this.ageRangeEligibility.ordinal());
        }
    }

    @Override // defpackage.dpe
    public final zoe m() {
        return b;
    }

    @Override // defpackage.dpe
    public final boolean n() {
        return true;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        d.j(this, zoe.w(objectInput));
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        c.c(this, zoe.x(objectOutput));
    }
}
