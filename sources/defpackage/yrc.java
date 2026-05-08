package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.ax5;
import defpackage.vf1;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import org.apache.avro.AvroMissingFieldException;
import org.apache.avro.AvroRuntimeException;
import org.apache.avro.g;

/* JADX INFO: loaded from: classes3.dex */
public final class yrc extends dpe {
    public static final g a;
    public static final zoe b;
    public static final bpe c;
    public static final ape d;
    private static final long serialVersionUID = 1936889911795236233L;
    private String action;
    private String assessmentName;
    private p34 device;
    private String expectedAction;
    private List<String> extendedVerdictReasons;
    private bsc invalidReason;
    private String ja3;
    private String ja4;
    private l05 properties;
    private List<asc> reasons;
    private Double score;
    private String siteKey;
    private String token;
    private String userAgent;
    private String userIpAddress;
    private boolean valid;

    public static class a extends epe<yrc> {
        public String e;
        public String f;
        public String g;
        public boolean h;
        public String i;

        public final yrc c() {
            boolean[] zArr = this.c;
            try {
                yrc yrcVar = new yrc();
                boolean z = zArr[0];
                String str = null;
                g.f[] fVarArr = this.b;
                yrcVar.device = z ? null : (p34) a(fVarArr[0]);
                yrcVar.properties = zArr[1] ? null : (l05) a(fVarArr[1]);
                yrcVar.token = zArr[2] ? this.e : (String) a(fVarArr[2]);
                yrcVar.siteKey = zArr[3] ? this.f : (String) a(fVarArr[3]);
                yrcVar.expectedAction = zArr[4] ? this.g : (String) a(fVarArr[4]);
                yrcVar.valid = zArr[5] ? this.h : ((Boolean) a(fVarArr[5])).booleanValue();
                yrcVar.invalidReason = zArr[6] ? null : (bsc) a(fVarArr[6]);
                yrcVar.action = zArr[7] ? null : (String) a(fVarArr[7]);
                yrcVar.score = zArr[8] ? null : (Double) a(fVarArr[8]);
                yrcVar.reasons = zArr[9] ? null : (List) a(fVarArr[9]);
                yrcVar.extendedVerdictReasons = zArr[10] ? null : (List) a(fVarArr[10]);
                yrcVar.assessmentName = zArr[11] ? null : (String) a(fVarArr[11]);
                yrcVar.userAgent = zArr[12] ? this.i : (String) a(fVarArr[12]);
                yrcVar.userIpAddress = zArr[13] ? null : (String) a(fVarArr[13]);
                yrcVar.ja3 = zArr[14] ? null : (String) a(fVarArr[14]);
                if (!zArr[15]) {
                    str = (String) a(fVarArr[15]);
                }
                yrcVar.ja4 = str;
                return yrcVar;
            } catch (AvroMissingFieldException e) {
                throw e;
            } catch (Exception e2) {
                throw new AvroRuntimeException(e2);
            }
        }
    }

