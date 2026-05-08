package defpackage;

import defpackage.vf1;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import org.apache.avro.AvroMissingFieldException;
import org.apache.avro.AvroRuntimeException;
import org.apache.avro.g;

/* JADX INFO: loaded from: classes3.dex */
public final class dm6 extends dpe {
    public static final g a;
    public static final zoe b;
    public static final bpe c;
    public static final ape d;
    private static final long serialVersionUID = 6428943631656392413L;
    private long contentLength;
    private String contentType;
    private Long errCode;
    private String errDomain;
    private long headerLength;
    private long setCookiesLength;
    private long statusCode;
    private long timestamp;

    public static class a extends epe<dm6> {
        public long e;
        public long f;
        public long g;
        public String h;
        public long i;
        public long j;

        public final dm6 c() {
            boolean[] zArr = this.c;
            try {
                dm6 dm6Var = new dm6();
                boolean z = zArr[0];
                g.f[] fVarArr = this.b;
                dm6Var.timestamp = z ? this.e : ((Long) a(fVarArr[0])).longValue();
                dm6Var.headerLength = zArr[1] ? this.f : ((Long) a(fVarArr[1])).longValue();
                dm6Var.contentLength = zArr[2] ? this.g : ((Long) a(fVarArr[2])).longValue();
                dm6Var.contentType = zArr[3] ? this.h : (String) a(fVarArr[3]);
                dm6Var.setCookiesLength = zArr[4] ? this.i : ((Long) a(fVarArr[4])).longValue();
                dm6Var.statusCode = zArr[5] ? this.j : ((Long) a(fVarArr[5])).longValue();
                Long l = null;
                dm6Var.errDomain = zArr[6] ? null : (String) a(fVarArr[6]);
                if (!zArr[7]) {
                    l = (Long) a(fVarArr[7]);
                }
                dm6Var.errCode = l;
                return dm6Var;
            } catch (AvroMissingFieldException e) {
                throw e;
            } catch (Exception e2) {
                throw new AvroRuntimeException(e2);
            }
        }
    }

    static {
        g gVarD = j6.d("{\"type\":\"record\",\"name\":\"HttpResponseDebug\",\"namespace\":\"com.indeed.signals.schema.jsma.evergreen\",\"fields\":[{\"name\":\"timestamp\",\"type\":\"long\"},{\"name\":\"headerLength\",\"type\":\"long\"},{\"name\":\"contentLength\",\"type\":\"long\"},{\"name\":\"contentType\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"setCookiesLength\",\"type\":\"long\"},{\"name\":\"statusCode\",\"type\":\"long\"},{\"name\":\"errDomain\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"errCode\",\"type\":[\"null\",\"long\"],\"default\":null}]}");
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
                this.contentLength = ((Long) obj).longValue();
                break;
            case 3:
                this.contentType = obj != null ? obj.toString() : null;
                break;
            case 4:
                this.setCookiesLength = ((Long) obj).longValue();
                break;
            case 5:
                this.statusCode = ((Long) obj).longValue();
                break;
            case 6:
                this.errDomain = obj != null ? obj.toString() : null;
                break;
            case 7:
                this.errCode = (Long) obj;
                break;
            default:
                l5.s(p6.c(i, "Invalid index: "));
                break;
        }
    }

    @Override // defpackage.dpe
    public final void f(d5d d5dVar) throws IOException {
        g.f[] fVarArrL1 = d5dVar.L1();
        if (fVarArrL1 == null) {
            this.timestamp = d5dVar.W0();
            this.headerLength = d5dVar.W0();
            this.contentLength = d5dVar.W0();
            this.contentType = d5dVar.a1();
            this.setCookiesLength = d5dVar.W0();
            this.statusCode = d5dVar.W0();
            if (d5dVar.U0() != 1) {
                d5dVar.Y0();
                this.errDomain = null;
            } else {
                this.errDomain = d5dVar.a1();
            }
            if (d5dVar.U0() == 1) {
                this.errCode = Long.valueOf(d5dVar.W0());
                return;
            } else {
                d5dVar.Y0();
                this.errCode = null;
                return;
            }
        }
        for (int i = 0; i < 8; i++) {
            switch (fVarArrL1[i].c) {
                case 0:
                    this.timestamp = d5dVar.W0();
                    break;
                case 1:
                    this.headerLength = d5dVar.W0();
                    break;
                case 2:
                    this.contentLength = d5dVar.W0();
                    break;
                case 3:
                    this.contentType = d5dVar.a1();
                    break;
                case 4:
                    this.setCookiesLength = d5dVar.W0();
                    break;
                case 5:
                    this.statusCode = d5dVar.W0();
                    break;
                case 6:
                    if (d5dVar.U0() != 1) {
                        d5dVar.Y0();
                        this.errDomain = null;
                    } else {
                        this.errDomain = d5dVar.a1();
                    }
                    break;
                case 7:
                    if (d5dVar.U0() != 1) {
                        d5dVar.Y0();
                        this.errCode = null;
                    } else {
                        this.errCode = Long.valueOf(d5dVar.W0());
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
                return Long.valueOf(this.contentLength);
            case 3:
                return this.contentType;
            case 4:
                return Long.valueOf(this.setCookiesLength);
            case 5:
                return Long.valueOf(this.statusCode);
            case 6:
                return this.errDomain;
            case 7:
                return this.errCode;
            default:
                l5.s(p6.c(i, "Invalid index: "));
                return null;
        }
    }

    @Override // defpackage.dpe
    public final void h(g54 g54Var) throws IOException {
        g54Var.e(this.timestamp);
        g54Var.e(this.headerLength);
        g54Var.e(this.contentLength);
        g54Var.h(this.contentType);
        g54Var.e(this.setCookiesLength);
        g54Var.e(this.statusCode);
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
            g54Var.e(this.errCode.longValue());
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
