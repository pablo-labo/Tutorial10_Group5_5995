package defpackage;

import defpackage.vf1;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import org.apache.avro.g;

/* JADX INFO: loaded from: classes3.dex */
public final class a9a extends dpe {
    public static final g a;
    public static final zoe b;
    public static final bpe c;
    public static final ape d;
    private static final long serialVersionUID = -1665711434163122646L;
    private xz ageRange;
    private i40 androidAgeSignal;
    private String appInstallId;
    private pn6 iosAgeSignal;

    static {
        g gVarD = j6.d("{\"type\":\"record\",\"name\":\"NativeAgeSignal\",\"namespace\":\"com.indeed.signals.schema.jsma.evergreen\",\"fields\":[{\"name\":\"appInstallId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"ageRange\",\"type\":{\"type\":\"record\",\"name\":\"AgeRange\",\"fields\":[{\"name\":\"lowerBound\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"upperBound\",\"type\":[\"null\",\"int\"],\"default\":null}]}},{\"name\":\"androidAgeSignal\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"AndroidAgeSignal\",\"fields\":[{\"name\":\"ageRangeEligibility\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"AndroidAgeRangeEligibility\",\"symbols\":[\"SUPERVISED\",\"SUPERVISED_APPROVAL_DENIED\",\"SUPERVISED_APPROVAL_PENDING\",\"UNKNOWN\",\"VERIFIED\"]}],\"default\":null}]}],\"default\":null},{\"name\":\"iosAgeSignal\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"IOSAgeSignal\",\"fields\":[{\"name\":\"isEligibleForAgeFeatures\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"ageRangeDeclaration\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"IOSAgeRangeDeclaration\",\"symbols\":[\"SELF_DECLARED\",\"GUARDIAN_DECLARED\",\"CHECKED_BY_OTHER_METHOD\",\"GUARDIAN_CHECKED_BY_OTHER_METHOD\",\"GOVERNMENT_ID_CHECKED\",\"PAYMENT_CHECKED\",\"GUARDIAN_PAYMENT_CHECKED\",\"UNKNOWN\"]}],\"default\":null}]}],\"default\":null}],\"logEntryType\":\"nativeAgeSignal\"}");
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
            this.appInstallId = obj != null ? obj.toString() : null;
            return;
        }
        if (i == 1) {
            this.ageRange = (xz) obj;
            return;
        }
        if (i == 2) {
            this.androidAgeSignal = (i40) obj;
        } else if (i == 3) {
            this.iosAgeSignal = (pn6) obj;
        } else {
            l5.s(p6.c(i, "Invalid index: "));
        }
    }

    @Override // defpackage.dpe
    public final void f(d5d d5dVar) throws IOException {
        g.f[] fVarArrL1 = d5dVar.L1();
        if (fVarArrL1 == null) {
            this.appInstallId = d5dVar.a1();
            if (this.ageRange == null) {
                this.ageRange = new xz();
            }
            this.ageRange.f(d5dVar);
            if (d5dVar.U0() != 1) {
                d5dVar.Y0();
                this.androidAgeSignal = null;
            } else {
                if (this.androidAgeSignal == null) {
                    this.androidAgeSignal = new i40();
                }
                this.androidAgeSignal.f(d5dVar);
            }
            if (d5dVar.U0() != 1) {
                d5dVar.Y0();
                this.iosAgeSignal = null;
                return;
            } else {
                if (this.iosAgeSignal == null) {
                    this.iosAgeSignal = new pn6();
                }
                this.iosAgeSignal.f(d5dVar);
                return;
            }
        }
        for (int i = 0; i < 4; i++) {
            int i2 = fVarArrL1[i].c;
            if (i2 == 0) {
                this.appInstallId = d5dVar.a1();
            } else if (i2 == 1) {
                if (this.ageRange == null) {
                    this.ageRange = new xz();
                }
                this.ageRange.f(d5dVar);
            } else if (i2 != 2) {
                if (i2 != 3) {
                    r40.h("Corrupt ResolvingDecoder.");
                    return;
                } else if (d5dVar.U0() != 1) {
                    d5dVar.Y0();
                    this.iosAgeSignal = null;
                } else {
                    if (this.iosAgeSignal == null) {
                        this.iosAgeSignal = new pn6();
                    }
                    this.iosAgeSignal.f(d5dVar);
                }
            } else if (d5dVar.U0() != 1) {
                d5dVar.Y0();
                this.androidAgeSignal = null;
            } else {
                if (this.androidAgeSignal == null) {
                    this.androidAgeSignal = new i40();
                }
                this.androidAgeSignal.f(d5dVar);
            }
        }
    }

    @Override // defpackage.la7
    public final Object get(int i) {
        if (i == 0) {
            return this.appInstallId;
        }
        if (i == 1) {
            return this.ageRange;
        }
        if (i == 2) {
            return this.androidAgeSignal;
        }
        if (i == 3) {
            return this.iosAgeSignal;
        }
        l5.s(p6.c(i, "Invalid index: "));
        return null;
    }

    @Override // defpackage.dpe
    public final void h(g54 g54Var) throws IOException {
        g54Var.h(this.appInstallId);
        this.ageRange.h(g54Var);
        if (this.androidAgeSignal == null) {
            g54Var.d(0);
        } else {
            g54Var.d(1);
            this.androidAgeSignal.h(g54Var);
        }
        if (this.iosAgeSignal == null) {
            g54Var.d(0);
        } else {
            g54Var.d(1);
            this.iosAgeSignal.h(g54Var);
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
