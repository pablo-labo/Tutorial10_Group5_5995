package defpackage;

import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.ax5;
import defpackage.vf1;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import org.apache.avro.g;

/* JADX INFO: loaded from: classes3.dex */
public final class l05 extends dpe {
    public static final g a;
    public static final zoe b;
    public static final bpe c;
    public static final ape d;
    private static final long serialVersionUID = -7379113345942118033L;
    private String accountId;
    private long appBuildNum;
    private String appCountry;
    private String appEnvironment;
    private wk0 appId;
    private String appInstallId;
    private String appSessionId;
    private String appVariant;
    private String appVersion;
    private long clientCreatedTimestamp;
    private String clientEventId;
    private String ctk;
    private String deviceId;
    private x34 deviceOrientation;
    private List<String> groups;
    private String indeedLocale;
    private String ipCountry;
    private String osVersion;
    private String parentTk;
    private String secondaryAccountId;
    private String sessionId;
    private String userLocale;

    public static class a extends epe<l05> {
        public wk0 e;
        public String f;
        public long g;
        public String h;
        public String i;
        public String j;
        public String k;
        public String l;
        public String m;
        public String n;
        public String o;
        public String p;
        public long q;
        public List<String> r;
        public String s;
        public String t;
        public String u;
        public String v;
        public x34 w;
    }

