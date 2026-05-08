package defpackage;

import defpackage.dm6;
import defpackage.vf1;
import defpackage.zl6;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import org.apache.avro.AvroMissingFieldException;
import org.apache.avro.AvroRuntimeException;
import org.apache.avro.g;

/* JADX INFO: loaded from: classes3.dex */
public final class rk6 extends dpe {
    public static final g a;
    public static final zoe b;
    public static final bpe c;
    public static final ape d;
    private static final long serialVersionUID = 3079296302224536761L;
    private p34 device;
    private String message;
    private String method;
    private l05 properties;
    private zl6 requestDebug;
    private dm6 responseDebug;
    private String url;

    public static class a extends epe<rk6> {
        public String e;
        public String f;
        public zl6.a g;
        public dm6.a h;
        public String i;

        public final rk6 c() {
            boolean[] zArr = this.c;
            try {
                try {
                    rk6 rk6Var = new rk6();
                    boolean z = zArr[0];
                    dm6 dm6Var = null;
                    g.f[] fVarArr = this.b;
                    rk6Var.device = z ? null : (p34) a(fVarArr[0]);
                    rk6Var.properties = zArr[1] ? null : (l05) a(fVarArr[1]);
                    rk6Var.url = zArr[2] ? this.e : (String) a(fVarArr[2]);
                    rk6Var.method = zArr[3] ? this.f : (String) a(fVarArr[3]);
                    zl6.a aVar = this.g;
                    if (aVar != null) {
                        try {
                            rk6Var.requestDebug = aVar.c();
                        } catch (AvroMissingFieldException e) {
                            e.c(rk6.a.B("requestDebug"));
                            throw e;
                        }
                    } else {
                        rk6Var.requestDebug = zArr[4] ? null : (zl6) a(fVarArr[4]);
                    }
                    dm6.a aVar2 = this.h;
                    if (aVar2 != null) {
                        try {
                            rk6Var.responseDebug = aVar2.c();
                        } catch (AvroMissingFieldException e2) {
                            e2.c(rk6.a.B("responseDebug"));
                            throw e2;
                        }
                    } else {
                        if (!zArr[5]) {
                            dm6Var = (dm6) a(fVarArr[5]);
                        }
                        rk6Var.responseDebug = dm6Var;
                    }
                    rk6Var.message = zArr[6] ? this.i : (String) a(fVarArr[6]);
                    return rk6Var;
                } catch (AvroMissingFieldException e3) {
                    throw e3;
                }
            } catch (Exception e4) {
                throw new AvroRuntimeException(e4);
            }
        }
    }