    static {
        g gVarD = j6.d("{\"type\":\"record\",\"name\":\"RecaptchaAssessmentEvent\",\"namespace\":\"com.indeed.signals.schema.jsma.evergreen\",\"fields\":[{\"name\":\"device\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Device\",\"fields\":[{\"name\":\"platform\",\"type\":{\"type\":\"enum\",\"name\":\"Platforms\",\"symbols\":[\"IOS\",\"ANDROID\",\"WEB\"],\"default\":\"IOS\"}},{\"name\":\"manufacturer\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"model\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"advertisingId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}],\"default\":null},{\"name\":\"properties\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"EventProperties\",\"fields\":[{\"name\":\"appId\",\"type\":{\"type\":\"enum\",\"name\":\"AppIds\",\"symbols\":[\"TEST\",\"JOB_SEARCH_ANDROID\",\"JOB_SEARCH_IOS\",\"HQM_EMPLOYER_IOS\",\"EMPLOYER_ANDROID\"],\"default\":\"TEST\"}},{\"name\":\"appVersion\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"appBuildNum\",\"type\":\"long\"},{\"name\":\"appVariant\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"appEnvironment\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"appCountry\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"ipCountry\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"osVersion\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"clientEventId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"appInstallId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"appSessionId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"sessionId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"clientCreatedTimestamp\",\"type\":\"long\"},{\"name\":\"groups\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}},{\"name\":\"accountId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"secondaryAccountId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"parentTk\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"ctk\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"deviceId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"userLocale\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"indeedLocale\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"deviceOrientation\",\"type\":{\"type\":\"enum\",\"name\":\"DeviceOrientations\",\"symbols\":[\"LANDSCAPE\",\"PORTRAIT\"]}}]}],\"default\":null},{\"name\":\"token\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"siteKey\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"expectedAction\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"valid\",\"type\":\"boolean\"},{\"name\":\"invalidReason\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"RecaptchaInvalidReason\",\"symbols\":[\"UNKNOWN\",\"MALFORMED\",\"EXPIRED\",\"DUPE\",\"MISSING\",\"BROWSER_ERROR\"],\"default\":\"UNKNOWN\"}],\"default\":null},{\"name\":\"action\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"score\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"reasons\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"enum\",\"name\":\"RecaptchaClassificationReason\",\"symbols\":[\"UNKNOWN\",\"AUTOMATION\",\"UNEXPECTED_ENVIRONMENT\",\"TOO_MUCH_TRAFFIC\",\"UNEXPECTED_USAGE_PATTERNS\",\"LOW_CONFIDENCE_SCORE\"],\"default\":\"UNKNOWN\"}},\"default\":[]},{\"name\":\"extendedVerdictReasons\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"default\":[]},{\"name\":\"assessmentName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"userAgent\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"userIpAddress\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"ja3\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"ja4\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}],\"logEntryType\":\"jsmaRecaptchaAssessment\"}");
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
                this.token = obj != null ? obj.toString() : null;
                break;
            case 3:
                this.siteKey = obj != null ? obj.toString() : null;
                break;
            case 4:
                this.expectedAction = obj != null ? obj.toString() : null;
                break;
            case 5:
                this.valid = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.invalidReason = (bsc) obj;
                break;
            case 7:
                this.action = obj != null ? obj.toString() : null;
                break;
            case 8:
                this.score = (Double) obj;
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                this.reasons = (List) obj;
                break;
            case 10:
                this.extendedVerdictReasons = (List) obj;
                break;
            case 11:
                this.assessmentName = obj != null ? obj.toString() : null;
                break;
            case 12:
                this.userAgent = obj != null ? obj.toString() : null;
                break;
            case 13:
                this.userIpAddress = obj != null ? obj.toString() : null;
                break;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                this.ja3 = obj != null ? obj.toString() : null;
                break;
            case 15:
                this.ja4 = obj != null ? obj.toString() : null;
                break;
            default:
                l5.s(p6.c(i, "Invalid index: "));
                break;
        }
    }

    @Override // defpackage.dpe
    public final void f(d5d d5dVar) throws IOException {
        long j;
        g.f[] fVarArrL1 = d5dVar.L1();
        long j2 = 1;
        g gVar = a;
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
            this.token = d5dVar.a1();
            this.siteKey = d5dVar.a1();
            this.expectedAction = d5dVar.a1();
            this.valid = d5dVar.O0();
            if (d5dVar.U0() != 1) {
                d5dVar.Y0();
                this.invalidReason = null;
            } else {
                this.invalidReason = bsc.values()[d5dVar.R0()];
            }
            if (d5dVar.U0() != 1) {
                d5dVar.Y0();
                this.action = null;
            } else {
                this.action = d5dVar.a1();
            }
            if (d5dVar.U0() != 1) {
                d5dVar.Y0();
                this.score = null;
            } else {
                this.score = Double.valueOf(d5dVar.Q0());
            }
            long jN0 = d5dVar.N0();
            List bVar = this.reasons;
            if (bVar == null) {
                bVar = new ax5.b((int) jN0, gVar.B("reasons").d);
                this.reasons = bVar;
            } else {
                bVar.clear();
            }
            ax5.b bVar2 = bVar instanceof ax5.b ? (ax5.b) bVar : null;
            while (0 < jN0) {
                while (jN0 != 0) {
                    if (bVar2 != null) {
                    }
                    bVar.add(asc.values()[d5dVar.R0()]);
                    jN0--;
                }
                jN0 = d5dVar.S();
            }
            long jN02 = d5dVar.N0();
            List bVar3 = this.extendedVerdictReasons;
            if (bVar3 == null) {
                bVar3 = new ax5.b((int) jN02, gVar.B("extendedVerdictReasons").d);
                this.extendedVerdictReasons = bVar3;
            } else {
                bVar3.clear();
            }
            ax5.b bVar4 = bVar3 instanceof ax5.b ? (ax5.b) bVar3 : null;
            while (0 < jN02) {
                while (jN02 != 0) {
                    if (bVar4 != null) {
                    }
                    bVar3.add(d5dVar.a1());
                    jN02--;
                }
                jN02 = d5dVar.S();
            }
            if (d5dVar.U0() != 1) {
                d5dVar.Y0();
                this.assessmentName = null;
            } else {
                this.assessmentName = d5dVar.a1();
            }
            if (d5dVar.U0() != 1) {
                d5dVar.Y0();
                this.userAgent = null;
            } else {
                this.userAgent = d5dVar.a1();
            }
            if (d5dVar.U0() != 1) {
                d5dVar.Y0();
                this.userIpAddress = null;
            } else {
                this.userIpAddress = d5dVar.a1();
            }
            if (d5dVar.U0() != 1) {
                d5dVar.Y0();
                this.ja3 = null;
            } else {
                this.ja3 = d5dVar.a1();
            }
            if (d5dVar.U0() == 1) {
                this.ja4 = d5dVar.a1();
                return;
            } else {
                d5dVar.Y0();
                this.ja4 = null;
                return;
            }
        }
        int i = 0;
        while (i < 16) {
            switch (fVarArrL1[i].c) {
                case 0:
                    j = j2;
                    if (d5dVar.U0() != 1) {
                        d5dVar.Y0();
                        this.device = null;
                    } else {
                        if (this.device == null) {
                            this.device = new p34();
                        }
                        this.device.f(d5dVar);
                        continue;
                    }
                    i++;
                    j2 = j;
                    break;
                case 1:
                    j = j2;
                    if (d5dVar.U0() != 1) {
                        d5dVar.Y0();
                        this.properties = null;
                        continue;
                    } else {
                        if (this.properties == null) {
                            this.properties = new l05();
                        }
                        this.properties.f(d5dVar);
                    }
                    i++;
                    j2 = j;
                    break;
                case 2:
                    j = j2;
                    this.token = d5dVar.a1();
                    continue;
                    i++;
                    j2 = j;
                    break;
                case 3:
                    j = j2;
                    this.siteKey = d5dVar.a1();
                    continue;
                    i++;
                    j2 = j;
                    break;
                case 4:
                    j = j2;
                    this.expectedAction = d5dVar.a1();
                    continue;
                    i++;
                    j2 = j;
                    break;
                case 5:
                    j = j2;
                    this.valid = d5dVar.O0();
                    continue;
                    i++;
                    j2 = j;
                    break;
                case 6:
                    j = j2;
                    if (d5dVar.U0() != 1) {
                        d5dVar.Y0();
                        this.invalidReason = null;
                        continue;
                    } else {
                        this.invalidReason = bsc.values()[d5dVar.R0()];
                    }
                    i++;
                    j2 = j;
                    break;
                case 7:
                    j = j2;
                    if (d5dVar.U0() != 1) {
                        d5dVar.Y0();
                        this.action = null;
                        continue;
                    } else {
                        this.action = d5dVar.a1();
                    }
                    i++;
                    j2 = j;
                    break;
                case 8:
                    j = j2;
                    if (d5dVar.U0() != 1) {
                        d5dVar.Y0();
                        this.score = null;
                        continue;
                    } else {
                        this.score = Double.valueOf(d5dVar.Q0());
                    }
                    i++;
                    j2 = j;
                    break;
                case DatadogLogGenerator.CRASH /* 9 */:
                    j = j2;
                    long jN03 = d5dVar.N0();
                    List bVar5 = this.reasons;
                    if (bVar5 == null) {
                        bVar5 = new ax5.b((int) jN03, gVar.B("reasons").d);
                        this.reasons = bVar5;
                    } else {
                        bVar5.clear();
                    }
                    ax5.b bVar6 = bVar5 instanceof ax5.b ? (ax5.b) bVar5 : null;
                    while (0 < jN03) {
                        while (jN03 != 0) {
                            if (bVar6 != null) {
                            }
                            bVar5.add(asc.values()[d5dVar.R0()]);
                            jN03 -= j;
                        }
                        jN03 = d5dVar.S();
                    }
                    continue;
                    i++;
                    j2 = j;
                    break;
                case 10:
                    long jN04 = d5dVar.N0();
                    List bVar7 = this.extendedVerdictReasons;
                    if (bVar7 == null) {
                        j = j2;
                        bVar7 = new ax5.b((int) jN04, gVar.B("extendedVerdictReasons").d);
                        this.extendedVerdictReasons = bVar7;
                    } else {
                        j = j2;
                        bVar7.clear();
                    }
                    ax5.b bVar8 = bVar7 instanceof ax5.b ? (ax5.b) bVar7 : null;
                    while (0 < jN04) {
                        while (jN04 != 0) {
                            if (bVar8 != null) {
                            }
                            bVar7.add(d5dVar.a1());
                            jN04 -= j;
                        }
                        jN04 = d5dVar.S();
                    }
                    continue;
                    i++;
                    j2 = j;
                    break;
                case 11:
                    if (d5dVar.U0() == 1) {
                        this.assessmentName = d5dVar.a1();
                    } else {
                        d5dVar.Y0();
                        this.assessmentName = null;
                    }
                    break;
                case 12:
                    if (d5dVar.U0() == 1) {
                        this.userAgent = d5dVar.a1();
                    } else {
                        d5dVar.Y0();
                        this.userAgent = null;
                    }
                    break;
                case 13:
                    if (d5dVar.U0() == 1) {
                        this.userIpAddress = d5dVar.a1();
                    } else {
                        d5dVar.Y0();
                        this.userIpAddress = null;
                    }
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 14 */:
                    if (d5dVar.U0() == 1) {
                        this.ja3 = d5dVar.a1();
                    } else {
                        d5dVar.Y0();
                        this.ja3 = null;
                    }
                    break;
                case 15:
                    if (d5dVar.U0() == 1) {
                        this.ja4 = d5dVar.a1();
                    } else {
                        d5dVar.Y0();
                        this.ja4 = null;
                    }
                    break;
                default:
                    r40.h("Corrupt ResolvingDecoder.");
                    return;
            }
            j = j2;
            i++;
            j2 = j;
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
                return this.token;
            case 3:
                return this.siteKey;
            case 4:
                return this.expectedAction;
            case 5:
                return Boolean.valueOf(this.valid);
            case 6:
                return this.invalidReason;
            case 7:
                return this.action;
            case 8:
                return this.score;
            case DatadogLogGenerator.CRASH /* 9 */:
                return this.reasons;
            case 10:
                return this.extendedVerdictReasons;
            case 11:
                return this.assessmentName;
            case 12:
                return this.userAgent;
            case 13:
                return this.userIpAddress;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                return this.ja3;
            case 15:
                return this.ja4;
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
        g54Var.h(this.token);
        g54Var.h(this.siteKey);
        g54Var.h(this.expectedAction);
        g54Var.j(this.valid);
        if (this.invalidReason == null) {
            g54Var.d(0);
        } else {
            g54Var.d(1);
            g54Var.d(this.invalidReason.ordinal());
        }
        if (this.action == null) {
            g54Var.d(0);
        } else {
            g54Var.d(1);
            g54Var.h(this.action);
        }
        if (this.score == null) {
            g54Var.d(0);
        } else {
            g54Var.d(1);
            g54Var.k(this.score.doubleValue());
        }
        long size = this.reasons.size();
        g54Var.a(size);
        Iterator<asc> it = this.reasons.iterator();
        long j = 0;
        long j2 = 0;
        while (it.hasNext()) {
            j2++;
            g54Var.d(it.next().ordinal());
        }
        g54Var.i();
        if (j2 != size) {
            throw new ConcurrentModificationException(r6.d(j2, ".", w40.i(size, "Array-size written was ", ", but element count was ")));
        }
        long size2 = this.extendedVerdictReasons.size();
        g54Var.a(size2);
        Iterator<String> it2 = this.extendedVerdictReasons.iterator();
        while (it2.hasNext()) {
            j++;
            g54Var.h(it2.next());
        }
        g54Var.i();
        if (j != size2) {
            throw new ConcurrentModificationException(r6.d(j, ".", w40.i(size2, "Array-size written was ", ", but element count was ")));
        }
        if (this.assessmentName == null) {
            g54Var.d(0);
        } else {
            g54Var.d(1);
            g54Var.h(this.assessmentName);
        }
        if (this.userAgent == null) {
            g54Var.d(0);
        } else {
            g54Var.d(1);
            g54Var.h(this.userAgent);
        }
        if (this.userIpAddress == null) {
            g54Var.d(0);
        } else {
            g54Var.d(1);
            g54Var.h(this.userIpAddress);
        }
        if (this.ja3 == null) {
            g54Var.d(0);
        } else {
            g54Var.d(1);
            g54Var.h(this.ja3);
        }
        if (this.ja4 == null) {
            g54Var.d(0);
        } else {
            g54Var.d(1);
            g54Var.h(this.ja4);
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