    static {
        g gVarD = j6.d("{\"type\":\"record\",\"name\":\"EventProperties\",\"namespace\":\"com.indeed.signals.schema.jsma.evergreen\",\"fields\":[{\"name\":\"appId\",\"type\":{\"type\":\"enum\",\"name\":\"AppIds\",\"symbols\":[\"TEST\",\"JOB_SEARCH_ANDROID\",\"JOB_SEARCH_IOS\",\"HQM_EMPLOYER_IOS\",\"EMPLOYER_ANDROID\"],\"default\":\"TEST\"}},{\"name\":\"appVersion\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"appBuildNum\",\"type\":\"long\"},{\"name\":\"appVariant\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"appEnvironment\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"appCountry\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"ipCountry\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"osVersion\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"clientEventId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"appInstallId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"appSessionId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"sessionId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"clientCreatedTimestamp\",\"type\":\"long\"},{\"name\":\"groups\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}},{\"name\":\"accountId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"secondaryAccountId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"parentTk\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"ctk\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"deviceId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"userLocale\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"indeedLocale\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"deviceOrientation\",\"type\":{\"type\":\"enum\",\"name\":\"DeviceOrientations\",\"symbols\":[\"LANDSCAPE\",\"PORTRAIT\"]}}]}");
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
                this.appId = (wk0) obj;
                break;
            case 1:
                this.appVersion = obj != null ? obj.toString() : null;
                break;
            case 2:
                this.appBuildNum = ((Long) obj).longValue();
                break;
            case 3:
                this.appVariant = obj != null ? obj.toString() : null;
                break;
            case 4:
                this.appEnvironment = obj != null ? obj.toString() : null;
                break;
            case 5:
                this.appCountry = obj != null ? obj.toString() : null;
                break;
            case 6:
                this.ipCountry = obj != null ? obj.toString() : null;
                break;
            case 7:
                this.osVersion = obj != null ? obj.toString() : null;
                break;
            case 8:
                this.clientEventId = obj != null ? obj.toString() : null;
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                this.appInstallId = obj != null ? obj.toString() : null;
                break;
            case 10:
                this.appSessionId = obj != null ? obj.toString() : null;
                break;
            case 11:
                this.sessionId = obj != null ? obj.toString() : null;
                break;
            case 12:
                this.clientCreatedTimestamp = ((Long) obj).longValue();
                break;
            case 13:
                this.groups = (List) obj;
                break;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                this.accountId = obj != null ? obj.toString() : null;
                break;
            case 15:
                this.secondaryAccountId = obj != null ? obj.toString() : null;
                break;
            case 16:
                this.parentTk = obj != null ? obj.toString() : null;
                break;
            case 17:
                this.ctk = obj != null ? obj.toString() : null;
                break;
            case 18:
                this.deviceId = obj != null ? obj.toString() : null;
                break;
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                this.userLocale = obj != null ? obj.toString() : null;
                break;
            case 20:
                this.indeedLocale = obj != null ? obj.toString() : null;
                break;
            case 21:
                this.deviceOrientation = (x34) obj;
                break;
            default:
                l5.s(p6.c(i, "Invalid index: "));
                break;
        }
    }

    @Override // defpackage.dpe
    public final void f(d5d d5dVar) {
        g.f[] fVarArrL1 = d5dVar.L1();
        g gVar = a;
        if (fVarArrL1 == null) {
            this.appId = wk0.values()[d5dVar.R0()];
            this.appVersion = d5dVar.a1();
            this.appBuildNum = d5dVar.W0();
            this.appVariant = d5dVar.a1();
            this.appEnvironment = d5dVar.a1();
            if (d5dVar.U0() != 1) {
                d5dVar.Y0();
                this.appCountry = null;
            } else {
                this.appCountry = d5dVar.a1();
            }
            if (d5dVar.U0() != 1) {
                d5dVar.Y0();
                this.ipCountry = null;
            } else {
                this.ipCountry = d5dVar.a1();
            }
            if (d5dVar.U0() != 1) {
                d5dVar.Y0();
                this.osVersion = null;
            } else {
                this.osVersion = d5dVar.a1();
            }
            this.clientEventId = d5dVar.a1();
            this.appInstallId = d5dVar.a1();
            this.appSessionId = d5dVar.a1();
            this.sessionId = d5dVar.a1();
            this.clientCreatedTimestamp = d5dVar.W0();
            long jN0 = d5dVar.N0();
            List bVar = this.groups;
            if (bVar == null) {
                bVar = new ax5.b((int) jN0, gVar.B("groups").d);
                this.groups = bVar;
            } else {
                bVar.clear();
            }
            ax5.b bVar2 = bVar instanceof ax5.b ? (ax5.b) bVar : null;
            while (0 < jN0) {
                while (jN0 != 0) {
                    if (bVar2 != null) {
                    }
                    bVar.add(d5dVar.a1());
                    jN0--;
                }
                jN0 = d5dVar.S();
            }
            if (d5dVar.U0() != 1) {
                d5dVar.Y0();
                this.accountId = null;
            } else {
                this.accountId = d5dVar.a1();
            }
            if (d5dVar.U0() != 1) {
                d5dVar.Y0();
                this.secondaryAccountId = null;
            } else {
                this.secondaryAccountId = d5dVar.a1();
            }
            if (d5dVar.U0() != 1) {
                d5dVar.Y0();
                this.parentTk = null;
            } else {
                this.parentTk = d5dVar.a1();
            }
            if (d5dVar.U0() != 1) {
                d5dVar.Y0();
                this.ctk = null;
            } else {
                this.ctk = d5dVar.a1();
            }
            if (d5dVar.U0() != 1) {
                d5dVar.Y0();
                this.deviceId = null;
            } else {
                this.deviceId = d5dVar.a1();
            }
            if (d5dVar.U0() != 1) {
                d5dVar.Y0();
                this.userLocale = null;
            } else {
                this.userLocale = d5dVar.a1();
            }
            if (d5dVar.U0() != 1) {
                d5dVar.Y0();
                this.indeedLocale = null;
            } else {
                this.indeedLocale = d5dVar.a1();
            }
            this.deviceOrientation = x34.values()[d5dVar.R0()];
            return;
        }
        for (int i = 0; i < 22; i++) {
            switch (fVarArrL1[i].c) {
                case 0:
                    this.appId = wk0.values()[d5dVar.R0()];
                    break;
                case 1:
                    this.appVersion = d5dVar.a1();
                    break;
                case 2:
                    this.appBuildNum = d5dVar.W0();
                    break;
                case 3:
                    this.appVariant = d5dVar.a1();
                    break;
                case 4:
                    this.appEnvironment = d5dVar.a1();
                    break;
                case 5:
                    if (d5dVar.U0() != 1) {
                        d5dVar.Y0();
                        this.appCountry = null;
                    } else {
                        this.appCountry = d5dVar.a1();
                    }
                    break;
                case 6:
                    if (d5dVar.U0() != 1) {
                        d5dVar.Y0();
                        this.ipCountry = null;
                    } else {
                        this.ipCountry = d5dVar.a1();
                    }
                    break;
                case 7:
                    if (d5dVar.U0() != 1) {
                        d5dVar.Y0();
                        this.osVersion = null;
                    } else {
                        this.osVersion = d5dVar.a1();
                    }
                    break;
                case 8:
                    this.clientEventId = d5dVar.a1();
                    break;
                case DatadogLogGenerator.CRASH /* 9 */:
                    this.appInstallId = d5dVar.a1();
                    break;
                case 10:
                    this.appSessionId = d5dVar.a1();
                    break;
                case 11:
                    this.sessionId = d5dVar.a1();
                    break;
                case 12:
                    this.clientCreatedTimestamp = d5dVar.W0();
                    break;
                case 13:
                    long jN02 = d5dVar.N0();
                    List bVar3 = this.groups;
                    if (bVar3 == null) {
                        bVar3 = new ax5.b((int) jN02, gVar.B("groups").d);
                        this.groups = bVar3;
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
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 14 */:
                    if (d5dVar.U0() != 1) {
                        d5dVar.Y0();
                        this.accountId = null;
                    } else {
                        this.accountId = d5dVar.a1();
                    }
                    break;
                case 15:
                    if (d5dVar.U0() != 1) {
                        d5dVar.Y0();
                        this.secondaryAccountId = null;
                    } else {
                        this.secondaryAccountId = d5dVar.a1();
                    }
                    break;
                case 16:
                    if (d5dVar.U0() != 1) {
                        d5dVar.Y0();
                        this.parentTk = null;
                    } else {
                        this.parentTk = d5dVar.a1();
                    }
                    break;
                case 17:
                    if (d5dVar.U0() != 1) {
                        d5dVar.Y0();
                        this.ctk = null;
                    } else {
                        this.ctk = d5dVar.a1();
                    }
                    break;
                case 18:
                    if (d5dVar.U0() != 1) {
                        d5dVar.Y0();
                        this.deviceId = null;
                    } else {
                        this.deviceId = d5dVar.a1();
                    }
                    break;
                case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                    if (d5dVar.U0() != 1) {
                        d5dVar.Y0();
                        this.userLocale = null;
                    } else {
                        this.userLocale = d5dVar.a1();
                    }
                    break;
                case 20:
                    if (d5dVar.U0() != 1) {
                        d5dVar.Y0();
                        this.indeedLocale = null;
                    } else {
                        this.indeedLocale = d5dVar.a1();
                    }
                    break;
                case 21:
                    this.deviceOrientation = x34.values()[d5dVar.R0()];
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
                return this.appId;
            case 1:
                return this.appVersion;
            case 2:
                return Long.valueOf(this.appBuildNum);
            case 3:
                return this.appVariant;
            case 4:
                return this.appEnvironment;
            case 5:
                return this.appCountry;
            case 6:
                return this.ipCountry;
            case 7:
                return this.osVersion;
            case 8:
                return this.clientEventId;
            case DatadogLogGenerator.CRASH /* 9 */:
                return this.appInstallId;
            case 10:
                return this.appSessionId;
            case 11:
                return this.sessionId;
            case 12:
                return Long.valueOf(this.clientCreatedTimestamp);
            case 13:
                return this.groups;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                return this.accountId;
            case 15:
                return this.secondaryAccountId;
            case 16:
                return this.parentTk;
            case 17:
                return this.ctk;
            case 18:
                return this.deviceId;
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                return this.userLocale;
            case 20:
                return this.indeedLocale;
            case 21:
                return this.deviceOrientation;
            default:
                l5.s(p6.c(i, "Invalid index: "));
                return null;
        }
    }

    @Override // defpackage.dpe
    public final void h(g54 g54Var) {
        g54Var.d(this.appId.ordinal());
        g54Var.h(this.appVersion);
        g54Var.e(this.appBuildNum);
        g54Var.h(this.appVariant);
        g54Var.h(this.appEnvironment);
        if (this.appCountry == null) {
            g54Var.d(0);
        } else {
            g54Var.d(1);
            g54Var.h(this.appCountry);
        }
        if (this.ipCountry == null) {
            g54Var.d(0);
        } else {
            g54Var.d(1);
            g54Var.h(this.ipCountry);
        }
        if (this.osVersion == null) {
            g54Var.d(0);
        } else {
            g54Var.d(1);
            g54Var.h(this.osVersion);
        }
        g54Var.h(this.clientEventId);
        g54Var.h(this.appInstallId);
        g54Var.h(this.appSessionId);
        g54Var.h(this.sessionId);
        g54Var.e(this.clientCreatedTimestamp);
        long size = this.groups.size();
        g54Var.a(size);
        Iterator<String> it = this.groups.iterator();
        long j = 0;
        while (it.hasNext()) {
            j++;
            g54Var.h(it.next());
        }
        g54Var.i();
        if (j != size) {
            throw new ConcurrentModificationException(r6.d(j, ".", w40.i(size, "Array-size written was ", ", but element count was ")));
        }
        if (this.accountId == null) {
            g54Var.d(0);
        } else {
            g54Var.d(1);
            g54Var.h(this.accountId);
        }
        if (this.secondaryAccountId == null) {
            g54Var.d(0);
        } else {
            g54Var.d(1);
            g54Var.h(this.secondaryAccountId);
        }
        if (this.parentTk == null) {
            g54Var.d(0);
        } else {
            g54Var.d(1);
            g54Var.h(this.parentTk);
        }
        if (this.ctk == null) {
            g54Var.d(0);
        } else {
            g54Var.d(1);
            g54Var.h(this.ctk);
        }
        if (this.deviceId == null) {
            g54Var.d(0);
        } else {
            g54Var.d(1);
            g54Var.h(this.deviceId);
        }
        if (this.userLocale == null) {
            g54Var.d(0);
        } else {
            g54Var.d(1);
            g54Var.h(this.userLocale);
        }
        if (this.indeedLocale == null) {
            g54Var.d(0);
        } else {
            g54Var.d(1);
            g54Var.h(this.indeedLocale);
        }
        g54Var.d(this.deviceOrientation.ordinal());
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