    static {
        g gVarD = j6.d("{\"type\":\"record\",\"name\":\"HttpError\",\"namespace\":\"com.indeed.signals.schema.jsma.evergreen\",\"fields\":[{\"name\":\"device\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Device\",\"fields\":[{\"name\":\"platform\",\"type\":{\"type\":\"enum\",\"name\":\"Platforms\",\"symbols\":[\"IOS\",\"ANDROID\",\"WEB\"],\"default\":\"IOS\"}},{\"name\":\"manufacturer\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"model\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"advertisingId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}],\"default\":null},{\"name\":\"properties\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"EventProperties\",\"fields\":[{\"name\":\"appId\",\"type\":{\"type\":\"enum\",\"name\":\"AppIds\",\"symbols\":[\"TEST\",\"JOB_SEARCH_ANDROID\",\"JOB_SEARCH_IOS\",\"HQM_EMPLOYER_IOS\",\"EMPLOYER_ANDROID\"],\"default\":\"TEST\"}},{\"name\":\"appVersion\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"appBuildNum\",\"type\":\"long\"},{\"name\":\"appVariant\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"appEnvironment\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"appCountry\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"ipCountry\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"osVersion\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"clientEventId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"appInstallId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"appSessionId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"sessionId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"clientCreatedTimestamp\",\"type\":\"long\"},{\"name\":\"groups\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}},{\"name\":\"accountId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"secondaryAccountId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"parentTk\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"ctk\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"deviceId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"userLocale\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"indeedLocale\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"deviceOrientation\",\"type\":{\"type\":\"enum\",\"name\":\"DeviceOrientations\",\"symbols\":[\"LANDSCAPE\",\"PORTRAIT\"]}}]}],\"default\":null},{\"name\":\"url\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"method\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"requestDebug\",\"type\":{\"type\":\"record\",\"name\":\"HttpRequestDebug\",\"fields\":[{\"name\":\"timestamp\",\"type\":\"long\"},{\"name\":\"headerLength\",\"type\":\"long\"},{\"name\":\"cookiesLength\",\"type\":\"long\"},{\"name\":\"referrer\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"errDomain\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"errCode\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"networkInterface\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}},{\"name\":\"responseDebug\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"HttpResponseDebug\",\"fields\":[{\"name\":\"timestamp\",\"type\":\"long\"},{\"name\":\"headerLength\",\"type\":\"long\"},{\"name\":\"contentLength\",\"type\":\"long\"},{\"name\":\"contentType\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"setCookiesLength\",\"type\":\"long\"},{\"name\":\"statusCode\",\"type\":\"long\"},{\"name\":\"errDomain\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"errCode\",\"type\":[\"null\",\"long\"],\"default\":null}]}],\"default\":null},{\"name\":\"message\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"logEntryType\":\"jsmaNativeHttpError\"}");
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
                this.device = (p34) obj;
                break;
            case 1:
                this.properties = (l05) obj;
                break;
            case 2:
                this.url = obj != null ? obj.toString() : null;
                break;
            case 3:
                this.method = obj != null ? obj.toString() : null;
                break;
            case 4:
                this.requestDebug = (zl6) obj;
                break;
            case 5:
                this.responseDebug = (dm6) obj;
                break;
            case 6:
                this.message = obj != null ? obj.toString() : null;
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
            if (d5dVar.U0() != 1) {
                d5dVar.Y0();
                this.device = null;
            } else {
                if (this.device == null) {
                    this.device = new p34();
                }
                this.device.f(d5dVar);
            }
            if (d5dVar.U0() != 1) {
                d5dVar.Y0();
                this.properties = null;
            } else {
                if (this.properties == null) {
                    this.properties = new l05();
                }
                this.properties.f(d5dVar);
            }
            this.url = d5dVar.a1();
            this.method = d5dVar.a1();
            if (this.requestDebug == null) {
                this.requestDebug = new zl6();
            }
            this.requestDebug.f(d5dVar);
            if (d5dVar.U0() != 1) {
                d5dVar.Y0();
                this.responseDebug = null;
            } else {
                if (this.responseDebug == null) {
                    this.responseDebug = new dm6();
                }
                this.responseDebug.f(d5dVar);
            }
            this.message = d5dVar.a1();
            return;
        }
        for (int i = 0; i < 7; i++) {
            switch (fVarArrL1[i].c) {
                case 0:
                    if (d5dVar.U0() != 1) {
                        d5dVar.Y0();
                        this.device = null;
                    } else {
                        if (this.device == null) {
                            this.device = new p34();
                        }
                        this.device.f(d5dVar);
                    }
                    break;
                case 1:
                    if (d5dVar.U0() != 1) {
                        d5dVar.Y0();
                        this.properties = null;
                    } else {
                        if (this.properties == null) {
                            this.properties = new l05();
                        }
                        this.properties.f(d5dVar);
                    }
                    break;
                case 2:
                    this.url = d5dVar.a1();
                    break;
                case 3:
                    this.method = d5dVar.a1();
                    break;
                case 4:
                    if (this.requestDebug == null) {
                        this.requestDebug = new zl6();
                    }
                    this.requestDebug.f(d5dVar);
                    break;
                case 5:
                    if (d5dVar.U0() != 1) {
                        d5dVar.Y0();
                        this.responseDebug = null;
                    } else {
                        if (this.responseDebug == null) {
                            this.responseDebug = new dm6();
                        }
                        this.responseDebug.f(d5dVar);
                    }
                    break;
                case 6:
                    this.message = d5dVar.a1();
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
                return this.device;
            case 1:
                return this.properties;
            case 2:
                return this.url;
            case 3:
                return this.method;
            case 4:
                return this.requestDebug;
            case 5:
                return this.responseDebug;
            case 6:
                return this.message;
            default:
                l5.s(p6.c(i, "Invalid index: "));
                return null;
        }
    }

    @Override // defpackage.dpe
    public final void h(g54 g54Var) throws IOException {
        if (this.device == null) {
            g54Var.d(0);
        } else {
            g54Var.d(1);
            this.device.h(g54Var);
        }
        if (this.properties == null) {
            g54Var.d(0);
        } else {
            g54Var.d(1);
            this.properties.h(g54Var);
        }
        g54Var.h(this.url);
        g54Var.h(this.method);
        this.requestDebug.h(g54Var);
        if (this.responseDebug == null) {
            g54Var.d(0);
        } else {
            g54Var.d(1);
            this.responseDebug.h(g54Var);
        }
        g54Var.h(this.message);
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
