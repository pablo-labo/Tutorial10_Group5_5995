package defpackage;

import defpackage.vf1;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import org.apache.avro.g;

/* JADX INFO: loaded from: classes3.dex */
public final class vh0 extends dpe {
    public static final g a;
    public static final zoe b;
    public static final bpe c;
    public static final ape d;
    private static final long serialVersionUID = 343500407841389430L;
    private String accountId;
    private Integer group;

    static {
        g gVarD = j6.d("{\"type\":\"record\",\"name\":\"AppAvQ\",\"namespace\":\"com.indeed.signals.schema.jsma.evergreen\",\"fields\":[{\"name\":\"accountId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"group\",\"type\":[\"int\",\"null\"],\"default\":-1}],\"logEntryType\":\"appAvQ\"}");
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
            this.accountId = obj != null ? obj.toString() : null;
        } else if (i == 1) {
            this.group = (Integer) obj;
        } else {
            l5.s(p6.c(i, "Invalid index: "));
        }
    }

    @Override // defpackage.dpe
    public final void f(d5d d5dVar) throws IOException {
        g.f[] fVarArrL1 = d5dVar.L1();
        if (fVarArrL1 == null) {
            this.accountId = d5dVar.a1();
            if (d5dVar.U0() == 0) {
                this.group = Integer.valueOf(d5dVar.V0());
                return;
            } else {
                d5dVar.Y0();
                this.group = null;
                return;
            }
        }
        for (int i = 0; i < 2; i++) {
            int i2 = fVarArrL1[i].c;
            if (i2 == 0) {
                this.accountId = d5dVar.a1();
            } else if (i2 != 1) {
                r40.h("Corrupt ResolvingDecoder.");
                return;
            } else if (d5dVar.U0() != 0) {
                d5dVar.Y0();
                this.group = null;
            } else {
                this.group = Integer.valueOf(d5dVar.V0());
            }
        }
    }

    @Override // defpackage.la7
    public final Object get(int i) {
        if (i == 0) {
            return this.accountId;
        }
        if (i == 1) {
            return this.group;
        }
        l5.s(p6.c(i, "Invalid index: "));
        return null;
    }

    @Override // defpackage.dpe
    public final void h(g54 g54Var) throws IOException {
        g54Var.h(this.accountId);
        if (this.group == null) {
            g54Var.d(1);
        } else {
            g54Var.d(0);
            g54Var.d(this.group.intValue());
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
