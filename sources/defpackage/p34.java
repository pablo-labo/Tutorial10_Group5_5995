package defpackage;

import defpackage.vf1;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import org.apache.avro.g;

/* JADX INFO: loaded from: classes3.dex */
public final class p34 extends dpe {
    public static final g a;
    public static final zoe b;
    public static final bpe c;
    public static final ape d;
    private static final long serialVersionUID = -3171018151666827577L;
    private String advertisingId;
    private String manufacturer;
    private String model;
    private zcb platform;

    static {
        g gVarD = j6.d("{\"type\":\"record\",\"name\":\"Device\",\"namespace\":\"com.indeed.signals.schema.jsma.evergreen\",\"fields\":[{\"name\":\"platform\",\"type\":{\"type\":\"enum\",\"name\":\"Platforms\",\"symbols\":[\"IOS\",\"ANDROID\",\"WEB\"],\"default\":\"IOS\"}},{\"name\":\"manufacturer\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"model\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"advertisingId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}");
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
            this.platform = (zcb) obj;
            return;
        }
        if (i == 1) {
            this.manufacturer = obj != null ? obj.toString() : null;
            return;
        }
        if (i == 2) {
            this.model = obj != null ? obj.toString() : null;
        } else if (i == 3) {
            this.advertisingId = obj != null ? obj.toString() : null;
        } else {
            l5.s(p6.c(i, "Invalid index: "));
        }
    }

    @Override // defpackage.dpe
    public final void f(d5d d5dVar) {
        g.f[] fVarArrL1 = d5dVar.L1();
        if (fVarArrL1 == null) {
            this.platform = zcb.values()[d5dVar.R0()];
            if (d5dVar.U0() != 1) {
                d5dVar.Y0();
                this.manufacturer = null;
            } else {
                this.manufacturer = d5dVar.a1();
            }
            if (d5dVar.U0() != 1) {
                d5dVar.Y0();
                this.model = null;
            } else {
                this.model = d5dVar.a1();
            }
            if (d5dVar.U0() == 1) {
                this.advertisingId = d5dVar.a1();
                return;
            } else {
                d5dVar.Y0();
                this.advertisingId = null;
                return;
            }
        }
        for (int i = 0; i < 4; i++) {
            int i2 = fVarArrL1[i].c;
            if (i2 == 0) {
                this.platform = zcb.values()[d5dVar.R0()];
            } else if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        r40.h("Corrupt ResolvingDecoder.");
                        return;
                    } else if (d5dVar.U0() != 1) {
                        d5dVar.Y0();
                        this.advertisingId = null;
                    } else {
                        this.advertisingId = d5dVar.a1();
                    }
                } else if (d5dVar.U0() != 1) {
                    d5dVar.Y0();
                    this.model = null;
                } else {
                    this.model = d5dVar.a1();
                }
            } else if (d5dVar.U0() != 1) {
                d5dVar.Y0();
                this.manufacturer = null;
            } else {
                this.manufacturer = d5dVar.a1();
            }
        }
    }

    @Override // defpackage.la7
    public final Object get(int i) {
        if (i == 0) {
            return this.platform;
        }
        if (i == 1) {
            return this.manufacturer;
        }
        if (i == 2) {
            return this.model;
        }
        if (i == 3) {
            return this.advertisingId;
        }
        l5.s(p6.c(i, "Invalid index: "));
        return null;
    }

    @Override // defpackage.dpe
    public final void h(g54 g54Var) {
        g54Var.d(this.platform.ordinal());
        if (this.manufacturer == null) {
            g54Var.d(0);
        } else {
            g54Var.d(1);
            g54Var.h(this.manufacturer);
        }
        if (this.model == null) {
            g54Var.d(0);
        } else {
            g54Var.d(1);
            g54Var.h(this.model);
        }
        if (this.advertisingId == null) {
            g54Var.d(0);
        } else {
            g54Var.d(1);
            g54Var.h(this.advertisingId);
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
