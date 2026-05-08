package defpackage;

import defpackage.vf1;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import org.apache.avro.AvroMissingFieldException;
import org.apache.avro.AvroRuntimeException;
import org.apache.avro.g;

/* JADX INFO: loaded from: classes3.dex */
public final class a55 extends dpe {
    public static final g a;
    public static final zoe b;
    public static final bpe c;
    public static final ape d;
    private static final long serialVersionUID = 375148708194362226L;
    private p34 device;
    private l05 properties;
    private suc referralParams;
    private String url;

    public static class a extends epe<a55> {
        public String e;
        public suc f;

        public final a55 c() {
            boolean[] zArr = this.c;
            try {
                a55 a55Var = new a55();
                boolean z = zArr[0];
                l05 l05Var = null;
                g.f[] fVarArr = this.b;
                a55Var.device = z ? null : (p34) a(fVarArr[0]);
                if (!zArr[1]) {
                    l05Var = (l05) a(fVarArr[1]);
                }
                a55Var.properties = l05Var;
                a55Var.url = zArr[2] ? this.e : (String) a(fVarArr[2]);
                a55Var.referralParams = zArr[3] ? this.f : (suc) a(fVarArr[3]);
                return a55Var;
            } catch (AvroMissingFieldException e) {
                throw e;
            } catch (Exception e2) {
                throw new AvroRuntimeException(e2);
            }
        }
    }

    static {
        g gVarD = j6.d("{\"type\":\"record\",\"name\":\"ExternalAppOpen\",\"namespace\":\"com.indeed.signals.schema.jsma.evergreen\",\"fields\":[{\"name\":\"device\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Device\",\"fields\":[{\"name\":\"platform\",\"type\":{\"type\":\"enum\",\"name\":\"Platforms\",\"symbols\":[\"IOS\",\"ANDROID\",\"WEB\"],\"default\":\"IOS\"}},{\"name\":\"manufacturer\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"model\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"advertisingId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}],\"default\":null},{\"name\":\"properties\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"EventProperties\",\"fields\":[{\"name\":\"appId\",\"type\":{\"type\":\"enum\",\"name\":\"AppIds\",\"symbols\":[\"TEST\",\"JOB_SEARCH_ANDROID\",\"JOB_SEARCH_IOS\",\"HQM_EMPLOYER_IOS\",\"EMPLOYER_ANDROID\"],\"default\":\"TEST\"}},{\"name\":\"appVersion\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"appBuildNum\",\"type\":\"long\"},{\"name\":\"appVariant\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"appEnvironment\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"appCountry\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"ipCountry\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"osVersion\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"clientEventId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"appInstallId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"appSessionId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"sessionId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"clientCreatedTimestamp\",\"type\":\"long\"},{\"name\":\"groups\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}},{\"name\":\"accountId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"secondaryAccountId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"parentTk\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"ctk\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"deviceId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"userLocale\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"indeedLocale\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"deviceOrientation\",\"type\":{\"type\":\"enum\",\"name\":\"DeviceOrientations\",\"symbols\":[\"LANDSCAPE\",\"PORTRAIT\"]}}]}],\"default\":null},{\"name\":\"url\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"referralParams\",\"type\":{\"type\":\"record\",\"name\":\"ReferralParams\",\"fields\":[{\"name\":\"affiliateKey\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"The affiliate key for the referral. (AFF in the cookie) This maps to the SID parameter in the log entries.\"},{\"name\":\"keywords\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"The keywords used for attribution. (KW in the cookie)\"},{\"name\":\"newCookieValue\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"The encrypted value for the RF cookie. Mobile applications should put this value in the RF cookie\\nin the device's cookie store. Note that may change from what was set in the input.\"},{\"name\":\"referrer\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"The referrer URL for REF types.\"},{\"name\":\"host\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"The host of the \\\"page\\\" of the request for referrals. For native apps, you should pass\\nin the hostname of the Home Page url.\"},{\"name\":\"refType\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"The calculated type of the referral.\"},{\"name\":\"refTime\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"Timestamp of this referral calculation.\"},{\"name\":\"reqAffiliateKey\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"If there was an existing cookie, the original affiliate key. (AFF)\"},{\"name\":\"reqKeywords\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"If there were existing cookie, the original keywords. (KW)\"},{\"name\":\"reqRefType\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"If there was an existing cookie, the original refType.\"},{\"name\":\"from\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"]},{\"name\":\"fbclid\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"]},{\"name\":\"gclid\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"]},{\"name\":\"utm_properties\",\"type\":[\"null\",{\"type\":\"map\",\"values\":{\"type\":\"record\",\"name\":\"JsmaDynamicProperty\",\"fields\":[{\"name\":\"property\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"},\"long\"]}]},\"avro.java.string\":\"String\"}],\"default\":null}]}}],\"logEntryType\":\"externalAppOpen\"}");
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
            this.device = (p34) obj;
            return;
        }
        if (i == 1) {
            this.properties = (l05) obj;
            return;
        }
        if (i == 2) {
            this.url = obj != null ? obj.toString() : null;
        } else if (i == 3) {
            this.referralParams = (suc) obj;
        } else {
            l5.s(p6.c(i, "Invalid index: "));
        }
    }

    @Override // defpackage.la7
    public final Object get(int i) {
        if (i == 0) {
            return this.device;
        }
        if (i == 1) {
            return this.properties;
        }
        if (i == 2) {
            return this.url;
        }
        if (i == 3) {
            return this.referralParams;
        }
        l5.s(p6.c(i, "Invalid index: "));
        return null;
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
