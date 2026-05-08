package defpackage;

import defpackage.vf1;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import org.apache.avro.g;

/* JADX INFO: loaded from: classes3.dex */
public final class pn6 extends dpe {
    public static final g a;
    public static final zoe b;
    public static final bpe c;
    public static final ape d;
    private static final long serialVersionUID = -6032668335762327497L;
    private on6 ageRangeDeclaration;
    private Boolean isEligibleForAgeFeatures;

    static {
        g gVarD = j6.d("{\"type\":\"record\",\"name\":\"IOSAgeSignal\",\"namespace\":\"com.indeed.signals.schema.jsma.evergreen\",\"fields\":[{\"name\":\"isEligibleForAgeFeatures\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"ageRangeDeclaration\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"IOSAgeRangeDeclaration\",\"symbols\":[\"SELF_DECLARED\",\"GUARDIAN_DECLARED\",\"CHECKED_BY_OTHER_METHOD\",\"GUARDIAN_CHECKED_BY_OTHER_METHOD\",\"GOVERNMENT_ID_CHECKED\",\"PAYMENT_CHECKED\",\"GUARDIAN_PAYMENT_CHECKED\",\"UNKNOWN\"]}],\"default\":null}]}");
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
            this.isEligibleForAgeFeatures = (Boolean) obj;
        } else if (i == 1) {
            this.ageRangeDeclaration = (on6) obj;
        } else {
            l5.s(p6.c(i, "Invalid index: "));
        }
    }

    @Override // defpackage.dpe
    public final void f(d5d d5dVar) {
        g.f[] fVarArrL1 = d5dVar.L1();
        if (fVarArrL1 == null) {
            if (d5dVar.U0() != 1) {
                d5dVar.Y0();
                this.isEligibleForAgeFeatures = null;
            } else {
                this.isEligibleForAgeFeatures = Boolean.valueOf(d5dVar.O0());
            }
            if (d5dVar.U0() == 1) {
                this.ageRangeDeclaration = on6.values()[d5dVar.R0()];
                return;
            } else {
                d5dVar.Y0();
                this.ageRangeDeclaration = null;
                return;
            }
        }
        for (int i = 0; i < 2; i++) {
            int i2 = fVarArrL1[i].c;
            if (i2 != 0) {
                if (i2 != 1) {
                    r40.h("Corrupt ResolvingDecoder.");
                    return;
                } else if (d5dVar.U0() != 1) {
                    d5dVar.Y0();
                    this.ageRangeDeclaration = null;
                } else {
                    this.ageRangeDeclaration = on6.values()[d5dVar.R0()];
                }
            } else if (d5dVar.U0() != 1) {
                d5dVar.Y0();
                this.isEligibleForAgeFeatures = null;
            } else {
                this.isEligibleForAgeFeatures = Boolean.valueOf(d5dVar.O0());
            }
        }
    }

    @Override // defpackage.la7
    public final Object get(int i) {
        if (i == 0) {
            return this.isEligibleForAgeFeatures;
        }
        if (i == 1) {
            return this.ageRangeDeclaration;
        }
        l5.s(p6.c(i, "Invalid index: "));
        return null;
    }

    @Override // defpackage.dpe
    public final void h(g54 g54Var) {
        if (this.isEligibleForAgeFeatures == null) {
            g54Var.d(0);
        } else {
            g54Var.d(1);
            g54Var.j(this.isEligibleForAgeFeatures.booleanValue());
        }
        if (this.ageRangeDeclaration == null) {
            g54Var.d(0);
        } else {
            g54Var.d(1);
            g54Var.d(this.ageRangeDeclaration.ordinal());
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
