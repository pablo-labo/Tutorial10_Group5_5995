package defpackage;

import defpackage.vf1;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import org.apache.avro.g;

/* JADX INFO: loaded from: classes3.dex */
public final class xz extends dpe {
    public static final g a;
    public static final zoe b;
    public static final bpe c;
    public static final ape d;
    private static final long serialVersionUID = -4292345122767054500L;
    private Integer lowerBound;
    private Integer upperBound;

    static {
        g gVarD = j6.d("{\"type\":\"record\",\"name\":\"AgeRange\",\"namespace\":\"com.indeed.signals.schema.jsma.evergreen\",\"fields\":[{\"name\":\"lowerBound\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"upperBound\",\"type\":[\"null\",\"int\"],\"default\":null}]}");
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
            this.lowerBound = (Integer) obj;
        } else if (i == 1) {
            this.upperBound = (Integer) obj;
        } else {
            l5.s(p6.c(i, "Invalid index: "));
        }
    }

    @Override // defpackage.dpe
    public final void f(d5d d5dVar) throws IOException {
        g.f[] fVarArrL1 = d5dVar.L1();
        if (fVarArrL1 == null) {
            if (d5dVar.U0() != 1) {
                d5dVar.Y0();
                this.lowerBound = null;
            } else {
                this.lowerBound = Integer.valueOf(d5dVar.V0());
            }
            if (d5dVar.U0() == 1) {
                this.upperBound = Integer.valueOf(d5dVar.V0());
                return;
            } else {
                d5dVar.Y0();
                this.upperBound = null;
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
                    this.upperBound = null;
                } else {
                    this.upperBound = Integer.valueOf(d5dVar.V0());
                }
            } else if (d5dVar.U0() != 1) {
                d5dVar.Y0();
                this.lowerBound = null;
            } else {
                this.lowerBound = Integer.valueOf(d5dVar.V0());
            }
        }
    }

    @Override // defpackage.la7
    public final Object get(int i) {
        if (i == 0) {
            return this.lowerBound;
        }
        if (i == 1) {
            return this.upperBound;
        }
        l5.s(p6.c(i, "Invalid index: "));
        return null;
    }

    @Override // defpackage.dpe
    public final void h(g54 g54Var) throws IOException {
        if (this.lowerBound == null) {
            g54Var.d(0);
        } else {
            g54Var.d(1);
            g54Var.d(this.lowerBound.intValue());
        }
        if (this.upperBound == null) {
            g54Var.d(0);
        } else {
            g54Var.d(1);
            g54Var.d(this.upperBound.intValue());
        }
    }

    @Override // defpackage.dpe
    public final zoe m() {
        return b;
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
