package defpackage;

import defpackage.vf1;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import org.apache.avro.AvroMissingFieldException;
import org.apache.avro.AvroRuntimeException;
import org.apache.avro.g;

/* JADX INFO: loaded from: classes3.dex */
public final class zl6 extends dpe {
    public static final g a;
    public static final zoe b;
    public static final bpe c;
    public static final ape d;
    private static final long serialVersionUID = 2979470752446845568L;
    private long cookiesLength;
    private String errCode;
    private String errDomain;
    private long headerLength;
    private String networkInterface;
    private String referrer;
    private long timestamp;

    public static class a extends epe<zl6> {
        public long e;
        public long f;
        public long g;
        public String h;

        public final zl6 c() {
            boolean[] zArr = this.c;
            try {
                zl6 zl6Var = new zl6();
                boolean z = zArr[0];
                g.f[] fVarArr = this.b;
                zl6Var.timestamp = z ? this.e : ((Long) a(fVarArr[0])).longValue();
                zl6Var.headerLength = zArr[1] ? this.f : ((Long) a(fVarArr[1])).longValue();
                zl6Var.cookiesLength = zArr[2] ? this.g : ((Long) a(fVarArr[2])).longValue();
                zl6Var.referrer = zArr[3] ? this.h : (String) a(fVarArr[3]);
                String str = null;
                zl6Var.errDomain = zArr[4] ? null : (String) a(fVarArr[4]);
                zl6Var.errCode = zArr[5] ? null : (String) a(fVarArr[5]);
                if (!zArr[6]) {
                    str = (String) a(fVarArr[6]);
                }
                zl6Var.networkInterface = str;
                return zl6Var;
            } catch (AvroMissingFieldException e) {
                throw e;
            } catch (Exception e2) {
                throw new AvroRuntimeException(e2);
            }
        }
    }

    static {
        g gVarD = j6.d("{\"type\":\"record\",\"name\":\"HttpRequestDebug\",\"namespace\":\"com.indeed.signals.schema.jsma.evergreen\",\"fields\":[{\"name\":\"timestamp\",\"type\":\"long\"},{\"name\":\"headerLength\",\"type\":\"long\"},{\"name\":\"cookiesLength\",\"type\":\"long\"},{\"name\":\"referrer\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"errDomain\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"errCode\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"networkInterface\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}");
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
        switch (i) {
            case 0:
                this.timestamp = ((Long) obj).longValue();
                break;
            case 1:
                this.headerLength = ((Long) obj).longValue();
                break;
            case 2:
                this.cookiesLength = ((Long) obj).longValue();
                break;
            case 3:
                this.referrer = obj != null ? obj.toString() : null;
                break;
            case 4:
                this.errDomain = obj != null ? obj.toString() : null;
                break;
            case 5:
                this.errCode = obj != null ? obj.toString() : null;
                break;
            case 6:
                this.networkInterface = obj != null ? obj.toString() : null;
                break;
            default:
                l5.s(p6.c(i, "Invalid index: "));
                break;
        }
    }

    @Override // defpackage.dpe
    public final void f(d5d d5dVar) {
        g.f[] fVarArrL1 = d5dVar.L1();
        if (fVarArrL1 == null) {
            this.timestamp = d5dVar.W0();
            this.headerLength = d5dVar.W0();
            this.cookiesLength = d5dVar.W0();
            if (d5dVar.U0() != 1) {
                d5dVar.Y0();
                this.referrer = null;
            } else {
                this.referrer = d5dVar.a1();
            }
            if (d5dVar.U0() != 1) {
                d5dVar.Y0();
                this.errDomain = null;
            } else {
                this.errDomain = d5dVar.a1();
            }
            if (d5dVar.U0() != 1) {
                d5dVar.Y0();
                this.errCode = null;
            } else {
                this.errCode = d5dVar.a1();
            }
            if (d5dVar.U0() == 1) {
                this.networkInterface = d5dVar.a1();
                return;
            } else {
                d5dVar.Y0();
                this.networkInterface = null;
                return;
            }
        }
        for (int i = 0; i < 7; i++) {
            switch (fVarArrL1[i].c) {
                case 0:
                    this.timestamp = d5dVar.W0();
                    break;
                case 1:
                    this.headerLength = d5dVar.W0();
                    break;
                case 2:
                    this.cookiesLength = d5dVar.W0();
                    break;
                case 3:
                    if (d5dVar.U0() != 1) {
                        d5dVar.Y0();
                        this.referrer = null;
                    } else {
                        this.referrer = d5dVar.a1();
                    }
                    break;
                case 4:
                    if (d5dVar.U0() != 1) {
                        d5dVar.Y0();
                        this.errDomain = null;
                    } else {
                        this.errDomain = d5dVar.a1();
                    }
                    break;
                case 5:
                    if (d5dVar.U0() != 1) {
                        d5dVar.Y0();
                        this.errCode = null;
                    } else {
                        this.errCode = d5dVar.a1();
                    }
                    break;
                case 6:
                    if (d5dVar.U0() != 1) {
                        d5dVar.Y0();
                        this.networkInterface = null;
                    } else {
                        this.networkInterface = d5dVar.a1();
                    }
                    break;
                default:
                    r40.h("Corrupt ResolvingDecoder.");
                    return;
            }
        }
    }

    @Override // defpackage.la7
    public final Object get(int i) {
        switch (i) {
            case 0:
                return Long.valueOf(this.timestamp);
            case 1:
                return Long.valueOf(this.headerLength);
            case 2:
                return Long.valueOf(this.cookiesLength);
            case 3:
                return this.referrer;
            case 4:
                return this.errDomain;
            case 5:
                return this.errCode;
            case 6:
                return this.networkInterface;
            default:
                l5.s(p6.c(i, "Invalid index: "));
                return null;
        }
    }

    @Override // defpackage.dpe
    public final void h(g54 g54Var) {
        g54Var.e(this.timestamp);
        g54Var.e(this.headerLength);
        g54Var.e(this.cookiesLength);
        if (this.referrer == null) {
            g54Var.d(0);
        } else {
            g54Var.d(1);
            g54Var.h(this.referrer);
        }
        if (this.errDomain == null) {
            g54Var.d(0);
        } else {
            g54Var.d(1);
            g54Var.h(this.errDomain);
        }
        if (this.errCode == null) {
            g54Var.d(0);
        } else {
            g54Var.d(1);
            g54Var.h(this.errCode);
        }
        if (this.networkInterface == null) {
            g54Var.d(0);
        } else {
            g54Var.d(1);
            g54Var.h(this.networkInterface);
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
